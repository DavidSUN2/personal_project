
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

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * These Unit-tests will check all possible extremes when using some rounding-methods of DateUtils.
 * The extremes are tested at the switch-point in milliseconds
 * 
 * According to the implementation SEMI_MONTH will either round/truncate to the 1st or 16th
 * When rounding Calendar.MONTH it depends on the number of days within that month.
 * A month with 28 days will be rounded up from the 15th
 * A month with 29 or 30 days will be rounded up from the 16th
 * A month with 31 days will be rounded up from the 17th
 * 
 * @since 3.0
 * @version $Id$
 */
public class DateUtilsRoundingTest {

    DateFormat dateTimeParser;
    
    Date januaryOneDate;
    Date targetYearDate;
    //No targetMonths, these must be tested for every type of month(28-31 days)
    Date targetDateDate, targetDayOfMonthDate, targetAmDate, targetPmDate;
    Date targetHourOfDayDate, targetHourDate;
    Date targetMinuteDate;
    Date targetSecondDate;
    Date targetMilliSecondDate;

    Calendar januaryOneCalendar;
    FastDateFormat fdf = DateFormatUtils.ISO_DATETIME_FORMAT;


    @Before
    public void setUp() throws Exception {

        dateTimeParser = new SimpleDateFormat("MMM dd, yyyy H:mm:ss.SSS", Locale.ENGLISH);
        
        targetYearDate = dateTimeParser.parse("January 1, 2007 0:00:00.000");
        targetDateDate = targetDayOfMonthDate = dateTimeParser.parse("June 1, 2008 0:00:00.000");
        targetAmDate =  dateTimeParser.parse("June 1, 2008 0:00:00.000");
        targetPmDate = dateTimeParser.parse("June 1, 2008 12:00:00.000");
        targetHourDate = dateTimeParser.parse("June 1, 2008 8:00:00.000");
        targetHourOfDayDate = dateTimeParser.parse("June 1, 2008 8:00:00.000");
        targetMinuteDate =  dateTimeParser.parse("June 1, 2008 8:15:00.000");
        targetSecondDate =  dateTimeParser.parse("June 1, 2008 8:15:14.000");
        targetMilliSecondDate =  dateTimeParser.parse("June 1, 2008 8:15:14.231");
        
        januaryOneDate = dateTimeParser.parse("January 1, 2008 0:00:00.000");
        januaryOneCalendar = Calendar.getInstance();
        januaryOneCalendar.setTime(januaryOneDate);
    }

