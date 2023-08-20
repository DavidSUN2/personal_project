package DateUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DateUtils3 {

    public static boolean debug = false;

    @Test
    public void DateUtils1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1501");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(calendar0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1502");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setHours(date0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1503");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(calendar0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1504");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(date6, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
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
    public void DateUtils1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1505");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
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
    public void DateUtils1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1506");
        java.util.Calendar calendar0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addDays(date5, (int) (short) 10);
        java.util.Calendar calendar8 = org.apache.commons.lang3.time.DateUtils.toCalendar(date7);
        // The following exception was thrown during execution in DateUtils generation
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
        org.junit.Assert.assertEquals(date7.toString(), "Sun Jan 11 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=889200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=3,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=11,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1507");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.truncate(date4, 5);
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
    public void DateUtils1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1508");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addWeeks(date4, 5);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.truncate(date6, (int) (byte) 100);
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
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1509");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray5);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.ceiling(date7, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field -1 is not supported");
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
    public void DateUtils1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1510");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
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
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:01:37 MST 1970");
    }

    @Test
    public void DateUtils1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1511");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addDays(date4, (int) (short) 10);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addYears(date4, (int) '#');
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
        org.junit.Assert.assertEquals(date8.toString(), "Sat Jan 01 00:00:00 MST 2005");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=1104562800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2005,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1512");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate -1");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1513");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setDays(date5, 4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date7, (int) 'a');
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
        org.junit.Assert.assertEquals(date7.toString(), "Sun Jan 04 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1514");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMinutes(date5, (int) (short) 10);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addDays(date7, 1);
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
        org.junit.Assert.assertEquals(date9.toString(), "Fri Jan 02 00:10:00 MST 1970");
    }

    @Test
    public void DateUtils1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1515");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (short) 1);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.truncate(date7, (int) ' ');
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
        org.junit.Assert.assertEquals(date7.toString(), "Fri Jan 01 00:00:00 MST 1971");
    }

    @Test
    public void DateUtils1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1516");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Calendar calendar5 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        long long7 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(calendar5, 5);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.ceiling(calendar5, 4);
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
    public void DateUtils1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1517");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(calendar0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1518");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(date6, 2);
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 86400L + "'", long8 == 86400L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1519");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.setHours(date4, 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 100);
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
        org.junit.Assert.assertEquals(date8.toString(), "Mon Jan 05 04:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1520");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor9 = org.apache.commons.lang3.time.DateUtils.iterator(date6, 10);
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
    public void DateUtils1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1521");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(date0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1522");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 1");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1523");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.lang.Class<?> wildcardClass7 = date6.getClass();
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) wildcardClass7, (int) (short) 10);
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
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void DateUtils1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1524");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) 86400L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not find ceiling of for type: class java.lang.Long");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1525");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1526");
        java.util.Calendar calendar0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Calendar calendar6 = org.apache.commons.lang3.time.DateUtils.toCalendar(date5);
        java.util.Calendar calendar8 = org.apache.commons.lang3.time.DateUtils.ceiling(calendar6, 2);
        // The following exception was thrown during execution in DateUtils generation
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
        org.junit.Assert.assertNotNull(calendar6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=1,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1527");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addMinutes(date6, (int) (short) 100);
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 01:40:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1528");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addSeconds(date7, 5);
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
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:05 MST 1970");
    }

    @Test
    public void DateUtils1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1529");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, (int) (short) 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addWeeks(date7, 0);
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
    public void DateUtils1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1530");
        java.util.Date date0 = null;
        java.util.Date date1 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            int int3 = org.apache.commons.lang3.time.DateUtils.truncatedCompareTo(date0, date1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1531");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(date0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1532");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(calendar7, 6);
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
    public void DateUtils1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1533");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMinutes(date5, (int) (short) 10);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date7, (int) 'a');
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
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:10:00 MST 1970");
    }

    @Test
    public void DateUtils1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1534");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray4);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addDays(date6, 0);
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1535");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (short) 1);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(date7, (-1));
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
    public void DateUtils1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1536");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) '4');
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setSeconds(date7, 10);
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
        org.junit.Assert.assertEquals(date9.toString(), "Sat Jan 01 00:00:10 MST 52");
    }

    @Test
    public void DateUtils1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1537");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setHours(date6, 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 04:00:00 MST 1970");
    }

    @Test
    public void DateUtils1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1538");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        long long6 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date4, 1);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.truncate(date4, (int) (short) 0);
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
        org.junit.Assert.assertEquals(date8.toString(), "Sat Jan 01 00:00:00 MST 1");
    }

    @Test
    public void DateUtils1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1539");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addMinutes(date0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1540");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.truncate(date4, 5);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
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
    public void DateUtils1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1541");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(calendar7, (int) (byte) 0);
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
    public void DateUtils1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1542");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Calendar calendar5 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        long long7 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(calendar5, 5);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.ceiling(calendar5, (int) (short) 1);
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
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1971,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1543");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addHours(date6, (int) (byte) 10);
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 10:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1544");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addMonths(date0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1545");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.setHours(date4, 0);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setHours(date6, (int) (byte) -1);
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
    public void DateUtils1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1546");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Calendar calendar5 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        long long7 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(calendar5, 5);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.round(calendar5, 10);
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
    public void DateUtils1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1547");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(calendar7, 6);
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
    public void DateUtils1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1548");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMinutes(date5, (int) (short) 10);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setDays(date7, 0);
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
    public void DateUtils1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1549");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(calendar7, 100);
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
    public void DateUtils1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1550");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addDays(date4, (int) (short) 10);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
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
        org.junit.Assert.assertEquals(date6.toString(), "Sun Jan 11 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=889200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=3,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=11,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1551");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray6);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) strArray6, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not find ceiling of for type: class [Ljava.lang.String;");
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
    public void DateUtils1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1552");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setSeconds(date0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1553");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(calendar7, (int) (byte) 0);
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
    public void DateUtils1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1554");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.ceiling(calendar7, (int) (short) 10);
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
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=28800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1555");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date4, 2);
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
    public void DateUtils1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1556");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.ceiling(calendar0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1557");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.setHours(date4, 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addWeeks(date4, (int) '#');
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Sep 03 00:00:00 MDT 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1558");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addHours(date0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1559");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(date0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1560");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Calendar calendar5 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.ceiling(calendar5, 2);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor9 = org.apache.commons.lang3.time.DateUtils.iterator(calendar5, (int) '#');
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
        org.junit.Assert.assertNotNull(calendar5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=1,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1561");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate(obj0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1562");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Calendar calendar5 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        long long7 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(calendar5, 5);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.ceiling(calendar5, (int) '4');
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
        org.junit.Assert.assertNotNull(calendar5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void DateUtils1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1563");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.setHours(date4, 0);
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
    public void DateUtils1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1564");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (short) 1);
        java.util.Iterator<?> wildcardItor9 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) date5, 2);
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
    public void DateUtils1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1565");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date7, (int) (short) 100);
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
    public void DateUtils1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1566");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addHours(date0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1567");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date4, 2);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setYears(date6, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
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
        org.junit.Assert.assertEquals(date8.toString(), "Sat Jan 01 00:00:00 MST 52");
    }

    @Test
    public void DateUtils1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1568");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor2 = org.apache.commons.lang3.time.DateUtils.iterator(date0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1569");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Calendar calendar5 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.ceiling(calendar5, 2);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.truncate(calendar5, (int) (short) 0);
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
    public void DateUtils1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1570");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(date0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1571");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) 60000L, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round 60000");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1572");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) date6, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field -1 is not supported");
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
    public void DateUtils1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1573");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Calendar calendar5 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor7 = org.apache.commons.lang3.time.DateUtils.iterator(calendar5, 100);
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
        org.junit.Assert.assertNotNull(calendar5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1574");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.truncate(date4, (int) (short) 0);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(date6, (int) (short) 10);
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
    public void DateUtils1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1575");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addWeeks(date4, 5);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long8 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(date6, (int) (short) -1);
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
    public void DateUtils1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1576");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        java.util.Calendar calendar8 = org.apache.commons.lang3.time.DateUtils.toCalendar(date7);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.toCalendar(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1577");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.truncate(date4, 5);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(calendar7, 0);
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
    public void DateUtils1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1578");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setDays(date6, 2);
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
        org.junit.Assert.assertEquals(date9.toString(), "Fri Jan 02 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1579");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.truncate(date4, 5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setSeconds(date6, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:32 MST 1970");
    }

    @Test
    public void DateUtils1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1580");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Calendar calendar5 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.ceiling(calendar5, 2);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(calendar5, 10);
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
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=1,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1581");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(date0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1582");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, 1);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.addHours(date5, (int) (short) 100);
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
        org.junit.Assert.assertEquals(date9.toString(), "Mon Jan 05 04:00:00 MST 1970");
    }

    @Test
    public void DateUtils1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1583");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 1001);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.ceiling(date4, 10);
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
    public void DateUtils1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1584");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round(date0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1585");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(calendar7, (int) 'a');
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
    public void DateUtils1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1586");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Calendar calendar5 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Iterator<java.util.Calendar> calendarItor7 = org.apache.commons.lang3.time.DateUtils.iterator(calendar5, 6);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(calendar5, 4);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendarItor7);
    }

    @Test
    public void DateUtils1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1587");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray5);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.truncate(date7, 0);
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
    public void DateUtils1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1588");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.setHours(date4, 0);
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
    public void DateUtils1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1589");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        java.util.Iterator<java.util.Calendar> calendarItor9 = org.apache.commons.lang3.time.DateUtils.iterator(calendar7, 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
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
    public void DateUtils1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1590");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.truncate(date6, 1);
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
    public void DateUtils1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1591");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate(date0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1592");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setYears(date0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1593");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.setHours(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setYears(date4, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
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
        org.junit.Assert.assertEquals(date9.toString(), "Wed Jan 01 00:00:00 MST 100");
    }

    @Test
    public void DateUtils1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1594");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) '4');
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date7, (int) (byte) -1);
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
    public void DateUtils1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1595");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addYears(date0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1596");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.truncate(date4, 5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setYears(date6, 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 MST 5");
    }

    @Test
    public void DateUtils1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1597");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date7, (int) (byte) 100);
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
    public void DateUtils1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1598");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(date6, 3);
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
    public void DateUtils1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1599");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, (int) (short) 1);
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
        org.junit.Assert.assertEquals(date7.toString(), "Sun Feb 01 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1600");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        long long6 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date4, 1);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addDays(date4, 3);
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
        org.junit.Assert.assertEquals(date8.toString(), "Sun Jan 04 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=284400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=4,DAY_OF_YEAR=4,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1601");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date4, 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
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
    public void DateUtils1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1602");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) 0.0d, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not find ceiling of for type: class java.lang.Double");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1603");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setMinutes(date0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1604");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) date5, (int) (short) 1);
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
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1605");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setHours(date0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1606");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.truncate(calendar0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1607");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<?> wildcardItor2 = org.apache.commons.lang3.time.DateUtils.iterator(obj0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1608");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.lang.Class<?> wildcardClass7 = date6.getClass();
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) date6, (int) (byte) -1);
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
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void DateUtils1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1609");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Calendar calendar5 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<?> wildcardItor7 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) calendar5, (int) (byte) 0);
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
    }

    @Test
    public void DateUtils1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1610");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Calendar calendar5 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.ceiling(calendar5, 2);
        java.util.Calendar calendar9 = org.apache.commons.lang3.time.DateUtils.truncate(calendar7, 5);
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
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=2703600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=32,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1611");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.setHours(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1612");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addMonths(date0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1613");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
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
    public void DateUtils1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1614");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<?> wildcardItor9 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) date6, (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1615");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round(date0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1616");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(date0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1617");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.truncate(date4, 5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addDays(date6, (int) (byte) 1);
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
        org.junit.Assert.assertEquals(date8.toString(), "Fri Jan 02 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=111600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=2,DAY_OF_YEAR=2,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1618");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        long long6 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date4, 1);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setDays(date4, 3);
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
        org.junit.Assert.assertEquals(date8.toString(), "Sat Jan 03 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=198000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=3,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1619");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date6, 1001);
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
    public void DateUtils1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1620");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addDays(date0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1621");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(calendar0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1622");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) date4, 100);
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
    public void DateUtils1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1623");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addWeeks(date4, 5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setMinutes(date6, (int) '#');
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
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Thu Feb 05 00:35:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=3051300000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=5,DAY_OF_YEAR=36,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=35,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1624");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setYears(date0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1625");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addDays(date4, (int) (short) 10);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(date6, 100);
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
        org.junit.Assert.assertEquals(date8.toString(), "Sun Jan 11 00:00:00 MST 1970");
    }

    @Test
    public void DateUtils1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1626");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addYears(date0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1627");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.setHours(date4, 5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 100);
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
        org.junit.Assert.assertEquals(date8.toString(), "Mon Jan 05 04:00:00 MST 1970");
    }

    @Test
    public void DateUtils1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1628");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addYears(date6, 1001);
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
        org.junit.Assert.assertEquals(date8.toString(), "Tue Jan 01 00:00:00 MST 2971");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DateUtils1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1629");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1630");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setYears(date0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1631");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setDays(date5, 4);
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
        org.junit.Assert.assertEquals(date7.toString(), "Sun Jan 04 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Sun Jan 04 00:04:00 MST 1970");
    }

    @Test
    public void DateUtils1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1632");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(date0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1633");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) (short) 100, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not find ceiling of for type: class java.lang.Short");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1634");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 1001);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setYears(date6, (int) (short) 10);
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
        org.junit.Assert.assertEquals(date8.toString(), "Wed Jan 01 00:16:41 MST 10");
    }

    @Test
    public void DateUtils1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1635");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) '#');
        long long9 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(date7, 2);
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void DateUtils1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1636");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setDays(date5, 4);
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
        org.junit.Assert.assertEquals(date7.toString(), "Sun Jan 04 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Fri May 01 00:00:00 MDT 1970");
    }

    @Test
    public void DateUtils1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1637");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Calendar calendar5 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) calendar5, 10);
        java.util.Date date9 = org.apache.commons.lang3.time.DateUtils.setSeconds(date7, 0);
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
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 01:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 01:00:00 MST 1970");
    }

    @Test
    public void DateUtils1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1638");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.setSeconds(date4, (int) (byte) -1);
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
    public void DateUtils1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1639");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<?> wildcardItor2 = org.apache.commons.lang3.time.DateUtils.iterator(obj0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1640");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.setHours(date4, 5);
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.ceiling(date4, (int) (short) -1);
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
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 05:00:00 MST 1970");
    }

    @Test
    public void DateUtils1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1641");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addMinutes(date6, 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
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
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:03:00 MST 1970");
    }

    @Test
    public void DateUtils1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils3.DateUtils1642");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setSeconds(date0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }
}

