
package DateUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DateUtils1 {

    public static boolean debug = false;

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0501");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.ceiling(calendar7, (int) 'a');
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0502");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        long long6 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date4, 1);
        java.lang.Class<?> wildcardClass7 = date4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) wildcardClass7, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round class java.util.Date");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0503");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<?> wildcardItor2 = org.apache.commons.lang3.time.DateUtils.iterator(obj0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0504");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addDays(date4, (int) (byte) 100);
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
        org.junit.Assert.assertEquals(date8.toString(), "Sat Apr 11 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=8665200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=101,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0505");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(date0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0506");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setMonths(date4, (-1));
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0507");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling(date0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0508");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(date0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0509");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setYears(date7, (int) (byte) -1);
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
        org.junit.Assert.assertEquals(date7.toString(), "Sat Jan 01 00:00:00 MST 52");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0510");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) 100.0d, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round 100.0");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0511");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setHours(date0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0512");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) 'a');
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addDays(date5, (int) (short) 0);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0513");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(calendar7, (int) (byte) 10);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0514");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addHours(date0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0515");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) '#');
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(date5, (int) (short) -1);
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
        org.junit.Assert.assertEquals(date9.toString(), "Wed Dec 31 23:59:59 MST 1969");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0516");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", locale2, strArray6);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0517");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) '#');
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
        org.junit.Assert.assertEquals(date7.toString(), "Fri Dec 01 00:00:00 MST 1972");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Sat Jan 01 00:00:00 MST 1");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0518");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) locale1, 0);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0519");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) '#');
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date7, 6);
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
        org.junit.Assert.assertEquals(date9.toString(), "Fri Dec 01 00:00:00 MST 1972");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0520");
        java.util.Calendar calendar0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addHours(date5, (int) (short) 0);
        java.util.Calendar calendar8 = org.apache.commons.lang3.time.DateUtils.toCalendar(date5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.apache.commons.lang3.time.DateUtils.isSameDay(calendar0, calendar8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
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
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0521");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.truncate(calendar7, 10);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0522");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.truncate(calendar0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0523");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(date0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0524");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDate("hi!", locale1, strArray7);
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
            System.out.format("%n%s%n", "DateUtils1.test0525");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, (int) (short) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setYears(date7, (int) 'a');
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
        org.junit.Assert.assertEquals(date9.toString(), "Wed Feb 01 00:00:00 MST 97");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0526");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) (-1L), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round -1");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0527");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setYears(date4, 1);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0528");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setHours(date6, (int) (byte) 10);
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 10:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0529");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        // The following exception was thrown during execution in test generation
        try {
            long long7 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(date5, (int) (short) -1);
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
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0530");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) calendar7, (int) (short) 100);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0531");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setDays(date5, 4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) date5, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field -1 is not supported");
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0532");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, (int) (short) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addDays(date5, (int) (short) -1);
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
        org.junit.Assert.assertEquals(date9.toString(), "Wed Dec 31 00:00:00 MST 1969");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0533");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(date7, 0);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0534");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) 5, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 5");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0535");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMinutes(date5, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 10");
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
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:10:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0536");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor9 = org.apache.commons.lang3.time.DateUtils.iterator(calendar7, (int) (byte) 0);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0537");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray6);
        long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(date7, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1440L + "'", long9 == 1440L);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0538");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(date0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0539");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) 100.0f, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round 100.0");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0540");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) 'a');
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(date5, (int) (byte) 1);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0541");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        long long6 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date4, 1);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addYears(date4, (int) (short) 100);
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
        org.junit.Assert.assertEquals(date8.toString(), "Wed Jan 01 00:00:00 MST 2070");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0542");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.truncate(date5, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field -1 is not supported");
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0543");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMinutes(date5, (int) (short) 10);
        java.util.Iterator<?> wildcardItor9 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) date5, 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:10:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardItor9);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0544");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", locale1, strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor9 = org.apache.commons.lang3.time.DateUtils.iterator(date7, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 1001 is not valid.");
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0545");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) 'a');
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(date7, 2);
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
        org.junit.Assert.assertEquals(date9.toString(), "Wed Feb 01 00:00:00 MST 1978");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0546");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(calendar7, (int) (byte) 100);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0547");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.truncate(calendar7, (int) (byte) -1);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0548");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.round(calendar7, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 6 is not supported");
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0549");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (short) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) date7, (int) (byte) 0);
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
        org.junit.Assert.assertEquals(date9.toString(), "Sat Jan 01 00:00:00 MST 1");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0550");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH");
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0551");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<?> wildcardItor2 = org.apache.commons.lang3.time.DateUtils.iterator(obj0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0552");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(date6, 0);
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0553");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0554");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round(date0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0555");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(calendar0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0556");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round(date0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0557");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.round(calendar0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0558");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<?> wildcardItor9 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) date7, (int) (byte) 10);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0559");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) 'a');
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, (int) (short) 1);
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
        org.junit.Assert.assertEquals(date9.toString(), "Sun Feb 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0560");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in test generation
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0561");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.truncate(calendar0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0562");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setSeconds(date0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0563");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not find ceiling of for type: class java.lang.Short");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0564");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor2 = org.apache.commons.lang3.time.DateUtils.iterator(date0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0565");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("hi!", strArray7);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0566");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor9 = org.apache.commons.lang3.time.DateUtils.iterator(date5, 0);
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
        org.junit.Assert.assertEquals(date7.toString(), "Wed Feb 01 00:00:00 MST 1978");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0567");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        long long6 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date4, 1);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(date4, (int) ' ');
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
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 86400000L + "'", long6 == 86400000L);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0568");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor2 = org.apache.commons.lang3.time.DateUtils.iterator(date0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0569");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, (int) (short) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addSeconds(date7, 5);
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
        org.junit.Assert.assertEquals(date9.toString(), "Sun Feb 01 00:00:05 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0570");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addMonths(date0, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0571");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "", "hi!" };
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("hi!", locale1, strArray7);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0572");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addMinutes(date0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0573");
        java.util.Locale locale3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale3, strArray6);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray6);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0574");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) date6, (int) (short) 0);
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
        org.junit.Assert.assertEquals(date8.toString(), "Sat Jan 01 00:00:00 MST 1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0575");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (byte) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addWeeks(date5, 0);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0576");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.truncate(date6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 52 is not supported");
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0577");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) 2, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round 2");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0578");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (short) 1);
        java.util.Iterator<?> wildcardItor9 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) date5, 6);
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
        org.junit.Assert.assertNotNull(wildcardItor9);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0579");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(date6, (int) (short) 0);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0580");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(calendar0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0581");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        // The following exception was thrown during execution in test generation
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0582");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setMonths(date4, 3);
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
        org.junit.Assert.assertEquals(date8.toString(), "Wed Apr 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0583");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor9 = org.apache.commons.lang3.time.DateUtils.iterator(date7, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 35 is not valid.");
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0584");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addMinutes(date6, (int) '#');
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:35:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0585");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round(obj0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0586");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addSeconds(date6, 6);
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:06 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0587");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(calendar7, (int) (short) 100);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0588");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addDays(date4, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(date4, (int) (short) -1);
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
        org.junit.Assert.assertEquals(date6.toString(), "Sun Jan 11 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0589");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) "", 100);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0590");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        long long6 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date4, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setMinutes(date4, (int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 86400000L + "'", long6 == 86400000L);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0591");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.ceiling(date6, 100);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0592");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 1001);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setHours(date4, (int) (byte) 1);
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 01:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0593");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) (short) 0, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 0");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0594");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addHours(date6, 100);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0595");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setMonths(date4, 4);
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
        org.junit.Assert.assertEquals(date9.toString(), "Fri May 01 00:00:00 MDT 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0596");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("hi!", locale1, strArray5);
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
            System.out.format("%n%s%n", "DateUtils1.test0597");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addMonths(date4, 1001);
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
        org.junit.Assert.assertEquals(date8.toString(), "Sun Jun 01 00:00:00 MDT 2053");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0598");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (short) 1);
        java.util.Calendar calendar8 = org.apache.commons.lang3.time.DateUtils.toCalendar(date7);
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
        org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=31561200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1971,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0599");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(calendar7, (int) (byte) -1);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0600");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) 10.0d, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 10.0");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0601");
        java.util.Date date0 = null;
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.time.DateUtils.truncatedEquals(date0, date1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0602");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addWeeks(date6, 0);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0603");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setMonths(date7, 0);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0604");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addSeconds(date0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0605");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.truncate(calendar7, 3);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0606");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addSeconds(date6, (int) ' ');
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
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:32 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0607");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate(date0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0608");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", locale1, strArray5);
        java.lang.Class<?> wildcardClass8 = strArray5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0609");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.truncate(calendar7, (int) (short) 0);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0610");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addMonths(date0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0611");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) '4');
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setMinutes(date5, (int) (byte) 10);
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
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:10:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0612");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in test generation
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0613");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, (int) (short) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setYears(date5, 3);
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
        org.junit.Assert.assertEquals(date9.toString(), "Mon Jan 01 00:00:00 MST 3");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0614");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(date0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0615");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addMinutes(date6, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0616");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addDays(date7, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Wed Dec 31 00:00:00 MST 1969");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0617");
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
            System.out.format("%n%s%n", "DateUtils1.test0618");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<?> wildcardItor2 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) (-1.0f), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on -1.0");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0619");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 1001);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) date4, 0);
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
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:16:41 MST 1970");
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0620");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray4);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(date6, 6);
        java.lang.Class<?> wildcardClass9 = date6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0621");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.lang.Class<?> wildcardClass6 = date5.getClass();
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) date5, (int) (byte) 10);
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0622");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setHours(date7, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HOUR_OF_DAY");
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0623");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addSeconds(date0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0624");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        long long6 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date4, 1);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addMonths(date4, (int) (byte) 0);
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0625");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setDays(date0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0626");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) 1001, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round 1001");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0627");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(calendar7, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 32 is not supported");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0628");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor2 = org.apache.commons.lang3.time.DateUtils.iterator(calendar0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0629");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) '4');
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addDays(date5, 100);
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
        org.junit.Assert.assertEquals(date9.toString(), "Sat Apr 11 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0630");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling(date0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0631");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(date4, (int) '#');
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
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0632");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(calendar0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0633");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addSeconds(date6, 6);
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:06 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=25206000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=6,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0634");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("hi!", locale1, strArray3);
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
            System.out.format("%n%s%n", "DateUtils1.test0635");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) calendar7, (int) (short) 0);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0636");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (short) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addYears(date5, (int) (byte) -1);
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
        org.junit.Assert.assertEquals(date9.toString(), "Wed Jan 01 00:00:00 MST 1969");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0637");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor2 = org.apache.commons.lang3.time.DateUtils.iterator(calendar0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0638");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray4);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addMonths(date6, (int) (byte) 0);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0639");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addSeconds(date0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0640");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.truncate(calendar7, (int) (short) -1);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0641");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addDays(date4, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date4, 0);
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
        org.junit.Assert.assertEquals(date6.toString(), "Sun Jan 11 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0642");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(date4, (int) (short) 10);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0643");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addDays(date4, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setDays(date6, 1001);
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
        org.junit.Assert.assertEquals(date6.toString(), "Sun Jan 11 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0644");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(calendar7, 2);
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
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 86400L + "'", long9 == 86400L);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0645");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.truncate(calendar0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0646");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setMinutes(date6, (int) (short) 10);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0647");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray2 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("hi!", locale1, strArray2);
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unable to parse the date: hi!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0648");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray5);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMinutes(date7, (int) (byte) 10);
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
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:10:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0649");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH");
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0650");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMinutes(date5, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.truncate(date5, 100);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:10:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0651");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.truncate(date4, (int) (short) 0);
        java.lang.Class<?> wildcardClass7 = date4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Sat Jan 01 00:00:00 MST 1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0652");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setDays(date4, 4);
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
        org.junit.Assert.assertEquals(date8.toString(), "Sun Jan 04 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0653");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.truncate(date5, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field -1 is not supported");
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0654");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate(date0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0655");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<?> wildcardItor2 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) 1.0f, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on 1.0");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0656");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setYears(date0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0657");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        long long6 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date4, 1);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(date4, 100);
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
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 86400000L + "'", long6 == 86400000L);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0658");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Date and Patterns must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0659");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(date6, 1001);
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
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0660");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("hi!", strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0661");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("hi!", strArray7);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0662");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addHours(date7, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 01:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0663");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(calendar7, 0);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0664");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Calendar calendar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.apache.commons.lang3.time.DateUtils.isSameLocalTime(calendar7, calendar8);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0665");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling(date0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0666");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0667");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(date6, 0);
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
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0668");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addYears(date0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0669");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setSeconds(date0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0670");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date5, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MILLISECOND");
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0671");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setDays(date5, 4);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setSeconds(date7, (int) (short) 1);
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
        org.junit.Assert.assertEquals(date9.toString(), "Sun Jan 04 00:00:01 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0672");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling(obj0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0673");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(calendar7, (-1));
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0674");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setYears(date4, 1);
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
        org.junit.Assert.assertEquals(date8.toString(), "Sat Jan 01 00:00:00 MST 1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=-62135744400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0675");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setDays(date5, 4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, 4);
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
        org.junit.Assert.assertEquals(date7.toString(), "Sun Jan 04 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0676");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(date7, (int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 24L + "'", long9 == 24L);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0677");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<?> wildcardItor9 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) calendar7, (int) (short) 10);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0678");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) 'a');
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addDays(date7, 4);
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
        org.junit.Assert.assertEquals(date9.toString(), "Sun Feb 05 00:00:00 MST 1978");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0679");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("hi!", locale1, strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Date and Patterns must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0680");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setHours(date0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0681");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling(obj0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0682");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) '#');
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setYears(date7, (int) ' ');
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
        org.junit.Assert.assertEquals(date9.toString(), "Mon Dec 01 00:00:00 MST 32");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0683");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<?> wildcardItor2 = org.apache.commons.lang3.time.DateUtils.iterator(obj0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0684");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (short) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(date5, 4);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0685");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.truncate(calendar7, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 6 is not supported");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0686");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (short) 1);
        long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(date7, 1);
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 86400L + "'", long9 == 86400L);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0687");
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
            System.out.format("%n%s%n", "DateUtils1.test0688");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.truncate(date4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date6, 0);
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
        org.junit.Assert.assertEquals(date6.toString(), "Sat Jan 01 00:00:00 MST 1");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0689");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addDays(date4, (int) (short) 10);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addYears(date6, 10);
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
        org.junit.Assert.assertEquals(date6.toString(), "Sun Jan 11 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Fri Jan 11 00:00:00 MST 1980");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=316422000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1980,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=11,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0690");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor2 = org.apache.commons.lang3.time.DateUtils.iterator(calendar0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0691");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in test generation
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0692");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling(obj0, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0693");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setDays(date5, 4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setHours(date7, (int) '4');
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
        org.junit.Assert.assertEquals(date7.toString(), "Sun Jan 04 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0694");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(calendar0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0695");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setMinutes(date7, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MINUTE");
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0696");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(date5, (int) (short) 0);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0697");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round(obj0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0698");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.round(calendar7, (int) (short) -1);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0699");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 100");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0700");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setDays(date5, 4);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(date7, 3);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sun Jan 04 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0701");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) '4');
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addDays(date5, 1001);
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
        org.junit.Assert.assertEquals(date9.toString(), "Thu Sep 28 00:00:00 MDT 1972");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0702");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setMonths(date6, 1001);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0703");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0704");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.round(calendar7, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 6 is not supported");
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0705");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setYears(date6, (int) (byte) 0);
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
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0706");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray5);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) date7, 5);
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
        org.junit.Assert.assertEquals(date9.toString(), "Fri Jan 02 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0707");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setDays(date4, 4);
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
        org.junit.Assert.assertEquals(date8.toString(), "Sun Jan 04 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0708");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setMonths(date6, 0);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0709");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addDays(date0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0710");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0711");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) 'a');
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addSeconds(date7, (int) (byte) 10);
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
        org.junit.Assert.assertEquals(date9.toString(), "Wed Feb 01 00:00:10 MST 1978");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0712");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setMonths(date4, (int) (short) 0);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0713");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(calendar7, (int) (short) 0);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0714");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0715");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setSeconds(date5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(date5, 0);
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
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0716");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0717");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.truncate(calendar7, (int) (short) 0);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0718");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.truncate(calendar0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0719");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) "", 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not find ceiling of for type: class java.lang.String");
        } catch (java.lang.ClassCastException e) {
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0720");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0721");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) 'a');
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date7, (int) (byte) 0);
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
        org.junit.Assert.assertEquals(date9.toString(), "Wed Feb 01 00:00:00 MST 1978");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0722");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, (int) (short) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setHours(date5, 1);
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
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 01:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0723");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(calendar0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0724");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray6);
        long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(date7, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 24L + "'", long9 == 24L);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0725");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.truncate(date4, (int) (short) 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(date4, 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Sat Jan 01 00:00:00 MST 1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0726");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray5);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.ceiling(date7, 0);
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
        org.junit.Assert.assertEquals(date9.toString(), "Sat Jan 01 00:00:00 MST 1");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0727");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(calendar0, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0728");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.round(calendar0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0729");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        java.lang.Class<?> wildcardClass8 = date6.getClass();
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0730");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addMonths(date6, (int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = date6.getClass();
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
        org.junit.Assert.assertEquals(date8.toString(), "Mon May 01 00:00:00 MDT 1978");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0731");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.truncate(date4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(date4, (int) (short) 0);
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
        org.junit.Assert.assertEquals(date6.toString(), "Sat Jan 01 00:00:00 MST 1");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0732");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setMonths(date4, (int) (byte) 0);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0733");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("hi!", strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0734");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) calendar7, 1);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0735");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Date and Patterns must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0736");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date4, 3);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0737");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate(obj0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0738");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 1001);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<?> wildcardItor8 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) date4, (int) (byte) 100);
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
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:16:41 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0739");
        java.util.Locale locale3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale3, strArray6);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0740");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMonths(date6, 0);
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
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0741");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.round(calendar0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0742");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.ceiling(date6, 100);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0743");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) date6, 0);
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
        org.junit.Assert.assertEquals(date8.toString(), "Sat Jan 01 00:00:00 MST 1");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0744");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(calendar0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0745");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", locale2, strArray6);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0746");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setDays(date5, 4);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setSeconds(date7, 5);
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
        org.junit.Assert.assertEquals(date9.toString(), "Sun Jan 04 00:00:05 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0747");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addMonths(date6, (int) (byte) 100);
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
        org.junit.Assert.assertEquals(date8.toString(), "Mon May 01 00:00:00 MDT 1978");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=262850400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1978,MONTH=4,WEEK_OF_YEAR=18,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=121,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=3600000]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0748");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) "", 2);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0749");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(calendar0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0750");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray4);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setMinutes(date6, 0);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0751");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setDays(date5, 4);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setMinutes(date7, (int) (byte) 0);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0752");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMinutes(date4, 10);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0753");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0754");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(calendar0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0755");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addMonths(date0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0756");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 1001);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(date4, (-1));
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
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:16:41 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0757");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate(date0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0758");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(calendar7, (int) 'a');
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0759");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        long long6 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date4, 1);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date4, (int) 'a');
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
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 86400000L + "'", long6 == 86400000L);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0760");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.lang.Class<?> wildcardClass7 = date4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) wildcardClass7, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round class java.util.Date");
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0761");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) strArray5, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not find ceiling of for type: class [Ljava.lang.String;");
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0762");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", locale1, strArray5);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addDays(date7, (int) '4');
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
        org.junit.Assert.assertEquals(date9.toString(), "Sun Feb 22 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0763");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setDays(date5, 4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setMinutes(date5, (int) (short) 100);
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
        org.junit.Assert.assertEquals(date7.toString(), "Sun Jan 04 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0764");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addHours(date0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0765");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling(date0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0766");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray4);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addMonths(date6, 10);
        java.lang.Class<?> wildcardClass9 = date6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0767");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setMinutes(date0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0768");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor2 = org.apache.commons.lang3.time.DateUtils.iterator(date0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0769");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.lang.Class<?> wildcardClass8 = date7.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0770");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling(date0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0771");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling(date0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0772");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 1001);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.ceiling(date4, (int) (short) 1);
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
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:16:41 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Fri Jan 01 00:00:00 MST 1971");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0773");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<?> wildcardItor8 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) strArray5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on [Ljava.lang.String;@bc9cb23");
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0774");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (byte) 1);
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
        org.junit.Assert.assertEquals(date7.toString(), "Fri Jan 01 00:00:00 MST 1971");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0775");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        // The following exception was thrown during execution in test generation
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0776");
        java.util.Locale locale3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale3, strArray6);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        // The following exception was thrown during execution in test generation
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0777");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMinutes(date5, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(date7, (int) (short) 0);
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
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:10:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0778");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.truncate(calendar7, 1);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0779");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.truncate(calendar0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0780");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(date7, (int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1440L + "'", long9 == 1440L);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0781");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.ceiling(calendar0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0782");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(date0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0783");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(calendar7, (int) (byte) -1);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0784");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(date6, (int) (short) 0);
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0785");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, (int) (short) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setDays(date7, 2);
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
        org.junit.Assert.assertEquals(date9.toString(), "Mon Feb 02 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0786");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Iterator<?> wildcardItor9 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) date4, 1);
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
        org.junit.Assert.assertNotNull(wildcardItor9);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0787");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round  ");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0788");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(calendar7, (int) (short) -1);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0789");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.lang.Class<?> wildcardClass7 = date6.getClass();
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0790");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(date4, (int) (short) 0);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0791");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor2 = org.apache.commons.lang3.time.DateUtils.iterator(calendar0, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0792");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) 'a');
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
        org.junit.Assert.assertEquals(date7.toString(), "Wed Feb 01 00:00:00 MST 1978");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0793");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, (int) (short) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(date5, 1);
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
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0794");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate(obj0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0795");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addSeconds(date6, 6);
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:06 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0796");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setSeconds(date5, 0);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(date5, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0797");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (short) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addSeconds(date7, 0);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0798");
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
            System.out.format("%n%s%n", "DateUtils1.test0799");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) '4');
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
        org.junit.Assert.assertEquals(date7.toString(), "Sat Jan 01 00:00:00 MST 52");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0800");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setDays(date5, 4);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date7, (int) (short) 100);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0801");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(date0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0802");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "", "hi!" };
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.parseDate("hi!", locale1, strArray7);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0803");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setDays(date5, 4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setYears(date5, 0);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0804");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) 'a');
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(date5, (int) (short) 100);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0805");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) "", 6);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0806");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.ceiling(calendar7, (int) (short) 10);
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
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=28800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0807");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor2 = org.apache.commons.lang3.time.DateUtils.iterator(calendar0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0808");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.truncate(calendar0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0809");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 1001);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addHours(date6, (int) (byte) -1);
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
        org.junit.Assert.assertEquals(date8.toString(), "Wed Dec 31 23:16:41 MST 1969");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=22601000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=16,SECOND=41,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0810");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor2 = org.apache.commons.lang3.time.DateUtils.iterator(calendar0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0811");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<?> wildcardItor2 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on 10");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0812");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate(date0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0813");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) locale1, 6);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0814");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round(date0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0815");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.round(calendar0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0816");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addWeeks(date4, 5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addMonths(date6, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Mon Jan 05 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0817");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.truncate(date4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.round(date4, (int) '#');
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
        org.junit.Assert.assertEquals(date6.toString(), "Sat Jan 01 00:00:00 MST 1");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0818");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray5);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMonths(date7, (int) 'a');
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
        org.junit.Assert.assertEquals(date9.toString(), "Wed Feb 01 00:00:00 MST 1978");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0819");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(date0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0820");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setSeconds(date5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(date7, (int) (short) -1);
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
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0821");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date6, (int) (short) 100);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0822");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", locale1, strArray5);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addWeeks(date7, 1001);
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
        org.junit.Assert.assertEquals(date9.toString(), "Thu Mar 09 00:00:00 MST 1989");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0823");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addYears(date6, (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 MST 1980");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0824");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, (int) (short) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setHours(date5, 4);
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
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 04:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0825");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(date0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0826");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.round(calendar0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0827");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setDays(date5, 4);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMonths(date7, (int) (byte) 0);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0828");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.truncate(calendar7, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field -1 is not supported");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0829");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addDays(date4, (int) (short) 10);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addDays(date6, (int) (byte) 100);
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
        org.junit.Assert.assertEquals(date6.toString(), "Sun Jan 11 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Tue Apr 21 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0830");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(calendar7, 1001);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0831");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setYears(date4, 1);
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
        org.junit.Assert.assertEquals(date8.toString(), "Sat Jan 01 00:00:00 MST 1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=-62135744400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0832");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setSeconds(date5, 0);
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
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0833");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setHours(date6, (int) (byte) 100);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0834");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling(date0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0835");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMinutes(date5, (int) (short) 10);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setMinutes(date5, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:10:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:10:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0836");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(calendar0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0837");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (byte) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date5, (int) '4');
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0838");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setSeconds(date6, 3);
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
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:03 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0839");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor8 = org.apache.commons.lang3.time.DateUtils.iterator(date6, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 10 is not valid.");
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0840");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(calendar0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0841");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMinutes(date5, (int) (short) 10);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addSeconds(date5, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:10:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:10 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0842");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMinutes(date5, (int) (short) 10);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addWeeks(date5, 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:10:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 15 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0843");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.truncate(calendar7, (int) ' ');
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0844");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        long long6 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date4, 1);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(date4, (int) ' ');
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0845");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling(date0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0846");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setYears(date7, 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Mon Jan 01 00:00:00 MST 3");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0847");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addHours(date0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0848");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (byte) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(date7, (int) ' ');
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0849");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setYears(date6, 0);
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
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0850");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling(obj0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0851");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setHours(date0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0852");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) locale1, (int) ' ');
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0853");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(calendar7, 5);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0854");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMonths(date4, (int) (byte) -1);
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
        org.junit.Assert.assertEquals(date9.toString(), "Mon Dec 01 00:00:00 MST 1969");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0855");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling(obj0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0856");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0857");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.lang.Class<?> wildcardClass6 = date5.getClass();
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) date5, 10);
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0858");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) 10.0f, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 10.0");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0859");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<?> wildcardItor2 = org.apache.commons.lang3.time.DateUtils.iterator(obj0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0860");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setHours(date0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0861");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(calendar7, (int) 'a');
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0862");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(calendar0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0863");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addWeeks(date4, 5);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(date6, (int) (byte) -1);
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
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0864");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) "", (int) (byte) 10);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0865");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, (int) (short) 1);
        java.util.Calendar calendar8 = org.apache.commons.lang3.time.DateUtils.toCalendar(date7);
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
        org.junit.Assert.assertNotNull(calendar8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=2703600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=32,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0866");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addMinutes(date6, (int) (byte) 1);
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:01:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0867");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addDays(date4, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(date4, (int) 'a');
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
        org.junit.Assert.assertEquals(date6.toString(), "Sun Jan 11 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0868");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setSeconds(date0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0869");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 1001);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(date6, (int) '#');
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:16:41 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=26201035,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=16,SECOND=41,MILLISECOND=35,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0870");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0871");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date6, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 97 is not supported");
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0872");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setDays(date5, 4);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setHours(date7, 0);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0873");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setSeconds(date0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0874");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate(date0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0875");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor9 = org.apache.commons.lang3.time.DateUtils.iterator(calendar7, (int) (short) 10);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0876");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addYears(date6, 1001);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
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
        org.junit.Assert.assertEquals(date8.toString(), "Tue Jan 01 00:00:00 MST 2971");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0877");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(date6, (int) (byte) 10);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0878");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addDays(date6, 3);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0879");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (byte) 100);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Fri Jan 01 00:00:00 MST 1971");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0880");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) date7, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 97 is not supported");
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0881");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round(obj0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0882");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.ceiling(date4, (int) '#');
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
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0883");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 10");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0884");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addWeeks(date0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0885");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setDays(date5, 4);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setSeconds(date5, (int) '4');
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
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:52 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0886");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) '4');
        long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(date5, 5);
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0887");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        // The following exception was thrown during execution in test generation
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0888");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 1001);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(date4, 1001);
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
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:16:41 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0889");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.round(calendar0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0890");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(date7, (int) (byte) -1);
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
        org.junit.Assert.assertEquals(date7.toString(), "Fri Jan 01 00:00:00 MST 1971");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0891");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(calendar7, (int) (short) -1);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0892");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addDays(date4, (int) (short) 10);
        java.lang.Class<?> wildcardClass7 = date4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Sun Jan 11 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0893");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate(obj0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0894");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(date0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0895");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", locale1, strArray5);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addSeconds(date7, (-1));
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
        org.junit.Assert.assertEquals(date9.toString(), "Wed Dec 31 23:59:59 MST 1969");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0896");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(calendar7, 5);
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
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0897");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.truncate(calendar0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0898");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setDays(date5, 4);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addWeeks(date5, (int) (byte) 10);
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
        org.junit.Assert.assertEquals(date9.toString(), "Thu Mar 12 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0899");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(date7, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 100 is not supported");
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0900");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setDays(date5, 4);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date7, (int) (byte) 100);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0901");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setDays(date5, 4);
        long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(date5, 1);
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 24L + "'", long9 == 24L);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0902");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<?> wildcardItor2 = org.apache.commons.lang3.time.DateUtils.iterator(obj0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0903");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling(obj0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0904");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(date0, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0905");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setMonths(date6, 100);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0906");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setSeconds(date6, (int) (short) 0);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0907");
        java.util.Date date0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addDays(date5, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.apache.commons.lang3.time.DateUtils.truncatedEquals(date0, date7, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
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
        org.junit.Assert.assertEquals(date7.toString(), "Sun Jan 11 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0908");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray7);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0909");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 100);
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:01:40 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0910");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray6);
        java.lang.Class<?> wildcardClass9 = strArray6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0911");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setSeconds(date5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(date5, (int) (byte) -1);
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
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0912");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(calendar0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0913");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.apache.commons.lang3.time.DateUtils.truncatedEquals(date4, date7, (int) (byte) -1);
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
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0914");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.truncate(date4, (int) (short) -1);
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
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0915");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) strArray5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not find ceiling of for type: class [Ljava.lang.String;");
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0916");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(calendar0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0917");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 1001);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.truncate(date4, (-1));
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
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:16:41 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0918");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMinutes(date5, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setHours(date7, (int) (short) -1);
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
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:10:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0919");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round(date0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0920");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) 'a');
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
        org.junit.Assert.assertEquals(date7.toString(), "Wed Feb 01 00:00:00 MST 1978");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 31 23:59:59 MST 1978");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0921");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(date6, (int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = date6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1440L + "'", long8 == 1440L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0922");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setMonths(date0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0923");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor9 = org.apache.commons.lang3.time.DateUtils.iterator(date7, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 100 is not valid.");
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0924");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addMinutes(date4, (int) (byte) 10);
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:10:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=25800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=10,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0925");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.ceiling(calendar7, (int) (byte) -1);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0926");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addDays(date0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0927");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.ceiling(calendar7, (-1));
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0928");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, (int) (short) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) (short) 1);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0929");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.truncate(date7, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 100 is not supported");
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0930");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addMinutes(date6, 0);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0931");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray4);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addYears(date6, (int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = date6.getClass();
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0932");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(calendar7, 10);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0933");
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
            System.out.format("%n%s%n", "DateUtils1.test0934");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling(obj0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0935");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(date6, (int) (byte) 10);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0936");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setYears(date6, 1001);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
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
        org.junit.Assert.assertEquals(date8.toString(), "Wed Jan 01 00:00:00 MST 1001");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0937");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setDays(date7, 2);
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
        org.junit.Assert.assertEquals(date9.toString(), "Fri Jan 02 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0938");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addWeeks(date4, 5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<?> wildcardItor8 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) date4, 10);
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
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0939");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (short) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.truncate(date5, 0);
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
        org.junit.Assert.assertEquals(date9.toString(), "Sat Jan 01 00:00:00 MST 1");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0940");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setSeconds(date5, 0);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addDays(date7, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Mon Feb 02 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0941");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not find ceiling of for type: class java.lang.Short");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0942");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not find ceiling of for type: class java.lang.Integer");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0943");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setMinutes(date4, 6);
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:06:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0944");
        java.util.Date date0 = null;
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addMonths(date6, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.apache.commons.lang3.time.DateUtils.isSameDay(date0, date6);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Wed Feb 01 00:00:00 MST 1978");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0945");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling(date0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0946");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addHours(date0, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0947");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) strArray5, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not find ceiling of for type: class [Ljava.lang.String;");
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0948");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.round(calendar0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0949");
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
            System.out.format("%n%s%n", "DateUtils1.test0950");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.truncate(calendar7, 1001);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0951");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray5);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addHours(date7, 6);
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
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 06:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0952");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not find ceiling of for type: class java.lang.Byte");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0953");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0954");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate(obj0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0955");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(date0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0956");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.ceiling(date6, (int) (short) 10);
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 01:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0957");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setSeconds(date5, 0);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.ceiling(date7, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 01:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0958");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(calendar7, 4);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0959");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(calendar0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0960");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.truncate(date7, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 35 is not supported");
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
        org.junit.Assert.assertEquals(date7.toString(), "Wed Feb 01 00:00:00 MST 1978");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0961");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.truncate(date4, 5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.round(date4, 3);
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
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0962");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.round(calendar7, (int) '#');
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0963");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addWeeks(date4, 5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addMonths(date6, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Wed Jun 05 00:00:00 MDT 1974");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0964");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addHours(date7, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Mon Jan 05 01:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0965");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.truncate(date4, 10);
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
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0966");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.truncate(date4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(date6, (int) (short) -1);
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
        org.junit.Assert.assertEquals(date6.toString(), "Sat Jan 01 00:00:00 MST 1");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0967");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.round(calendar7, 2);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0968");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("hi!", strArray5);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0969");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addWeeks(date4, 5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setSeconds(date4, 3);
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
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:03 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0970");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate(obj0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0971");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setDays(date5, 4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date7, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MILLISECOND");
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0972");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addYears(date0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0973");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setDays(date5, 4);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setSeconds(date5, (int) (short) 0);
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
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0974");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.round(calendar0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0975");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(calendar0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0976");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) date4, 0);
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
        org.junit.Assert.assertEquals(date8.toString(), "Sat Jan 01 00:00:00 MST 1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0977");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0978");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray4);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(date6, (int) (byte) 0);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0979");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMinutes(date5, (int) (short) 10);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setYears(date7, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:10:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Sat Jan 01 00:10:00 MST 1");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0980");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(date0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0981");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray5);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(date7, (int) (byte) 100);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0982");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date6, (int) (short) -1);
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
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0983");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0984");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(date6, (int) (byte) 100);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0985");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(date0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0986");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setSeconds(date0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0987");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray4);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addYears(date6, (int) (byte) -1);
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
        org.junit.Assert.assertEquals(date8.toString(), "Wed Jan 01 00:00:00 MST 1969");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0988");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addSeconds(date6, 2);
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:02 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0989");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<?> wildcardItor9 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) calendar7, 0);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0990");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", locale2, strArray6);
        // The following exception was thrown during execution in test generation
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0991");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not find ceiling of for type: class java.lang.Short");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0992");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0993");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", locale1, strArray5);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(date7, 0);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0994");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 1001);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setMinutes(date4, (int) (short) 10);
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
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:16:41 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:10:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0995");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.truncate(date7, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 100 is not supported");
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0996");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(calendar0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0997");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<?> wildcardItor7 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) "", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on ");
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0998");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addHours(date6, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Fri Jan 02 11:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test0999");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate(obj0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.test1000");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) "", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not find ceiling of for type: class java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }
}