    /**
     * Tests DateUtils.round()-method with Calendar.Year
     * 
     * @throws Exception
     * @since 3.0
     */
    @Test
    public void DateUtils85() throws Exception {
        final int calendarField = Calendar.YEAR;
        final Date roundedUpDate = dateTimeParser.parse("January 1, 2008 0:00:00.000");
        final Date roundedDownDate = targetYearDate;
        final Date lastRoundedDownDate = dateTimeParser.parse("June 30, 2007 23:59:59.999");
        baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);
    }
    
    /**
     * Tests DateUtils.round()-method with Calendar.MONTH
     * Includes rounding months with 28, 29, 30 and 31 days
     * Includes rounding to January 1
     * 
     * @throws Exception
     * @since 3.0
     */
    @Test
    public void DateUtils85() throws Exception {
        final int calendarField = Calendar.MONTH;
        Date roundedUpDate, roundedDownDate, lastRoundedDownDate;
        Date minDate, maxDate;
        
        //month with 28 days
        roundedUpDate = dateTimeParser.parse("March 1, 2007 0:00:00.000");
        roundedDownDate = dateTimeParser.parse("February 1, 2007 0:00:00.000");
        lastRoundedDownDate = dateTimeParser.parse("February 14, 2007 23:59:59.999");
        baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);

        //month with 29 days
        roundedUpDate = dateTimeParser.parse("March 1, 2008 0:00:00.000");
        roundedDownDate = dateTimeParser.parse("February 1, 2008 0:00:00.000");
        lastRoundedDownDate = dateTimeParser.parse("February 15, 2008 23:59:59.999");
        baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);
        
        //month with 30 days
        roundedUpDate = dateTimeParser.parse("May 1, 2008 0:00:00.000");
        roundedDownDate = dateTimeParser.parse("April 1, 2008 0:00:00.000");
        lastRoundedDownDate = dateTimeParser.parse("April 15, 2008 23:59:59.999");
        baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);
        
        //month with 31 days
        roundedUpDate = dateTimeParser.parse("June 1, 2008 0:00:00.000");
        roundedDownDate = dateTimeParser.parse("May 1, 2008 0:00:00.000");
        lastRoundedDownDate = dateTimeParser.parse("May 16, 2008 23:59:59.999");
        baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);
        
        //round to January 1
        minDate = dateTimeParser.parse("December 17, 2007 00:00:00.000");
        maxDate = dateTimeParser.parse("January 16, 2008 23:59:59.999");
        roundToJanuaryFirst(minDate, maxDate, calendarField);
    }
    
    /**
     * Tests DateUtils.round()-method with DateUtils.SEMI_MONTH
     * Includes rounding months with 28, 29, 30 and 31 days, each with first and second half 
     * Includes rounding to January 1
     *      
     * @throws Exception
     * @since 3.0
     */
    @Test
    public void DateUtils85() throws Exception {
        final int calendarField = DateUtils.SEMI_MONTH;
        Date roundedUpDate, roundedDownDate, lastRoundedDownDate;
        Date minDate, maxDate;
        
        //month with 28 days (1)
        roundedUpDate = dateTimeParser.parse("February 16, 2007 0:00:00.000");
        roundedDownDate = dateTimeParser.parse("February 1, 2007 0:00:00.000");
        lastRoundedDownDate = dateTimeParser.parse("February 8, 2007 23:59:59.999");
        baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);

        //month with 28 days (2)
        roundedUpDate = dateTimeParser.parse("March 1, 2007 0:00:00.000");
        roundedDownDate = dateTimeParser.parse("February 16, 2007 0:00:00.000");
        lastRoundedDownDate = dateTimeParser.parse("February 23, 2007 23:59:59.999");
        baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);

        //month with 29 days (1)
        roundedUpDate = dateTimeParser.parse("February 16, 2008 0:00:00.000");
        roundedDownDate = dateTimeParser.parse("February 1, 2008 0:00:00.000");
        lastRoundedDownDate = dateTimeParser.parse("February 8, 2008 23:59:59.999");
        baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);
        
        //month with 29 days (2)
        roundedUpDate = dateTimeParser.parse("March 1, 2008 0:00:00.000");
        roundedDownDate = dateTimeParser.parse("February 16, 2008 0:00:00.000");
        lastRoundedDownDate = dateTimeParser.parse("February 23, 2008 23:59:59.999");
        baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);

        //month with 30 days (1)
        roundedUpDate = dateTimeParser.parse("April 16, 2008 0:00:00.000");
        roundedDownDate = dateTimeParser.parse("April 1, 2008 0:00:00.000");
        lastRoundedDownDate = dateTimeParser.parse("April 8, 2008 23:59:59.999");
        baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);

        //month with 30 days (2)
        roundedUpDate = dateTimeParser.parse("May 1, 2008 0:00:00.000");
        roundedDownDate = dateTimeParser.parse("April 16, 2008 0:00:00.000");
        lastRoundedDownDate = dateTimeParser.parse("April 23, 2008 23:59:59.999");
        baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);
        
        //month with 31 days (1)
        roundedUpDate = dateTimeParser.parse("May 16, 2008 0:00:00.000");
        roundedDownDate = dateTimeParser.parse("May 1, 2008 0:00:00.000");
        lastRoundedDownDate = dateTimeParser.parse("May 8, 2008 23:59:59.999");
        baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);

        //month with 31 days (2)
        roundedUpDate = dateTimeParser.parse("June 1, 2008 0:00:00.000");
        roundedDownDate = dateTimeParser.parse("May 16, 2008 0:00:00.000");
        lastRoundedDownDate = dateTimeParser.parse("May 23, 2008 23:59:59.999");
        baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);
        
        //round to January 1
        minDate = dateTimeParser.parse("December 24, 2007 00:00:00.000");
        maxDate = dateTimeParser.parse("January 8, 2008 23:59:59.999");
        roundToJanuaryFirst(minDate, maxDate, calendarField);
    }
    
    /**
     * Tests DateUtils.round()-method with Calendar.DATE
     * Includes rounding the extremes of one day 
     * Includes rounding to January 1
     * 
     * @throws Exception
     * @since 3.0
     */
    @Test
    public void DateUtils85() throws Exception {
        final int calendarField = Calendar.DATE;
        Date roundedUpDate, roundedDownDate, lastRoundedDownDate;
        Date minDate, maxDate;

        roundedUpDate = dateTimeParser.parse("June 2, 2008 0:00:00.000");
        roundedDownDate = targetDateDate;
        lastRoundedDownDate = dateTimeParser.parse("June 1, 2008 11:59:59.999");
        baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);
        
        //round to January 1
        minDate = dateTimeParser.parse("December 31, 2007 12:00:00.000");
        maxDate = dateTimeParser.parse("January 1, 2008 11:59:59.999");
        roundToJanuaryFirst(minDate, maxDate, calendarField);
    }
    
    /**
     * Tests DateUtils.round()-method with Calendar.DAY_OF_MONTH
     * Includes rounding the extremes of one day 
     * Includes rounding to January 1
     * 
     * @throws Exception
     * @since 3.0
     */
    @Test
    public void DateUtils85() throws Exception {
        final int calendarField = Calendar.DAY_OF_MONTH;
        Date roundedUpDate, roundedDownDate, lastRoundedDownDate;
        Date minDate, maxDate;

        roundedUpDate = dateTimeParser.parse("June 2, 2008 0:00:00.000");
        roundedDownDate = targetDayOfMonthDate;
        lastRoundedDownDate = dateTimeParser.parse("June 1, 2008 11:59:59.999");
        baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);
        
        //round to January 1
        minDate = dateTimeParser.parse("December 31, 2007 12:00:00.000");
        maxDate = dateTimeParser.parse("January 1, 2008 11:59:59.999");
        roundToJanuaryFirst(minDate, maxDate, calendarField);
    }
    
    /**
     * Tests DateUtils.round()-method with Calendar.AM_PM
     * Includes rounding the extremes of both AM and PM of one day 
     * Includes rounding to January 1
     * 
     * @throws Exception
     * @since 3.0
     */
    @Test
    public void DateUtils85() throws Exception {
        final int calendarField = Calendar.AM_PM;
        Date roundedUpDate, roundedDownDate, lastRoundedDownDate;
        Date minDate, maxDate;

        //AM
        roundedUpDate = dateTimeParser.parse("June 1, 2008 12:00:00.000");
        roundedDownDate = targetAmDate;
        lastRoundedDownDate = dateTimeParser.parse("June 1, 2008 5:59:59.999");
        baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);

        //PM
        roundedUpDate = dateTimeParser.parse("June 2, 2008 0:00:00.000");
        roundedDownDate = targetPmDate;
        lastRoundedDownDate = dateTimeParser.parse("June 1, 2008 17:59:59.999");
        baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);

        //round to January 1
        minDate = dateTimeParser.parse("December 31, 2007 18:00:00.000");
        maxDate = dateTimeParser.parse("January 1, 2008 5:59:59.999");
        roundToJanuaryFirst(minDate, maxDate, calendarField);
    }
    
    /**
     * Tests DateUtils.round()-method with Calendar.HOUR_OF_DAY
     * Includes rounding the extremes of one hour 
     * Includes rounding to January 1
     * 
     * @throws Exception
     * @since 3.0
     */
    @Test
    public void DateUtils85() throws Exception {
        final int calendarField = Calendar.HOUR_OF_DAY;
        Date roundedUpDate, roundedDownDate, lastRoundedDownDate;
        Date minDate, maxDate;

        roundedUpDate = dateTimeParser.parse("June 1, 2008 9:00:00.000");
        roundedDownDate = targetHourOfDayDate;
        lastRoundedDownDate = dateTimeParser.parse("June 1, 2008 8:29:59.999");
        baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);
        
        //round to January 1
        minDate = dateTimeParser.parse("December 31, 2007 23:30:00.000");
        maxDate = dateTimeParser.parse("January 1, 2008 0:29:59.999");
        roundToJanuaryFirst(minDate, maxDate, calendarField);
    }
    
    /**
     * Tests DateUtils.round()-method with Calendar.HOUR
     * Includes rounding the extremes of one hour 
     * Includes rounding to January 1
     * 
     * @throws Exception
     * @since 3.0
     */
    @Test
    public void DateUtils85() throws Exception {
        final int calendarField = Calendar.HOUR;
        Date roundedUpDate, roundedDownDate, lastRoundedDownDate;
        Date minDate, maxDate;

        roundedUpDate = dateTimeParser.parse("June 1, 2008 9:00:00.000");
        roundedDownDate = targetHourDate;
        lastRoundedDownDate = dateTimeParser.parse("June 1, 2008 8:29:59.999");
        baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);
        
        //round to January 1
        minDate = dateTimeParser.parse("December 31, 2007 23:30:00.000");
        maxDate = dateTimeParser.parse("January 1, 2008 0:29:59.999");
        roundToJanuaryFirst(minDate, maxDate, calendarField);
    }
    
    /**
     * Tests DateUtils.round()-method with Calendar.MINUTE
     * Includes rounding the extremes of one minute 
     * Includes rounding to January 1
     * 
     * @throws Exception
     * @since 3.0
     */
    @Test
    public void DateUtils85() throws Exception {
        final int calendarField = Calendar.MINUTE;
        Date roundedUpDate, roundedDownDate, lastRoundedDownDate;
        Date minDate, maxDate;

        roundedUpDate = dateTimeParser.parse("June 1, 2008 8:16:00.000");
        roundedDownDate = targetMinuteDate;
        lastRoundedDownDate = dateTimeParser.parse("June 1, 2008 8:15:29.999");
        baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);
        
        //round to January 1
        minDate = dateTimeParser.parse("December 31, 2007 23:59:30.000");
        maxDate = dateTimeParser.parse("January 1, 2008 0:00:29.999");
        roundToJanuaryFirst(minDate, maxDate, calendarField);
    }
    
    /**
     * Tests DateUtils.round()-method with Calendar.SECOND
     * Includes rounding the extremes of one second 
     * Includes rounding to January 1
     * 
     * @throws Exception
     * @since 3.0
     */
    @Test
    public void DateUtils85() throws Exception {
        final int calendarField = Calendar.SECOND;
        Date roundedUpDate, roundedDownDate, lastRoundedDownDate;
        Date minDate, maxDate;

        roundedUpDate = dateTimeParser.parse("June 1, 2008 8:15:15.000");
        roundedDownDate = targetSecondDate;
        lastRoundedDownDate = dateTimeParser.parse("June 1, 2008 8:15:14.499");
        baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);
        
        //round to January 1
        minDate = dateTimeParser.parse("December 31, 2007 23:59:59.500");
        maxDate = dateTimeParser.parse("January 1, 2008 0:00:00.499");
        roundToJanuaryFirst(minDate, maxDate, calendarField);
    }
    
    /**
     * Tests DateUtils.round()-method with Calendar.MILLISECOND
     * Includes rounding the extremes of one second 
     * Includes rounding to January 1
     * 
     * @throws Exception
     * @since 3.0
     */
    @Test
    public void DateUtils85() throws Exception {
        final int calendarField = Calendar.MILLISECOND;
        Date roundedUpDate, roundedDownDate, lastRoundedDownDate;
        Date minDate, maxDate;

        roundedDownDate = lastRoundedDownDate = targetMilliSecondDate;
        roundedUpDate = dateTimeParser.parse("June 1, 2008 8:15:14.232");
        baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);
        
        //round to January 1
        minDate = maxDate = januaryOneDate;
        roundToJanuaryFirst(minDate, maxDate, calendarField);
    }
    
    /**
     * Test DateUtils.truncate()-method with Calendar.YEAR
     * 
     * @throws Exception
     * @since 3.0
     */
    @Test
    public void DateUtils85() throws Exception {
        final int calendarField = Calendar.YEAR;
        final Date lastTruncateDate = dateTimeParser.parse("December 31, 2007 23:59:59.999");
        baseTruncateTest(targetYearDate, lastTruncateDate, calendarField);
    }

    /**
     * Test DateUtils.truncate()-method with Calendar.MONTH
     * 
     * @throws Exception
     * @since 3.0
     */
    @Test
    public void DateUtils85() throws Exception {
        final int calendarField = Calendar.MONTH;
        final Date truncatedDate = dateTimeParser.parse("March 1, 2008 0:00:00.000");
        final Date lastTruncateDate = dateTimeParser.parse("March 31, 2008 23:59:59.999");
        baseTruncateTest(truncatedDate, lastTruncateDate, calendarField);
    }

    /**
     * Test DateUtils.truncate()-method with DateUtils.SEMI_MONTH
     * Includes truncating months with 28, 29, 30 and 31 days, each with first and second half
     * 
     * @throws Exception
     * @since 3.0
     */
    @Test
    public void DateUtils85() throws Exception {
        final int calendarField = DateUtils.SEMI_MONTH;
        Date truncatedDate, lastTruncateDate;
        
        //month with 28 days (1)
        truncatedDate = dateTimeParser.parse("February 1, 2007 0:00:00.000");
        lastTruncateDate = dateTimeParser.parse("February 15, 2007 23:59:59.999");
        baseTruncateTest(truncatedDate, lastTruncateDate, calendarField);

        //month with 28 days (2)
        truncatedDate = dateTimeParser.parse("February 16, 2007 0:00:00.000");
        lastTruncateDate = dateTimeParser.parse("February 28, 2007 23:59:59.999");
        baseTruncateTest(truncatedDate, lastTruncateDate, calendarField);

        //month with 29 days (1)
        truncatedDate = dateTimeParser.parse("February 1, 2008 0:00:00.000");
        lastTruncateDate = dateTimeParser.parse("February 15, 2008 23:59:59.999");
        baseTruncateTest(truncatedDate, lastTruncateDate, calendarField);

        //month with 29 days (2)
        truncatedDate = dateTimeParser.parse("February 16, 2008 0:00:00.000");
        lastTruncateDate = dateTimeParser.parse("February 29, 2008 23:59:59.999");
        baseTruncateTest(truncatedDate, lastTruncateDate, calendarField);

        //month with 30 days (1)
        truncatedDate = dateTimeParser.parse("April 1, 2008 0:00:00.000");
        lastTruncateDate = dateTimeParser.parse("April 15, 2008 23:59:59.999");
        baseTruncateTest(truncatedDate, lastTruncateDate, calendarField);

        //month with 30 days (2)
        truncatedDate = dateTimeParser.parse("April 16, 2008 0:00:00.000");
        lastTruncateDate = dateTimeParser.parse("April 30, 2008 23:59:59.999");
        baseTruncateTest(truncatedDate, lastTruncateDate, calendarField);
        
        //month with 31 days (1)
        truncatedDate = dateTimeParser.parse("March 1, 2008 0:00:00.000");
        lastTruncateDate = dateTimeParser.parse("March 15, 2008 23:59:59.999");
        baseTruncateTest(truncatedDate, lastTruncateDate, calendarField);

        //month with 31 days (2)
        truncatedDate = dateTimeParser.parse("March 16, 2008 0:00:00.000");
        lastTruncateDate = dateTimeParser.parse("March 31, 2008 23:59:59.999");
        baseTruncateTest(truncatedDate, lastTruncateDate, calendarField);

    }

    /**
     * Test DateUtils.truncate()-method with Calendar.DATE
     * 
     * @throws Exception
     * @since 3.0
     */
    @Test
    public void DateUtils85() throws Exception {
        final int calendarField = Calendar.DATE;
        final Date lastTruncateDate = dateTimeParser.parse("June 1, 2008 23:59:59.999");
        baseTruncateTest(targetDateDate, lastTruncateDate, calendarField);
    }
    
    /**
     * Test DateUtils.truncate()-method with Calendar.DAY_OF_MONTH
     * 
     * @throws Exception
     * @since 3.0
     */

}
