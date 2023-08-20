
package DurationFormatUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DurationFormatUtils0 {

    public static boolean debug = false;

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0001");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str1.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0002");
        java.lang.String str0 = org.apache.commons.lang3.time.DurationFormatUtils.ISO_EXTENDED_FORMAT_PATTERN;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'" + "'", str0.equals("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0003");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.99" + "'", str1.equals("0:00:00.99"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0004");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 'a', 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.903S" + "'", str2.equals("P-1Y11M30DT23H59M59.903S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0005");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) 0, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11M30DT23H59M59.999S" + "'", str3.equals("P00-1Y11M30DT23H59M59.999S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0006");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, (long) 0, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0007");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 10, 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.990S" + "'", str2.equals("P-1Y11M30DT23H59M59.990S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0008");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, 0L, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0009");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) -1, "P0Y0M0DT0H0M0.000S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0010");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P-1Y11M30DT23H59M59.990S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9901" + "'", str3.equals("P-1Y11030DT23059059.9901"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0011");
        org.apache.commons.lang3.time.DurationFormatUtils durationFormatUtils0 = new org.apache.commons.lang3.time.DurationFormatUtils();
        java.lang.Class<?> wildcardClass1 = durationFormatUtils0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0012");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0013");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) 1, "0:00:00.99", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0014");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (byte) 10, false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0015");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 10L, "0:00:00.99", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0016");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 1, true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0017");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords(0L, true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0018");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 0, 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0019");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 100, true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0020");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P-1Y11M30DT23H59M59.903S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.90352" + "'", str3.equals("P-1Y11030DT23059059.90352"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0021");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) (short) -1, "P-1Y11M30DT23H59M59.903S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0022");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "P0Y0M0DT0H0M0.000S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.00010" + "'", str2.equals("P0Y000DT00000.00010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0023");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (-1), (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.033S" + "'", str2.equals("P0Y0M0DT0H0M0.033S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0024");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (short) 10, false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0025");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), (long) (byte) 1, "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0026");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', (long) 100, "0:00:00.99", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0027");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 100, false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0028");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (byte) -1, false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0029");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str1.equals("P0Y0M0DT0H0M0.001S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0030");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.010S" + "'", str1.equals("P0Y0M0DT0H0M0.010S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0031");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) 'a', "0 days 0 hours 0 minutes 0 seconds", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0032");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y0M0DT0H0M0.033S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.03310" + "'", str2.equals("P0Y000DT00000.03310"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0033");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0034");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (short) 1, "P0Y000DT00000.00010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00010" + "'", str3.equals("P0Y000DT00000.00010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0035");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) ' ', "P0Y0M0DT0H0M0.033S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0036");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS(100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.100" + "'", str1.equals("0:00:00.100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0037");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P0Y0M0DT0H0M0.010S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.01035" + "'", str2.equals("P0Y000DT00000.01035"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0038");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO(0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str1.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0039");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0040");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (-1L), "0 days 0 hours 0 minutes 0 seconds");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 30a059 0 hour 0 1439inute59 0 econ3059" + "'", str3.equals("0 30a059 0 hour 0 1439inute59 0 econ3059"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0041");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) (byte) 10, "P0Y000DT00000.00010", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0042");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.032" + "'", str1.equals("0:00:00.032"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0043");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (short) 10, false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0044");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.001" + "'", str1.equals("0:00:00.001"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0045");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P00-1Y11M30DT23H59M59.999S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.99910" + "'", str3.equals("P00-1Y11030DT23059059.99910"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0046");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0047");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO(10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.010S" + "'", str1.equals("P0Y0M0DT0H0M0.010S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0048");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 1L, "0:00:00.032");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.032" + "'", str3.equals("0:00:00.032"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0049");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.100S" + "'", str1.equals("P0Y0M0DT0H0M0.100S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0050");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), (long) (short) 0, "0 30a059 0 hour 0 1439inute59 0 econ3059", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0051");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', 0L, "P0Y0M0DT0H0M0.033S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0052");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, 1L, "", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0053");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (short) 0, "0 days");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 30a086399" + "'", str3.equals("0 30a086399"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0054");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) (short) 100, "0:00:00.001");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.001" + "'", str3.equals("0:00:00.001"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0055");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS(0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.000" + "'", str1.equals("0:00:00.000"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0056");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords(1L, false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0057");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "0:00:00.99", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.99" + "'", str3.equals("0:00:00.99"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0058");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.000" + "'", str1.equals("0:00:00.000"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0059");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.99S" + "'", str1.equals("P0Y0M0DT0H0M0.99S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0060");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y0M0DT0H0M0.010S" + "'", str2.equals("P0000Y0M0DT0H0M0.010S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0061");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.032S" + "'", str1.equals("P0Y0M0DT0H0M0.032S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0062");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P0Y0M0DT0H0M0.001S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00110" + "'", str3.equals("P0Y000DT00000.00110"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0063");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.00110", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00110" + "'", str3.equals("P0Y000DT00000.00110"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0064");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', 1L, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11M30DT23H59M59.904S" + "'", str3.equals("P00-1Y11M30DT23H59M59.904S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0065");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P-1Y11030DT23059059.90352", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.90352" + "'", str3.equals("P-1Y11030DT23059059.90352"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0066");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 1, (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.031S" + "'", str2.equals("P0Y0M0DT0H0M0.031S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0067");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, 100L, "0:00:00.99", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0068");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 100, (long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.910S" + "'", str2.equals("P-1Y11M30DT23H59M59.910S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0069");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 0, (long) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.999S" + "'", str2.equals("P-1Y11M30DT23H59M59.999S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0070");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(0L, (long) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.100S" + "'", str2.equals("P0Y0M0DT0H0M0.100S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0071");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str1.equals("P0Y0M0DT0H0M0.001S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0072");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.00110", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00110" + "'", str3.equals("P0Y000DT00000.00110"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0073");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) (-1), "0:00:00.100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.100" + "'", str3.equals("0:00:00.100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0074");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "P0Y0M0DT0H0M0.010S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.01010" + "'", str3.equals("P0Y000DT00000.01010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0075");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) ' ', (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0076");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.052" + "'", str1.equals("0:00:00.052"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0077");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "0 days 0 hours 0 minutes 0 seconds", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 0a00 0 hour 0 0inute0 0 econ00" + "'", str3.equals("0 0a00 0 hour 0 0inute0 0 econ00"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0078");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 0, (long) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.100S" + "'", str2.equals("P0Y0M0DT0H0M0.100S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0079");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 'a', true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0080");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS(10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.010" + "'", str1.equals("0:00:00.010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0081");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "P-1Y11M30DT23H59M59.990S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9901" + "'", str3.equals("P-1Y11030DT23059059.9901"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0082");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0083");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.99S" + "'", str1.equals("P0Y0M0DT0H0M0.99S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0084");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO(100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.100S" + "'", str1.equals("P0Y0M0DT0H0M0.100S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0085");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "P0000Y0M0DT0H0M0.010S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.01032" + "'", str3.equals("P0000Y000DT00000.01032"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0086");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.097" + "'", str1.equals("0:00:00.097"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0087");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y0M0DT0H0M0.033S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.033-1" + "'", str2.equals("P0Y000DT00000.033-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0088");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) '#', "P00-1Y11030DT23059059.99910");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.99910" + "'", str3.equals("P00-1Y11030DT23059059.99910"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0089");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (short) 10, "P0Y0M0DT0H0M0.032S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03211" + "'", str3.equals("P0Y000DT00000.03211"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0090");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) (short) 100, "P00-1Y11M30DT23H59M59.999S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.99999" + "'", str3.equals("P00-1Y11030DT23059059.99999"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0091");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "0:00:00.010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0:00:00.010" + "'", str2.equals("0:00:00.010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0092");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) 0, "0:00:00.99", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0093");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (byte) 100, true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0094");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) '#', true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0095");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 'a', (long) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.903S" + "'", str2.equals("P-1Y11M30DT23H59M59.903S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0096");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.035" + "'", str1.equals("0:00:00.035"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0097");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.03211", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03211" + "'", str3.equals("P0Y000DT00000.03211"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0098");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "P0Y0M0DT0H0M0.032S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.03210" + "'", str2.equals("P0Y000DT00000.03210"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0099");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) '4', "P-1Y11M30DT23H59M59.999S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0100");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(0L, (long) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.035S" + "'", str2.equals("P0Y0M0DT0H0M0.035S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0101");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, 0L, "P00-1Y11030DT23059059.99910", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0102");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(0L, (long) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0103");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) (short) 100, "P0Y0M0DT0H0M0.001S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.001100" + "'", str3.equals("P0Y000DT00000.001100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0104");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.99S" + "'", str1.equals("P0Y0M0DT0H0M0.99S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0105");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P-1Y11M30DT23H59M59.990S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9900" + "'", str2.equals("P-1Y11030DT23059059.9900"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0106");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, (long) 100, "P0000Y0M0DT0H0M0.010S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.01099" + "'", str3.equals("P0000Y000DT00000.01099"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0107");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) 100, "P-1Y11030DT23059059.9900", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0108");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords(1L, false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0109");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', 1L, "0 days");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 30a086399" + "'", str3.equals("0 30a086399"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0110");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (byte) 100, true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0111");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P0000Y000DT00000.01099", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.01099" + "'", str3.equals("P0000Y000DT00000.01099"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0112");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 1, (long) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.051S" + "'", str2.equals("P0Y0M0DT0H0M0.051S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0113");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str1.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0114");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (-1), false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0115");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.010" + "'", str1.equals("0:00:00.010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0116");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (byte) 1, true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0117");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (byte) 0, false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0118");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "0:00:00.001", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.001" + "'", str3.equals("0:00:00.001"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0119");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', (long) (short) -1, "P0Y0M0DT0H0M0.001S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0013599947" + "'", str3.equals("P0Y0-10DT07430-10.0013599947"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0120");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "0:00:00.052");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0:00:00.052" + "'", str2.equals("0:00:00.052"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0121");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.100" + "'", str1.equals("0:00:00.100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0122");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 10, 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.991S" + "'", str2.equals("P-1Y11M30DT23H59M59.991S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0123");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 0, 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2.equals("P0Y0M0DT0H0M0.001S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0124");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 10, (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.989S" + "'", str2.equals("P-1Y11M30DT23H59M59.989S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0125");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) '#', "P00-1Y11M30DT23H59M59.999S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.9993" + "'", str3.equals("P00-1Y11030DT23059059.9993"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0126");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) (byte) 100, "P-1Y11M30DT23H59M59.910S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0127");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.00110");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.00110" + "'", str2.equals("P0Y000DT00000.00110"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0128");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.03211");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.03211" + "'", str2.equals("P0Y000DT00000.03211"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0129");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "0:00:00.032");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0:00:00.032" + "'", str2.equals("0:00:00.032"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0130");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "0 seconds");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0 0econ00" + "'", str2.equals("0 0econ00"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0131");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, (long) (short) 1, "0 0a00 0 hour 0 0inute0 0 econ00");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 0a00 0 hour 0 0inute0 0 econ00" + "'", str3.equals("0 0a00 0 hour 0 0inute0 0 econ00"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0132");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y0M0DT0H0M0.051S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.051-1" + "'", str3.equals("P0Y000DT00000.051-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0133");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (byte) 10, true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0134");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (short) -1, "0:00:00.010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.010" + "'", str3.equals("0:00:00.010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0135");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) (short) 1, "0:00:00.010", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0136");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.000" + "'", str1.equals("0:00:00.000"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0137");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (short) 0, false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0138");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.00110", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00110" + "'", str3.equals("P0Y000DT00000.00110"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0139");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "0:00:00.100", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.100" + "'", str3.equals("0:00:00.100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0140");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, (long) 1, "", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0141");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) (byte) 0, "P0Y0M0DT0H0M0.035S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0350" + "'", str3.equals("P0Y000DT00000.0350"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0142");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, 10L, "0:00:00.99");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.99" + "'", str3.equals("0:00:00.99"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0143");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.001" + "'", str1.equals("0:00:00.001"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0144");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P0Y0M0DT0H0M0.010S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.01052" + "'", str2.equals("P0Y000DT00000.01052"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0145");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.100" + "'", str1.equals("0:00:00.100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0146");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P-1Y11030DT23059059.9900", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9900" + "'", str3.equals("P-1Y11030DT23059059.9900"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0147");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0000Y0M0DT0H0M0.010S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.01010" + "'", str2.equals("P0000Y000DT00000.01010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0148");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) 10, "P0Y000DT00000.001100", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0149");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) '4', "", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0150");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 100, (-1L), "P0Y0M0DT0H0M0.000S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0003599899" + "'", str3.equals("P0Y0-10DT07430-10.0003599899"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0151");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "0:00:00.035", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.035" + "'", str3.equals("0:00:00.035"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0152");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((-1L), false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0153");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (-1L), "P00-1Y11030DT23059059.99999", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0154");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0155");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) ' ', "P0Y000DT00000.051-1", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0156");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "0:00:00.010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0:00:00.010" + "'", str2.equals("0:00:00.010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0157");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) (byte) 0, "0 0econ00");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 0econ00" + "'", str3.equals("0 0econ00"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0158");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, 0L, "P0Y0M0DT0H0M0.100S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.1003599990" + "'", str3.equals("P0Y0-10DT07430-10.1003599990"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0159");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P-1Y11M30DT23H59M59.990S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.99010" + "'", str3.equals("P-1Y11030DT23059059.99010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0160");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, 1L, "P0Y0M0DT0H0M0.001S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0011" + "'", str3.equals("P0Y000DT00000.0011"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0161");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (short) 10, "P-1Y11M30DT23H59M59.989S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9893599913" + "'", str3.equals("P-1Y11-130DT2374359-159.9893599913"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0162");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 'a', (long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.003S" + "'", str2.equals("P0Y0M0DT0H0M0.003S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0163");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) (byte) 10, "P0Y000DT00000.0350", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0164");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (short) 100, false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0165");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.033-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.033-1" + "'", str2.equals("P0Y000DT00000.033-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0166");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.01035");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.01035" + "'", str2.equals("P0Y000DT00000.01035"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0167");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (byte) 100, "P-1Y11M30DT23H59M59.910S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0168");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO(1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str1.equals("P0Y0M0DT0H0M0.001S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0169");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (short) 1, true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0170");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.010S" + "'", str1.equals("P0Y0M0DT0H0M0.010S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0171");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((-1L), false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0172");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.010S" + "'", str1.equals("P0Y0M0DT0H0M0.010S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0173");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords(0L, true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0174");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), 0L, "P0Y000DT00000.00110");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00110" + "'", str3.equals("P0Y000DT00000.00110"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0175");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) (short) 10, "0:00:00.010", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0176");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) 0, "P-1Y11-130DT2374359-159.9893599913");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9893599913" + "'", str3.equals("P-1Y11-130DT2374359-159.9893599913"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0177");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) ' ', "0:00:00.052");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.052" + "'", str3.equals("0:00:00.052"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0178");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.100" + "'", str1.equals("0:00:00.100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0179");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "0 0econ00");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0 0econ00" + "'", str2.equals("0 0econ00"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0180");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.097S" + "'", str1.equals("P0Y0M0DT0H0M0.097S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0181");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) (short) 100, "P-1Y11M30DT23H59M59.999S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0182");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "P00-1Y11M30DT23H59M59.999S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P00-1Y11030DT23059059.9990" + "'", str2.equals("P00-1Y11030DT23059059.9990"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0183");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) '4', false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0184");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (short) 1, "P0Y0M0DT0H0M0.003S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0185");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(100L, (long) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.901S" + "'", str2.equals("P-1Y11M30DT23H59M59.901S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0186");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 0, (long) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0187");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0000Y000DT00000.01010", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.01010" + "'", str3.equals("P0000Y000DT00000.01010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0188");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y0M0DT0H0M0.035S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0350" + "'", str3.equals("P0Y000DT00000.0350"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0189");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords(100L, true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0190");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (short) -1, false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0191");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "0:00:00.097", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.097" + "'", str3.equals("0:00:00.097"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0192");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 'a', false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0193");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 100, "P0Y000DT00000.001100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.001100" + "'", str3.equals("P0Y000DT00000.001100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0194");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, (long) (byte) 10, "P00-1Y11030DT23059059.99999");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.99999" + "'", str3.equals("P00-1Y11030DT23059059.99999"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0195");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (short) -1, "P0Y000DT00000.03310");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03310" + "'", str3.equals("P0Y000DT00000.03310"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0196");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, 0L, "P-1Y11030DT23059059.99010", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0197");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) -1, "P0Y0M0DT0H0M0.051S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0513599999" + "'", str3.equals("P0Y0-10DT07430-10.0513599999"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0198");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 100, (long) 100, "P-1Y11030DT23059059.90352", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0199");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "P0Y0M0DT0H0M0.100S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.10010" + "'", str2.equals("P0Y000DT00000.10010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0200");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.01035");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.01035" + "'", str2.equals("P0Y000DT00000.01035"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0201");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) (byte) 100, "P0000Y000DT00000.01032");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.01032" + "'", str3.equals("P0000Y000DT00000.01032"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0202");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.01052");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.01052" + "'", str2.equals("P0Y000DT00000.01052"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0203");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.99" + "'", str1.equals("0:00:00.99"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0204");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) -1, (long) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2.equals("P0Y0M0DT0H0M0.001S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0205");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords(10L, true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0206");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) -1, (long) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.053S" + "'", str2.equals("P0Y0M0DT0H0M0.053S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0207");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P0Y0M0DT0H0M0.097S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.097100" + "'", str3.equals("P0Y000DT00000.097100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0208");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P0Y0M0DT0H0M0.051S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0511" + "'", str2.equals("P0Y000DT00000.0511"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0209");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P0000Y000DT00000.01010", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.01010" + "'", str3.equals("P0000Y000DT00000.01010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0210");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) -1, 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.101S" + "'", str2.equals("P0Y0M0DT0H0M0.101S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0211");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P0Y0M0DT0H0M0.101S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.10135" + "'", str3.equals("P0Y000DT00000.10135"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0212");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) '4', (long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.958S" + "'", str2.equals("P-1Y11M30DT23H59M59.958S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0213");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 'a', (long) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.003S" + "'", str2.equals("P0Y0M0DT0H0M0.003S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0214");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(10L, (long) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.990S" + "'", str2.equals("P-1Y11M30DT23H59M59.990S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0215");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (-1L), "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0216");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y0-10DT07430-10.1003599990");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0-10DT07430-10.1003599990" + "'", str2.equals("P0Y0-10DT07430-10.1003599990"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0217");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 10, (long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.991S" + "'", str2.equals("P-1Y11M30DT23H59M59.991S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0218");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0219");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (byte) 0, "P0Y0M0DT0H0M0.032S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0323599990" + "'", str3.equals("P0Y0-10DT07430-10.0323599990"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0220");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', 100L, "P00-1Y11030DT23059059.9990");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.9990" + "'", str3.equals("P00-1Y11030DT23059059.9990"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0221");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y0M0DT0H0M0.000S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.00010" + "'", str2.equals("P0Y000DT00000.00010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0222");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) 'a', "0 30a086399", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0223");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 0, false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0224");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y0-10DT07430-10.0003599899");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0-10DT07430-10.0003599899" + "'", str2.equals("P0Y0-10DT07430-10.0003599899"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0225");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 100L, "0:00:00.001");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.001" + "'", str3.equals("0:00:00.001"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0226");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y0-10DT07430-10.0513599999", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0513599999" + "'", str3.equals("P0Y0-10DT07430-10.0513599999"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0227");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0000Y000DT00000.01010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.01010" + "'", str2.equals("P0000Y000DT00000.01010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0228");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (-1L), "P0Y0-10DT07430-10.0323599990", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0229");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y0M0DT0H0M0.001S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0010" + "'", str3.equals("P0Y000DT00000.0010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0230");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) 1, "P00-1Y11030DT23059059.99910", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0231");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.99" + "'", str1.equals("0:00:00.99"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0232");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P-1Y11030DT23059059.99010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.99010" + "'", str2.equals("P-1Y11030DT23059059.99010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0233");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P0Y0M0DT0H0M0.99S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.991" + "'", str3.equals("P0Y000DT00000.991"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0234");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "0:00:00.010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0:00:00.010" + "'", str2.equals("0:00:00.010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0235");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) '#', "P0000Y000DT00000.01010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.01010" + "'", str3.equals("P0000Y000DT00000.01010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0236");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 0, (long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2.equals("P0Y0M0DT0H0M0.001S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0237");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) (byte) 10, "P0Y000DT00000.10010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.10010" + "'", str3.equals("P0Y000DT00000.10010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0238");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) '4', "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y0M0DT0H0M0.051S" + "'", str3.equals("P0000Y0M0DT0H0M0.051S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0239");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 10, (long) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.990S" + "'", str2.equals("P-1Y11M30DT23H59M59.990S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0240");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "0 30a086399");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0 30a086399" + "'", str2.equals("0 30a086399"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0241");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 10, (long) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.989S" + "'", str2.equals("P-1Y11M30DT23H59M59.989S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0242");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y0M0DT0H0M0.032S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.03210" + "'", str2.equals("P0Y000DT00000.03210"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0243");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) (-1), "P0000Y000DT00000.01099");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.01099" + "'", str3.equals("P0000Y000DT00000.01099"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0244");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.03210", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03210" + "'", str3.equals("P0Y000DT00000.03210"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0245");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "0 0econ00");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0 0econ00" + "'", str2.equals("0 0econ00"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0246");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "0:00:00.032", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.032" + "'", str3.equals("0:00:00.032"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0247");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(0L, 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.100S" + "'", str2.equals("P0Y0M0DT0H0M0.100S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0248");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 1, false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0249");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, 0L, "P0Y0M0DT0H0M0.051S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0250");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (short) 0, false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0251");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "0 seconds");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0 0econ00" + "'", str2.equals("0 0econ00"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0252");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) 1, "P0Y0M0DT0H0M0.032S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0253");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.01052");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.01052" + "'", str2.equals("P0Y000DT00000.01052"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0254");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.00010", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00010" + "'", str3.equals("P0Y000DT00000.00010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0255");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) '4', "", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0256");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.000" + "'", str1.equals("0:00:00.000"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0257");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0000Y0M0DT0H0M0.051S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.0510" + "'", str3.equals("P0000Y000DT00000.0510"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0258");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.99S" + "'", str1.equals("P0Y0M0DT0H0M0.99S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0259");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 10, (long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.990S" + "'", str2.equals("P-1Y11M30DT23H59M59.990S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0260");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) 'a', "P00-1Y11030DT23059059.99910", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0261");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((-1L), true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0262");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "0:00:00.010", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.010" + "'", str3.equals("0:00:00.010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0263");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "0 seconds");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0 0econ00" + "'", str2.equals("0 0econ00"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0264");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) (short) 100, "P-1Y11M30DT23H59M59.910S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.91090" + "'", str3.equals("P-1Y11030DT23059059.91090"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0265");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((-1L), (long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2.equals("P0Y0M0DT0H0M0.001S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0266");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (short) 10, true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0267");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 100, (long) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.899S" + "'", str2.equals("P-1Y11M30DT23H59M59.899S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0268");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 10, (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.989S" + "'", str2.equals("P-1Y11M30DT23H59M59.989S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0269");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, 1L, "P0Y0M0DT0H0M0.003S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0033599991" + "'", str3.equals("P0Y0-10DT07430-10.0033599991"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0270");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(10L, 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.991S" + "'", str2.equals("P-1Y11M30DT23H59M59.991S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0271");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (byte) 10, true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0272");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, 0L, "P-1Y11M30DT23H59M59.903S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0273");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.010" + "'", str1.equals("0:00:00.010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0274");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.00110", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00110" + "'", str3.equals("P0Y000DT00000.00110"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0275");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P00-1Y11030DT23059059.9993", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.9993" + "'", str3.equals("P00-1Y11030DT23059059.9993"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0276");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (short) 10, true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0277");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (byte) -1, true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0278");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 0, (long) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.100S" + "'", str2.equals("P0Y0M0DT0H0M0.100S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0279");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) 100, "P0Y0-10DT07430-10.0003599899");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0003599899" + "'", str3.equals("P0Y0-10DT07430-10.0003599899"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0280");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (byte) 1, "0:00:00.000", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0281");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "P-1Y11-130DT2374359-159.9893599913", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9893599913" + "'", str3.equals("P-1Y11-130DT2374359-159.9893599913"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0282");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 10, "0:00:00.097");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0:00:00.097" + "'", str2.equals("0:00:00.097"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0283");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', 10L, "P0Y000DT00000.00110", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0284");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, 10L, "P0Y000DT00000.0010", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0285");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, (long) 'a', "P0Y0M0DT0H0M0.035S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0286");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (-1), "P0000Y0M0DT0H0M0.051S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.0510" + "'", str3.equals("P0000Y000DT00000.0510"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0287");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (short) 0, "0:00:00.052", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0288");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P0Y0M0DT0H0M0.033S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.03352" + "'", str2.equals("P0Y000DT00000.03352"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0289");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P00-1Y11030DT23059059.9993", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.9993" + "'", str3.equals("P00-1Y11030DT23059059.9993"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0290");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((-1L), (long) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0291");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y0-10DT07430-10.0323599990");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0-10DT07430-10.0323599990" + "'", str2.equals("P0Y0-10DT07430-10.0323599990"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0292");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y0M0DT0H0M0.99S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.99-1" + "'", str3.equals("P0Y000DT00000.99-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0293");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) '#', (long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.966S" + "'", str2.equals("P-1Y11M30DT23H59M59.966S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0294");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(0L, (long) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2.equals("P0Y0M0DT0H0M0.001S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0295");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS(1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.001" + "'", str1.equals("0:00:00.001"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0296");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, 100L, "P00-1Y11030DT23059059.9990", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0297");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0298");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.10010", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.10010" + "'", str3.equals("P0Y000DT00000.10010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0299");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P0Y0-10DT07430-10.0513599999", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0513599999" + "'", str3.equals("P0Y0-10DT07430-10.0513599999"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0300");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(0L, 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0301");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "0:00:00.99");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0:00:00.99" + "'", str2.equals("0:00:00.99"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0302");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, 100L, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0303");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str1.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0304");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (byte) 1, false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0305");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(0L, (long) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.999S" + "'", str2.equals("P-1Y11M30DT23H59M59.999S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0306");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P-1Y11M30DT23H59M59.910S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9100" + "'", str3.equals("P-1Y11030DT23059059.9100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0307");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y0-10DT07430-10.0003599899");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0-10DT07430-10.0003599899" + "'", str2.equals("P0Y0-10DT07430-10.0003599899"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0308");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P00-1Y11030DT23059059.9993");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P00-1Y11030DT23059059.9993" + "'", str2.equals("P00-1Y11030DT23059059.9993"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0309");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (byte) 0, "P-1Y11030DT23059059.99010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.99010" + "'", str3.equals("P-1Y11030DT23059059.99010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0310");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, 1L, "P0Y0M0DT0H0M0.000S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0000" + "'", str3.equals("P0Y000DT00000.0000"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0311");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (short) 100, "P0Y0-10DT07430-10.0033599991", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0312");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P00-1Y11030DT23059059.9993", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.9993" + "'", str3.equals("P00-1Y11030DT23059059.9993"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0313");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(0L, (long) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.999S" + "'", str2.equals("P-1Y11M30DT23H59M59.999S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0314");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (byte) 1, "P0Y0-10DT07430-10.1003599990");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.1003599990" + "'", str3.equals("P0Y0-10DT07430-10.1003599990"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0315");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (short) 100, true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0316");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (byte) -1, false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0317");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) (short) 100, "0:00:00.100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.100" + "'", str3.equals("0:00:00.100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0318");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.0010", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0010" + "'", str3.equals("P0Y000DT00000.0010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0319");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P-1Y11M30DT23H59M59.999S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9990" + "'", str3.equals("P-1Y11030DT23059059.9990"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0320");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y0M0DT0H0M0.99S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.99-1" + "'", str3.equals("P0Y000DT00000.99-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0321");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "0 days 0 hours 0 minutes 0 seconds", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 0a00 0 hour 0 0inute0 0 econ00" + "'", str3.equals("0 0a00 0 hour 0 0inute0 0 econ00"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0322");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P00-1Y11030DT23059059.99999", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.99999" + "'", str3.equals("P00-1Y11030DT23059059.99999"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0323");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords(0L, false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0324");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.052S" + "'", str1.equals("P0Y0M0DT0H0M0.052S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0325");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.100S" + "'", str1.equals("P0Y0M0DT0H0M0.100S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0326");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, (long) ' ', "P0Y0M0DT0H0M0.001S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0327");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "0:00:00.032", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.032" + "'", str3.equals("0:00:00.032"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0328");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), (long) 10, "P0Y0M0DT0H0M0.001S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00111" + "'", str3.equals("P0Y000DT00000.00111"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0329");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y000DT00000.01052");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.01052" + "'", str2.equals("P0Y000DT00000.01052"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0330");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "0 days", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 0a00" + "'", str3.equals("0 0a00"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0331");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, (long) (byte) 1, "P0Y0-10DT07430-10.1003599990");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.1003599990" + "'", str3.equals("P0Y0-10DT07430-10.1003599990"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0332");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P0Y0-10DT07430-10.0033599991");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0-10DT07430-10.0033599991" + "'", str2.equals("P0Y0-10DT07430-10.0033599991"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0333");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 'a', (long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.903S" + "'", str2.equals("P-1Y11M30DT23H59M59.903S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0334");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, (long) (-1), "P0Y0M0DT0H0M0.033S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0333599899" + "'", str3.equals("P0Y0-10DT07430-10.0333599899"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0335");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.010" + "'", str1.equals("0:00:00.010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0336");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y0M0DT0H0M0.100S" + "'", str3.equals("P0000Y0M0DT0H0M0.100S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0337");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 10, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y0M0DT0H0M0.010S" + "'", str3.equals("P0000Y0M0DT0H0M0.010S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0338");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 1, "P0Y0-10DT07430-10.0513599999", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0339");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) '4', "P-1Y11M30DT23H59M59.991S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0340");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) (short) 10, "P-1Y11030DT23059059.9901");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9901" + "'", str3.equals("P-1Y11030DT23059059.9901"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0341");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 100, (long) (byte) 10, "", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0342");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "0:00:00.035");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0:00:00.035" + "'", str2.equals("0:00:00.035"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0343");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P0Y0M0DT0H0M0.101S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.101-1" + "'", str2.equals("P0Y000DT00000.101-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0344");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P0Y0-10DT07430-10.0003599899");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0-10DT07430-10.0003599899" + "'", str2.equals("P0Y0-10DT07430-10.0003599899"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0345");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 1, 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.999S" + "'", str2.equals("P-1Y11M30DT23H59M59.999S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0346");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) '4', "0 30a086399", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0347");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P00-1Y11030DT23059059.99910", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.99910" + "'", str3.equals("P00-1Y11030DT23059059.99910"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0348");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y000DT00000.001100", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.001100" + "'", str3.equals("P0Y000DT00000.001100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0349");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P-1Y11030DT23059059.90352");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.90352" + "'", str2.equals("P-1Y11030DT23059059.90352"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0350");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', 100L, "P00-1Y11030DT23059059.9990", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0351");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, 1L, "P0Y0M0DT0H0M0.010S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0101" + "'", str3.equals("P0Y000DT00000.0101"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0352");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, (long) (short) 0, "", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0353");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, (long) (byte) 100, "P0000Y0M0DT0H0M0.100S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0354");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (short) 1, false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0355");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y0M0DT0H0M0.003S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0030" + "'", str2.equals("P0Y000DT00000.0030"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0356");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y000DT00000.99-1", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.99-1" + "'", str3.equals("P0Y000DT00000.99-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0357");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P0000Y0M0DT0H0M0.010S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.010-1" + "'", str2.equals("P0000Y000DT00000.010-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0358");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "P0000Y0M0DT0H0M0.100S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.10010" + "'", str2.equals("P0000Y000DT00000.10010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0359");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 10, 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.090S" + "'", str2.equals("P0Y0M0DT0H0M0.090S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0360");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "0:00:00.99", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.99" + "'", str3.equals("0:00:00.99"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0361");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, 0L, "0 0a00", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0362");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 1, (long) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.998S" + "'", str2.equals("P-1Y11M30DT23H59M59.998S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0363");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) (byte) 100, "P0Y000DT00000.051-1", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0364");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) ' ', (long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.968S" + "'", str2.equals("P-1Y11M30DT23H59M59.968S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0365");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', 0L, "P0000Y0M0DT0H0M0.010S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0366");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 100, 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.901S" + "'", str2.equals("P-1Y11M30DT23H59M59.901S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0367");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', 0L, "0:00:00.035", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0368");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 100, (long) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.901S" + "'", str2.equals("P-1Y11M30DT23H59M59.901S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0369");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0370");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) (byte) 100, "P0Y000DT00000.101-1", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0371");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y0M0DT0H0M0.010S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0100" + "'", str2.equals("P0Y000DT00000.0100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0372");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords(1L, true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0373");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, (long) (short) 10, "0:00:00.035");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.035" + "'", str3.equals("0:00:00.035"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0374");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y0M0DT0H0M0.001S" + "'", str2.equals("P0000Y0M0DT0H0M0.001S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0375");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 10, false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0376");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((-1L), (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0377");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 1L, "P0Y000DT00000.00010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00010" + "'", str3.equals("P0Y000DT00000.00010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0378");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) 10, "P0Y000DT00000.99-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.99-1" + "'", str3.equals("P0Y000DT00000.99-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0379");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) '4', false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0380");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str1.equals("P0Y0M0DT0H0M0.001S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0381");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P-1Y11M30DT23H59M59.968S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9681" + "'", str2.equals("P-1Y11030DT23059059.9681"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0382");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) (short) 10, "P0Y0M0DT0H0M0.003S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0039" + "'", str3.equals("P0Y000DT00000.0039"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0383");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(10L, 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.990S" + "'", str2.equals("P-1Y11M30DT23H59M59.990S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0384");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.0000", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0000" + "'", str3.equals("P0Y000DT00000.0000"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0385");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) 0, "P00-1Y11M30DT23H59M59.904S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11-130DT2374359-159.9043599990" + "'", str3.equals("P00-1Y11-130DT2374359-159.9043599990"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0386");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P-1Y11-130DT2374359-159.9893599913");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11-130DT2374359-159.9893599913" + "'", str2.equals("P-1Y11-130DT2374359-159.9893599913"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0387");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P-1Y11M30DT23H59M59.958S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9581" + "'", str2.equals("P-1Y11030DT23059059.9581"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0388");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) -1, (long) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.101S" + "'", str2.equals("P0Y0M0DT0H0M0.101S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0389");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 0, (long) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2.equals("P0Y0M0DT0H0M0.001S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0390");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y000DT00000.097100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.097100" + "'", str2.equals("P0Y000DT00000.097100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0391");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.00111");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.00111" + "'", str2.equals("P0Y000DT00000.00111"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0392");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) '#', (long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.975S" + "'", str2.equals("P-1Y11M30DT23H59M59.975S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0393");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) (short) 100, "P0Y000DT00000.0011");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0011" + "'", str3.equals("P0Y000DT00000.0011"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0394");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (short) 100, "0 30a059 0 hour 0 1439inute59 0 econ3059");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 30a059 0 hour 0 1439inute59 0 econ3059" + "'", str3.equals("0 30a059 0 hour 0 1439inute59 0 econ3059"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0395");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 1, true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0396");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "P-1Y11030DT23059059.9581", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9581" + "'", str3.equals("P-1Y11030DT23059059.9581"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0397");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) (short) 0, "P-1Y11030DT23059059.90352");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.90352" + "'", str3.equals("P-1Y11030DT23059059.90352"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0398");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P-1Y11030DT23059059.99010", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.99010" + "'", str3.equals("P-1Y11030DT23059059.99010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0399");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.001" + "'", str1.equals("0:00:00.001"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0400");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P0000Y0M0DT0H0M0.100S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.10035" + "'", str3.equals("P0000Y000DT00000.10035"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0401");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P-1Y11030DT23059059.9581", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9581" + "'", str3.equals("P-1Y11030DT23059059.9581"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0402");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, (long) (byte) 100, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0403");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "0:00:00.99", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.99" + "'", str3.equals("0:00:00.99"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0404");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(0L, (long) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2.equals("P0Y0M0DT0H0M0.001S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0405");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 100, 10L, "P0Y000DT00000.03211", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0406");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(10L, (long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0407");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) (short) 0, "P0Y000DT00000.03210", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0408");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, 100L, "P0Y0M0DT0H0M0.090S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0409");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0000Y0M0DT0H0M0.001S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.0011" + "'", str3.equals("P0000Y000DT00000.0011"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0410");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 10, (long) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.090S" + "'", str2.equals("P0Y0M0DT0H0M0.090S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0411");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P-1Y11030DT23059059.9100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9100" + "'", str2.equals("P-1Y11030DT23059059.9100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0412");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "P0000Y000DT00000.010-1", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.010-1" + "'", str3.equals("P0000Y000DT00000.010-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0413");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "0:00:00.99", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.99" + "'", str3.equals("0:00:00.99"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0414");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) (short) 0, "", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0415");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) '4', "P0Y000DT00000.0011");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0011" + "'", str3.equals("P0Y000DT00000.0011"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0416");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, 10L, "P00-1Y11030DT23059059.99910", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0417");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 100, (long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.910S" + "'", str2.equals("P-1Y11M30DT23H59M59.910S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0418");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0419");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0420");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P-1Y11M30DT23H59M59.968S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.968100" + "'", str3.equals("P-1Y11030DT23059059.968100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0421");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (byte) 1, "P0000Y000DT00000.10035", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0422");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P0000Y000DT00000.0510");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.0510" + "'", str2.equals("P0000Y000DT00000.0510"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0423");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P0Y0M0DT0H0M0.031S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0311" + "'", str3.equals("P0Y000DT00000.0311"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0424");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P-1Y11M30DT23H59M59.966S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.96610" + "'", str3.equals("P-1Y11030DT23059059.96610"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0425");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "0:00:00.001", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.001" + "'", str3.equals("0:00:00.001"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0426");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) ' ', false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0427");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) 100, "P0Y000DT00000.001100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.001100" + "'", str3.equals("P0Y000DT00000.001100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0428");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) (short) -1, "P0Y000DT00000.0101", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0429");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.0101", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0101" + "'", str3.equals("P0Y000DT00000.0101"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0430");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 10, (long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0431");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (short) -1, false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0432");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "0:00:00.035");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0:00:00.035" + "'", str2.equals("0:00:00.035"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0433");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, (long) '#', "P-1Y11030DT23059059.96610", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0434");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P-1Y11M30DT23H59M59.999S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9991" + "'", str2.equals("P-1Y11030DT23059059.9991"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0435");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (-1), (long) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.101S" + "'", str2.equals("P0Y0M0DT0H0M0.101S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0436");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P0Y000DT00000.10135", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.10135" + "'", str3.equals("P0Y000DT00000.10135"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0437");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 100, true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0438");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P-1Y11M30DT23H59M59.958S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9581" + "'", str3.equals("P-1Y11030DT23059059.9581"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0439");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P-1Y11030DT23059059.99010", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.99010" + "'", str3.equals("P-1Y11030DT23059059.99010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0440");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P0000Y000DT00000.01032", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.01032" + "'", str3.equals("P0000Y000DT00000.01032"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0441");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y0-10DT07430-10.0013599947", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0013599947" + "'", str3.equals("P0Y0-10DT07430-10.0013599947"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0442");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (short) 1, true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0443");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) 10, "P0000Y0M0DT0H0M0.010S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0444");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 10, (long) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.090S" + "'", str2.equals("P0Y0M0DT0H0M0.090S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0445");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 1, (long) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.096S" + "'", str2.equals("P0Y0M0DT0H0M0.096S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0446");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) '#', false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0447");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, 100L, "P0Y0M0DT0H0M0.053S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0448");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) (byte) -1, "P0Y000DT00000.051-1", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0449");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, (long) (byte) 10, "P0Y000DT00000.0039", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0450");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "0:00:00.035", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.035" + "'", str3.equals("0:00:00.035"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0451");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y0M0DT0H0M0.010S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.01032" + "'", str3.equals("P0Y000DT00000.01032"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0452");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, 0L, "P0Y0-10DT07430-10.0333599899");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0333599899" + "'", str3.equals("P0Y0-10DT07430-10.0333599899"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0453");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y000DT00000.01032");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.01032" + "'", str2.equals("P0Y000DT00000.01032"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0454");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "0:00:00.010", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.010" + "'", str3.equals("0:00:00.010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0455");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.03211");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.03211" + "'", str2.equals("P0Y000DT00000.03211"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0456");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y0M0DT0H0M0.033S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0330" + "'", str3.equals("P0Y000DT00000.0330"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0457");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(100L, 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.910S" + "'", str2.equals("P-1Y11M30DT23H59M59.910S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0458");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.0100", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0100" + "'", str3.equals("P0Y000DT00000.0100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0459");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 10, 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.090S" + "'", str2.equals("P0Y0M0DT0H0M0.090S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0460");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) '4', true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0461");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P0000Y000DT00000.01032", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.01032" + "'", str3.equals("P0000Y000DT00000.01032"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0462");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) ' ', true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0463");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.035S" + "'", str1.equals("P0Y0M0DT0H0M0.035S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0464");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y0-10DT07430-10.0333599899", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0333599899" + "'", str3.equals("P0Y0-10DT07430-10.0333599899"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0465");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P00-1Y11030DT23059059.99910");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P00-1Y11030DT23059059.99910" + "'", str2.equals("P00-1Y11030DT23059059.99910"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0466");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(0L, (long) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.100S" + "'", str2.equals("P0Y0M0DT0H0M0.100S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0467");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (short) 100, false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0468");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "P-1Y11M30DT23H59M59.968S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9681" + "'", str3.equals("P-1Y11030DT23059059.9681"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0469");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.100S" + "'", str1.equals("P0Y0M0DT0H0M0.100S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0470");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P00-1Y11030DT23059059.9993");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P00-1Y11030DT23059059.9993" + "'", str2.equals("P00-1Y11030DT23059059.9993"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0471");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y0M0DT0H0M0.096S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.09632" + "'", str2.equals("P0Y000DT00000.09632"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0472");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, 10L, "P0Y000DT00000.01052");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.01052" + "'", str3.equals("P0Y000DT00000.01052"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0473");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P00-1Y11030DT23059059.9993");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P00-1Y11030DT23059059.9993" + "'", str2.equals("P00-1Y11030DT23059059.9993"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0474");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords(100L, false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0475");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "0:00:00.100", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.100" + "'", str3.equals("0:00:00.100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0476");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P-1Y11030DT23059059.90352");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.90352" + "'", str2.equals("P-1Y11030DT23059059.90352"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0477");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P0Y000DT00000.001100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.001100" + "'", str2.equals("P0Y000DT00000.001100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0478");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, (long) (byte) 100, "P-1Y11030DT23059059.9901");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9901" + "'", str3.equals("P-1Y11030DT23059059.9901"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0479");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) ' ', "P0000Y0M0DT0H0M0.010S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0480");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, (long) (short) 100, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0481");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P-1Y11030DT23059059.9991");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9991" + "'", str2.equals("P-1Y11030DT23059059.9991"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0482");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) 'a', "P00-1Y11-130DT2374359-159.9043599990", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0483");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 100, 1L, "0:00:00.032");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.032" + "'", str3.equals("0:00:00.032"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0484");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(1L, 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.999S" + "'", str2.equals("P-1Y11M30DT23H59M59.999S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0485");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.99" + "'", str1.equals("0:00:00.99"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0486");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (byte) 10, "P0Y000DT00000.033-1", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0487");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, 0L, "P-1Y11030DT23059059.9681", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0488");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((-1L), (long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.101S" + "'", str2.equals("P0Y0M0DT0H0M0.101S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0489");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P-1Y11M30DT23H59M59.990S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9900" + "'", str3.equals("P-1Y11030DT23059059.9900"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0490");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) (short) 0, "P0000Y0M0DT0H0M0.010S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y0-10DT07430-10.0103599965" + "'", str3.equals("P0000Y0-10DT07430-10.0103599965"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0491");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "0 30a086399", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 30a086399" + "'", str3.equals("0 30a086399"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0492");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "P00-1Y11030DT23059059.9990");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P00-1Y11030DT23059059.9990" + "'", str2.equals("P00-1Y11030DT23059059.9990"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0493");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y000DT00000.0350", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0350" + "'", str3.equals("P0Y000DT00000.0350"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0494");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "P0Y0M0DT0H0M0.031S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0310" + "'", str3.equals("P0Y000DT00000.0310"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0495");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((-1L), (long) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", str2.equals("P0Y0M0DT0H0M0.002S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0496");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 100, 0L, "P-1Y11M30DT23H59M59.966S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9663599900" + "'", str3.equals("P-1Y11-130DT2374359-159.9663599900"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0497");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 0, (long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.010S" + "'", str2.equals("P0Y0M0DT0H0M0.010S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0498");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 100, "P-1Y11M30DT23H59M59.990S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0499");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 10, (long) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.042S" + "'", str2.equals("P0Y0M0DT0H0M0.042S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test0500");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y0-10DT07430-10.0323599990", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0323599990" + "'", str3.equals("P0Y0-10DT07430-10.0323599990"));
    }
}

