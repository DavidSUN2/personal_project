
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
            System.out.format("%n%s%n", "DurationFormatUtils0.test01");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test02");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test03");
        org.apache.commons.lang3.time.DurationFormatUtils durationFormatUtils0 = new org.apache.commons.lang3.time.DurationFormatUtils();
        java.lang.Class<?> wildcardClass1 = durationFormatUtils0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test04");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (-1), "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test05");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 100, (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.932S" + "'", str2.equals("P-1Y11M30DT23H59M59.932S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test06");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, (long) (short) 0, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test07");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) '4', false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test08");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.100" + "'", str1.equals("0:00:00.100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test09");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.052" + "'", str1.equals("0:00:00.052"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test10");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.010" + "'", str1.equals("0:00:00.010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test11");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.99S" + "'", str1.equals("P0Y0M0DT0H0M0.99S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test12");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, (long) 1, "P-1Y11M30DT23H59M59.932S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test13");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.010S" + "'", str1.equals("P0Y0M0DT0H0M0.010S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test14");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (-1L), "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test15");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS(1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.001" + "'", str1.equals("0:00:00.001"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test16");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, 10L, "P0Y0M0DT0H0M0.99S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.9910" + "'", str3.equals("P0Y000DT00000.9910"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test17");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO(100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.100S" + "'", str1.equals("P0Y0M0DT0H0M0.100S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test18");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.99" + "'", str1.equals("0:00:00.99"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test19");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 10, (long) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.042S" + "'", str2.equals("P0Y0M0DT0H0M0.042S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test20");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.010S" + "'", str1.equals("P0Y0M0DT0H0M0.010S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test21");
        java.lang.String str0 = org.apache.commons.lang3.time.DurationFormatUtils.ISO_EXTENDED_FORMAT_PATTERN;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'" + "'", str0.equals("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test22");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', (long) (byte) 0, "P0Y000DT00000.9910", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test23");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (short) 1, "P0Y0M0DT0H0M0.010S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test24");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 10, (long) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.989S" + "'", str2.equals("P-1Y11M30DT23H59M59.989S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test25");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, 100L, "0:00:00.010", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test26");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.097S" + "'", str1.equals("P0Y0M0DT0H0M0.097S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test27");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, 1L, "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test28");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "P0Y0M0DT0H0M0.042S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.04210" + "'", str2.equals("P0Y000DT00000.04210"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test29");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 100, (long) (byte) 100, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test30");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, (long) 10, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test31");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords(100L, false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test32");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) '#', (long) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.062S" + "'", str2.equals("P0Y0M0DT0H0M0.062S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test33");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 1, (long) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.051S" + "'", str2.equals("P0Y0M0DT0H0M0.051S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test34");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, (long) (byte) 10, "", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test35");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.99" + "'", str1.equals("0:00:00.99"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test36");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.99" + "'", str1.equals("0:00:00.99"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test37");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.000" + "'", str1.equals("0:00:00.000"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test38");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) 100, "", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test39");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) '4', (long) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.983S" + "'", str2.equals("P-1Y11M30DT23H59M59.983S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test40");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (short) 1, "P0Y000DT00000.04210", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test41");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (-1), "P0Y0M0DT0H0M0.097S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0973599989" + "'", str3.equals("P0Y0-10DT07430-10.0973599989"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test42");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) (short) 1, "0:00:00.001", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test43");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "0 days 0 hours 0 minutes 0 seconds");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0 0a000 0 hour 0 0inute00 0 econ00" + "'", str2.equals("0 0a000 0 hour 0 0inute00 0 econ00"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test44");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.100" + "'", str1.equals("0:00:00.100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test45");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str1.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test46");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 0, (long) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.097S" + "'", str2.equals("P0Y0M0DT0H0M0.097S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test47");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P-1Y11M30DT23H59M59.983S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.983100" + "'", str3.equals("P-1Y11030DT23059059.983100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test48");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.032" + "'", str1.equals("0:00:00.032"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test49");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) '#', (long) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test50");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) '#', false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test51");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.052S" + "'", str1.equals("P0Y0M0DT0H0M0.052S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test52");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, (long) 0, "P0Y0M0DT0H0M0.062S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test53");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "0:00:00.032", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.032" + "'", str3.equals("0:00:00.032"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test54");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test55");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', (long) (short) -1, "P0Y0M0DT0H0M0.99S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test56");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.04210");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.04210" + "'", str2.equals("P0Y000DT00000.04210"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test57");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) 0, "P-1Y11M30DT23H59M59.932S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test58");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test59");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 100, (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.932S" + "'", str2.equals("P-1Y11M30DT23H59M59.932S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test60");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) (short) 100, "P-1Y11M30DT23H59M59.989S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test61");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "0:00:00.001", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.001" + "'", str3.equals("0:00:00.001"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test62");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, 0L, "P0Y0M0DT0H0M0.097S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0971" + "'", str3.equals("P0Y000DT00000.0971"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test63");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test64");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y0M0DT0H0M0.000S" + "'", str2.equals("P0000Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test65");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.99" + "'", str1.equals("0:00:00.99"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test66");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, (long) (short) 10, "0 days 0 hours 0 minutes 0 seconds", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test67");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "0 days", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 0a00" + "'", str3.equals("0 0a00"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils0.test68");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(10L, (long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.990S" + "'", str2.equals("P-1Y11M30DT23H59M59.990S"));
    }
}

