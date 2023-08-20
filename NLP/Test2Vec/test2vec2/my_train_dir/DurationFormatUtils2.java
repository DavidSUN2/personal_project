
package DurationFormatUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DurationFormatUtils2 {

    public static boolean debug = false;

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1001");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y0M0DT0H0M0.99S" + "'", str2.equals("P0000Y0M0DT0H0M0.99S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1002");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) ' ', "0:00:00.001");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.001" + "'", str3.equals("0:00:00.001"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1003");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, (long) 'a', "P0Y0M0DT0H0M0.031S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03196" + "'", str3.equals("P0Y000DT00000.03196"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1004");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) ' ', "0 0a00", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1005");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y0M0DT0H0M0.042S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0420" + "'", str2.equals("P0Y000DT00000.0420"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1006");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), (long) 100, "P0Y0M0DT0H0M0.031S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1007");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, (long) (-1), "", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1008");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, 0L, "P-1Y11030DT23059059.9000", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1009");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y000DT00000.00310", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00310" + "'", str3.equals("P0Y000DT00000.00310"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1010");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) (byte) 0, "P0000Y000DT00000.010-1", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1011");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (-1), "P-1Y11-130DT2374359-159.9983599903", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1012");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y000DT00000.00210");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.00210" + "'", str2.equals("P0Y000DT00000.00210"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1013");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "P00-1Y11030DT23059059.99999", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.99999" + "'", str3.equals("P00-1Y11030DT23059059.99999"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1014");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P0Y0M0DT0H0M0.099S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.099-1" + "'", str2.equals("P0Y000DT00000.099-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1015");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P0Y000DT00000.03310", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03310" + "'", str3.equals("P0Y000DT00000.03310"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1016");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.03196");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.03196" + "'", str2.equals("P0Y000DT00000.03196"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1017");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (-1), (long) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1018");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0000Y000DT00000.0100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.0100" + "'", str2.equals("P0000Y000DT00000.0100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1019");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 10, false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1020");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 10, (long) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.090S" + "'", str2.equals("P0Y0M0DT0H0M0.090S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1021");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) (short) 100, "P-1Y11030DT23059059.952100", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1022");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (short) 100, "P0Y000DT00000.051-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.051-1" + "'", str3.equals("P0Y000DT00000.051-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1023");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 100, (long) 10, "P-1Y11-130DT2374359-159.9893599913");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9893599913" + "'", str3.equals("P-1Y11-130DT2374359-159.9893599913"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1024");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) (short) 0, "P00-1Y11030DT23059059.9990");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.9990" + "'", str3.equals("P00-1Y11030DT23059059.9990"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1025");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y000DT00000.10135", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.10135" + "'", str3.equals("P0Y000DT00000.10135"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1026");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.0039");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0039" + "'", str2.equals("P0Y000DT00000.0039"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1027");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y0-10DT07430-10.0003599899", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0003599899" + "'", str3.equals("P0Y0-10DT07430-10.0003599899"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1028");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, 0L, "P0000Y0-10DT07430-10.0013599969", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1029");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) '#', "", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1030");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, (-1L), "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1031");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 10, (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.022S" + "'", str2.equals("P0Y0M0DT0H0M0.022S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1032");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) 100, "P0Y0M0DT0H0M0.000S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00099" + "'", str3.equals("P0Y000DT00000.00099"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1033");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (-1L), "P0Y000DT00000.0330", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1034");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 1, (long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1035");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 'a', (long) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.902S" + "'", str2.equals("P-1Y11M30DT23H59M59.902S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1036");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "0 0a00 0 hour 0 0inute0 0 econ00", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 0a00 0 hour 0 0inute0 0 econ00" + "'", str3.equals("0 0a00 0 hour 0 0inute0 0 econ00"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1037");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (short) 100, "0 86399econ3086399");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 86399econ3086399" + "'", str3.equals("0 86399econ3086399"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1038");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "P0Y000DT00000.099-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.099-1" + "'", str2.equals("P0Y000DT00000.099-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1039");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0000Y000DT00000.051100", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.051100" + "'", str3.equals("P0000Y000DT00000.051100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1040");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) 1, "P0000Y000DT00000.01010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.01010" + "'", str3.equals("P0000Y000DT00000.01010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1041");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) '4', (long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.958S" + "'", str2.equals("P-1Y11M30DT23H59M59.958S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1042");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (short) 0, true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1043");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) 10, "P0Y0M0DT0H0M0.001S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1044");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P-1Y11030DT23059059.952100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.952100" + "'", str2.equals("P-1Y11030DT23059059.952100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1045");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P-1Y11030DT23059059.91090");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.91090" + "'", str2.equals("P-1Y11030DT23059059.91090"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1046");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords(10L, false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1047");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "P-1Y11030DT23059059.99097", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.99097" + "'", str3.equals("P-1Y11030DT23059059.99097"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1048");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) ' ', (long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.978S" + "'", str2.equals("P-1Y11M30DT23H59M59.978S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1049");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(100L, (long) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.900S" + "'", str2.equals("P-1Y11M30DT23H59M59.900S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1050");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.09690", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.09690" + "'", str3.equals("P0Y000DT00000.09690"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1051");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (byte) 100, false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1052");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1053");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (byte) 1, "P-1Y11M30DT23H59M59.990S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9902" + "'", str3.equals("P-1Y11030DT23059059.9902"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1054");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "0 86399econ3086399");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0 86399econ3086399" + "'", str2.equals("0 86399econ3086399"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1055");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P0Y0M0DT0H0M0.090S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.09052" + "'", str2.equals("P0Y000DT00000.09052"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1056");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "P0000Y000DT00000.01032", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.01032" + "'", str3.equals("P0000Y000DT00000.01032"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1057");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y0M0DT0H0M0.033S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.033-1" + "'", str3.equals("P0Y000DT00000.033-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1058");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', (long) (short) 10, "P0Y0-10DT07430-10.0103599991");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0103599991" + "'", str3.equals("P0Y0-10DT07430-10.0103599991"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1059");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y0M0DT0H0M0.032S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0320" + "'", str2.equals("P0Y000DT00000.0320"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1060");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (short) -1, "P0Y000DT00000.0031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0031" + "'", str3.equals("P0Y000DT00000.0031"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1061");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) 'a', "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1062");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (-1), (long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", str2.equals("P0Y0M0DT0H0M0.002S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1063");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "0 seconds", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 0econ00" + "'", str3.equals("0 0econ00"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1064");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0000Y000DT00000.010100", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.010100" + "'", str3.equals("P0000Y000DT00000.010100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1065");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P-1Y11M30DT23H59M59.966S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9660" + "'", str2.equals("P-1Y11030DT23059059.9660"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1066");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, 1L, "P0Y000DT00000.03211", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1067");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) (byte) 1, "P-1Y11030DT23059059.9890", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1068");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "P-1Y11M30DT23H59M59.989S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.989100" + "'", str2.equals("P-1Y11030DT23059059.989100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1069");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) -1, 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2.equals("P0Y0M0DT0H0M0.001S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1070");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P-1Y11030DT23059059.93252");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.93252" + "'", str2.equals("P-1Y11030DT23059059.93252"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1071");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(0L, (long) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1072");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P00-1Y11030DT23059059.9042", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.9042" + "'", str3.equals("P00-1Y11030DT23059059.9042"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1073");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) (byte) 100, "P0Y0-10DT07430-10.0333599899", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1074");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P0Y0M0DT0H0M0.065S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.06535" + "'", str3.equals("P0Y000DT00000.06535"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1075");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, (long) 10, "P0000Y0M0DT0H0M0.99S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y0-10DT07430-10.993599910" + "'", str3.equals("P0000Y0-10DT07430-10.993599910"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1076");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1077");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) '4', "P0Y0M0DT0H0M0.001S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00153" + "'", str3.equals("P0Y000DT00000.00153"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1078");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) 'a', "0 days", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1079");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 100, 10L, "P0Y000DT00000.0350");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0350" + "'", str3.equals("P0Y000DT00000.0350"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1080");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "0:00:00.097");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0:00:00.097" + "'", str2.equals("0:00:00.097"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1081");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) 1, "P0Y0-10DT07430-10.0513599999", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1082");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y0M0DT0H0M0.000S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.000-1" + "'", str3.equals("P0Y000DT00000.000-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1083");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P-1Y11030DT23059059.9689", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9689" + "'", str3.equals("P-1Y11030DT23059059.9689"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1084");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) 10, "P0Y0M0DT0H0M0.002S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00211" + "'", str3.equals("P0Y000DT00000.00211"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1085");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (-1), "P0Y0M0DT0H0M0.011S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1086");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 'a', false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1087");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, (long) (byte) 100, "P-1Y11030DT23059059.9661", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1088");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.0320");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0320" + "'", str2.equals("P0Y000DT00000.0320"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1089");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', (long) (byte) 10, "P0Y0-10DT07430-10.0033599991", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1090");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1091");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.00210", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00210" + "'", str3.equals("P0Y000DT00000.00210"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1092");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 100, (long) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.900S" + "'", str2.equals("P-1Y11M30DT23H59M59.900S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1093");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P0Y0M0DT0H0M0.090S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.09010" + "'", str3.equals("P0Y000DT00000.09010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1094");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.00111", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00111" + "'", str3.equals("P0Y000DT00000.00111"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1095");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) ' ', (long) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.969S" + "'", str2.equals("P-1Y11M30DT23H59M59.969S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1096");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (short) 0, "P0000Y000DT00000.01052");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.01052" + "'", str3.equals("P0000Y000DT00000.01052"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1097");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 'a', (long) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.904S" + "'", str2.equals("P-1Y11M30DT23H59M59.904S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1098");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) 'a', "P-1Y11M30DT23H59M59.910S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1099");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, (long) 10, "P0Y000DT00000.03352", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1100");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, (long) (short) 0, "P0Y0M0DT0H0M0.000S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0003599990" + "'", str3.equals("P0Y0-10DT07430-10.0003599990"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1101");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y000DT00000.0350");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0350" + "'", str2.equals("P0Y000DT00000.0350"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1102");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) (short) 1, "P0Y000DT00000.00211");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00211" + "'", str3.equals("P0Y000DT00000.00211"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1103");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, 1L, "P00-1Y11030DT23059059.9993");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.9993" + "'", str3.equals("P00-1Y11030DT23059059.9993"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1104");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, 0L, "P0Y000DT00000.033-1", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1105");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1106");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', 100L, "P-1Y11030DT23059059.9131");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9131" + "'", str3.equals("P-1Y11030DT23059059.9131"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1107");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 10L, "0 seconds", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1108");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) (short) 100, "P00-1Y11-130DT2374359-159.9043599990");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11-130DT2374359-159.9043599990" + "'", str3.equals("P00-1Y11-130DT2374359-159.9043599990"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1109");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P-1Y11M30DT23H59M59.903S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9031" + "'", str3.equals("P-1Y11030DT23059059.9031"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1110");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 100, 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.900S" + "'", str2.equals("P-1Y11M30DT23H59M59.900S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1111");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, (long) (-1), "P0Y000DT00000.10110", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1112");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P-1Y11030DT23059059.989100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.989100" + "'", str2.equals("P-1Y11030DT23059059.989100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1113");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) (short) 100, "P0Y0M0DT0H0M0.097S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1114");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, (long) (-1), "P-1Y11030DT23059059.96610");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.96610" + "'", str3.equals("P-1Y11030DT23059059.96610"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1115");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (-1L), "P0Y0M0DT0H0M0.035S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1116");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 10, (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.022S" + "'", str2.equals("P0Y0M0DT0H0M0.022S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1117");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0000Y000DT00000.010-1", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.010-1" + "'", str3.equals("P0000Y000DT00000.010-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1118");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (byte) 0, "0 days", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1119");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 100, (-1L), "P0Y0M0DT0H0M0.000S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0003599899" + "'", str3.equals("P0Y0-10DT07430-10.0003599899"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1120");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, 0L, "P-1Y11M30DT23H59M59.952S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1121");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P0Y0M0DT0H0M0.033S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.03335" + "'", str2.equals("P0Y000DT00000.03335"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1122");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y000DT00000.00153");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.00153" + "'", str2.equals("P0Y000DT00000.00153"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1123");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0000Y000DT00000.01010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.01010" + "'", str2.equals("P0000Y000DT00000.01010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1124");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P0Y0M0DT0H0M0.087S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.087100" + "'", str3.equals("P0Y000DT00000.087100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1125");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y0M0DT0H0M0.032S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03297" + "'", str3.equals("P0Y000DT00000.03297"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1126");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P0Y0M0DT0H0M0.065S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.065100" + "'", str3.equals("P0Y000DT00000.065100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1127");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "P0Y000DT00000.0039");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0039" + "'", str2.equals("P0Y000DT00000.0039"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1128");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, 100L, "", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1129");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 1, (long) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.051S" + "'", str2.equals("P0Y0M0DT0H0M0.051S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1130");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 0, (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.032S" + "'", str2.equals("P0Y0M0DT0H0M0.032S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1131");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1132");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (byte) 10, "P0Y000DT00000.03352");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03352" + "'", str3.equals("P0Y000DT00000.03352"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1133");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P0000Y0-10DT07430-10.993599910", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y0-10DT07430-10.993599910" + "'", str3.equals("P0000Y0-10DT07430-10.993599910"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1134");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, (long) (-1), "P0Y0M0DT0H0M0.101S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1135");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P00-1Y11030DT23059059.999100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P00-1Y11030DT23059059.999100" + "'", str2.equals("P00-1Y11030DT23059059.999100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1136");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "0:00:00.000");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0:00:00.000" + "'", str2.equals("0:00:00.000"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1137");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 100L, "P0Y0M0DT0H0M0.101S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1138");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 10, "P-1Y11M30DT23H59M59.998S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.99810" + "'", str2.equals("P-1Y11030DT23059059.99810"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1139");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y0M0DT0H0M0.087S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0870" + "'", str3.equals("P0Y000DT00000.0870"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1140");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "0:00:00.100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0:00:00.100" + "'", str2.equals("0:00:00.100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1141");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y000DT00000.03211");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.03211" + "'", str2.equals("P0Y000DT00000.03211"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1142");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P-1Y11M30DT23H59M59.932S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.93235" + "'", str3.equals("P-1Y11030DT23059059.93235"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1143");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P-1Y11030DT23059059.98910", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.98910" + "'", str3.equals("P-1Y11030DT23059059.98910"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1144");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.001100", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.001100" + "'", str3.equals("P0Y000DT00000.001100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1145");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.032-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.032-1" + "'", str2.equals("P0Y000DT00000.032-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1146");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) 0, "P-1Y11M30DT23H59M59.902S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1147");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P-1Y11030DT23059059.9750", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9750" + "'", str3.equals("P-1Y11030DT23059059.9750"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1148");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) '#', "P-1Y11M30DT23H59M59.952S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.95234" + "'", str3.equals("P-1Y11030DT23059059.95234"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1149");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (byte) 100, false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1150");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) (byte) -1, "P-1Y11-130DT2374359-159.9663599900");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9663599900" + "'", str3.equals("P-1Y11-130DT2374359-159.9663599900"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1151");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P-1Y11-130DT2374359-159.9663599900");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11-130DT2374359-159.9663599900" + "'", str2.equals("P-1Y11-130DT2374359-159.9663599900"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1152");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (short) 1, "", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1153");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 10, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1154");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 1, "P0Y000DT00000.032-1", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1155");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P-1Y11M30DT23H59M59.903S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9030" + "'", str2.equals("P-1Y11030DT23059059.9030"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1156");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P-1Y11-130DT2374359-159.9893599913");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11-130DT2374359-159.9893599913" + "'", str2.equals("P-1Y11-130DT2374359-159.9893599913"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1157");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, 0L, "P-1Y11030DT23059059.952-1", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1158");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "P00-1Y11030DT23059059.99999");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P00-1Y11030DT23059059.99999" + "'", str2.equals("P00-1Y11030DT23059059.99999"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1159");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) 100, "P0Y000DT00000.101-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.101-1" + "'", str3.equals("P0Y000DT00000.101-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1160");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) (short) 100, "P-1Y11M30DT23H59M59.999S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9990" + "'", str3.equals("P-1Y11030DT23059059.9990"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1161");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) -1, (long) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1162");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 1, (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.998S" + "'", str2.equals("P-1Y11M30DT23H59M59.998S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1163");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0000Y0M0DT0H0M0.99S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.9910" + "'", str2.equals("P0000Y000DT00000.9910"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1164");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 100, (long) (short) -1, "P-1Y11M30DT23H59M59.998S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1165");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, 1L, "P0Y000DT00000.00152");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00152" + "'", str3.equals("P0Y000DT00000.00152"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1166");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), (long) 100, "P0Y0-10DT07430-10.0003599899", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1167");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) (byte) 10, "P0Y000DT00000.05110");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.05110" + "'", str3.equals("P0Y000DT00000.05110"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1168");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) -1, (long) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.101S" + "'", str2.equals("P0Y0M0DT0H0M0.101S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1169");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) (-1), "P-1Y11M30DT23H59M59.910S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9103599998" + "'", str3.equals("P-1Y11-130DT2374359-159.9103599998"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1170");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.03335", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03335" + "'", str3.equals("P0Y000DT00000.03335"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1171");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P-1Y11-130DT2374359-159.9323599900", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9323599900" + "'", str3.equals("P-1Y11-130DT2374359-159.9323599900"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1172");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y000DT00000.042100", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.042100" + "'", str3.equals("P0Y000DT00000.042100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1173");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 1, false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1174");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) (short) -1, "0 86399econ3086399");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 86399econ3086399" + "'", str3.equals("0 86399econ3086399"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1175");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 100, 100L, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1176");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P00-1Y11030DT23059059.9990", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.9990" + "'", str3.equals("P00-1Y11030DT23059059.9990"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1177");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (byte) 0, true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1178");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) (short) 10, "P-1Y11030DT23059059.9661", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1179");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P0Y000DT00000.00111", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00111" + "'", str3.equals("P0Y000DT00000.00111"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1180");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y0-10DT07430-10.0003599899");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0-10DT07430-10.0003599899" + "'", str2.equals("P0Y0-10DT07430-10.0003599899"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1181");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P0Y000DT00000.09010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.09010" + "'", str2.equals("P0Y000DT00000.09010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1182");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "0 days");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0 0a00" + "'", str2.equals("0 0a00"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1183");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 1, (long) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.034S" + "'", str2.equals("P0Y0M0DT0H0M0.034S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1184");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P0Y000DT00000.042100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.042100" + "'", str2.equals("P0Y000DT00000.042100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1185");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', 0L, "P-1Y11030DT23059059.901-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.901-1" + "'", str3.equals("P-1Y11030DT23059059.901-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1186");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) (byte) -1, "P0Y000DT00000.09052");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.09052" + "'", str3.equals("P0Y000DT00000.09052"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1187");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) 10, "P0Y000DT00000.03196", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1188");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) -1, (long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2.equals("P0Y0M0DT0H0M0.001S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1189");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, (long) '#', "P-1Y11030DT23059059.9902", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1190");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 100, (long) (short) 10, "P-1Y11M30DT23H59M59.958S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1191");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) 'a', "P0Y000DT00000.03133");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03133" + "'", str3.equals("P0Y000DT00000.03133"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1192");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.0659");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0659" + "'", str2.equals("P0Y000DT00000.0659"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1193");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P00-1Y11030DT23059059.99999");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P00-1Y11030DT23059059.99999" + "'", str2.equals("P00-1Y11030DT23059059.99999"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1194");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) (byte) 10, "P0Y000DT00000.0870", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1195");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) (byte) -1, "P00-1Y11M30DT23H59M59.904S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1196");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 100, (long) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1197");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(100L, (long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.901S" + "'", str2.equals("P-1Y11M30DT23H59M59.901S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1198");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "P0Y0-10DT07430-10.0003599990");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0-10DT07430-10.0003599990" + "'", str2.equals("P0Y0-10DT07430-10.0003599990"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1199");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "P-1Y11030DT23059059.9031", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9031" + "'", str3.equals("P-1Y11030DT23059059.9031"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1200");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) 'a', "P-1Y11030DT23059059.952-1", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1201");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', (long) 100, "P0000Y0M0DT0H0M0.001S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1202");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) 'a', "P-1Y11M30DT23H59M59.990S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9900" + "'", str3.equals("P-1Y11030DT23059059.9900"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1203");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "P0Y000DT00000.05110", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.05110" + "'", str3.equals("P0Y000DT00000.05110"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1204");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, (long) (byte) 0, "P0Y000DT00000.0870");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0870" + "'", str3.equals("P0Y000DT00000.0870"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1205");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 'a', 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.913S" + "'", str2.equals("P-1Y11M30DT23H59M59.913S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1206");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "0:00:00.001");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0:00:00.001" + "'", str2.equals("0:00:00.001"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1207");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P-1Y11030DT23059059.8991", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.8991" + "'", str3.equals("P-1Y11030DT23059059.8991"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1208");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, 0L, "P-1Y11030DT23059059.9901");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9901" + "'", str3.equals("P-1Y11030DT23059059.9901"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1209");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, (long) 'a', "P0Y0M0DT0H0M0.065S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.06587" + "'", str3.equals("P0Y000DT00000.06587"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1210");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) -1, (long) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1211");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) (byte) 100, "P0Y0M0DT0H0M0.090S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1212");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "P00-1Y11M30DT23H59M59.999S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.9991" + "'", str3.equals("P00-1Y11030DT23059059.9991"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1213");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) '#', (long) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.965S" + "'", str2.equals("P-1Y11M30DT23H59M59.965S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1214");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (byte) 0, "P0Y000DT00000.09690");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.09690" + "'", str3.equals("P0Y000DT00000.09690"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1215");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) (short) 0, "P0000Y0M0DT0H0M0.99S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1216");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.03133", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03133" + "'", str3.equals("P0Y000DT00000.03133"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1217");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 100, (long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.900S" + "'", str2.equals("P-1Y11M30DT23H59M59.900S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1218");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 100, (long) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.901S" + "'", str2.equals("P-1Y11M30DT23H59M59.901S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1219");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) ' ', "P0Y0M0DT0H0M0.090S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0903599997" + "'", str3.equals("P0Y0-10DT07430-10.0903599997"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1220");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) 0, "P0Y000DT00000.0320");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0320" + "'", str3.equals("P0Y000DT00000.0320"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1221");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), (long) 10, "P0Y000DT00000.097100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.097100" + "'", str3.equals("P0Y000DT00000.097100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1222");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) (short) 10, "P0Y000DT00000.05110");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.05110" + "'", str3.equals("P0Y000DT00000.05110"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1223");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P0Y0M0DT0H0M0.032S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.032100" + "'", str3.equals("P0Y000DT00000.032100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1224");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P-1Y11030DT23059059.968100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.968100" + "'", str2.equals("P-1Y11030DT23059059.968100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1225");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "P-1Y11M30DT23H59M59.900S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.90010" + "'", str3.equals("P-1Y11030DT23059059.90010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1226");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) (byte) 10, "P-1Y11030DT23059059.901-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.901-1" + "'", str3.equals("P-1Y11030DT23059059.901-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1227");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P-1Y11M30DT23H59M59.966S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.96610" + "'", str2.equals("P-1Y11030DT23059059.96610"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1228");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 1, "P-1Y11030DT23059059.9660", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1229");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.033-1", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.033-1" + "'", str3.equals("P0Y000DT00000.033-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1230");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) '4', "P0Y000DT00000.0350", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1231");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) -1, (long) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1232");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) -1, (long) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.101S" + "'", str2.equals("P0Y0M0DT0H0M0.101S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1233");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) 0, "P0Y000DT00000.03133");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03133" + "'", str3.equals("P0Y000DT00000.03133"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1234");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) ' ', (long) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.020S" + "'", str2.equals("P0Y0M0DT0H0M0.020S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1235");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P0Y000DT00000.10135", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.10135" + "'", str3.equals("P0Y000DT00000.10135"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1236");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "0 seconds");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0 0econ00" + "'", str2.equals("0 0econ00"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1237");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y000DT00000.0659", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0659" + "'", str3.equals("P0Y000DT00000.0659"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1238");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y0-10DT07430-10.0103599991");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0-10DT07430-10.0103599991" + "'", str2.equals("P0Y0-10DT07430-10.0103599991"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1239");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.09052", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.09052" + "'", str3.equals("P0Y000DT00000.09052"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1240");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.03196");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.03196" + "'", str2.equals("P0Y000DT00000.03196"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1241");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) (-1), "P0Y0M0DT0H0M0.035S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1242");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, 100L, "0:00:00.100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.100" + "'", str3.equals("0:00:00.100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1243");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y0M0DT0H0M0.052S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.052100" + "'", str3.equals("P0Y000DT00000.052100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1244");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P0Y0M0DT0H0M0.096S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.096-1" + "'", str3.equals("P0Y000DT00000.096-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1245");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) '4', (long) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.983S" + "'", str2.equals("P-1Y11M30DT23H59M59.983S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1246");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.031-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.031-1" + "'", str2.equals("P0Y000DT00000.031-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1247");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, 10L, "P0Y0M0DT0H0M0.032S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0329" + "'", str3.equals("P0Y000DT00000.0329"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1248");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (short) 100, "P00-1Y11M30DT23H59M59.999S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.999101" + "'", str3.equals("P00-1Y11030DT23059059.999101"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1249");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) ' ', 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.978S" + "'", str2.equals("P-1Y11M30DT23H59M59.978S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1250");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', (long) '4', "", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1251");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) (short) 100, "P00-1Y11030DT23059059.999-1", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1252");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) '#', (long) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.964S" + "'", str2.equals("P-1Y11M30DT23H59M59.964S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1253");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) 100, "P0Y000DT00000.00153");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00153" + "'", str3.equals("P0Y000DT00000.00153"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1254");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) '#', (long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.975S" + "'", str2.equals("P-1Y11M30DT23H59M59.975S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1255");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P-1Y11030DT23059059.99097");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.99097" + "'", str2.equals("P-1Y11030DT23059059.99097"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1256");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) (short) -1, "P0Y000DT00000.0329");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0329" + "'", str3.equals("P0Y000DT00000.0329"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1257");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y0M0DT0H0M0.087S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0871" + "'", str3.equals("P0Y000DT00000.0871"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1258");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, (long) (short) 100, "P0000Y0-10DT07430-10.0013599969");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y0-10DT07430-10.0013599969" + "'", str3.equals("P0000Y0-10DT07430-10.0013599969"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1259");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.0100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0100" + "'", str2.equals("P0Y000DT00000.0100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1260");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.00097", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00097" + "'", str3.equals("P0Y000DT00000.00097"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1261");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "0:00:00.001");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0:00:00.001" + "'", str2.equals("0:00:00.001"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1262");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y0M0DT0H0M0.098S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0980" + "'", str2.equals("P0Y000DT00000.0980"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1263");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, 100L, "P0000Y0-10DT07430-10.0103599913");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y0-10DT07430-10.0103599913" + "'", str3.equals("P0000Y0-10DT07430-10.0103599913"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1264");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 1, "P-1Y11M30DT23H59M59.932S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9321" + "'", str3.equals("P-1Y11030DT23059059.9321"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1265");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', 1L, "P0Y000DT00000.052100", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1266");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) '4', "P-1Y11-130DT2374359-159.9323599899", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1267");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "0 30a086399", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 30a086399" + "'", str3.equals("0 30a086399"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1268");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 100, (long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.901S" + "'", str2.equals("P-1Y11M30DT23H59M59.901S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1269");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P00-1Y11030DT23059059.90417");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P00-1Y11030DT23059059.90417" + "'", str2.equals("P00-1Y11030DT23059059.90417"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1270");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (short) 0, "P0Y0M0DT0H0M0.031S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0311" + "'", str3.equals("P0Y000DT00000.0311"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1271");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y000DT00000.0031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0031" + "'", str2.equals("P0Y000DT00000.0031"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1272");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y000DT00000.03196");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.03196" + "'", str2.equals("P0Y000DT00000.03196"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1273");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), (long) (short) -1, "0:00:00.100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.100" + "'", str3.equals("0:00:00.100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1274");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.0980");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0980" + "'", str2.equals("P0Y000DT00000.0980"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1275");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) (byte) 100, "P-1Y11030DT23059059.9000", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1276");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 0, (long) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1277");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (short) -1, "P0Y0-10DT07430-10.0003599990", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1278");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, (long) (short) 0, "0:00:00.100", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1279");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P-1Y11030DT23059059.9901", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9901" + "'", str3.equals("P-1Y11030DT23059059.9901"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1280");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 0, (long) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2.equals("P0Y0M0DT0H0M0.001S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1281");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0000Y0-10DT07430-10.0103599913", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y0-10DT07430-10.0103599913" + "'", str3.equals("P0000Y0-10DT07430-10.0103599913"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1282");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P-1Y11030DT23059059.9580", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9580" + "'", str3.equals("P-1Y11030DT23059059.9580"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1283");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 100, 0L, "P-1Y11030DT23059059.9990", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1284");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (-1), false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1285");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "P-1Y11M30DT23H59M59.900S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9001" + "'", str3.equals("P-1Y11030DT23059059.9001"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1286");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) ' ', "P0Y000DT00000.9910");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.9910" + "'", str3.equals("P0Y000DT00000.9910"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1287");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y0M0DT0H0M0.009S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0090" + "'", str3.equals("P0Y000DT00000.0090"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1288");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) 'a', "P0Y0M0DT0H0M0.034S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1289");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) (byte) -1, "0:00:00.097", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1290");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 10, (long) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.989S" + "'", str2.equals("P-1Y11M30DT23H59M59.989S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1291");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), 0L, "P0Y0-10DT07430-10.0013599947");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0013599947" + "'", str3.equals("P0Y0-10DT07430-10.0013599947"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1292");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 100, 0L, "P-1Y11030DT23059059.9900", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1293");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, 0L, "0:00:00.001");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.001" + "'", str3.equals("0:00:00.001"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1294");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 10, true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1295");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.0020");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0020" + "'", str2.equals("P0Y000DT00000.0020"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1296");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 100, (long) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.997S" + "'", str2.equals("P-1Y11M30DT23H59M59.997S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1297");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0000Y0M0DT0H0M0.051S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.051-1" + "'", str2.equals("P0000Y000DT00000.051-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1298");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) (-1), "0:00:00.100", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1299");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y0M0DT0H0M0.090S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0900" + "'", str2.equals("P0Y000DT00000.0900"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1300");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1301");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 10, (long) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.990S" + "'", str2.equals("P-1Y11M30DT23H59M59.990S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1302");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) '#', "P0Y000DT00000.0100", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1303");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P-1Y11M30DT23H59M59.999S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.99952" + "'", str2.equals("P-1Y11030DT23059059.99952"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1304");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.00010", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00010" + "'", str3.equals("P0Y000DT00000.00010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1305");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) 0, "P-1Y11-130DT2374359-159.9103599998", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1306");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P-1Y11-130DT2374359-159.9103599998");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11-130DT2374359-159.9103599998" + "'", str2.equals("P-1Y11-130DT2374359-159.9103599998"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1307");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P0000Y0-10DT07430-10.0103599965", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y0-10DT07430-10.0103599965" + "'", str3.equals("P0000Y0-10DT07430-10.0103599965"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1308");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) (short) 0, "P0Y0-10DT07430-10.0903599997");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0903599997" + "'", str3.equals("P0Y0-10DT07430-10.0903599997"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1309");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) (byte) 100, "0:00:00.097", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1310");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 0, (long) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.999S" + "'", str2.equals("P-1Y11M30DT23H59M59.999S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1311");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) (short) -1, "P0Y0-10DT07430-10.0103599991");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0103599991" + "'", str3.equals("P0Y0-10DT07430-10.0103599991"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1312");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P-1Y11-130DT2374359-159.9103599998");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11-130DT2374359-159.9103599998" + "'", str2.equals("P-1Y11-130DT2374359-159.9103599998"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1313");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) 10, "P-1Y11-130DT2374359-159.9663599900");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9663599900" + "'", str3.equals("P-1Y11-130DT2374359-159.9663599900"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1314");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', (long) (byte) 0, "P-1Y11030DT23059059.9010", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1315");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 100, (long) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1316");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 1, "P0000Y000DT00000.0510", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1317");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P0Y000DT00000.0329", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0329" + "'", str3.equals("P0Y000DT00000.0329"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1318");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 10, "P0Y0-10DT07430-10.0033599991", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1319");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, (long) (short) 100, "P0Y000DT00000.096100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.096100" + "'", str3.equals("P0Y000DT00000.096100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1320");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 0, (long) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.999S" + "'", str2.equals("P-1Y11M30DT23H59M59.999S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1321");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((-1L), (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.033S" + "'", str2.equals("P0Y0M0DT0H0M0.033S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1322");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) (-1), "P0000Y000DT00000.10035", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1323");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 0L, "P-1Y11030DT23059059.9581");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9581" + "'", str3.equals("P-1Y11030DT23059059.9581"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1324");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, 100L, "P0Y000DT00000.0010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0010" + "'", str3.equals("P0Y000DT00000.0010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1325");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P-1Y11M30DT23H59M59.969S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9690" + "'", str3.equals("P-1Y11030DT23059059.9690"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1326");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 1, 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.099S" + "'", str2.equals("P0Y0M0DT0H0M0.099S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1327");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) (short) 0, "0 30a086399");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 30a086399" + "'", str3.equals("0 30a086399"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1328");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) '4', (long) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.947S" + "'", str2.equals("P-1Y11M30DT23H59M59.947S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1329");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P0Y0M0DT0H0M0.99S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.9952" + "'", str3.equals("P0Y000DT00000.9952"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1330");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P0000Y0-10DT07430-10.0103599913");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y0-10DT07430-10.0103599913" + "'", str2.equals("P0000Y0-10DT07430-10.0103599913"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1331");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P0Y0-10DT07430-10.0013599947", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0013599947" + "'", str3.equals("P0Y0-10DT07430-10.0013599947"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1332");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', (long) 'a', "P0Y0M0DT0H0M0.097S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1333");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "P-1Y11030DT23059059.9751", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9751" + "'", str3.equals("P-1Y11030DT23059059.9751"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1334");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0000Y0M0DT0H0M0.001S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.00110" + "'", str3.equals("P0000Y000DT00000.00110"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1335");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(1L, (long) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.998S" + "'", str2.equals("P-1Y11M30DT23H59M59.998S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1336");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 1, 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.009S" + "'", str2.equals("P0Y0M0DT0H0M0.009S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1337");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.9952", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.9952" + "'", str3.equals("P0Y000DT00000.9952"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1338");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "0:00:00.097", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.097" + "'", str3.equals("0:00:00.097"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1339");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (short) 100, "P0Y000DT00000.00097");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00097" + "'", str3.equals("P0Y000DT00000.00097"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1340");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 'a', true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1341");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) ' ', true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1342");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P-1Y11030DT23059059.9030");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9030" + "'", str2.equals("P-1Y11030DT23059059.9030"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1343");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (byte) -1, "P0Y000DT00000.0031", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1344");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 100, (long) (short) 10, "P0000Y000DT00000.0100", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1345");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P0Y000DT00000.01035");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.01035" + "'", str2.equals("P0Y000DT00000.01035"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1346");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(100L, 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.900S" + "'", str2.equals("P-1Y11M30DT23H59M59.900S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1347");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (-1), 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.011S" + "'", str2.equals("P0Y0M0DT0H0M0.011S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1348");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) 0, "P0Y000DT00000.097100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.097100" + "'", str3.equals("P0Y000DT00000.097100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1349");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', (long) (short) 10, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1350");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) 10, "P0Y000DT00000.031-1", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1351");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 1, (long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.009S" + "'", str2.equals("P0Y0M0DT0H0M0.009S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1352");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P-1Y11030DT23059059.8991");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.8991" + "'", str2.equals("P-1Y11030DT23059059.8991"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1353");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P0Y0M0DT0H0M0.032S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0321" + "'", str3.equals("P0Y000DT00000.0321"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1354");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 100, 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1355");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, (long) (byte) 100, "P0Y000DT00000.09635");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.09635" + "'", str3.equals("P0Y000DT00000.09635"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1356");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, (long) (short) 100, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1357");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (-1), (long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2.equals("P0Y0M0DT0H0M0.001S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1358");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.0031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0031" + "'", str2.equals("P0Y000DT00000.0031"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1359");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P-1Y11030DT23059059.98910");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.98910" + "'", str2.equals("P-1Y11030DT23059059.98910"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1360");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) -1, (long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.101S" + "'", str2.equals("P0Y0M0DT0H0M0.101S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1361");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P-1Y11030DT23059059.989100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.989100" + "'", str2.equals("P-1Y11030DT23059059.989100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1362");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.00110", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00110" + "'", str3.equals("P0Y000DT00000.00110"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1363");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.033-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.033-1" + "'", str2.equals("P0Y000DT00000.033-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1364");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0000Y000DT00000.0100", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.0100" + "'", str3.equals("P0000Y000DT00000.0100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1365");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), (long) (short) -1, "P0Y0M0DT0H0M0.031S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1366");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "P-1Y11030DT23059059.968100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.968100" + "'", str2.equals("P-1Y11030DT23059059.968100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1367");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y0-10DT07430-10.0333599899", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0333599899" + "'", str3.equals("P0Y0-10DT07430-10.0333599899"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1368");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, 100L, "P0Y0M0DT0H0M0.001S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1369");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, 0L, "P0Y000DT00000.10135", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1370");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P-1Y11M30DT23H59M59.902S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9020" + "'", str2.equals("P-1Y11030DT23059059.9020"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1371");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) (byte) 0, "0 30a059 0 hour 0 1439inute59 0 econ3059");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 30a059 0 hour 0 1439inute59 0 econ3059" + "'", str3.equals("0 30a059 0 hour 0 1439inute59 0 econ3059"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1372");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) (short) 1, "P-1Y11030DT23059059.9911", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1373");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', (long) 10, "P00-1Y11030DT23059059.999101", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1374");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, (long) (byte) 100, "P0Y000DT00000.00097");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00097" + "'", str3.equals("P0Y000DT00000.00097"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1375");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y0M0DT0H0M0.035S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.03510" + "'", str2.equals("P0Y000DT00000.03510"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1376");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (-1L), "P0Y0-10DT07430-10.0003599990");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0003599990" + "'", str3.equals("P0Y0-10DT07430-10.0003599990"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1377");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P-1Y11M30DT23H59M59.983S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9830" + "'", str3.equals("P-1Y11030DT23059059.9830"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1378");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y0M0DT0H0M0.042S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.042-1" + "'", str2.equals("P0Y000DT00000.042-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1379");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', (long) 100, "P0Y0-10DT07430-10.0333599899");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0333599899" + "'", str3.equals("P0Y0-10DT07430-10.0333599899"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1380");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "P-1Y11M30DT23H59M59.983S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9830" + "'", str3.equals("P-1Y11030DT23059059.9830"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1381");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.0039");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0039" + "'", str2.equals("P0Y000DT00000.0039"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1382");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (short) 10, "P-1Y11-130DT2374359-159.9103599998");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9103599998" + "'", str3.equals("P-1Y11-130DT2374359-159.9103599998"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1383");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.0321", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0321" + "'", str3.equals("P0Y000DT00000.0321"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1384");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P00-1Y11030DT23059059.999101", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.999101" + "'", str3.equals("P00-1Y11030DT23059059.999101"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1385");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P0000Y000DT00000.9910", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.9910" + "'", str3.equals("P0000Y000DT00000.9910"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1386");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 100, (long) (byte) -1, "P0Y000DT00000.0100", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1387");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 0, (long) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1388");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P0Y0M0DT0H0M0.033S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03310" + "'", str3.equals("P0Y000DT00000.03310"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1389");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.0010", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0010" + "'", str3.equals("P0Y000DT00000.0010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1390");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, (long) (-1), "P0000Y000DT00000.01032", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1391");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', 10L, "P-1Y11M30DT23H59M59.902S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1392");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y000DT00000.01010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.01010" + "'", str2.equals("P0Y000DT00000.01010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1393");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) '4', "P0Y000DT00000.001100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.001100" + "'", str3.equals("P0Y000DT00000.001100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1394");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.096-1", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.096-1" + "'", str3.equals("P0Y000DT00000.096-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1395");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, (long) (short) -1, "P0Y000DT00000.0420", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1396");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "0:00:00.032");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0:00:00.032" + "'", str2.equals("0:00:00.032"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1397");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) (byte) 1, "P0000Y000DT00000.010100", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1398");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, (long) (short) 1, "P-1Y11030DT23059059.90010", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1399");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.0090", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0090" + "'", str3.equals("P0Y000DT00000.0090"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1400");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 10, 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.991S" + "'", str2.equals("P-1Y11M30DT23H59M59.991S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1401");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, 10L, "P0Y0M0DT0H0M0.003S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00311" + "'", str3.equals("P0Y000DT00000.00311"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1402");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 100, (long) '#', "P-1Y11030DT23059059.91090");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.91090" + "'", str3.equals("P-1Y11030DT23059059.91090"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1403");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, 0L, "P-1Y11M30DT23H59M59.975S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9753599990" + "'", str3.equals("P-1Y11-130DT2374359-159.9753599990"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1404");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) -1, (long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.101S" + "'", str2.equals("P0Y0M0DT0H0M0.101S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1405");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, (long) (byte) 10, "P0000Y000DT00000.0510", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1406");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (-1), "P-1Y11030DT23059059.9901", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1407");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y000DT00000.0031", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0031" + "'", str3.equals("P0Y000DT00000.0031"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1408");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1409");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "P-1Y11-130DT2374359-159.9893599913", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9893599913" + "'", str3.equals("P-1Y11-130DT2374359-159.9893599913"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1410");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((-1L), (long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.011S" + "'", str2.equals("P0Y0M0DT0H0M0.011S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1411");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 1, (long) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.998S" + "'", str2.equals("P-1Y11M30DT23H59M59.998S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1412");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((-1L), (long) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.101S" + "'", str2.equals("P0Y0M0DT0H0M0.101S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1413");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) 100, "0:00:00.010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.010" + "'", str3.equals("0:00:00.010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1414");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P0Y000DT00000.00099", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00099" + "'", str3.equals("P0Y000DT00000.00099"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1415");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, (long) (short) 0, "P-1Y11030DT23059059.9890");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9890" + "'", str3.equals("P-1Y11030DT23059059.9890"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1416");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 0, 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2.equals("P0Y0M0DT0H0M0.001S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1417");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P-1Y11-130DT2374359-159.9753599990", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9753599990" + "'", str3.equals("P-1Y11-130DT2374359-159.9753599990"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1418");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.06587");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.06587" + "'", str2.equals("P0Y000DT00000.06587"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1419");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) ' ', "P00-1Y11030DT23059059.9990", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1420");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.0320");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0320" + "'", str2.equals("P0Y000DT00000.0320"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1421");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 'a', (long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.913S" + "'", str2.equals("P-1Y11M30DT23H59M59.913S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1422");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) '#', "P-1Y11M30DT23H59M59.991S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.99134" + "'", str3.equals("P-1Y11030DT23059059.99134"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1423");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P-1Y11M30DT23H59M59.968S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.96852" + "'", str2.equals("P-1Y11030DT23059059.96852"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1424");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, 0L, "P0Y0M0DT0H0M0.011S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1425");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.0310", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0310" + "'", str3.equals("P0Y000DT00000.0310"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1426");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P-1Y11M30DT23H59M59.997S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9971" + "'", str2.equals("P-1Y11030DT23059059.9971"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1427");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y0M0DT0H0M0.065S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.065100" + "'", str2.equals("P0Y000DT00000.065100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1428");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 1, (long) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.998S" + "'", str2.equals("P-1Y11M30DT23H59M59.998S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1429");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P00-1Y11-130DT2374359-159.9043599990");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P00-1Y11-130DT2374359-159.9043599990" + "'", str2.equals("P00-1Y11-130DT2374359-159.9043599990"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1430");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) 10, "P0Y000DT00000.03133");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03133" + "'", str3.equals("P0Y000DT00000.03133"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1431");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P0000Y000DT00000.0510");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.0510" + "'", str2.equals("P0000Y000DT00000.0510"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1432");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, 0L, "P0Y0-10DT07430-10.0333599899");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0333599899" + "'", str3.equals("P0Y0-10DT07430-10.0333599899"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1433");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "0:00:00.000");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0:00:00.000" + "'", str2.equals("0:00:00.000"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1434");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', (long) ' ', "P-1Y11030DT23059059.90132", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1435");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.031-1", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.031-1" + "'", str3.equals("P0Y000DT00000.031-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1436");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y000DT00000.00010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.00010" + "'", str2.equals("P0Y000DT00000.00010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1437");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (byte) 1, false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1438");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) (byte) 0, "P0Y0M0DT0H0M0.090S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0903599999" + "'", str3.equals("P0Y0-10DT07430-10.0903599999"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1439");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P0Y000DT00000.0870");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0870" + "'", str2.equals("P0Y000DT00000.0870"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1440");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P0000Y000DT00000.10010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.10010" + "'", str2.equals("P0000Y000DT00000.10010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1441");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.0010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0010" + "'", str2.equals("P0Y000DT00000.0010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1442");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y0-10DT07430-10.0513599999");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0-10DT07430-10.0513599999" + "'", str2.equals("P0Y0-10DT07430-10.0513599999"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1443");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, (long) 100, "P-1Y11030DT23059059.9581", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1444");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) (byte) 100, "P0Y000DT00000.0011");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0011" + "'", str3.equals("P0Y000DT00000.0011"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1445");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(0L, (long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2.equals("P0Y0M0DT0H0M0.001S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1446");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, 0L, "P-1Y11030DT23059059.9690");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9690" + "'", str3.equals("P-1Y11030DT23059059.9690"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1447");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (-1L), "P0Y0M0DT0H0M0.003S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0033599899" + "'", str3.equals("P0Y0-10DT07430-10.0033599899"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1448");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, (long) 0, "P0Y000DT00000.01032");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.01032" + "'", str3.equals("P0Y000DT00000.01032"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1449");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, (long) (short) 100, "P0Y000DT00000.051-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.051-1" + "'", str3.equals("P0Y000DT00000.051-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1450");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, 100L, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1451");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "P-1Y11M30DT23H59M59.990S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.99010" + "'", str3.equals("P-1Y11030DT23059059.99010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1452");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) 100, "P0Y000DT00000.097100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.097100" + "'", str3.equals("P0Y000DT00000.097100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1453");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y000DT00000.0030", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0030" + "'", str3.equals("P0Y000DT00000.0030"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1454");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P0Y000DT00000.00153");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.00153" + "'", str2.equals("P0Y000DT00000.00153"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1455");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y0M0DT0H0M0.000S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0000" + "'", str3.equals("P0Y000DT00000.0000"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1456");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 100, (long) 10, "P-1Y11M30DT23H59M59.952S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1457");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) (byte) 1, "P-1Y11030DT23059059.99810", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1458");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 0, (long) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.100S" + "'", str2.equals("P0Y0M0DT0H0M0.100S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1459");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', 1L, "P0Y000DT00000.097100", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1460");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) ' ', (long) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.967S" + "'", str2.equals("P-1Y11M30DT23H59M59.967S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1461");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P0000Y000DT00000.0011");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.0011" + "'", str2.equals("P0000Y000DT00000.0011"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1462");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((-1L), true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1463");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "P-1Y11M30DT23H59M59.978S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.978100" + "'", str3.equals("P-1Y11030DT23059059.978100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1464");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0000Y0-10DT07430-10.0103599965");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y0-10DT07430-10.0103599965" + "'", str2.equals("P0000Y0-10DT07430-10.0103599965"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1465");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) (byte) 1, "P-1Y11030DT23059059.9901");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9901" + "'", str3.equals("P-1Y11030DT23059059.9901"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1466");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P-1Y11-130DT2374359-159.9663599900", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9663599900" + "'", str3.equals("P-1Y11-130DT2374359-159.9663599900"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1467");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', 100L, "P0Y0M0DT0H0M0.025S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1468");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y0M0DT0H0M0.031S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0310" + "'", str2.equals("P0Y000DT00000.0310"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1469");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P-1Y11030DT23059059.968100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.968100" + "'", str2.equals("P-1Y11030DT23059059.968100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1470");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1471");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1472");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 100, (-1L), "P0Y000DT00000.0329", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1473");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) 'a', "P-1Y11030DT23059059.952-1", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1474");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.096100", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.096100" + "'", str3.equals("P0Y000DT00000.096100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1475");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) '#', "", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1476");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P0Y0M0DT0H0M0.096S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.096100" + "'", str3.equals("P0Y000DT00000.096100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1477");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "P-1Y11030DT23059059.952-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.952-1" + "'", str2.equals("P-1Y11030DT23059059.952-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1478");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P-1Y11M30DT23H59M59.932S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9320" + "'", str2.equals("P-1Y11030DT23059059.9320"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1479");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 100, (long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.910S" + "'", str2.equals("P-1Y11M30DT23H59M59.910S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1480");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "0 0econ00", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 0econ00" + "'", str3.equals("0 0econ00"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1481");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 10, (long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1482");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) 100, "P0Y0M0DT0H0M0.025S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1483");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y0M0DT0H0M0.002S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.002100" + "'", str3.equals("P0Y000DT00000.002100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1484");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1485");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "P-1Y11030DT23059059.9690", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9690" + "'", str3.equals("P-1Y11030DT23059059.9690"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1486");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(1L, (long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.999S" + "'", str2.equals("P-1Y11M30DT23H59M59.999S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1487");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P0Y0M0DT0H0M0.022S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.022-1" + "'", str2.equals("P0Y000DT00000.022-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1488");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y000DT00000.0900");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0900" + "'", str2.equals("P0Y000DT00000.0900"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1489");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 1L, "P-1Y11030DT23059059.9901");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9901" + "'", str3.equals("P-1Y11030DT23059059.9901"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1490");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 100, 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.910S" + "'", str2.equals("P-1Y11M30DT23H59M59.910S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1491");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) '#', "P-1Y11030DT23059059.9030");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9030" + "'", str3.equals("P-1Y11030DT23059059.9030"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1492");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P-1Y11030DT23059059.9660");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9660" + "'", str2.equals("P-1Y11030DT23059059.9660"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1493");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, (long) (short) 1, "0:00:00.052");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.052" + "'", str3.equals("0:00:00.052"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1494");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) -1, (long) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1495");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) ' ', "0 0a00 0 hour 0 0inute0 0 econ00");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 0a00 0 hour 0 0inute0 0 econ00" + "'", str3.equals("0 0a00 0 hour 0 0inute0 0 econ00"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1496");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y000DT00000.031-1", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.031-1" + "'", str3.equals("P0Y000DT00000.031-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1497");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, 0L, "P0Y000DT00000.0310", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1498");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "P-1Y11M30DT23H59M59.901S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.901100" + "'", str2.equals("P-1Y11030DT23059059.901100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1499");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.9910", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.9910" + "'", str3.equals("P0Y000DT00000.9910"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.test1500");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 10L, "P-1Y11M30DT23H59M59.969S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }
}

