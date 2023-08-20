package DateUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DateUtils0 {

    public static boolean debug = false;

    @Test
    public void DateUtils0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0001");
        long long0 = org.apache.commons.lang3.time.DateUtils.MILLIS_PER_SECOND;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 1000L + "'", long0 == 1000L);
    }

    @Test
    public void DateUtils0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0002");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setMonths(date0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0003");
        int int0 = org.apache.commons.lang3.time.DateUtils.RANGE_WEEK_CENTER;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void DateUtils0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0004");
        int int0 = org.apache.commons.lang3.time.DateUtils.RANGE_MONTH_SUNDAY;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void DateUtils0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0005");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round(date0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0006");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            boolean boolean2 = org.apache.commons.lang3.time.DateUtils.isSameInstant(calendar0, calendar1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0007");
        java.util.Date date0 = null;
        java.util.Date date1 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            boolean boolean2 = org.apache.commons.lang3.time.DateUtils.isSameInstant(date0, date1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0008");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.ceiling(calendar0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0009");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addWeeks(date0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0010");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("hi!", locale1, strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void DateUtils0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0011");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(calendar0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0012");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addMonths(date0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0013");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate(date0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0014");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setMonths(date0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0015");
        int int0 = org.apache.commons.lang3.time.DateUtils.RANGE_WEEK_RELATIVE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void DateUtils0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0016");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round(date0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0017");
        int int0 = org.apache.commons.lang3.time.DateUtils.SEMI_MONTH;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1001 + "'", int0 == 1001);
    }

    @Test
    public void DateUtils0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0018");
        int int0 = org.apache.commons.lang3.time.DateUtils.RANGE_WEEK_SUNDAY;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void DateUtils0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0019");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor2 = org.apache.commons.lang3.time.DateUtils.iterator(date0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0020");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(date0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0021");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.round(calendar0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0022");
        long long0 = org.apache.commons.lang3.time.DateUtils.MILLIS_PER_MINUTE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 60000L + "'", long0 == 60000L);
    }

    @Test
    public void DateUtils0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0023");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) (short) 100, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round 100");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0024");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<?> wildcardItor2 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on 4");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0025");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setMonths(date0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0026");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setYears(date0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0027");
        java.util.Date date0 = null;
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray5);
        // The following exception was thrown during execution in DateUtils generation
        try {
            boolean boolean7 = org.apache.commons.lang3.time.DateUtils.isSameDay(date0, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0028");
        long long0 = org.apache.commons.lang3.time.DateUtils.MILLIS_PER_HOUR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 3600000L + "'", long0 == 3600000L);
    }

    @Test
    public void DateUtils0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0029");
        long long0 = org.apache.commons.lang3.time.DateUtils.MILLIS_PER_DAY;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 86400000L + "'", long0 == 86400000L);
    }

    @Test
    public void DateUtils0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0030");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(date7, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 32 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0031");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long7 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date5, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 10 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0032");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) 10L, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 10");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0033");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addSeconds(date7, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:01:40 MST 1970");
    }

    @Test
    public void DateUtils0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0034");
        int int0 = org.apache.commons.lang3.time.DateUtils.RANGE_MONTH_MONDAY;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void DateUtils0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0035");
        int int0 = org.apache.commons.lang3.time.DateUtils.RANGE_WEEK_MONDAY;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void DateUtils0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0036");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setDays(date5, 4);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.truncate(date7, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sun Jan 04 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Sun Jan 04 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0037");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray5);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("hi!", strArray5);
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unable to parse the date: hi!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0038");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void DateUtils0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0039");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) strArray4, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not find ceiling of for type: class [Ljava.lang.String;");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0040");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<?> wildcardItor2 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on 100");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0041");
        org.apache.commons.lang3.time.DateUtils dateUtils0 = new org.apache.commons.lang3.time.DateUtils();
    }

    @Test
    public void DateUtils0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0042");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("hi!", locale1, strArray5);
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unable to parse the date: hi!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0043");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) '#');
        java.lang.Class<?> wildcardClass8 = date7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Fri Dec 01 00:00:00 MST 1972");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void DateUtils0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0044");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) '#');
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date5, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Fri Dec 01 00:00:00 MST 1972");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0045");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setMonths(date7, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0046");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (byte) 1);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<?> wildcardItor9 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) date5, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 0 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Fri Jan 01 00:00:00 MST 1971");
    }

    @Test
    public void DateUtils0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0047");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setDays(date5, 4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: YEAR");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sun Jan 04 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0048");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (short) 1);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(date5, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 10 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Fri Jan 01 00:00:00 MST 1971");
    }

    @Test
    public void DateUtils0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0049");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("hi!", strArray1);
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unable to parse the date: hi!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void DateUtils0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0050");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (byte) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Fri Jan 01 00:00:00 MST 1971");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Sun Feb 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0051");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (byte) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setYears(date5, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Fri Jan 01 00:00:00 MST 1971");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Wed Jan 01 00:00:00 MST 100");
    }

    @Test
    public void DateUtils0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0052");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) '#');
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(date5, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Fri Dec 01 00:00:00 MST 1972");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0053");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (byte) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setHours(date5, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Fri Jan 01 00:00:00 MST 1971");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 01:00:00 MST 1970");
    }

    @Test
    public void DateUtils0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0054");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Iterator<java.util.Calendar> calendarItor9 = org.apache.commons.lang3.time.DateUtils.iterator(calendar7, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendarItor9);
    }

    @Test
    public void DateUtils0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0055");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) 60000L, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 60000");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0056");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(calendar7, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 35 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0057");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(calendar7, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 52 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0058");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addDays(date0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0059");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (byte) 1);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<?> wildcardItor9 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) (byte) 1, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on 1");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Fri Jan 01 00:00:00 MST 1971");
    }

    @Test
    public void DateUtils0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0060");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (byte) 1);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(date5, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 10 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Fri Jan 01 00:00:00 MST 1971");
    }

    @Test
    public void DateUtils0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0061");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(calendar7, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 10 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0062");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (byte) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMinutes(date5, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Fri Jan 01 00:00:00 MST 1971");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Wed Dec 31 23:59:00 MST 1969");
    }

    @Test
    public void DateUtils0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0063");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setMinutes(date0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0064");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Iterator<java.util.Calendar> calendarItor9 = org.apache.commons.lang3.time.DateUtils.iterator(calendar7, 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendarItor9);
    }

    @Test
    public void DateUtils0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0065");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setDays(date5, 4);
        long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date5, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sun Jan 04 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 86400000L + "'", long9 == 86400000L);
    }

    @Test
    public void DateUtils0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0066");
        java.lang.Object obj0 = new java.lang.Object();
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate(obj0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate java.lang.Object@5879c123");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0067");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) 10L, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not find ceiling of for type: class java.lang.Long");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0068");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (byte) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addYears(date5, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Fri Jan 01 00:00:00 MST 1971");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Wed Jan 01 00:00:00 MST 2070");
    }

    @Test
    public void DateUtils0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0069");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("hi!", locale1, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void DateUtils0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0070");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setSeconds(date7, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 MST 1970");
    }

    @Test
    public void DateUtils0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0071");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0072");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.truncate(date4, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 100 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0073");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<?> wildcardItor2 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on 0");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0074");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray4);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setYears(date6, 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Fri Jan 01 00:00:00 MST 6");
    }

    @Test
    public void DateUtils0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0075");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray5);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("hi!", strArray5);
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unable to parse the date: hi!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0076");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) '4');
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addWeeks(date5, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sat Jan 01 00:00:00 MST 52");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0077");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray7);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0078");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date4, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 4 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0079");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor9 = org.apache.commons.lang3.time.DateUtils.iterator(calendar7, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 100 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0080");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) "hi!", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate hi!");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0081");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) '4');
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addDays(date5, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sat Jan 01 00:00:00 MST 52");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Wed Dec 31 00:00:00 MST 1969");
    }

    @Test
    public void DateUtils0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0082");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.truncate(calendar7, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0083");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) '4');
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addYears(date7, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sat Jan 01 00:00:00 MST 52");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Fri Jan 01 00:00:00 MST 51");
    }

    @Test
    public void DateUtils0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0084");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(calendar0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0085");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date3 = org.apache.commons.lang3.time.DateUtils.truncate(obj0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate java.lang.Object@5f2f319f");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void DateUtils0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0086");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(calendar0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0087");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray5);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDate("hi!", strArray5);
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unable to parse the date: hi!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0088");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(calendar7, 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void DateUtils0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0089");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (byte) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addDays(date5, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Fri Jan 01 00:00:00 MST 1971");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Sun Feb 22 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0090");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray5);
        java.lang.Class<?> wildcardClass9 = date8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0091");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(date0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0092");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(calendar7, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 86400L + "'", long9 == 86400L);
    }

    @Test
    public void DateUtils0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0093");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) '4');
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(date5, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment -1 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sat Jan 01 00:00:00 MST 52");
    }

    @Test
    public void DateUtils0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0094");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) '#');
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date5, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Fri Dec 01 00:00:00 MST 1972");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0095");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor6 = org.apache.commons.lang3.time.DateUtils.iterator(date4, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style -1 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0096");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(date4, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 3 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0097");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(calendar7, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 97 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0098");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate(obj0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0099");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", locale1, strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0100");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (short) 1);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setSeconds(date5, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SECOND");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Fri Jan 01 00:00:00 MST 1971");
    }

    @Test
    public void DateUtils0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0101");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor9 = org.apache.commons.lang3.time.DateUtils.iterator(date6, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 0 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0102");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) '#');
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addSeconds(date7, 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Fri Dec 01 00:00:00 MST 1972");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Fri Dec 01 00:00:03 MST 1972");
    }

    @Test
    public void DateUtils0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0103");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setHours(date6, 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 06:00:00 MST 1970");
    }

    @Test
    public void DateUtils0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0104");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(calendar7, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 100 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0105");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) '4');
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addSeconds(date5, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sat Jan 01 00:00:00 MST 52");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:10 MST 1970");
    }

    @Test
    public void DateUtils0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0106");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(calendar7, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 0 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0107");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray2 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date3 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Date and Patterns must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0108");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) '#');
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date5, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Fri Dec 01 00:00:00 MST 1972");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0109");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray4);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addSeconds(date6, 0);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0110");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling(obj0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0111");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        long long6 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date4, 1);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(date4, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 1001 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 86400000L + "'", long6 == 86400000L);
    }

    @Test
    public void DateUtils0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0112");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray4);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addMonths(date6, 10);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.toCalendar(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Sun Nov 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=26290800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=10,WEEK_OF_YEAR=45,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=305,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0113");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setDays(date5, 4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date7, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 0 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sun Jan 04 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0114");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) (-1), 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round -1");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0115");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<?> wildcardItor3 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) wildcardClass1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on class java.lang.Object");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void DateUtils0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0116");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.parseDate("hi!", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Date and Patterns must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0117");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date6, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 86400000L + "'", long9 == 86400000L);
    }

    @Test
    public void DateUtils0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0118");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setMinutes(date0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0119");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        java.util.Iterator<java.util.Calendar> calendarItor9 = org.apache.commons.lang3.time.DateUtils.iterator(calendar7, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendarItor9);
    }

    @Test
    public void DateUtils0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0120");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date3 = org.apache.commons.lang3.time.DateUtils.parseDate("hi!", strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void DateUtils0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0121");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) '4');
        java.lang.Class<?> wildcardClass8 = date5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sat Jan 01 00:00:00 MST 52");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void DateUtils0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0122");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) 0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 0");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0123");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(date0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0124");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) '#');
        long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(date5, 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Fri Dec 01 00:00:00 MST 1972");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void DateUtils0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0125");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("hi!", strArray4);
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unable to parse the date: hi!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0126");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.parseDate("hi!", strArray1);
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unable to parse the date: hi!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void DateUtils0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0127");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 1001);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor8 = org.apache.commons.lang3.time.DateUtils.iterator(date4, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 0 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:16:41 MST 1970");
    }

    @Test
    public void DateUtils0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0128");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.round(date6, 10);
        java.lang.Class<?> wildcardClass9 = date6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0129");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) '4');
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.ceiling(date7, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sat Jan 01 00:00:00 MST 52");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Mon Jan 01 00:00:00 MST 53");
    }

    @Test
    public void DateUtils0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0130");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) '#');
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.truncate(date5, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Fri Dec 01 00:00:00 MST 1972");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Sat Jan 01 00:00:00 MST 1");
    }

    @Test
    public void DateUtils0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0131");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setDays(date5, 4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date5, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 4 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sun Jan 04 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0132");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not find ceiling of for type: class java.lang.Short");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0133");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling(date0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0134");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) '#');
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Fri Dec 01 00:00:00 MST 1972");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Fri May 01 00:00:00 MDT 1970");
    }

    @Test
    public void DateUtils0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0135");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        long long6 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date4, 1);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setMonths(date4, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 86400000L + "'", long6 == 86400000L);
    }

    @Test
    public void DateUtils0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0136");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date6, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 86400000L + "'", long8 == 86400000L);
    }

    @Test
    public void DateUtils0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0137");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (short) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addSeconds(date7, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Fri Jan 01 00:00:00 MST 1971");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Fri Jan 01 00:00:10 MST 1971");
    }

    @Test
    public void DateUtils0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0138");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, (int) (short) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMonths(date7, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sun Feb 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Sun Feb 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0139");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date4, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 32 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0140");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(calendar7, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 52 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0141");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) '#');
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor9 = org.apache.commons.lang3.time.DateUtils.iterator(date7, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 0 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Fri Dec 01 00:00:00 MST 1972");
    }

    @Test
    public void DateUtils0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0142");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) date6, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0143");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(calendar7, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 52 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0144");
        java.util.Locale locale1 = null;
        java.util.Locale locale3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale3, strArray6);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDate("hi!", locale1, strArray6);
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unable to parse the date: hi!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0145");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setYears(date0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0146");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        long long6 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date4, 1);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) long6, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not find ceiling of for type: class java.lang.Long");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 86400000L + "'", long6 == 86400000L);
    }

    @Test
    public void DateUtils0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0147");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<?> wildcardItor2 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) false, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on false");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0148");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, (int) (short) 1);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setHours(date7, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HOUR_OF_DAY");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sun Feb 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0149");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(calendar7, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 4 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0150");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) 86400L, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round 86400");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0151");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.truncate(calendar7, 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0152");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (byte) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setSeconds(date5, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Fri Jan 01 00:00:00 MST 1971");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:10 MST 1970");
    }

    @Test
    public void DateUtils0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0153");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray4);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addMonths(date6, 10);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Sun Nov 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0154");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) '4');
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date5, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sat Jan 01 00:00:00 MST 52");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0155");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(calendar7, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 24L + "'", long9 == 24L);
    }

    @Test
    public void DateUtils0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0156");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) 1000L, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not find ceiling of for type: class java.lang.Long");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0157");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, (int) (short) 1);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor9 = org.apache.commons.lang3.time.DateUtils.iterator(date5, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 100 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sun Feb 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0158");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) "", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate ");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0159");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setMonths(date7, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0160");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.truncate(calendar0, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0161");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) '4');
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<?> wildcardItor9 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) date7, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 10 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sat Jan 01 00:00:00 MST 52");
    }

    @Test
    public void DateUtils0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0162");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor2 = org.apache.commons.lang3.time.DateUtils.iterator(date0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0163");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.round(date7, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0164");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) 100, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 100");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0165");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setSeconds(date0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0166");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.lang.Class<?> wildcardClass6 = date5.getClass();
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) date5, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 01:00:00 MST 1970");
    }

    @Test
    public void DateUtils0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0167");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(calendar7, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment -1 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0168");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Iterator<java.util.Calendar> calendarItor9 = org.apache.commons.lang3.time.DateUtils.iterator(calendar7, 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendarItor9);
    }

    @Test
    public void DateUtils0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0169");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addMinutes(date0, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0170");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 1001);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setHours(date6, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HOUR_OF_DAY");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:16:41 MST 1970");
    }

    @Test
    public void DateUtils0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0171");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setMonths(date4, (int) (short) 0);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0172");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.truncate(calendar7, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 52 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0173");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) '4');
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(date5, 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sat Jan 01 00:00:00 MST 52");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0174");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setYears(date0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0175");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round(date0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0176");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setDays(date7, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0177");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor9 = org.apache.commons.lang3.time.DateUtils.iterator(calendar7, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 1001 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0178");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("hi!", strArray4);
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unable to parse the date: hi!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0179");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (byte) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setMinutes(date5, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Fri Jan 01 00:00:00 MST 1971");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0180");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.round(calendar0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0181");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(calendar0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0182");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setMonths(date4, 3);
        java.lang.Class<?> wildcardClass9 = date4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Wed Apr 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0183");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (byte) 1);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round 1");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Fri Jan 01 00:00:00 MST 1971");
    }

    @Test
    public void DateUtils0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0184");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, (int) (short) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addYears(date7, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sun Feb 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Mon Feb 01 00:00:00 MST 1971");
    }

    @Test
    public void DateUtils0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0185");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.truncate(calendar7, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0186");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.round(calendar0, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0187");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(calendar7, 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void DateUtils0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0188");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.truncate(calendar7, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 100 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0189");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) '4');
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setHours(date7, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HOUR_OF_DAY");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sat Jan 01 00:00:00 MST 52");
    }

    @Test
    public void DateUtils0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0190");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) "", 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not find ceiling of for type: class java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0191");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date6, (int) (short) 100);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.toCalendar(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=25200100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0192");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round 4");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0193");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) "", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not find ceiling of for type: class java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0194");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) '4');
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setYears(date7, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sat Jan 01 00:00:00 MST 52");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Wed Jan 01 00:00:00 MST 100");
    }

    @Test
    public void DateUtils0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0195");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor2 = org.apache.commons.lang3.time.DateUtils.iterator(date0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0196");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.round(calendar7, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field -1 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0197");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("hi!", locale1, strArray5);
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unable to parse the date: hi!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0198");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMinutes(date4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 01:37:00 MST 1970");
    }

    @Test
    public void DateUtils0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0199");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (short) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.round(date5, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Fri Jan 01 00:00:00 MST 1971");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0200");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor2 = org.apache.commons.lang3.time.DateUtils.iterator(calendar0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0201");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round(date0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0202");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(date0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0203");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date0, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0204");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling(date0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0205");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(calendar0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0206");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0207");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long7 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(date5, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 3 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0208");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<?> wildcardItor2 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) "hi!", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on hi!");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0209");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.setDays(date4, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0210");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.ceiling(calendar7, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0211");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<?> wildcardItor9 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) date4, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 10 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0212");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(date4, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 100 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0213");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate(obj0, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0214");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(date0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0215");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setHours(date6, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 10:00:00 MST 1970");
    }

    @Test
    public void DateUtils0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0216");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addHours(date6, (int) (short) 100);
        java.lang.Class<?> wildcardClass9 = date6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Mon Jan 05 04:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0217");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.truncate(calendar0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0218");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(date6, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 0 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0219");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, (int) (short) 1);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.round(date5, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 32 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sun Feb 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0220");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) '4');
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(date5, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 10 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sat Jan 01 00:00:00 MST 52");
    }

    @Test
    public void DateUtils0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0221");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addMonths(date6, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Mon Dec 01 00:00:00 MST 1969");
    }

    @Test
    public void DateUtils0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0222");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(date7, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 1001 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0223");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addWeeks(date7, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 08 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0224");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray7);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0225");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(date4, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1440L + "'", long9 == 1440L);
    }

    @Test
    public void DateUtils0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0226");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(date4, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 0 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0227");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) 1, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 1");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0228");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        long long6 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date4, 1);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addWeeks(date4, (int) (byte) 10);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 86400000L + "'", long6 == 86400000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 12 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0229");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(calendar7, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 100 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0230");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(calendar7, 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void DateUtils0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0231");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addYears(date0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0232");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setMonths(date4, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0233");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setHours(date4, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HOUR_OF_DAY");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0234");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(calendar7, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 10 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0235");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<?> wildcardItor2 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) 86400L, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on 86400");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0236");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(date4, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0237");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(calendar7, 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 86400L + "'", long9 == 86400L);
    }

    @Test
    public void DateUtils0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0238");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, (int) (short) 1);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) date5, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 4 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sun Feb 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0239");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, (int) (short) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setYears(date5, 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sun Feb 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 MST 5");
    }

    @Test
    public void DateUtils0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0240");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) 100.0d, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not find ceiling of for type: class java.lang.Double");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0241");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.lang.Class<?> wildcardClass7 = date6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void DateUtils0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0242");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.lang.Class<?> wildcardClass7 = date6.getClass();
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) wildcardClass7, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not find ceiling of for type: class java.lang.Class");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void DateUtils0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0243");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setDays(date5, 4);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addSeconds(date5, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sun Jan 04 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Wed Dec 31 23:59:59 MST 1969");
    }

    @Test
    public void DateUtils0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0244");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date4, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 4 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0245");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(date4, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 100 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0246");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor9 = org.apache.commons.lang3.time.DateUtils.iterator(calendar7, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 10 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0247");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        java.util.Iterator<java.util.Calendar> calendarItor9 = org.apache.commons.lang3.time.DateUtils.iterator(date6, 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendarItor9);
    }

    @Test
    public void DateUtils0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0248");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, (int) (short) 1);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(date7, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 100 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sun Feb 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0249");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.round(calendar7, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 32 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0250");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round(obj0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0251");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(calendar7, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 0 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0252");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addWeeks(date6, 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Feb 05 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0253");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) 0.0f, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 0.0");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0254");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setMonths(date0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0255");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) '4');
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(date7, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sat Jan 01 00:00:00 MST 52");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Fri Dec 31 23:59:59 MST 51");
    }

    @Test
    public void DateUtils0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0256");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "", "hi!" };
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray7);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", locale1, strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0257");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setHours(date0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0258");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.ceiling(calendar0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0259");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(calendar7, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 0 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0260");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addMonths(date0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0261");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addDays(date0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0262");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setYears(date0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0263");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!" };
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("hi!", strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void DateUtils0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0264");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<?> wildcardItor2 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) (-1L), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on -1");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0265");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setDays(date6, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0266");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (short) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date7, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Fri Jan 01 00:00:00 MST 1971");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Fri Jan 01 00:00:00 MST 1971");
    }

    @Test
    public void DateUtils0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0267");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray7);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0268");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long6 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date4, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment -1 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0269");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round(date0, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0270");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setHours(date4, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HOUR_OF_DAY");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0271");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setMonths(date4, (int) (byte) 0);
        java.lang.Class<?> wildcardClass9 = date4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0272");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addSeconds(date0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0273");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.ceiling(date4, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 100 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0274");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(calendar7, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 32 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0275");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        long long6 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date4, 1);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setMonths(date4, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 86400000L + "'", long6 == 86400000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Sun Feb 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0276");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<?> wildcardItor2 = org.apache.commons.lang3.time.DateUtils.iterator(obj0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0277");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "" };
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("hi!", locale1, strArray5);
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unable to parse the date: hi!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void DateUtils0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0278");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setMonths(date0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0279");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (short) 1);
        java.util.Calendar calendar8 = org.apache.commons.lang3.time.DateUtils.toCalendar(date7);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.toCalendar(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Fri Jan 01 00:00:00 MST 1971");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=31561200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1971,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=31561200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1971,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0280");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray7);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", locale1, strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0281");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addHours(date0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0282");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setYears(date0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0283");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(date6, (int) (short) 10);
        java.lang.Class<?> wildcardClass9 = date8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0284");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "", "hi!" };
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", locale1, strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0285");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(date7, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 0 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0286");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) '4', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round 4");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0287");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(calendar0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0288");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) '4');
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setMinutes(date7, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MINUTE");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sat Jan 01 00:00:00 MST 52");
    }

    @Test
    public void DateUtils0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0289");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addSeconds(date7, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:01:40 MST 1970");
    }

    @Test
    public void DateUtils0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0290");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setMinutes(date6, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MINUTE");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0291");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("hi!", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Date and Patterns must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0292");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) calendar7, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 3 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0293");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<?> wildcardItor2 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) (short) 10, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on 10");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0294");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(calendar7, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 0 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0295");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor8 = org.apache.commons.lang3.time.DateUtils.iterator(date4, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 100 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0296");
        java.util.Date date0 = null;
        java.util.Date date1 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            int int3 = org.apache.commons.lang3.time.DateUtils.truncatedCompareTo(date0, date1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0297");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date6, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment -1 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0298");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round a");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0299");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, (int) (short) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addHours(date7, 1001);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sun Feb 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Sat Mar 14 17:00:00 MST 1970");
    }

    @Test
    public void DateUtils0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0300");
        java.util.Locale locale3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale3, strArray6);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.parseDate("hi!", strArray6);
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unable to parse the date: hi!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0301");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, (int) (short) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sun Feb 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 MST 32");
    }

    @Test
    public void DateUtils0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0302");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addWeeks(date0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0303");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (byte) 1);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor9 = org.apache.commons.lang3.time.DateUtils.iterator(date5, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 97 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Fri Jan 01 00:00:00 MST 1971");
    }

    @Test
    public void DateUtils0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0304");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(date0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0305");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray6);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("hi!", locale1, strArray6);
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unable to parse the date: hi!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0306");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addMinutes(date6, (int) (short) 100);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.toCalendar(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 01:40:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=31200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=40,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0307");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addHours(date6, (int) (short) 100);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.toCalendar(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Mon Jan 05 04:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=385200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=5,DAY_OF_YEAR=5,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0308");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setYears(date7, 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 MST 5");
    }

    @Test
    public void DateUtils0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0309");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("hi!", strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0310");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<?> wildcardItor2 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) 3600000L, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on 3600000");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0311");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 1001);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setDays(date4, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:16:41 MST 1970");
    }

    @Test
    public void DateUtils0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0312");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.setDays(date4, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0313");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.round(calendar7, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0314");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor9 = org.apache.commons.lang3.time.DateUtils.iterator(calendar7, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 100 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0315");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 1001);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setHours(date4, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HOUR_OF_DAY");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:16:41 MST 1970");
    }

    @Test
    public void DateUtils0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0316");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setSeconds(date0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0317");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray1);
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unable to parse the date: ");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void DateUtils0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0318");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setMonths(date4, (int) (short) 0);
        java.lang.Class<?> wildcardClass9 = date8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0319");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMinutes(date4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:10:00 MST 1970");
    }

    @Test
    public void DateUtils0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0320");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, (int) (short) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setSeconds(date5, 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sun Feb 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:04 MST 1970");
    }

    @Test
    public void DateUtils0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0321");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) 'a');
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addHours(date5, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Wed Feb 01 00:00:00 MST 1978");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Mon Jan 05 01:00:00 MST 1970");
    }

    @Test
    public void DateUtils0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0322");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray4);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) wildcardClass7, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round class [Ljava.lang.String;");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void DateUtils0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0323");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) "", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round ");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0324");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) date4, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 100 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0325");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.ceiling(calendar7, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 35 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0326");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(calendar0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0327");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(calendar7, 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void DateUtils0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0328");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addHours(date6, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Mon Jan 05 04:00:00 MST 1970");
    }

    @Test
    public void DateUtils0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0329");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, (int) (short) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) date5, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sun Feb 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Sat Jan 01 00:00:00 MST 1");
    }

    @Test
    public void DateUtils0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0330");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDate("hi!", strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0331");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor8 = org.apache.commons.lang3.time.DateUtils.iterator(date4, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 1001 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0332");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.round(calendar7, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0333");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addDays(date0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0334");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addDays(date6, (int) (byte) 100);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Sat Apr 11 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0335");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Calendar calendar1 = org.apache.commons.lang3.time.DateUtils.toCalendar(date0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0336");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray4);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addYears(date6, (int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = date8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Wed Jan 01 00:00:00 MST 1969");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0337");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setMinutes(date6, (int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = date8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:10:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0338");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(calendar0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0339");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", locale2, strArray6);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("hi!", strArray6);
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unable to parse the date: hi!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0340");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<?> wildcardItor2 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) 1.0d, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on 1.0");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0341");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, (int) (short) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addHours(date5, 1001);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sun Feb 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Wed Feb 11 17:00:00 MST 1970");
    }

    @Test
    public void DateUtils0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0342");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", locale1, strArray5);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addWeeks(date7, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Dec 25 00:00:00 MST 1969");
    }

    @Test
    public void DateUtils0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0343");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setYears(date0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0344");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(calendar0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0345");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not find ceiling of for type: class java.lang.Character");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0346");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0347");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray2 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date3 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", locale1, strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Date and Patterns must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0348");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<?> wildcardItor2 = org.apache.commons.lang3.time.DateUtils.iterator(obj0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0349");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.truncate(calendar7, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0350");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(calendar7, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 1001 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0351");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addDays(date6, (int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = date8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Sat Apr 11 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0352");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) date4, 1001);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0353");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(date0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0354");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, (int) (short) 1);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(date7, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 0 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sun Feb 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0355");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setHours(date0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0356");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(calendar7, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void DateUtils0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0357");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor9 = org.apache.commons.lang3.time.DateUtils.iterator(calendar7, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 10 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0358");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0359");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray7);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.parseDate("hi!", strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0360");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addHours(date6, 0);
        java.lang.Class<?> wildcardClass9 = date8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0361");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(calendar7, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 100 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0362");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) '4');
        long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(date7, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sat Jan 01 00:00:00 MST 52");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void DateUtils0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0363");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.truncate(calendar0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0364");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray5);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setDays(date7, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Sat Jan 10 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0365");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray4);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date6, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0366");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(calendar0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0367");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", locale1, strArray5);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setMonths(date7, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0368");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(calendar7, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 0 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0369");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) '#');
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addHours(date5, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Fri Dec 01 00:00:00 MST 1972");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 01:00:00 MST 1970");
    }

    @Test
    public void DateUtils0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0370");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.ceiling(calendar0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0371");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<?> wildcardItor8 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) "", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on ");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0372");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addWeeks(date0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0373");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0374");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0375");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0376");
        java.util.Locale locale3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale3, strArray6);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray6);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.parseDate("hi!", strArray6);
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unable to parse the date: hi!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0377");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.ceiling(calendar7, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 100 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0378");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (byte) 1);
        long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(date7, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Fri Jan 01 00:00:00 MST 1971");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 24L + "'", long9 == 24L);
    }

    @Test
    public void DateUtils0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0379");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(calendar7, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 0 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0380");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(date6, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 0 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0381");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray5);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(date7, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0382");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (short) 1);
        java.util.Calendar calendar8 = org.apache.commons.lang3.time.DateUtils.toCalendar(date5);
        java.lang.Class<?> wildcardClass9 = calendar8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Fri Jan 01 00:00:00 MST 1971");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0383");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(date6, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 35 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0384");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.lang.Class<?> wildcardClass8 = date4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void DateUtils0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0385");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0386");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(calendar7, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 100 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0387");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (short) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setHours(date5, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Fri Jan 01 00:00:00 MST 1971");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 10:00:00 MST 1970");
    }

    @Test
    public void DateUtils0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0388");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray5);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setHours(date7, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 10:00:00 MST 1970");
    }

    @Test
    public void DateUtils0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0389");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setDays(date5, 4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.round(date7, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 52 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sun Jan 04 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0390");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) '4');
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setHours(date5, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sat Jan 01 00:00:00 MST 52");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 01:00:00 MST 1970");
    }

    @Test
    public void DateUtils0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0391");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray6);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(date7, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 10 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0392");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addWeeks(date6, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0393");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) '#');
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.truncate(date5, 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Fri Dec 01 00:00:00 MST 1972");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0394");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray6);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("hi!", strArray6);
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unable to parse the date: hi!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0395");
        java.util.Locale locale3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale3, strArray6);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0396");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addHours(date0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0397");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.truncate(calendar0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0398");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(calendar0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0399");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(date0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0400");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(calendar7, 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void DateUtils0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0401");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addYears(date0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0402");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date3 = org.apache.commons.lang3.time.DateUtils.round(obj0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round java.lang.Object@2757c836");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void DateUtils0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0403");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0404");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.round(calendar7, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 97 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0405");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        long long6 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date4, 1);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(date4, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 0 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 86400000L + "'", long6 == 86400000L);
    }

    @Test
    public void DateUtils0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0406");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) date4, 0);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Sat Jan 01 00:00:00 MST 1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0407");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setDays(date5, 4);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addDays(date7, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sun Jan 04 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Tue Apr 14 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0408");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setYears(date0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0409");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0410");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        long long6 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date4, 1);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setDays(date4, (int) (short) 10);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.toCalendar(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 86400000L + "'", long6 == 86400000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Sat Jan 10 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=802800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=10,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0411");
        java.util.Locale locale3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale3, strArray6);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray6);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("hi!", strArray6);
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unable to parse the date: hi!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0412");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(date6, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment -1 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0413");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setDays(date5, 4);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.ceiling(date7, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sun Jan 04 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Sat Jan 01 00:00:00 MST 1");
    }

    @Test
    public void DateUtils0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0414");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, (int) (short) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sun Feb 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Fri Jan 01 00:00:00 MST 1971");
    }

    @Test
    public void DateUtils0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0415");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 52 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0416");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setMinutes(date4, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MINUTE");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0417");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, (int) (short) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addHours(date5, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sun Feb 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Fri Jan 02 11:00:00 MST 1970");
    }

    @Test
    public void DateUtils0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0418");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) '#');
        java.util.Calendar calendar8 = org.apache.commons.lang3.time.DateUtils.toCalendar(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Fri Dec 01 00:00:00 MST 1972");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0419");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addDays(date0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0420");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0421");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        java.util.Iterator<java.util.Calendar> calendarItor9 = org.apache.commons.lang3.time.DateUtils.iterator(calendar7, 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendarItor9);
    }

    @Test
    public void DateUtils0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0422");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray5);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMinutes(date7, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:52:00 MST 1970");
    }

    @Test
    public void DateUtils0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0423");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addDays(date4, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Sun Jan 11 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0424");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        long long6 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date4, 1);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setDays(date4, (int) (short) 10);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 86400000L + "'", long6 == 86400000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Sat Jan 10 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0425");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Calendar calendar8 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            boolean boolean9 = org.apache.commons.lang3.time.DateUtils.isSameInstant(calendar7, calendar8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0426");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setMonths(date6, 0);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.toCalendar(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0427");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setDays(date5, 4);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMinutes(date7, 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sun Jan 04 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Sun Jan 04 00:03:00 MST 1970");
    }

    @Test
    public void DateUtils0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0428");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 1001);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setYears(date6, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: YEAR");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:16:41 MST 1970");
    }

    @Test
    public void DateUtils0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0429");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addWeeks(date0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0430");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(date0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0431");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMonths(date7, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Fri Dec 01 00:00:00 MST 1972");
    }

    @Test
    public void DateUtils0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0432");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(calendar7, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 1001 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0433");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addSeconds(date0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0434");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.truncate(calendar7, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 97 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0435");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date7, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 32 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0436");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.truncate(calendar7, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0437");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray7);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.parseDate("hi!", strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0438");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor2 = org.apache.commons.lang3.time.DateUtils.iterator(calendar0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0439");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(date0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0440");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0441");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (byte) 1);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) date7, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 3 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Fri Jan 01 00:00:00 MST 1971");
    }

    @Test
    public void DateUtils0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0442");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) 'a');
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Wed Feb 01 00:00:00 MST 1978");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0443");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date4, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 1001 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0444");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate(date0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0445");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addDays(date0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0446");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.round(date5, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 100 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0447");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(calendar0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0448");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(calendar0, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0449");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(date0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0450");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDate("hi!", strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0451");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setDays(date6, 4);
        java.lang.Class<?> wildcardClass9 = date8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Sun Jan 04 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0452");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Calendar calendar8 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0453");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<?> wildcardItor9 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) calendar7, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 0 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0454");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) (-1L), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate -1");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0455");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.truncate(calendar0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0456");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(calendar7, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 10 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0457");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(calendar7, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 32 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0458");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) '4');
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(date5, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sat Jan 01 00:00:00 MST 52");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0459");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.ceiling(date6, (int) (short) 10);
        java.lang.Class<?> wildcardClass9 = date8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 01:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0460");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray5);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) date7, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 35 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0461");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(calendar7, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 100 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0462");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.round(calendar7, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0463");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) "", 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not find ceiling of for type: class java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0464");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) '4');
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addDays(date5, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sat Jan 01 00:00:00 MST 52");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0465");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setDays(date0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0466");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addHours(date0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0467");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date4, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MILLISECOND");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0468");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.round(date7, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0469");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) calendar7, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Sat Jan 01 00:00:00 MST 1");
    }

    @Test
    public void DateUtils0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0470");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray2 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date3 = org.apache.commons.lang3.time.DateUtils.parseDate("hi!", locale1, strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Date and Patterns must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0471");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setYears(date7, 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Sun Jan 01 00:00:00 MST 2");
    }

    @Test
    public void DateUtils0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0472");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(calendar7, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 100 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0473");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling(obj0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0474");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.lang.Class<?> wildcardClass7 = date4.getClass();
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) date4, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0475");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", locale1, strArray5);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(date7, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0476");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void DateUtils0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0477");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(calendar7, 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void DateUtils0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0478");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray6);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.parseDate("hi!", locale1, strArray6);
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unable to parse the date: hi!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0479");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addMinutes(date6, (int) '#');
        java.lang.Class<?> wildcardClass9 = date6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:35:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0480");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray6);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.parseDate("hi!", strArray6);
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unable to parse the date: hi!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0481");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(date0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0482");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addMinutes(date0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0483");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(calendar0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0484");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) 0.0d, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 0.0");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0485");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 1001);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addHours(date6, 2);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.toCalendar(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:16:41 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 02:16:41 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=33401000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=16,SECOND=41,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0486");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", locale1, strArray5);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setHours(date7, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0487");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray7);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0488");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) 1000L, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 1000");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0489");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        long long6 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date4, 1);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setYears(date4, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 86400000L + "'", long6 == 86400000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Wed Jan 01 00:00:00 MST 10");
    }

    @Test
    public void DateUtils0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0490");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addWeeks(date0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0491");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, (int) (short) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.truncate(date5, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sun Feb 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Sat Jan 01 00:00:00 MST 1");
    }

    @Test
    public void DateUtils0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0492");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Wed Dec 31 23:00:00 MST 1969");
    }

    @Test
    public void DateUtils0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0493");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(calendar7, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 0 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0494");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray5);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(date7, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 100 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0495");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor2 = org.apache.commons.lang3.time.DateUtils.iterator(date0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0496");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(date4, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 32 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0497");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) '#');
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 0 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Fri Dec 01 00:00:00 MST 1972");
    }

    @Test
    public void DateUtils0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0498");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<?> wildcardItor2 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) 1.0f, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on 1.0");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0499");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addSeconds(date0, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.DateUtils0500");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(calendar0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }
}

