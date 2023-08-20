package DurationFormatUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DurationFormatUtils1 {

    public static boolean debug = false;

    @Test
    public void DurationFormatUtils0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0501");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(1L, (long) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.998S" + "'", str2.equals("P-1Y11M30DT23H59M59.998S"));
    }

    @Test
    public void DurationFormatUtils0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0502");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P0Y000DT00000.0311");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0311" + "'", str2.equals("P0Y000DT00000.0311"));
    }

    @Test
    public void DurationFormatUtils0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0503");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 'a', (long) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.902S" + "'", str2.equals("P-1Y11M30DT23H59M59.902S"));
    }

    @Test
    public void DurationFormatUtils0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0504");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((-1L), (long) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0505");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.99-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.99-1" + "'", str2.equals("P0Y000DT00000.99-1"));
    }

    @Test
    public void DurationFormatUtils0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0506");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "P-1Y11030DT23059059.968100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.968100" + "'", str2.equals("P-1Y11030DT23059059.968100"));
    }

    @Test
    public void DurationFormatUtils0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0507");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0000Y000DT00000.0510", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.0510" + "'", str3.equals("P0000Y000DT00000.0510"));
    }

    @Test
    public void DurationFormatUtils0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0508");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (-1L), "", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0509");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, 100L, "P0000Y000DT00000.0510");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.0510" + "'", str3.equals("P0000Y000DT00000.0510"));
    }

    @Test
    public void DurationFormatUtils0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0510");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0511");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P0000Y000DT00000.010-1", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.010-1" + "'", str3.equals("P0000Y000DT00000.010-1"));
    }

    @Test
    public void DurationFormatUtils0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0512");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) '#', "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0513");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P0000Y000DT00000.010-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.010-1" + "'", str2.equals("P0000Y000DT00000.010-1"));
    }

    @Test
    public void DurationFormatUtils0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0514");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), (long) (short) 1, "P0Y000DT00000.03210", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0515");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P0Y0M0DT0H0M0.051S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.05110" + "'", str3.equals("P0Y000DT00000.05110"));
    }

    @Test
    public void DurationFormatUtils0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0516");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, (long) (short) 10, "P-1Y11030DT23059059.9581");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9581" + "'", str3.equals("P-1Y11030DT23059059.9581"));
    }

    @Test
    public void DurationFormatUtils0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0517");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) ' ', false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0518");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 10, (long) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.991S" + "'", str2.equals("P-1Y11M30DT23H59M59.991S"));
    }

    @Test
    public void DurationFormatUtils0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0519");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', 1L, "P0000Y0M0DT0H0M0.001S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y0-10DT07430-10.0013599969" + "'", str3.equals("P0000Y0-10DT07430-10.0013599969"));
    }

    @Test
    public void DurationFormatUtils0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0520");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P00-1Y11030DT23059059.99910");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P00-1Y11030DT23059059.99910" + "'", str2.equals("P00-1Y11030DT23059059.99910"));
    }

    @Test
    public void DurationFormatUtils0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0521");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', (long) 10, "P00-1Y11030DT23059059.99910");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.99910" + "'", str3.equals("P00-1Y11030DT23059059.99910"));
    }

    @Test
    public void DurationFormatUtils0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0522");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) -1, "P0Y000DT00000.991");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.991" + "'", str3.equals("P0Y000DT00000.991"));
    }

    @Test
    public void DurationFormatUtils0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0523");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 100, (long) 0, "0:00:00.010", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0524");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y000DT00000.0011", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0011" + "'", str3.equals("P0Y000DT00000.0011"));
    }

    @Test
    public void DurationFormatUtils0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0525");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y000DT00000.01035", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.01035" + "'", str3.equals("P0Y000DT00000.01035"));
    }

    @Test
    public void DurationFormatUtils0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0526");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) 0, "P0Y000DT00000.10135", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0527");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P-1Y11030DT23059059.968100", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.968100" + "'", str3.equals("P-1Y11030DT23059059.968100"));
    }

    @Test
    public void DurationFormatUtils0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0528");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) '#', "P00-1Y11030DT23059059.99910", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0529");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) 10, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11M30DT23H59M59.913S" + "'", str3.equals("P00-1Y11M30DT23H59M59.913S"));
    }

    @Test
    public void DurationFormatUtils0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0530");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "0:00:00.010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0:00:00.010" + "'", str2.equals("0:00:00.010"));
    }

    @Test
    public void DurationFormatUtils0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0531");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords(10L, false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0532");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) (byte) 10, "P0Y000DT00000.00111");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00111" + "'", str3.equals("P0Y000DT00000.00111"));
    }

    @Test
    public void DurationFormatUtils0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0533");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P0000Y0-10DT07430-10.0103599965");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y0-10DT07430-10.0103599965" + "'", str2.equals("P0000Y0-10DT07430-10.0103599965"));
    }

    @Test
    public void DurationFormatUtils0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0534");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) 10, "P0Y0M0DT0H0M0.99S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.9910" + "'", str3.equals("P0Y000DT00000.9910"));
    }

    @Test
    public void DurationFormatUtils0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0535");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(1L, (long) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.999S" + "'", str2.equals("P-1Y11M30DT23H59M59.999S"));
    }

    @Test
    public void DurationFormatUtils0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0536");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 100, (long) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.952S" + "'", str2.equals("P-1Y11M30DT23H59M59.952S"));
    }

    @Test
    public void DurationFormatUtils0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0537");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0000Y000DT00000.10035");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.10035" + "'", str2.equals("P0000Y000DT00000.10035"));
    }

    @Test
    public void DurationFormatUtils0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0538");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P0000Y000DT00000.10035", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.10035" + "'", str3.equals("P0000Y000DT00000.10035"));
    }

    @Test
    public void DurationFormatUtils0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0539");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P0000Y000DT00000.01010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.01010" + "'", str2.equals("P0000Y000DT00000.01010"));
    }

    @Test
    public void DurationFormatUtils0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0540");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0000Y000DT00000.01099");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.01099" + "'", str2.equals("P0000Y000DT00000.01099"));
    }

    @Test
    public void DurationFormatUtils0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0541");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0542");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "P0Y0M0DT0H0M0.101S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.1010" + "'", str2.equals("P0Y000DT00000.1010"));
    }

    @Test
    public void DurationFormatUtils0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0543");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.051-1", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.051-1" + "'", str3.equals("P0Y000DT00000.051-1"));
    }

    @Test
    public void DurationFormatUtils0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0544");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', 100L, "P0Y0M0DT0H0M0.090S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0545");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 100, 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.900S" + "'", str2.equals("P-1Y11M30DT23H59M59.900S"));
    }

    @Test
    public void DurationFormatUtils0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0546");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y000DT00000.097100", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.097100" + "'", str3.equals("P0Y000DT00000.097100"));
    }

    @Test
    public void DurationFormatUtils0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0547");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 'a', (long) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.902S" + "'", str2.equals("P-1Y11M30DT23H59M59.902S"));
    }

    @Test
    public void DurationFormatUtils0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0548");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, 0L, "P-1Y11M30DT23H59M59.975S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0549");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y0-10DT07430-10.1003599990");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0-10DT07430-10.1003599990" + "'", str2.equals("P0Y0-10DT07430-10.1003599990"));
    }

    @Test
    public void DurationFormatUtils0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0550");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, 1L, "P0Y0-10DT07430-10.0513599999", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0551");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 0, "0 days", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0552");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) (short) 0, "0:00:00.99", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0553");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P0Y0M0DT0H0M0.051S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.05110" + "'", str2.equals("P0Y000DT00000.05110"));
    }

    @Test
    public void DurationFormatUtils0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0554");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, (long) (byte) 1, "P-1Y11M30DT23H59M59.966S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9661" + "'", str3.equals("P-1Y11030DT23059059.9661"));
    }

    @Test
    public void DurationFormatUtils0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0555");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "0 30a059 0 hour 0 1439inute59 0 econ3059", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 30a059 0 hour 0 1439inute59 0 econ3059" + "'", str3.equals("0 30a059 0 hour 0 1439inute59 0 econ3059"));
    }

    @Test
    public void DurationFormatUtils0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0556");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(100L, (long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.910S" + "'", str2.equals("P-1Y11M30DT23H59M59.910S"));
    }

    @Test
    public void DurationFormatUtils0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0557");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y000DT00000.01052", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.01052" + "'", str3.equals("P0Y000DT00000.01052"));
    }

    @Test
    public void DurationFormatUtils0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0558");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P-1Y11M30DT23H59M59.990S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.99097" + "'", str3.equals("P-1Y11030DT23059059.99097"));
    }

    @Test
    public void DurationFormatUtils0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0559");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P-1Y11M30DT23H59M59.989S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.98910" + "'", str3.equals("P-1Y11030DT23059059.98910"));
    }

    @Test
    public void DurationFormatUtils0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0560");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "0:00:00.035", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.035" + "'", str3.equals("0:00:00.035"));
    }

    @Test
    public void DurationFormatUtils0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0561");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (byte) 100, "P0Y000DT00000.01010", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0562");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y0M0DT0H0M0.052S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.052-1" + "'", str2.equals("P0Y000DT00000.052-1"));
    }

    @Test
    public void DurationFormatUtils0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0563");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (-1L), "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0564");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, (long) (short) 100, "P0Y0M0DT0H0M0.096S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.09690" + "'", str3.equals("P0Y000DT00000.09690"));
    }

    @Test
    public void DurationFormatUtils0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0565");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) (byte) 100, "P-1Y11M30DT23H59M59.952S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0566");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P-1Y11M30DT23H59M59.975S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9751" + "'", str2.equals("P-1Y11030DT23059059.9751"));
    }

    @Test
    public void DurationFormatUtils0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0567");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.01052");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.01052" + "'", str2.equals("P0Y000DT00000.01052"));
    }

    @Test
    public void DurationFormatUtils0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0568");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) 0, "P0Y000DT00000.03211");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03211" + "'", str3.equals("P0Y000DT00000.03211"));
    }

    @Test
    public void DurationFormatUtils0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0569");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P00-1Y11M30DT23H59M59.999S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.999100" + "'", str3.equals("P00-1Y11030DT23059059.999100"));
    }

    @Test
    public void DurationFormatUtils0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0570");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (-1), true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0571");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y0M0DT0H0M0.053S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.05332" + "'", str2.equals("P0Y000DT00000.05332"));
    }

    @Test
    public void DurationFormatUtils0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0572");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P-1Y11030DT23059059.96610", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.96610" + "'", str3.equals("P-1Y11030DT23059059.96610"));
    }

    @Test
    public void DurationFormatUtils0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0573");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords(0L, false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0574");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (short) 100, "0 30a086399");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 30a086399" + "'", str3.equals("0 30a086399"));
    }

    @Test
    public void DurationFormatUtils0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0575");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 10, (long) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.989S" + "'", str2.equals("P-1Y11M30DT23H59M59.989S"));
    }

    @Test
    public void DurationFormatUtils0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0576");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 0, false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0577");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), (long) (byte) 0, "0 30a059 0 hour 0 1439inute59 0 econ3059");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 30a059 0 hour 0 1439inute59 0 econ3059" + "'", str3.equals("0 30a059 0 hour 0 1439inute59 0 econ3059"));
    }

    @Test
    public void DurationFormatUtils0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0578");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 0, (long) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2.equals("P0Y0M0DT0H0M0.001S"));
    }

    @Test
    public void DurationFormatUtils0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0579");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) 100, "P0Y000DT00000.01035");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.01035" + "'", str3.equals("P0Y000DT00000.01035"));
    }

    @Test
    public void DurationFormatUtils0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0580");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords(100L, true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0581");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) '4', "P0Y000DT00000.052-1", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0582");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(1L, (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.031S" + "'", str2.equals("P0Y0M0DT0H0M0.031S"));
    }

    @Test
    public void DurationFormatUtils0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0583");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P0Y0M0DT0H0M0.032S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.032-1" + "'", str2.equals("P0Y000DT00000.032-1"));
    }

    @Test
    public void DurationFormatUtils0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0584");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) (byte) 0, "P0Y000DT00000.0010", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0585");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 100, (long) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.900S" + "'", str2.equals("P-1Y11M30DT23H59M59.900S"));
    }

    @Test
    public void DurationFormatUtils0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0586");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0000Y0M0DT0H0M0.010S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.0100" + "'", str2.equals("P0000Y000DT00000.0100"));
    }

    @Test
    public void DurationFormatUtils0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0587");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 1, (long) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.999S" + "'", str2.equals("P-1Y11M30DT23H59M59.999S"));
    }

    @Test
    public void DurationFormatUtils0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0588");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P00-1Y11-130DT2374359-159.9043599990", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11-130DT2374359-159.9043599990" + "'", str3.equals("P00-1Y11-130DT2374359-159.9043599990"));
    }

    @Test
    public void DurationFormatUtils0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0589");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "0:00:00.035", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.035" + "'", str3.equals("0:00:00.035"));
    }

    @Test
    public void DurationFormatUtils0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0590");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, (long) 0, "0:00:00.032");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.032" + "'", str3.equals("0:00:00.032"));
    }

    @Test
    public void DurationFormatUtils0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0591");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.032-1", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.032-1" + "'", str3.equals("P0Y000DT00000.032-1"));
    }

    @Test
    public void DurationFormatUtils0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0592");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P-1Y11M30DT23H59M59.952S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.952-1" + "'", str3.equals("P-1Y11030DT23059059.952-1"));
    }

    @Test
    public void DurationFormatUtils0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0593");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) (byte) 0, "P0Y000DT00000.00110", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0594");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, 100L, "P0Y000DT00000.0100", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0595");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (byte) 10, false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0596");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P0Y000DT00000.00010", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00010" + "'", str3.equals("P0Y000DT00000.00010"));
    }

    @Test
    public void DurationFormatUtils0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0597");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 100, (long) (short) 0, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0598");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.10010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.10010" + "'", str2.equals("P0Y000DT00000.10010"));
    }

    @Test
    public void DurationFormatUtils0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0599");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) 10, "P0Y0M0DT0H0M0.051S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0600");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) 1, "P-1Y11030DT23059059.952-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.952-1" + "'", str3.equals("P-1Y11030DT23059059.952-1"));
    }

    @Test
    public void DurationFormatUtils0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0601");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void DurationFormatUtils0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0602");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P-1Y11-130DT2374359-159.9893599913");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11-130DT2374359-159.9893599913" + "'", str2.equals("P-1Y11-130DT2374359-159.9893599913"));
    }

    @Test
    public void DurationFormatUtils0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0603");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (-1L), "P00-1Y11M30DT23H59M59.904S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0604");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, (long) (byte) -1, "P-1Y11030DT23059059.9900", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0605");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.0039", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0039" + "'", str3.equals("P0Y000DT00000.0039"));
    }

    @Test
    public void DurationFormatUtils0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0606");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P-1Y11M30DT23H59M59.900S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9000" + "'", str2.equals("P-1Y11030DT23059059.9000"));
    }

    @Test
    public void DurationFormatUtils0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0607");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.1010", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.1010" + "'", str3.equals("P0Y000DT00000.1010"));
    }

    @Test
    public void DurationFormatUtils0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0608");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', 1L, "P0Y000DT00000.051-1", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0609");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, (long) (byte) 1, "P0Y000DT00000.03310");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03310" + "'", str3.equals("P0Y000DT00000.03310"));
    }

    @Test
    public void DurationFormatUtils0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0610");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0000Y000DT00000.01099");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.01099" + "'", str2.equals("P0000Y000DT00000.01099"));
    }

    @Test
    public void DurationFormatUtils0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0611");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) 0, "0:00:00.000");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.000" + "'", str3.equals("0:00:00.000"));
    }

    @Test
    public void DurationFormatUtils0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0612");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) '4', "P00-1Y11M30DT23H59M59.904S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.90417" + "'", str3.equals("P00-1Y11030DT23059059.90417"));
    }

    @Test
    public void DurationFormatUtils0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0613");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 10, (long) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.990S" + "'", str2.equals("P-1Y11M30DT23H59M59.990S"));
    }

    @Test
    public void DurationFormatUtils0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0614");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.09690");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.09690" + "'", str2.equals("P0Y000DT00000.09690"));
    }

    @Test
    public void DurationFormatUtils0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0615");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 0, (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.032S" + "'", str2.equals("P0Y0M0DT0H0M0.032S"));
    }

    @Test
    public void DurationFormatUtils0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0616");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), 0L, "P0000Y000DT00000.10035", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0617");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void DurationFormatUtils0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0618");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P-1Y11030DT23059059.91090", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.91090" + "'", str3.equals("P-1Y11030DT23059059.91090"));
    }

    @Test
    public void DurationFormatUtils0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0619");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) (byte) 100, "", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0620");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 'a', (long) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0621");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', 0L, "P0Y000DT00000.051-1", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0622");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (short) 100, "P-1Y11-130DT2374359-159.9663599900", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0623");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) (short) 0, "P-1Y11030DT23059059.9581", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0624");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0625");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "0:00:00.052", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.052" + "'", str3.equals("0:00:00.052"));
    }

    @Test
    public void DurationFormatUtils0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0626");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "0:00:00.097");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0:00:00.097" + "'", str2.equals("0:00:00.097"));
    }

    @Test
    public void DurationFormatUtils0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0627");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) (short) 100, "P0000Y000DT00000.010-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.010-1" + "'", str3.equals("P0000Y000DT00000.010-1"));
    }

    @Test
    public void DurationFormatUtils0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0628");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) 0, "P-1Y11030DT23059059.968100", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0629");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) '#', "P0Y000DT00000.097100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.097100" + "'", str3.equals("P0Y000DT00000.097100"));
    }

    @Test
    public void DurationFormatUtils0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0630");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (short) -1, "P0Y000DT00000.01010", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0631");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) (short) 10, "0 30a086399", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0632");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P-1Y11M30DT23H59M59.952S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.952100" + "'", str2.equals("P-1Y11030DT23059059.952100"));
    }

    @Test
    public void DurationFormatUtils0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0633");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "P00-1Y11030DT23059059.99910");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P00-1Y11030DT23059059.99910" + "'", str2.equals("P00-1Y11030DT23059059.99910"));
    }

    @Test
    public void DurationFormatUtils0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0634");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "P00-1Y11030DT23059059.99910", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.99910" + "'", str3.equals("P00-1Y11030DT23059059.99910"));
    }

    @Test
    public void DurationFormatUtils0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0635");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P0Y000DT00000.0011");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0011" + "'", str2.equals("P0Y000DT00000.0011"));
    }

    @Test
    public void DurationFormatUtils0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0636");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P-1Y11M30DT23H59M59.899S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.8991" + "'", str2.equals("P-1Y11030DT23059059.8991"));
    }

    @Test
    public void DurationFormatUtils0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0637");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P-1Y11030DT23059059.9100", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9100" + "'", str3.equals("P-1Y11030DT23059059.9100"));
    }

    @Test
    public void DurationFormatUtils0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0638");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(1L, (long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0639");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) '#', true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0640");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) 10, "P00-1Y11M30DT23H59M59.999S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0641");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, (-1L), "0 30a086399", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0642");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, 10L, "P0Y0M0DT0H0M0.033S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0643");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', 1L, "0:00:00.000");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.000" + "'", str3.equals("0:00:00.000"));
    }

    @Test
    public void DurationFormatUtils0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0644");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P-1Y11030DT23059059.9990", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9990" + "'", str3.equals("P-1Y11030DT23059059.9990"));
    }

    @Test
    public void DurationFormatUtils0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0645");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.097100", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.097100" + "'", str3.equals("P0Y000DT00000.097100"));
    }

    @Test
    public void DurationFormatUtils0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0646");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 0, (long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.100S" + "'", str2.equals("P0Y0M0DT0H0M0.100S"));
    }

    @Test
    public void DurationFormatUtils0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0647");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) ' ', "P0Y0M0DT0H0M0.031S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03133" + "'", str3.equals("P0Y000DT00000.03133"));
    }

    @Test
    public void DurationFormatUtils0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0648");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P-1Y11M30DT23H59M59.958S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9581" + "'", str3.equals("P-1Y11030DT23059059.9581"));
    }

    @Test
    public void DurationFormatUtils0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0649");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords(1L, true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0650");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P-1Y11030DT23059059.9900");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9900" + "'", str2.equals("P-1Y11030DT23059059.9900"));
    }

    @Test
    public void DurationFormatUtils0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0651");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 0, (long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.010S" + "'", str2.equals("P0Y0M0DT0H0M0.010S"));
    }

    @Test
    public void DurationFormatUtils0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0652");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) '#', "P-1Y11030DT23059059.9000");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9000" + "'", str3.equals("P-1Y11030DT23059059.9000"));
    }

    @Test
    public void DurationFormatUtils0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0653");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(1L, (long) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0654");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), (-1L), "P0000Y000DT00000.01032", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0655");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (byte) -1, "P-1Y11030DT23059059.91090");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.91090" + "'", str3.equals("P-1Y11030DT23059059.91090"));
    }

    @Test
    public void DurationFormatUtils0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0656");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) 1, "P0Y000DT00000.00111");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00111" + "'", str3.equals("P0Y000DT00000.00111"));
    }

    @Test
    public void DurationFormatUtils0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0657");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.03352", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03352" + "'", str3.equals("P0Y000DT00000.03352"));
    }

    @Test
    public void DurationFormatUtils0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0658");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (short) 0, "P-1Y11M30DT23H59M59.998S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9983599903" + "'", str3.equals("P-1Y11-130DT2374359-159.9983599903"));
    }

    @Test
    public void DurationFormatUtils0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0659");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y0-10DT07430-10.0013599947", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0013599947" + "'", str3.equals("P0Y0-10DT07430-10.0013599947"));
    }

    @Test
    public void DurationFormatUtils0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0660");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 10, "P0Y000DT00000.0011", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0661");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) (-1), "P0Y000DT00000.01032");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.01032" + "'", str3.equals("P0Y000DT00000.01032"));
    }

    @Test
    public void DurationFormatUtils0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0662");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0663");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) 100, "P-1Y11M30DT23H59M59.968S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0664");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P0Y0M0DT0H0M0.051S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.051-1" + "'", str3.equals("P0Y000DT00000.051-1"));
    }

    @Test
    public void DurationFormatUtils0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0665");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y000DT00000.03211");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.03211" + "'", str2.equals("P0Y000DT00000.03211"));
    }

    @Test
    public void DurationFormatUtils0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0666");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "0:00:00.000", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.000" + "'", str3.equals("0:00:00.000"));
    }

    @Test
    public void DurationFormatUtils0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0667");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P0Y0-10DT07430-10.1003599990");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0-10DT07430-10.1003599990" + "'", str2.equals("P0Y0-10DT07430-10.1003599990"));
    }

    @Test
    public void DurationFormatUtils0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0668");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 1, (long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.009S" + "'", str2.equals("P0Y0M0DT0H0M0.009S"));
    }

    @Test
    public void DurationFormatUtils0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0669");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) (short) 100, "P0Y0M0DT0H0M0.053S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0670");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.0030", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0030" + "'", str3.equals("P0Y000DT00000.0030"));
    }

    @Test
    public void DurationFormatUtils0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0671");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 100, (long) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.901S" + "'", str2.equals("P-1Y11M30DT23H59M59.901S"));
    }

    @Test
    public void DurationFormatUtils0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0672");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P-1Y11030DT23059059.9990", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9990" + "'", str3.equals("P-1Y11030DT23059059.9990"));
    }

    @Test
    public void DurationFormatUtils0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0673");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (byte) 1, "P-1Y11M30DT23H59M59.958S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0674");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 1, (long) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.099S" + "'", str2.equals("P0Y0M0DT0H0M0.099S"));
    }

    @Test
    public void DurationFormatUtils0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0675");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) 100, "P00-1Y11M30DT23H59M59.904S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0676");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "0:00:00.001");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0:00:00.001" + "'", str2.equals("0:00:00.001"));
    }

    @Test
    public void DurationFormatUtils0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0677");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (-1L), "P00-1Y11030DT23059059.99910", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0678");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.10010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.10010" + "'", str2.equals("P0Y000DT00000.10010"));
    }

    @Test
    public void DurationFormatUtils0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0679");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), (long) (short) 100, "P0Y0M0DT0H0M0.099S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0680");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "0:00:00.035");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0:00:00.035" + "'", str2.equals("0:00:00.035"));
    }

    @Test
    public void DurationFormatUtils0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0681");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P-1Y11030DT23059059.9661");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9661" + "'", str2.equals("P-1Y11030DT23059059.9661"));
    }

    @Test
    public void DurationFormatUtils0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0682");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P-1Y11030DT23059059.9100", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9100" + "'", str3.equals("P-1Y11030DT23059059.9100"));
    }

    @Test
    public void DurationFormatUtils0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0683");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.0350", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0350" + "'", str3.equals("P0Y000DT00000.0350"));
    }

    @Test
    public void DurationFormatUtils0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0684");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y0-10DT07430-10.0323599990");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0-10DT07430-10.0323599990" + "'", str2.equals("P0Y0-10DT07430-10.0323599990"));
    }

    @Test
    public void DurationFormatUtils0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0685");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) (short) -1, "P-1Y11030DT23059059.9661");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9661" + "'", str3.equals("P-1Y11030DT23059059.9661"));
    }

    @Test
    public void DurationFormatUtils0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0686");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "P-1Y11030DT23059059.99097");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.99097" + "'", str2.equals("P-1Y11030DT23059059.99097"));
    }

    @Test
    public void DurationFormatUtils0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0687");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (byte) 1, true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0688");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "0:00:00.99", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.99" + "'", str3.equals("0:00:00.99"));
    }

    @Test
    public void DurationFormatUtils0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0689");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.101-1", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.101-1" + "'", str3.equals("P0Y000DT00000.101-1"));
    }

    @Test
    public void DurationFormatUtils0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0690");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) 0, "P-1Y11M30DT23H59M59.900S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0691");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.01032");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.01032" + "'", str2.equals("P0Y000DT00000.01032"));
    }

    @Test
    public void DurationFormatUtils0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0692");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) -1, 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2.equals("P0Y0M0DT0H0M0.001S"));
    }

    @Test
    public void DurationFormatUtils0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0693");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', 0L, "P-1Y11030DT23059059.96610", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0694");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 1, (long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.009S" + "'", str2.equals("P0Y0M0DT0H0M0.009S"));
    }

    @Test
    public void DurationFormatUtils0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0695");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, 0L, "P0000Y000DT00000.10035", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0696");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((-1L), (long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.011S" + "'", str2.equals("P0Y0M0DT0H0M0.011S"));
    }

    @Test
    public void DurationFormatUtils0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0697");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), 0L, "P0Y000DT00000.00111", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0698");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) (-1), "P0Y000DT00000.991", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0699");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 0, true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0700");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (short) -1, "P-1Y11030DT23059059.9100", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0701");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "0:00:00.001");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0:00:00.001" + "'", str2.equals("0:00:00.001"));
    }

    @Test
    public void DurationFormatUtils0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0702");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) '4', "P0Y000DT00000.001100", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0703");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "P-1Y11M30DT23H59M59.901S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.90132" + "'", str2.equals("P-1Y11030DT23059059.90132"));
    }

    @Test
    public void DurationFormatUtils0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0704");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) (short) 100, "P-1Y11030DT23059059.952-1", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0705");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "P00-1Y11030DT23059059.999100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P00-1Y11030DT23059059.999100" + "'", str2.equals("P00-1Y11030DT23059059.999100"));
    }

    @Test
    public void DurationFormatUtils0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0706");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) (byte) 1, "0:00:00.100", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0707");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (short) -1, "P0Y000DT00000.03352");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03352" + "'", str3.equals("P0Y000DT00000.03352"));
    }

    @Test
    public void DurationFormatUtils0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0708");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 1, (long) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.999S" + "'", str2.equals("P-1Y11M30DT23H59M59.999S"));
    }

    @Test
    public void DurationFormatUtils0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0709");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P0000Y0M0DT0H0M0.010S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.010100" + "'", str2.equals("P0000Y000DT00000.010100"));
    }

    @Test
    public void DurationFormatUtils0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0710");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 0, "P-1Y11M30DT23H59M59.998S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0711");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) '#', (long) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0712");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y000DT00000.033-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.033-1" + "'", str2.equals("P0Y000DT00000.033-1"));
    }

    @Test
    public void DurationFormatUtils0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0713");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, (long) 1, "P0Y0M0DT0H0M0.000S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0714");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y0M0DT0H0M0.033S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.033-1" + "'", str3.equals("P0Y000DT00000.033-1"));
    }

    @Test
    public void DurationFormatUtils0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0715");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 0, "0:00:00.097");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.097" + "'", str3.equals("0:00:00.097"));
    }

    @Test
    public void DurationFormatUtils0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0716");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) (short) 10, "P0000Y000DT00000.0510", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0717");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P00-1Y11M30DT23H59M59.999S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P00-1Y11030DT23059059.999-1" + "'", str2.equals("P00-1Y11030DT23059059.999-1"));
    }

    @Test
    public void DurationFormatUtils0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0718");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, 1L, "P0Y0M0DT0H0M0.010S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0103599991" + "'", str3.equals("P0Y0-10DT07430-10.0103599991"));
    }

    @Test
    public void DurationFormatUtils0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0719");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "0 days 0 hours 0 minutes 0 seconds");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0 0a000 0 hour 0 0inute00 0 econ00" + "'", str2.equals("0 0a000 0 hour 0 0inute00 0 econ00"));
    }

    @Test
    public void DurationFormatUtils0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0720");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, (long) 'a', "0 0econ00");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 0econ00" + "'", str3.equals("0 0econ00"));
    }

    @Test
    public void DurationFormatUtils0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0721");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (byte) 10, "P0000Y0M0DT0H0M0.010S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y0-10DT07430-10.0103599913" + "'", str3.equals("P0000Y0-10DT07430-10.0103599913"));
    }

    @Test
    public void DurationFormatUtils0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0722");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, 0L, "P0Y000DT00000.9910");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.9910" + "'", str3.equals("P0Y000DT00000.9910"));
    }

    @Test
    public void DurationFormatUtils0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0723");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P0Y000DT00000.051-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.051-1" + "'", str2.equals("P0Y000DT00000.051-1"));
    }

    @Test
    public void DurationFormatUtils0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0724");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.01052", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.01052" + "'", str3.equals("P0Y000DT00000.01052"));
    }

    @Test
    public void DurationFormatUtils0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0725");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) (byte) 100, "P0Y0-10DT07430-10.0013599947", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0726");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P-1Y11030DT23059059.968100", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.968100" + "'", str3.equals("P-1Y11030DT23059059.968100"));
    }

    @Test
    public void DurationFormatUtils0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0727");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.09690", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.09690" + "'", str3.equals("P0Y000DT00000.09690"));
    }

    @Test
    public void DurationFormatUtils0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0728");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P-1Y11030DT23059059.90132", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.90132" + "'", str3.equals("P-1Y11030DT23059059.90132"));
    }

    @Test
    public void DurationFormatUtils0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0729");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0000Y000DT00000.010100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.010100" + "'", str2.equals("P0000Y000DT00000.010100"));
    }

    @Test
    public void DurationFormatUtils0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0730");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 10, "0 0econ00");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0 0econ00" + "'", str2.equals("0 0econ00"));
    }

    @Test
    public void DurationFormatUtils0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0731");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) (short) 1, "P0Y000DT00000.10135", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0732");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), (long) '#', "P0000Y000DT00000.010-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.010-1" + "'", str3.equals("P0000Y000DT00000.010-1"));
    }

    @Test
    public void DurationFormatUtils0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0733");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (-1), true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0734");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "0 days");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0 0a00" + "'", str2.equals("0 0a00"));
    }

    @Test
    public void DurationFormatUtils0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0735");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P-1Y11030DT23059059.9581");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9581" + "'", str2.equals("P-1Y11030DT23059059.9581"));
    }

    @Test
    public void DurationFormatUtils0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0736");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 10, (long) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.991S" + "'", str2.equals("P-1Y11M30DT23H59M59.991S"));
    }

    @Test
    public void DurationFormatUtils0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0737");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (byte) 0, "P0Y000DT00000.0330", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0738");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) 0, "P0Y0M0DT0H0M0.010S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0739");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0000Y000DT00000.010-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.010-1" + "'", str2.equals("P0000Y000DT00000.010-1"));
    }

    @Test
    public void DurationFormatUtils0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0740");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y0M0DT0H0M0.000S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.00097" + "'", str2.equals("P0Y000DT00000.00097"));
    }

    @Test
    public void DurationFormatUtils0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0741");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords(10L, true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0742");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P0Y0M0DT0H0M0.096S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.09635" + "'", str3.equals("P0Y000DT00000.09635"));
    }

    @Test
    public void DurationFormatUtils0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0743");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, (long) (short) 1, "P0Y0M0DT0H0M0.052S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0744");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "P00-1Y11030DT23059059.999-1", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.999-1" + "'", str3.equals("P00-1Y11030DT23059059.999-1"));
    }

    @Test
    public void DurationFormatUtils0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0745");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P0Y000DT00000.01032");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.01032" + "'", str2.equals("P0Y000DT00000.01032"));
    }

    @Test
    public void DurationFormatUtils0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0746");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P-1Y11030DT23059059.90352");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.90352" + "'", str2.equals("P-1Y11030DT23059059.90352"));
    }

    @Test
    public void DurationFormatUtils0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0747");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 'a', (long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.913S" + "'", str2.equals("P-1Y11M30DT23H59M59.913S"));
    }

    @Test
    public void DurationFormatUtils0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0748");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "0:00:00.100", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.100" + "'", str3.equals("0:00:00.100"));
    }

    @Test
    public void DurationFormatUtils0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0749");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (-1), 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2.equals("P0Y0M0DT0H0M0.001S"));
    }

    @Test
    public void DurationFormatUtils0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0750");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P-1Y11030DT23059059.96610", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.96610" + "'", str3.equals("P-1Y11030DT23059059.96610"));
    }

    @Test
    public void DurationFormatUtils0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0751");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (byte) -1, true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0752");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0000Y000DT00000.0510", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.0510" + "'", str3.equals("P0000Y000DT00000.0510"));
    }

    @Test
    public void DurationFormatUtils0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0753");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "0:00:00.100", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.100" + "'", str3.equals("0:00:00.100"));
    }

    @Test
    public void DurationFormatUtils0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0754");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P-1Y11030DT23059059.91090");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.91090" + "'", str2.equals("P-1Y11030DT23059059.91090"));
    }

    @Test
    public void DurationFormatUtils0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0755");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P-1Y11030DT23059059.99010", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.99010" + "'", str3.equals("P-1Y11030DT23059059.99010"));
    }

    @Test
    public void DurationFormatUtils0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0756");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.01035", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.01035" + "'", str3.equals("P0Y000DT00000.01035"));
    }

    @Test
    public void DurationFormatUtils0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0757");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 100, (long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.910S" + "'", str2.equals("P-1Y11M30DT23H59M59.910S"));
    }

    @Test
    public void DurationFormatUtils0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0758");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) (short) 0, "P00-1Y11030DT23059059.9993");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.9993" + "'", str3.equals("P00-1Y11030DT23059059.9993"));
    }

    @Test
    public void DurationFormatUtils0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0759");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 0, (long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.010S" + "'", str2.equals("P0Y0M0DT0H0M0.010S"));
    }

    @Test
    public void DurationFormatUtils0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0760");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P-1Y11-130DT2374359-159.9983599903");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11-130DT2374359-159.9983599903" + "'", str2.equals("P-1Y11-130DT2374359-159.9983599903"));
    }

    @Test
    public void DurationFormatUtils0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0761");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, 100L, "P0Y000DT00000.01010", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0762");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, 0L, "0 seconds", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0763");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords(100L, false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0764");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.0030");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0030" + "'", str2.equals("P0Y000DT00000.0030"));
    }

    @Test
    public void DurationFormatUtils0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0765");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) (short) 0, "P0Y000DT00000.00010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00010" + "'", str3.equals("P0Y000DT00000.00010"));
    }

    @Test
    public void DurationFormatUtils0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0766");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (short) -1, true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0767");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P0Y0M0DT0H0M0.031S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.031-1" + "'", str3.equals("P0Y000DT00000.031-1"));
    }

    @Test
    public void DurationFormatUtils0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0768");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 1, (long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.009S" + "'", str2.equals("P0Y0M0DT0H0M0.009S"));
    }

    @Test
    public void DurationFormatUtils0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0769");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P0000Y0M0DT0H0M0.010S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.010100" + "'", str2.equals("P0000Y000DT00000.010100"));
    }

    @Test
    public void DurationFormatUtils0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0770");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (byte) 0, "P-1Y11M30DT23H59M59.975S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9750" + "'", str3.equals("P-1Y11030DT23059059.9750"));
    }

    @Test
    public void DurationFormatUtils0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0771");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(0L, (long) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.097S" + "'", str2.equals("P0Y0M0DT0H0M0.097S"));
    }

    @Test
    public void DurationFormatUtils0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0772");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) 1, "0 30a059 0 hour 0 1439inute59 0 econ3059", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0773");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P-1Y11M30DT23H59M59.901S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.901-1" + "'", str2.equals("P-1Y11030DT23059059.901-1"));
    }

    @Test
    public void DurationFormatUtils0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0774");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 1, (long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.099S" + "'", str2.equals("P0Y0M0DT0H0M0.099S"));
    }

    @Test
    public void DurationFormatUtils0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0775");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (short) 0, true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0776");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P-1Y11030DT23059059.91090");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.91090" + "'", str2.equals("P-1Y11030DT23059059.91090"));
    }

    @Test
    public void DurationFormatUtils0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0777");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (byte) 10, "P0Y000DT00000.05332", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0778");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, 0L, "P-1Y11M30DT23H59M59.966S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9663599900" + "'", str3.equals("P-1Y11-130DT2374359-159.9663599900"));
    }

    @Test
    public void DurationFormatUtils0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0779");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 10, (long) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.990S" + "'", str2.equals("P-1Y11M30DT23H59M59.990S"));
    }

    @Test
    public void DurationFormatUtils0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0780");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 10, (long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.991S" + "'", str2.equals("P-1Y11M30DT23H59M59.991S"));
    }

    @Test
    public void DurationFormatUtils0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0781");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, (long) ' ', "P00-1Y11M30DT23H59M59.904S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0782");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) ' ', "P0Y000DT00000.0310", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0783");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y000DT00000.01035", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.01035" + "'", str3.equals("P0Y000DT00000.01035"));
    }

    @Test
    public void DurationFormatUtils0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0784");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) (-1), "0 seconds");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 86399econ3086399" + "'", str3.equals("0 86399econ3086399"));
    }

    @Test
    public void DurationFormatUtils0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0785");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) '4', (long) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0786");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) '#', false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0787");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) -1, "P-1Y11030DT23059059.9661");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9661" + "'", str3.equals("P-1Y11030DT23059059.9661"));
    }

    @Test
    public void DurationFormatUtils0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0788");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.001100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.001100" + "'", str2.equals("P0Y000DT00000.001100"));
    }

    @Test
    public void DurationFormatUtils0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0789");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (-1L), "P0000Y0-10DT07430-10.0103599965", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0790");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P-1Y11M30DT23H59M59.903S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9030" + "'", str2.equals("P-1Y11030DT23059059.9030"));
    }

    @Test
    public void DurationFormatUtils0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0791");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), 10L, "P0000Y000DT00000.0510", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0792");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) (short) 100, "P-1Y11030DT23059059.90132", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0793");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P0Y000DT00000.09690", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.09690" + "'", str3.equals("P0Y000DT00000.09690"));
    }

    @Test
    public void DurationFormatUtils0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0794");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P-1Y11M30DT23H59M59.989S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9890" + "'", str3.equals("P-1Y11030DT23059059.9890"));
    }

    @Test
    public void DurationFormatUtils0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0795");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P00-1Y11-130DT2374359-159.9043599990", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11-130DT2374359-159.9043599990" + "'", str3.equals("P00-1Y11-130DT2374359-159.9043599990"));
    }

    @Test
    public void DurationFormatUtils0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0796");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P0Y0M0DT0H0M0.001S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00152" + "'", str3.equals("P0Y000DT00000.00152"));
    }

    @Test
    public void DurationFormatUtils0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0797");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P-1Y11030DT23059059.9681", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9681" + "'", str3.equals("P-1Y11030DT23059059.9681"));
    }

    @Test
    public void DurationFormatUtils0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0798");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) '#', 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str2.equals("P0Y0M0DT0H0M0.065S"));
    }

    @Test
    public void DurationFormatUtils0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0799");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) (short) 10, "0:00:00.032", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0800");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(1L, 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.099S" + "'", str2.equals("P0Y0M0DT0H0M0.099S"));
    }

    @Test
    public void DurationFormatUtils0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0801");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 100, 0L, "0:00:00.035");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.035" + "'", str3.equals("0:00:00.035"));
    }

    @Test
    public void DurationFormatUtils0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0802");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) (-1), "0:00:00.001", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0803");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P-1Y11-130DT2374359-159.9983599903");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11-130DT2374359-159.9983599903" + "'", str2.equals("P-1Y11-130DT2374359-159.9983599903"));
    }

    @Test
    public void DurationFormatUtils0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0804");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 10, (long) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.042S" + "'", str2.equals("P0Y0M0DT0H0M0.042S"));
    }

    @Test
    public void DurationFormatUtils0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0805");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 0, (long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.010S" + "'", str2.equals("P0Y0M0DT0H0M0.010S"));
    }

    @Test
    public void DurationFormatUtils0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0806");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "0 days", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 0a00" + "'", str3.equals("0 0a00"));
    }

    @Test
    public void DurationFormatUtils0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0807");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) '#', (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.964S" + "'", str2.equals("P-1Y11M30DT23H59M59.964S"));
    }

    @Test
    public void DurationFormatUtils0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0808");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y0-10DT07430-10.0103599991");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0-10DT07430-10.0103599991" + "'", str2.equals("P0Y0-10DT07430-10.0103599991"));
    }

    @Test
    public void DurationFormatUtils0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0809");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, (long) (byte) 10, "P-1Y11M30DT23H59M59.968S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9689" + "'", str3.equals("P-1Y11030DT23059059.9689"));
    }

    @Test
    public void DurationFormatUtils0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0810");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) (byte) 0, "P-1Y11030DT23059059.96610");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.96610" + "'", str3.equals("P-1Y11030DT23059059.96610"));
    }

    @Test
    public void DurationFormatUtils0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0811");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, 1L, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0812");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y0M0DT0H0M0.003S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0031" + "'", str2.equals("P0Y000DT00000.0031"));
    }

    @Test
    public void DurationFormatUtils0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0813");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 100, (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.932S" + "'", str2.equals("P-1Y11M30DT23H59M59.932S"));
    }

    @Test
    public void DurationFormatUtils0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0814");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "P-1Y11M30DT23H59M59.964S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.964100" + "'", str3.equals("P-1Y11030DT23059059.964100"));
    }

    @Test
    public void DurationFormatUtils0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0815");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.00097");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.00097" + "'", str2.equals("P0Y000DT00000.00097"));
    }

    @Test
    public void DurationFormatUtils0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0816");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', 10L, "P0Y0M0DT0H0M0.033S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0817");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) 10, "P0Y000DT00000.0010", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0818");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (-1L), "0 days 0 hours 0 minutes 0 seconds");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 30a059 0 hour 0 1439inute59 0 econ3059" + "'", str3.equals("0 30a059 0 hour 0 1439inute59 0 econ3059"));
    }

    @Test
    public void DurationFormatUtils0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0819");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y0M0DT0H0M0.090S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.09010" + "'", str2.equals("P0Y000DT00000.09010"));
    }

    @Test
    public void DurationFormatUtils0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0820");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, (long) (short) 100, "P-1Y11030DT23059059.952100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.952100" + "'", str3.equals("P-1Y11030DT23059059.952100"));
    }

    @Test
    public void DurationFormatUtils0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0821");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.0030", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0030" + "'", str3.equals("P0Y000DT00000.0030"));
    }

    @Test
    public void DurationFormatUtils0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0822");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P-1Y11030DT23059059.901-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.901-1" + "'", str2.equals("P-1Y11030DT23059059.901-1"));
    }

    @Test
    public void DurationFormatUtils0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0823");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) 10, "P0Y0-10DT07430-10.0333599899");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0333599899" + "'", str3.equals("P0Y0-10DT07430-10.0333599899"));
    }

    @Test
    public void DurationFormatUtils0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0824");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) -1, (long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2.equals("P0Y0M0DT0H0M0.001S"));
    }

    @Test
    public void DurationFormatUtils0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0825");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 1, (long) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.999S" + "'", str2.equals("P-1Y11M30DT23H59M59.999S"));
    }

    @Test
    public void DurationFormatUtils0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0826");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) -1, (long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.011S" + "'", str2.equals("P0Y0M0DT0H0M0.011S"));
    }

    @Test
    public void DurationFormatUtils0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0827");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0828");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (byte) 10, "0 days 0 hours 0 minutes 0 seconds");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 0a000 0 hour 0 0inute00 0 econ00" + "'", str3.equals("0 0a000 0 hour 0 0inute00 0 econ00"));
    }

    @Test
    public void DurationFormatUtils0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0829");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) '#', "P0000Y000DT00000.01032");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.01032" + "'", str3.equals("P0000Y000DT00000.01032"));
    }

    @Test
    public void DurationFormatUtils0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0830");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) (-1), "0 86399econ3086399");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 86399econ3086399" + "'", str3.equals("0 86399econ3086399"));
    }

    @Test
    public void DurationFormatUtils0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0831");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P0000Y0-10DT07430-10.0103599913");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y0-10DT07430-10.0103599913" + "'", str2.equals("P0000Y0-10DT07430-10.0103599913"));
    }

    @Test
    public void DurationFormatUtils0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0832");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y0M0DT0H0M0.010S" + "'", str2.equals("P0000Y0M0DT0H0M0.010S"));
    }

    @Test
    public void DurationFormatUtils0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0833");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y0-10DT07430-10.1003599990", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.1003599990" + "'", str3.equals("P0Y0-10DT07430-10.1003599990"));
    }

    @Test
    public void DurationFormatUtils0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0834");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) 10, "P-1Y11030DT23059059.9581");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9581" + "'", str3.equals("P-1Y11030DT23059059.9581"));
    }

    @Test
    public void DurationFormatUtils0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0835");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0836");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "0:00:00.052", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.052" + "'", str3.equals("0:00:00.052"));
    }

    @Test
    public void DurationFormatUtils0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0837");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) '#', "P-1Y11030DT23059059.9750");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9750" + "'", str3.equals("P-1Y11030DT23059059.9750"));
    }

    @Test
    public void DurationFormatUtils0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0838");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "P00-1Y11030DT23059059.9993");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P00-1Y11030DT23059059.9993" + "'", str2.equals("P00-1Y11030DT23059059.9993"));
    }

    @Test
    public void DurationFormatUtils0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0839");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y000DT00000.0031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0031" + "'", str2.equals("P0Y000DT00000.0031"));
    }

    @Test
    public void DurationFormatUtils0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0840");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (-1), (long) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.098S" + "'", str2.equals("P0Y0M0DT0H0M0.098S"));
    }

    @Test
    public void DurationFormatUtils0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0841");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), (long) (byte) 10, "P-1Y11030DT23059059.968100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.968100" + "'", str3.equals("P-1Y11030DT23059059.968100"));
    }

    @Test
    public void DurationFormatUtils0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0842");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, (long) (byte) 0, "P-1Y11M30DT23H59M59.989S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0843");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 'a', (long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.904S" + "'", str2.equals("P-1Y11M30DT23H59M59.904S"));
    }

    @Test
    public void DurationFormatUtils0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0844");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P-1Y11M30DT23H59M59.913S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9131" + "'", str2.equals("P-1Y11030DT23059059.9131"));
    }

    @Test
    public void DurationFormatUtils0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0845");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "P0Y0M0DT0H0M0.003S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.00310" + "'", str2.equals("P0Y000DT00000.00310"));
    }

    @Test
    public void DurationFormatUtils0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0846");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P-1Y11M30DT23H59M59.990S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.99010" + "'", str3.equals("P-1Y11030DT23059059.99010"));
    }

    @Test
    public void DurationFormatUtils0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0847");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P-1Y11030DT23059059.9661", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9661" + "'", str3.equals("P-1Y11030DT23059059.9661"));
    }

    @Test
    public void DurationFormatUtils0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0848");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) '4', "P0Y000DT00000.0350", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0849");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (short) 0, "P0000Y000DT00000.0100", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0850");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, (long) (short) 100, "0:00:00.99", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0851");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P0Y0M0DT0H0M0.096S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.096100" + "'", str2.equals("P0Y000DT00000.096100"));
    }

    @Test
    public void DurationFormatUtils0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0852");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y0M0DT0H0M0.035S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0350" + "'", str2.equals("P0Y000DT00000.0350"));
    }

    @Test
    public void DurationFormatUtils0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0853");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0854");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((-1L), 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", str2.equals("P0Y0M0DT0H0M0.002S"));
    }

    @Test
    public void DurationFormatUtils0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0855");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) '#', "P0Y000DT00000.031-1", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0856");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) (short) -1, "P0Y0-10DT07430-10.0323599990", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0857");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 1, (long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0858");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y000DT00000.09632", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.09632" + "'", str3.equals("P0Y000DT00000.09632"));
    }

    @Test
    public void DurationFormatUtils0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0859");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, (long) (byte) 10, "P0Y0M0DT0H0M0.065S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0659" + "'", str3.equals("P0Y000DT00000.0659"));
    }

    @Test
    public void DurationFormatUtils0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0860");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 1, (long) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.099S" + "'", str2.equals("P0Y0M0DT0H0M0.099S"));
    }

    @Test
    public void DurationFormatUtils0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0861");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 100, 1L, "P-1Y11030DT23059059.96610");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.96610" + "'", str3.equals("P-1Y11030DT23059059.96610"));
    }

    @Test
    public void DurationFormatUtils0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0862");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 10, (long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0863");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0000Y000DT00000.0510", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.0510" + "'", str3.equals("P0000Y000DT00000.0510"));
    }

    @Test
    public void DurationFormatUtils0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0864");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) 0, "P-1Y11M30DT23H59M59.932S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0865");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P-1Y11030DT23059059.90132");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.90132" + "'", str2.equals("P-1Y11030DT23059059.90132"));
    }

    @Test
    public void DurationFormatUtils0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0866");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 100, 100L, "P0Y000DT00000.001100", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0867");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) 'a', "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0868");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P0000Y0M0DT0H0M0.010S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.01052" + "'", str3.equals("P0000Y000DT00000.01052"));
    }

    @Test
    public void DurationFormatUtils0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0869");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (-1L), "P-1Y11-130DT2374359-159.9663599900");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9663599900" + "'", str3.equals("P-1Y11-130DT2374359-159.9663599900"));
    }

    @Test
    public void DurationFormatUtils0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0870");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, (long) (short) 0, "P-1Y11M30DT23H59M59.932S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9323599900" + "'", str3.equals("P-1Y11-130DT2374359-159.9323599900"));
    }

    @Test
    public void DurationFormatUtils0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0871");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (-1), 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.101S" + "'", str2.equals("P0Y0M0DT0H0M0.101S"));
    }

    @Test
    public void DurationFormatUtils0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0872");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (-1), "P0Y0-10DT07430-10.1003599990");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.1003599990" + "'", str3.equals("P0Y0-10DT07430-10.1003599990"));
    }

    @Test
    public void DurationFormatUtils0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0873");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(100L, (long) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0874");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P-1Y11M30DT23H59M59.932S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.93252" + "'", str2.equals("P-1Y11030DT23059059.93252"));
    }

    @Test
    public void DurationFormatUtils0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0875");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) '#', "P-1Y11M30DT23H59M59.989S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0876");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) '4', "P0000Y000DT00000.01052");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.01052" + "'", str3.equals("P0000Y000DT00000.01052"));
    }

    @Test
    public void DurationFormatUtils0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0877");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(1L, (long) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.034S" + "'", str2.equals("P0Y0M0DT0H0M0.034S"));
    }

    @Test
    public void DurationFormatUtils0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0878");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, 1L, "P00-1Y11M30DT23H59M59.904S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.9042" + "'", str3.equals("P00-1Y11030DT23059059.9042"));
    }

    @Test
    public void DurationFormatUtils0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0879");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y000DT00000.03310");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.03310" + "'", str2.equals("P0Y000DT00000.03310"));
    }

    @Test
    public void DurationFormatUtils0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0880");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 10, (long) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.991S" + "'", str2.equals("P-1Y11M30DT23H59M59.991S"));
    }

    @Test
    public void DurationFormatUtils0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0881");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) '4', "P0Y000DT00000.00111");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00111" + "'", str3.equals("P0Y000DT00000.00111"));
    }

    @Test
    public void DurationFormatUtils0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0882");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (short) 1, "P0Y000DT00000.03352");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03352" + "'", str3.equals("P0Y000DT00000.03352"));
    }

    @Test
    public void DurationFormatUtils0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0883");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "P0000Y000DT00000.0100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.0100" + "'", str2.equals("P0000Y000DT00000.0100"));
    }

    @Test
    public void DurationFormatUtils0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0884");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "P00-1Y11030DT23059059.99999");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P00-1Y11030DT23059059.99999" + "'", str2.equals("P00-1Y11030DT23059059.99999"));
    }

    @Test
    public void DurationFormatUtils0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0885");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, 0L, "P0Y000DT00000.0350");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0350" + "'", str3.equals("P0Y000DT00000.0350"));
    }

    @Test
    public void DurationFormatUtils0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0886");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 100, "P0Y000DT00000.03133", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0887");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, 1L, "P0Y0M0DT0H0M0.034S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0888");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.0000");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0000" + "'", str2.equals("P0Y000DT00000.0000"));
    }

    @Test
    public void DurationFormatUtils0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0889");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0000Y000DT00000.10035", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.10035" + "'", str3.equals("P0000Y000DT00000.10035"));
    }

    @Test
    public void DurationFormatUtils0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0890");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P-1Y11030DT23059059.968100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.968100" + "'", str2.equals("P-1Y11030DT23059059.968100"));
    }

    @Test
    public void DurationFormatUtils0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0891");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (short) 1, "P0Y000DT00000.991", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0892");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', 0L, "P0Y000DT00000.09635", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0893");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) 10, "P0Y000DT00000.097100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.097100" + "'", str3.equals("P0Y000DT00000.097100"));
    }

    @Test
    public void DurationFormatUtils0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0894");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(0L, (long) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.999S" + "'", str2.equals("P-1Y11M30DT23H59M59.999S"));
    }

    @Test
    public void DurationFormatUtils0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0895");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.03352");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.03352" + "'", str2.equals("P0Y000DT00000.03352"));
    }

    @Test
    public void DurationFormatUtils0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0896");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 100, "0 0a00", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0897");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P0Y000DT00000.05332");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.05332" + "'", str2.equals("P0Y000DT00000.05332"));
    }

    @Test
    public void DurationFormatUtils0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0898");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) (short) 10, "P-1Y11030DT23059059.9681");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9681" + "'", str3.equals("P-1Y11030DT23059059.9681"));
    }

    @Test
    public void DurationFormatUtils0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0899");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "0:00:00.052", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.052" + "'", str3.equals("0:00:00.052"));
    }

    @Test
    public void DurationFormatUtils0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0900");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) (byte) -1, "P0Y0M0DT0H0M0.033S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0901");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) '#', "0 30a086399");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 30a086399" + "'", str3.equals("0 30a086399"));
    }

    @Test
    public void DurationFormatUtils0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0902");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "P-1Y11M30DT23H59M59.901S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9010" + "'", str3.equals("P-1Y11030DT23059059.9010"));
    }

    @Test
    public void DurationFormatUtils0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0903");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, 0L, "P0Y000DT00000.101-1", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0904");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P-1Y11030DT23059059.952100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.952100" + "'", str2.equals("P-1Y11030DT23059059.952100"));
    }

    @Test
    public void DurationFormatUtils0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0905");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 10, (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.989S" + "'", str2.equals("P-1Y11M30DT23H59M59.989S"));
    }

    @Test
    public void DurationFormatUtils0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0906");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void DurationFormatUtils0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0907");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 10, (long) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.087S" + "'", str2.equals("P0Y0M0DT0H0M0.087S"));
    }

    @Test
    public void DurationFormatUtils0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0908");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P0Y0-10DT07430-10.0003599899", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0003599899" + "'", str3.equals("P0Y0-10DT07430-10.0003599899"));
    }

    @Test
    public void DurationFormatUtils0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0909");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0000Y000DT00000.01099");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.01099" + "'", str2.equals("P0000Y000DT00000.01099"));
    }

    @Test
    public void DurationFormatUtils0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0910");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) (byte) 100, "P0Y000DT00000.05110", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0911");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, 0L, "P0Y0-10DT07430-10.0103599991");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0103599991" + "'", str3.equals("P0Y0-10DT07430-10.0103599991"));
    }

    @Test
    public void DurationFormatUtils0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0912");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.01052", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.01052" + "'", str3.equals("P0Y000DT00000.01052"));
    }

    @Test
    public void DurationFormatUtils0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0913");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y0M0DT0H0M0.002S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0020" + "'", str3.equals("P0Y000DT00000.0020"));
    }

    @Test
    public void DurationFormatUtils0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0914");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) (short) 0, "P0Y000DT00000.096100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.096100" + "'", str3.equals("P0Y000DT00000.096100"));
    }

    @Test
    public void DurationFormatUtils0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0915");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, (long) (byte) 100, "P0Y000DT00000.03133", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0916");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 100, 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.901S" + "'", str2.equals("P-1Y11M30DT23H59M59.901S"));
    }

    @Test
    public void DurationFormatUtils0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0917");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (-1), "P0000Y000DT00000.0100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.0100" + "'", str3.equals("P0000Y000DT00000.0100"));
    }

    @Test
    public void DurationFormatUtils0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0918");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (byte) 0, "P-1Y11030DT23059059.9750", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0919");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P-1Y11030DT23059059.9681");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9681" + "'", str2.equals("P-1Y11030DT23059059.9681"));
    }

    @Test
    public void DurationFormatUtils0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0920");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) 100, "P0000Y000DT00000.0100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.0100" + "'", str3.equals("P0000Y000DT00000.0100"));
    }

    @Test
    public void DurationFormatUtils0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0921");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (short) 1, "P0Y0M0DT0H0M0.000S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0922");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) ' ', "P-1Y11030DT23059059.9661");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9661" + "'", str3.equals("P-1Y11030DT23059059.9661"));
    }

    @Test
    public void DurationFormatUtils0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0923");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P-1Y11-130DT2374359-159.9323599900", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9323599900" + "'", str3.equals("P-1Y11-130DT2374359-159.9323599900"));
    }

    @Test
    public void DurationFormatUtils0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0924");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 0, true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0925");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) '4', "P0Y000DT00000.10010", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0926");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "P00-1Y11030DT23059059.999100", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.999100" + "'", str3.equals("P00-1Y11030DT23059059.999100"));
    }

    @Test
    public void DurationFormatUtils0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0927");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (-1L), "P-1Y11M30DT23H59M59.932S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9323599899" + "'", str3.equals("P-1Y11-130DT2374359-159.9323599899"));
    }

    @Test
    public void DurationFormatUtils0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0928");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, 10L, "P0Y000DT00000.05332");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.05332" + "'", str3.equals("P0Y000DT00000.05332"));
    }

    @Test
    public void DurationFormatUtils0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0929");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P0000Y0M0DT0H0M0.051S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.051100" + "'", str3.equals("P0000Y000DT00000.051100"));
    }

    @Test
    public void DurationFormatUtils0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0930");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 1, (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.031S" + "'", str2.equals("P0Y0M0DT0H0M0.031S"));
    }

    @Test
    public void DurationFormatUtils0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0931");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) (short) 0, "P-1Y11030DT23059059.9131");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9131" + "'", str3.equals("P-1Y11030DT23059059.9131"));
    }

    @Test
    public void DurationFormatUtils0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0932");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.09632", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.09632" + "'", str3.equals("P0Y000DT00000.09632"));
    }

    @Test
    public void DurationFormatUtils0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0933");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, (-1L), "P0Y000DT00000.097100", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0934");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) (short) 10, "P0Y000DT00000.032-1", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0935");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) (short) -1, "P-1Y11-130DT2374359-159.9893599913", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0936");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, 1L, "P-1Y11030DT23059059.9681", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0937");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) (byte) 1, "P0Y000DT00000.00310", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0938");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y0-10DT07430-10.0013599947");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0-10DT07430-10.0013599947" + "'", str2.equals("P0Y0-10DT07430-10.0013599947"));
    }

    @Test
    public void DurationFormatUtils0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0939");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0000Y0-10DT07430-10.0013599969");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y0-10DT07430-10.0013599969" + "'", str2.equals("P0000Y0-10DT07430-10.0013599969"));
    }

    @Test
    public void DurationFormatUtils0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0940");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P0Y000DT00000.0511");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0511" + "'", str2.equals("P0Y000DT00000.0511"));
    }

    @Test
    public void DurationFormatUtils0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0941");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P-1Y11030DT23059059.9890");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9890" + "'", str2.equals("P-1Y11030DT23059059.9890"));
    }

    @Test
    public void DurationFormatUtils0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0942");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (short) 100, true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0943");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) 1, "P-1Y11M30DT23H59M59.991S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9911" + "'", str3.equals("P-1Y11030DT23059059.9911"));
    }

    @Test
    public void DurationFormatUtils0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0944");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P0Y000DT00000.00110");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.00110" + "'", str2.equals("P0Y000DT00000.00110"));
    }

    @Test
    public void DurationFormatUtils0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0945");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (short) 1, "P0Y000DT00000.10010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.10010" + "'", str3.equals("P0Y000DT00000.10010"));
    }

    @Test
    public void DurationFormatUtils0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0946");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y0M0DT0H0M0.053S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.05332" + "'", str3.equals("P0Y000DT00000.05332"));
    }

    @Test
    public void DurationFormatUtils0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0947");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.09635");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.09635" + "'", str2.equals("P0Y000DT00000.09635"));
    }

    @Test
    public void DurationFormatUtils0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0948");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(10L, (long) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.025S" + "'", str2.equals("P0Y0M0DT0H0M0.025S"));
    }

    @Test
    public void DurationFormatUtils0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0949");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y0M0DT0H0M0.002S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.00210" + "'", str2.equals("P0Y000DT00000.00210"));
    }

    @Test
    public void DurationFormatUtils0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0950");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 0, (long) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.999S" + "'", str2.equals("P-1Y11M30DT23H59M59.999S"));
    }

    @Test
    public void DurationFormatUtils0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0951");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y0M0DT0H0M0.042S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.042100" + "'", str2.equals("P0Y000DT00000.042100"));
    }

    @Test
    public void DurationFormatUtils0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0952");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y0M0DT0H0M0.101S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.10110" + "'", str3.equals("P0Y000DT00000.10110"));
    }

    @Test
    public void DurationFormatUtils0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0953");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (short) 100, "P0000Y000DT00000.10035");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.10035" + "'", str3.equals("P0000Y000DT00000.10035"));
    }

    @Test
    public void DurationFormatUtils0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0954");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) 10, "P-1Y11030DT23059059.9100", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0955");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y0M0DT0H0M0.100S" + "'", str2.equals("P0000Y0M0DT0H0M0.100S"));
    }

    @Test
    public void DurationFormatUtils0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0956");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(0L, 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2.equals("P0Y0M0DT0H0M0.001S"));
    }

    @Test
    public void DurationFormatUtils0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0957");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), (-1L), "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0958");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y0M0DT0H0M0.042S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0420" + "'", str3.equals("P0Y000DT00000.0420"));
    }

    @Test
    public void DurationFormatUtils0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0959");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) '4', "P0Y0M0DT0H0M0.000S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0960");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P0Y000DT00000.03352", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03352" + "'", str3.equals("P0Y000DT00000.03352"));
    }

    @Test
    public void DurationFormatUtils0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0961");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (-1), (long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.011S" + "'", str2.equals("P0Y0M0DT0H0M0.011S"));
    }

    @Test
    public void DurationFormatUtils0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0962");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "P0Y0-10DT07430-10.0103599991");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0-10DT07430-10.0103599991" + "'", str2.equals("P0Y0-10DT07430-10.0103599991"));
    }

    @Test
    public void DurationFormatUtils0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0963");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) (short) 1, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0964");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) (short) 1, "P0Y0-10DT07430-10.0103599991");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0103599991" + "'", str3.equals("P0Y0-10DT07430-10.0103599991"));
    }

    @Test
    public void DurationFormatUtils0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0965");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.01035", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.01035" + "'", str3.equals("P0Y000DT00000.01035"));
    }

    @Test
    public void DurationFormatUtils0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0966");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 100, (long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.901S" + "'", str2.equals("P-1Y11M30DT23H59M59.901S"));
    }

    @Test
    public void DurationFormatUtils0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0967");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 0L, "P-1Y11M30DT23H59M59.968S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0968");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) (short) 10, "P-1Y11030DT23059059.99010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.99010" + "'", str3.equals("P-1Y11030DT23059059.99010"));
    }

    @Test
    public void DurationFormatUtils0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0969");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, (long) 10, "", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0970");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y0-10DT07430-10.0513599999");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0-10DT07430-10.0513599999" + "'", str2.equals("P0Y0-10DT07430-10.0513599999"));
    }

    @Test
    public void DurationFormatUtils0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0971");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', 0L, "P-1Y11030DT23059059.9000", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0972");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P-1Y11030DT23059059.968100", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.968100" + "'", str3.equals("P-1Y11030DT23059059.968100"));
    }

    @Test
    public void DurationFormatUtils0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0973");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P-1Y11030DT23059059.9751", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9751" + "'", str3.equals("P-1Y11030DT23059059.9751"));
    }

    @Test
    public void DurationFormatUtils0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0974");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, (-1L), "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0975");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (byte) 10, "P-1Y11030DT23059059.9911", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0976");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) '#', "P-1Y11M30DT23H59M59.999S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0977");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) 'a', "P0000Y000DT00000.01010", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0978");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) '4', "P0Y000DT00000.03211");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03211" + "'", str3.equals("P0Y000DT00000.03211"));
    }

    @Test
    public void DurationFormatUtils0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0979");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y0-10DT07430-10.0323599990", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0323599990" + "'", str3.equals("P0Y0-10DT07430-10.0323599990"));
    }

    @Test
    public void DurationFormatUtils0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0980");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), (long) 100, "P0Y000DT00000.09635");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.09635" + "'", str3.equals("P0Y000DT00000.09635"));
    }

    @Test
    public void DurationFormatUtils0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0981");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) '#', "P-1Y11030DT23059059.9901", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0982");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 1L, "P-1Y11-130DT2374359-159.9323599900", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0983");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P0Y0-10DT07430-10.0033599991", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0033599991" + "'", str3.equals("P0Y0-10DT07430-10.0033599991"));
    }

    @Test
    public void DurationFormatUtils0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0984");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) 100, "P00-1Y11030DT23059059.999100", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0985");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) (byte) -1, "P00-1Y11030DT23059059.999-1", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0986");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.03133");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.03133" + "'", str2.equals("P0Y000DT00000.03133"));
    }

    @Test
    public void DurationFormatUtils0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0987");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), 0L, "P-1Y11M30DT23H59M59.968S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0988");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', (long) (-1), "P0Y000DT00000.00110", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0989");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(100L, (long) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.899S" + "'", str2.equals("P-1Y11M30DT23H59M59.899S"));
    }

    @Test
    public void DurationFormatUtils0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0990");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P-1Y11M30DT23H59M59.958S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9580" + "'", str3.equals("P-1Y11030DT23059059.9580"));
    }

    @Test
    public void DurationFormatUtils0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0991");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0992");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 10, (long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0993");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 10, (long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.990S" + "'", str2.equals("P-1Y11M30DT23H59M59.990S"));
    }

    @Test
    public void DurationFormatUtils0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0994");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.03211", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03211" + "'", str3.equals("P0Y000DT00000.03211"));
    }

    @Test
    public void DurationFormatUtils0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0995");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, 1L, "P-1Y11M30DT23H59M59.990S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0996");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "0 seconds", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 0econ00" + "'", str3.equals("0 0econ00"));
    }

    @Test
    public void DurationFormatUtils0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0997");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "P0000Y000DT00000.01010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.01010" + "'", str2.equals("P0000Y000DT00000.01010"));
    }

    @Test
    public void DurationFormatUtils0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0998");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) 10, "P0Y0M0DT0H0M0.011S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils0999");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, (long) (short) 1, "P0Y000DT00000.01035");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.01035" + "'", str3.equals("P0Y000DT00000.01035"));
    }

    @Test
    public void DurationFormatUtils1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.DurationFormatUtils1000");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) 1, "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }
}

