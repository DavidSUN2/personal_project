
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
import java.util.Calendar;
import java.util.Date;

public class DateUtilsFragmentTest {

    private static final int months = 7;   // second final prime before 12
    private static final int days = 23;    // second final prime before 31 (and valid)
    private static final int hours = 19;   // second final prime before 24
    private static final int minutes = 53; // second final prime before 60
    private static final int seconds = 47; // third final prime before 60
    private static final int millis = 991; // second final prime before 1000

    private Date aDate;
    private Calendar aCalendar;


    @Before
    public void setUp() {
        aCalendar = Calendar.getInstance();
        aCalendar.set(2005, months, days, hours, minutes, seconds);
        aCalendar.set(Calendar.MILLISECOND, millis);
        aDate = aCalendar.getTime();
    }
    
    @Test
    public void DateUtils() {
        final long testResult = DateUtils.getFragmentInMinutes(aDate, Calendar.HOUR_OF_DAY);
        assertEquals(minutes, testResult);
    }

    @Test
    public void DateUtils() {
        final long testResult = DateUtils.getFragmentInMinutes(aCalendar, Calendar.HOUR_OF_DAY);
        assertEquals(minutes, testResult);
    }

    //Calendar.DATE and Calendar.DAY_OF_YEAR as useful fragment
    @Test
    public void DateUtils() {
        long testresult = DateUtils.getFragmentInMilliseconds(aDate, Calendar.DATE);
        final long expectedValue = millis + (seconds * DateUtils.MILLIS_PER_SECOND) + (minutes * DateUtils.MILLIS_PER_MINUTE) + (hours * DateUtils.MILLIS_PER_HOUR); 
        assertEquals(expectedValue, testresult);
        testresult = DateUtils.getFragmentInMilliseconds(aDate, Calendar.DAY_OF_YEAR);
        assertEquals(expectedValue, testresult);
    }
    
    @Test
    public void DateUtils() {
        long testresult = DateUtils.getFragmentInMilliseconds(aCalendar, Calendar.DATE);
        final long expectedValue = millis + (seconds * DateUtils.MILLIS_PER_SECOND) + (minutes * DateUtils.MILLIS_PER_MINUTE) + (hours * DateUtils.MILLIS_PER_HOUR); 
        assertEquals(expectedValue, testresult);
        testresult = DateUtils.getFragmentInMilliseconds(aCalendar, Calendar.DAY_OF_YEAR);
        assertEquals(expectedValue, testresult);
    }

    @Test
    public void DateUtils() {
        long testresult = DateUtils.getFragmentInSeconds(aDate, Calendar.DATE);
        final long expectedValue = seconds + ((minutes * DateUtils.MILLIS_PER_MINUTE) + (hours * DateUtils.MILLIS_PER_HOUR))/ DateUtils.MILLIS_PER_SECOND;
        assertEquals(expectedValue, testresult);
        testresult = DateUtils.getFragmentInSeconds(aDate, Calendar.DAY_OF_YEAR);
        assertEquals(expectedValue, testresult);
    }

    @Test
    public void DateUtils() {
        long testresult = DateUtils.getFragmentInSeconds(aCalendar, Calendar.DATE);
        final long expectedValue = seconds + ((minutes * DateUtils.MILLIS_PER_MINUTE) + (hours * DateUtils.MILLIS_PER_HOUR))/ DateUtils.MILLIS_PER_SECOND;
        assertEquals(expectedValue, testresult);
        testresult = DateUtils.getFragmentInSeconds(aCalendar, Calendar.DAY_OF_YEAR);
        assertEquals(expectedValue, testresult);
    }

    @Test
    public void DateUtils() {
        long testResult = DateUtils.getFragmentInMinutes(aDate, Calendar.DATE);
        final long expectedValue = minutes + ((hours * DateUtils.MILLIS_PER_HOUR))/ DateUtils.MILLIS_PER_MINUTE; 
        assertEquals(expectedValue,testResult);
        testResult = DateUtils.getFragmentInMinutes(aDate, Calendar.DAY_OF_YEAR);
        assertEquals(expectedValue,testResult);
    }

