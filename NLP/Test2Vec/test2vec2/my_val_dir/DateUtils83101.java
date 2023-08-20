
/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.lang3.time;

import static org.apache.commons.lang3.JavaVersion.JAVA_1_4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.TimeZone;

import junit.framework.AssertionFailedError;

import org.apache.commons.lang3.SystemUtils;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.time.DateUtils}.
 *
 */
public class DateUtilsTest {

    private static final long MILLIS_TEST;
    static {
        final GregorianCalendar cal = new GregorianCalendar(2000, 6, 5, 4, 3, 2);
        cal.set(Calendar.MILLISECOND, 1);
        MILLIS_TEST = cal.getTime().getTime();
        System.out.println("DateUtilsTest: Default Locale="+Locale.getDefault());
    }

    DateFormat dateParser = null;
    DateFormat dateTimeParser = null;
    DateFormat timeZoneDateParser = null;
    Date dateAmPm1 = null;
    Date dateAmPm2 = null;
    Date dateAmPm3 = null;
    Date dateAmPm4 = null;
    Date date0 = null;
    Date date1 = null;
    Date date2 = null;
    Date date3 = null;
    Date date4 = null;
    Date date5 = null;
    Date date6 = null;
    Date date7 = null;
    Date date8 = null;
    Calendar calAmPm1 = null;
    Calendar calAmPm2 = null;
    Calendar calAmPm3 = null;
    Calendar calAmPm4 = null;
    Calendar cal1 = null;
    Calendar cal2 = null;
    Calendar cal3 = null;
    Calendar cal4 = null;
    Calendar cal5 = null;
    Calendar cal6 = null;
    Calendar cal7 = null;
    Calendar cal8 = null;
    TimeZone zone = null;
    TimeZone defaultZone = null;


    @Before
    public void setUp() throws Exception {


        dateParser = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        dateTimeParser = new SimpleDateFormat("MMM dd, yyyy H:mm:ss.SSS", Locale.ENGLISH);

        dateAmPm1 = dateTimeParser.parse("February 3, 2002 01:10:00.000");
        dateAmPm2 = dateTimeParser.parse("February 3, 2002 11:10:00.000");
        dateAmPm3 = dateTimeParser.parse("February 3, 2002 13:10:00.000");
        dateAmPm4 = dateTimeParser.parse("February 3, 2002 19:10:00.000");
        date0 = dateTimeParser.parse("February 3, 2002 12:34:56.789");
        date1 = dateTimeParser.parse("February 12, 2002 12:34:56.789");
        date2 = dateTimeParser.parse("November 18, 2001 1:23:11.321");
        defaultZone = TimeZone.getDefault();
        zone = TimeZone.getTimeZone("MET");
        TimeZone.setDefault(zone);
        dateTimeParser.setTimeZone(zone);
        date3 = dateTimeParser.parse("March 30, 2003 05:30:45.000");
        date4 = dateTimeParser.parse("March 30, 2003 01:10:00.000");
        date5 = dateTimeParser.parse("March 30, 2003 01:40:00.000");
        date6 = dateTimeParser.parse("March 30, 2003 02:10:00.000");
        date7 = dateTimeParser.parse("March 30, 2003 02:40:00.000");
        date8 = dateTimeParser.parse("October 26, 2003 05:30:45.000");
        dateTimeParser.setTimeZone(defaultZone);
        TimeZone.setDefault(defaultZone);
        calAmPm1 = Calendar.getInstance();
        calAmPm1.setTime(dateAmPm1);
        calAmPm2 = Calendar.getInstance();
        calAmPm2.setTime(dateAmPm2);
        calAmPm3 = Calendar.getInstance();
        calAmPm3.setTime(dateAmPm3);
        calAmPm4 = Calendar.getInstance();
        calAmPm4.setTime(dateAmPm4);
        cal1 = Calendar.getInstance();
        cal1.setTime(date1);
        cal2 = Calendar.getInstance();
        cal2.setTime(date2);
        TimeZone.setDefault(zone);
        cal3 = Calendar.getInstance();
        cal3.setTime(date3);
        cal4 = Calendar.getInstance();
        cal4.setTime(date4);
        cal5 = Calendar.getInstance();
        cal5.setTime(date5);
        cal6 = Calendar.getInstance();
        cal6.setTime(date6);
        cal7 = Calendar.getInstance();
        cal7.setTime(date7);
        cal8 = Calendar.getInstance();
        cal8.setTime(date8);
        TimeZone.setDefault(defaultZone);
    }

    //-----------------------------------------------------------------------
    @Test
    public void DateUtils83() {
        assertNotNull(new DateUtils());
        final Constructor<?>[] cons = DateUtils.class.getDeclaredConstructors();
        assertEquals(1, cons.length);
        assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        assertTrue(Modifier.isPublic(DateUtils.class.getModifiers()));
        assertFalse(Modifier.isFinal(DateUtils.class.getModifiers()));
    }
    
