package DurationFormatUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DurationFormatUtils0 {

    public static boolean debug = false;

    @Test
    public void DurationFormatUtils0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0001");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str1.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0002");
        java.lang.String str0 = org.apache.commons.lang3.time.DurationFormatUtils.ISO_EXTENDED_FORMAT_PATTERN;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'" + "'", str0.equals("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'"));
    }

    @Test
    public void DurationFormatUtils0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0003");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.99" + "'", str1.equals("0:00:00.99"));
    }

    @Test
    public void DurationFormatUtils0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0004");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 'a', 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.903S" + "'", str2.equals("P-1Y11M30DT23H59M59.903S"));
    }

    @Test
    public void DurationFormatUtils0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0005");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) 0, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11M30DT23H59M59.999S" + "'", str3.equals("P00-1Y11M30DT23H59M59.999S"));
    }

    @Test
    public void DurationFormatUtils0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0006");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, (long) 0, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0007");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 10, 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.990S" + "'", str2.equals("P-1Y11M30DT23H59M59.990S"));
    }

    @Test
    public void DurationFormatUtils0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0008");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, 0L, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0009");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) -1, "P0Y0M0DT0H0M0.000S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0010");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P-1Y11M30DT23H59M59.990S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9901" + "'", str3.equals("P-1Y11030DT23059059.9901"));
    }

    @Test
    public void DurationFormatUtils0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0011");
        org.apache.commons.lang3.time.DurationFormatUtils durationFormatUtils0 = new org.apache.commons.lang3.time.DurationFormatUtils();
        java.lang.Class<?> wildcardClass1 = durationFormatUtils0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void DurationFormatUtils0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0012");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void DurationFormatUtils0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0013");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) 1, "0:00:00.99", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0014");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (byte) 10, false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0015");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 10L, "0:00:00.99", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0016");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 1, true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0017");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords(0L, true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0018");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 0, 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0019");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 100, true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0020");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P-1Y11M30DT23H59M59.903S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.90352" + "'", str3.equals("P-1Y11030DT23059059.90352"));
    }

    @Test
    public void DurationFormatUtils0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0021");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) (short) -1, "P-1Y11M30DT23H59M59.903S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0022");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "P0Y0M0DT0H0M0.000S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.00010" + "'", str2.equals("P0Y000DT00000.00010"));
    }

    @Test
    public void DurationFormatUtils0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0023");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (-1), (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.033S" + "'", str2.equals("P0Y0M0DT0H0M0.033S"));
    }

    @Test
    public void DurationFormatUtils0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0024");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (short) 10, false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0025");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), (long) (byte) 1, "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void DurationFormatUtils0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0026");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', (long) 100, "0:00:00.99", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0027");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 100, false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0028");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (byte) -1, false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0029");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str1.equals("P0Y0M0DT0H0M0.001S"));
    }

    @Test
    public void DurationFormatUtils0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0030");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.010S" + "'", str1.equals("P0Y0M0DT0H0M0.010S"));
    }

    @Test
    public void DurationFormatUtils0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0031");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) 'a', "0 days 0 hours 0 minutes 0 seconds", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0032");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y0M0DT0H0M0.033S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.03310" + "'", str2.equals("P0Y000DT00000.03310"));
    }

    @Test
    public void DurationFormatUtils0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0033");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void DurationFormatUtils0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0034");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (short) 1, "P0Y000DT00000.00010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00010" + "'", str3.equals("P0Y000DT00000.00010"));
    }

    @Test
    public void DurationFormatUtils0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0035");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) ' ', "P0Y0M0DT0H0M0.033S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0036");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS(100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.100" + "'", str1.equals("0:00:00.100"));
    }

    @Test
    public void DurationFormatUtils0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0037");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P0Y0M0DT0H0M0.010S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.01035" + "'", str2.equals("P0Y000DT00000.01035"));
    }

    @Test
    public void DurationFormatUtils0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0038");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO(0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str1.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0039");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void DurationFormatUtils0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0040");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (-1L), "0 days 0 hours 0 minutes 0 seconds");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 30a059 0 hour 0 1439inute59 0 econ3059" + "'", str3.equals("0 30a059 0 hour 0 1439inute59 0 econ3059"));
    }

    @Test
    public void DurationFormatUtils0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0041");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) (byte) 10, "P0Y000DT00000.00010", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0042");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.032" + "'", str1.equals("0:00:00.032"));
    }

    @Test
    public void DurationFormatUtils0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0043");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (short) 10, false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0044");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.001" + "'", str1.equals("0:00:00.001"));
    }

    @Test
    public void DurationFormatUtils0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0045");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P00-1Y11M30DT23H59M59.999S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.99910" + "'", str3.equals("P00-1Y11030DT23059059.99910"));
    }

    @Test
    public void DurationFormatUtils0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0046");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void DurationFormatUtils0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0047");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO(10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.010S" + "'", str1.equals("P0Y0M0DT0H0M0.010S"));
    }

    @Test
    public void DurationFormatUtils0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0048");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 1L, "0:00:00.032");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.032" + "'", str3.equals("0:00:00.032"));
    }

    @Test
    public void DurationFormatUtils0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0049");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.100S" + "'", str1.equals("P0Y0M0DT0H0M0.100S"));
    }

    @Test
    public void DurationFormatUtils0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0050");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), (long) (short) 0, "0 30a059 0 hour 0 1439inute59 0 econ3059", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0051");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', 0L, "P0Y0M0DT0H0M0.033S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0052");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, 1L, "", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0053");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (short) 0, "0 days");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 30a086399" + "'", str3.equals("0 30a086399"));
    }

    @Test
    public void DurationFormatUtils0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0054");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) (short) 100, "0:00:00.001");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.001" + "'", str3.equals("0:00:00.001"));
    }

    @Test
    public void DurationFormatUtils0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0055");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS(0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.000" + "'", str1.equals("0:00:00.000"));
    }

    @Test
    public void DurationFormatUtils0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0056");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords(1L, false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0057");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "0:00:00.99", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.99" + "'", str3.equals("0:00:00.99"));
    }

    @Test
    public void DurationFormatUtils0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0058");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.000" + "'", str1.equals("0:00:00.000"));
    }

    @Test
    public void DurationFormatUtils0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0059");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.99S" + "'", str1.equals("P0Y0M0DT0H0M0.99S"));
    }

    @Test
    public void DurationFormatUtils0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0060");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y0M0DT0H0M0.010S" + "'", str2.equals("P0000Y0M0DT0H0M0.010S"));
    }

    @Test
    public void DurationFormatUtils0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0061");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.032S" + "'", str1.equals("P0Y0M0DT0H0M0.032S"));
    }

    @Test
    public void DurationFormatUtils0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0062");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P0Y0M0DT0H0M0.001S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00110" + "'", str3.equals("P0Y000DT00000.00110"));
    }

    @Test
    public void DurationFormatUtils0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0063");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.00110", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00110" + "'", str3.equals("P0Y000DT00000.00110"));
    }

    @Test
    public void DurationFormatUtils0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0064");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', 1L, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11M30DT23H59M59.904S" + "'", str3.equals("P00-1Y11M30DT23H59M59.904S"));
    }

    @Test
    public void DurationFormatUtils0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0065");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P-1Y11030DT23059059.90352", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.90352" + "'", str3.equals("P-1Y11030DT23059059.90352"));
    }

    @Test
    public void DurationFormatUtils0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0066");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 1, (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.031S" + "'", str2.equals("P0Y0M0DT0H0M0.031S"));
    }

    @Test
    public void DurationFormatUtils0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0067");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, 100L, "0:00:00.99", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0068");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 100, (long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.910S" + "'", str2.equals("P-1Y11M30DT23H59M59.910S"));
    }

    @Test
    public void DurationFormatUtils0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0069");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 0, (long) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.999S" + "'", str2.equals("P-1Y11M30DT23H59M59.999S"));
    }

    @Test
    public void DurationFormatUtils0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0070");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(0L, (long) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.100S" + "'", str2.equals("P0Y0M0DT0H0M0.100S"));
    }

    @Test
    public void DurationFormatUtils0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0071");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str1.equals("P0Y0M0DT0H0M0.001S"));
    }

    @Test
    public void DurationFormatUtils0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0072");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.00110", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00110" + "'", str3.equals("P0Y000DT00000.00110"));
    }

    @Test
    public void DurationFormatUtils0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0073");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) (-1), "0:00:00.100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.100" + "'", str3.equals("0:00:00.100"));
    }

    @Test
    public void DurationFormatUtils0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0074");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "P0Y0M0DT0H0M0.010S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.01010" + "'", str3.equals("P0Y000DT00000.01010"));
    }

    @Test
    public void DurationFormatUtils0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0075");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) ' ', (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0076");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.052" + "'", str1.equals("0:00:00.052"));
    }

    @Test
    public void DurationFormatUtils0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0077");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "0 days 0 hours 0 minutes 0 seconds", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 0a00 0 hour 0 0inute0 0 econ00" + "'", str3.equals("0 0a00 0 hour 0 0inute0 0 econ00"));
    }

    @Test
    public void DurationFormatUtils0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0078");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 0, (long) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.100S" + "'", str2.equals("P0Y0M0DT0H0M0.100S"));
    }

    @Test
    public void DurationFormatUtils0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0079");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 'a', true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0080");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS(10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.010" + "'", str1.equals("0:00:00.010"));
    }

    @Test
    public void DurationFormatUtils0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0081");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "P-1Y11M30DT23H59M59.990S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9901" + "'", str3.equals("P-1Y11030DT23059059.9901"));
    }

    @Test
    public void DurationFormatUtils0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0082");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0083");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.99S" + "'", str1.equals("P0Y0M0DT0H0M0.99S"));
    }

    @Test
    public void DurationFormatUtils0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0084");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO(100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.100S" + "'", str1.equals("P0Y0M0DT0H0M0.100S"));
    }

    @Test
    public void DurationFormatUtils0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0085");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "P0000Y0M0DT0H0M0.010S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.01032" + "'", str3.equals("P0000Y000DT00000.01032"));
    }

    @Test
    public void DurationFormatUtils0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0086");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.097" + "'", str1.equals("0:00:00.097"));
    }

    @Test
    public void DurationFormatUtils0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0087");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y0M0DT0H0M0.033S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.033-1" + "'", str2.equals("P0Y000DT00000.033-1"));
    }

    @Test
    public void DurationFormatUtils0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0088");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) '#', "P00-1Y11030DT23059059.99910");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.99910" + "'", str3.equals("P00-1Y11030DT23059059.99910"));
    }

    @Test
    public void DurationFormatUtils0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0089");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (short) 10, "P0Y0M0DT0H0M0.032S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03211" + "'", str3.equals("P0Y000DT00000.03211"));
    }

    @Test
    public void DurationFormatUtils0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0090");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) (short) 100, "P00-1Y11M30DT23H59M59.999S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.99999" + "'", str3.equals("P00-1Y11030DT23059059.99999"));
    }

    @Test
    public void DurationFormatUtils0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0091");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "0:00:00.010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0:00:00.010" + "'", str2.equals("0:00:00.010"));
    }

    @Test
    public void DurationFormatUtils0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0092");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) 0, "0:00:00.99", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0093");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (byte) 100, true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0094");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) '#', true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0095");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 'a', (long) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.903S" + "'", str2.equals("P-1Y11M30DT23H59M59.903S"));
    }

    @Test
    public void DurationFormatUtils0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0096");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.035" + "'", str1.equals("0:00:00.035"));
    }

    @Test
    public void DurationFormatUtils0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0097");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.03211", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03211" + "'", str3.equals("P0Y000DT00000.03211"));
    }

    @Test
    public void DurationFormatUtils0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0098");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "P0Y0M0DT0H0M0.032S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.03210" + "'", str2.equals("P0Y000DT00000.03210"));
    }

    @Test
    public void DurationFormatUtils0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0099");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) '4', "P-1Y11M30DT23H59M59.999S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0100");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(0L, (long) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.035S" + "'", str2.equals("P0Y0M0DT0H0M0.035S"));
    }

    @Test
    public void DurationFormatUtils0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0101");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, 0L, "P00-1Y11030DT23059059.99910", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0102");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(0L, (long) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0103");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) (short) 100, "P0Y0M0DT0H0M0.001S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.001100" + "'", str3.equals("P0Y000DT00000.001100"));
    }

    @Test
    public void DurationFormatUtils0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0104");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.99S" + "'", str1.equals("P0Y0M0DT0H0M0.99S"));
    }

    @Test
    public void DurationFormatUtils0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0105");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P-1Y11M30DT23H59M59.990S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9900" + "'", str2.equals("P-1Y11030DT23059059.9900"));
    }

    @Test
    public void DurationFormatUtils0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0106");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, (long) 100, "P0000Y0M0DT0H0M0.010S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.01099" + "'", str3.equals("P0000Y000DT00000.01099"));
    }

    @Test
    public void DurationFormatUtils0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0107");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) 100, "P-1Y11030DT23059059.9900", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0108");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords(1L, false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0109");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', 1L, "0 days");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 30a086399" + "'", str3.equals("0 30a086399"));
    }

    @Test
    public void DurationFormatUtils0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0110");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (byte) 100, true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0111");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P0000Y000DT00000.01099", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.01099" + "'", str3.equals("P0000Y000DT00000.01099"));
    }

    @Test
    public void DurationFormatUtils0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0112");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 1, (long) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.051S" + "'", str2.equals("P0Y0M0DT0H0M0.051S"));
    }

    @Test
    public void DurationFormatUtils0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0113");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str1.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0114");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (-1), false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0115");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.010" + "'", str1.equals("0:00:00.010"));
    }

    @Test
    public void DurationFormatUtils0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0116");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (byte) 1, true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0117");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (byte) 0, false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0118");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "0:00:00.001", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.001" + "'", str3.equals("0:00:00.001"));
    }

    @Test
    public void DurationFormatUtils0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0119");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', (long) (short) -1, "P0Y0M0DT0H0M0.001S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0013599947" + "'", str3.equals("P0Y0-10DT07430-10.0013599947"));
    }

    @Test
    public void DurationFormatUtils0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0120");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "0:00:00.052");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0:00:00.052" + "'", str2.equals("0:00:00.052"));
    }

    @Test
    public void DurationFormatUtils0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0121");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.100" + "'", str1.equals("0:00:00.100"));
    }

    @Test
    public void DurationFormatUtils0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0122");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 10, 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.991S" + "'", str2.equals("P-1Y11M30DT23H59M59.991S"));
    }

    @Test
    public void DurationFormatUtils0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0123");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 0, 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2.equals("P0Y0M0DT0H0M0.001S"));
    }

    @Test
    public void DurationFormatUtils0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0124");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 10, (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.989S" + "'", str2.equals("P-1Y11M30DT23H59M59.989S"));
    }

    @Test
    public void DurationFormatUtils0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0125");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) '#', "P00-1Y11M30DT23H59M59.999S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.9993" + "'", str3.equals("P00-1Y11030DT23059059.9993"));
    }

    @Test
    public void DurationFormatUtils0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0126");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) (byte) 100, "P-1Y11M30DT23H59M59.910S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0127");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.00110");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.00110" + "'", str2.equals("P0Y000DT00000.00110"));
    }

    @Test
    public void DurationFormatUtils0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0128");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.03211");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.03211" + "'", str2.equals("P0Y000DT00000.03211"));
    }

    @Test
    public void DurationFormatUtils0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0129");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "0:00:00.032");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0:00:00.032" + "'", str2.equals("0:00:00.032"));
    }

    @Test
    public void DurationFormatUtils0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0130");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "0 seconds");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0 0econ00" + "'", str2.equals("0 0econ00"));
    }

    @Test
    public void DurationFormatUtils0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0131");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, (long) (short) 1, "0 0a00 0 hour 0 0inute0 0 econ00");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 0a00 0 hour 0 0inute0 0 econ00" + "'", str3.equals("0 0a00 0 hour 0 0inute0 0 econ00"));
    }

    @Test
    public void DurationFormatUtils0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0132");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y0M0DT0H0M0.051S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.051-1" + "'", str3.equals("P0Y000DT00000.051-1"));
    }

    @Test
    public void DurationFormatUtils0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0133");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (byte) 10, true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0134");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (short) -1, "0:00:00.010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.010" + "'", str3.equals("0:00:00.010"));
    }

    @Test
    public void DurationFormatUtils0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0135");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) (short) 1, "0:00:00.010", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0136");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.000" + "'", str1.equals("0:00:00.000"));
    }

    @Test
    public void DurationFormatUtils0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0137");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (short) 0, false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0138");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.00110", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00110" + "'", str3.equals("P0Y000DT00000.00110"));
    }

    @Test
    public void DurationFormatUtils0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0139");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "0:00:00.100", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.100" + "'", str3.equals("0:00:00.100"));
    }

    @Test
    public void DurationFormatUtils0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0140");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, (long) 1, "", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0141");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) (byte) 0, "P0Y0M0DT0H0M0.035S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0350" + "'", str3.equals("P0Y000DT00000.0350"));
    }

    @Test
    public void DurationFormatUtils0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0142");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, 10L, "0:00:00.99");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.99" + "'", str3.equals("0:00:00.99"));
    }

    @Test
    public void DurationFormatUtils0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0143");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.001" + "'", str1.equals("0:00:00.001"));
    }

    @Test
    public void DurationFormatUtils0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0144");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P0Y0M0DT0H0M0.010S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.01052" + "'", str2.equals("P0Y000DT00000.01052"));
    }

    @Test
    public void DurationFormatUtils0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0145");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.100" + "'", str1.equals("0:00:00.100"));
    }

    @Test
    public void DurationFormatUtils0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0146");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P-1Y11030DT23059059.9900", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9900" + "'", str3.equals("P-1Y11030DT23059059.9900"));
    }

    @Test
    public void DurationFormatUtils0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0147");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0000Y0M0DT0H0M0.010S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.01010" + "'", str2.equals("P0000Y000DT00000.01010"));
    }

    @Test
    public void DurationFormatUtils0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0148");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) 10, "P0Y000DT00000.001100", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0149");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) '4', "", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0150");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 100, (-1L), "P0Y0M0DT0H0M0.000S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0003599899" + "'", str3.equals("P0Y0-10DT07430-10.0003599899"));
    }

    @Test
    public void DurationFormatUtils0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0151");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "0:00:00.035", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.035" + "'", str3.equals("0:00:00.035"));
    }

    @Test
    public void DurationFormatUtils0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0152");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((-1L), false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0153");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (-1L), "P00-1Y11030DT23059059.99999", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0154");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0155");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) ' ', "P0Y000DT00000.051-1", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0156");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "0:00:00.010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0:00:00.010" + "'", str2.equals("0:00:00.010"));
    }

    @Test
    public void DurationFormatUtils0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0157");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) (byte) 0, "0 0econ00");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 0econ00" + "'", str3.equals("0 0econ00"));
    }

    @Test
    public void DurationFormatUtils0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0158");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, 0L, "P0Y0M0DT0H0M0.100S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.1003599990" + "'", str3.equals("P0Y0-10DT07430-10.1003599990"));
    }

    @Test
    public void DurationFormatUtils0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0159");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P-1Y11M30DT23H59M59.990S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.99010" + "'", str3.equals("P-1Y11030DT23059059.99010"));
    }

    @Test
    public void DurationFormatUtils0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0160");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, 1L, "P0Y0M0DT0H0M0.001S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0011" + "'", str3.equals("P0Y000DT00000.0011"));
    }

    @Test
    public void DurationFormatUtils0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0161");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (short) 10, "P-1Y11M30DT23H59M59.989S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9893599913" + "'", str3.equals("P-1Y11-130DT2374359-159.9893599913"));
    }

    @Test
    public void DurationFormatUtils0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0162");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 'a', (long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.003S" + "'", str2.equals("P0Y0M0DT0H0M0.003S"));
    }

    @Test
    public void DurationFormatUtils0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0163");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) (byte) 10, "P0Y000DT00000.0350", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0164");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (short) 100, false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0165");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.033-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.033-1" + "'", str2.equals("P0Y000DT00000.033-1"));
    }

    @Test
    public void DurationFormatUtils0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0166");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.01035");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.01035" + "'", str2.equals("P0Y000DT00000.01035"));
    }

    @Test
    public void DurationFormatUtils0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0167");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (byte) 100, "P-1Y11M30DT23H59M59.910S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0168");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO(1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str1.equals("P0Y0M0DT0H0M0.001S"));
    }

    @Test
    public void DurationFormatUtils0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0169");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (short) 1, true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0170");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.010S" + "'", str1.equals("P0Y0M0DT0H0M0.010S"));
    }

    @Test
    public void DurationFormatUtils0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0171");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((-1L), false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0172");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.010S" + "'", str1.equals("P0Y0M0DT0H0M0.010S"));
    }

    @Test
    public void DurationFormatUtils0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0173");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords(0L, true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0174");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), 0L, "P0Y000DT00000.00110");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00110" + "'", str3.equals("P0Y000DT00000.00110"));
    }

    @Test
    public void DurationFormatUtils0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0175");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) (short) 10, "0:00:00.010", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0176");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) 0, "P-1Y11-130DT2374359-159.9893599913");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9893599913" + "'", str3.equals("P-1Y11-130DT2374359-159.9893599913"));
    }

    @Test
    public void DurationFormatUtils0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0177");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) ' ', "0:00:00.052");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.052" + "'", str3.equals("0:00:00.052"));
    }

    @Test
    public void DurationFormatUtils0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0178");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.100" + "'", str1.equals("0:00:00.100"));
    }

    @Test
    public void DurationFormatUtils0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0179");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "0 0econ00");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0 0econ00" + "'", str2.equals("0 0econ00"));
    }

    @Test
    public void DurationFormatUtils0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0180");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.097S" + "'", str1.equals("P0Y0M0DT0H0M0.097S"));
    }

    @Test
    public void DurationFormatUtils0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0181");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) (short) 100, "P-1Y11M30DT23H59M59.999S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0182");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "P00-1Y11M30DT23H59M59.999S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P00-1Y11030DT23059059.9990" + "'", str2.equals("P00-1Y11030DT23059059.9990"));
    }

    @Test
    public void DurationFormatUtils0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0183");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) '4', false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0184");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (short) 1, "P0Y0M0DT0H0M0.003S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0185");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(100L, (long) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.901S" + "'", str2.equals("P-1Y11M30DT23H59M59.901S"));
    }

    @Test
    public void DurationFormatUtils0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0186");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 0, (long) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0187");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0000Y000DT00000.01010", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.01010" + "'", str3.equals("P0000Y000DT00000.01010"));
    }

    @Test
    public void DurationFormatUtils0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0188");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y0M0DT0H0M0.035S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0350" + "'", str3.equals("P0Y000DT00000.0350"));
    }

    @Test
    public void DurationFormatUtils0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0189");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords(100L, true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0190");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (short) -1, false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0191");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "0:00:00.097", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.097" + "'", str3.equals("0:00:00.097"));
    }

    @Test
    public void DurationFormatUtils0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0192");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 'a', false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0193");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 100, "P0Y000DT00000.001100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.001100" + "'", str3.equals("P0Y000DT00000.001100"));
    }

    @Test
    public void DurationFormatUtils0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0194");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, (long) (byte) 10, "P00-1Y11030DT23059059.99999");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.99999" + "'", str3.equals("P00-1Y11030DT23059059.99999"));
    }

    @Test
    public void DurationFormatUtils0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0195");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (short) -1, "P0Y000DT00000.03310");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03310" + "'", str3.equals("P0Y000DT00000.03310"));
    }

    @Test
    public void DurationFormatUtils0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0196");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, 0L, "P-1Y11030DT23059059.99010", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0197");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) -1, "P0Y0M0DT0H0M0.051S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0513599999" + "'", str3.equals("P0Y0-10DT07430-10.0513599999"));
    }

    @Test
    public void DurationFormatUtils0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0198");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 100, (long) 100, "P-1Y11030DT23059059.90352", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0199");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "P0Y0M0DT0H0M0.100S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.10010" + "'", str2.equals("P0Y000DT00000.10010"));
    }

    @Test
    public void DurationFormatUtils0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0200");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.01035");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.01035" + "'", str2.equals("P0Y000DT00000.01035"));
    }

    @Test
    public void DurationFormatUtils0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0201");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) (byte) 100, "P0000Y000DT00000.01032");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.01032" + "'", str3.equals("P0000Y000DT00000.01032"));
    }

    @Test
    public void DurationFormatUtils0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0202");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.01052");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.01052" + "'", str2.equals("P0Y000DT00000.01052"));
    }

    @Test
    public void DurationFormatUtils0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0203");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.99" + "'", str1.equals("0:00:00.99"));
    }

    @Test
    public void DurationFormatUtils0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0204");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) -1, (long) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2.equals("P0Y0M0DT0H0M0.001S"));
    }

    @Test
    public void DurationFormatUtils0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0205");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords(10L, true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0206");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) -1, (long) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.053S" + "'", str2.equals("P0Y0M0DT0H0M0.053S"));
    }

    @Test
    public void DurationFormatUtils0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0207");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P0Y0M0DT0H0M0.097S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.097100" + "'", str3.equals("P0Y000DT00000.097100"));
    }

    @Test
    public void DurationFormatUtils0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0208");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P0Y0M0DT0H0M0.051S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0511" + "'", str2.equals("P0Y000DT00000.0511"));
    }

    @Test
    public void DurationFormatUtils0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0209");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P0000Y000DT00000.01010", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.01010" + "'", str3.equals("P0000Y000DT00000.01010"));
    }

    @Test
    public void DurationFormatUtils0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0210");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) -1, 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.101S" + "'", str2.equals("P0Y0M0DT0H0M0.101S"));
    }

    @Test
    public void DurationFormatUtils0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0211");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P0Y0M0DT0H0M0.101S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.10135" + "'", str3.equals("P0Y000DT00000.10135"));
    }

    @Test
    public void DurationFormatUtils0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0212");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) '4', (long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.958S" + "'", str2.equals("P-1Y11M30DT23H59M59.958S"));
    }

    @Test
    public void DurationFormatUtils0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0213");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 'a', (long) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.003S" + "'", str2.equals("P0Y0M0DT0H0M0.003S"));
    }

    @Test
    public void DurationFormatUtils0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0214");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(10L, (long) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.990S" + "'", str2.equals("P-1Y11M30DT23H59M59.990S"));
    }

    @Test
    public void DurationFormatUtils0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0215");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (-1L), "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0216");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y0-10DT07430-10.1003599990");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0-10DT07430-10.1003599990" + "'", str2.equals("P0Y0-10DT07430-10.1003599990"));
    }

    @Test
    public void DurationFormatUtils0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0217");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 10, (long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.991S" + "'", str2.equals("P-1Y11M30DT23H59M59.991S"));
    }

    @Test
    public void DurationFormatUtils0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0218");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void DurationFormatUtils0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0219");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (byte) 0, "P0Y0M0DT0H0M0.032S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0323599990" + "'", str3.equals("P0Y0-10DT07430-10.0323599990"));
    }

    @Test
    public void DurationFormatUtils0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0220");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', 100L, "P00-1Y11030DT23059059.9990");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.9990" + "'", str3.equals("P00-1Y11030DT23059059.9990"));
    }

    @Test
    public void DurationFormatUtils0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0221");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y0M0DT0H0M0.000S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.00010" + "'", str2.equals("P0Y000DT00000.00010"));
    }

    @Test
    public void DurationFormatUtils0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0222");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) 'a', "0 30a086399", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0223");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 0, false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0224");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y0-10DT07430-10.0003599899");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0-10DT07430-10.0003599899" + "'", str2.equals("P0Y0-10DT07430-10.0003599899"));
    }

    @Test
    public void DurationFormatUtils0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0225");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 100L, "0:00:00.001");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.001" + "'", str3.equals("0:00:00.001"));
    }

    @Test
    public void DurationFormatUtils0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0226");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y0-10DT07430-10.0513599999", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0513599999" + "'", str3.equals("P0Y0-10DT07430-10.0513599999"));
    }

    @Test
    public void DurationFormatUtils0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0227");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0000Y000DT00000.01010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.01010" + "'", str2.equals("P0000Y000DT00000.01010"));
    }

    @Test
    public void DurationFormatUtils0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0228");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (-1L), "P0Y0-10DT07430-10.0323599990", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0229");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y0M0DT0H0M0.001S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0010" + "'", str3.equals("P0Y000DT00000.0010"));
    }

    @Test
    public void DurationFormatUtils0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0230");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) 1, "P00-1Y11030DT23059059.99910", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0231");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.99" + "'", str1.equals("0:00:00.99"));
    }

    @Test
    public void DurationFormatUtils0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0232");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P-1Y11030DT23059059.99010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.99010" + "'", str2.equals("P-1Y11030DT23059059.99010"));
    }

    @Test
    public void DurationFormatUtils0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0233");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P0Y0M0DT0H0M0.99S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.991" + "'", str3.equals("P0Y000DT00000.991"));
    }

    @Test
    public void DurationFormatUtils0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0234");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "0:00:00.010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0:00:00.010" + "'", str2.equals("0:00:00.010"));
    }

    @Test
    public void DurationFormatUtils0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0235");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) '#', "P0000Y000DT00000.01010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.01010" + "'", str3.equals("P0000Y000DT00000.01010"));
    }

    @Test
    public void DurationFormatUtils0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0236");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 0, (long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2.equals("P0Y0M0DT0H0M0.001S"));
    }

    @Test
    public void DurationFormatUtils0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0237");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) (byte) 10, "P0Y000DT00000.10010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.10010" + "'", str3.equals("P0Y000DT00000.10010"));
    }

    @Test
    public void DurationFormatUtils0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0238");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) '4', "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y0M0DT0H0M0.051S" + "'", str3.equals("P0000Y0M0DT0H0M0.051S"));
    }

    @Test
    public void DurationFormatUtils0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0239");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 10, (long) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.990S" + "'", str2.equals("P-1Y11M30DT23H59M59.990S"));
    }

    @Test
    public void DurationFormatUtils0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0240");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "0 30a086399");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0 30a086399" + "'", str2.equals("0 30a086399"));
    }

    @Test
    public void DurationFormatUtils0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0241");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 10, (long) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.989S" + "'", str2.equals("P-1Y11M30DT23H59M59.989S"));
    }

    @Test
    public void DurationFormatUtils0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0242");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y0M0DT0H0M0.032S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.03210" + "'", str2.equals("P0Y000DT00000.03210"));
    }

    @Test
    public void DurationFormatUtils0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0243");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) (-1), "P0000Y000DT00000.01099");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.01099" + "'", str3.equals("P0000Y000DT00000.01099"));
    }

    @Test
    public void DurationFormatUtils0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0244");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.03210", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03210" + "'", str3.equals("P0Y000DT00000.03210"));
    }

    @Test
    public void DurationFormatUtils0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0245");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "0 0econ00");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0 0econ00" + "'", str2.equals("0 0econ00"));
    }

    @Test
    public void DurationFormatUtils0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0246");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "0:00:00.032", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.032" + "'", str3.equals("0:00:00.032"));
    }

    @Test
    public void DurationFormatUtils0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0247");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(0L, 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.100S" + "'", str2.equals("P0Y0M0DT0H0M0.100S"));
    }

    @Test
    public void DurationFormatUtils0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0248");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 1, false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0249");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, 0L, "P0Y0M0DT0H0M0.051S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0250");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (short) 0, false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0251");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "0 seconds");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0 0econ00" + "'", str2.equals("0 0econ00"));
    }

    @Test
    public void DurationFormatUtils0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0252");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) 1, "P0Y0M0DT0H0M0.032S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0253");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.01052");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.01052" + "'", str2.equals("P0Y000DT00000.01052"));
    }

    @Test
    public void DurationFormatUtils0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0254");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.00010", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00010" + "'", str3.equals("P0Y000DT00000.00010"));
    }

    @Test
    public void DurationFormatUtils0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0255");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) '4', "", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0256");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.000" + "'", str1.equals("0:00:00.000"));
    }

    @Test
    public void DurationFormatUtils0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0257");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0000Y0M0DT0H0M0.051S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.0510" + "'", str3.equals("P0000Y000DT00000.0510"));
    }

    @Test
    public void DurationFormatUtils0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0258");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.99S" + "'", str1.equals("P0Y0M0DT0H0M0.99S"));
    }

    @Test
    public void DurationFormatUtils0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0259");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 10, (long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.990S" + "'", str2.equals("P-1Y11M30DT23H59M59.990S"));
    }

    @Test
    public void DurationFormatUtils0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0260");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) 'a', "P00-1Y11030DT23059059.99910", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0261");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((-1L), true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0262");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "0:00:00.010", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.010" + "'", str3.equals("0:00:00.010"));
    }

    @Test
    public void DurationFormatUtils0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0263");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "0 seconds");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0 0econ00" + "'", str2.equals("0 0econ00"));
    }

    @Test
    public void DurationFormatUtils0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0264");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) (short) 100, "P-1Y11M30DT23H59M59.910S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.91090" + "'", str3.equals("P-1Y11030DT23059059.91090"));
    }

    @Test
    public void DurationFormatUtils0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0265");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((-1L), (long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2.equals("P0Y0M0DT0H0M0.001S"));
    }

    @Test
    public void DurationFormatUtils0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0266");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (short) 10, true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0267");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 100, (long) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.899S" + "'", str2.equals("P-1Y11M30DT23H59M59.899S"));
    }

    @Test
    public void DurationFormatUtils0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0268");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 10, (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.989S" + "'", str2.equals("P-1Y11M30DT23H59M59.989S"));
    }

    @Test
    public void DurationFormatUtils0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0269");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, 1L, "P0Y0M0DT0H0M0.003S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0033599991" + "'", str3.equals("P0Y0-10DT07430-10.0033599991"));
    }

    @Test
    public void DurationFormatUtils0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0270");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(10L, 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.991S" + "'", str2.equals("P-1Y11M30DT23H59M59.991S"));
    }

    @Test
    public void DurationFormatUtils0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0271");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (byte) 10, true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0272");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, 0L, "P-1Y11M30DT23H59M59.903S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0273");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.010" + "'", str1.equals("0:00:00.010"));
    }

    @Test
    public void DurationFormatUtils0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0274");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.00110", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00110" + "'", str3.equals("P0Y000DT00000.00110"));
    }

    @Test
    public void DurationFormatUtils0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0275");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P00-1Y11030DT23059059.9993", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.9993" + "'", str3.equals("P00-1Y11030DT23059059.9993"));
    }

    @Test
    public void DurationFormatUtils0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0276");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (short) 10, true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0277");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (byte) -1, true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0278");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 0, (long) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.100S" + "'", str2.equals("P0Y0M0DT0H0M0.100S"));
    }

    @Test
    public void DurationFormatUtils0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0279");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) 100, "P0Y0-10DT07430-10.0003599899");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0003599899" + "'", str3.equals("P0Y0-10DT07430-10.0003599899"));
    }

    @Test
    public void DurationFormatUtils0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0280");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (byte) 1, "0:00:00.000", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0281");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "P-1Y11-130DT2374359-159.9893599913", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9893599913" + "'", str3.equals("P-1Y11-130DT2374359-159.9893599913"));
    }

    @Test
    public void DurationFormatUtils0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0282");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 10, "0:00:00.097");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0:00:00.097" + "'", str2.equals("0:00:00.097"));
    }

    @Test
    public void DurationFormatUtils0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0283");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', 10L, "P0Y000DT00000.00110", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0284");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, 10L, "P0Y000DT00000.0010", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0285");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, (long) 'a', "P0Y0M0DT0H0M0.035S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0286");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (-1), "P0000Y0M0DT0H0M0.051S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.0510" + "'", str3.equals("P0000Y000DT00000.0510"));
    }

    @Test
    public void DurationFormatUtils0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0287");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (short) 0, "0:00:00.052", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0288");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P0Y0M0DT0H0M0.033S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.03352" + "'", str2.equals("P0Y000DT00000.03352"));
    }

    @Test
    public void DurationFormatUtils0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0289");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P00-1Y11030DT23059059.9993", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.9993" + "'", str3.equals("P00-1Y11030DT23059059.9993"));
    }

    @Test
    public void DurationFormatUtils0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0290");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((-1L), (long) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0291");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y0-10DT07430-10.0323599990");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0-10DT07430-10.0323599990" + "'", str2.equals("P0Y0-10DT07430-10.0323599990"));
    }

    @Test
    public void DurationFormatUtils0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0292");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y0M0DT0H0M0.99S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.99-1" + "'", str3.equals("P0Y000DT00000.99-1"));
    }

    @Test
    public void DurationFormatUtils0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0293");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) '#', (long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.966S" + "'", str2.equals("P-1Y11M30DT23H59M59.966S"));
    }

    @Test
    public void DurationFormatUtils0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0294");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(0L, (long) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2.equals("P0Y0M0DT0H0M0.001S"));
    }

    @Test
    public void DurationFormatUtils0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0295");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS(1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.001" + "'", str1.equals("0:00:00.001"));
    }

    @Test
    public void DurationFormatUtils0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0296");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, 100L, "P00-1Y11030DT23059059.9990", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0297");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void DurationFormatUtils0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0298");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.10010", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.10010" + "'", str3.equals("P0Y000DT00000.10010"));
    }

    @Test
    public void DurationFormatUtils0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0299");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P0Y0-10DT07430-10.0513599999", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0513599999" + "'", str3.equals("P0Y0-10DT07430-10.0513599999"));
    }

    @Test
    public void DurationFormatUtils0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0300");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(0L, 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0301");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "0:00:00.99");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0:00:00.99" + "'", str2.equals("0:00:00.99"));
    }

    @Test
    public void DurationFormatUtils0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0302");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, 100L, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0303");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str1.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0304");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (byte) 1, false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0305");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(0L, (long) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.999S" + "'", str2.equals("P-1Y11M30DT23H59M59.999S"));
    }

    @Test
    public void DurationFormatUtils0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0306");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P-1Y11M30DT23H59M59.910S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9100" + "'", str3.equals("P-1Y11030DT23059059.9100"));
    }

    @Test
    public void DurationFormatUtils0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0307");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y0-10DT07430-10.0003599899");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0-10DT07430-10.0003599899" + "'", str2.equals("P0Y0-10DT07430-10.0003599899"));
    }

    @Test
    public void DurationFormatUtils0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0308");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P00-1Y11030DT23059059.9993");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P00-1Y11030DT23059059.9993" + "'", str2.equals("P00-1Y11030DT23059059.9993"));
    }

    @Test
    public void DurationFormatUtils0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0309");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (byte) 0, "P-1Y11030DT23059059.99010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.99010" + "'", str3.equals("P-1Y11030DT23059059.99010"));
    }

    @Test
    public void DurationFormatUtils0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0310");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, 1L, "P0Y0M0DT0H0M0.000S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0000" + "'", str3.equals("P0Y000DT00000.0000"));
    }

    @Test
    public void DurationFormatUtils0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0311");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (short) 100, "P0Y0-10DT07430-10.0033599991", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0312");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P00-1Y11030DT23059059.9993", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.9993" + "'", str3.equals("P00-1Y11030DT23059059.9993"));
    }

    @Test
    public void DurationFormatUtils0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0313");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(0L, (long) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.999S" + "'", str2.equals("P-1Y11M30DT23H59M59.999S"));
    }

    @Test
    public void DurationFormatUtils0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0314");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (byte) 1, "P0Y0-10DT07430-10.1003599990");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.1003599990" + "'", str3.equals("P0Y0-10DT07430-10.1003599990"));
    }

    @Test
    public void DurationFormatUtils0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0315");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (short) 100, true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0316");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (byte) -1, false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0317");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) (short) 100, "0:00:00.100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.100" + "'", str3.equals("0:00:00.100"));
    }

    @Test
    public void DurationFormatUtils0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0318");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.0010", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0010" + "'", str3.equals("P0Y000DT00000.0010"));
    }

    @Test
    public void DurationFormatUtils0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0319");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P-1Y11M30DT23H59M59.999S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9990" + "'", str3.equals("P-1Y11030DT23059059.9990"));
    }

    @Test
    public void DurationFormatUtils0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0320");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y0M0DT0H0M0.99S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.99-1" + "'", str3.equals("P0Y000DT00000.99-1"));
    }

    @Test
    public void DurationFormatUtils0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0321");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "0 days 0 hours 0 minutes 0 seconds", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 0a00 0 hour 0 0inute0 0 econ00" + "'", str3.equals("0 0a00 0 hour 0 0inute0 0 econ00"));
    }

    @Test
    public void DurationFormatUtils0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0322");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P00-1Y11030DT23059059.99999", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.99999" + "'", str3.equals("P00-1Y11030DT23059059.99999"));
    }

    @Test
    public void DurationFormatUtils0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0323");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords(0L, false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0324");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.052S" + "'", str1.equals("P0Y0M0DT0H0M0.052S"));
    }

    @Test
    public void DurationFormatUtils0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0325");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.100S" + "'", str1.equals("P0Y0M0DT0H0M0.100S"));
    }

    @Test
    public void DurationFormatUtils0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0326");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, (long) ' ', "P0Y0M0DT0H0M0.001S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0327");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "0:00:00.032", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.032" + "'", str3.equals("0:00:00.032"));
    }

    @Test
    public void DurationFormatUtils0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0328");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), (long) 10, "P0Y0M0DT0H0M0.001S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00111" + "'", str3.equals("P0Y000DT00000.00111"));
    }

    @Test
    public void DurationFormatUtils0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0329");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y000DT00000.01052");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.01052" + "'", str2.equals("P0Y000DT00000.01052"));
    }

    @Test
    public void DurationFormatUtils0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0330");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "0 days", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 0a00" + "'", str3.equals("0 0a00"));
    }

    @Test
    public void DurationFormatUtils0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0331");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, (long) (byte) 1, "P0Y0-10DT07430-10.1003599990");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.1003599990" + "'", str3.equals("P0Y0-10DT07430-10.1003599990"));
    }

    @Test
    public void DurationFormatUtils0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0332");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P0Y0-10DT07430-10.0033599991");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0-10DT07430-10.0033599991" + "'", str2.equals("P0Y0-10DT07430-10.0033599991"));
    }

    @Test
    public void DurationFormatUtils0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0333");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 'a', (long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.903S" + "'", str2.equals("P-1Y11M30DT23H59M59.903S"));
    }

    @Test
    public void DurationFormatUtils0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0334");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, (long) (-1), "P0Y0M0DT0H0M0.033S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0333599899" + "'", str3.equals("P0Y0-10DT07430-10.0333599899"));
    }

    @Test
    public void DurationFormatUtils0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0335");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.010" + "'", str1.equals("0:00:00.010"));
    }

    @Test
    public void DurationFormatUtils0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0336");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y0M0DT0H0M0.100S" + "'", str3.equals("P0000Y0M0DT0H0M0.100S"));
    }

    @Test
    public void DurationFormatUtils0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0337");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 10, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y0M0DT0H0M0.010S" + "'", str3.equals("P0000Y0M0DT0H0M0.010S"));
    }

    @Test
    public void DurationFormatUtils0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0338");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 1, "P0Y0-10DT07430-10.0513599999", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0339");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) '4', "P-1Y11M30DT23H59M59.991S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0340");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) (short) 10, "P-1Y11030DT23059059.9901");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9901" + "'", str3.equals("P-1Y11030DT23059059.9901"));
    }

    @Test
    public void DurationFormatUtils0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0341");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 100, (long) (byte) 10, "", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0342");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "0:00:00.035");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0:00:00.035" + "'", str2.equals("0:00:00.035"));
    }

    @Test
    public void DurationFormatUtils0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0343");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P0Y0M0DT0H0M0.101S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.101-1" + "'", str2.equals("P0Y000DT00000.101-1"));
    }

    @Test
    public void DurationFormatUtils0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0344");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P0Y0-10DT07430-10.0003599899");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0-10DT07430-10.0003599899" + "'", str2.equals("P0Y0-10DT07430-10.0003599899"));
    }

    @Test
    public void DurationFormatUtils0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0345");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 1, 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.999S" + "'", str2.equals("P-1Y11M30DT23H59M59.999S"));
    }

    @Test
    public void DurationFormatUtils0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0346");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) '4', "0 30a086399", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0347");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P00-1Y11030DT23059059.99910", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.99910" + "'", str3.equals("P00-1Y11030DT23059059.99910"));
    }

    @Test
    public void DurationFormatUtils0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0348");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y000DT00000.001100", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.001100" + "'", str3.equals("P0Y000DT00000.001100"));
    }

    @Test
    public void DurationFormatUtils0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0349");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P-1Y11030DT23059059.90352");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.90352" + "'", str2.equals("P-1Y11030DT23059059.90352"));
    }

    @Test
    public void DurationFormatUtils0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0350");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', 100L, "P00-1Y11030DT23059059.9990", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0351");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, 1L, "P0Y0M0DT0H0M0.010S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0101" + "'", str3.equals("P0Y000DT00000.0101"));
    }

    @Test
    public void DurationFormatUtils0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0352");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, (long) (short) 0, "", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0353");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, (long) (byte) 100, "P0000Y0M0DT0H0M0.100S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0354");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (short) 1, false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0355");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y0M0DT0H0M0.003S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0030" + "'", str2.equals("P0Y000DT00000.0030"));
    }

    @Test
    public void DurationFormatUtils0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0356");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y000DT00000.99-1", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.99-1" + "'", str3.equals("P0Y000DT00000.99-1"));
    }

    @Test
    public void DurationFormatUtils0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0357");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P0000Y0M0DT0H0M0.010S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.010-1" + "'", str2.equals("P0000Y000DT00000.010-1"));
    }

    @Test
    public void DurationFormatUtils0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0358");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "P0000Y0M0DT0H0M0.100S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.10010" + "'", str2.equals("P0000Y000DT00000.10010"));
    }

    @Test
    public void DurationFormatUtils0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0359");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 10, 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.090S" + "'", str2.equals("P0Y0M0DT0H0M0.090S"));
    }

    @Test
    public void DurationFormatUtils0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0360");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "0:00:00.99", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.99" + "'", str3.equals("0:00:00.99"));
    }

    @Test
    public void DurationFormatUtils0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0361");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, 0L, "0 0a00", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0362");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 1, (long) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.998S" + "'", str2.equals("P-1Y11M30DT23H59M59.998S"));
    }

    @Test
    public void DurationFormatUtils0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0363");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) (byte) 100, "P0Y000DT00000.051-1", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0364");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) ' ', (long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.968S" + "'", str2.equals("P-1Y11M30DT23H59M59.968S"));
    }

    @Test
    public void DurationFormatUtils0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0365");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', 0L, "P0000Y0M0DT0H0M0.010S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0366");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 100, 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.901S" + "'", str2.equals("P-1Y11M30DT23H59M59.901S"));
    }

    @Test
    public void DurationFormatUtils0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0367");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', 0L, "0:00:00.035", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0368");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 100, (long) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.901S" + "'", str2.equals("P-1Y11M30DT23H59M59.901S"));
    }

    @Test
    public void DurationFormatUtils0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0369");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void DurationFormatUtils0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0370");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) (byte) 100, "P0Y000DT00000.101-1", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0371");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y0M0DT0H0M0.010S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0100" + "'", str2.equals("P0Y000DT00000.0100"));
    }

    @Test
    public void DurationFormatUtils0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0372");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords(1L, true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0373");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, (long) (short) 10, "0:00:00.035");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.035" + "'", str3.equals("0:00:00.035"));
    }

    @Test
    public void DurationFormatUtils0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0374");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y0M0DT0H0M0.001S" + "'", str2.equals("P0000Y0M0DT0H0M0.001S"));
    }

    @Test
    public void DurationFormatUtils0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0375");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 10, false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0376");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((-1L), (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0377");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 1L, "P0Y000DT00000.00010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00010" + "'", str3.equals("P0Y000DT00000.00010"));
    }

    @Test
    public void DurationFormatUtils0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0378");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) 10, "P0Y000DT00000.99-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.99-1" + "'", str3.equals("P0Y000DT00000.99-1"));
    }

    @Test
    public void DurationFormatUtils0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0379");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) '4', false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0380");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str1.equals("P0Y0M0DT0H0M0.001S"));
    }

    @Test
    public void DurationFormatUtils0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0381");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P-1Y11M30DT23H59M59.968S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9681" + "'", str2.equals("P-1Y11030DT23059059.9681"));
    }

    @Test
    public void DurationFormatUtils0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0382");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) (short) 10, "P0Y0M0DT0H0M0.003S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0039" + "'", str3.equals("P0Y000DT00000.0039"));
    }

    @Test
    public void DurationFormatUtils0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0383");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(10L, 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.990S" + "'", str2.equals("P-1Y11M30DT23H59M59.990S"));
    }

    @Test
    public void DurationFormatUtils0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0384");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.0000", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0000" + "'", str3.equals("P0Y000DT00000.0000"));
    }

    @Test
    public void DurationFormatUtils0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0385");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) 0, "P00-1Y11M30DT23H59M59.904S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11-130DT2374359-159.9043599990" + "'", str3.equals("P00-1Y11-130DT2374359-159.9043599990"));
    }

    @Test
    public void DurationFormatUtils0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0386");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P-1Y11-130DT2374359-159.9893599913");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11-130DT2374359-159.9893599913" + "'", str2.equals("P-1Y11-130DT2374359-159.9893599913"));
    }

    @Test
    public void DurationFormatUtils0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0387");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P-1Y11M30DT23H59M59.958S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9581" + "'", str2.equals("P-1Y11030DT23059059.9581"));
    }

    @Test
    public void DurationFormatUtils0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0388");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) -1, (long) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.101S" + "'", str2.equals("P0Y0M0DT0H0M0.101S"));
    }

    @Test
    public void DurationFormatUtils0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0389");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 0, (long) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2.equals("P0Y0M0DT0H0M0.001S"));
    }

    @Test
    public void DurationFormatUtils0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0390");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y000DT00000.097100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.097100" + "'", str2.equals("P0Y000DT00000.097100"));
    }

    @Test
    public void DurationFormatUtils0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0391");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.00111");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.00111" + "'", str2.equals("P0Y000DT00000.00111"));
    }

    @Test
    public void DurationFormatUtils0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0392");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) '#', (long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.975S" + "'", str2.equals("P-1Y11M30DT23H59M59.975S"));
    }

    @Test
    public void DurationFormatUtils0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0393");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) (short) 100, "P0Y000DT00000.0011");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0011" + "'", str3.equals("P0Y000DT00000.0011"));
    }

    @Test
    public void DurationFormatUtils0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0394");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (short) 100, "0 30a059 0 hour 0 1439inute59 0 econ3059");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 30a059 0 hour 0 1439inute59 0 econ3059" + "'", str3.equals("0 30a059 0 hour 0 1439inute59 0 econ3059"));
    }

    @Test
    public void DurationFormatUtils0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0395");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 1, true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0396");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "P-1Y11030DT23059059.9581", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9581" + "'", str3.equals("P-1Y11030DT23059059.9581"));
    }

    @Test
    public void DurationFormatUtils0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0397");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) (short) 0, "P-1Y11030DT23059059.90352");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.90352" + "'", str3.equals("P-1Y11030DT23059059.90352"));
    }

    @Test
    public void DurationFormatUtils0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0398");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P-1Y11030DT23059059.99010", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.99010" + "'", str3.equals("P-1Y11030DT23059059.99010"));
    }

    @Test
    public void DurationFormatUtils0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0399");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.001" + "'", str1.equals("0:00:00.001"));
    }

    @Test
    public void DurationFormatUtils0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0400");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P0000Y0M0DT0H0M0.100S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.10035" + "'", str3.equals("P0000Y000DT00000.10035"));
    }

    @Test
    public void DurationFormatUtils0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0401");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P-1Y11030DT23059059.9581", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9581" + "'", str3.equals("P-1Y11030DT23059059.9581"));
    }

    @Test
    public void DurationFormatUtils0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0402");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, (long) (byte) 100, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0403");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "0:00:00.99", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.99" + "'", str3.equals("0:00:00.99"));
    }

    @Test
    public void DurationFormatUtils0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0404");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(0L, (long) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2.equals("P0Y0M0DT0H0M0.001S"));
    }

    @Test
    public void DurationFormatUtils0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0405");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 100, 10L, "P0Y000DT00000.03211", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0406");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(10L, (long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0407");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) (short) 0, "P0Y000DT00000.03210", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0408");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, 100L, "P0Y0M0DT0H0M0.090S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0409");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0000Y0M0DT0H0M0.001S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.0011" + "'", str3.equals("P0000Y000DT00000.0011"));
    }

    @Test
    public void DurationFormatUtils0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0410");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 10, (long) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.090S" + "'", str2.equals("P0Y0M0DT0H0M0.090S"));
    }

    @Test
    public void DurationFormatUtils0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0411");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P-1Y11030DT23059059.9100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9100" + "'", str2.equals("P-1Y11030DT23059059.9100"));
    }

    @Test
    public void DurationFormatUtils0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0412");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "P0000Y000DT00000.010-1", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.010-1" + "'", str3.equals("P0000Y000DT00000.010-1"));
    }

    @Test
    public void DurationFormatUtils0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0413");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "0:00:00.99", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.99" + "'", str3.equals("0:00:00.99"));
    }

    @Test
    public void DurationFormatUtils0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0414");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) (short) 0, "", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0415");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) '4', "P0Y000DT00000.0011");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0011" + "'", str3.equals("P0Y000DT00000.0011"));
    }

    @Test
    public void DurationFormatUtils0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0416");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, 10L, "P00-1Y11030DT23059059.99910", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0417");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 100, (long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.910S" + "'", str2.equals("P-1Y11M30DT23H59M59.910S"));
    }

    @Test
    public void DurationFormatUtils0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0418");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void DurationFormatUtils0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0419");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void DurationFormatUtils0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0420");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P-1Y11M30DT23H59M59.968S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.968100" + "'", str3.equals("P-1Y11030DT23059059.968100"));
    }

    @Test
    public void DurationFormatUtils0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0421");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (byte) 1, "P0000Y000DT00000.10035", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0422");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P0000Y000DT00000.0510");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.0510" + "'", str2.equals("P0000Y000DT00000.0510"));
    }

    @Test
    public void DurationFormatUtils0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0423");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P0Y0M0DT0H0M0.031S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0311" + "'", str3.equals("P0Y000DT00000.0311"));
    }

    @Test
    public void DurationFormatUtils0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0424");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P-1Y11M30DT23H59M59.966S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.96610" + "'", str3.equals("P-1Y11030DT23059059.96610"));
    }

    @Test
    public void DurationFormatUtils0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0425");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "0:00:00.001", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.001" + "'", str3.equals("0:00:00.001"));
    }

    @Test
    public void DurationFormatUtils0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0426");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) ' ', false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0427");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) 100, "P0Y000DT00000.001100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.001100" + "'", str3.equals("P0Y000DT00000.001100"));
    }

    @Test
    public void DurationFormatUtils0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0428");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) (short) -1, "P0Y000DT00000.0101", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0429");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.0101", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0101" + "'", str3.equals("P0Y000DT00000.0101"));
    }

    @Test
    public void DurationFormatUtils0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0430");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 10, (long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0431");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (short) -1, false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0432");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "0:00:00.035");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0:00:00.035" + "'", str2.equals("0:00:00.035"));
    }

    @Test
    public void DurationFormatUtils0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0433");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, (long) '#', "P-1Y11030DT23059059.96610", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0434");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P-1Y11M30DT23H59M59.999S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9991" + "'", str2.equals("P-1Y11030DT23059059.9991"));
    }

    @Test
    public void DurationFormatUtils0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0435");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (-1), (long) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.101S" + "'", str2.equals("P0Y0M0DT0H0M0.101S"));
    }

    @Test
    public void DurationFormatUtils0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0436");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P0Y000DT00000.10135", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.10135" + "'", str3.equals("P0Y000DT00000.10135"));
    }

    @Test
    public void DurationFormatUtils0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0437");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 100, true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0438");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P-1Y11M30DT23H59M59.958S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9581" + "'", str3.equals("P-1Y11030DT23059059.9581"));
    }

    @Test
    public void DurationFormatUtils0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0439");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P-1Y11030DT23059059.99010", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.99010" + "'", str3.equals("P-1Y11030DT23059059.99010"));
    }

    @Test
    public void DurationFormatUtils0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0440");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P0000Y000DT00000.01032", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.01032" + "'", str3.equals("P0000Y000DT00000.01032"));
    }

    @Test
    public void DurationFormatUtils0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0441");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y0-10DT07430-10.0013599947", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0013599947" + "'", str3.equals("P0Y0-10DT07430-10.0013599947"));
    }

    @Test
    public void DurationFormatUtils0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0442");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (short) 1, true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0443");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) 10, "P0000Y0M0DT0H0M0.010S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0444");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 10, (long) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.090S" + "'", str2.equals("P0Y0M0DT0H0M0.090S"));
    }

    @Test
    public void DurationFormatUtils0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0445");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 1, (long) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.096S" + "'", str2.equals("P0Y0M0DT0H0M0.096S"));
    }

    @Test
    public void DurationFormatUtils0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0446");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) '#', false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0447");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, 100L, "P0Y0M0DT0H0M0.053S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0448");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) (byte) -1, "P0Y000DT00000.051-1", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0449");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, (long) (byte) 10, "P0Y000DT00000.0039", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0450");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "0:00:00.035", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.035" + "'", str3.equals("0:00:00.035"));
    }

    @Test
    public void DurationFormatUtils0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0451");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y0M0DT0H0M0.010S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.01032" + "'", str3.equals("P0Y000DT00000.01032"));
    }

    @Test
    public void DurationFormatUtils0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0452");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, 0L, "P0Y0-10DT07430-10.0333599899");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0333599899" + "'", str3.equals("P0Y0-10DT07430-10.0333599899"));
    }

    @Test
    public void DurationFormatUtils0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0453");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y000DT00000.01032");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.01032" + "'", str2.equals("P0Y000DT00000.01032"));
    }

    @Test
    public void DurationFormatUtils0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0454");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "0:00:00.010", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.010" + "'", str3.equals("0:00:00.010"));
    }

    @Test
    public void DurationFormatUtils0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0455");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.03211");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.03211" + "'", str2.equals("P0Y000DT00000.03211"));
    }

    @Test
    public void DurationFormatUtils0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0456");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y0M0DT0H0M0.033S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0330" + "'", str3.equals("P0Y000DT00000.0330"));
    }

    @Test
    public void DurationFormatUtils0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0457");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(100L, 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.910S" + "'", str2.equals("P-1Y11M30DT23H59M59.910S"));
    }

    @Test
    public void DurationFormatUtils0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0458");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.0100", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0100" + "'", str3.equals("P0Y000DT00000.0100"));
    }

    @Test
    public void DurationFormatUtils0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0459");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 10, 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.090S" + "'", str2.equals("P0Y0M0DT0H0M0.090S"));
    }

    @Test
    public void DurationFormatUtils0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0460");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) '4', true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0461");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P0000Y000DT00000.01032", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.01032" + "'", str3.equals("P0000Y000DT00000.01032"));
    }

    @Test
    public void DurationFormatUtils0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0462");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) ' ', true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0463");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.035S" + "'", str1.equals("P0Y0M0DT0H0M0.035S"));
    }

    @Test
    public void DurationFormatUtils0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0464");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y0-10DT07430-10.0333599899", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0333599899" + "'", str3.equals("P0Y0-10DT07430-10.0333599899"));
    }

    @Test
    public void DurationFormatUtils0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0465");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P00-1Y11030DT23059059.99910");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P00-1Y11030DT23059059.99910" + "'", str2.equals("P00-1Y11030DT23059059.99910"));
    }

    @Test
    public void DurationFormatUtils0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0466");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(0L, (long) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.100S" + "'", str2.equals("P0Y0M0DT0H0M0.100S"));
    }

    @Test
    public void DurationFormatUtils0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0467");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (short) 100, false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0468");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "P-1Y11M30DT23H59M59.968S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9681" + "'", str3.equals("P-1Y11030DT23059059.9681"));
    }

    @Test
    public void DurationFormatUtils0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0469");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.100S" + "'", str1.equals("P0Y0M0DT0H0M0.100S"));
    }

    @Test
    public void DurationFormatUtils0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0470");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P00-1Y11030DT23059059.9993");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P00-1Y11030DT23059059.9993" + "'", str2.equals("P00-1Y11030DT23059059.9993"));
    }

    @Test
    public void DurationFormatUtils0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0471");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y0M0DT0H0M0.096S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.09632" + "'", str2.equals("P0Y000DT00000.09632"));
    }

    @Test
    public void DurationFormatUtils0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0472");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, 10L, "P0Y000DT00000.01052");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.01052" + "'", str3.equals("P0Y000DT00000.01052"));
    }

    @Test
    public void DurationFormatUtils0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0473");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P00-1Y11030DT23059059.9993");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P00-1Y11030DT23059059.9993" + "'", str2.equals("P00-1Y11030DT23059059.9993"));
    }

    @Test
    public void DurationFormatUtils0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0474");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords(100L, false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0475");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "0:00:00.100", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.100" + "'", str3.equals("0:00:00.100"));
    }

    @Test
    public void DurationFormatUtils0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0476");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P-1Y11030DT23059059.90352");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.90352" + "'", str2.equals("P-1Y11030DT23059059.90352"));
    }

    @Test
    public void DurationFormatUtils0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0477");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P0Y000DT00000.001100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.001100" + "'", str2.equals("P0Y000DT00000.001100"));
    }

    @Test
    public void DurationFormatUtils0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0478");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, (long) (byte) 100, "P-1Y11030DT23059059.9901");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9901" + "'", str3.equals("P-1Y11030DT23059059.9901"));
    }

    @Test
    public void DurationFormatUtils0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0479");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) ' ', "P0000Y0M0DT0H0M0.010S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0480");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, (long) (short) 100, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0481");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P-1Y11030DT23059059.9991");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9991" + "'", str2.equals("P-1Y11030DT23059059.9991"));
    }

    @Test
    public void DurationFormatUtils0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0482");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) 'a', "P00-1Y11-130DT2374359-159.9043599990", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0483");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 100, 1L, "0:00:00.032");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.032" + "'", str3.equals("0:00:00.032"));
    }

    @Test
    public void DurationFormatUtils0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0484");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(1L, 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.999S" + "'", str2.equals("P-1Y11M30DT23H59M59.999S"));
    }

    @Test
    public void DurationFormatUtils0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0485");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.99" + "'", str1.equals("0:00:00.99"));
    }

    @Test
    public void DurationFormatUtils0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0486");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (byte) 10, "P0Y000DT00000.033-1", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0487");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, 0L, "P-1Y11030DT23059059.9681", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0488");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((-1L), (long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.101S" + "'", str2.equals("P0Y0M0DT0H0M0.101S"));
    }

    @Test
    public void DurationFormatUtils0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0489");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P-1Y11M30DT23H59M59.990S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9900" + "'", str3.equals("P-1Y11030DT23059059.9900"));
    }

    @Test
    public void DurationFormatUtils0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0490");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) (short) 0, "P0000Y0M0DT0H0M0.010S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y0-10DT07430-10.0103599965" + "'", str3.equals("P0000Y0-10DT07430-10.0103599965"));
    }

    @Test
    public void DurationFormatUtils0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0491");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "0 30a086399", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 30a086399" + "'", str3.equals("0 30a086399"));
    }

    @Test
    public void DurationFormatUtils0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0492");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "P00-1Y11030DT23059059.9990");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P00-1Y11030DT23059059.9990" + "'", str2.equals("P00-1Y11030DT23059059.9990"));
    }

    @Test
    public void DurationFormatUtils0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0493");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y000DT00000.0350", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0350" + "'", str3.equals("P0Y000DT00000.0350"));
    }

    @Test
    public void DurationFormatUtils0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0494");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "P0Y0M0DT0H0M0.031S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0310" + "'", str3.equals("P0Y000DT00000.0310"));
    }

    @Test
    public void DurationFormatUtils0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0495");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((-1L), (long) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", str2.equals("P0Y0M0DT0H0M0.002S"));
    }

    @Test
    public void DurationFormatUtils0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0496");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 100, 0L, "P-1Y11M30DT23H59M59.966S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9663599900" + "'", str3.equals("P-1Y11-130DT2374359-159.9663599900"));
    }

    @Test
    public void DurationFormatUtils0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0497");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 0, (long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.010S" + "'", str2.equals("P0Y0M0DT0H0M0.010S"));
    }

    @Test
    public void DurationFormatUtils0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0498");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 100, "P-1Y11M30DT23H59M59.990S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0499");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 10, (long) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.042S" + "'", str2.equals("P0Y0M0DT0H0M0.042S"));
    }

    @Test
    public void DurationFormatUtils0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.DurationFormatUtils0500");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y0-10DT07430-10.0323599990", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0323599990" + "'", str3.equals("P0Y0-10DT07430-10.0323599990"));
    }
}