    @Test
    public void DateUtils() {
        long testResult = DateUtils.getFragmentInMinutes(aCalendar, Calendar.DATE);
        final long expectedValue = minutes + ((hours * DateUtils.MILLIS_PER_HOUR))/ DateUtils.MILLIS_PER_MINUTE; 
        assertEquals(expectedValue, testResult);
        testResult = DateUtils.getFragmentInMinutes(aCalendar, Calendar.DAY_OF_YEAR);
        assertEquals(expectedValue, testResult);
    }
    
    @Test
    public void DateUtils() {
        long testResult = DateUtils.getFragmentInHours(aDate, Calendar.DATE);
        final long expectedValue = hours; 
        assertEquals(expectedValue,testResult);
        testResult = DateUtils.getFragmentInHours(aDate, Calendar.DAY_OF_YEAR);
        assertEquals(expectedValue,testResult);
    }

    @Test
    public void DateUtils() {
        long testResult = DateUtils.getFragmentInHours(aCalendar, Calendar.DATE);
        final long expectedValue = hours; 
        assertEquals(expectedValue, testResult);
        testResult = DateUtils.getFragmentInHours(aCalendar, Calendar.DAY_OF_YEAR);
        assertEquals(expectedValue, testResult);
    }
    
    
    //Calendar.MONTH as useful fragment
    @Test
    public void DateUtils() {
        final long testResult = DateUtils.getFragmentInMilliseconds(aDate, Calendar.MONTH);
        assertEquals(millis + (seconds * DateUtils.MILLIS_PER_SECOND) + (minutes * DateUtils.MILLIS_PER_MINUTE)
                                + (hours * DateUtils.MILLIS_PER_HOUR) + (days * DateUtils.MILLIS_PER_DAY),
                testResult);
    }

    @Test
    public void DateUtils() {
        final long testResult = DateUtils.getFragmentInMilliseconds(aCalendar, Calendar.MONTH);
        assertEquals(millis + (seconds * DateUtils.MILLIS_PER_SECOND) + (minutes * DateUtils.MILLIS_PER_MINUTE)
                + (hours * DateUtils.MILLIS_PER_HOUR) + (days * DateUtils.MILLIS_PER_DAY),
testResult);
    }
    
    @Test
    public void DateUtils() {
        final long testResult = DateUtils.getFragmentInSeconds(aDate, Calendar.MONTH);
        assertEquals(
                seconds
                        + ((minutes * DateUtils.MILLIS_PER_MINUTE)
                                + (hours * DateUtils.MILLIS_PER_HOUR) + (days * DateUtils.MILLIS_PER_DAY))
                        / DateUtils.MILLIS_PER_SECOND,
                testResult);
    }

    @Test
    public void DateUtils() {
        final long testResult = DateUtils.getFragmentInSeconds(aCalendar, Calendar.MONTH);
        assertEquals(
                seconds
                        + ((minutes * DateUtils.MILLIS_PER_MINUTE)
                                + (hours * DateUtils.MILLIS_PER_HOUR) + (days * DateUtils.MILLIS_PER_DAY))
                        / DateUtils.MILLIS_PER_SECOND,
                testResult);
    }

    @Test
    public void DateUtils() {
        final long testResult = DateUtils.getFragmentInMinutes(aDate, Calendar.MONTH);
        assertEquals(minutes
                                + ((hours * DateUtils.MILLIS_PER_HOUR) + (days * DateUtils.MILLIS_PER_DAY))
                        / DateUtils.MILLIS_PER_MINUTE,
                testResult);
    }

    @Test
    public void DateUtils() {
        final long testResult = DateUtils.getFragmentInMinutes(aCalendar, Calendar.MONTH);
        assertEquals( minutes  +((hours * DateUtils.MILLIS_PER_HOUR) + (days * DateUtils.MILLIS_PER_DAY))
                        / DateUtils.MILLIS_PER_MINUTE,
                testResult);
    }

    @Test
    public void DateUtils() {
        final long testResult = DateUtils.getFragmentInHours(aDate, Calendar.MONTH);
        assertEquals(hours + ((days * DateUtils.MILLIS_PER_DAY))
                        / DateUtils.MILLIS_PER_HOUR,
                testResult);
    }