    //-----------------------------------------------------------------------
    @Test
    public void DateUtils83() {
        Date date1 = new GregorianCalendar(2004, 6, 9, 13, 45).getTime();
        Date date2 = new GregorianCalendar(2004, 6, 9, 13, 45).getTime();
        assertTrue(DateUtils.isSameDay(date1, date2));
        date2 = new GregorianCalendar(2004, 6, 10, 13, 45).getTime();
        assertFalse(DateUtils.isSameDay(date1, date2));
        date1 = new GregorianCalendar(2004, 6, 10, 13, 45).getTime();
        assertTrue(DateUtils.isSameDay(date1, date2));
        date2 = new GregorianCalendar(2005, 6, 10, 13, 45).getTime();
        assertFalse(DateUtils.isSameDay(date1, date2));
        try {
            DateUtils.isSameDay((Date) null, (Date) null);
            fail();
        } catch (final IllegalArgumentException ex) {}
    }
    
    //-----------------------------------------------------------------------
    @Test
    public void DateUtils83() {
        final GregorianCalendar cal1 = new GregorianCalendar(2004, 6, 9, 13, 45);
        final GregorianCalendar cal2 = new GregorianCalendar(2004, 6, 9, 13, 45);
        assertTrue(DateUtils.isSameDay(cal1, cal2));
        cal2.add(Calendar.DAY_OF_YEAR, 1);
        assertFalse(DateUtils.isSameDay(cal1, cal2));
        cal1.add(Calendar.DAY_OF_YEAR, 1);
        assertTrue(DateUtils.isSameDay(cal1, cal2));
        cal2.add(Calendar.YEAR, 1);
        assertFalse(DateUtils.isSameDay(cal1, cal2));
        try {
            DateUtils.isSameDay((Calendar) null, (Calendar) null);
            fail();
        } catch (final IllegalArgumentException ex) {}
    }
    
    //-----------------------------------------------------------------------
    @Test
    public void DateUtils83() {
        Date date1 = new GregorianCalendar(2004, 6, 9, 13, 45).getTime();
        Date date2 = new GregorianCalendar(2004, 6, 9, 13, 45).getTime();
        assertTrue(DateUtils.isSameInstant(date1, date2));
        date2 = new GregorianCalendar(2004, 6, 10, 13, 45).getTime();
        assertFalse(DateUtils.isSameInstant(date1, date2));
        date1 = new GregorianCalendar(2004, 6, 10, 13, 45).getTime();
        assertTrue(DateUtils.isSameInstant(date1, date2));
        date2 = new GregorianCalendar(2005, 6, 10, 13, 45).getTime();
        assertFalse(DateUtils.isSameInstant(date1, date2));
        try {
            DateUtils.isSameInstant((Date) null, (Date) null);
            fail();
        } catch (final IllegalArgumentException ex) {}
    }
    
    //-----------------------------------------------------------------------
    @Test
    public void DateUtils83() {
        final GregorianCalendar cal1 = new GregorianCalendar(TimeZone.getTimeZone("GMT+1"));
        final GregorianCalendar cal2 = new GregorianCalendar(TimeZone.getTimeZone("GMT-1"));
        cal1.set(2004, 6, 9, 13, 45, 0);
        cal1.set(Calendar.MILLISECOND, 0);
        cal2.set(2004, 6, 9, 13, 45, 0);
        cal2.set(Calendar.MILLISECOND, 0);
        assertFalse(DateUtils.isSameInstant(cal1, cal2));
        
        cal2.set(2004, 6, 9, 11, 45, 0);
        assertTrue(DateUtils.isSameInstant(cal1, cal2));
        try {
            DateUtils.isSameInstant((Calendar) null, (Calendar) null);
            fail();
        } catch (final IllegalArgumentException ex) {}
    }
    
    //-----------------------------------------------------------------------
    @Test
    public void DateUtils83() {
        final GregorianCalendar cal1 = new GregorianCalendar(TimeZone.getTimeZone("GMT+1"));
        final GregorianCalendar cal2 = new GregorianCalendar(TimeZone.getTimeZone("GMT-1"));
        cal1.set(2004, 6, 9, 13, 45, 0);
        cal1.set(Calendar.MILLISECOND, 0);
        cal2.set(2004, 6, 9, 13, 45, 0);
        cal2.set(Calendar.MILLISECOND, 0);
        assertTrue(DateUtils.isSameLocalTime(cal1, cal2));

        final Calendar cal3 = Calendar.getInstance();
        final Calendar cal4 = Calendar.getInstance();
        cal3.set(2004, 6, 9, 4,  0, 0);
        cal4.set(2004, 6, 9, 16, 0, 0);
        cal3.set(Calendar.MILLISECOND, 0);
        cal4.set(Calendar.MILLISECOND, 0);
        assertFalse("LANG-677", DateUtils.isSameLocalTime(cal3, cal4));
        
        cal2.set(2004, 6, 9, 11, 45, 0);
        assertFalse(DateUtils.isSameLocalTime(cal1, cal2));
        try {
            DateUtils.isSameLocalTime((Calendar) null, (Calendar) null);
            fail();
        } catch (final IllegalArgumentException ex) {}
    }
    
