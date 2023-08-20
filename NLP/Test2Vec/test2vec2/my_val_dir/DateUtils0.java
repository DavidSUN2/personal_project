
package DateUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DateUtils0 {

    public static boolean debug = false;

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test01");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addMonths(date0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test02");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addYears(date0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test03");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round(date0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test04");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addHours(date0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test05");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(date0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test06");
        long long0 = org.apache.commons.lang3.time.DateUtils.MILLIS_PER_MINUTE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 60000L + "'", long0 == 60000L);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test07");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(date0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test08");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setHours(date0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test09");
        java.util.Date date0 = null;
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.lang3.time.DateUtils.isSameInstant(date0, date1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test10");
        java.util.Date date0 = null;
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.lang3.time.DateUtils.truncatedCompareTo(date0, date1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test11");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(date0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test12");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test13");
        long long0 = org.apache.commons.lang3.time.DateUtils.MILLIS_PER_DAY;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 86400000L + "'", long0 == 86400000L);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test14");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(date0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test15");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setMinutes(date0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test16");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.time.DateUtils.truncatedEquals(calendar0, calendar1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test17");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) 0.0f, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 0.0");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test18");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(date0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test19");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(date0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test20");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(calendar0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test21");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setDays(date0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test22");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(date0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test23");
        org.apache.commons.lang3.time.DateUtils dateUtils0 = new org.apache.commons.lang3.time.DateUtils();
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test24");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addDays(date0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test25");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setHours(date0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test26");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setYears(date0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test27");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate(date0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test28");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test29");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("hi!", locale1, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test30");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar1 = org.apache.commons.lang3.time.DateUtils.toCalendar(date0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test31");
        long long0 = org.apache.commons.lang3.time.DateUtils.MILLIS_PER_SECOND;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 1000L + "'", long0 == 1000L);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test32");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.round(calendar0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test33");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addDays(date0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test34");
        int int0 = org.apache.commons.lang3.time.DateUtils.RANGE_MONTH_SUNDAY;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test35");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addDays(date0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test36");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test37");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(date0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test38");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addWeeks(date0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test39");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.lang3.time.DateUtils.isSameInstant(calendar0, calendar1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test40");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor2 = org.apache.commons.lang3.time.DateUtils.iterator(date0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test41");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.lang3.time.DateUtils.isSameDay(calendar0, calendar1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test42");
        long long0 = org.apache.commons.lang3.time.DateUtils.MILLIS_PER_HOUR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 3600000L + "'", long0 == 3600000L);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test43");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(date0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test44");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setMonths(date0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test45");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test46");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.lang3.time.DateUtils.isSameLocalTime(calendar0, calendar1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test47");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setMinutes(date0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test48");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(date0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test49");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("hi!", locale1, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test50");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(date0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test51");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addDays(date0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test52");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(date0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test53");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test54");
        int int0 = org.apache.commons.lang3.time.DateUtils.RANGE_WEEK_MONDAY;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test55");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addMonths(date0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test56");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addWeeks(date0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test57");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("hi!", strArray3);
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unable to parse the date: hi!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test58");
        java.util.Date date0 = null;
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.time.DateUtils.truncatedEquals(date0, date1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test59");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addWeeks(date0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test60");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(calendar0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test61");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(calendar0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test62");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(date0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test63");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.lang3.time.DateUtils.truncatedCompareTo(calendar0, calendar1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test64");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addMonths(date0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test65");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor2 = org.apache.commons.lang3.time.DateUtils.iterator(calendar0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test66");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) "hi!", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not find ceiling of for type: class java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test67");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling(obj0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test68");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(date0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test69");
        int int0 = org.apache.commons.lang3.time.DateUtils.RANGE_WEEK_SUNDAY;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test70");
        int int0 = org.apache.commons.lang3.time.DateUtils.SEMI_MONTH;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1001 + "'", int0 == 1001);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test71");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addWeeks(date0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test72");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) "", 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round ");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test73");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addMinutes(date0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils0.test74");
        int int0 = org.apache.commons.lang3.time.DateUtils.RANGE_MONTH_MONDAY;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }
}

