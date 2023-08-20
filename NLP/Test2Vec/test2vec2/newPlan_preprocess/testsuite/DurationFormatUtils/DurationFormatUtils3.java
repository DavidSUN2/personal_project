package DurationFormatUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DurationFormatUtils3 {

    public static boolean debug = false;

    @Test
    public void DurationFormatUtils1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1501");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P-1Y11030DT23059059.96610");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.96610" + "'", str2.equals("P-1Y11030DT23059059.96610"));
    }

    @Test
    public void DurationFormatUtils1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1502");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P-1Y11030DT23059059.9911");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9911" + "'", str2.equals("P-1Y11030DT23059059.9911"));
    }

    @Test
    public void DurationFormatUtils1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1503");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) '4', "P-1Y11030DT23059059.9131");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9131" + "'", str3.equals("P-1Y11030DT23059059.9131"));
    }

    @Test
    public void DurationFormatUtils1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1504");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y000DT00000.01052", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.01052" + "'", str3.equals("P0Y000DT00000.01052"));
    }

    @Test
    public void DurationFormatUtils1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1505");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (byte) -1, "P0Y000DT00000.03510", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1506");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P-1Y11M30DT23H59M59.998S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.998-1" + "'", str3.equals("P-1Y11030DT23059059.998-1"));
    }

    @Test
    public void DurationFormatUtils1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1507");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.10135", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.10135" + "'", str3.equals("P0Y000DT00000.10135"));
    }

    @Test
    public void DurationFormatUtils1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1508");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (byte) -1, "P-1Y11030DT23059059.8991", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1509");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y0M0DT0H0M0.042S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.042-1" + "'", str2.equals("P0Y000DT00000.042-1"));
    }

    @Test
    public void DurationFormatUtils1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1510");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void DurationFormatUtils1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1511");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(1L, (long) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.099S" + "'", str2.equals("P0Y0M0DT0H0M0.099S"));
    }

    @Test
    public void DurationFormatUtils1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1512");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', 100L, "P-1Y11030DT23059059.9971", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1513");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0000Y0-10DT07430-10.0013599969", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y0-10DT07430-10.0013599969" + "'", str3.equals("P0000Y0-10DT07430-10.0013599969"));
    }

    @Test
    public void DurationFormatUtils1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1514");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) 0, "P-1Y11030DT23059059.90352", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1515");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', 0L, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1516");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.10135", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.10135" + "'", str3.equals("P0Y000DT00000.10135"));
    }

    @Test
    public void DurationFormatUtils1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1517");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', 10L, "P0Y0-10DT07430-10.0033599991", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1518");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P-1Y11M30DT23H59M59.958S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.958100" + "'", str2.equals("P-1Y11030DT23059059.958100"));
    }

    @Test
    public void DurationFormatUtils1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1519");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) (short) 1, "P-1Y11030DT23059059.9660", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1520");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) (byte) 1, "P-1Y11-130DT2374359-159.9663599900");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9663599900" + "'", str3.equals("P-1Y11-130DT2374359-159.9663599900"));
    }

    @Test
    public void DurationFormatUtils1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1521");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P-1Y11M30DT23H59M59.968S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.96810" + "'", str2.equals("P-1Y11030DT23059059.96810"));
    }

    @Test
    public void DurationFormatUtils1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1522");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y0M0DT0H0M0.101S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.1010" + "'", str3.equals("P0Y000DT00000.1010"));
    }

    @Test
    public void DurationFormatUtils1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1523");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P0000Y000DT00000.10035", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.10035" + "'", str3.equals("P0000Y000DT00000.10035"));
    }

    @Test
    public void DurationFormatUtils1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1524");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), 10L, "P-1Y11030DT23059059.9581");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9581" + "'", str3.equals("P-1Y11030DT23059059.9581"));
    }

    @Test
    public void DurationFormatUtils1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1525");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "P0Y000DT00000.0000", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0000" + "'", str3.equals("P0Y000DT00000.0000"));
    }

    @Test
    public void DurationFormatUtils1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1526");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) (short) 100, "P-1Y11030DT23059059.9681");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9681" + "'", str3.equals("P-1Y11030DT23059059.9681"));
    }

    @Test
    public void DurationFormatUtils1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1527");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P-1Y11030DT23059059.98910", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.98910" + "'", str3.equals("P-1Y11030DT23059059.98910"));
    }

    @Test
    public void DurationFormatUtils1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1528");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 1, (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.031S" + "'", str2.equals("P0Y0M0DT0H0M0.031S"));
    }

    @Test
    public void DurationFormatUtils1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1529");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.031-1", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.031-1" + "'", str3.equals("P0Y000DT00000.031-1"));
    }

    @Test
    public void DurationFormatUtils1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1530");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, 0L, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11M30DT23H59M59.990S" + "'", str3.equals("P00-1Y11M30DT23H59M59.990S"));
    }

    @Test
    public void DurationFormatUtils1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1531");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (short) 1, "P0000Y0-10DT07430-10.0013599969");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y0-10DT07430-10.0013599969" + "'", str3.equals("P0000Y0-10DT07430-10.0013599969"));
    }

    @Test
    public void DurationFormatUtils1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1532");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "0 days 0 hours 0 minutes 0 seconds", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 0a00 0 hour 0 0inute0 0 econ00" + "'", str3.equals("0 0a00 0 hour 0 0inute0 0 econ00"));
    }

    @Test
    public void DurationFormatUtils1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1533");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y0M0DT0H0M0.100S" + "'", str2.equals("P0000Y0M0DT0H0M0.100S"));
    }

    @Test
    public void DurationFormatUtils1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1534");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) '#', "P00-1Y11030DT23059059.9042");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.9042" + "'", str3.equals("P00-1Y11030DT23059059.9042"));
    }

    @Test
    public void DurationFormatUtils1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1535");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "P-1Y11M30DT23H59M59.983S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.983-1" + "'", str2.equals("P-1Y11030DT23059059.983-1"));
    }

    @Test
    public void DurationFormatUtils1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1536");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (byte) 10, "P0000Y000DT00000.051-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.051-1" + "'", str3.equals("P0000Y000DT00000.051-1"));
    }

    @Test
    public void DurationFormatUtils1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1537");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "0 0a00");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0 0a00" + "'", str2.equals("0 0a00"));
    }

    @Test
    public void DurationFormatUtils1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1538");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) 10, "P0Y0M0DT0H0M0.002S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1539");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P00-1Y11030DT23059059.999-1", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.999-1" + "'", str3.equals("P00-1Y11030DT23059059.999-1"));
    }

    @Test
    public void DurationFormatUtils1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1540");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P-1Y11M30DT23H59M59.978S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.978100" + "'", str2.equals("P-1Y11030DT23059059.978100"));
    }

    @Test
    public void DurationFormatUtils1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1541");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.0100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0100" + "'", str2.equals("P0Y000DT00000.0100"));
    }

    @Test
    public void DurationFormatUtils1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1542");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, 1L, "P0Y000DT00000.042100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.042100" + "'", str3.equals("P0Y000DT00000.042100"));
    }

    @Test
    public void DurationFormatUtils1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1543");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P0Y000DT00000.03335", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03335" + "'", str3.equals("P0Y000DT00000.03335"));
    }

    @Test
    public void DurationFormatUtils1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1544");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) -1, (long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.011S" + "'", str2.equals("P0Y0M0DT0H0M0.011S"));
    }

    @Test
    public void DurationFormatUtils1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1545");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 1, (long) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.034S" + "'", str2.equals("P0Y0M0DT0H0M0.034S"));
    }

    @Test
    public void DurationFormatUtils1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1546");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, 0L, "P-1Y11030DT23059059.9131", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1547");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (short) -1, "P0Y0M0DT0H0M0.042S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0423599902" + "'", str3.equals("P0Y0-10DT07430-10.0423599902"));
    }

    @Test
    public void DurationFormatUtils1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1548");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P00-1Y11030DT23059059.99999", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.99999" + "'", str3.equals("P00-1Y11030DT23059059.99999"));
    }

    @Test
    public void DurationFormatUtils1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1549");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 'a', 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.904S" + "'", str2.equals("P-1Y11M30DT23H59M59.904S"));
    }

    @Test
    public void DurationFormatUtils1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1550");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.0321");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0321" + "'", str2.equals("P0Y000DT00000.0321"));
    }

    @Test
    public void DurationFormatUtils1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1551");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((-1L), (long) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1552");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 10, (long) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.090S" + "'", str2.equals("P0Y0M0DT0H0M0.090S"));
    }

    @Test
    public void DurationFormatUtils1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1553");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) (byte) 1, "P0Y0-10DT07430-10.0003599990", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1554");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (-1L), "P0Y0M0DT0H0M0.100S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.1000" + "'", str3.equals("P0Y000DT00000.1000"));
    }

    @Test
    public void DurationFormatUtils1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1555");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.09635", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.09635" + "'", str3.equals("P0Y000DT00000.09635"));
    }

    @Test
    public void DurationFormatUtils1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1556");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "0:00:00.035");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0:00:00.035" + "'", str2.equals("0:00:00.035"));
    }

    @Test
    public void DurationFormatUtils1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1557");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (short) 1, "P0Y000DT00000.05110");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.05110" + "'", str3.equals("P0Y000DT00000.05110"));
    }

    @Test
    public void DurationFormatUtils1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1558");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P-1Y11030DT23059059.9660", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9660" + "'", str3.equals("P-1Y11030DT23059059.9660"));
    }

    @Test
    public void DurationFormatUtils1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1559");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, 0L, "P-1Y11M30DT23H59M59.967S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1560");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "0:00:00.035", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.035" + "'", str3.equals("0:00:00.035"));
    }

    @Test
    public void DurationFormatUtils1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1561");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, 10L, "P0Y000DT00000.01010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.01010" + "'", str3.equals("P0Y000DT00000.01010"));
    }

    @Test
    public void DurationFormatUtils1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1562");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, (long) (byte) 0, "P0Y000DT00000.0420");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0420" + "'", str3.equals("P0Y000DT00000.0420"));
    }

    @Test
    public void DurationFormatUtils1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1563");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 0, (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.032S" + "'", str2.equals("P0Y0M0DT0H0M0.032S"));
    }

    @Test
    public void DurationFormatUtils1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1564");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.06587", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.06587" + "'", str3.equals("P0Y000DT00000.06587"));
    }

    @Test
    public void DurationFormatUtils1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1565");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (byte) 100, "P-1Y11M30DT23H59M59.910S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.910101" + "'", str3.equals("P-1Y11030DT23059059.910101"));
    }

    @Test
    public void DurationFormatUtils1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1566");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), (long) 'a', "P0000Y000DT00000.0011", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1567");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) 0, "P0Y000DT00000.00097");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00097" + "'", str3.equals("P0Y000DT00000.00097"));
    }

    @Test
    public void DurationFormatUtils1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1568");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), (long) 'a', "P-1Y11030DT23059059.9000", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1569");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "0 86399econ3086399", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 86399econ3086399" + "'", str3.equals("0 86399econ3086399"));
    }

    @Test
    public void DurationFormatUtils1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1570");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (byte) 1, "P-1Y11M30DT23H59M59.999S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1571");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y0-10DT07430-10.0513599999");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0-10DT07430-10.0513599999" + "'", str2.equals("P0Y0-10DT07430-10.0513599999"));
    }

    @Test
    public void DurationFormatUtils1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1572");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 0L, "P-1Y11-130DT2374359-159.9893599913");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9893599913" + "'", str3.equals("P-1Y11-130DT2374359-159.9893599913"));
    }

    @Test
    public void DurationFormatUtils1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1573");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', 100L, "P0000Y0-10DT07430-10.0103599965", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1574");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 10, (long) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.090S" + "'", str2.equals("P0Y0M0DT0H0M0.090S"));
    }

    @Test
    public void DurationFormatUtils1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1575");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P0Y000DT00000.052100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.052100" + "'", str2.equals("P0Y000DT00000.052100"));
    }

    @Test
    public void DurationFormatUtils1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1576");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, 0L, "P0Y000DT00000.00310");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00310" + "'", str3.equals("P0Y000DT00000.00310"));
    }

    @Test
    public void DurationFormatUtils1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1577");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) 10, "P-1Y11030DT23059059.998-1", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1578");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, (long) '#', "P-1Y11030DT23059059.90352", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1579");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) '#', (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.997S" + "'", str2.equals("P-1Y11M30DT23H59M59.997S"));
    }

    @Test
    public void DurationFormatUtils1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1580");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (byte) 10, "P-1Y11030DT23059059.9971");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9971" + "'", str3.equals("P-1Y11030DT23059059.9971"));
    }

    @Test
    public void DurationFormatUtils1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1581");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P0Y000DT00000.00311", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00311" + "'", str3.equals("P0Y000DT00000.00311"));
    }

    @Test
    public void DurationFormatUtils1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1582");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y0M0DT0H0M0.065S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0650" + "'", str2.equals("P0Y000DT00000.0650"));
    }

    @Test
    public void DurationFormatUtils1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1583");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.022-1", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.022-1" + "'", str3.equals("P0Y000DT00000.022-1"));
    }

    @Test
    public void DurationFormatUtils1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1584");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) 1, "P0Y000DT00000.00152");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00152" + "'", str3.equals("P0Y000DT00000.00152"));
    }

    @Test
    public void DurationFormatUtils1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1585");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 10, (long) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.087S" + "'", str2.equals("P0Y0M0DT0H0M0.087S"));
    }

    @Test
    public void DurationFormatUtils1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1586");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P0Y000DT00000.09052", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.09052" + "'", str3.equals("P0Y000DT00000.09052"));
    }

    @Test
    public void DurationFormatUtils1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1587");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.0031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0031" + "'", str2.equals("P0Y000DT00000.0031"));
    }

    @Test
    public void DurationFormatUtils1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1588");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P0000Y000DT00000.00110", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.00110" + "'", str3.equals("P0000Y000DT00000.00110"));
    }

    @Test
    public void DurationFormatUtils1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1589");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(100L, (long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.910S" + "'", str2.equals("P-1Y11M30DT23H59M59.910S"));
    }

    @Test
    public void DurationFormatUtils1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1590");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) '#', "P-1Y11030DT23059059.9580", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1591");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(1L, (long) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.099S" + "'", str2.equals("P0Y0M0DT0H0M0.099S"));
    }

    @Test
    public void DurationFormatUtils1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1592");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y0-10DT07430-10.1003599990", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.1003599990" + "'", str3.equals("P0Y0-10DT07430-10.1003599990"));
    }

    @Test
    public void DurationFormatUtils1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1593");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, 10L, "P-1Y11030DT23059059.99810");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.99810" + "'", str3.equals("P-1Y11030DT23059059.99810"));
    }

    @Test
    public void DurationFormatUtils1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1594");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.065100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.065100" + "'", str2.equals("P0Y000DT00000.065100"));
    }

    @Test
    public void DurationFormatUtils1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1595");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P00-1Y11030DT23059059.90417");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P00-1Y11030DT23059059.90417" + "'", str2.equals("P00-1Y11030DT23059059.90417"));
    }

    @Test
    public void DurationFormatUtils1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1596");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P-1Y11030DT23059059.952100", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.952100" + "'", str3.equals("P-1Y11030DT23059059.952100"));
    }

    @Test
    public void DurationFormatUtils1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1597");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P0Y0M0DT0H0M0.065S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.06510" + "'", str2.equals("P0Y000DT00000.06510"));
    }

    @Test
    public void DurationFormatUtils1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1598");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, 100L, "", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1599");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) '#', "P-1Y11030DT23059059.99952");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.99952" + "'", str3.equals("P-1Y11030DT23059059.99952"));
    }

    @Test
    public void DurationFormatUtils1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1600");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, 1L, "P0Y000DT00000.0321", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1601");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 10, 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.990S" + "'", str2.equals("P-1Y11M30DT23H59M59.990S"));
    }

    @Test
    public void DurationFormatUtils1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1602");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.1010", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.1010" + "'", str3.equals("P0Y000DT00000.1010"));
    }

    @Test
    public void DurationFormatUtils1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1603");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.06587", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.06587" + "'", str3.equals("P0Y000DT00000.06587"));
    }

    @Test
    public void DurationFormatUtils1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1604");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, (long) (short) 1, "P0Y0M0DT0H0M0.003S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1605");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P-1Y11030DT23059059.9581", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9581" + "'", str3.equals("P-1Y11030DT23059059.9581"));
    }

    @Test
    public void DurationFormatUtils1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1606");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 100, 0L, "P-1Y11030DT23059059.9750");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9750" + "'", str3.equals("P-1Y11030DT23059059.9750"));
    }

    @Test
    public void DurationFormatUtils1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1607");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P0000Y0M0DT0H0M0.010S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.0101" + "'", str2.equals("P0000Y000DT00000.0101"));
    }

    @Test
    public void DurationFormatUtils1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1608");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', 0L, "P0Y000DT00000.031-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.031-1" + "'", str3.equals("P0Y000DT00000.031-1"));
    }

    @Test
    public void DurationFormatUtils1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1609");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 0, (long) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.035S" + "'", str2.equals("P0Y0M0DT0H0M0.035S"));
    }

    @Test
    public void DurationFormatUtils1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1610");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "P00-1Y11030DT23059059.99999", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.99999" + "'", str3.equals("P00-1Y11030DT23059059.99999"));
    }

    @Test
    public void DurationFormatUtils1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1611");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.00152", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00152" + "'", str3.equals("P0Y000DT00000.00152"));
    }

    @Test
    public void DurationFormatUtils1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1612");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "P-1Y11030DT23059059.9321");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9321" + "'", str2.equals("P-1Y11030DT23059059.9321"));
    }

    @Test
    public void DurationFormatUtils1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1613");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y000DT00000.10010", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.10010" + "'", str3.equals("P0Y000DT00000.10010"));
    }

    @Test
    public void DurationFormatUtils1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1614");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, (long) 'a', "0 0a000 0 hour 0 0inute00 0 econ00");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 0a000 0 hour 0 0inute00 0 econ00" + "'", str3.equals("0 0a000 0 hour 0 0inute00 0 econ00"));
    }

    @Test
    public void DurationFormatUtils1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1615");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.0020");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0020" + "'", str2.equals("P0Y000DT00000.0020"));
    }

    @Test
    public void DurationFormatUtils1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1616");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "0 0a00 0 hour 0 0inute0 0 econ00");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0 0a00 0 hour 0 0inute0 0 econ00" + "'", str2.equals("0 0a00 0 hour 0 0inute0 0 econ00"));
    }

    @Test
    public void DurationFormatUtils1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1617");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) 0, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1618");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) '#', "P00-1Y11030DT23059059.99910");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.99910" + "'", str3.equals("P00-1Y11030DT23059059.99910"));
    }

    @Test
    public void DurationFormatUtils1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1619");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (byte) 100, "P-1Y11M30DT23H59M59.967S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.967101" + "'", str3.equals("P-1Y11030DT23059059.967101"));
    }

    @Test
    public void DurationFormatUtils1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1620");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 100, false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1621");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.0900", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0900" + "'", str3.equals("P0Y000DT00000.0900"));
    }

    @Test
    public void DurationFormatUtils1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1622");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) '4', "", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1623");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 1, (long) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.099S" + "'", str2.equals("P0Y0M0DT0H0M0.099S"));
    }

    @Test
    public void DurationFormatUtils1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1624");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) (short) 1, "P0Y000DT00000.0329");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0329" + "'", str3.equals("P0Y000DT00000.0329"));
    }

    @Test
    public void DurationFormatUtils1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1625");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y000DT00000.00210", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00210" + "'", str3.equals("P0Y000DT00000.00210"));
    }

    @Test
    public void DurationFormatUtils1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1626");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void DurationFormatUtils1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1627");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P-1Y11M30DT23H59M59.965S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9650" + "'", str2.equals("P-1Y11030DT23059059.9650"));
    }

    @Test
    public void DurationFormatUtils1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1628");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y0M0DT0H0M0.099S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0990" + "'", str3.equals("P0Y000DT00000.0990"));
    }

    @Test
    public void DurationFormatUtils1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1629");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, (long) '#', "P00-1Y11030DT23059059.999100", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1630");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 'a', (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.935S" + "'", str2.equals("P-1Y11M30DT23H59M59.935S"));
    }

    @Test
    public void DurationFormatUtils1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1631");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) 1, "P0Y000DT00000.03211", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1632");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, 10L, "P0000Y000DT00000.051-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.051-1" + "'", str3.equals("P0000Y000DT00000.051-1"));
    }

    @Test
    public void DurationFormatUtils1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1633");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) '#', "", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1634");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "P0Y000DT00000.01035", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.01035" + "'", str3.equals("P0Y000DT00000.01035"));
    }

    @Test
    public void DurationFormatUtils1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1635");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (short) 1, "P0Y000DT00000.1000");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.1000" + "'", str3.equals("P0Y000DT00000.1000"));
    }

    @Test
    public void DurationFormatUtils1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1636");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, 0L, "P0000Y000DT00000.0510", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1637");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) 10, "P00-1Y11030DT23059059.90417");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.90417" + "'", str3.equals("P00-1Y11030DT23059059.90417"));
    }

    @Test
    public void DurationFormatUtils1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1638");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) (byte) -1, "P0Y000DT00000.99-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.99-1" + "'", str3.equals("P0Y000DT00000.99-1"));
    }

    @Test
    public void DurationFormatUtils1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1639");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P-1Y11030DT23059059.9320", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9320" + "'", str3.equals("P-1Y11030DT23059059.9320"));
    }

    @Test
    public void DurationFormatUtils1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1640");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y0-10DT07430-10.0003599990", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0003599990" + "'", str3.equals("P0Y0-10DT07430-10.0003599990"));
    }

    @Test
    public void DurationFormatUtils1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1641");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y0M0DT0H0M0.087S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.087-1" + "'", str3.equals("P0Y000DT00000.087-1"));
    }

    @Test
    public void DurationFormatUtils1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1642");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 100, (long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1643");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, 1L, "P0Y000DT00000.05332", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1644");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "P-1Y11-130DT2374359-159.9893599913", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9893599913" + "'", str3.equals("P-1Y11-130DT2374359-159.9893599913"));
    }

    @Test
    public void DurationFormatUtils1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1645");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P0Y0M0DT0H0M0.100S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.10052" + "'", str3.equals("P0Y000DT00000.10052"));
    }

    @Test
    public void DurationFormatUtils1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1646");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P-1Y11030DT23059059.9890", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9890" + "'", str3.equals("P-1Y11030DT23059059.9890"));
    }

    @Test
    public void DurationFormatUtils1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1647");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) ' ', "P0Y000DT00000.032-1", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1648");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(1L, (long) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.999S" + "'", str2.equals("P-1Y11M30DT23H59M59.999S"));
    }

    @Test
    public void DurationFormatUtils1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1649");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) (-1), "P0Y000DT00000.0030", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1650");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P0Y000DT00000.03352", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03352" + "'", str3.equals("P0Y000DT00000.03352"));
    }

    @Test
    public void DurationFormatUtils1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1651");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P-1Y11M30DT23H59M59.983S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.98397" + "'", str3.equals("P-1Y11030DT23059059.98397"));
    }

    @Test
    public void DurationFormatUtils1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1652");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P0Y000DT00000.0900", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0900" + "'", str3.equals("P0Y000DT00000.0900"));
    }

    @Test
    public void DurationFormatUtils1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1653");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 1, (long) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.099S" + "'", str2.equals("P0Y0M0DT0H0M0.099S"));
    }

    @Test
    public void DurationFormatUtils1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1654");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (byte) 10, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1655");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) (short) 1, "P0Y000DT00000.00311", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1656");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P-1Y11M30DT23H59M59.968S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.968100" + "'", str3.equals("P-1Y11030DT23059059.968100"));
    }

    @Test
    public void DurationFormatUtils1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1657");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.05332", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.05332" + "'", str3.equals("P0Y000DT00000.05332"));
    }

    @Test
    public void DurationFormatUtils1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1658");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(0L, (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.032S" + "'", str2.equals("P0Y0M0DT0H0M0.032S"));
    }

    @Test
    public void DurationFormatUtils1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1659");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) 10, "P-1Y11030DT23059059.99010", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1660");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.03196", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03196" + "'", str3.equals("P0Y000DT00000.03196"));
    }

    @Test
    public void DurationFormatUtils1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1661");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P0Y000DT00000.09052");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.09052" + "'", str2.equals("P0Y000DT00000.09052"));
    }

    @Test
    public void DurationFormatUtils1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1662");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P-1Y11030DT23059059.9031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9031" + "'", str2.equals("P-1Y11030DT23059059.9031"));
    }

    @Test
    public void DurationFormatUtils1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1663");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.087100", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.087100" + "'", str3.equals("P0Y000DT00000.087100"));
    }

    @Test
    public void DurationFormatUtils1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1664");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P0000Y000DT00000.9910");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.9910" + "'", str2.equals("P0000Y000DT00000.9910"));
    }

    @Test
    public void DurationFormatUtils1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1665");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P-1Y11030DT23059059.9580", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9580" + "'", str3.equals("P-1Y11030DT23059059.9580"));
    }

    @Test
    public void DurationFormatUtils1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1666");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P-1Y11M30DT23H59M59.983S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.983100" + "'", str2.equals("P-1Y11030DT23059059.983100"));
    }

    @Test
    public void DurationFormatUtils1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1667");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "P-1Y11030DT23059059.958100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.958100" + "'", str2.equals("P-1Y11030DT23059059.958100"));
    }

    @Test
    public void DurationFormatUtils1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1668");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) (short) 10, "P-1Y11-130DT2374359-159.9323599899");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9323599899" + "'", str3.equals("P-1Y11-130DT2374359-159.9323599899"));
    }

    @Test
    public void DurationFormatUtils1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1669");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (short) 1, false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1670");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P-1Y11M30DT23H59M59.899S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.8990" + "'", str2.equals("P-1Y11030DT23059059.8990"));
    }

    @Test
    public void DurationFormatUtils1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1671");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) 1, "P0Y000DT00000.01052", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1672");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.052-1", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.052-1" + "'", str3.equals("P0Y000DT00000.052-1"));
    }

    @Test
    public void DurationFormatUtils1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1673");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) (byte) -1, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1674");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P0Y000DT00000.06510", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.06510" + "'", str3.equals("P0Y000DT00000.06510"));
    }

    @Test
    public void DurationFormatUtils1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1675");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (short) -1, "P0Y000DT00000.00311");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00311" + "'", str3.equals("P0Y000DT00000.00311"));
    }

    @Test
    public void DurationFormatUtils1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1676");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(100L, 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.901S" + "'", str2.equals("P-1Y11M30DT23H59M59.901S"));
    }

    @Test
    public void DurationFormatUtils1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1677");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) (short) 10, "P0Y000DT00000.031-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.031-1" + "'", str3.equals("P0Y000DT00000.031-1"));
    }

    @Test
    public void DurationFormatUtils1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1678");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P0Y000DT00000.00153", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00153" + "'", str3.equals("P0Y000DT00000.00153"));
    }

    @Test
    public void DurationFormatUtils1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1679");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.03335", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03335" + "'", str3.equals("P0Y000DT00000.03335"));
    }

    @Test
    public void DurationFormatUtils1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1680");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, 10L, "P-1Y11030DT23059059.91090");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.91090" + "'", str3.equals("P-1Y11030DT23059059.91090"));
    }

    @Test
    public void DurationFormatUtils1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1681");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.0350", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0350" + "'", str3.equals("P0Y000DT00000.0350"));
    }

    @Test
    public void DurationFormatUtils1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1682");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) (-1), "P0Y000DT00000.0020", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1683");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, 1L, "0 30a086399", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1684");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) '4', (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.980S" + "'", str2.equals("P-1Y11M30DT23H59M59.980S"));
    }

    @Test
    public void DurationFormatUtils1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1685");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 100, (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.932S" + "'", str2.equals("P-1Y11M30DT23H59M59.932S"));
    }

    @Test
    public void DurationFormatUtils1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1686");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (-1L), "P0Y000DT00000.00111");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00111" + "'", str3.equals("P0Y000DT00000.00111"));
    }

    @Test
    public void DurationFormatUtils1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1687");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P-1Y11030DT23059059.9900");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9900" + "'", str2.equals("P-1Y11030DT23059059.9900"));
    }

    @Test
    public void DurationFormatUtils1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1688");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P0000Y0-10DT07430-10.0103599913", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y0-10DT07430-10.0103599913" + "'", str3.equals("P0000Y0-10DT07430-10.0103599913"));
    }

    @Test
    public void DurationFormatUtils1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1689");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, 0L, "P-1Y11030DT23059059.9131");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9131" + "'", str3.equals("P-1Y11030DT23059059.9131"));
    }

    @Test
    public void DurationFormatUtils1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1690");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P0Y000DT00000.002100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.002100" + "'", str2.equals("P0Y000DT00000.002100"));
    }

    @Test
    public void DurationFormatUtils1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1691");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P00-1Y11-130DT2374359-159.9043599990", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11-130DT2374359-159.9043599990" + "'", str3.equals("P00-1Y11-130DT2374359-159.9043599990"));
    }

    @Test
    public void DurationFormatUtils1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1692");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P0Y0M0DT0H0M0.001S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.001-1" + "'", str3.equals("P0Y000DT00000.001-1"));
    }

    @Test
    public void DurationFormatUtils1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1693");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, 1L, "P0000Y000DT00000.9910");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.9910" + "'", str3.equals("P0000Y000DT00000.9910"));
    }

    @Test
    public void DurationFormatUtils1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1694");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) ' ', "P-1Y11030DT23059059.978100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.978100" + "'", str3.equals("P-1Y11030DT23059059.978100"));
    }

    @Test
    public void DurationFormatUtils1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1695");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) (short) 10, "P0Y000DT00000.01052", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1696");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, (long) (byte) 0, "P-1Y11M30DT23H59M59.997S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9973599900" + "'", str3.equals("P-1Y11-130DT2374359-159.9973599900"));
    }

    @Test
    public void DurationFormatUtils1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1697");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P-1Y11030DT23059059.9321", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9321" + "'", str3.equals("P-1Y11030DT23059059.9321"));
    }

    @Test
    public void DurationFormatUtils1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1698");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P-1Y11030DT23059059.9890");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9890" + "'", str2.equals("P-1Y11030DT23059059.9890"));
    }

    @Test
    public void DurationFormatUtils1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1699");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (short) -1, "0 days 0 hours 0 minutes 0 seconds");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 0a000 0 hour 0 0inute00 0 econ00" + "'", str3.equals("0 0a000 0 hour 0 0inute00 0 econ00"));
    }

    @Test
    public void DurationFormatUtils1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1700");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), (long) (short) -1, "P0Y0M0DT0H0M0.099S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1701");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, 0L, "P-1Y11030DT23059059.93252");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.93252" + "'", str3.equals("P-1Y11030DT23059059.93252"));
    }

    @Test
    public void DurationFormatUtils1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1702");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.01035", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.01035" + "'", str3.equals("P0Y000DT00000.01035"));
    }

    @Test
    public void DurationFormatUtils1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1703");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), (long) (byte) 0, "P0Y000DT00000.042-1", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1704");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) 1, "0:00:00.097");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.097" + "'", str3.equals("0:00:00.097"));
    }

    @Test
    public void DurationFormatUtils1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1705");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) 1, "P-1Y11030DT23059059.9031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9031" + "'", str3.equals("P-1Y11030DT23059059.9031"));
    }

    @Test
    public void DurationFormatUtils1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1706");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, 0L, "P0Y000DT00000.06535", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1707");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 10, true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1708");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P-1Y11030DT23059059.9661", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9661" + "'", str3.equals("P-1Y11030DT23059059.9661"));
    }

    @Test
    public void DurationFormatUtils1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1709");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (short) 0, "P0Y000DT00000.03133");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03133" + "'", str3.equals("P0Y000DT00000.03133"));
    }

    @Test
    public void DurationFormatUtils1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1710");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P00-1Y11030DT23059059.90417", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.90417" + "'", str3.equals("P00-1Y11030DT23059059.90417"));
    }

    @Test
    public void DurationFormatUtils1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1711");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P00-1Y11030DT23059059.9991");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P00-1Y11030DT23059059.9991" + "'", str2.equals("P00-1Y11030DT23059059.9991"));
    }

    @Test
    public void DurationFormatUtils1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1712");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, (long) (byte) -1, "P-1Y11030DT23059059.9971");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9971" + "'", str3.equals("P-1Y11030DT23059059.9971"));
    }

    @Test
    public void DurationFormatUtils1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1713");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P-1Y11030DT23059059.9830", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9830" + "'", str3.equals("P-1Y11030DT23059059.9830"));
    }

    @Test
    public void DurationFormatUtils1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1714");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, 0L, "P-1Y11030DT23059059.9000");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9000" + "'", str3.equals("P-1Y11030DT23059059.9000"));
    }

    @Test
    public void DurationFormatUtils1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1715");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) 'a', "P00-1Y11030DT23059059.999100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.999100" + "'", str3.equals("P00-1Y11030DT23059059.999100"));
    }

    @Test
    public void DurationFormatUtils1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1716");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', (long) (byte) -1, "0:00:00.100", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1717");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y000DT00000.00097", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00097" + "'", str3.equals("P0Y000DT00000.00097"));
    }

    @Test
    public void DurationFormatUtils1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1718");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.05110", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.05110" + "'", str3.equals("P0Y000DT00000.05110"));
    }

    @Test
    public void DurationFormatUtils1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1719");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(0L, 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.010S" + "'", str2.equals("P0Y0M0DT0H0M0.010S"));
    }

    @Test
    public void DurationFormatUtils1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1720");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) (short) 100, "P0Y000DT00000.10135", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1721");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.097100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.097100" + "'", str2.equals("P0Y000DT00000.097100"));
    }

    @Test
    public void DurationFormatUtils1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1722");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.0011", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0011" + "'", str3.equals("P0Y000DT00000.0011"));
    }

    @Test
    public void DurationFormatUtils1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1723");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P-1Y11M30DT23H59M59.901S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9011" + "'", str3.equals("P-1Y11030DT23059059.9011"));
    }

    @Test
    public void DurationFormatUtils1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1724");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 10, (long) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.989S" + "'", str2.equals("P-1Y11M30DT23H59M59.989S"));
    }

    @Test
    public void DurationFormatUtils1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1725");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (byte) 0, "P-1Y11M30DT23H59M59.902S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9021" + "'", str3.equals("P-1Y11030DT23059059.9021"));
    }

    @Test
    public void DurationFormatUtils1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1726");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) ' ', 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.969S" + "'", str2.equals("P-1Y11M30DT23H59M59.969S"));
    }

    @Test
    public void DurationFormatUtils1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1727");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, 10L, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1728");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', (-1L), "P0Y000DT00000.00153");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00153" + "'", str3.equals("P0Y000DT00000.00153"));
    }

    @Test
    public void DurationFormatUtils1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1729");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) 'a', "P0Y0M0DT0H0M0.053S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1730");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P-1Y11-130DT2374359-159.9103599998");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11-130DT2374359-159.9103599998" + "'", str2.equals("P-1Y11-130DT2374359-159.9103599998"));
    }

    @Test
    public void DurationFormatUtils1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1731");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) (byte) 0, "P00-1Y11030DT23059059.999-1", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1732");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P0Y0M0DT0H0M0.033S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.033100" + "'", str3.equals("P0Y000DT00000.033100"));
    }

    @Test
    public void DurationFormatUtils1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1733");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) 'a', "P0Y0M0DT0H0M0.000S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00097" + "'", str3.equals("P0Y000DT00000.00097"));
    }

    @Test
    public void DurationFormatUtils1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1734");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 0L, "P0Y000DT00000.03211");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03211" + "'", str3.equals("P0Y000DT00000.03211"));
    }

    @Test
    public void DurationFormatUtils1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1735");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) 10, "P0Y0-10DT07430-10.0033599991");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0033599991" + "'", str3.equals("P0Y0-10DT07430-10.0033599991"));
    }

    @Test
    public void DurationFormatUtils1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1736");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P0Y000DT00000.0900");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0900" + "'", str2.equals("P0Y000DT00000.0900"));
    }

    @Test
    public void DurationFormatUtils1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1737");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (short) 0, "P0Y0M0DT0H0M0.034S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1738");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.022-1", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.022-1" + "'", str3.equals("P0Y000DT00000.022-1"));
    }

    @Test
    public void DurationFormatUtils1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1739");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.00311", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00311" + "'", str3.equals("P0Y000DT00000.00311"));
    }

    @Test
    public void DurationFormatUtils1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1740");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) (short) -1, "P-1Y11030DT23059059.910101", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1741");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) 0, "P0Y000DT00000.0039", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1742");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, 0L, "0 0a00");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 0a00" + "'", str3.equals("0 0a00"));
    }

    @Test
    public void DurationFormatUtils1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1743");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y000DT00000.00099");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.00099" + "'", str2.equals("P0Y000DT00000.00099"));
    }

    @Test
    public void DurationFormatUtils1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1744");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P0Y000DT00000.031-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.031-1" + "'", str2.equals("P0Y000DT00000.031-1"));
    }

    @Test
    public void DurationFormatUtils1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1745");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) (short) 10, "P0Y000DT00000.05110", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1746");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (short) 1, "P0Y000DT00000.096100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.096100" + "'", str3.equals("P0Y000DT00000.096100"));
    }

    @Test
    public void DurationFormatUtils1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1747");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P0Y0M0DT0H0M0.053S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0531" + "'", str2.equals("P0Y000DT00000.0531"));
    }

    @Test
    public void DurationFormatUtils1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1748");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) -1, (long) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", str2.equals("P0Y0M0DT0H0M0.002S"));
    }

    @Test
    public void DurationFormatUtils1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1749");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (short) 1, "P0Y0M0DT0H0M0.99S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.992" + "'", str3.equals("P0Y000DT00000.992"));
    }

    @Test
    public void DurationFormatUtils1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1750");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) '4', "P0Y0M0DT0H0M0.053S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1751");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), (long) (byte) -1, "P0000Y000DT00000.0100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.0100" + "'", str3.equals("P0000Y000DT00000.0100"));
    }

    @Test
    public void DurationFormatUtils1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1752");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) (short) 100, "P0Y000DT00000.033-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.033-1" + "'", str3.equals("P0Y000DT00000.033-1"));
    }

    @Test
    public void DurationFormatUtils1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1753");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P0Y0-10DT07430-10.0013599947", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0013599947" + "'", str3.equals("P0Y0-10DT07430-10.0013599947"));
    }

    @Test
    public void DurationFormatUtils1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1754");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 0L, "P0Y000DT00000.001-1", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1755");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y0M0DT0H0M0.096S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.09697" + "'", str2.equals("P0Y000DT00000.09697"));
    }

    @Test
    public void DurationFormatUtils1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1756");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P0Y000DT00000.09690", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.09690" + "'", str3.equals("P0Y000DT00000.09690"));
    }

    @Test
    public void DurationFormatUtils1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1757");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (short) 100, "P0Y0-10DT07430-10.0333599899");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0333599899" + "'", str3.equals("P0Y0-10DT07430-10.0333599899"));
    }

    @Test
    public void DurationFormatUtils1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1758");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y000DT00000.0990");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0990" + "'", str2.equals("P0Y000DT00000.0990"));
    }

    @Test
    public void DurationFormatUtils1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1759");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(100L, (long) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.935S" + "'", str2.equals("P-1Y11M30DT23H59M59.935S"));
    }

    @Test
    public void DurationFormatUtils1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1760");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P0Y0M0DT0H0M0.051S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.05152" + "'", str3.equals("P0Y000DT00000.05152"));
    }

    @Test
    public void DurationFormatUtils1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1761");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P-1Y11M30DT23H59M59.998S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9980" + "'", str3.equals("P-1Y11030DT23059059.9980"));
    }

    @Test
    public void DurationFormatUtils1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1762");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P-1Y11030DT23059059.96852", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.96852" + "'", str3.equals("P-1Y11030DT23059059.96852"));
    }

    @Test
    public void DurationFormatUtils1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1763");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, (-1L), "", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1764");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, 0L, "P-1Y11M30DT23H59M59.967S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1765");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (short) -1, "P0Y0M0DT0H0M0.99S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1766");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, (long) (short) 10, "P-1Y11030DT23059059.9131");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9131" + "'", str3.equals("P-1Y11030DT23059059.9131"));
    }

    @Test
    public void DurationFormatUtils1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1767");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, 0L, "P0Y000DT00000.00111");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00111" + "'", str3.equals("P0Y000DT00000.00111"));
    }

    @Test
    public void DurationFormatUtils1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1768");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P0Y000DT00000.03335");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.03335" + "'", str2.equals("P0Y000DT00000.03335"));
    }

    @Test
    public void DurationFormatUtils1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1769");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P-1Y11M30DT23H59M59.902S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9020" + "'", str3.equals("P-1Y11030DT23059059.9020"));
    }

    @Test
    public void DurationFormatUtils1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1770");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, (long) (short) -1, "P0Y000DT00000.9910");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.9910" + "'", str3.equals("P0Y000DT00000.9910"));
    }

    @Test
    public void DurationFormatUtils1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1771");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P-1Y11030DT23059059.90010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.90010" + "'", str2.equals("P-1Y11030DT23059059.90010"));
    }

    @Test
    public void DurationFormatUtils1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1772");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P-1Y11030DT23059059.9001");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9001" + "'", str2.equals("P-1Y11030DT23059059.9001"));
    }

    @Test
    public void DurationFormatUtils1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1773");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.0659");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0659" + "'", str2.equals("P0Y000DT00000.0659"));
    }

    @Test
    public void DurationFormatUtils1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1774");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 1L, "P0Y000DT00000.0531", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1775");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y0M0DT0H0M0.009S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.00910" + "'", str2.equals("P0Y000DT00000.00910"));
    }

    @Test
    public void DurationFormatUtils1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1776");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) -1, (long) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", str2.equals("P0Y0M0DT0H0M0.002S"));
    }

    @Test
    public void DurationFormatUtils1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1777");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.00153");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.00153" + "'", str2.equals("P0Y000DT00000.00153"));
    }

    @Test
    public void DurationFormatUtils1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1778");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P-1Y11030DT23059059.90132", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.90132" + "'", str3.equals("P-1Y11030DT23059059.90132"));
    }

    @Test
    public void DurationFormatUtils1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1779");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P-1Y11030DT23059059.901100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.901100" + "'", str2.equals("P-1Y11030DT23059059.901100"));
    }

    @Test
    public void DurationFormatUtils1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1780");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) '#', 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.965S" + "'", str2.equals("P-1Y11M30DT23H59M59.965S"));
    }

    @Test
    public void DurationFormatUtils1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1781");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "P-1Y11030DT23059059.9890", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9890" + "'", str3.equals("P-1Y11030DT23059059.9890"));
    }

    @Test
    public void DurationFormatUtils1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1782");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (byte) 0, false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1783");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P0Y000DT00000.033100", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.033100" + "'", str3.equals("P0Y000DT00000.033100"));
    }

    @Test
    public void DurationFormatUtils1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1784");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.09632");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.09632" + "'", str2.equals("P0Y000DT00000.09632"));
    }

    @Test
    public void DurationFormatUtils1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1785");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, (long) (short) 0, "P0Y000DT00000.06510", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1786");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.0090", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0090" + "'", str3.equals("P0Y000DT00000.0090"));
    }

    @Test
    public void DurationFormatUtils1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1787");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "0 30a086399", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 30a086399" + "'", str3.equals("0 30a086399"));
    }

    @Test
    public void DurationFormatUtils1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1788");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (byte) 100, "P0000Y000DT00000.010-1", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1789");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.087-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.087-1" + "'", str2.equals("P0Y000DT00000.087-1"));
    }

    @Test
    public void DurationFormatUtils1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1790");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0000Y000DT00000.9910", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.9910" + "'", str3.equals("P0000Y000DT00000.9910"));
    }

    @Test
    public void DurationFormatUtils1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1791");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P-1Y11030DT23059059.9131");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9131" + "'", str2.equals("P-1Y11030DT23059059.9131"));
    }

    @Test
    public void DurationFormatUtils1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1792");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) (byte) 100, "P-1Y11030DT23059059.989100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.989100" + "'", str3.equals("P-1Y11030DT23059059.989100"));
    }

    @Test
    public void DurationFormatUtils1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1793");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) '4', "P0Y000DT00000.01035");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.01035" + "'", str3.equals("P0Y000DT00000.01035"));
    }

    @Test
    public void DurationFormatUtils1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1794");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P-1Y11M30DT23H59M59.966S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.966-1" + "'", str2.equals("P-1Y11030DT23059059.966-1"));
    }

    @Test
    public void DurationFormatUtils1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1795");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.09010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.09010" + "'", str2.equals("P0Y000DT00000.09010"));
    }

    @Test
    public void DurationFormatUtils1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1796");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), (long) (byte) -1, "P0Y000DT00000.10135", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1797");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) (byte) 100, "P-1Y11M30DT23H59M59.969S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1798");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) 10, "P0000Y000DT00000.01099", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1799");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(100L, (long) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.997S" + "'", str2.equals("P-1Y11M30DT23H59M59.997S"));
    }

    @Test
    public void DurationFormatUtils1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1800");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), (long) (byte) -1, "P-1Y11030DT23059059.98910");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.98910" + "'", str3.equals("P-1Y11030DT23059059.98910"));
    }

    @Test
    public void DurationFormatUtils1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1801");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P0Y000DT00000.9952", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.9952" + "'", str3.equals("P0Y000DT00000.9952"));
    }

    @Test
    public void DurationFormatUtils1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1802");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P-1Y11030DT23059059.9690", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9690" + "'", str3.equals("P-1Y11030DT23059059.9690"));
    }

    @Test
    public void DurationFormatUtils1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1803");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, (long) (byte) 0, "P-1Y11030DT23059059.9021");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9021" + "'", str3.equals("P-1Y11030DT23059059.9021"));
    }

    @Test
    public void DurationFormatUtils1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1804");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(1L, (long) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.998S" + "'", str2.equals("P-1Y11M30DT23H59M59.998S"));
    }

    @Test
    public void DurationFormatUtils1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1805");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P0Y0-10DT07430-10.0323599990", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0323599990" + "'", str3.equals("P0Y0-10DT07430-10.0323599990"));
    }

    @Test
    public void DurationFormatUtils1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1806");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "P0Y0-10DT07430-10.0323599990", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0323599990" + "'", str3.equals("P0Y0-10DT07430-10.0323599990"));
    }

    @Test
    public void DurationFormatUtils1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1807");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) 'a', "P00-1Y11030DT23059059.9991");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.9991" + "'", str3.equals("P00-1Y11030DT23059059.9991"));
    }

    @Test
    public void DurationFormatUtils1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1808");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) '4', "P0000Y000DT00000.01099");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.01099" + "'", str3.equals("P0000Y000DT00000.01099"));
    }

    @Test
    public void DurationFormatUtils1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1809");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) (short) 10, "P0Y000DT00000.0531");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0531" + "'", str3.equals("P0Y000DT00000.0531"));
    }

    @Test
    public void DurationFormatUtils1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1810");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (byte) 0, "P-1Y11030DT23059059.99097", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1811");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 100, (long) 0, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1812");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P-1Y11M30DT23H59M59.980S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.98010" + "'", str3.equals("P-1Y11030DT23059059.98010"));
    }

    @Test
    public void DurationFormatUtils1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1813");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "P-1Y11030DT23059059.9900");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9900" + "'", str2.equals("P-1Y11030DT23059059.9900"));
    }

    @Test
    public void DurationFormatUtils1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1814");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) (-1), "P0Y000DT00000.03297");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03297" + "'", str3.equals("P0Y000DT00000.03297"));
    }

    @Test
    public void DurationFormatUtils1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1815");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P-1Y11030DT23059059.9991", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9991" + "'", str3.equals("P-1Y11030DT23059059.9991"));
    }

    @Test
    public void DurationFormatUtils1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1816");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) 0, "P-1Y11030DT23059059.989100", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1817");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(0L, (long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.100S" + "'", str2.equals("P0Y0M0DT0H0M0.100S"));
    }

    @Test
    public void DurationFormatUtils1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1818");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 100, "P-1Y11030DT23059059.9901", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1819");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1820");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P0Y000DT00000.03211");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.03211" + "'", str2.equals("P0Y000DT00000.03211"));
    }

    @Test
    public void DurationFormatUtils1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1821");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P-1Y11-130DT2374359-159.9663599900");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11-130DT2374359-159.9663599900" + "'", str2.equals("P-1Y11-130DT2374359-159.9663599900"));
    }

    @Test
    public void DurationFormatUtils1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1822");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.0020");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0020" + "'", str2.equals("P0Y000DT00000.0020"));
    }

    @Test
    public void DurationFormatUtils1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1823");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "P-1Y11030DT23059059.99010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.99010" + "'", str2.equals("P-1Y11030DT23059059.99010"));
    }

    @Test
    public void DurationFormatUtils1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1824");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P-1Y11M30DT23H59M59.980S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.980100" + "'", str3.equals("P-1Y11030DT23059059.980100"));
    }

    @Test
    public void DurationFormatUtils1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1825");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, (long) (short) 1, "P-1Y11030DT23059059.9971");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9971" + "'", str3.equals("P-1Y11030DT23059059.9971"));
    }

    @Test
    public void DurationFormatUtils1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1826");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0000Y000DT00000.01099", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.01099" + "'", str3.equals("P0000Y000DT00000.01099"));
    }

    @Test
    public void DurationFormatUtils1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1827");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "P-1Y11M30DT23H59M59.964S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9641" + "'", str3.equals("P-1Y11030DT23059059.9641"));
    }

    @Test
    public void DurationFormatUtils1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1828");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "P-1Y11030DT23059059.901-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.901-1" + "'", str2.equals("P-1Y11030DT23059059.901-1"));
    }

    @Test
    public void DurationFormatUtils1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1829");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 0L, "P0Y0M0DT0H0M0.020S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1830");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.001-1", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.001-1" + "'", str3.equals("P0Y000DT00000.001-1"));
    }

    @Test
    public void DurationFormatUtils1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1831");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P0Y0M0DT0H0M0.000S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0001" + "'", str3.equals("P0Y000DT00000.0001"));
    }

    @Test
    public void DurationFormatUtils1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1832");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "P-1Y11M30DT23H59M59.968S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9680" + "'", str3.equals("P-1Y11030DT23059059.9680"));
    }

    @Test
    public void DurationFormatUtils1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1833");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P0Y000DT00000.09052");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.09052" + "'", str2.equals("P0Y000DT00000.09052"));
    }

    @Test
    public void DurationFormatUtils1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1834");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "P-1Y11030DT23059059.96610");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.96610" + "'", str2.equals("P-1Y11030DT23059059.96610"));
    }

    @Test
    public void DurationFormatUtils1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1835");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) (byte) -1, "P0000Y0-10DT07430-10.0103599913", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1836");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) 10, "P-1Y11030DT23059059.9690");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9690" + "'", str3.equals("P-1Y11030DT23059059.9690"));
    }

    @Test
    public void DurationFormatUtils1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1837");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 1, "P00-1Y11M30DT23H59M59.999S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1838");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, (long) ' ', "P0Y000DT00000.10110");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.10110" + "'", str3.equals("P0Y000DT00000.10110"));
    }

    @Test
    public void DurationFormatUtils1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1839");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 100, 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1840");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) 0, "0 86399econ3086399");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 86399econ3086399" + "'", str3.equals("0 86399econ3086399"));
    }

    @Test
    public void DurationFormatUtils1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1841");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) -1, (long) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.098S" + "'", str2.equals("P0Y0M0DT0H0M0.098S"));
    }

    @Test
    public void DurationFormatUtils1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1842");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in DurationFormatUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, 0L, "P0Y000DT00000.10135", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils3.DurationFormatUtils1843");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 0L, "P0Y000DT00000.9952");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.9952" + "'", str3.equals("P0Y000DT00000.9952"));
    }
}