    //-----------------------------------------------------------------------
    @Test
    public void DateUtils83() throws Exception {
        final GregorianCalendar cal = new GregorianCalendar(1972, 11, 3);
        String dateStr = "1972-12-03";
        final String[] parsers = new String[] {"yyyy'-'DDD", "yyyy'-'MM'-'dd", "yyyyMMdd"};
        Date date = DateUtils.parseDate(dateStr, parsers);
        assertEquals(cal.getTime(), date);
        
        dateStr = "1972-338";
        date = DateUtils.parseDate(dateStr, parsers);
        assertEquals(cal.getTime(), date);
        
        dateStr = "19721203";
        date = DateUtils.parseDate(dateStr, parsers);
        assertEquals(cal.getTime(), date);
        
        try {
            DateUtils.parseDate("PURPLE", parsers);
            fail();
        } catch (final ParseException ex) {}
        try {
            DateUtils.parseDate("197212AB", parsers);
            fail();
        } catch (final ParseException ex) {}
        try {
            DateUtils.parseDate(null, parsers);
            fail();
        } catch (final IllegalArgumentException ex) {}
        try {
            DateUtils.parseDate(dateStr, (String[]) null);
            fail();
        } catch (final IllegalArgumentException ex) {}
        try {
            DateUtils.parseDate(dateStr, new String[0]);
            fail();
        } catch (final ParseException ex) {}
    }
    // LANG-486
    @Test
    public void DateUtils83() throws Exception {
        final GregorianCalendar cal = new GregorianCalendar(1998, 6, 30);
        final String dateStr = "02 942, 1996";
        final String[] parsers = new String[] {"MM DDD, yyyy"};
        
        Date date = DateUtils.parseDate(dateStr, parsers);
        assertEquals(cal.getTime(), date);
        
        try {
            date = DateUtils.parseDateStrictly(dateStr, parsers);
            fail();
        } catch (final ParseException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test
    public void DateUtils83() throws Exception {
        final Date base = new Date(MILLIS_TEST);
        Date result = DateUtils.addYears(base, 0);
        assertNotSame(base, result);
        assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        assertDate(result, 2000, 6, 5, 4, 3, 2, 1);
        
        result = DateUtils.addYears(base, 1);
        assertNotSame(base, result);
        assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        assertDate(result, 2001, 6, 5, 4, 3, 2, 1);
        
        result = DateUtils.addYears(base, -1);
        assertNotSame(base, result);
        assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        assertDate(result, 1999, 6, 5, 4, 3, 2, 1);
    }

    //-----------------------------------------------------------------------
    @Test
    public void DateUtils83() throws Exception {
        final Date base = new Date(MILLIS_TEST);
        Date result = DateUtils.addMonths(base, 0);
        assertNotSame(base, result);
        assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        assertDate(result, 2000, 6, 5, 4, 3, 2, 1);
        
        result = DateUtils.addMonths(base, 1);
        assertNotSame(base, result);
        assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        assertDate(result, 2000, 7, 5, 4, 3, 2, 1);
        
        result = DateUtils.addMonths(base, -1);
        assertNotSame(base, result);
        assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        assertDate(result, 2000, 5, 5, 4, 3, 2, 1);
    }

    //-----------------------------------------------------------------------
    @Test
    public void DateUtils83() throws Exception {
        final Date base = new Date(MILLIS_TEST);
        Date result = DateUtils.addWeeks(base, 0);
        assertNotSame(base, result);
        assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        assertDate(result, 2000, 6, 5, 4, 3, 2, 1);
        
        result = DateUtils.addWeeks(base, 1);
        assertNotSame(base, result);
        assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        assertDate(result, 2000, 6, 12, 4, 3, 2, 1);
        
        result = DateUtils.addWeeks(base, -1);
        assertNotSame(base, result);
        assertDate(base, 2000, 6, 5, 4, 3, 2, 1);      // july
        assertDate(result, 2000, 5, 28, 4, 3, 2, 1);   // june
    }

    //-----------------------------------------------------------------------
    @Test
    public void DateUtils83() throws Exception {
        final Date base = new Date(MILLIS_TEST);
        Date result = DateUtils.addDays(base, 0);
        assertNotSame(base, result);
        assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        assertDate(result, 2000, 6, 5, 4, 3, 2, 1);
        
        result = DateUtils.addDays(base, 1);
        assertNotSame(base, result);
        assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        assertDate(result, 2000, 6, 6, 4, 3, 2, 1);
        
        result = DateUtils.addDays(base, -1);
        assertNotSame(base, result);
        assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        assertDate(result, 2000, 6, 4, 4, 3, 2, 1);
    }

    //-----------------------------------------------------------------------
    @Test
    public void DateUtils83() throws Exception {
        final Date base = new Date(MILLIS_TEST);
        Date result = DateUtils.addHours(base, 0);
        assertNotSame(base, result);
        assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        assertDate(result, 2000, 6, 5, 4, 3, 2, 1);
        
        result = DateUtils.addHours(base, 1);
        assertNotSame(base, result);
        assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        assertDate(result, 2000, 6, 5, 5, 3, 2, 1);
        
        result = DateUtils.addHours(base, -1);
        assertNotSame(base, result);
        assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        assertDate(result, 2000, 6, 5, 3, 3, 2, 1);
    }

    //-----------------------------------------------------------------------
    @Test
    public void DateUtils83() throws Exception {
        final Date base = new Date(MILLIS_TEST);
        Date result = DateUtils.addMinutes(base, 0);
        assertNotSame(base, result);
        assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        assertDate(result, 2000, 6, 5, 4, 3, 2, 1);
        
        result = DateUtils.addMinutes(base, 1);
        assertNotSame(base, result);
        assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        assertDate(result, 2000, 6, 5, 4, 4, 2, 1);
        
        result = DateUtils.addMinutes(base, -1);
        assertNotSame(base, result);
        assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        assertDate(result, 2000, 6, 5, 4, 2, 2, 1);
    }

    //-----------------------------------------------------------------------
    @Test
    public void DateUtils83() throws Exception {
        final Date base = new Date(MILLIS_TEST);
        Date result = DateUtils.addSeconds(base, 0);
        assertNotSame(base, result);
        assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        assertDate(result, 2000, 6, 5, 4, 3, 2, 1);
        
        result = DateUtils.addSeconds(base, 1);
        assertNotSame(base, result);
        assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        assertDate(result, 2000, 6, 5, 4, 3, 3, 1);
        
        result = DateUtils.addSeconds(base, -1);
        assertNotSame(base, result);
        assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        assertDate(result, 2000, 6, 5, 4, 3, 1, 1);
    }

    //-----------------------------------------------------------------------
    @Test
    public void DateUtils83() throws Exception {
        final Date base = new Date(MILLIS_TEST);
        Date result = DateUtils.addMilliseconds(base, 0);
        assertNotSame(base, result);
        assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        assertDate(result, 2000, 6, 5, 4, 3, 2, 1);
        
        result = DateUtils.addMilliseconds(base, 1);
        assertNotSame(base, result);
        assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        assertDate(result, 2000, 6, 5, 4, 3, 2, 2);
        
        result = DateUtils.addMilliseconds(base, -1);
        assertNotSame(base, result);
        assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        assertDate(result, 2000, 6, 5, 4, 3, 2, 0);
    }

    // -----------------------------------------------------------------------
    @Test
    public void DateUtils83() throws Exception {
        final Date base = new Date(MILLIS_TEST);
        Date result = DateUtils.setYears(base, 2000);
        assertNotSame(base, result);
        assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        assertDate(result, 2000, 6, 5, 4, 3, 2, 1);

        result = DateUtils.setYears(base, 2008);
        assertNotSame(base, result);
        assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        assertDate(result, 2008, 6, 5, 4, 3, 2, 1);

        result = DateUtils.setYears(base, 2005);
        assertNotSame(base, result);
        assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        assertDate(result, 2005, 6, 5, 4, 3, 2, 1);
    }

    // -----------------------------------------------------------------------
    @Test
    public void DateUtils83() throws Exception {
        final Date base = new Date(MILLIS_TEST);
        Date result = DateUtils.setMonths(base, 5);
        assertNotSame(base, result);
        assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        assertDate(result, 2000, 5, 5, 4, 3, 2, 1);

        result = DateUtils.setMonths(base, 1);
        assertNotSame(base, result);
        assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        assertDate(result, 2000, 1, 5, 4, 3, 2, 1);

        try {
            result = DateUtils.setMonths(base, 12);
            fail("DateUtils.setMonths did not throw an expected IllegalArguementException.");
        } catch (final IllegalArgumentException e) {

        }
    }

    // -----------------------------------------------------------------------
    @Test
    public void DateUtils83() throws Exception {
        final Date base = new Date(MILLIS_TEST);
        Date result = DateUtils.setDays(base, 1);
        assertNotSame(base, result);
        assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        assertDate(result, 2000, 6, 1, 4, 3, 2, 1);

        result = DateUtils.setDays(base, 29);
        assertNotSame(base, result);
        assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        assertDate(result, 2000, 6, 29, 4, 3, 2, 1);

        try {
            result = DateUtils.setDays(base, 32);
            fail("DateUtils.setDays did not throw an expected IllegalArguementException.");
        } catch (final IllegalArgumentException e) {

        }
    }

    // -----------------------------------------------------------------------
    @Test
    public void DateUtils83() throws Exception {
        final Date base = new Date(MILLIS_TEST);
        Date result = DateUtils.setHours(base, 0);
        assertNotSame(base, result);
        assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        assertDate(result, 2000, 6, 5, 0, 3, 2, 1);

        result = DateUtils.setHours(base, 23);
        assertNotSame(base, result);
        assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        assertDate(result, 2000, 6, 5, 23, 3, 2, 1);

        try {
            result = DateUtils.setHours(base, 24);
            fail("DateUtils.setHours did not throw an expected IllegalArguementException.");
        } catch (final IllegalArgumentException e) {

        }
    }

    // -----------------------------------------------------------------------
    @Test
    public void DateUtils83() throws Exception {
        final Date base = new Date(MILLIS_TEST);
        Date result = DateUtils.setMinutes(base, 0);
        assertNotSame(base, result);
        assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        assertDate(result, 2000, 6, 5, 4, 0, 2, 1);

        result = DateUtils.setMinutes(base, 59);
        assertNotSame(base, result);
        assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        assertDate(result, 2000, 6, 5, 4, 59, 2, 1);

        try {
            result = DateUtils.setMinutes(base, 60);
            fail("DateUtils.setMinutes did not throw an expected IllegalArguementException.");
        } catch (final IllegalArgumentException e) {

        }
    }

    // -----------------------------------------------------------------------
    @Test
    public void DateUtils83() throws Exception {
        final Date base = new Date(MILLIS_TEST);
        Date result = DateUtils.setSeconds(base, 0);
        assertNotSame(base, result);
        assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        assertDate(result, 2000, 6, 5, 4, 3, 0, 1);

        result = DateUtils.setSeconds(base, 59);
        assertNotSame(base, result);
        assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        assertDate(result, 2000, 6, 5, 4, 3, 59, 1);

        try {
            result = DateUtils.setSeconds(base, 60);
            fail("DateUtils.setSeconds did not throw an expected IllegalArguementException.");
        } catch (final IllegalArgumentException e) {

        }
    }

    // -----------------------------------------------------------------------
    @Test
    public void DateUtils83() throws Exception {
        final Date base = new Date(MILLIS_TEST);
        Date result = DateUtils.setMilliseconds(base, 0);
        assertNotSame(base, result);
        assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        assertDate(result, 2000, 6, 5, 4, 3, 2, 0);

        result = DateUtils.setMilliseconds(base, 999);
        assertNotSame(base, result);
        assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        assertDate(result, 2000, 6, 5, 4, 3, 2, 999);

        try {
            result = DateUtils.setMilliseconds(base, 1000);
            fail("DateUtils.setMilliseconds did not throw an expected IllegalArguementException.");
        } catch (final IllegalArgumentException e) {

        }
    }

    //-----------------------------------------------------------------------
    private void assertDate(final Date date, final int year, final int month, final int day, final int hour, final int min, final int sec, final int mil) throws Exception {
        final GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        assertEquals(year, cal.get(Calendar.YEAR));
        assertEquals(month, cal.get(Calendar.MONTH));
        assertEquals(day, cal.get(Calendar.DAY_OF_MONTH));
        assertEquals(hour, cal.get(Calendar.HOUR_OF_DAY));
        assertEquals(min, cal.get(Calendar.MINUTE));
        assertEquals(sec, cal.get(Calendar.SECOND));
        assertEquals(mil, cal.get(Calendar.MILLISECOND));
    }

    //-----------------------------------------------------------------------
    @Test
    public void DateUtils83() {
        assertEquals("Failed to convert to a Calendar and back", date1, DateUtils.toCalendar(date1).getTime());
        try {
            DateUtils.toCalendar(null);
            fail("Expected NullPointerException to be thrown");
        } catch(final NullPointerException npe) {
            // expected
        }
    }

    //-----------------------------------------------------------------------
    /**
     * Tests various values with the round method
     */
    @Test
    public void DateUtils83() throws Exception {
        // tests for public static Date round(Date date, int field)
        assertEquals("round year-1 failed",
                dateParser.parse("January 1, 2002"),
                DateUtils.round(date1, Calendar.YEAR));
        assertEquals("round year-2 failed",
                dateParser.parse("January 1, 2002"),
                DateUtils.round(date2, Calendar.YEAR));
        assertEquals("round month-1 failed",
                dateParser.parse("February 1, 2002"),
                DateUtils.round(date1, Calendar.MONTH));
        assertEquals("round month-2 failed",
                dateParser.parse("December 1, 2001"),
                DateUtils.round(date2, Calendar.MONTH));
        assertEquals("round semimonth-0 failed",
                dateParser.parse("February 1, 2002"),
                DateUtils.round(date0, DateUtils.SEMI_MONTH));
        assertEquals("round semimonth-1 failed",
                dateParser.parse("February 16, 2002"),
                DateUtils.round(date1, DateUtils.SEMI_MONTH));
        assertEquals("round semimonth-2 failed",
                dateParser.parse("November 16, 2001"),
                DateUtils.round(date2, DateUtils.SEMI_MONTH));
        
        
        assertEquals("round date-1 failed",
                dateParser.parse("February 13, 2002"),
                DateUtils.round(date1, Calendar.DATE));
        assertEquals("round date-2 failed",
                dateParser.parse("November 18, 2001"),
                DateUtils.round(date2, Calendar.DATE));
        assertEquals("round hour-1 failed",
                dateTimeParser.parse("February 12, 2002 13:00:00.000"),
                DateUtils.round(date1, Calendar.HOUR));
        assertEquals("round hour-2 failed",
                dateTimeParser.parse("November 18, 2001 1:00:00.000"),
                DateUtils.round(date2, Calendar.HOUR));
        assertEquals("round minute-1 failed",
                dateTimeParser.parse("February 12, 2002 12:35:00.000"),
                DateUtils.round(date1, Calendar.MINUTE));
        assertEquals("round minute-2 failed",
                dateTimeParser.parse("November 18, 2001 1:23:00.000"),
                DateUtils.round(date2, Calendar.MINUTE));
        assertEquals("round second-1 failed",
                dateTimeParser.parse("February 12, 2002 12:34:57.000"),
                DateUtils.round(date1, Calendar.SECOND));
        assertEquals("round second-2 failed",
                dateTimeParser.parse("November 18, 2001 1:23:11.000"),
                DateUtils.round(date2, Calendar.SECOND));
        assertEquals("round ampm-1 failed",
                dateTimeParser.parse("February 3, 2002 00:00:00.000"),
                DateUtils.round(dateAmPm1, Calendar.AM_PM));
        assertEquals("round ampm-2 failed",
                dateTimeParser.parse("February 3, 2002 12:00:00.000"),
                DateUtils.round(dateAmPm2, Calendar.AM_PM));
        assertEquals("round ampm-3 failed",
                dateTimeParser.parse("February 3, 2002 12:00:00.000"),
                DateUtils.round(dateAmPm3, Calendar.AM_PM));
        assertEquals("round ampm-4 failed",
                dateTimeParser.parse("February 4, 2002 00:00:00.000"),
                DateUtils.round(dateAmPm4, Calendar.AM_PM));

        // tests for public static Date round(Object date, int field)
        assertEquals("round year-1 failed",
                dateParser.parse("January 1, 2002"),
                DateUtils.round((Object) date1, Calendar.YEAR));
        assertEquals("round year-2 failed",
                dateParser.parse("January 1, 2002"),
                DateUtils.round((Object) date2, Calendar.YEAR));
        assertEquals("round month-1 failed",
                dateParser.parse("February 1, 2002"),
                DateUtils.round((Object) date1, Calendar.MONTH));
        assertEquals("round month-2 failed",
                dateParser.parse("December 1, 2001"),
                DateUtils.round((Object) date2, Calendar.MONTH));
        assertEquals("round semimonth-1 failed",
                dateParser.parse("February 16, 2002"),
                DateUtils.round((Object) date1, DateUtils.SEMI_MONTH));
        assertEquals("round semimonth-2 failed",
                dateParser.parse("November 16, 2001"),
                DateUtils.round((Object) date2, DateUtils.SEMI_MONTH));
        assertEquals("round date-1 failed",
                dateParser.parse("February 13, 2002"),
                DateUtils.round((Object) date1, Calendar.DATE));
        assertEquals("round date-2 failed",
                dateParser.parse("November 18, 2001"),
                DateUtils.round((Object) date2, Calendar.DATE));
        assertEquals("round hour-1 failed",
                dateTimeParser.parse("February 12, 2002 13:00:00.000"),
                DateUtils.round((Object) date1, Calendar.HOUR));
        assertEquals("round hour-2 failed",
                dateTimeParser.parse("November 18, 2001 1:00:00.000"),
                DateUtils.round((Object) date2, Calendar.HOUR));
        assertEquals("round minute-1 failed",
                dateTimeParser.parse("February 12, 2002 12:35:00.000"),
                DateUtils.round((Object) date1, Calendar.MINUTE));
        assertEquals("round minute-2 failed",
                dateTimeParser.parse("November 18, 2001 1:23:00.000"),
                DateUtils.round((Object) date2, Calendar.MINUTE));
        assertEquals("round second-1 failed",
                dateTimeParser.parse("February 12, 2002 12:34:57.000"),
                DateUtils.round((Object) date1, Calendar.SECOND));
        assertEquals("round second-2 failed",
                dateTimeParser.parse("November 18, 2001 1:23:11.000"),
                DateUtils.round((Object) date2, Calendar.SECOND));
        assertEquals("round calendar second-1 failed",
                dateTimeParser.parse("February 12, 2002 12:34:57.000"),
                DateUtils.round((Object) cal1, Calendar.SECOND));
        assertEquals("round calendar second-2 failed",
                dateTimeParser.parse("November 18, 2001 1:23:11.000"),
                DateUtils.round((Object) cal2, Calendar.SECOND));
        assertEquals("round ampm-1 failed",
                dateTimeParser.parse("February 3, 2002 00:00:00.000"),
                DateUtils.round((Object) dateAmPm1, Calendar.AM_PM));
        assertEquals("round ampm-2 failed",
                dateTimeParser.parse("February 3, 2002 12:00:00.000"),
                DateUtils.round((Object) dateAmPm2, Calendar.AM_PM));
        assertEquals("round ampm-3 failed",
                dateTimeParser.parse("February 3, 2002 12:00:00.000"),
                DateUtils.round((Object) dateAmPm3, Calendar.AM_PM));
        assertEquals("round ampm-4 failed",
                dateTimeParser.parse("February 4, 2002 00:00:00.000"),
                DateUtils.round((Object) dateAmPm4, Calendar.AM_PM));

        try {
            DateUtils.round((Date) null, Calendar.SECOND);
            fail();
        } catch (final IllegalArgumentException ex) {}
        try {
            DateUtils.round((Calendar) null, Calendar.SECOND);
            fail();
        } catch (final IllegalArgumentException ex) {}
        try {
            DateUtils.round((Object) null, Calendar.SECOND);
            fail();
        } catch (final IllegalArgumentException ex) {}
        try {
            DateUtils.round("", Calendar.SECOND);
            fail();
        } catch (final ClassCastException ex) {}
        try {
            DateUtils.round(date1, -9999);
            fail();
        } catch(final IllegalArgumentException ex) {}

        assertEquals("round ampm-1 failed",
                dateTimeParser.parse("February 3, 2002 00:00:00.000"),
                DateUtils.round((Object) calAmPm1, Calendar.AM_PM));
        assertEquals("round ampm-2 failed",
                dateTimeParser.parse("February 3, 2002 12:00:00.000"),
                DateUtils.round((Object) calAmPm2, Calendar.AM_PM));
        assertEquals("round ampm-3 failed",
                dateTimeParser.parse("February 3, 2002 12:00:00.000"),
                DateUtils.round((Object) calAmPm3, Calendar.AM_PM));
        assertEquals("round ampm-4 failed",
                dateTimeParser.parse("February 4, 2002 00:00:00.000"),
                DateUtils.round((Object) calAmPm4, Calendar.AM_PM));
        
        // Fix for http://issues.apache.org/bugzilla/show_bug.cgi?id=25560 / LANG-13
        // Test rounding across the beginning of daylight saving time
        TimeZone.setDefault(zone);
        dateTimeParser.setTimeZone(zone);
        assertEquals("round MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 00:00:00.000"),
                DateUtils.round(date4, Calendar.DATE));
        assertEquals("round MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 00:00:00.000"),
                DateUtils.round((Object) cal4, Calendar.DATE));
        assertEquals("round MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 00:00:00.000"),
                DateUtils.round(date5, Calendar.DATE));
        assertEquals("round MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 00:00:00.000"),
                DateUtils.round((Object) cal5, Calendar.DATE));
        assertEquals("round MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 00:00:00.000"),
                DateUtils.round(date6, Calendar.DATE));
        assertEquals("round MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 00:00:00.000"),
                DateUtils.round((Object) cal6, Calendar.DATE));
        assertEquals("round MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 00:00:00.000"),
                DateUtils.round(date7, Calendar.DATE));
        assertEquals("round MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 00:00:00.000"),
                DateUtils.round((Object) cal7, Calendar.DATE));
        
        assertEquals("round MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 01:00:00.000"),
                DateUtils.round(date4, Calendar.HOUR_OF_DAY));
        assertEquals("round MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 01:00:00.000"),
                DateUtils.round((Object) cal4, Calendar.HOUR_OF_DAY));
        if (SystemUtils.isJavaVersionAtLeast(JAVA_1_4)) {
            assertEquals("round MET date across DST change-over",
                    dateTimeParser.parse("March 30, 2003 03:00:00.000"),
                    DateUtils.round(date5, Calendar.HOUR_OF_DAY));
            assertEquals("round MET date across DST change-over",
                    dateTimeParser.parse("March 30, 2003 03:00:00.000"),
                    DateUtils.round((Object) cal5, Calendar.HOUR_OF_DAY));
            assertEquals("round MET date across DST change-over",
                    dateTimeParser.parse("March 30, 2003 03:00:00.000"),
                    DateUtils.round(date6, Calendar.HOUR_OF_DAY));
            assertEquals("round MET date across DST change-over",
                    dateTimeParser.parse("March 30, 2003 03:00:00.000"),
                    DateUtils.round((Object) cal6, Calendar.HOUR_OF_DAY));
            assertEquals("round MET date across DST change-over",
                    dateTimeParser.parse("March 30, 2003 04:00:00.000"),
                    DateUtils.round(date7, Calendar.HOUR_OF_DAY));
            assertEquals("round MET date across DST change-over",
                    dateTimeParser.parse("March 30, 2003 04:00:00.000"),
                    DateUtils.round((Object) cal7, Calendar.HOUR_OF_DAY));
        } else {
            this.warn("WARNING: Some date rounding tests not run since the current version is " + SystemUtils.JAVA_SPECIFICATION_VERSION);
        }
        TimeZone.setDefault(defaultZone);
        dateTimeParser.setTimeZone(defaultZone);
    }

    /**
     * Tests the Changes Made by LANG-346 to the DateUtils.modify() private method invoked
     * by DateUtils.round().
     */
    @Test
    public void DateUtils83() throws Exception
    {
        TimeZone.setDefault(defaultZone);
        dateTimeParser.setTimeZone(defaultZone);
        final Calendar testCalendar = Calendar.getInstance();
        testCalendar.set(2007, 6, 2, 8, 8, 50);
        Date date = testCalendar.getTime();
        assertEquals("Minute Round Up Failed",
                     dateTimeParser.parse("July 2, 2007 08:09:00.000"),
                     DateUtils.round(date, Calendar.MINUTE));

        testCalendar.set(2007, 6, 2, 8, 8, 20);
        date = testCalendar.getTime();
        assertEquals("Minute No Round Failed",
                     dateTimeParser.parse("July 2, 2007 08:08:00.000"),
                     DateUtils.round(date, Calendar.MINUTE));

        testCalendar.set(2007, 6, 2, 8, 8, 50);
        testCalendar.set(Calendar.MILLISECOND, 600);
        date = testCalendar.getTime();

        assertEquals("Second Round Up with 600 Milli Seconds Failed",
                     dateTimeParser.parse("July 2, 2007 08:08:51.000"),
                     DateUtils.round(date, Calendar.SECOND));

        testCalendar.set(2007, 6, 2, 8, 8, 50);
        testCalendar.set(Calendar.MILLISECOND, 200);
        date = testCalendar.getTime();
        assertEquals("Second Round Down with 200 Milli Seconds Failed",
                     dateTimeParser.parse("July 2, 2007 08:08:50.000"),
                     DateUtils.round(date, Calendar.SECOND));

        testCalendar.set(2007, 6, 2, 8, 8, 20);
        testCalendar.set(Calendar.MILLISECOND, 600);
        date = testCalendar.getTime();
        assertEquals("Second Round Up with 200 Milli Seconds Failed",
                     dateTimeParser.parse("July 2, 2007 08:08:21.000"),
                     DateUtils.round(date, Calendar.SECOND));

        testCalendar.set(2007, 6, 2, 8, 8, 20);
        testCalendar.set(Calendar.MILLISECOND, 200);
        date = testCalendar.getTime();
        assertEquals("Second Round Down with 200 Milli Seconds Failed",
                     dateTimeParser.parse("July 2, 2007 08:08:20.000"),
                     DateUtils.round(date, Calendar.SECOND));

        testCalendar.set(2007, 6, 2, 8, 8, 50);
        date = testCalendar.getTime();
        assertEquals("Hour Round Down Failed",
                     dateTimeParser.parse("July 2, 2007 08:00:00.000"),
                     DateUtils.round(date, Calendar.HOUR));

        testCalendar.set(2007, 6, 2, 8, 31, 50);
        date = testCalendar.getTime();
        assertEquals("Hour Round Up Failed",
                     dateTimeParser.parse("July 2, 2007 09:00:00.000"),
                     DateUtils.round(date, Calendar.HOUR));
    }

    /**
     * Tests various values with the trunc method
     */

}

