package DurationFormatUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DurationFormatUtils2 {

    public static boolean debug = false;

    @Test
    public void DurationFormatUtils1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1001");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y0M0DT0H0M0.99S" + "'", str2.equals("P0000Y0M0DT0H0M0.99S"));
    }

    @Test
    public void DurationFormatUtils1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1002");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) ' ', "0:00:00.001");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.001" + "'", str3.equals("0:00:00.001"));
    }

    @Test
    public void DurationFormatUtils1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1003");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, (long) 'a', "P0Y0M0DT0H0M0.031S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03196" + "'", str3.equals("P0Y000DT00000.03196"));
    }

    @Test
    public void DurationFormatUtils1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1004");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) ' ', "0 0a00", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1005");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y0M0DT0H0M0.042S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0420" + "'", str2.equals("P0Y000DT00000.0420"));
    }

    @Test
    public void DurationFormatUtils1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1006");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), (long) 100, "P0Y0M0DT0H0M0.031S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1007");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, (long) (-1), "", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1008");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, 0L, "P-1Y11030DT23059059.9000", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1009");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y000DT00000.00310", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00310" + "'", str3.equals("P0Y000DT00000.00310"));
    }

    @Test
    public void DurationFormatUtils1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1010");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) (byte) 0, "P0000Y000DT00000.010-1", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1011");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (-1), "P-1Y11-130DT2374359-159.9983599903", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1012");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y000DT00000.00210");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.00210" + "'", str2.equals("P0Y000DT00000.00210"));
    }

    @Test
    public void DurationFormatUtils1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1013");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "P00-1Y11030DT23059059.99999", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.99999" + "'", str3.equals("P00-1Y11030DT23059059.99999"));
    }

    @Test
    public void DurationFormatUtils1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1014");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P0Y0M0DT0H0M0.099S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.099-1" + "'", str2.equals("P0Y000DT00000.099-1"));
    }

    @Test
    public void DurationFormatUtils1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1015");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P0Y000DT00000.03310", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03310" + "'", str3.equals("P0Y000DT00000.03310"));
    }

    @Test
    public void DurationFormatUtils1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1016");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.03196");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.03196" + "'", str2.equals("P0Y000DT00000.03196"));
    }

    @Test
    public void DurationFormatUtils1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1017");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (-1), (long) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1018");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0000Y000DT00000.0100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.0100" + "'", str2.equals("P0000Y000DT00000.0100"));
    }

    @Test
    public void DurationFormatUtils1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1019");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 10, false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1020");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 10, (long) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.090S" + "'", str2.equals("P0Y0M0DT0H0M0.090S"));
    }

    @Test
    public void DurationFormatUtils1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1021");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) (short) 100, "P-1Y11030DT23059059.952100", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1022");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (short) 100, "P0Y000DT00000.051-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.051-1" + "'", str3.equals("P0Y000DT00000.051-1"));
    }

    @Test
    public void DurationFormatUtils1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1023");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 100, (long) 10, "P-1Y11-130DT2374359-159.9893599913");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9893599913" + "'", str3.equals("P-1Y11-130DT2374359-159.9893599913"));
    }

    @Test
    public void DurationFormatUtils1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1024");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) (short) 0, "P00-1Y11030DT23059059.9990");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.9990" + "'", str3.equals("P00-1Y11030DT23059059.9990"));
    }

    @Test
    public void DurationFormatUtils1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1025");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y000DT00000.10135", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.10135" + "'", str3.equals("P0Y000DT00000.10135"));
    }

    @Test
    public void DurationFormatUtils1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1026");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.0039");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0039" + "'", str2.equals("P0Y000DT00000.0039"));
    }

    @Test
    public void DurationFormatUtils1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1027");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y0-10DT07430-10.0003599899", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0003599899" + "'", str3.equals("P0Y0-10DT07430-10.0003599899"));
    }

    @Test
    public void DurationFormatUtils1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1028");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, 0L, "P0000Y0-10DT07430-10.0013599969", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1029");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) '#', "", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1030");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, (-1L), "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1031");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 10, (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.022S" + "'", str2.equals("P0Y0M0DT0H0M0.022S"));
    }

    @Test
    public void DurationFormatUtils1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1032");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) 100, "P0Y0M0DT0H0M0.000S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00099" + "'", str3.equals("P0Y000DT00000.00099"));
    }

    @Test
    public void DurationFormatUtils1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1033");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (-1L), "P0Y000DT00000.0330", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1034");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 1, (long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1035");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 'a', (long) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.902S" + "'", str2.equals("P-1Y11M30DT23H59M59.902S"));
    }

    @Test
    public void DurationFormatUtils1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1036");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "0 0a00 0 hour 0 0inute0 0 econ00", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 0a00 0 hour 0 0inute0 0 econ00" + "'", str3.equals("0 0a00 0 hour 0 0inute0 0 econ00"));
    }

    @Test
    public void DurationFormatUtils1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1037");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (short) 100, "0 86399econ3086399");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 86399econ3086399" + "'", str3.equals("0 86399econ3086399"));
    }

    @Test
    public void DurationFormatUtils1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1038");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "P0Y000DT00000.099-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.099-1" + "'", str2.equals("P0Y000DT00000.099-1"));
    }

    @Test
    public void DurationFormatUtils1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1039");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0000Y000DT00000.051100", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.051100" + "'", str3.equals("P0000Y000DT00000.051100"));
    }

    @Test
    public void DurationFormatUtils1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1040");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) 1, "P0000Y000DT00000.01010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.01010" + "'", str3.equals("P0000Y000DT00000.01010"));
    }

    @Test
    public void DurationFormatUtils1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1041");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) '4', (long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.958S" + "'", str2.equals("P-1Y11M30DT23H59M59.958S"));
    }

    @Test
    public void DurationFormatUtils1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1042");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (short) 0, true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1043");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) 10, "P0Y0M0DT0H0M0.001S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1044");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P-1Y11030DT23059059.952100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.952100" + "'", str2.equals("P-1Y11030DT23059059.952100"));
    }

    @Test
    public void DurationFormatUtils1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1045");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P-1Y11030DT23059059.91090");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.91090" + "'", str2.equals("P-1Y11030DT23059059.91090"));
    }

    @Test
    public void DurationFormatUtils1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1046");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords(10L, false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1047");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "P-1Y11030DT23059059.99097", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.99097" + "'", str3.equals("P-1Y11030DT23059059.99097"));
    }

    @Test
    public void DurationFormatUtils1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1048");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) ' ', (long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.978S" + "'", str2.equals("P-1Y11M30DT23H59M59.978S"));
    }

    @Test
    public void DurationFormatUtils1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1049");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(100L, (long) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.900S" + "'", str2.equals("P-1Y11M30DT23H59M59.900S"));
    }

    @Test
    public void DurationFormatUtils1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1050");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.09690", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.09690" + "'", str3.equals("P0Y000DT00000.09690"));
    }

    @Test
    public void DurationFormatUtils1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1051");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (byte) 100, false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1052");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1053");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (byte) 1, "P-1Y11M30DT23H59M59.990S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9902" + "'", str3.equals("P-1Y11030DT23059059.9902"));
    }

    @Test
    public void DurationFormatUtils1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1054");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "0 86399econ3086399");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0 86399econ3086399" + "'", str2.equals("0 86399econ3086399"));
    }

    @Test
    public void DurationFormatUtils1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1055");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P0Y0M0DT0H0M0.090S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.09052" + "'", str2.equals("P0Y000DT00000.09052"));
    }

    @Test
    public void DurationFormatUtils1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1056");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "P0000Y000DT00000.01032", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.01032" + "'", str3.equals("P0000Y000DT00000.01032"));
    }

    @Test
    public void DurationFormatUtils1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1057");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y0M0DT0H0M0.033S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.033-1" + "'", str3.equals("P0Y000DT00000.033-1"));
    }

    @Test
    public void DurationFormatUtils1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1058");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', (long) (short) 10, "P0Y0-10DT07430-10.0103599991");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0103599991" + "'", str3.equals("P0Y0-10DT07430-10.0103599991"));
    }

    @Test
    public void DurationFormatUtils1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1059");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y0M0DT0H0M0.032S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0320" + "'", str2.equals("P0Y000DT00000.0320"));
    }

    @Test
    public void DurationFormatUtils1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1060");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (short) -1, "P0Y000DT00000.0031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0031" + "'", str3.equals("P0Y000DT00000.0031"));
    }

    @Test
    public void DurationFormatUtils1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1061");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) 'a', "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1062");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (-1), (long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", str2.equals("P0Y0M0DT0H0M0.002S"));
    }

    @Test
    public void DurationFormatUtils1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1063");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "0 seconds", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 0econ00" + "'", str3.equals("0 0econ00"));
    }

    @Test
    public void DurationFormatUtils1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1064");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0000Y000DT00000.010100", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.010100" + "'", str3.equals("P0000Y000DT00000.010100"));
    }

    @Test
    public void DurationFormatUtils1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1065");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P-1Y11M30DT23H59M59.966S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9660" + "'", str2.equals("P-1Y11030DT23059059.9660"));
    }

    @Test
    public void DurationFormatUtils1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1066");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, 1L, "P0Y000DT00000.03211", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1067");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) (byte) 1, "P-1Y11030DT23059059.9890", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1068");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "P-1Y11M30DT23H59M59.989S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.989100" + "'", str2.equals("P-1Y11030DT23059059.989100"));
    }

    @Test
    public void DurationFormatUtils1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1069");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) -1, 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2.equals("P0Y0M0DT0H0M0.001S"));
    }

    @Test
    public void DurationFormatUtils1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1070");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P-1Y11030DT23059059.93252");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.93252" + "'", str2.equals("P-1Y11030DT23059059.93252"));
    }

    @Test
    public void DurationFormatUtils1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1071");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(0L, (long) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1072");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P00-1Y11030DT23059059.9042", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.9042" + "'", str3.equals("P00-1Y11030DT23059059.9042"));
    }

    @Test
    public void DurationFormatUtils1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1073");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) (byte) 100, "P0Y0-10DT07430-10.0333599899", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1074");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P0Y0M0DT0H0M0.065S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.06535" + "'", str3.equals("P0Y000DT00000.06535"));
    }

    @Test
    public void DurationFormatUtils1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1075");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, (long) 10, "P0000Y0M0DT0H0M0.99S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y0-10DT07430-10.993599910" + "'", str3.equals("P0000Y0-10DT07430-10.993599910"));
    }

    @Test
    public void DurationFormatUtils1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1076");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1077");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) '4', "P0Y0M0DT0H0M0.001S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00153" + "'", str3.equals("P0Y000DT00000.00153"));
    }

    @Test
    public void DurationFormatUtils1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1078");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) 'a', "0 days", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1079");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 100, 10L, "P0Y000DT00000.0350");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0350" + "'", str3.equals("P0Y000DT00000.0350"));
    }

    @Test
    public void DurationFormatUtils1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1080");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "0:00:00.097");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0:00:00.097" + "'", str2.equals("0:00:00.097"));
    }

    @Test
    public void DurationFormatUtils1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1081");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) 1, "P0Y0-10DT07430-10.0513599999", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1082");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y0M0DT0H0M0.000S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.000-1" + "'", str3.equals("P0Y000DT00000.000-1"));
    }

    @Test
    public void DurationFormatUtils1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1083");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P-1Y11030DT23059059.9689", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9689" + "'", str3.equals("P-1Y11030DT23059059.9689"));
    }

    @Test
    public void DurationFormatUtils1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1084");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) 10, "P0Y0M0DT0H0M0.002S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00211" + "'", str3.equals("P0Y000DT00000.00211"));
    }

    @Test
    public void DurationFormatUtils1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1085");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (-1), "P0Y0M0DT0H0M0.011S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1086");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 'a', false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1087");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, (long) (byte) 100, "P-1Y11030DT23059059.9661", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1088");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.0320");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0320" + "'", str2.equals("P0Y000DT00000.0320"));
    }

    @Test
    public void DurationFormatUtils1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1089");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', (long) (byte) 10, "P0Y0-10DT07430-10.0033599991", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1090");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1091");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.00210", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00210" + "'", str3.equals("P0Y000DT00000.00210"));
    }

    @Test
    public void DurationFormatUtils1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1092");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 100, (long) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.900S" + "'", str2.equals("P-1Y11M30DT23H59M59.900S"));
    }

    @Test
    public void DurationFormatUtils1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1093");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P0Y0M0DT0H0M0.090S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.09010" + "'", str3.equals("P0Y000DT00000.09010"));
    }

    @Test
    public void DurationFormatUtils1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1094");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.00111", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00111" + "'", str3.equals("P0Y000DT00000.00111"));
    }

    @Test
    public void DurationFormatUtils1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1095");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) ' ', (long) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.969S" + "'", str2.equals("P-1Y11M30DT23H59M59.969S"));
    }

    @Test
    public void DurationFormatUtils1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1096");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (short) 0, "P0000Y000DT00000.01052");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.01052" + "'", str3.equals("P0000Y000DT00000.01052"));
    }

    @Test
    public void DurationFormatUtils1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1097");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 'a', (long) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.904S" + "'", str2.equals("P-1Y11M30DT23H59M59.904S"));
    }

    @Test
    public void DurationFormatUtils1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1098");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) 'a', "P-1Y11M30DT23H59M59.910S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1099");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, (long) 10, "P0Y000DT00000.03352", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1100");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, (long) (short) 0, "P0Y0M0DT0H0M0.000S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0003599990" + "'", str3.equals("P0Y0-10DT07430-10.0003599990"));
    }

    @Test
    public void DurationFormatUtils1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1101");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y000DT00000.0350");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0350" + "'", str2.equals("P0Y000DT00000.0350"));
    }

    @Test
    public void DurationFormatUtils1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1102");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) (short) 1, "P0Y000DT00000.00211");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00211" + "'", str3.equals("P0Y000DT00000.00211"));
    }

    @Test
    public void DurationFormatUtils1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1103");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, 1L, "P00-1Y11030DT23059059.9993");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.9993" + "'", str3.equals("P00-1Y11030DT23059059.9993"));
    }

    @Test
    public void DurationFormatUtils1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1104");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, 0L, "P0Y000DT00000.033-1", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1105");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void DurationFormatUtils1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1106");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', 100L, "P-1Y11030DT23059059.9131");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9131" + "'", str3.equals("P-1Y11030DT23059059.9131"));
    }

    @Test
    public void DurationFormatUtils1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1107");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 10L, "0 seconds", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1108");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) (short) 100, "P00-1Y11-130DT2374359-159.9043599990");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11-130DT2374359-159.9043599990" + "'", str3.equals("P00-1Y11-130DT2374359-159.9043599990"));
    }

    @Test
    public void DurationFormatUtils1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1109");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P-1Y11M30DT23H59M59.903S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9031" + "'", str3.equals("P-1Y11030DT23059059.9031"));
    }

    @Test
    public void DurationFormatUtils1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1110");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 100, 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.900S" + "'", str2.equals("P-1Y11M30DT23H59M59.900S"));
    }

    @Test
    public void DurationFormatUtils1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1111");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, (long) (-1), "P0Y000DT00000.10110", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1112");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P-1Y11030DT23059059.989100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.989100" + "'", str2.equals("P-1Y11030DT23059059.989100"));
    }

    @Test
    public void DurationFormatUtils1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1113");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) (short) 100, "P0Y0M0DT0H0M0.097S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1114");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, (long) (-1), "P-1Y11030DT23059059.96610");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.96610" + "'", str3.equals("P-1Y11030DT23059059.96610"));
    }

    @Test
    public void DurationFormatUtils1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1115");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (-1L), "P0Y0M0DT0H0M0.035S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1116");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 10, (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.022S" + "'", str2.equals("P0Y0M0DT0H0M0.022S"));
    }

    @Test
    public void DurationFormatUtils1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1117");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0000Y000DT00000.010-1", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.010-1" + "'", str3.equals("P0000Y000DT00000.010-1"));
    }

    @Test
    public void DurationFormatUtils1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1118");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (byte) 0, "0 days", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1119");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 100, (-1L), "P0Y0M0DT0H0M0.000S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0003599899" + "'", str3.equals("P0Y0-10DT07430-10.0003599899"));
    }

    @Test
    public void DurationFormatUtils1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1120");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, 0L, "P-1Y11M30DT23H59M59.952S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1121");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P0Y0M0DT0H0M0.033S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.03335" + "'", str2.equals("P0Y000DT00000.03335"));
    }

    @Test
    public void DurationFormatUtils1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1122");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y000DT00000.00153");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.00153" + "'", str2.equals("P0Y000DT00000.00153"));
    }

    @Test
    public void DurationFormatUtils1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1123");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0000Y000DT00000.01010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.01010" + "'", str2.equals("P0000Y000DT00000.01010"));
    }

    @Test
    public void DurationFormatUtils1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1124");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P0Y0M0DT0H0M0.087S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.087100" + "'", str3.equals("P0Y000DT00000.087100"));
    }

    @Test
    public void DurationFormatUtils1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1125");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y0M0DT0H0M0.032S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03297" + "'", str3.equals("P0Y000DT00000.03297"));
    }

    @Test
    public void DurationFormatUtils1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1126");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P0Y0M0DT0H0M0.065S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.065100" + "'", str3.equals("P0Y000DT00000.065100"));
    }

    @Test
    public void DurationFormatUtils1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1127");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "P0Y000DT00000.0039");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0039" + "'", str2.equals("P0Y000DT00000.0039"));
    }

    @Test
    public void DurationFormatUtils1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1128");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, 100L, "", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1129");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 1, (long) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.051S" + "'", str2.equals("P0Y0M0DT0H0M0.051S"));
    }

    @Test
    public void DurationFormatUtils1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1130");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 0, (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.032S" + "'", str2.equals("P0Y0M0DT0H0M0.032S"));
    }

    @Test
    public void DurationFormatUtils1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1131");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1132");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (byte) 10, "P0Y000DT00000.03352");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03352" + "'", str3.equals("P0Y000DT00000.03352"));
    }

    @Test
    public void DurationFormatUtils1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1133");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P0000Y0-10DT07430-10.993599910", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y0-10DT07430-10.993599910" + "'", str3.equals("P0000Y0-10DT07430-10.993599910"));
    }

    @Test
    public void DurationFormatUtils1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1134");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, (long) (-1), "P0Y0M0DT0H0M0.101S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1135");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P00-1Y11030DT23059059.999100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P00-1Y11030DT23059059.999100" + "'", str2.equals("P00-1Y11030DT23059059.999100"));
    }

    @Test
    public void DurationFormatUtils1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1136");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "0:00:00.000");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0:00:00.000" + "'", str2.equals("0:00:00.000"));
    }

    @Test
    public void DurationFormatUtils1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1137");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 100L, "P0Y0M0DT0H0M0.101S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1138");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 10, "P-1Y11M30DT23H59M59.998S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.99810" + "'", str2.equals("P-1Y11030DT23059059.99810"));
    }

    @Test
    public void DurationFormatUtils1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1139");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y0M0DT0H0M0.087S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0870" + "'", str3.equals("P0Y000DT00000.0870"));
    }

    @Test
    public void DurationFormatUtils1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1140");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "0:00:00.100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0:00:00.100" + "'", str2.equals("0:00:00.100"));
    }

    @Test
    public void DurationFormatUtils1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1141");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y000DT00000.03211");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.03211" + "'", str2.equals("P0Y000DT00000.03211"));
    }

    @Test
    public void DurationFormatUtils1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1142");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P-1Y11M30DT23H59M59.932S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.93235" + "'", str3.equals("P-1Y11030DT23059059.93235"));
    }

    @Test
    public void DurationFormatUtils1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1143");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P-1Y11030DT23059059.98910", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.98910" + "'", str3.equals("P-1Y11030DT23059059.98910"));
    }

    @Test
    public void DurationFormatUtils1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1144");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.001100", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.001100" + "'", str3.equals("P0Y000DT00000.001100"));
    }

    @Test
    public void DurationFormatUtils1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1145");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.032-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.032-1" + "'", str2.equals("P0Y000DT00000.032-1"));
    }

    @Test
    public void DurationFormatUtils1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1146");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) 0, "P-1Y11M30DT23H59M59.902S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1147");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P-1Y11030DT23059059.9750", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9750" + "'", str3.equals("P-1Y11030DT23059059.9750"));
    }

    @Test
    public void DurationFormatUtils1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1148");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) '#', "P-1Y11M30DT23H59M59.952S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.95234" + "'", str3.equals("P-1Y11030DT23059059.95234"));
    }

    @Test
    public void DurationFormatUtils1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1149");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (byte) 100, false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1150");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) (byte) -1, "P-1Y11-130DT2374359-159.9663599900");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9663599900" + "'", str3.equals("P-1Y11-130DT2374359-159.9663599900"));
    }

    @Test
    public void DurationFormatUtils1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1151");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P-1Y11-130DT2374359-159.9663599900");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11-130DT2374359-159.9663599900" + "'", str2.equals("P-1Y11-130DT2374359-159.9663599900"));
    }

    @Test
    public void DurationFormatUtils1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1152");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (short) 1, "", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1153");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 10, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void DurationFormatUtils1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1154");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 1, "P0Y000DT00000.032-1", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1155");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P-1Y11M30DT23H59M59.903S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9030" + "'", str2.equals("P-1Y11030DT23059059.9030"));
    }

    @Test
    public void DurationFormatUtils1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1156");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P-1Y11-130DT2374359-159.9893599913");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11-130DT2374359-159.9893599913" + "'", str2.equals("P-1Y11-130DT2374359-159.9893599913"));
    }

    @Test
    public void DurationFormatUtils1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1157");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, 0L, "P-1Y11030DT23059059.952-1", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1158");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "P00-1Y11030DT23059059.99999");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P00-1Y11030DT23059059.99999" + "'", str2.equals("P00-1Y11030DT23059059.99999"));
    }

    @Test
    public void DurationFormatUtils1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1159");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) 100, "P0Y000DT00000.101-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.101-1" + "'", str3.equals("P0Y000DT00000.101-1"));
    }

    @Test
    public void DurationFormatUtils1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1160");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) (short) 100, "P-1Y11M30DT23H59M59.999S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9990" + "'", str3.equals("P-1Y11030DT23059059.9990"));
    }

    @Test
    public void DurationFormatUtils1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1161");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) -1, (long) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1162");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 1, (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.998S" + "'", str2.equals("P-1Y11M30DT23H59M59.998S"));
    }

    @Test
    public void DurationFormatUtils1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1163");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0000Y0M0DT0H0M0.99S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.9910" + "'", str2.equals("P0000Y000DT00000.9910"));
    }

    @Test
    public void DurationFormatUtils1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1164");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 100, (long) (short) -1, "P-1Y11M30DT23H59M59.998S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1165");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, 1L, "P0Y000DT00000.00152");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00152" + "'", str3.equals("P0Y000DT00000.00152"));
    }

    @Test
    public void DurationFormatUtils1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1166");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), (long) 100, "P0Y0-10DT07430-10.0003599899", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1167");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) (byte) 10, "P0Y000DT00000.05110");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.05110" + "'", str3.equals("P0Y000DT00000.05110"));
    }

    @Test
    public void DurationFormatUtils1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1168");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) -1, (long) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.101S" + "'", str2.equals("P0Y0M0DT0H0M0.101S"));
    }

    @Test
    public void DurationFormatUtils1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1169");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) (-1), "P-1Y11M30DT23H59M59.910S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9103599998" + "'", str3.equals("P-1Y11-130DT2374359-159.9103599998"));
    }

    @Test
    public void DurationFormatUtils1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1170");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.03335", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03335" + "'", str3.equals("P0Y000DT00000.03335"));
    }

    @Test
    public void DurationFormatUtils1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1171");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P-1Y11-130DT2374359-159.9323599900", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9323599900" + "'", str3.equals("P-1Y11-130DT2374359-159.9323599900"));
    }

    @Test
    public void DurationFormatUtils1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1172");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y000DT00000.042100", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.042100" + "'", str3.equals("P0Y000DT00000.042100"));
    }

    @Test
    public void DurationFormatUtils1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1173");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 1, false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1174");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) (short) -1, "0 86399econ3086399");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 86399econ3086399" + "'", str3.equals("0 86399econ3086399"));
    }

    @Test
    public void DurationFormatUtils1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1175");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 100, 100L, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1176");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P00-1Y11030DT23059059.9990", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.9990" + "'", str3.equals("P00-1Y11030DT23059059.9990"));
    }

    @Test
    public void DurationFormatUtils1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1177");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (byte) 0, true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1178");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) (short) 10, "P-1Y11030DT23059059.9661", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1179");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P0Y000DT00000.00111", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00111" + "'", str3.equals("P0Y000DT00000.00111"));
    }

    @Test
    public void DurationFormatUtils1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1180");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y0-10DT07430-10.0003599899");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0-10DT07430-10.0003599899" + "'", str2.equals("P0Y0-10DT07430-10.0003599899"));
    }

    @Test
    public void DurationFormatUtils1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1181");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P0Y000DT00000.09010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.09010" + "'", str2.equals("P0Y000DT00000.09010"));
    }

    @Test
    public void DurationFormatUtils1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1182");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "0 days");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0 0a00" + "'", str2.equals("0 0a00"));
    }

    @Test
    public void DurationFormatUtils1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1183");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 1, (long) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.034S" + "'", str2.equals("P0Y0M0DT0H0M0.034S"));
    }

    @Test
    public void DurationFormatUtils1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1184");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P0Y000DT00000.042100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.042100" + "'", str2.equals("P0Y000DT00000.042100"));
    }

    @Test
    public void DurationFormatUtils1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1185");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', 0L, "P-1Y11030DT23059059.901-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.901-1" + "'", str3.equals("P-1Y11030DT23059059.901-1"));
    }

    @Test
    public void DurationFormatUtils1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1186");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) (byte) -1, "P0Y000DT00000.09052");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.09052" + "'", str3.equals("P0Y000DT00000.09052"));
    }

    @Test
    public void DurationFormatUtils1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1187");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) 10, "P0Y000DT00000.03196", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1188");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) -1, (long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2.equals("P0Y0M0DT0H0M0.001S"));
    }

    @Test
    public void DurationFormatUtils1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1189");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, (long) '#', "P-1Y11030DT23059059.9902", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1190");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 100, (long) (short) 10, "P-1Y11M30DT23H59M59.958S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1191");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) 'a', "P0Y000DT00000.03133");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03133" + "'", str3.equals("P0Y000DT00000.03133"));
    }

    @Test
    public void DurationFormatUtils1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1192");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.0659");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0659" + "'", str2.equals("P0Y000DT00000.0659"));
    }

    @Test
    public void DurationFormatUtils1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1193");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P00-1Y11030DT23059059.99999");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P00-1Y11030DT23059059.99999" + "'", str2.equals("P00-1Y11030DT23059059.99999"));
    }

    @Test
    public void DurationFormatUtils1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1194");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) (byte) 10, "P0Y000DT00000.0870", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1195");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) (byte) -1, "P00-1Y11M30DT23H59M59.904S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1196");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 100, (long) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1197");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(100L, (long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.901S" + "'", str2.equals("P-1Y11M30DT23H59M59.901S"));
    }

    @Test
    public void DurationFormatUtils1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1198");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "P0Y0-10DT07430-10.0003599990");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0-10DT07430-10.0003599990" + "'", str2.equals("P0Y0-10DT07430-10.0003599990"));
    }

    @Test
    public void DurationFormatUtils1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1199");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "P-1Y11030DT23059059.9031", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9031" + "'", str3.equals("P-1Y11030DT23059059.9031"));
    }

    @Test
    public void DurationFormatUtils1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1200");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) 'a', "P-1Y11030DT23059059.952-1", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1201");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', (long) 100, "P0000Y0M0DT0H0M0.001S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1202");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) 'a', "P-1Y11M30DT23H59M59.990S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9900" + "'", str3.equals("P-1Y11030DT23059059.9900"));
    }

    @Test
    public void DurationFormatUtils1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1203");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "P0Y000DT00000.05110", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.05110" + "'", str3.equals("P0Y000DT00000.05110"));
    }

    @Test
    public void DurationFormatUtils1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1204");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, (long) (byte) 0, "P0Y000DT00000.0870");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0870" + "'", str3.equals("P0Y000DT00000.0870"));
    }

    @Test
    public void DurationFormatUtils1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1205");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 'a', 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.913S" + "'", str2.equals("P-1Y11M30DT23H59M59.913S"));
    }

    @Test
    public void DurationFormatUtils1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1206");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "0:00:00.001");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0:00:00.001" + "'", str2.equals("0:00:00.001"));
    }

    @Test
    public void DurationFormatUtils1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1207");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P-1Y11030DT23059059.8991", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.8991" + "'", str3.equals("P-1Y11030DT23059059.8991"));
    }

    @Test
    public void DurationFormatUtils1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1208");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, 0L, "P-1Y11030DT23059059.9901");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9901" + "'", str3.equals("P-1Y11030DT23059059.9901"));
    }

    @Test
    public void DurationFormatUtils1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1209");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, (long) 'a', "P0Y0M0DT0H0M0.065S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.06587" + "'", str3.equals("P0Y000DT00000.06587"));
    }

    @Test
    public void DurationFormatUtils1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1210");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) -1, (long) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1211");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) (byte) 100, "P0Y0M0DT0H0M0.090S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1212");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "P00-1Y11M30DT23H59M59.999S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.9991" + "'", str3.equals("P00-1Y11030DT23059059.9991"));
    }

    @Test
    public void DurationFormatUtils1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1213");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) '#', (long) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.965S" + "'", str2.equals("P-1Y11M30DT23H59M59.965S"));
    }

    @Test
    public void DurationFormatUtils1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1214");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (byte) 0, "P0Y000DT00000.09690");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.09690" + "'", str3.equals("P0Y000DT00000.09690"));
    }

    @Test
    public void DurationFormatUtils1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1215");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) (short) 0, "P0000Y0M0DT0H0M0.99S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1216");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.03133", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03133" + "'", str3.equals("P0Y000DT00000.03133"));
    }

    @Test
    public void DurationFormatUtils1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1217");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 100, (long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.900S" + "'", str2.equals("P-1Y11M30DT23H59M59.900S"));
    }

    @Test
    public void DurationFormatUtils1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1218");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 100, (long) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.901S" + "'", str2.equals("P-1Y11M30DT23H59M59.901S"));
    }

    @Test
    public void DurationFormatUtils1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1219");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) ' ', "P0Y0M0DT0H0M0.090S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0903599997" + "'", str3.equals("P0Y0-10DT07430-10.0903599997"));
    }

    @Test
    public void DurationFormatUtils1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1220");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) 0, "P0Y000DT00000.0320");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0320" + "'", str3.equals("P0Y000DT00000.0320"));
    }

    @Test
    public void DurationFormatUtils1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1221");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), (long) 10, "P0Y000DT00000.097100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.097100" + "'", str3.equals("P0Y000DT00000.097100"));
    }

    @Test
    public void DurationFormatUtils1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1222");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) (short) 10, "P0Y000DT00000.05110");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.05110" + "'", str3.equals("P0Y000DT00000.05110"));
    }

    @Test
    public void DurationFormatUtils1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1223");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P0Y0M0DT0H0M0.032S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.032100" + "'", str3.equals("P0Y000DT00000.032100"));
    }

    @Test
    public void DurationFormatUtils1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1224");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P-1Y11030DT23059059.968100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.968100" + "'", str2.equals("P-1Y11030DT23059059.968100"));
    }

    @Test
    public void DurationFormatUtils1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1225");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "P-1Y11M30DT23H59M59.900S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.90010" + "'", str3.equals("P-1Y11030DT23059059.90010"));
    }

    @Test
    public void DurationFormatUtils1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1226");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) (byte) 10, "P-1Y11030DT23059059.901-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.901-1" + "'", str3.equals("P-1Y11030DT23059059.901-1"));
    }

    @Test
    public void DurationFormatUtils1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1227");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P-1Y11M30DT23H59M59.966S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.96610" + "'", str2.equals("P-1Y11030DT23059059.96610"));
    }

    @Test
    public void DurationFormatUtils1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1228");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 1, "P-1Y11030DT23059059.9660", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1229");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.033-1", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.033-1" + "'", str3.equals("P0Y000DT00000.033-1"));
    }

    @Test
    public void DurationFormatUtils1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1230");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) '4', "P0Y000DT00000.0350", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1231");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) -1, (long) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1232");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) -1, (long) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.101S" + "'", str2.equals("P0Y0M0DT0H0M0.101S"));
    }

    @Test
    public void DurationFormatUtils1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1233");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) 0, "P0Y000DT00000.03133");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03133" + "'", str3.equals("P0Y000DT00000.03133"));
    }

    @Test
    public void DurationFormatUtils1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1234");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) ' ', (long) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.020S" + "'", str2.equals("P0Y0M0DT0H0M0.020S"));
    }

    @Test
    public void DurationFormatUtils1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1235");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P0Y000DT00000.10135", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.10135" + "'", str3.equals("P0Y000DT00000.10135"));
    }

    @Test
    public void DurationFormatUtils1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1236");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "0 seconds");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0 0econ00" + "'", str2.equals("0 0econ00"));
    }

    @Test
    public void DurationFormatUtils1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1237");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y000DT00000.0659", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0659" + "'", str3.equals("P0Y000DT00000.0659"));
    }

    @Test
    public void DurationFormatUtils1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1238");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y0-10DT07430-10.0103599991");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0-10DT07430-10.0103599991" + "'", str2.equals("P0Y0-10DT07430-10.0103599991"));
    }

    @Test
    public void DurationFormatUtils1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1239");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.09052", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.09052" + "'", str3.equals("P0Y000DT00000.09052"));
    }

    @Test
    public void DurationFormatUtils1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1240");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.03196");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.03196" + "'", str2.equals("P0Y000DT00000.03196"));
    }

    @Test
    public void DurationFormatUtils1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1241");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) (-1), "P0Y0M0DT0H0M0.035S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1242");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, 100L, "0:00:00.100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.100" + "'", str3.equals("0:00:00.100"));
    }

    @Test
    public void DurationFormatUtils1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1243");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y0M0DT0H0M0.052S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.052100" + "'", str3.equals("P0Y000DT00000.052100"));
    }

    @Test
    public void DurationFormatUtils1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1244");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P0Y0M0DT0H0M0.096S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.096-1" + "'", str3.equals("P0Y000DT00000.096-1"));
    }

    @Test
    public void DurationFormatUtils1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1245");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) '4', (long) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.983S" + "'", str2.equals("P-1Y11M30DT23H59M59.983S"));
    }

    @Test
    public void DurationFormatUtils1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1246");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.031-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.031-1" + "'", str2.equals("P0Y000DT00000.031-1"));
    }

    @Test
    public void DurationFormatUtils1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1247");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, 10L, "P0Y0M0DT0H0M0.032S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0329" + "'", str3.equals("P0Y000DT00000.0329"));
    }

    @Test
    public void DurationFormatUtils1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1248");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (short) 100, "P00-1Y11M30DT23H59M59.999S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.999101" + "'", str3.equals("P00-1Y11030DT23059059.999101"));
    }

    @Test
    public void DurationFormatUtils1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1249");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) ' ', 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.978S" + "'", str2.equals("P-1Y11M30DT23H59M59.978S"));
    }

    @Test
    public void DurationFormatUtils1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1250");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', (long) '4', "", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1251");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) (short) 100, "P00-1Y11030DT23059059.999-1", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1252");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) '#', (long) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.964S" + "'", str2.equals("P-1Y11M30DT23H59M59.964S"));
    }

    @Test
    public void DurationFormatUtils1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1253");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) 100, "P0Y000DT00000.00153");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00153" + "'", str3.equals("P0Y000DT00000.00153"));
    }

    @Test
    public void DurationFormatUtils1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1254");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) '#', (long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.975S" + "'", str2.equals("P-1Y11M30DT23H59M59.975S"));
    }

    @Test
    public void DurationFormatUtils1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1255");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P-1Y11030DT23059059.99097");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.99097" + "'", str2.equals("P-1Y11030DT23059059.99097"));
    }

    @Test
    public void DurationFormatUtils1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1256");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) (short) -1, "P0Y000DT00000.0329");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0329" + "'", str3.equals("P0Y000DT00000.0329"));
    }

    @Test
    public void DurationFormatUtils1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1257");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y0M0DT0H0M0.087S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0871" + "'", str3.equals("P0Y000DT00000.0871"));
    }

    @Test
    public void DurationFormatUtils1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1258");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, (long) (short) 100, "P0000Y0-10DT07430-10.0013599969");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y0-10DT07430-10.0013599969" + "'", str3.equals("P0000Y0-10DT07430-10.0013599969"));
    }

    @Test
    public void DurationFormatUtils1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1259");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.0100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0100" + "'", str2.equals("P0Y000DT00000.0100"));
    }

    @Test
    public void DurationFormatUtils1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1260");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.00097", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00097" + "'", str3.equals("P0Y000DT00000.00097"));
    }

    @Test
    public void DurationFormatUtils1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1261");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "0:00:00.001");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0:00:00.001" + "'", str2.equals("0:00:00.001"));
    }

    @Test
    public void DurationFormatUtils1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1262");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y0M0DT0H0M0.098S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0980" + "'", str2.equals("P0Y000DT00000.0980"));
    }

    @Test
    public void DurationFormatUtils1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1263");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, 100L, "P0000Y0-10DT07430-10.0103599913");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y0-10DT07430-10.0103599913" + "'", str3.equals("P0000Y0-10DT07430-10.0103599913"));
    }

    @Test
    public void DurationFormatUtils1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1264");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 1, "P-1Y11M30DT23H59M59.932S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9321" + "'", str3.equals("P-1Y11030DT23059059.9321"));
    }

    @Test
    public void DurationFormatUtils1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1265");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', 1L, "P0Y000DT00000.052100", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1266");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) '4', "P-1Y11-130DT2374359-159.9323599899", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1267");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "0 30a086399", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 30a086399" + "'", str3.equals("0 30a086399"));
    }

    @Test
    public void DurationFormatUtils1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1268");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 100, (long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.901S" + "'", str2.equals("P-1Y11M30DT23H59M59.901S"));
    }

    @Test
    public void DurationFormatUtils1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1269");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P00-1Y11030DT23059059.90417");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P00-1Y11030DT23059059.90417" + "'", str2.equals("P00-1Y11030DT23059059.90417"));
    }

    @Test
    public void DurationFormatUtils1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1270");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (short) 0, "P0Y0M0DT0H0M0.031S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0311" + "'", str3.equals("P0Y000DT00000.0311"));
    }

    @Test
    public void DurationFormatUtils1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1271");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y000DT00000.0031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0031" + "'", str2.equals("P0Y000DT00000.0031"));
    }

    @Test
    public void DurationFormatUtils1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1272");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y000DT00000.03196");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.03196" + "'", str2.equals("P0Y000DT00000.03196"));
    }

    @Test
    public void DurationFormatUtils1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1273");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), (long) (short) -1, "0:00:00.100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.100" + "'", str3.equals("0:00:00.100"));
    }

    @Test
    public void DurationFormatUtils1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1274");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.0980");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0980" + "'", str2.equals("P0Y000DT00000.0980"));
    }

    @Test
    public void DurationFormatUtils1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1275");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) (byte) 100, "P-1Y11030DT23059059.9000", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1276");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 0, (long) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1277");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (short) -1, "P0Y0-10DT07430-10.0003599990", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1278");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, (long) (short) 0, "0:00:00.100", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1279");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P-1Y11030DT23059059.9901", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9901" + "'", str3.equals("P-1Y11030DT23059059.9901"));
    }

    @Test
    public void DurationFormatUtils1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1280");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 0, (long) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2.equals("P0Y0M0DT0H0M0.001S"));
    }

    @Test
    public void DurationFormatUtils1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1281");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0000Y0-10DT07430-10.0103599913", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y0-10DT07430-10.0103599913" + "'", str3.equals("P0000Y0-10DT07430-10.0103599913"));
    }

    @Test
    public void DurationFormatUtils1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1282");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P-1Y11030DT23059059.9580", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9580" + "'", str3.equals("P-1Y11030DT23059059.9580"));
    }

    @Test
    public void DurationFormatUtils1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1283");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 100, 0L, "P-1Y11030DT23059059.9990", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1284");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (-1), false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1285");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "P-1Y11M30DT23H59M59.900S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9001" + "'", str3.equals("P-1Y11030DT23059059.9001"));
    }

    @Test
    public void DurationFormatUtils1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1286");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) ' ', "P0Y000DT00000.9910");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.9910" + "'", str3.equals("P0Y000DT00000.9910"));
    }

    @Test
    public void DurationFormatUtils1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1287");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y0M0DT0H0M0.009S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0090" + "'", str3.equals("P0Y000DT00000.0090"));
    }

    @Test
    public void DurationFormatUtils1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1288");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) 'a', "P0Y0M0DT0H0M0.034S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1289");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) (byte) -1, "0:00:00.097", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1290");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 10, (long) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.989S" + "'", str2.equals("P-1Y11M30DT23H59M59.989S"));
    }

    @Test
    public void DurationFormatUtils1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1291");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), 0L, "P0Y0-10DT07430-10.0013599947");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0013599947" + "'", str3.equals("P0Y0-10DT07430-10.0013599947"));
    }

    @Test
    public void DurationFormatUtils1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1292");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 100, 0L, "P-1Y11030DT23059059.9900", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1293");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, 0L, "0:00:00.001");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.001" + "'", str3.equals("0:00:00.001"));
    }

    @Test
    public void DurationFormatUtils1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1294");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 10, true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1295");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.0020");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0020" + "'", str2.equals("P0Y000DT00000.0020"));
    }

    @Test
    public void DurationFormatUtils1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1296");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 100, (long) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.997S" + "'", str2.equals("P-1Y11M30DT23H59M59.997S"));
    }

    @Test
    public void DurationFormatUtils1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1297");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0000Y0M0DT0H0M0.051S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.051-1" + "'", str2.equals("P0000Y000DT00000.051-1"));
    }

    @Test
    public void DurationFormatUtils1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1298");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) (-1), "0:00:00.100", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1299");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y0M0DT0H0M0.090S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0900" + "'", str2.equals("P0Y000DT00000.0900"));
    }

    @Test
    public void DurationFormatUtils1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1300");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1301");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 10, (long) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.990S" + "'", str2.equals("P-1Y11M30DT23H59M59.990S"));
    }

    @Test
    public void DurationFormatUtils1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1302");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) '#', "P0Y000DT00000.0100", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1303");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P-1Y11M30DT23H59M59.999S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.99952" + "'", str2.equals("P-1Y11030DT23059059.99952"));
    }

    @Test
    public void DurationFormatUtils1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1304");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.00010", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00010" + "'", str3.equals("P0Y000DT00000.00010"));
    }

    @Test
    public void DurationFormatUtils1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1305");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) 0, "P-1Y11-130DT2374359-159.9103599998", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1306");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P-1Y11-130DT2374359-159.9103599998");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11-130DT2374359-159.9103599998" + "'", str2.equals("P-1Y11-130DT2374359-159.9103599998"));
    }

    @Test
    public void DurationFormatUtils1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1307");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P0000Y0-10DT07430-10.0103599965", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y0-10DT07430-10.0103599965" + "'", str3.equals("P0000Y0-10DT07430-10.0103599965"));
    }

    @Test
    public void DurationFormatUtils1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1308");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) (short) 0, "P0Y0-10DT07430-10.0903599997");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0903599997" + "'", str3.equals("P0Y0-10DT07430-10.0903599997"));
    }

    @Test
    public void DurationFormatUtils1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1309");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) (byte) 100, "0:00:00.097", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1310");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 0, (long) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.999S" + "'", str2.equals("P-1Y11M30DT23H59M59.999S"));
    }

    @Test
    public void DurationFormatUtils1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1311");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) (short) -1, "P0Y0-10DT07430-10.0103599991");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0103599991" + "'", str3.equals("P0Y0-10DT07430-10.0103599991"));
    }

    @Test
    public void DurationFormatUtils1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1312");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P-1Y11-130DT2374359-159.9103599998");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11-130DT2374359-159.9103599998" + "'", str2.equals("P-1Y11-130DT2374359-159.9103599998"));
    }

    @Test
    public void DurationFormatUtils1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1313");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) 10, "P-1Y11-130DT2374359-159.9663599900");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9663599900" + "'", str3.equals("P-1Y11-130DT2374359-159.9663599900"));
    }

    @Test
    public void DurationFormatUtils1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1314");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', (long) (byte) 0, "P-1Y11030DT23059059.9010", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1315");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 100, (long) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1316");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 1, "P0000Y000DT00000.0510", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1317");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P0Y000DT00000.0329", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0329" + "'", str3.equals("P0Y000DT00000.0329"));
    }

    @Test
    public void DurationFormatUtils1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1318");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 10, "P0Y0-10DT07430-10.0033599991", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1319");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, (long) (short) 100, "P0Y000DT00000.096100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.096100" + "'", str3.equals("P0Y000DT00000.096100"));
    }

    @Test
    public void DurationFormatUtils1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1320");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 0, (long) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.999S" + "'", str2.equals("P-1Y11M30DT23H59M59.999S"));
    }

    @Test
    public void DurationFormatUtils1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1321");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((-1L), (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.033S" + "'", str2.equals("P0Y0M0DT0H0M0.033S"));
    }

    @Test
    public void DurationFormatUtils1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1322");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) (-1), "P0000Y000DT00000.10035", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1323");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 0L, "P-1Y11030DT23059059.9581");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9581" + "'", str3.equals("P-1Y11030DT23059059.9581"));
    }

    @Test
    public void DurationFormatUtils1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1324");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, 100L, "P0Y000DT00000.0010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0010" + "'", str3.equals("P0Y000DT00000.0010"));
    }

    @Test
    public void DurationFormatUtils1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1325");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P-1Y11M30DT23H59M59.969S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9690" + "'", str3.equals("P-1Y11030DT23059059.9690"));
    }

    @Test
    public void DurationFormatUtils1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1326");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 1, 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.099S" + "'", str2.equals("P0Y0M0DT0H0M0.099S"));
    }

    @Test
    public void DurationFormatUtils1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1327");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) (short) 0, "0 30a086399");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 30a086399" + "'", str3.equals("0 30a086399"));
    }

    @Test
    public void DurationFormatUtils1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1328");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) '4', (long) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.947S" + "'", str2.equals("P-1Y11M30DT23H59M59.947S"));
    }

    @Test
    public void DurationFormatUtils1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1329");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P0Y0M0DT0H0M0.99S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.9952" + "'", str3.equals("P0Y000DT00000.9952"));
    }

    @Test
    public void DurationFormatUtils1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1330");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P0000Y0-10DT07430-10.0103599913");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y0-10DT07430-10.0103599913" + "'", str2.equals("P0000Y0-10DT07430-10.0103599913"));
    }

    @Test
    public void DurationFormatUtils1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1331");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P0Y0-10DT07430-10.0013599947", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0013599947" + "'", str3.equals("P0Y0-10DT07430-10.0013599947"));
    }

    @Test
    public void DurationFormatUtils1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1332");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', (long) 'a', "P0Y0M0DT0H0M0.097S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1333");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "P-1Y11030DT23059059.9751", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9751" + "'", str3.equals("P-1Y11030DT23059059.9751"));
    }

    @Test
    public void DurationFormatUtils1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1334");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0000Y0M0DT0H0M0.001S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.00110" + "'", str3.equals("P0000Y000DT00000.00110"));
    }

    @Test
    public void DurationFormatUtils1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1335");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(1L, (long) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.998S" + "'", str2.equals("P-1Y11M30DT23H59M59.998S"));
    }

    @Test
    public void DurationFormatUtils1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1336");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 1, 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.009S" + "'", str2.equals("P0Y0M0DT0H0M0.009S"));
    }

    @Test
    public void DurationFormatUtils1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1337");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.9952", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.9952" + "'", str3.equals("P0Y000DT00000.9952"));
    }

    @Test
    public void DurationFormatUtils1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1338");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "0:00:00.097", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.097" + "'", str3.equals("0:00:00.097"));
    }

    @Test
    public void DurationFormatUtils1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1339");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (short) 100, "P0Y000DT00000.00097");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00097" + "'", str3.equals("P0Y000DT00000.00097"));
    }

    @Test
    public void DurationFormatUtils1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1340");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 'a', true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1341");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) ' ', true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1342");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P-1Y11030DT23059059.9030");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9030" + "'", str2.equals("P-1Y11030DT23059059.9030"));
    }

    @Test
    public void DurationFormatUtils1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1343");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (byte) -1, "P0Y000DT00000.0031", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1344");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 100, (long) (short) 10, "P0000Y000DT00000.0100", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1345");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P0Y000DT00000.01035");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.01035" + "'", str2.equals("P0Y000DT00000.01035"));
    }

    @Test
    public void DurationFormatUtils1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1346");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(100L, 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.900S" + "'", str2.equals("P-1Y11M30DT23H59M59.900S"));
    }

    @Test
    public void DurationFormatUtils1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1347");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (-1), 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.011S" + "'", str2.equals("P0Y0M0DT0H0M0.011S"));
    }

    @Test
    public void DurationFormatUtils1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1348");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) 0, "P0Y000DT00000.097100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.097100" + "'", str3.equals("P0Y000DT00000.097100"));
    }

    @Test
    public void DurationFormatUtils1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1349");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', (long) (short) 10, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1350");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) 10, "P0Y000DT00000.031-1", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1351");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 1, (long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.009S" + "'", str2.equals("P0Y0M0DT0H0M0.009S"));
    }

    @Test
    public void DurationFormatUtils1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1352");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P-1Y11030DT23059059.8991");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.8991" + "'", str2.equals("P-1Y11030DT23059059.8991"));
    }

    @Test
    public void DurationFormatUtils1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1353");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P0Y0M0DT0H0M0.032S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0321" + "'", str3.equals("P0Y000DT00000.0321"));
    }

    @Test
    public void DurationFormatUtils1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1354");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 100, 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1355");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, (long) (byte) 100, "P0Y000DT00000.09635");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.09635" + "'", str3.equals("P0Y000DT00000.09635"));
    }

    @Test
    public void DurationFormatUtils1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1356");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, (long) (short) 100, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1357");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (-1), (long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2.equals("P0Y0M0DT0H0M0.001S"));
    }

    @Test
    public void DurationFormatUtils1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1358");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.0031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0031" + "'", str2.equals("P0Y000DT00000.0031"));
    }

    @Test
    public void DurationFormatUtils1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1359");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P-1Y11030DT23059059.98910");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.98910" + "'", str2.equals("P-1Y11030DT23059059.98910"));
    }

    @Test
    public void DurationFormatUtils1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1360");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) -1, (long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.101S" + "'", str2.equals("P0Y0M0DT0H0M0.101S"));
    }

    @Test
    public void DurationFormatUtils1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1361");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P-1Y11030DT23059059.989100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.989100" + "'", str2.equals("P-1Y11030DT23059059.989100"));
    }

    @Test
    public void DurationFormatUtils1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1362");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.00110", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00110" + "'", str3.equals("P0Y000DT00000.00110"));
    }

    @Test
    public void DurationFormatUtils1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1363");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.033-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.033-1" + "'", str2.equals("P0Y000DT00000.033-1"));
    }

    @Test
    public void DurationFormatUtils1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1364");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0000Y000DT00000.0100", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.0100" + "'", str3.equals("P0000Y000DT00000.0100"));
    }

    @Test
    public void DurationFormatUtils1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1365");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), (long) (short) -1, "P0Y0M0DT0H0M0.031S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1366");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "P-1Y11030DT23059059.968100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.968100" + "'", str2.equals("P-1Y11030DT23059059.968100"));
    }

    @Test
    public void DurationFormatUtils1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1367");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y0-10DT07430-10.0333599899", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0333599899" + "'", str3.equals("P0Y0-10DT07430-10.0333599899"));
    }

    @Test
    public void DurationFormatUtils1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1368");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, 100L, "P0Y0M0DT0H0M0.001S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1369");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, 0L, "P0Y000DT00000.10135", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1370");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P-1Y11M30DT23H59M59.902S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9020" + "'", str2.equals("P-1Y11030DT23059059.9020"));
    }

    @Test
    public void DurationFormatUtils1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1371");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) (byte) 0, "0 30a059 0 hour 0 1439inute59 0 econ3059");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 30a059 0 hour 0 1439inute59 0 econ3059" + "'", str3.equals("0 30a059 0 hour 0 1439inute59 0 econ3059"));
    }

    @Test
    public void DurationFormatUtils1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1372");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) (short) 1, "P-1Y11030DT23059059.9911", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1373");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', (long) 10, "P00-1Y11030DT23059059.999101", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1374");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, (long) (byte) 100, "P0Y000DT00000.00097");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00097" + "'", str3.equals("P0Y000DT00000.00097"));
    }

    @Test
    public void DurationFormatUtils1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1375");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y0M0DT0H0M0.035S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.03510" + "'", str2.equals("P0Y000DT00000.03510"));
    }

    @Test
    public void DurationFormatUtils1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1376");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (-1L), "P0Y0-10DT07430-10.0003599990");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0003599990" + "'", str3.equals("P0Y0-10DT07430-10.0003599990"));
    }

    @Test
    public void DurationFormatUtils1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1377");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P-1Y11M30DT23H59M59.983S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9830" + "'", str3.equals("P-1Y11030DT23059059.9830"));
    }

    @Test
    public void DurationFormatUtils1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1378");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y0M0DT0H0M0.042S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.042-1" + "'", str2.equals("P0Y000DT00000.042-1"));
    }

    @Test
    public void DurationFormatUtils1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1379");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', (long) 100, "P0Y0-10DT07430-10.0333599899");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0333599899" + "'", str3.equals("P0Y0-10DT07430-10.0333599899"));
    }

    @Test
    public void DurationFormatUtils1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1380");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "P-1Y11M30DT23H59M59.983S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9830" + "'", str3.equals("P-1Y11030DT23059059.9830"));
    }

    @Test
    public void DurationFormatUtils1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1381");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.0039");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0039" + "'", str2.equals("P0Y000DT00000.0039"));
    }

    @Test
    public void DurationFormatUtils1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1382");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (short) 10, "P-1Y11-130DT2374359-159.9103599998");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9103599998" + "'", str3.equals("P-1Y11-130DT2374359-159.9103599998"));
    }

    @Test
    public void DurationFormatUtils1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1383");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.0321", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0321" + "'", str3.equals("P0Y000DT00000.0321"));
    }

    @Test
    public void DurationFormatUtils1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1384");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P00-1Y11030DT23059059.999101", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.999101" + "'", str3.equals("P00-1Y11030DT23059059.999101"));
    }

    @Test
    public void DurationFormatUtils1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1385");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P0000Y000DT00000.9910", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.9910" + "'", str3.equals("P0000Y000DT00000.9910"));
    }

    @Test
    public void DurationFormatUtils1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1386");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 100, (long) (byte) -1, "P0Y000DT00000.0100", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1387");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 0, (long) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1388");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P0Y0M0DT0H0M0.033S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03310" + "'", str3.equals("P0Y000DT00000.03310"));
    }

    @Test
    public void DurationFormatUtils1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1389");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.0010", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0010" + "'", str3.equals("P0Y000DT00000.0010"));
    }

    @Test
    public void DurationFormatUtils1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1390");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, (long) (-1), "P0000Y000DT00000.01032", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1391");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', 10L, "P-1Y11M30DT23H59M59.902S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1392");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y000DT00000.01010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.01010" + "'", str2.equals("P0Y000DT00000.01010"));
    }

    @Test
    public void DurationFormatUtils1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1393");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) '4', "P0Y000DT00000.001100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.001100" + "'", str3.equals("P0Y000DT00000.001100"));
    }

    @Test
    public void DurationFormatUtils1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1394");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.096-1", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.096-1" + "'", str3.equals("P0Y000DT00000.096-1"));
    }

    @Test
    public void DurationFormatUtils1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1395");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, (long) (short) -1, "P0Y000DT00000.0420", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1396");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "0:00:00.032");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0:00:00.032" + "'", str2.equals("0:00:00.032"));
    }

    @Test
    public void DurationFormatUtils1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1397");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) (byte) 1, "P0000Y000DT00000.010100", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1398");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, (long) (short) 1, "P-1Y11030DT23059059.90010", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1399");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.0090", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0090" + "'", str3.equals("P0Y000DT00000.0090"));
    }

    @Test
    public void DurationFormatUtils1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1400");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 10, 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.991S" + "'", str2.equals("P-1Y11M30DT23H59M59.991S"));
    }

    @Test
    public void DurationFormatUtils1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1401");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, 10L, "P0Y0M0DT0H0M0.003S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00311" + "'", str3.equals("P0Y000DT00000.00311"));
    }

    @Test
    public void DurationFormatUtils1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1402");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 100, (long) '#', "P-1Y11030DT23059059.91090");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.91090" + "'", str3.equals("P-1Y11030DT23059059.91090"));
    }

    @Test
    public void DurationFormatUtils1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1403");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, 0L, "P-1Y11M30DT23H59M59.975S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9753599990" + "'", str3.equals("P-1Y11-130DT2374359-159.9753599990"));
    }

    @Test
    public void DurationFormatUtils1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1404");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) -1, (long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.101S" + "'", str2.equals("P0Y0M0DT0H0M0.101S"));
    }

    @Test
    public void DurationFormatUtils1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1405");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, (long) (byte) 10, "P0000Y000DT00000.0510", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1406");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (-1), "P-1Y11030DT23059059.9901", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1407");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y000DT00000.0031", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0031" + "'", str3.equals("P0Y000DT00000.0031"));
    }

    @Test
    public void DurationFormatUtils1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1408");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void DurationFormatUtils1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1409");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "P-1Y11-130DT2374359-159.9893599913", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9893599913" + "'", str3.equals("P-1Y11-130DT2374359-159.9893599913"));
    }

    @Test
    public void DurationFormatUtils1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1410");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((-1L), (long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.011S" + "'", str2.equals("P0Y0M0DT0H0M0.011S"));
    }

    @Test
    public void DurationFormatUtils1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1411");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 1, (long) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.998S" + "'", str2.equals("P-1Y11M30DT23H59M59.998S"));
    }

    @Test
    public void DurationFormatUtils1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1412");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((-1L), (long) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.101S" + "'", str2.equals("P0Y0M0DT0H0M0.101S"));
    }

    @Test
    public void DurationFormatUtils1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1413");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) 100, "0:00:00.010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.010" + "'", str3.equals("0:00:00.010"));
    }

    @Test
    public void DurationFormatUtils1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1414");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P0Y000DT00000.00099", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00099" + "'", str3.equals("P0Y000DT00000.00099"));
    }

    @Test
    public void DurationFormatUtils1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1415");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, (long) (short) 0, "P-1Y11030DT23059059.9890");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9890" + "'", str3.equals("P-1Y11030DT23059059.9890"));
    }

    @Test
    public void DurationFormatUtils1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1416");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 0, 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2.equals("P0Y0M0DT0H0M0.001S"));
    }

    @Test
    public void DurationFormatUtils1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1417");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P-1Y11-130DT2374359-159.9753599990", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9753599990" + "'", str3.equals("P-1Y11-130DT2374359-159.9753599990"));
    }

    @Test
    public void DurationFormatUtils1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1418");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.06587");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.06587" + "'", str2.equals("P0Y000DT00000.06587"));
    }

    @Test
    public void DurationFormatUtils1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1419");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) ' ', "P00-1Y11030DT23059059.9990", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1420");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.0320");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0320" + "'", str2.equals("P0Y000DT00000.0320"));
    }

    @Test
    public void DurationFormatUtils1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1421");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 'a', (long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.913S" + "'", str2.equals("P-1Y11M30DT23H59M59.913S"));
    }

    @Test
    public void DurationFormatUtils1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1422");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) '#', "P-1Y11M30DT23H59M59.991S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.99134" + "'", str3.equals("P-1Y11030DT23059059.99134"));
    }

    @Test
    public void DurationFormatUtils1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1423");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P-1Y11M30DT23H59M59.968S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.96852" + "'", str2.equals("P-1Y11030DT23059059.96852"));
    }

    @Test
    public void DurationFormatUtils1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1424");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, 0L, "P0Y0M0DT0H0M0.011S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1425");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.0310", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0310" + "'", str3.equals("P0Y000DT00000.0310"));
    }

    @Test
    public void DurationFormatUtils1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1426");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P-1Y11M30DT23H59M59.997S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9971" + "'", str2.equals("P-1Y11030DT23059059.9971"));
    }

    @Test
    public void DurationFormatUtils1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1427");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y0M0DT0H0M0.065S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.065100" + "'", str2.equals("P0Y000DT00000.065100"));
    }

    @Test
    public void DurationFormatUtils1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1428");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 1, (long) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.998S" + "'", str2.equals("P-1Y11M30DT23H59M59.998S"));
    }

    @Test
    public void DurationFormatUtils1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1429");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P00-1Y11-130DT2374359-159.9043599990");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P00-1Y11-130DT2374359-159.9043599990" + "'", str2.equals("P00-1Y11-130DT2374359-159.9043599990"));
    }

    @Test
    public void DurationFormatUtils1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1430");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) 10, "P0Y000DT00000.03133");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03133" + "'", str3.equals("P0Y000DT00000.03133"));
    }

    @Test
    public void DurationFormatUtils1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1431");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P0000Y000DT00000.0510");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.0510" + "'", str2.equals("P0000Y000DT00000.0510"));
    }

    @Test
    public void DurationFormatUtils1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1432");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, 0L, "P0Y0-10DT07430-10.0333599899");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0333599899" + "'", str3.equals("P0Y0-10DT07430-10.0333599899"));
    }

    @Test
    public void DurationFormatUtils1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1433");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "0:00:00.000");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0:00:00.000" + "'", str2.equals("0:00:00.000"));
    }

    @Test
    public void DurationFormatUtils1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1434");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', (long) ' ', "P-1Y11030DT23059059.90132", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1435");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.031-1", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.031-1" + "'", str3.equals("P0Y000DT00000.031-1"));
    }

    @Test
    public void DurationFormatUtils1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1436");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y000DT00000.00010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.00010" + "'", str2.equals("P0Y000DT00000.00010"));
    }

    @Test
    public void DurationFormatUtils1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1437");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (byte) 1, false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1438");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) (byte) 0, "P0Y0M0DT0H0M0.090S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0903599999" + "'", str3.equals("P0Y0-10DT07430-10.0903599999"));
    }

    @Test
    public void DurationFormatUtils1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1439");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P0Y000DT00000.0870");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0870" + "'", str2.equals("P0Y000DT00000.0870"));
    }

    @Test
    public void DurationFormatUtils1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1440");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P0000Y000DT00000.10010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.10010" + "'", str2.equals("P0000Y000DT00000.10010"));
    }

    @Test
    public void DurationFormatUtils1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1441");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.0010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0010" + "'", str2.equals("P0Y000DT00000.0010"));
    }

    @Test
    public void DurationFormatUtils1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1442");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y0-10DT07430-10.0513599999");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0-10DT07430-10.0513599999" + "'", str2.equals("P0Y0-10DT07430-10.0513599999"));
    }

    @Test
    public void DurationFormatUtils1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1443");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, (long) 100, "P-1Y11030DT23059059.9581", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1444");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) (byte) 100, "P0Y000DT00000.0011");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0011" + "'", str3.equals("P0Y000DT00000.0011"));
    }

    @Test
    public void DurationFormatUtils1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1445");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(0L, (long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2.equals("P0Y0M0DT0H0M0.001S"));
    }

    @Test
    public void DurationFormatUtils1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1446");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, 0L, "P-1Y11030DT23059059.9690");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9690" + "'", str3.equals("P-1Y11030DT23059059.9690"));
    }

    @Test
    public void DurationFormatUtils1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1447");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (-1L), "P0Y0M0DT0H0M0.003S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0033599899" + "'", str3.equals("P0Y0-10DT07430-10.0033599899"));
    }

    @Test
    public void DurationFormatUtils1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1448");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, (long) 0, "P0Y000DT00000.01032");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.01032" + "'", str3.equals("P0Y000DT00000.01032"));
    }

    @Test
    public void DurationFormatUtils1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1449");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, (long) (short) 100, "P0Y000DT00000.051-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.051-1" + "'", str3.equals("P0Y000DT00000.051-1"));
    }

    @Test
    public void DurationFormatUtils1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1450");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, 100L, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1451");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "P-1Y11M30DT23H59M59.990S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.99010" + "'", str3.equals("P-1Y11030DT23059059.99010"));
    }

    @Test
    public void DurationFormatUtils1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1452");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) 100, "P0Y000DT00000.097100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.097100" + "'", str3.equals("P0Y000DT00000.097100"));
    }

    @Test
    public void DurationFormatUtils1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1453");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y000DT00000.0030", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0030" + "'", str3.equals("P0Y000DT00000.0030"));
    }

    @Test
    public void DurationFormatUtils1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1454");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P0Y000DT00000.00153");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.00153" + "'", str2.equals("P0Y000DT00000.00153"));
    }

    @Test
    public void DurationFormatUtils1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1455");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y0M0DT0H0M0.000S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0000" + "'", str3.equals("P0Y000DT00000.0000"));
    }

    @Test
    public void DurationFormatUtils1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1456");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 100, (long) 10, "P-1Y11M30DT23H59M59.952S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1457");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) (byte) 1, "P-1Y11030DT23059059.99810", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1458");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 0, (long) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.100S" + "'", str2.equals("P0Y0M0DT0H0M0.100S"));
    }

    @Test
    public void DurationFormatUtils1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1459");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', 1L, "P0Y000DT00000.097100", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1460");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) ' ', (long) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.967S" + "'", str2.equals("P-1Y11M30DT23H59M59.967S"));
    }

    @Test
    public void DurationFormatUtils1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1461");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P0000Y000DT00000.0011");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.0011" + "'", str2.equals("P0000Y000DT00000.0011"));
    }

    @Test
    public void DurationFormatUtils1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1462");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((-1L), true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1463");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "P-1Y11M30DT23H59M59.978S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.978100" + "'", str3.equals("P-1Y11030DT23059059.978100"));
    }

    @Test
    public void DurationFormatUtils1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1464");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0000Y0-10DT07430-10.0103599965");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y0-10DT07430-10.0103599965" + "'", str2.equals("P0000Y0-10DT07430-10.0103599965"));
    }

    @Test
    public void DurationFormatUtils1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1465");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) (byte) 1, "P-1Y11030DT23059059.9901");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9901" + "'", str3.equals("P-1Y11030DT23059059.9901"));
    }

    @Test
    public void DurationFormatUtils1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1466");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P-1Y11-130DT2374359-159.9663599900", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9663599900" + "'", str3.equals("P-1Y11-130DT2374359-159.9663599900"));
    }

    @Test
    public void DurationFormatUtils1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1467");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', 100L, "P0Y0M0DT0H0M0.025S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1468");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y0M0DT0H0M0.031S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0310" + "'", str2.equals("P0Y000DT00000.0310"));
    }

    @Test
    public void DurationFormatUtils1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1469");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P-1Y11030DT23059059.968100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.968100" + "'", str2.equals("P-1Y11030DT23059059.968100"));
    }

    @Test
    public void DurationFormatUtils1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1470");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1471");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void DurationFormatUtils1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1472");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 100, (-1L), "P0Y000DT00000.0329", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1473");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) 'a', "P-1Y11030DT23059059.952-1", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1474");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.096100", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.096100" + "'", str3.equals("P0Y000DT00000.096100"));
    }

    @Test
    public void DurationFormatUtils1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1475");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) '#', "", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1476");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P0Y0M0DT0H0M0.096S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.096100" + "'", str3.equals("P0Y000DT00000.096100"));
    }

    @Test
    public void DurationFormatUtils1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1477");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "P-1Y11030DT23059059.952-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.952-1" + "'", str2.equals("P-1Y11030DT23059059.952-1"));
    }

    @Test
    public void DurationFormatUtils1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1478");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P-1Y11M30DT23H59M59.932S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9320" + "'", str2.equals("P-1Y11030DT23059059.9320"));
    }

    @Test
    public void DurationFormatUtils1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1479");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 100, (long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.910S" + "'", str2.equals("P-1Y11M30DT23H59M59.910S"));
    }

    @Test
    public void DurationFormatUtils1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1480");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "0 0econ00", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 0econ00" + "'", str3.equals("0 0econ00"));
    }

    @Test
    public void DurationFormatUtils1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1481");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 10, (long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1482");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) 100, "P0Y0M0DT0H0M0.025S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1483");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y0M0DT0H0M0.002S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.002100" + "'", str3.equals("P0Y000DT00000.002100"));
    }

    @Test
    public void DurationFormatUtils1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1484");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void DurationFormatUtils1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1485");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "P-1Y11030DT23059059.9690", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9690" + "'", str3.equals("P-1Y11030DT23059059.9690"));
    }

    @Test
    public void DurationFormatUtils1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1486");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(1L, (long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.999S" + "'", str2.equals("P-1Y11M30DT23H59M59.999S"));
    }

    @Test
    public void DurationFormatUtils1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1487");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P0Y0M0DT0H0M0.022S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.022-1" + "'", str2.equals("P0Y000DT00000.022-1"));
    }

    @Test
    public void DurationFormatUtils1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1488");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y000DT00000.0900");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0900" + "'", str2.equals("P0Y000DT00000.0900"));
    }

    @Test
    public void DurationFormatUtils1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1489");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 1L, "P-1Y11030DT23059059.9901");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9901" + "'", str3.equals("P-1Y11030DT23059059.9901"));
    }

    @Test
    public void DurationFormatUtils1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1490");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 100, 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.910S" + "'", str2.equals("P-1Y11M30DT23H59M59.910S"));
    }

    @Test
    public void DurationFormatUtils1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1491");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) '#', "P-1Y11030DT23059059.9030");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9030" + "'", str3.equals("P-1Y11030DT23059059.9030"));
    }

    @Test
    public void DurationFormatUtils1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1492");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P-1Y11030DT23059059.9660");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9660" + "'", str2.equals("P-1Y11030DT23059059.9660"));
    }

    @Test
    public void DurationFormatUtils1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1493");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, (long) (short) 1, "0:00:00.052");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.052" + "'", str3.equals("0:00:00.052"));
    }

    @Test
    public void DurationFormatUtils1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1494");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) -1, (long) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1495");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) ' ', "0 0a00 0 hour 0 0inute0 0 econ00");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 0a00 0 hour 0 0inute0 0 econ00" + "'", str3.equals("0 0a00 0 hour 0 0inute0 0 econ00"));
    }

    @Test
    public void DurationFormatUtils1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1496");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y000DT00000.031-1", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.031-1" + "'", str3.equals("P0Y000DT00000.031-1"));
    }

    @Test
    public void DurationFormatUtils1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1497");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, 0L, "P0Y000DT00000.0310", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1498");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "P-1Y11M30DT23H59M59.901S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.901100" + "'", str2.equals("P-1Y11030DT23059059.901100"));
    }

    @Test
    public void DurationFormatUtils1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1499");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.9910", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.9910" + "'", str3.equals("P0Y000DT00000.9910"));
    }

    @Test
    public void DurationFormatUtils1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils2.DurationFormatUtils1500");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 10L, "P-1Y11M30DT23H59M59.969S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }
}

