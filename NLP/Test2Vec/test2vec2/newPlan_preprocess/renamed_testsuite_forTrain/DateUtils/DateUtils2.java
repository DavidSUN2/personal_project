
package DateUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DateUtils2 {

    public static boolean debug = false;

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1001");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMinutes(date5, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.round(date7, 6);
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
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:10:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1002");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "", "", "hi!" };
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", locale1, strArray7);
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
            System.out.format("%n%s%n", "DateUtils2.test1003");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(date7, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 35 is not supported");
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
            System.out.format("%n%s%n", "DateUtils2.test1004");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setHours(date0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1005");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in test generation
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1006");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addWeeks(date4, 5);
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
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1007");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addSeconds(date0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1008");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.toCalendar(date8);
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
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1009");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor9 = org.apache.commons.lang3.time.DateUtils.iterator(calendar7, (int) (short) 0);
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
            System.out.format("%n%s%n", "DateUtils2.test1010");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.ceiling(calendar0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1011");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) date7, 10);
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
            System.out.format("%n%s%n", "DateUtils2.test1012");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.setHours(date4, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(date6, 0);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1013");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMinutes(date5, (int) (short) 10);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addDays(date7, (int) (byte) -1);
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
        org.junit.Assert.assertEquals(date9.toString(), "Wed Dec 31 00:10:00 MST 1969");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1014");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(date6, (int) (short) 0);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1015");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date4, 2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setHours(date4, (int) 'a');
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
            System.out.format("%n%s%n", "DateUtils2.test1016");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(date0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1017");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.lang.Class<?> wildcardClass7 = date6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<?> wildcardItor9 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) wildcardClass7, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on class java.util.Date");
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
            System.out.format("%n%s%n", "DateUtils2.test1018");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling(obj0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1019");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setMonths(date0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1020");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray6);
        java.lang.Class<?> wildcardClass8 = date7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
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
            System.out.format("%n%s%n", "DateUtils2.test1021");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addSeconds(date0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1022");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) 'a');
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
        org.junit.Assert.assertEquals(date7.toString(), "Wed Feb 01 00:00:00 MST 1978");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Wed Feb 01 00:00:05 MST 1978");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1023");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date6, (int) (byte) 0);
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
            System.out.format("%n%s%n", "DateUtils2.test1024");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(date0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1025");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.truncate(date4, (int) (short) 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addWeeks(date4, (int) (byte) 0);
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
        org.junit.Assert.assertEquals(date6.toString(), "Sat Jan 01 00:00:00 MST 1");
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
            System.out.format("%n%s%n", "DateUtils2.test1026");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.truncate(date4, (int) (short) 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) date6, (int) (short) 0);
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
        org.junit.Assert.assertEquals(date8.toString(), "Sat Jan 01 00:00:00 MST 1");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1027");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) 'a');
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date7, (int) '4');
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
            System.out.format("%n%s%n", "DateUtils2.test1028");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) date4, 3);
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
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1029");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling(obj0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1030");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor2 = org.apache.commons.lang3.time.DateUtils.iterator(calendar0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1031");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor9 = org.apache.commons.lang3.time.DateUtils.iterator(date5, 10);
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
        org.junit.Assert.assertEquals(date7.toString(), "Fri Dec 01 00:00:00 MST 1972");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1032");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate(obj0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1033");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(date6, 5);
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
            System.out.format("%n%s%n", "DateUtils2.test1034");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.ceiling(calendar0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1035");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("hi!", strArray4);
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unable to parse the date: hi!");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1036");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling(date0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1037");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) date5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<?> wildcardItor9 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) date7, 10);
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
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1038");
        java.util.Date date0 = null;
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setDays(date6, 4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.apache.commons.lang3.time.DateUtils.isSameInstant(date0, date6);
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
        org.junit.Assert.assertEquals(date8.toString(), "Sun Jan 04 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1039");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(calendar0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1040");
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
            System.out.format("%n%s%n", "DateUtils2.test1041");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in test generation
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1042");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(calendar7, (int) (short) -1);
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
            System.out.format("%n%s%n", "DateUtils2.test1043");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(calendar7, 2);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1044");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMinutes(date5, (int) (short) 10);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setDays(date7, 5);
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
        org.junit.Assert.assertEquals(date9.toString(), "Mon Jan 05 00:10:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1045");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(date0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1046");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round(date0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1047");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray5);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setYears(date7, (int) (byte) 100);
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
        org.junit.Assert.assertEquals(date9.toString(), "Wed Jan 01 00:00:00 MST 100");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1048");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(date0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1049");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 1001);
        java.lang.Class<?> wildcardClass7 = date6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) wildcardClass7, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate class java.util.Date");
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
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:16:41 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1050");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(calendar0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1051");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, (int) (short) 1);
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
        org.junit.Assert.assertEquals(date7.toString(), "Sun Feb 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1052");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date4, 2);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date6, (int) (short) 10);
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
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1053");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMonths(date7, (int) '4');
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
        org.junit.Assert.assertEquals(date9.toString(), "Wed May 01 00:00:00 MDT 1974");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1054");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(calendar0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1055");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) date7, (int) (byte) 100);
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
            System.out.format("%n%s%n", "DateUtils2.test1056");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(date4, (int) '#');
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
            System.out.format("%n%s%n", "DateUtils2.test1057");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(calendar7, (int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 24L + "'", long9 == 24L);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1058");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.truncate(date4, 5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setMonths(date4, 0);
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
            System.out.format("%n%s%n", "DateUtils2.test1059");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addSeconds(date0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1060");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setYears(date4, 1);
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
            System.out.format("%n%s%n", "DateUtils2.test1061");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round -1");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1062");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("hi!", strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1063");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) 'a');
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addHours(date5, (int) ' ');
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
        org.junit.Assert.assertEquals(date9.toString(), "Fri Jan 02 08:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1064");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addDays(date0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1065");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addDays(date6, (int) (byte) 100);
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
        org.junit.Assert.assertEquals(date8.toString(), "Sat Apr 11 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1066");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.truncate(date4, (int) (short) 0);
        long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(date4, 2);
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 24L + "'", long8 == 24L);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1067");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMinutes(date5, (int) (short) 10);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setMinutes(date5, 0);
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
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1068");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray5);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMonths(date7, (int) '#');
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
        org.junit.Assert.assertEquals(date9.toString(), "Fri Dec 01 00:00:00 MST 1972");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1069");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray4);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.ceiling(date6, 5);
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
        org.junit.Assert.assertEquals(date8.toString(), "Fri Jan 02 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1070");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMinutes(date5, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setYears(date7, (int) (short) -1);
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
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:10:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1071");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMinutes(date5, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor9 = org.apache.commons.lang3.time.DateUtils.iterator(date7, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style -1 is not valid.");
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
            System.out.format("%n%s%n", "DateUtils2.test1072");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.truncate(date4, (int) (short) 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(date6, 5);
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
        org.junit.Assert.assertEquals(date8.toString(), "Sat Jan 01 00:00:00 MST 1");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1073");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.setDays(date4, 1001);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1074");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addDays(date4, (int) (short) 10);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setSeconds(date6, (int) '#');
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
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=889200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=3,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=11,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Sun Jan 11 00:00:35 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1075");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setSeconds(date5, 0);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMonths(date7, (int) (byte) 10);
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
        org.junit.Assert.assertEquals(date9.toString(), "Sun Nov 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1076");
        java.util.Locale locale1 = null;
        java.util.Locale locale3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale3, strArray6);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", locale1, strArray6);
        java.lang.Class<?> wildcardClass9 = date8.getClass();
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
            System.out.format("%n%s%n", "DateUtils2.test1077");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 1001);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setMinutes(date4, (int) (short) 10);
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:10:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=25800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=10,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1078");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(calendar7, 10);
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
            System.out.format("%n%s%n", "DateUtils2.test1079");
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
            System.out.format("%n%s%n", "DateUtils2.test1080");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setSeconds(date5, 0);
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
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1081");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(calendar0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1082");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addHours(date0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1083");
        java.util.Date date0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.apache.commons.lang3.time.DateUtils.isSameInstant(date0, date5);
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
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1084");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) '4');
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMonths(date7, (int) (byte) 100);
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
        org.junit.Assert.assertEquals(date9.toString(), "Thu May 01 00:00:00 MST 60");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1085");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", locale1, strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) locale1, 1001);
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
            System.out.format("%n%s%n", "DateUtils2.test1086");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 1001);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setMonths(date6, (int) (byte) 10);
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
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:16:41 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Sun Nov 01 00:16:41 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1087");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setMonths(date6, (int) (byte) 0);
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
            System.out.format("%n%s%n", "DateUtils2.test1088");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.ceiling(date4, 1001);
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
        org.junit.Assert.assertEquals(date8.toString(), "Fri Jan 16 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1089");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) true, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not find ceiling of for type: class java.lang.Boolean");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1090");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addDays(date4, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setMonths(date6, (-1));
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
        org.junit.Assert.assertEquals(date6.toString(), "Sun Jan 11 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1091");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(calendar0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1092");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(date7, (int) ' ');
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
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sat Jan 01 00:00:00 MST 52");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1093");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.truncate(date4, 5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addYears(date6, (int) (byte) 100);
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
        org.junit.Assert.assertEquals(date8.toString(), "Wed Jan 01 00:00:00 MST 2070");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1094");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addYears(date4, 0);
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
            System.out.format("%n%s%n", "DateUtils2.test1095");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(date0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1096");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addYears(date6, (-1));
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
        org.junit.Assert.assertEquals(date9.toString(), "Wed Jan 01 00:00:00 MST 1969");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1097");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(date0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1098");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.truncate(date6, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 4 is not supported");
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
            System.out.format("%n%s%n", "DateUtils2.test1099");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (byte) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) date7, 2);
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
            System.out.format("%n%s%n", "DateUtils2.test1100");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setMinutes(date0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1101");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 100);
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:01:40 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=25300000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=1,SECOND=40,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1102");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
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
            System.out.format("%n%s%n", "DateUtils2.test1103");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) "", 4);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1104");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) 'a');
        long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(date5, (int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 24L + "'", long9 == 24L);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1105");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setMonths(date0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1106");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setDays(date5, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH");
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
            System.out.format("%n%s%n", "DateUtils2.test1107");
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
            System.out.format("%n%s%n", "DateUtils2.test1108");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Iterator<java.util.Calendar> calendarItor8 = org.apache.commons.lang3.time.DateUtils.iterator(date4, (int) (short) 1);
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
        org.junit.Assert.assertNotNull(calendarItor8);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1109");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (short) 1);
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
        org.junit.Assert.assertEquals(date7.toString(), "Fri Jan 01 00:00:00 MST 1971");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1110");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.ceiling(calendar7, (int) (short) 0);
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
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1111");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.round(calendar0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1112");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.truncate(date4, (int) (short) 0);
        long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(date4, 2);
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
        org.junit.Assert.assertEquals(date6.toString(), "Sat Jan 01 00:00:00 MST 1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1113");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(date0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1114");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) date7, 0);
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
            System.out.format("%n%s%n", "DateUtils2.test1115");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.round(calendar0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1116");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.truncate(date4, (int) (short) 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addMinutes(date4, (int) (byte) 10);
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
        org.junit.Assert.assertEquals(date6.toString(), "Sat Jan 01 00:00:00 MST 1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:10:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1117");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(date0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1118");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 1001);
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
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:16:41 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1119");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(date6, (int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 86400L + "'", long8 == 86400L);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1120");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) '4');
        long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date5, 1);
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 86400000L + "'", long9 == 86400000L);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1121");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setMonths(date4, (int) (short) 1);
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
        org.junit.Assert.assertEquals(date8.toString(), "Sun Feb 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1122");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<?> wildcardItor2 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) ' ', 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on  ");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1123");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) date5, 3);
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
        org.junit.Assert.assertEquals(date7.toString(), "Fri Dec 01 00:00:00 MST 1972");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1124");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<?> wildcardItor2 = org.apache.commons.lang3.time.DateUtils.iterator(obj0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1125");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(date0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1126");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addWeeks(date4, 5);
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
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1127");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor2 = org.apache.commons.lang3.time.DateUtils.iterator(calendar0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1128");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.truncate(date4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date6, 10);
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
        org.junit.Assert.assertEquals(date6.toString(), "Sat Jan 01 00:00:00 MST 1");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1129");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", locale1, strArray5);
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
            System.out.format("%n%s%n", "DateUtils2.test1130");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.ceiling(date6, (int) (short) 10);
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 01:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1131");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in test generation
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1132");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Calendar calendar5 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Iterator<java.util.Calendar> calendarItor7 = org.apache.commons.lang3.time.DateUtils.iterator(calendar5, 6);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(calendar5, 10);
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
        org.junit.Assert.assertNotNull(calendar5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendarItor7);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1133");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<?> wildcardItor7 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) date5, 100);
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
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1134");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(date0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1135");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(calendar0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1136");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1137");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 100");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1138");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(calendar0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1139");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMinutes(date5, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setDays(date5, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH");
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
            System.out.format("%n%s%n", "DateUtils2.test1140");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray4);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) strArray4, (int) (byte) 0);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1141");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addDays(date4, (int) (short) 10);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(date6, (int) (short) 0);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=889200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=3,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=11,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1142");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<?> wildcardItor2 = org.apache.commons.lang3.time.DateUtils.iterator(obj0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1143");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (byte) 1);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1144");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Calendar calendar5 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Iterator<java.util.Calendar> calendarItor7 = org.apache.commons.lang3.time.DateUtils.iterator(calendar5, 6);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(calendar5, 10);
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
        org.junit.Assert.assertNotNull(calendar5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendarItor7);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1145");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", locale2, strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("hi!", strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
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
            System.out.format("%n%s%n", "DateUtils2.test1146");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setSeconds(date5, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.ceiling(date7, (-1));
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
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1147");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addDays(date4, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) date4, (int) '4');
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
        org.junit.Assert.assertEquals(date6.toString(), "Sun Jan 11 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1148");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addHours(date6, (int) (short) 100);
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
            System.out.format("%n%s%n", "DateUtils2.test1149");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor6 = org.apache.commons.lang3.time.DateUtils.iterator(date4, (int) (byte) 100);
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
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1150");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addDays(date4, (int) (short) 10);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in test generation
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
        org.junit.Assert.assertEquals(date6.toString(), "Sun Jan 11 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=889200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=3,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=11,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1151");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setDays(date6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH");
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
            System.out.format("%n%s%n", "DateUtils2.test1152");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addDays(date4, (int) (short) 10);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setSeconds(date4, (int) '#');
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:35 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1153");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addSeconds(date0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1154");
        java.util.Locale locale1 = null;
        java.util.Locale locale3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", locale3, strArray6);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray6);
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
            System.out.format("%n%s%n", "DateUtils2.test1155");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<?> wildcardItor9 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) calendar7, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 35 is not valid.");
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
            System.out.format("%n%s%n", "DateUtils2.test1156");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) '4');
        java.util.Calendar calendar8 = org.apache.commons.lang3.time.DateUtils.toCalendar(date5);
        java.lang.Class<?> wildcardClass9 = date5.getClass();
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
            System.out.format("%n%s%n", "DateUtils2.test1157");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) (-1L), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate -1");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1158");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setHours(date0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1159");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling(date0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1160");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(date4, 1);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1161");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date6, 0);
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
            System.out.format("%n%s%n", "DateUtils2.test1162");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
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
            System.out.format("%n%s%n", "DateUtils2.test1163");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (short) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMonths(date7, 4);
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
        org.junit.Assert.assertEquals(date9.toString(), "Sat May 01 00:00:00 MDT 1971");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1164");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addWeeks(date0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1165");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setMinutes(date6, (int) (byte) 10);
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:10:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1166");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.setHours(date4, 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addYears(date4, (int) (short) 0);
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
            System.out.format("%n%s%n", "DateUtils2.test1167");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate(date0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1168");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addMinutes(date0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1169");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addDays(date4, (int) (short) 10);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        java.util.Calendar calendar8 = null;
        // The following exception was thrown during execution in test generation
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
        org.junit.Assert.assertEquals(date6.toString(), "Sun Jan 11 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=889200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=3,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=11,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1170");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMinutes(date5, (int) (short) 10);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addHours(date5, (-1));
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
        org.junit.Assert.assertEquals(date9.toString(), "Wed Dec 31 23:00:00 MST 1969");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1171");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(date4, (int) 'a');
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
            System.out.format("%n%s%n", "DateUtils2.test1172");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1173");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 1001);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) date4, 0);
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
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:16:41 MST 1970");
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
            System.out.format("%n%s%n", "DateUtils2.test1174");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) 10.0d, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round 10.0");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1175");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addDays(date4, (int) (short) 10);
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
        org.junit.Assert.assertEquals(date6.toString(), "Sun Jan 11 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=889200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=3,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=11,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1176");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (short) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addDays(date5, 10);
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
        org.junit.Assert.assertEquals(date9.toString(), "Sun Jan 11 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1177");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", locale2, strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("hi!", strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
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
            System.out.format("%n%s%n", "DateUtils2.test1178");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        long long6 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date4, 1);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addWeeks(date4, (int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = date4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1179");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addYears(date6, 100);
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
        org.junit.Assert.assertEquals(date8.toString(), "Wed Jan 01 00:00:00 MST 2070");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=3155785200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2070,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1180");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMinutes(date5, (int) (short) 10);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMinutes(date7, (int) 'a');
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
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 01:47:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1181");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(calendar7, 2);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1182");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addDays(date6, 3);
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
        org.junit.Assert.assertEquals(date8.toString(), "Sun Jan 04 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1183");
        java.util.Locale locale3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", locale3, strArray6);
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
            System.out.format("%n%s%n", "DateUtils2.test1184");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<?> wildcardItor9 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) date6, 0);
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
            System.out.format("%n%s%n", "DateUtils2.test1185");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(calendar7, (int) 'a');
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1186");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addDays(date4, (int) (short) 10);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(date6, 10);
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
        org.junit.Assert.assertEquals(date6.toString(), "Sun Jan 11 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=889200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=3,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=11,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1187");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Calendar calendar5 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Iterator<java.util.Calendar> calendarItor7 = org.apache.commons.lang3.time.DateUtils.iterator(calendar5, 6);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(calendar5, 100);
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
        org.junit.Assert.assertNotNull(calendar5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendarItor7);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1188");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addWeeks(date6, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 08 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1189");
        java.util.Locale locale1 = null;
        java.util.Locale locale3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale3, strArray6);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray6);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.toCalendar(date8);
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
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1190");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<?> wildcardItor2 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on 100");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1191");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Calendar calendar5 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Iterator<java.util.Calendar> calendarItor7 = org.apache.commons.lang3.time.DateUtils.iterator(calendar5, 6);
        long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(calendar5, 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendarItor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1192");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(date5, (int) 'a');
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
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Sun Feb 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1193");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.setHours(date4, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setSeconds(date6, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SECOND");
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
            System.out.format("%n%s%n", "DateUtils2.test1194");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setHours(date5, (-1));
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1195");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling(date0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1196");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setMonths(date6, (-1));
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1197");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (short) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addDays(date5, (int) (byte) 10);
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
        org.junit.Assert.assertEquals(date9.toString(), "Sun Jan 11 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1198");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMinutes(date5, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setDays(date7, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH");
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
            System.out.format("%n%s%n", "DateUtils2.test1199");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) date5, (int) (short) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addYears(date5, (int) (short) -1);
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
        org.junit.Assert.assertEquals(date9.toString(), "Wed Jan 01 00:00:00 MST 1969");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1200");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round(obj0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1201");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.truncate(calendar0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1202");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addSeconds(date6, 6);
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:06 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1203");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, (int) (short) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(date7, (int) (byte) 1);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1204");
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
            System.out.format("%n%s%n", "DateUtils2.test1205");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) true, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not find ceiling of for type: class java.lang.Boolean");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1206");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) '4');
        java.util.Iterator<java.util.Calendar> calendarItor9 = org.apache.commons.lang3.time.DateUtils.iterator(date5, 2);
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
        org.junit.Assert.assertNotNull(calendarItor9);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1207");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", locale1, strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor9 = org.apache.commons.lang3.time.DateUtils.iterator(date7, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style -1 is not valid.");
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
            System.out.format("%n%s%n", "DateUtils2.test1208");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date4, 2);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(date4, 0);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1209");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1210");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.setHours(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.ceiling(date4, 1001);
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
        org.junit.Assert.assertEquals(date9.toString(), "Fri Jan 16 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1211");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(date7, (int) (byte) -1);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1212");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.lang.Class<?> wildcardClass8 = calendar7.getClass();
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
            System.out.format("%n%s%n", "DateUtils2.test1213");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 1001);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(date6, (int) (short) 10);
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
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:16:41 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1214");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (short) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setHours(date5, 0);
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
            System.out.format("%n%s%n", "DateUtils2.test1215");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(date6, (int) (short) 100);
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
            System.out.format("%n%s%n", "DateUtils2.test1216");
        java.util.Locale locale3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", locale3, strArray6);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray6);
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
            System.out.format("%n%s%n", "DateUtils2.test1217");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addMonths(date0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1218");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Calendar calendar5 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Iterator<java.util.Calendar> calendarItor7 = org.apache.commons.lang3.time.DateUtils.iterator(calendar5, 6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor9 = org.apache.commons.lang3.time.DateUtils.iterator(calendar5, 0);
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
        org.junit.Assert.assertNotNull(calendar5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendarItor7);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1219");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(calendar0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1220");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray4);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addYears(date6, (int) (byte) -1);
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
        org.junit.Assert.assertEquals(date8.toString(), "Wed Jan 01 00:00:00 MST 1969");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=-31510800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1221");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) calendar7, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 4 is not supported");
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
            System.out.format("%n%s%n", "DateUtils2.test1222");
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
            System.out.format("%n%s%n", "DateUtils2.test1223");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date4, 2);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setYears(date6, (int) ' ');
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
        org.junit.Assert.assertEquals(date8.toString(), "Tue Jan 01 00:00:00 MST 32");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1224");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addDays(date4, (int) (short) 10);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in test generation
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
        org.junit.Assert.assertEquals(date6.toString(), "Sun Jan 11 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=889200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=3,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=11,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1225");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate(date0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1226");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(date5, (int) (short) 100);
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
        org.junit.Assert.assertEquals(date7.toString(), "Fri Dec 01 00:00:00 MST 1972");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1227");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.ceiling(calendar7, 2);
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
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=1,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1228");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setDays(date6, 4);
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
        org.junit.Assert.assertEquals(date9.toString(), "Sun Jan 04 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1229");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setHours(date0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1230");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(calendar0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1231");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) 0.0f, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round 0.0");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1232");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) '#');
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMinutes(date7, (int) (byte) 1);
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
        org.junit.Assert.assertEquals(date9.toString(), "Fri Dec 01 00:01:00 MST 1972");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1233");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMonths(date4, 2);
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
        org.junit.Assert.assertEquals(date9.toString(), "Sun Mar 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1234");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.truncate(date4, (int) (short) 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addWeeks(date4, (int) (byte) 0);
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
        org.junit.Assert.assertEquals(date6.toString(), "Sat Jan 01 00:00:00 MST 1");
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
            System.out.format("%n%s%n", "DateUtils2.test1235");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setSeconds(date5, 0);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addSeconds(date7, (int) (byte) 0);
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
            System.out.format("%n%s%n", "DateUtils2.test1236");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addHours(date6, 10);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1237");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) "", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round ");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1238");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.ceiling(calendar0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1239");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray5);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addDays(date7, (int) 'a');
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
        org.junit.Assert.assertEquals(date9.toString(), "Wed Apr 08 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1240");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate -1");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1241");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) date7, (int) ' ');
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
        org.junit.Assert.assertEquals(date7.toString(), "Sat Jan 01 00:00:00 MST 52");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1242");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
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
            System.out.format("%n%s%n", "DateUtils2.test1243");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray4);
        long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(date6, 6);
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1244");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addDays(date4, (int) (short) 10);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(calendar7, 1);
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
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=889200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=3,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=11,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 950400L + "'", long9 == 950400L);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1245");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(calendar7, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 1001 is not supported");
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
            System.out.format("%n%s%n", "DateUtils2.test1246");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.truncate(date4, 5);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(date4, (int) '4');
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
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1247");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Calendar calendar5 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Iterator<java.util.Calendar> calendarItor7 = org.apache.commons.lang3.time.DateUtils.iterator(calendar5, 6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.round(calendar5, (-1));
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
        org.junit.Assert.assertNotNull(calendar5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendarItor7);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1248");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addSeconds(date0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1249");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round(date0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1250");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        long long6 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date4, 1);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setSeconds(date4, (int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = date4.getClass();
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:01 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1251");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) '4');
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMinutes(date7, 4);
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
        org.junit.Assert.assertEquals(date9.toString(), "Sat Jan 01 00:04:00 MST 52");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1252");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 1001);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addMinutes(date4, (int) (short) 1);
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:01:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1253");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addDays(date4, (int) (short) 10);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setYears(date6, 2);
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
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=889200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=3,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=11,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Wed Jan 11 00:00:00 MST 2");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1254");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round(obj0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1255");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(calendar0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1256");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (short) 1);
        long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(date7, 1);
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1440L + "'", long9 == 1440L);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1257");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1258");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(date4, (int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1259");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addSeconds(date0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1260");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(calendar7, 6);
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
            System.out.format("%n%s%n", "DateUtils2.test1261");
        java.util.Locale locale3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", locale3, strArray6);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.parseDate("hi!", strArray6);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1262");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addDays(date4, (int) (short) 10);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.round(date4, 2);
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1263");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addDays(date0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1264");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addMonths(date6, (int) (byte) 0);
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1265");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.setHours(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(calendar7, (int) (short) 100);
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
            System.out.format("%n%s%n", "DateUtils2.test1266");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(calendar7, 3);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1267");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setDays(date0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1268");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) date5, (int) (short) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addWeeks(date5, (int) (short) -1);
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
        org.junit.Assert.assertEquals(date9.toString(), "Thu Dec 25 00:00:00 MST 1969");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1269");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) 10.0d, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round 10.0");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1270");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(calendar0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1271");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1272");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 1001);
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
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:16:41 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1273");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.truncate(date4, 5);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1274");
        java.util.Locale locale1 = null;
        java.util.Locale locale3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", locale3, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("hi!", locale1, strArray6);
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
            System.out.format("%n%s%n", "DateUtils2.test1275");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        java.util.Calendar calendar8 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        java.lang.Class<?> wildcardClass9 = calendar8.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1276");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.round(calendar0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1277");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", locale2, strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray5);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setSeconds(date7, 4);
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
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:04 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1278");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) (byte) 10, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not find ceiling of for type: class java.lang.Byte");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1279");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(date5, 3);
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
        org.junit.Assert.assertEquals(date7.toString(), "Sat Jan 01 00:00:00 MST 52");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1280");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling(date0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1281");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addYears(date7, 0);
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
            System.out.format("%n%s%n", "DateUtils2.test1282");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addWeeks(date4, 5);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(date6, 0);
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
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1283");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (short) 1);
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
        org.junit.Assert.assertEquals(date7.toString(), "Fri Jan 01 00:00:00 MST 1971");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Fri Jan 01 00:00:05 MST 1971");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1284");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor9 = org.apache.commons.lang3.time.DateUtils.iterator(date4, 10);
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
            System.out.format("%n%s%n", "DateUtils2.test1285");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Calendar calendar5 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.round(calendar5, (int) (byte) -1);
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
        org.junit.Assert.assertNotNull(calendar5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1286");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(calendar7, 10);
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
            System.out.format("%n%s%n", "DateUtils2.test1287");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        long long6 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date4, 1);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addYears(date4, (int) (short) 100);
        java.lang.Class<?> wildcardClass9 = date4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1288");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray2 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = org.apache.commons.lang3.time.DateUtils.parseDate("hi!", locale1, strArray2);
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
            System.out.format("%n%s%n", "DateUtils2.test1289");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.setHours(date4, 5);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date4, 100);
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
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 05:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1290");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate(obj0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1291");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor9 = org.apache.commons.lang3.time.DateUtils.iterator(date7, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 0 is not valid.");
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
            System.out.format("%n%s%n", "DateUtils2.test1292");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Calendar calendar5 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Iterator<java.util.Calendar> calendarItor7 = org.apache.commons.lang3.time.DateUtils.iterator(calendar5, 6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor9 = org.apache.commons.lang3.time.DateUtils.iterator(calendar5, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 52 is not valid.");
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
        org.junit.Assert.assertNotNull(calendar5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendarItor7);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1293");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date7, 0);
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
            System.out.format("%n%s%n", "DateUtils2.test1294");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.ceiling(date7, 100);
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
        org.junit.Assert.assertEquals(date7.toString(), "Fri Dec 01 00:00:00 MST 1972");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1295");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date4, 2);
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.apache.commons.lang3.time.DateUtils.truncatedEquals(date6, date7, (int) 'a');
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
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1296");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setMonths(date0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1297");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        long long6 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date4, 1);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 2);
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:02 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1298");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setSeconds(date0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1299");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (short) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) (short) 100);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1300");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addDays(date0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1301");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setMonths(date6, 6);
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
        org.junit.Assert.assertEquals(date8.toString(), "Wed Jul 01 00:00:00 MDT 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1302");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(date4, 0);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1303");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addDays(date4, (int) (short) 10);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        java.lang.Class<?> wildcardClass8 = calendar7.getClass();
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
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=889200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=3,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=11,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1304");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) calendar7, (int) (short) 10);
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
            System.out.format("%n%s%n", "DateUtils2.test1305");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", locale1, strArray5);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMonths(date7, (int) (short) 1);
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
        org.junit.Assert.assertEquals(date9.toString(), "Sun Feb 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1306");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(date0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1307");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray5);
        long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(date7, 6);
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1308");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setSeconds(date0, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1309");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.round(calendar7, (int) (byte) 10);
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
            System.out.format("%n%s%n", "DateUtils2.test1310");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.truncate(date4, 5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) date6, 0);
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
            System.out.format("%n%s%n", "DateUtils2.test1311");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) date6, (int) (byte) 10);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.toCalendar(date8);
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
            System.out.format("%n%s%n", "DateUtils2.test1312");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(date6, (int) (short) 0);
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
            System.out.format("%n%s%n", "DateUtils2.test1313");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<?> wildcardItor8 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) date6, (int) (short) 0);
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
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1314");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(date0, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1315");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 1001);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setHours(date4, (int) (byte) 100);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1316");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.round(date6, (int) (short) 100);
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
            System.out.format("%n%s%n", "DateUtils2.test1317");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.truncate(calendar0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1318");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date7, 3);
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
            System.out.format("%n%s%n", "DateUtils2.test1319");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addWeeks(date4, 5);
        // The following exception was thrown during execution in test generation
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
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1320");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, (int) (short) 1);
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
        org.junit.Assert.assertEquals(date7.toString(), "Sun Feb 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Wed Jan 01 00:00:00 MST 1969");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1321");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addWeeks(date4, 6);
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
        org.junit.Assert.assertEquals(date9.toString(), "Thu Feb 12 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1322");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addYears(date6, (int) '4');
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
        org.junit.Assert.assertEquals(date9.toString(), "Sat Jan 01 00:00:00 MST 2022");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1323");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setHours(date0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1324");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addWeeks(date0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1325");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addDays(date4, (int) (byte) 100);
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
        org.junit.Assert.assertEquals(date8.toString(), "Sat Apr 11 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1326");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(date5, 10);
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
        org.junit.Assert.assertEquals(date7.toString(), "Fri Dec 01 00:00:00 MST 1972");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1327");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMinutes(date5, (int) (short) 10);
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
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:10:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=25800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=10,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1328");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray5);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addHours(date7, (int) (short) 1);
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
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 01:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1329");
        java.util.Locale locale3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", locale3, strArray6);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1330");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setSeconds(date5, 0);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addDays(date5, 5);
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
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 06 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1331");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 1001);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, (int) '4');
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:52 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1332");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", locale2, strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray5);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMonths(date7, (int) (byte) 10);
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
        org.junit.Assert.assertEquals(date9.toString(), "Sun Nov 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1333");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Calendar calendar5 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Iterator<java.util.Calendar> calendarItor7 = org.apache.commons.lang3.time.DateUtils.iterator(calendar5, 6);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.truncate(calendar5, 1001);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendarItor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1334");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.ceiling(date7, (int) (short) 100);
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
        org.junit.Assert.assertEquals(date7.toString(), "Sat Jan 01 00:00:00 MST 52");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1335");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.setHours(date4, 5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) date4, 3);
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
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 05:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1336");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray5);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addDays(date7, 1);
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
            System.out.format("%n%s%n", "DateUtils2.test1337");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date6, 1001);
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
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1338");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addYears(date7, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Sat Jan 01 00:00:00 MST 2067");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1339");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.truncate(calendar0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1340");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) 6, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 6");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1341");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Calendar calendar5 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.ceiling(calendar5, 2);
        long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(calendar7, 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=2703600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=32,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1342");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(calendar7, 10);
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
            System.out.format("%n%s%n", "DateUtils2.test1343");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Calendar calendar5 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Iterator<java.util.Calendar> calendarItor7 = org.apache.commons.lang3.time.DateUtils.iterator(calendar5, 6);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(calendar5, 0);
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
        org.junit.Assert.assertNotNull(calendar5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendarItor7);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1344");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addWeeks(date4, 5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setSeconds(date6, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SECOND");
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
            System.out.format("%n%s%n", "DateUtils2.test1345");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(date0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1346");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(calendar0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1347");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addDays(date4, (int) (short) 10);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.round(date6, (int) (short) 0);
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
        org.junit.Assert.assertEquals(date8.toString(), "Sat Jan 01 00:00:00 MST 1");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1348");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.setHours(date4, 5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor8 = org.apache.commons.lang3.time.DateUtils.iterator(date6, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 32 is not valid.");
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
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 05:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1349");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(date0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1350");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        long long6 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date4, 1);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addMonths(date4, 10);
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
        org.junit.Assert.assertEquals(date8.toString(), "Sun Nov 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=26290800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=10,WEEK_OF_YEAR=45,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=305,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1351");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setMinutes(date6, 2);
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:02:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1352");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(date0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1353");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.setHours(date4, 5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setMonths(date4, 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 05:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Wed Jul 01 00:00:00 MDT 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1354");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setDays(date5, 4);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addDays(date5, (int) (short) 10);
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
        org.junit.Assert.assertEquals(date9.toString(), "Sun Jan 11 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1355");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date4, 2);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
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
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200002,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=2,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1356");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addDays(date4, (int) (short) 10);
        java.util.Iterator<java.util.Calendar> calendarItor8 = org.apache.commons.lang3.time.DateUtils.iterator(date6, 5);
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
        org.junit.Assert.assertNotNull(calendarItor8);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1357");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addWeeks(date0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1358");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(calendar7, 3);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1359");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addDays(date4, (int) (short) 10);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) calendar7, 100);
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
        org.junit.Assert.assertEquals(date6.toString(), "Sun Jan 11 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=889200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=3,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=11,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1360");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Calendar calendar5 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.truncate(calendar5, 3);
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
        org.junit.Assert.assertNotNull(calendar5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1361");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round(obj0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1362");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setSeconds(date4, 5);
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:05 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1363");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling(obj0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1364");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addMinutes(date6, (int) '#');
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.toCalendar(date8);
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
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=27300000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=35,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1365");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) '#');
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
        org.junit.Assert.assertEquals(date7.toString(), "Fri Dec 01 00:00:00 MST 1972");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Wed Feb 11 17:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1366");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) date5, 3);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1367");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Calendar calendar5 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.ceiling(calendar5, 2);
        // The following exception was thrown during execution in test generation
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
        org.junit.Assert.assertNotNull(calendar5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=1,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1368");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (byte) 1);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1369");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) date5, (int) (short) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date5, 10);
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
            System.out.format("%n%s%n", "DateUtils2.test1370");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 1001);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setMonths(date6, (int) (byte) 10);
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
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:16:41 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Sun Nov 01 00:16:41 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=26201000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=16,SECOND=41,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1371");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setSeconds(date0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1372");
        java.util.Locale locale1 = null;
        java.util.Locale locale3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale3, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("hi!", locale1, strArray6);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1373");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(calendar0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1374");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(date7, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 35 is not supported");
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
            System.out.format("%n%s%n", "DateUtils2.test1375");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addDays(date0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1376");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) '#');
        java.util.Iterator<java.util.Calendar> calendarItor9 = org.apache.commons.lang3.time.DateUtils.iterator(date7, 3);
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
        org.junit.Assert.assertNotNull(calendarItor9);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1377");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.truncate(date4, 5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addDays(date6, (int) (byte) 1);
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
        org.junit.Assert.assertEquals(date8.toString(), "Fri Jan 02 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1378");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1379");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.setHours(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(calendar7, 0);
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
            System.out.format("%n%s%n", "DateUtils2.test1380");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.setHours(date4, 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addYears(date4, (int) (short) 0);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1381");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Calendar calendar5 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in test generation
        try {
            long long7 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(calendar5, 4);
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
        org.junit.Assert.assertNotNull(calendar5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1382");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) 10L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not find ceiling of for type: class java.lang.Long");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1383");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.truncate(date4, 5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addSeconds(date6, 0);
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
            System.out.format("%n%s%n", "DateUtils2.test1384");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.ceiling(calendar7, (int) '4');
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1385");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addSeconds(date6, (int) (byte) 0);
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
            System.out.format("%n%s%n", "DateUtils2.test1386");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1387");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Calendar calendar5 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.ceiling(calendar5, 2);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.round(calendar7, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=1,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1388");
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
            System.out.format("%n%s%n", "DateUtils2.test1389");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 1001);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) date4, 0);
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
        org.junit.Assert.assertEquals(date8.toString(), "Sat Jan 01 00:00:00 MST 1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=-62135744400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1390");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", locale2, strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addWeeks(date7, (int) (short) 100);
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
        org.junit.Assert.assertEquals(date9.toString(), "Thu Dec 02 00:00:00 MST 1971");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1391");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (byte) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMinutes(date7, 5);
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
        org.junit.Assert.assertEquals(date9.toString(), "Fri Jan 01 00:05:00 MST 1971");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1392");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMinutes(date5, (int) (short) 10);
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
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:10:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1393");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setMonths(date6, (-1));
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
            System.out.format("%n%s%n", "DateUtils2.test1394");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", locale2, strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) "", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not find ceiling of for type: class java.lang.String");
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
            System.out.format("%n%s%n", "DateUtils2.test1395");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "", "hi!" };
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1396");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setSeconds(date5, 0);
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
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1397");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Calendar calendar5 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in test generation
        try {
            long long7 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(calendar5, (int) '4');
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
        org.junit.Assert.assertNotNull(calendar5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1398");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.round(date6, (int) '4');
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
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1399");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray5);
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
            System.out.format("%n%s%n", "DateUtils2.test1400");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) date6, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 4 is not supported");
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
            System.out.format("%n%s%n", "DateUtils2.test1401");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(date7, (int) (short) 100);
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
        org.junit.Assert.assertEquals(date7.toString(), "Wed Feb 01 00:00:00 MST 1978");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1402");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray4);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addSeconds(date6, 0);
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1403");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate(date0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1404");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Calendar calendar5 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Iterator<java.util.Calendar> calendarItor7 = org.apache.commons.lang3.time.DateUtils.iterator(calendar5, 6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.ceiling(calendar5, (int) (short) -1);
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
        org.junit.Assert.assertNotNull(calendar5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendarItor7);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1405");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) date6, 100);
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
            System.out.format("%n%s%n", "DateUtils2.test1406");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) false, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not find ceiling of for type: class java.lang.Boolean");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1407");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Calendar calendar5 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.ceiling(calendar5, 2);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.ceiling(calendar7, 1001);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=1,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=3999600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1408");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Calendar calendar5 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Iterator<java.util.Calendar> calendarItor7 = org.apache.commons.lang3.time.DateUtils.iterator(calendar5, 6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<?> wildcardItor9 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) 6, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on 6");
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
        org.junit.Assert.assertNotNull(calendar5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendarItor7);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1409");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", locale2, strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date7, 10);
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
            System.out.format("%n%s%n", "DateUtils2.test1410");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date5, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fragment 1001 is not supported");
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
            System.out.format("%n%s%n", "DateUtils2.test1411");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) strArray5, 10);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1412");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray4);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date6, (int) (byte) 0);
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
            System.out.format("%n%s%n", "DateUtils2.test1413");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<?> wildcardItor2 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) (byte) 1, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on 1");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1414");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) date5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) '#');
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
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1415");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        long long6 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date4, 1);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addWeeks(date4, (int) (byte) 10);
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 12 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=6073200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=2,WEEK_OF_YEAR=11,WEEK_OF_MONTH=2,DAY_OF_MONTH=12,DAY_OF_YEAR=71,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1416");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling(date0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1417");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Calendar calendar5 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.ceiling(calendar5, 2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.round(calendar7, (-1));
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
        org.junit.Assert.assertNotNull(calendar5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=1,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1418");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) (-1.0f), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate -1.0");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1419");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.truncate(date4, 5);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1420");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.round(calendar0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1421");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) '#');
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addSeconds(date7, (int) (short) 100);
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
        org.junit.Assert.assertEquals(date9.toString(), "Fri Dec 01 00:01:40 MST 1972");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1422");
        java.util.Date date0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.truncate(date5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.apache.commons.lang3.time.DateUtils.truncatedEquals(date0, date5, 0);
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
        org.junit.Assert.assertEquals(date7.toString(), "Sat Jan 01 00:00:00 MST 1");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1423");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 1001);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setMinutes(date4, (int) '4');
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:52:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1424");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", locale2, strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) date7, 10);
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
            System.out.format("%n%s%n", "DateUtils2.test1425");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.truncate(date4, 5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setDays(date6, (int) (byte) 10);
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
        org.junit.Assert.assertEquals(date8.toString(), "Sat Jan 10 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1426");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.ceiling(calendar7, 4);
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
            System.out.format("%n%s%n", "DateUtils2.test1427");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) '4');
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
        org.junit.Assert.assertEquals(date7.toString(), "Sat Jan 01 00:00:00 MST 52");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1428");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round(date0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1429");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling(obj0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1430");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.setHours(date4, 5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addYears(date4, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 05:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Fri Jan 01 00:00:00 MST 1971");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1431");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addWeeks(date4, 5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addHours(date4, 5);
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 05:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1432");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setDays(date5, 4);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addWeeks(date7, 100);
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
        org.junit.Assert.assertEquals(date9.toString(), "Sun Dec 05 00:00:00 MST 1971");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1433");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Calendar calendar5 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Iterator<java.util.Calendar> calendarItor7 = org.apache.commons.lang3.time.DateUtils.iterator(calendar5, 6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.round(calendar5, (int) (byte) 100);
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
        org.junit.Assert.assertNotNull(calendar5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendarItor7);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1434");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in test generation
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1435");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("hi!", locale1, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1436");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round(obj0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1437");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addDays(date4, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(date4, 4);
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
        org.junit.Assert.assertEquals(date6.toString(), "Sun Jan 11 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1438");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling(date0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1439");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<?> wildcardItor8 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) date6, 0);
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
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1440");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, (int) (short) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addSeconds(date7, (int) (byte) 0);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1441");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) date5, (int) '#');
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
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1442");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<?> wildcardItor9 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) date5, 0);
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1443");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setDays(date0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1444");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setDays(date5, 4);
        long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date7, 5);
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1445");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setSeconds(date5, 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:02 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1446");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addYears(date6, 100);
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
        org.junit.Assert.assertEquals(date8.toString(), "Wed Jan 01 00:00:00 MST 2070");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1447");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setHours(date4, 0);
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
            System.out.format("%n%s%n", "DateUtils2.test1448");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling(date0, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1449");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(date0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1450");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate(obj0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1451");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(calendar0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1452");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) 100L, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 100");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1453");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMonths(date6, 1001);
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
        org.junit.Assert.assertEquals(date9.toString(), "Sun Jun 01 00:00:00 MDT 2053");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1454");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addYears(date0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1455");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addDays(date4, (int) (short) 10);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addHours(date6, (int) (short) 1);
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
        org.junit.Assert.assertEquals(date6.toString(), "Sun Jan 11 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Sun Jan 11 01:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1456");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.truncate(calendar7, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 4 is not supported");
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
            System.out.format("%n%s%n", "DateUtils2.test1457");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addDays(date4, (int) (short) 10);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setMinutes(date6, (int) (short) 0);
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
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=889200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=3,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=11,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Sun Jan 11 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1458");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.round(calendar7, (int) (short) 100);
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
            System.out.format("%n%s%n", "DateUtils2.test1459");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.truncate(date4, 5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addMinutes(date6, (int) (byte) 1);
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:01:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1460");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.setHours(date4, 5);
        long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(date6, 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 05:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 18000L + "'", long8 == 18000L);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1461");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setDays(date0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1462");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) date7, 100);
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
        org.junit.Assert.assertEquals(date7.toString(), "Sun Feb 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1463");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date4, 2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) 2, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round 2");
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1464");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.truncate(date4, 5);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.ceiling(calendar7, (int) (short) 1);
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
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1971,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1465");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setSeconds(date6, 4);
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:04 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1466");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Calendar calendar5 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        long long7 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(calendar5, 5);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.round(calendar5, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1467");
        java.util.Locale locale3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", locale3, strArray6);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("hi!", strArray6);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1468");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.ceiling(date7, (-1));
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
        org.junit.Assert.assertEquals(date7.toString(), "Sun Feb 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1469");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round(obj0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1470");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Calendar calendar5 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        long long7 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(calendar5, 5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.truncate(calendar5, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 4 is not supported");
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
        org.junit.Assert.assertNotNull(calendar5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1471");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) calendar7, 10);
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
            System.out.format("%n%s%n", "DateUtils2.test1472");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setDays(date5, 4);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) date7, (int) (byte) 10);
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
            System.out.format("%n%s%n", "DateUtils2.test1473");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addWeeks(date0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1474");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addWeeks(date6, (-1));
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
        org.junit.Assert.assertEquals(date9.toString(), "Thu Dec 25 00:00:00 MST 1969");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1475");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addWeeks(date6, 1001);
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 09 00:00:00 MST 1989");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1476");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addDays(date4, (int) (short) 10);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addYears(date6, (int) '#');
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
        org.junit.Assert.assertEquals(date6.toString(), "Sun Jan 11 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Tue Jan 11 00:00:00 MST 2005");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=889200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=3,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=11,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1477");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) strArray4, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate [Ljava.lang.String;@51e092d8");
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1478");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setSeconds(date5, 0);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addHours(date5, 5);
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
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 05:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1479");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addYears(date0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1480");
        java.util.Locale locale3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", locale3, strArray6);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.parseDate("hi!", strArray6);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1481");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setMinutes(date7, 4);
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
        org.junit.Assert.assertEquals(date9.toString(), "Sun Feb 01 00:04:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1482");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date7, (int) (short) 10);
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
            System.out.format("%n%s%n", "DateUtils2.test1483");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (short) 1);
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
        org.junit.Assert.assertEquals(date7.toString(), "Fri Jan 01 00:00:00 MST 1971");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1484");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in test generation
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1485");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) date6, (int) (short) 0);
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
            System.out.format("%n%s%n", "DateUtils2.test1486");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.truncate(date4, 5);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in test generation
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
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1487");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Calendar calendar5 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Iterator<java.util.Calendar> calendarItor7 = org.apache.commons.lang3.time.DateUtils.iterator(calendar5, 6);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.truncate(calendar5, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendarItor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1488");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setSeconds(date0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1489");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setSeconds(date6, (int) '4');
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
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:52 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1490");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
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
            System.out.format("%n%s%n", "DateUtils2.test1491");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(date0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1492");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.setHours(date4, 5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(date4, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 05:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1493");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.setHours(date4, 5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addMinutes(date6, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 05:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 05:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1494");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(date0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1495");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addDays(date4, (int) (short) 10);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setMonths(date6, 10);
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
        org.junit.Assert.assertEquals(date8.toString(), "Wed Nov 11 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1496");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(calendar7, (int) (short) 0);
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
            System.out.format("%n%s%n", "DateUtils2.test1497");
        java.util.Locale locale3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", locale3, strArray6);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("hi!", strArray6);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1498");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.truncate(date4, 5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) date6, (int) (short) 10);
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 01:00:00 MST 1970");
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1499");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addDays(date0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils2.test1500");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addHours(date6, (int) ' ');
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
        org.junit.Assert.assertEquals(date9.toString(), "Fri Jan 02 08:00:00 MST 1970");
    }
}

