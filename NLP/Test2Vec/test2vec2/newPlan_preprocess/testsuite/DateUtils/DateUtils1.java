package DateUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DateUtils1 {

    public static boolean debug = false;

    @Test
    public void DateUtils0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0501");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0502");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        long long6 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date4, 1);
        java.lang.Class<?> wildcardClass7 = date4.getClass();
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0503");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<?> wildcardItor2 = org.apache.commons.lang3.time.DateUtils.iterator(obj0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0504");
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
    public void DateUtils0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0505");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(date0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0506");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0507");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling(date0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0508");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(date0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0509");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) '4');
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0510");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) 100.0d, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round 100.0");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0511");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setHours(date0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0512");
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
    public void DateUtils0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0513");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
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
    public void DateUtils0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0514");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addHours(date0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0515");
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
    public void DateUtils0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0516");
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
    public void DateUtils0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0517");
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
    public void DateUtils0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0518");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray5);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0519");
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
    public void DateUtils0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0520");
        java.util.Calendar calendar0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addHours(date5, (int) (short) 0);
        java.util.Calendar calendar8 = org.apache.commons.lang3.time.DateUtils.toCalendar(date5);
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
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 MST 1970");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void DateUtils0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0521");
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
    public void DateUtils0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0522");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.truncate(calendar0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0523");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(date0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0524");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "" };
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0525");
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
    public void DateUtils0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0526");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) (-1L), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round -1");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0527");
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
    public void DateUtils0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0528");
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
    public void DateUtils0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0529");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0530");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0531");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setDays(date5, 4);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0532");
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
    public void DateUtils0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0533");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, (int) (short) 1);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0534");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) 5, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 5");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0535");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMinutes(date5, (int) (short) 10);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0536");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0537");
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
    public void DateUtils0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0538");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(date0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0539");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) 100.0f, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round 100.0");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0540");
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
    public void DateUtils0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0541");
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
    public void DateUtils0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0542");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (short) 1);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0543");
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
    public void DateUtils0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0544");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", locale1, strArray5);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0545");
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
    public void DateUtils0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0546");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0547");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0548");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0549");
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
    public void DateUtils0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0550");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (short) 1);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0551");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<?> wildcardItor2 = org.apache.commons.lang3.time.DateUtils.iterator(obj0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0552");
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
    public void DateUtils0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0553");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!" };
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
    public void DateUtils0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0554");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round(date0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0555");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(calendar0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0556");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round(date0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0557");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.round(calendar0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0558");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) '4');
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0559");
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
    public void DateUtils0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0560");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
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
    public void DateUtils0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0561");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.truncate(calendar0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0562");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setSeconds(date0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0563");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not find ceiling of for type: class java.lang.Short");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0564");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor2 = org.apache.commons.lang3.time.DateUtils.iterator(date0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0565");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray7);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0566");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) 'a');
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0567");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        long long6 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date4, 1);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0568");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor2 = org.apache.commons.lang3.time.DateUtils.iterator(date0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0569");
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
    public void DateUtils0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0570");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addMonths(date0, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0571");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "", "hi!" };
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray7);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0572");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addMinutes(date0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0573");
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
    public void DateUtils0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0574");
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
    public void DateUtils0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0575");
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
    public void DateUtils0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0576");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0577");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) 2, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round 2");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0578");
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
    public void DateUtils0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0579");
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
    public void DateUtils0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0580");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(calendar0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0581");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
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
    public void DateUtils0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0582");
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
    public void DateUtils0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0583");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) '#');
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0584");
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
    public void DateUtils0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0585");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round(obj0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0586");
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
    public void DateUtils0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0587");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0588");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addDays(date4, (int) (short) 10);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0589");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0590");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        long long6 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date4, 1);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0591");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0592");
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
    public void DateUtils0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0593");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) (short) 0, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 0");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0594");
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
    public void DateUtils0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0595");
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
    public void DateUtils0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0596");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0597");
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
    public void DateUtils0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0598");
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
    public void DateUtils0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0599");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0600");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) 10.0d, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 10.0");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0601");
        java.util.Date date0 = null;
        java.util.Date date1 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.time.DateUtils.truncatedEquals(date0, date1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0602");
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
    public void DateUtils0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0603");
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
    public void DateUtils0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0604");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addSeconds(date0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0605");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0606");
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
    public void DateUtils0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0607");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate(date0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0608");
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
    public void DateUtils0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0609");
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
    public void DateUtils0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0610");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addMonths(date0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0611");
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
    public void DateUtils0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0612");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
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
    public void DateUtils0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0613");
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
    public void DateUtils0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0614");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(date0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0615");
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
    public void DateUtils0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0616");
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
    public void DateUtils0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0617");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setMinutes(date0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0618");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<?> wildcardItor2 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) (-1.0f), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on -1.0");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0619");
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
    public void DateUtils0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0620");
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
    public void DateUtils0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0621");
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
    public void DateUtils0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0622");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0623");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addSeconds(date0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0624");
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
    public void DateUtils0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0625");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setDays(date0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0626");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) 1001, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round 1001");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0627");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0628");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor2 = org.apache.commons.lang3.time.DateUtils.iterator(calendar0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0629");
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
    public void DateUtils0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0630");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling(date0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0631");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0632");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(calendar0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0633");
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
    public void DateUtils0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0634");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0635");
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
    public void DateUtils0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0636");
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
    public void DateUtils0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0637");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor2 = org.apache.commons.lang3.time.DateUtils.iterator(calendar0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0638");
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
    public void DateUtils0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0639");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addSeconds(date0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0640");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0641");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addDays(date4, (int) (short) 10);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0642");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0643");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addDays(date4, (int) (short) 10);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0644");
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
    public void DateUtils0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0645");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.truncate(calendar0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0646");
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
    public void DateUtils0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0647");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray2 = new java.lang.String[] {};
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0648");
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
    public void DateUtils0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0649");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, (int) (short) 1);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0650");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMinutes(date5, (int) (short) 10);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0651");
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
    public void DateUtils0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0652");
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
    public void DateUtils0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0653");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) '4');
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0654");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate(date0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0655");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<?> wildcardItor2 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) 1.0f, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on 1.0");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0656");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setYears(date0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0657");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        long long6 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date4, 1);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0658");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Date and Patterns must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0659");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0660");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0661");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray7);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0662");
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
    public void DateUtils0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0663");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0664");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        java.util.Calendar calendar8 = null;
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0665");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling(date0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0666");
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
    public void DateUtils0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0667");
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
    public void DateUtils0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0668");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addYears(date0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0669");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setSeconds(date0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0670");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setYears(date5, (int) '4');
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0671");
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
    public void DateUtils0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0672");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling(obj0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0673");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0674");
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
    public void DateUtils0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0675");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setDays(date5, 4);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0676");
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
    public void DateUtils0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0677");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0678");
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
    public void DateUtils0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0679");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray2 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date3 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("hi!", locale1, strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Date and Patterns must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0680");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setHours(date0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0681");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling(obj0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0682");
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
    public void DateUtils0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0683");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<?> wildcardItor2 = org.apache.commons.lang3.time.DateUtils.iterator(obj0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0684");
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
    public void DateUtils0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0685");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0686");
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
    public void DateUtils0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0687");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0688");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.truncate(date4, (int) (short) 0);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0689");
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
    public void DateUtils0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0690");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor2 = org.apache.commons.lang3.time.DateUtils.iterator(calendar0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0691");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
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
    public void DateUtils0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0692");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling(obj0, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0693");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setDays(date5, 4);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0694");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(calendar0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0695");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray5);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0696");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setMonths(date5, (int) (short) 1);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0697");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round(obj0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0698");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0699");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 100");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0700");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setDays(date5, 4);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0701");
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
    public void DateUtils0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0702");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0703");
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
    public void DateUtils0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0704");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0705");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0706");
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
    public void DateUtils0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0707");
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
    public void DateUtils0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0708");
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
    public void DateUtils0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0709");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addDays(date0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0710");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0711");
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
    public void DateUtils0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0712");
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
    public void DateUtils0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0713");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0714");
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
    public void DateUtils0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0715");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setSeconds(date5, 0);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0716");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0717");
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
    public void DateUtils0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0718");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.truncate(calendar0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0719");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0720");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0721");
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
    public void DateUtils0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0722");
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
    public void DateUtils0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0723");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(calendar0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0724");
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
    public void DateUtils0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0725");
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
    public void DateUtils0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0726");
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
    public void DateUtils0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0727");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(calendar0, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0728");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.round(calendar0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0729");
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
    public void DateUtils0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0730");
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
    public void DateUtils0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0731");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.truncate(date4, (int) (short) 0);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0732");
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
    public void DateUtils0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0733");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "hi!", "" };
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0734");
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
    public void DateUtils0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0735");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Date and Patterns must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0736");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0737");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate(obj0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0738");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 1001);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0739");
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
    public void DateUtils0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0740");
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
    public void DateUtils0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0741");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.round(calendar0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0742");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0743");
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
    public void DateUtils0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0744");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(calendar0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0745");
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
    public void DateUtils0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0746");
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
    public void DateUtils0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0747");
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
    public void DateUtils0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0748");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0749");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(calendar0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0750");
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
    public void DateUtils0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0751");
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
    public void DateUtils0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0752");
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
    public void DateUtils0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0753");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0754");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(calendar0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0755");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addMonths(date0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0756");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 1001);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0757");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate(date0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0758");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0759");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        long long6 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date4, 1);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0760");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.lang.Class<?> wildcardClass7 = date4.getClass();
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0761");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0762");
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
    public void DateUtils0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0763");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setDays(date5, 4);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0764");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addHours(date0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0765");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling(date0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0766");
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
    public void DateUtils0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0767");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setMinutes(date0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0768");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor2 = org.apache.commons.lang3.time.DateUtils.iterator(date0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0769");
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
    public void DateUtils0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0770");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling(date0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0771");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling(date0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0772");
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
    public void DateUtils0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0773");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0774");
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
    public void DateUtils0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0775");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
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
    public void DateUtils0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0776");
        java.util.Locale locale3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale3, strArray6);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
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
    public void DateUtils0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0777");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMinutes(date5, (int) (short) 10);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0778");
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
    public void DateUtils0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0779");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.truncate(calendar0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0780");
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
    public void DateUtils0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0781");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.ceiling(calendar0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0782");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(date0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0783");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0784");
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
    public void DateUtils0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0785");
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
    public void DateUtils0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0786");
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
    public void DateUtils0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0787");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round((java.lang.Object) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round  ");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0788");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0789");
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
    public void DateUtils0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0790");
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
    public void DateUtils0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0791");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor2 = org.apache.commons.lang3.time.DateUtils.iterator(calendar0, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0792");
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
    public void DateUtils0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0793");
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
    public void DateUtils0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0794");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate(obj0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0795");
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
    public void DateUtils0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0796");
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
    public void DateUtils0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0797");
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
    public void DateUtils0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0798");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(date0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0799");
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
    public void DateUtils0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0800");
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
    public void DateUtils0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0801");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(date0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0802");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "", "hi!" };
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray7);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0803");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setDays(date5, 4);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0804");
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
    public void DateUtils0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0805");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray5);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0806");
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
    public void DateUtils0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0807");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor2 = org.apache.commons.lang3.time.DateUtils.iterator(calendar0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0808");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.truncate(calendar0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0809");
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
    public void DateUtils0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0810");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor2 = org.apache.commons.lang3.time.DateUtils.iterator(calendar0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0811");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<?> wildcardItor2 = org.apache.commons.lang3.time.DateUtils.iterator((java.lang.Object) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on 10");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0812");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate(date0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0813");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray5);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0814");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round(date0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0815");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.round(calendar0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0816");
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
    public void DateUtils0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0817");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.truncate(date4, (int) (short) 0);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0818");
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
    public void DateUtils0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0819");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(date0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0820");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setSeconds(date5, 0);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0821");
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
    public void DateUtils0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0822");
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
    public void DateUtils0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0823");
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
    public void DateUtils0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0824");
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
    public void DateUtils0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0825");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(date0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0826");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.round(calendar0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0827");
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
    public void DateUtils0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0828");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0829");
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
    public void DateUtils0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0830");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0831");
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
    public void DateUtils0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0832");
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
    public void DateUtils0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0833");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0834");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling(date0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0835");
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
    public void DateUtils0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0836");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(calendar0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0837");
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
    public void DateUtils0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0838");
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
    public void DateUtils0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0839");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0840");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(calendar0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0841");
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
    public void DateUtils0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0842");
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
    public void DateUtils0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0843");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0844");
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
    public void DateUtils0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0845");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling(date0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0846");
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
    public void DateUtils0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0847");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addHours(date0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0848");
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
    public void DateUtils0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0849");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0850");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling(obj0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0851");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setHours(date0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0852");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray5);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0853");
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
    public void DateUtils0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0854");
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
    public void DateUtils0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0855");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling(obj0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0856");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0857");
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
    public void DateUtils0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0858");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) 10.0f, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 10.0");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0859");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<?> wildcardItor2 = org.apache.commons.lang3.time.DateUtils.iterator(obj0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0860");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setHours(date0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0861");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0862");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(calendar0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0863");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addWeeks(date4, 5);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0864");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0865");
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
    public void DateUtils0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0866");
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
    public void DateUtils0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0867");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addDays(date4, (int) (short) 10);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0868");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setSeconds(date0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0869");
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
    public void DateUtils0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0870");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0871");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0872");
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
    public void DateUtils0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0873");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setSeconds(date0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0874");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate(date0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0875");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0876");
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
    public void DateUtils0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0877");
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
    public void DateUtils0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0878");
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
    public void DateUtils0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0879");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (short) 1);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0880");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (short) 1);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0881");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round(obj0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0882");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0883");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate((java.lang.Object) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 10");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0884");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addWeeks(date0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0885");
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
    public void DateUtils0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0886");
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
    public void DateUtils0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0887");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
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
    public void DateUtils0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0888");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 1001);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0889");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.round(calendar0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0890");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.ceiling(date5, (int) (short) 1);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0891");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0892");
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
    public void DateUtils0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0893");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate(obj0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0894");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(date0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0895");
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
    public void DateUtils0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0896");
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
    public void DateUtils0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0897");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.truncate(calendar0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0898");
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
    public void DateUtils0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0899");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray6);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0900");
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
    public void DateUtils0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0901");
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
    public void DateUtils0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0902");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<?> wildcardItor2 = org.apache.commons.lang3.time.DateUtils.iterator(obj0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0903");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling(obj0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0904");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(date0, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0905");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0906");
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
    public void DateUtils0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0907");
        java.util.Date date0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addDays(date5, (int) (short) 10);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0908");
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
    public void DateUtils0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0909");
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
    public void DateUtils0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0910");
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
    public void DateUtils0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0911");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setSeconds(date5, 0);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0912");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(calendar0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0913");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Date date7 = null;
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0914");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0915");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0916");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(calendar0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0917");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 1001);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0918");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMinutes(date5, (int) (short) 10);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0919");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.round(date0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0920");
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
    public void DateUtils0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0921");
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
    public void DateUtils0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0922");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setMonths(date0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0923");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0924");
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
    public void DateUtils0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0925");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0926");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addDays(date0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0927");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0928");
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
    public void DateUtils0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0929");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray5);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0930");
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
    public void DateUtils0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0931");
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
    public void DateUtils0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0932");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
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
    public void DateUtils0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0933");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Iterator<java.util.Calendar> calendarItor2 = org.apache.commons.lang3.time.DateUtils.iterator(date0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0934");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling(obj0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0935");
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
    public void DateUtils0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0936");
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
    public void DateUtils0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0937");
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
    public void DateUtils0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0938");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addWeeks(date4, 5);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0939");
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
    public void DateUtils0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0940");
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
    public void DateUtils0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0941");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not find ceiling of for type: class java.lang.Short");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0942");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not find ceiling of for type: class java.lang.Integer");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0943");
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
    public void DateUtils0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0944");
        java.util.Date date0 = null;
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray5);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.addMonths(date6, (int) 'a');
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0945");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling(date0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0946");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addHours(date0, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0947");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0948");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.round(calendar0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0949");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(date0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0950");
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
    public void DateUtils0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0951");
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
    public void DateUtils0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0952");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not find ceiling of for type: class java.lang.Byte");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0953");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(date0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0954");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate(obj0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0955");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(date0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0956");
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
    public void DateUtils0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0957");
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
    public void DateUtils0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0958");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date4);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0959");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(calendar0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0960");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.addMonths(date5, (int) 'a');
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0961");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.truncate(date4, 5);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0962");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0963");
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
    public void DateUtils0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0964");
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
    public void DateUtils0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0965");
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
    public void DateUtils0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0966");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.truncate(date4, (int) (short) 0);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0967");
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
    public void DateUtils0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0968");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0969");
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
    public void DateUtils0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0970");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate(obj0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0971");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.setDays(date5, 4);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0972");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.addYears(date0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0973");
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
    public void DateUtils0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0974");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang3.time.DateUtils.round(calendar0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0975");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(calendar0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0976");
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
    public void DateUtils0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0977");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0978");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", strArray4);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0979");
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
    public void DateUtils0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0980");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(date0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0981");
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
    public void DateUtils0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0982");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0983");
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
    public void DateUtils0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0984");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addHours(date4, (int) (short) 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0985");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(date0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0986");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setSeconds(date0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0987");
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
    public void DateUtils0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0988");
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
    public void DateUtils0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0989");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.addSeconds(date4, 0);
        java.util.Calendar calendar7 = org.apache.commons.lang3.time.DateUtils.toCalendar(date6);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0990");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray6);
        java.util.Date date8 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly("", locale2, strArray6);
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
    public void DateUtils0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0991");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not find ceiling of for type: class java.lang.Short");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0992");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(date0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0993");
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
    public void DateUtils0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0994");
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
    public void DateUtils0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0995");
        java.util.Locale locale2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale2, strArray5);
        java.util.Date date7 = org.apache.commons.lang3.time.DateUtils.parseDate("", strArray5);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0996");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            long long2 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(calendar0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0997");
        java.util.Locale locale1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang3.time.DateUtils.parseDate("", locale1, strArray4);
        // The following exception was thrown during execution in DateUtils generation
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
    public void DateUtils0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0998");
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
    public void DateUtils0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils0999");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.truncate(obj0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateUtils1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateUtils1.DateUtils1000");
        // The following exception was thrown during execution in DateUtils generation
        try {
            java.util.Date date2 = org.apache.commons.lang3.time.DateUtils.ceiling((java.lang.Object) "", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not find ceiling of for type: class java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }
}

