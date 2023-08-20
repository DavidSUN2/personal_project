
package DurationFormatUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DurationFormatUtils3 {

    public static boolean debug = false;

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1501");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P-1Y11030DT23059059.96610");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.96610" + "'", str2.equals("P-1Y11030DT23059059.96610"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1502");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P-1Y11030DT23059059.9911");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9911" + "'", str2.equals("P-1Y11030DT23059059.9911"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1503");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) '4', "P-1Y11030DT23059059.9131");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9131" + "'", str3.equals("P-1Y11030DT23059059.9131"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1504");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y000DT00000.01052", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.01052" + "'", str3.equals("P0Y000DT00000.01052"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1505");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (byte) -1, "P0Y000DT00000.03510", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1506");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P-1Y11M30DT23H59M59.998S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.998-1" + "'", str3.equals("P-1Y11030DT23059059.998-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1507");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.10135", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.10135" + "'", str3.equals("P0Y000DT00000.10135"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1508");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (byte) -1, "P-1Y11030DT23059059.8991", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1509");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y0M0DT0H0M0.042S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.042-1" + "'", str2.equals("P0Y000DT00000.042-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1510");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1511");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(1L, (long) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.099S" + "'", str2.equals("P0Y0M0DT0H0M0.099S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1512");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', 100L, "P-1Y11030DT23059059.9971", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1513");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0000Y0-10DT07430-10.0013599969", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y0-10DT07430-10.0013599969" + "'", str3.equals("P0000Y0-10DT07430-10.0013599969"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1514");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) 0, "P-1Y11030DT23059059.90352", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1515");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', 0L, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1516");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.10135", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.10135" + "'", str3.equals("P0Y000DT00000.10135"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1517");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', 10L, "P0Y0-10DT07430-10.0033599991", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1518");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P-1Y11M30DT23H59M59.958S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.958100" + "'", str2.equals("P-1Y11030DT23059059.958100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1519");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) (short) 1, "P-1Y11030DT23059059.9660", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1520");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) (byte) 1, "P-1Y11-130DT2374359-159.9663599900");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9663599900" + "'", str3.equals("P-1Y11-130DT2374359-159.9663599900"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1521");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P-1Y11M30DT23H59M59.968S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.96810" + "'", str2.equals("P-1Y11030DT23059059.96810"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1522");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y0M0DT0H0M0.101S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.1010" + "'", str3.equals("P0Y000DT00000.1010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1523");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P0000Y000DT00000.10035", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.10035" + "'", str3.equals("P0000Y000DT00000.10035"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1524");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), 10L, "P-1Y11030DT23059059.9581");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9581" + "'", str3.equals("P-1Y11030DT23059059.9581"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1525");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "P0Y000DT00000.0000", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0000" + "'", str3.equals("P0Y000DT00000.0000"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1526");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) (short) 100, "P-1Y11030DT23059059.9681");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9681" + "'", str3.equals("P-1Y11030DT23059059.9681"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1527");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P-1Y11030DT23059059.98910", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.98910" + "'", str3.equals("P-1Y11030DT23059059.98910"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1528");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 1, (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.031S" + "'", str2.equals("P0Y0M0DT0H0M0.031S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1529");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.031-1", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.031-1" + "'", str3.equals("P0Y000DT00000.031-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1530");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, 0L, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11M30DT23H59M59.990S" + "'", str3.equals("P00-1Y11M30DT23H59M59.990S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1531");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (short) 1, "P0000Y0-10DT07430-10.0013599969");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y0-10DT07430-10.0013599969" + "'", str3.equals("P0000Y0-10DT07430-10.0013599969"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1532");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "0 days 0 hours 0 minutes 0 seconds", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 0a00 0 hour 0 0inute0 0 econ00" + "'", str3.equals("0 0a00 0 hour 0 0inute0 0 econ00"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1533");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y0M0DT0H0M0.100S" + "'", str2.equals("P0000Y0M0DT0H0M0.100S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1534");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) '#', "P00-1Y11030DT23059059.9042");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.9042" + "'", str3.equals("P00-1Y11030DT23059059.9042"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1535");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "P-1Y11M30DT23H59M59.983S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.983-1" + "'", str2.equals("P-1Y11030DT23059059.983-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1536");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (byte) 10, "P0000Y000DT00000.051-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.051-1" + "'", str3.equals("P0000Y000DT00000.051-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1537");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "0 0a00");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0 0a00" + "'", str2.equals("0 0a00"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1538");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) 10, "P0Y0M0DT0H0M0.002S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1539");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P00-1Y11030DT23059059.999-1", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.999-1" + "'", str3.equals("P00-1Y11030DT23059059.999-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1540");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P-1Y11M30DT23H59M59.978S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.978100" + "'", str2.equals("P-1Y11030DT23059059.978100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1541");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.0100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0100" + "'", str2.equals("P0Y000DT00000.0100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1542");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, 1L, "P0Y000DT00000.042100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.042100" + "'", str3.equals("P0Y000DT00000.042100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1543");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P0Y000DT00000.03335", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03335" + "'", str3.equals("P0Y000DT00000.03335"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1544");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) -1, (long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.011S" + "'", str2.equals("P0Y0M0DT0H0M0.011S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1545");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 1, (long) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.034S" + "'", str2.equals("P0Y0M0DT0H0M0.034S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1546");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, 0L, "P-1Y11030DT23059059.9131", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1547");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (short) -1, "P0Y0M0DT0H0M0.042S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0423599902" + "'", str3.equals("P0Y0-10DT07430-10.0423599902"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1548");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P00-1Y11030DT23059059.99999", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.99999" + "'", str3.equals("P00-1Y11030DT23059059.99999"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1549");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 'a', 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.904S" + "'", str2.equals("P-1Y11M30DT23H59M59.904S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1550");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.0321");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0321" + "'", str2.equals("P0Y000DT00000.0321"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1551");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((-1L), (long) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1552");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 10, (long) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.090S" + "'", str2.equals("P0Y0M0DT0H0M0.090S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1553");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) (byte) 1, "P0Y0-10DT07430-10.0003599990", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1554");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (-1L), "P0Y0M0DT0H0M0.100S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.1000" + "'", str3.equals("P0Y000DT00000.1000"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1555");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.09635", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.09635" + "'", str3.equals("P0Y000DT00000.09635"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1556");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "0:00:00.035");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0:00:00.035" + "'", str2.equals("0:00:00.035"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1557");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (short) 1, "P0Y000DT00000.05110");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.05110" + "'", str3.equals("P0Y000DT00000.05110"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1558");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P-1Y11030DT23059059.9660", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9660" + "'", str3.equals("P-1Y11030DT23059059.9660"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1559");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, 0L, "P-1Y11M30DT23H59M59.967S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1560");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "0:00:00.035", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.035" + "'", str3.equals("0:00:00.035"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1561");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, 10L, "P0Y000DT00000.01010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.01010" + "'", str3.equals("P0Y000DT00000.01010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1562");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, (long) (byte) 0, "P0Y000DT00000.0420");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0420" + "'", str3.equals("P0Y000DT00000.0420"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1563");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 0, (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.032S" + "'", str2.equals("P0Y0M0DT0H0M0.032S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1564");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.06587", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.06587" + "'", str3.equals("P0Y000DT00000.06587"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1565");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (byte) 100, "P-1Y11M30DT23H59M59.910S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.910101" + "'", str3.equals("P-1Y11030DT23059059.910101"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1566");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), (long) 'a', "P0000Y000DT00000.0011", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1567");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) 0, "P0Y000DT00000.00097");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00097" + "'", str3.equals("P0Y000DT00000.00097"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1568");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), (long) 'a', "P-1Y11030DT23059059.9000", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1569");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "0 86399econ3086399", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 86399econ3086399" + "'", str3.equals("0 86399econ3086399"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1570");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (byte) 1, "P-1Y11M30DT23H59M59.999S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1571");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y0-10DT07430-10.0513599999");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0-10DT07430-10.0513599999" + "'", str2.equals("P0Y0-10DT07430-10.0513599999"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1572");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 0L, "P-1Y11-130DT2374359-159.9893599913");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9893599913" + "'", str3.equals("P-1Y11-130DT2374359-159.9893599913"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1573");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', 100L, "P0000Y0-10DT07430-10.0103599965", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1574");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 10, (long) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.090S" + "'", str2.equals("P0Y0M0DT0H0M0.090S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1575");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P0Y000DT00000.052100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.052100" + "'", str2.equals("P0Y000DT00000.052100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1576");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, 0L, "P0Y000DT00000.00310");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00310" + "'", str3.equals("P0Y000DT00000.00310"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1577");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) 10, "P-1Y11030DT23059059.998-1", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1578");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, (long) '#', "P-1Y11030DT23059059.90352", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1579");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) '#', (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.997S" + "'", str2.equals("P-1Y11M30DT23H59M59.997S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1580");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (byte) 10, "P-1Y11030DT23059059.9971");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9971" + "'", str3.equals("P-1Y11030DT23059059.9971"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1581");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P0Y000DT00000.00311", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00311" + "'", str3.equals("P0Y000DT00000.00311"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1582");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y0M0DT0H0M0.065S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0650" + "'", str2.equals("P0Y000DT00000.0650"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1583");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.022-1", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.022-1" + "'", str3.equals("P0Y000DT00000.022-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1584");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) 1, "P0Y000DT00000.00152");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00152" + "'", str3.equals("P0Y000DT00000.00152"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1585");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 10, (long) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.087S" + "'", str2.equals("P0Y0M0DT0H0M0.087S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1586");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P0Y000DT00000.09052", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.09052" + "'", str3.equals("P0Y000DT00000.09052"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1587");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.0031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0031" + "'", str2.equals("P0Y000DT00000.0031"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1588");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P0000Y000DT00000.00110", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.00110" + "'", str3.equals("P0000Y000DT00000.00110"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1589");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(100L, (long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.910S" + "'", str2.equals("P-1Y11M30DT23H59M59.910S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1590");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) '#', "P-1Y11030DT23059059.9580", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1591");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(1L, (long) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.099S" + "'", str2.equals("P0Y0M0DT0H0M0.099S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1592");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y0-10DT07430-10.1003599990", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.1003599990" + "'", str3.equals("P0Y0-10DT07430-10.1003599990"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1593");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, 10L, "P-1Y11030DT23059059.99810");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.99810" + "'", str3.equals("P-1Y11030DT23059059.99810"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1594");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.065100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.065100" + "'", str2.equals("P0Y000DT00000.065100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1595");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P00-1Y11030DT23059059.90417");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P00-1Y11030DT23059059.90417" + "'", str2.equals("P00-1Y11030DT23059059.90417"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1596");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P-1Y11030DT23059059.952100", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.952100" + "'", str3.equals("P-1Y11030DT23059059.952100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1597");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P0Y0M0DT0H0M0.065S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.06510" + "'", str2.equals("P0Y000DT00000.06510"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1598");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, 100L, "", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1599");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) '#', "P-1Y11030DT23059059.99952");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.99952" + "'", str3.equals("P-1Y11030DT23059059.99952"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1600");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, 1L, "P0Y000DT00000.0321", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1601");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 10, 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.990S" + "'", str2.equals("P-1Y11M30DT23H59M59.990S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1602");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.1010", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.1010" + "'", str3.equals("P0Y000DT00000.1010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1603");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.06587", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.06587" + "'", str3.equals("P0Y000DT00000.06587"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1604");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, (long) (short) 1, "P0Y0M0DT0H0M0.003S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1605");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P-1Y11030DT23059059.9581", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9581" + "'", str3.equals("P-1Y11030DT23059059.9581"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1606");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 100, 0L, "P-1Y11030DT23059059.9750");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9750" + "'", str3.equals("P-1Y11030DT23059059.9750"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1607");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P0000Y0M0DT0H0M0.010S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.0101" + "'", str2.equals("P0000Y000DT00000.0101"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1608");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', 0L, "P0Y000DT00000.031-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.031-1" + "'", str3.equals("P0Y000DT00000.031-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1609");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 0, (long) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.035S" + "'", str2.equals("P0Y0M0DT0H0M0.035S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1610");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "P00-1Y11030DT23059059.99999", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.99999" + "'", str3.equals("P00-1Y11030DT23059059.99999"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1611");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.00152", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00152" + "'", str3.equals("P0Y000DT00000.00152"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1612");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "P-1Y11030DT23059059.9321");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9321" + "'", str2.equals("P-1Y11030DT23059059.9321"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1613");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y000DT00000.10010", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.10010" + "'", str3.equals("P0Y000DT00000.10010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1614");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, (long) 'a', "0 0a000 0 hour 0 0inute00 0 econ00");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 0a000 0 hour 0 0inute00 0 econ00" + "'", str3.equals("0 0a000 0 hour 0 0inute00 0 econ00"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1615");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.0020");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0020" + "'", str2.equals("P0Y000DT00000.0020"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1616");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "0 0a00 0 hour 0 0inute0 0 econ00");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0 0a00 0 hour 0 0inute0 0 econ00" + "'", str2.equals("0 0a00 0 hour 0 0inute0 0 econ00"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1617");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) 0, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1618");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) '#', "P00-1Y11030DT23059059.99910");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.99910" + "'", str3.equals("P00-1Y11030DT23059059.99910"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1619");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (byte) 100, "P-1Y11M30DT23H59M59.967S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.967101" + "'", str3.equals("P-1Y11030DT23059059.967101"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1620");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 100, false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1621");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.0900", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0900" + "'", str3.equals("P0Y000DT00000.0900"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1622");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) '4', "", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1623");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 1, (long) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.099S" + "'", str2.equals("P0Y0M0DT0H0M0.099S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1624");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) (short) 1, "P0Y000DT00000.0329");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0329" + "'", str3.equals("P0Y000DT00000.0329"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1625");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y000DT00000.00210", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00210" + "'", str3.equals("P0Y000DT00000.00210"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1626");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1627");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P-1Y11M30DT23H59M59.965S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9650" + "'", str2.equals("P-1Y11030DT23059059.9650"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1628");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y0M0DT0H0M0.099S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0990" + "'", str3.equals("P0Y000DT00000.0990"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1629");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, (long) '#', "P00-1Y11030DT23059059.999100", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1630");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 'a', (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.935S" + "'", str2.equals("P-1Y11M30DT23H59M59.935S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1631");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) 1, "P0Y000DT00000.03211", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1632");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, 10L, "P0000Y000DT00000.051-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.051-1" + "'", str3.equals("P0000Y000DT00000.051-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1633");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) '#', "", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1634");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "P0Y000DT00000.01035", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.01035" + "'", str3.equals("P0Y000DT00000.01035"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1635");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (short) 1, "P0Y000DT00000.1000");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.1000" + "'", str3.equals("P0Y000DT00000.1000"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1636");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, 0L, "P0000Y000DT00000.0510", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1637");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) 10, "P00-1Y11030DT23059059.90417");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.90417" + "'", str3.equals("P00-1Y11030DT23059059.90417"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1638");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) (byte) -1, "P0Y000DT00000.99-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.99-1" + "'", str3.equals("P0Y000DT00000.99-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1639");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P-1Y11030DT23059059.9320", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9320" + "'", str3.equals("P-1Y11030DT23059059.9320"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1640");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y0-10DT07430-10.0003599990", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0003599990" + "'", str3.equals("P0Y0-10DT07430-10.0003599990"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1641");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y0M0DT0H0M0.087S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.087-1" + "'", str3.equals("P0Y000DT00000.087-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1642");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 100, (long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1643");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, 1L, "P0Y000DT00000.05332", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1644");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "P-1Y11-130DT2374359-159.9893599913", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9893599913" + "'", str3.equals("P-1Y11-130DT2374359-159.9893599913"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1645");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P0Y0M0DT0H0M0.100S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.10052" + "'", str3.equals("P0Y000DT00000.10052"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1646");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P-1Y11030DT23059059.9890", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9890" + "'", str3.equals("P-1Y11030DT23059059.9890"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1647");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) ' ', "P0Y000DT00000.032-1", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1648");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(1L, (long) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.999S" + "'", str2.equals("P-1Y11M30DT23H59M59.999S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1649");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) (-1), "P0Y000DT00000.0030", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1650");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P0Y000DT00000.03352", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03352" + "'", str3.equals("P0Y000DT00000.03352"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1651");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P-1Y11M30DT23H59M59.983S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.98397" + "'", str3.equals("P-1Y11030DT23059059.98397"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1652");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P0Y000DT00000.0900", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0900" + "'", str3.equals("P0Y000DT00000.0900"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1653");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 1, (long) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.099S" + "'", str2.equals("P0Y0M0DT0H0M0.099S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1654");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (byte) 10, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1655");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) (short) 1, "P0Y000DT00000.00311", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1656");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P-1Y11M30DT23H59M59.968S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.968100" + "'", str3.equals("P-1Y11030DT23059059.968100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1657");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.05332", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.05332" + "'", str3.equals("P0Y000DT00000.05332"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1658");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(0L, (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.032S" + "'", str2.equals("P0Y0M0DT0H0M0.032S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1659");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) 10, "P-1Y11030DT23059059.99010", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1660");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.03196", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03196" + "'", str3.equals("P0Y000DT00000.03196"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1661");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P0Y000DT00000.09052");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.09052" + "'", str2.equals("P0Y000DT00000.09052"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1662");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P-1Y11030DT23059059.9031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9031" + "'", str2.equals("P-1Y11030DT23059059.9031"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1663");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.087100", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.087100" + "'", str3.equals("P0Y000DT00000.087100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1664");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P0000Y000DT00000.9910");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.9910" + "'", str2.equals("P0000Y000DT00000.9910"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1665");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P-1Y11030DT23059059.9580", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9580" + "'", str3.equals("P-1Y11030DT23059059.9580"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1666");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P-1Y11M30DT23H59M59.983S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.983100" + "'", str2.equals("P-1Y11030DT23059059.983100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1667");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "P-1Y11030DT23059059.958100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.958100" + "'", str2.equals("P-1Y11030DT23059059.958100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1668");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) (short) 10, "P-1Y11-130DT2374359-159.9323599899");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9323599899" + "'", str3.equals("P-1Y11-130DT2374359-159.9323599899"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1669");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (short) 1, false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1670");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P-1Y11M30DT23H59M59.899S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.8990" + "'", str2.equals("P-1Y11030DT23059059.8990"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1671");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) 1, "P0Y000DT00000.01052", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1672");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.052-1", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.052-1" + "'", str3.equals("P0Y000DT00000.052-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1673");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) (byte) -1, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1674");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P0Y000DT00000.06510", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.06510" + "'", str3.equals("P0Y000DT00000.06510"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1675");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (short) -1, "P0Y000DT00000.00311");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00311" + "'", str3.equals("P0Y000DT00000.00311"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1676");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(100L, 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.901S" + "'", str2.equals("P-1Y11M30DT23H59M59.901S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1677");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) (short) 10, "P0Y000DT00000.031-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.031-1" + "'", str3.equals("P0Y000DT00000.031-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1678");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P0Y000DT00000.00153", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00153" + "'", str3.equals("P0Y000DT00000.00153"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1679");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.03335", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03335" + "'", str3.equals("P0Y000DT00000.03335"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1680");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, 10L, "P-1Y11030DT23059059.91090");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.91090" + "'", str3.equals("P-1Y11030DT23059059.91090"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1681");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.0350", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0350" + "'", str3.equals("P0Y000DT00000.0350"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1682");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) (-1), "P0Y000DT00000.0020", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1683");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, 1L, "0 30a086399", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1684");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) '4', (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.980S" + "'", str2.equals("P-1Y11M30DT23H59M59.980S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1685");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 100, (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.932S" + "'", str2.equals("P-1Y11M30DT23H59M59.932S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1686");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (-1L), "P0Y000DT00000.00111");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00111" + "'", str3.equals("P0Y000DT00000.00111"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1687");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P-1Y11030DT23059059.9900");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9900" + "'", str2.equals("P-1Y11030DT23059059.9900"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1688");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P0000Y0-10DT07430-10.0103599913", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y0-10DT07430-10.0103599913" + "'", str3.equals("P0000Y0-10DT07430-10.0103599913"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1689");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, 0L, "P-1Y11030DT23059059.9131");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9131" + "'", str3.equals("P-1Y11030DT23059059.9131"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1690");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P0Y000DT00000.002100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.002100" + "'", str2.equals("P0Y000DT00000.002100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1691");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P00-1Y11-130DT2374359-159.9043599990", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11-130DT2374359-159.9043599990" + "'", str3.equals("P00-1Y11-130DT2374359-159.9043599990"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1692");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P0Y0M0DT0H0M0.001S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.001-1" + "'", str3.equals("P0Y000DT00000.001-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1693");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, 1L, "P0000Y000DT00000.9910");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.9910" + "'", str3.equals("P0000Y000DT00000.9910"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1694");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) ' ', "P-1Y11030DT23059059.978100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.978100" + "'", str3.equals("P-1Y11030DT23059059.978100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1695");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) (short) 10, "P0Y000DT00000.01052", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1696");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, (long) (byte) 0, "P-1Y11M30DT23H59M59.997S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9973599900" + "'", str3.equals("P-1Y11-130DT2374359-159.9973599900"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1697");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P-1Y11030DT23059059.9321", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9321" + "'", str3.equals("P-1Y11030DT23059059.9321"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1698");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P-1Y11030DT23059059.9890");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9890" + "'", str2.equals("P-1Y11030DT23059059.9890"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1699");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (short) -1, "0 days 0 hours 0 minutes 0 seconds");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 0a000 0 hour 0 0inute00 0 econ00" + "'", str3.equals("0 0a000 0 hour 0 0inute00 0 econ00"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1700");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), (long) (short) -1, "P0Y0M0DT0H0M0.099S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1701");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, 0L, "P-1Y11030DT23059059.93252");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.93252" + "'", str3.equals("P-1Y11030DT23059059.93252"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1702");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.01035", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.01035" + "'", str3.equals("P0Y000DT00000.01035"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1703");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), (long) (byte) 0, "P0Y000DT00000.042-1", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1704");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) 1, "0:00:00.097");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.097" + "'", str3.equals("0:00:00.097"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1705");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) 1, "P-1Y11030DT23059059.9031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9031" + "'", str3.equals("P-1Y11030DT23059059.9031"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1706");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, 0L, "P0Y000DT00000.06535", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1707");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 10, true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1708");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P-1Y11030DT23059059.9661", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9661" + "'", str3.equals("P-1Y11030DT23059059.9661"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1709");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (short) 0, "P0Y000DT00000.03133");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03133" + "'", str3.equals("P0Y000DT00000.03133"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1710");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P00-1Y11030DT23059059.90417", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.90417" + "'", str3.equals("P00-1Y11030DT23059059.90417"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1711");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P00-1Y11030DT23059059.9991");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P00-1Y11030DT23059059.9991" + "'", str2.equals("P00-1Y11030DT23059059.9991"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1712");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, (long) (byte) -1, "P-1Y11030DT23059059.9971");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9971" + "'", str3.equals("P-1Y11030DT23059059.9971"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1713");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P-1Y11030DT23059059.9830", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9830" + "'", str3.equals("P-1Y11030DT23059059.9830"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1714");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, 0L, "P-1Y11030DT23059059.9000");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9000" + "'", str3.equals("P-1Y11030DT23059059.9000"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1715");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) 'a', "P00-1Y11030DT23059059.999100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.999100" + "'", str3.equals("P00-1Y11030DT23059059.999100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1716");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', (long) (byte) -1, "0:00:00.100", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1717");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y000DT00000.00097", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00097" + "'", str3.equals("P0Y000DT00000.00097"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1718");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.05110", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.05110" + "'", str3.equals("P0Y000DT00000.05110"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1719");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(0L, 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.010S" + "'", str2.equals("P0Y0M0DT0H0M0.010S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1720");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) (short) 100, "P0Y000DT00000.10135", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1721");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.097100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.097100" + "'", str2.equals("P0Y000DT00000.097100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1722");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.0011", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0011" + "'", str3.equals("P0Y000DT00000.0011"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1723");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P-1Y11M30DT23H59M59.901S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9011" + "'", str3.equals("P-1Y11030DT23059059.9011"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1724");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 10, (long) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.989S" + "'", str2.equals("P-1Y11M30DT23H59M59.989S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1725");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (byte) 0, "P-1Y11M30DT23H59M59.902S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9021" + "'", str3.equals("P-1Y11030DT23059059.9021"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1726");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) ' ', 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.969S" + "'", str2.equals("P-1Y11M30DT23H59M59.969S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1727");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, 10L, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1728");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', (-1L), "P0Y000DT00000.00153");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00153" + "'", str3.equals("P0Y000DT00000.00153"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1729");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) 'a', "P0Y0M0DT0H0M0.053S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1730");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P-1Y11-130DT2374359-159.9103599998");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11-130DT2374359-159.9103599998" + "'", str2.equals("P-1Y11-130DT2374359-159.9103599998"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1731");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) (byte) 0, "P00-1Y11030DT23059059.999-1", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1732");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P0Y0M0DT0H0M0.033S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.033100" + "'", str3.equals("P0Y000DT00000.033100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1733");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) 'a', "P0Y0M0DT0H0M0.000S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00097" + "'", str3.equals("P0Y000DT00000.00097"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1734");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 0L, "P0Y000DT00000.03211");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03211" + "'", str3.equals("P0Y000DT00000.03211"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1735");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) 10, "P0Y0-10DT07430-10.0033599991");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0033599991" + "'", str3.equals("P0Y0-10DT07430-10.0033599991"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1736");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P0Y000DT00000.0900");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0900" + "'", str2.equals("P0Y000DT00000.0900"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1737");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (short) 0, "P0Y0M0DT0H0M0.034S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1738");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.022-1", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.022-1" + "'", str3.equals("P0Y000DT00000.022-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1739");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.00311", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00311" + "'", str3.equals("P0Y000DT00000.00311"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1740");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) (short) -1, "P-1Y11030DT23059059.910101", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1741");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) 0, "P0Y000DT00000.0039", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1742");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, 0L, "0 0a00");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 0a00" + "'", str3.equals("0 0a00"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1743");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y000DT00000.00099");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.00099" + "'", str2.equals("P0Y000DT00000.00099"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1744");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P0Y000DT00000.031-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.031-1" + "'", str2.equals("P0Y000DT00000.031-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1745");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) (short) 10, "P0Y000DT00000.05110", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1746");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (short) 1, "P0Y000DT00000.096100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.096100" + "'", str3.equals("P0Y000DT00000.096100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1747");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P0Y0M0DT0H0M0.053S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0531" + "'", str2.equals("P0Y000DT00000.0531"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1748");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) -1, (long) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", str2.equals("P0Y0M0DT0H0M0.002S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1749");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (short) 1, "P0Y0M0DT0H0M0.99S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.992" + "'", str3.equals("P0Y000DT00000.992"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1750");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) '4', "P0Y0M0DT0H0M0.053S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1751");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), (long) (byte) -1, "P0000Y000DT00000.0100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.0100" + "'", str3.equals("P0000Y000DT00000.0100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1752");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) (short) 100, "P0Y000DT00000.033-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.033-1" + "'", str3.equals("P0Y000DT00000.033-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1753");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P0Y0-10DT07430-10.0013599947", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0013599947" + "'", str3.equals("P0Y0-10DT07430-10.0013599947"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1754");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 0L, "P0Y000DT00000.001-1", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1755");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y0M0DT0H0M0.096S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.09697" + "'", str2.equals("P0Y000DT00000.09697"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1756");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P0Y000DT00000.09690", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.09690" + "'", str3.equals("P0Y000DT00000.09690"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1757");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (short) 100, "P0Y0-10DT07430-10.0333599899");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0333599899" + "'", str3.equals("P0Y0-10DT07430-10.0333599899"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1758");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y000DT00000.0990");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0990" + "'", str2.equals("P0Y000DT00000.0990"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1759");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(100L, (long) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.935S" + "'", str2.equals("P-1Y11M30DT23H59M59.935S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1760");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P0Y0M0DT0H0M0.051S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.05152" + "'", str3.equals("P0Y000DT00000.05152"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1761");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P-1Y11M30DT23H59M59.998S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9980" + "'", str3.equals("P-1Y11030DT23059059.9980"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1762");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P-1Y11030DT23059059.96852", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.96852" + "'", str3.equals("P-1Y11030DT23059059.96852"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1763");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, (-1L), "", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1764");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, 0L, "P-1Y11M30DT23H59M59.967S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1765");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (short) -1, "P0Y0M0DT0H0M0.99S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1766");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, (long) (short) 10, "P-1Y11030DT23059059.9131");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9131" + "'", str3.equals("P-1Y11030DT23059059.9131"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1767");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, 0L, "P0Y000DT00000.00111");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00111" + "'", str3.equals("P0Y000DT00000.00111"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1768");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P0Y000DT00000.03335");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.03335" + "'", str2.equals("P0Y000DT00000.03335"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1769");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P-1Y11M30DT23H59M59.902S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9020" + "'", str3.equals("P-1Y11030DT23059059.9020"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1770");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, (long) (short) -1, "P0Y000DT00000.9910");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.9910" + "'", str3.equals("P0Y000DT00000.9910"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1771");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P-1Y11030DT23059059.90010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.90010" + "'", str2.equals("P-1Y11030DT23059059.90010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1772");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P-1Y11030DT23059059.9001");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9001" + "'", str2.equals("P-1Y11030DT23059059.9001"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1773");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.0659");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0659" + "'", str2.equals("P0Y000DT00000.0659"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1774");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 1L, "P0Y000DT00000.0531", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1775");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y0M0DT0H0M0.009S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.00910" + "'", str2.equals("P0Y000DT00000.00910"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1776");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) -1, (long) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", str2.equals("P0Y0M0DT0H0M0.002S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1777");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.00153");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.00153" + "'", str2.equals("P0Y000DT00000.00153"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1778");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P-1Y11030DT23059059.90132", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.90132" + "'", str3.equals("P-1Y11030DT23059059.90132"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1779");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P-1Y11030DT23059059.901100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.901100" + "'", str2.equals("P-1Y11030DT23059059.901100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1780");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) '#', 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.965S" + "'", str2.equals("P-1Y11M30DT23H59M59.965S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1781");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "P-1Y11030DT23059059.9890", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9890" + "'", str3.equals("P-1Y11030DT23059059.9890"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1782");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (byte) 0, false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1783");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P0Y000DT00000.033100", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.033100" + "'", str3.equals("P0Y000DT00000.033100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1784");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.09632");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.09632" + "'", str2.equals("P0Y000DT00000.09632"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1785");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, (long) (short) 0, "P0Y000DT00000.06510", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1786");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.0090", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0090" + "'", str3.equals("P0Y000DT00000.0090"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1787");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "0 30a086399", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 30a086399" + "'", str3.equals("0 30a086399"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1788");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (byte) 100, "P0000Y000DT00000.010-1", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1789");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.087-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.087-1" + "'", str2.equals("P0Y000DT00000.087-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1790");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0000Y000DT00000.9910", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.9910" + "'", str3.equals("P0000Y000DT00000.9910"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1791");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P-1Y11030DT23059059.9131");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9131" + "'", str2.equals("P-1Y11030DT23059059.9131"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1792");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) (byte) 100, "P-1Y11030DT23059059.989100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.989100" + "'", str3.equals("P-1Y11030DT23059059.989100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1793");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) '4', "P0Y000DT00000.01035");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.01035" + "'", str3.equals("P0Y000DT00000.01035"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1794");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P-1Y11M30DT23H59M59.966S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.966-1" + "'", str2.equals("P-1Y11030DT23059059.966-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1795");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.09010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.09010" + "'", str2.equals("P0Y000DT00000.09010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1796");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), (long) (byte) -1, "P0Y000DT00000.10135", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1797");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) (byte) 100, "P-1Y11M30DT23H59M59.969S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1798");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) 10, "P0000Y000DT00000.01099", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1799");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(100L, (long) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.997S" + "'", str2.equals("P-1Y11M30DT23H59M59.997S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1800");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), (long) (byte) -1, "P-1Y11030DT23059059.98910");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.98910" + "'", str3.equals("P-1Y11030DT23059059.98910"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1801");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P0Y000DT00000.9952", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.9952" + "'", str3.equals("P0Y000DT00000.9952"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1802");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P-1Y11030DT23059059.9690", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9690" + "'", str3.equals("P-1Y11030DT23059059.9690"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1803");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, (long) (byte) 0, "P-1Y11030DT23059059.9021");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9021" + "'", str3.equals("P-1Y11030DT23059059.9021"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1804");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(1L, (long) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.998S" + "'", str2.equals("P-1Y11M30DT23H59M59.998S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1805");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P0Y0-10DT07430-10.0323599990", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0323599990" + "'", str3.equals("P0Y0-10DT07430-10.0323599990"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1806");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "P0Y0-10DT07430-10.0323599990", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0323599990" + "'", str3.equals("P0Y0-10DT07430-10.0323599990"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1807");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) 'a', "P00-1Y11030DT23059059.9991");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.9991" + "'", str3.equals("P00-1Y11030DT23059059.9991"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1808");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) '4', "P0000Y000DT00000.01099");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.01099" + "'", str3.equals("P0000Y000DT00000.01099"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1809");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) (short) 10, "P0Y000DT00000.0531");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0531" + "'", str3.equals("P0Y000DT00000.0531"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1810");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (byte) 0, "P-1Y11030DT23059059.99097", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1811");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 100, (long) 0, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1812");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P-1Y11M30DT23H59M59.980S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.98010" + "'", str3.equals("P-1Y11030DT23059059.98010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1813");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "P-1Y11030DT23059059.9900");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9900" + "'", str2.equals("P-1Y11030DT23059059.9900"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1814");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) (-1), "P0Y000DT00000.03297");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03297" + "'", str3.equals("P0Y000DT00000.03297"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1815");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P-1Y11030DT23059059.9991", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9991" + "'", str3.equals("P-1Y11030DT23059059.9991"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1816");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) 0, "P-1Y11030DT23059059.989100", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1817");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(0L, (long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.100S" + "'", str2.equals("P0Y0M0DT0H0M0.100S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1818");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 100, "P-1Y11030DT23059059.9901", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1819");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1820");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P0Y000DT00000.03211");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.03211" + "'", str2.equals("P0Y000DT00000.03211"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1821");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P-1Y11-130DT2374359-159.9663599900");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11-130DT2374359-159.9663599900" + "'", str2.equals("P-1Y11-130DT2374359-159.9663599900"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1822");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.0020");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0020" + "'", str2.equals("P0Y000DT00000.0020"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1823");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "P-1Y11030DT23059059.99010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.99010" + "'", str2.equals("P-1Y11030DT23059059.99010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1824");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P-1Y11M30DT23H59M59.980S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.980100" + "'", str3.equals("P-1Y11030DT23059059.980100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1825");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, (long) (short) 1, "P-1Y11030DT23059059.9971");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9971" + "'", str3.equals("P-1Y11030DT23059059.9971"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1826");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0000Y000DT00000.01099", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.01099" + "'", str3.equals("P0000Y000DT00000.01099"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1827");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "P-1Y11M30DT23H59M59.964S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9641" + "'", str3.equals("P-1Y11030DT23059059.9641"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1828");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "P-1Y11030DT23059059.901-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.901-1" + "'", str2.equals("P-1Y11030DT23059059.901-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1829");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 0L, "P0Y0M0DT0H0M0.020S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1830");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.001-1", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.001-1" + "'", str3.equals("P0Y000DT00000.001-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1831");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P0Y0M0DT0H0M0.000S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0001" + "'", str3.equals("P0Y000DT00000.0001"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1832");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "P-1Y11M30DT23H59M59.968S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9680" + "'", str3.equals("P-1Y11030DT23059059.9680"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1833");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P0Y000DT00000.09052");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.09052" + "'", str2.equals("P0Y000DT00000.09052"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1834");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "P-1Y11030DT23059059.96610");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.96610" + "'", str2.equals("P-1Y11030DT23059059.96610"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1835");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) (byte) -1, "P0000Y0-10DT07430-10.0103599913", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1836");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) 10, "P-1Y11030DT23059059.9690");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9690" + "'", str3.equals("P-1Y11030DT23059059.9690"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1837");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 1, "P00-1Y11M30DT23H59M59.999S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1838");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, (long) ' ', "P0Y000DT00000.10110");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.10110" + "'", str3.equals("P0Y000DT00000.10110"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1839");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 100, 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1840");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) 0, "0 86399econ3086399");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 86399econ3086399" + "'", str3.equals("0 86399econ3086399"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1841");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) -1, (long) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.098S" + "'", str2.equals("P0Y0M0DT0H0M0.098S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1842");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, 0L, "P0Y000DT00000.10135", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.test1843");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 0L, "P0Y000DT00000.9952");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.9952" + "'", str3.equals("P0Y000DT00000.9952"));
    }
}