    @Test
    public void DateUtils() {
        final long testResult = DateUtils.getFragmentInHours(aCalendar, Calendar.MONTH);
        assertEquals( hours +((days * DateUtils.MILLIS_PER_DAY))
                        / DateUtils.MILLIS_PER_HOUR,
                testResult);
    }
    
    //Calendar.YEAR as useful fragment
    @Test
    public void DateUtils() {
        final long testResult = DateUtils.getFragmentInMilliseconds(aDate, Calendar.YEAR);
        final Calendar cal = Calendar.getInstance();
        cal.setTime(aDate);
        assertEquals(millis + (seconds * DateUtils.MILLIS_PER_SECOND) + (minutes * DateUtils.MILLIS_PER_MINUTE)
                                + (hours * DateUtils.MILLIS_PER_HOUR) + (cal.get(Calendar.DAY_OF_YEAR) * DateUtils.MILLIS_PER_DAY),
                testResult);
    }

    @Test
    public void DateUtils() {
        final long testResult = DateUtils.getFragmentInMilliseconds(aCalendar, Calendar.YEAR);
        assertEquals(millis + (seconds * DateUtils.MILLIS_PER_SECOND) + (minutes * DateUtils.MILLIS_PER_MINUTE)
                + (hours * DateUtils.MILLIS_PER_HOUR) + (aCalendar.get(Calendar.DAY_OF_YEAR) * DateUtils.MILLIS_PER_DAY),
testResult);
    }
    
    @Test
    public void DateUtils() {
        final long testResult = DateUtils.getFragmentInSeconds(aDate, Calendar.YEAR);
        final Calendar cal = Calendar.getInstance();
        cal.setTime(aDate);
        assertEquals(
                seconds
                        + ((minutes * DateUtils.MILLIS_PER_MINUTE)
                                + (hours * DateUtils.MILLIS_PER_HOUR) + (cal.get(Calendar.DAY_OF_YEAR) * DateUtils.MILLIS_PER_DAY))
                        / DateUtils.MILLIS_PER_SECOND,
                testResult);
    }

    @Test
    public void DateUtils() {
        final long testResult = DateUtils.getFragmentInSeconds(aCalendar, Calendar.YEAR);
        assertEquals(
                seconds
                        + ((minutes * DateUtils.MILLIS_PER_MINUTE)
                                + (hours * DateUtils.MILLIS_PER_HOUR) + (aCalendar.get(Calendar.DAY_OF_YEAR) * DateUtils.MILLIS_PER_DAY))
                        / DateUtils.MILLIS_PER_SECOND,
                testResult);
    }

    @Test
    public void DateUtils() {
        final long testResult = DateUtils.getFragmentInMinutes(aDate, Calendar.YEAR);
        final Calendar cal = Calendar.getInstance();
        cal.setTime(aDate);
        assertEquals(minutes
                                + ((hours * DateUtils.MILLIS_PER_HOUR) + (cal.get(Calendar.DAY_OF_YEAR) * DateUtils.MILLIS_PER_DAY))
                        / DateUtils.MILLIS_PER_MINUTE,
                testResult);
    }

    @Test
    public void DateUtils() {
        final long testResult = DateUtils.getFragmentInMinutes(aCalendar, Calendar.YEAR);
        assertEquals( minutes  +((hours * DateUtils.MILLIS_PER_HOUR) + (aCalendar.get(Calendar.DAY_OF_YEAR) * DateUtils.MILLIS_PER_DAY))
                        / DateUtils.MILLIS_PER_MINUTE,
                testResult);
    }

    @Test
    public void DateUtils() {
        final long testResult = DateUtils.getFragmentInHours(aDate, Calendar.YEAR);
        final Calendar cal = Calendar.getInstance();
        cal.setTime(aDate);
        assertEquals(hours + ((cal.get(Calendar.DAY_OF_YEAR) * DateUtils.MILLIS_PER_DAY))
                        / DateUtils.MILLIS_PER_HOUR,
                testResult);
    }

    @Test
    public void DateUtils() {
        final long testResult = DateUtils.getFragmentInHours(aCalendar, Calendar.YEAR);
        assertEquals( hours +((aCalendar.get(Calendar.DAY_OF_YEAR) * DateUtils.MILLIS_PER_DAY))
                        / DateUtils.MILLIS_PER_HOUR,
                testResult);
    }
}
