
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
import static org.junit.Assert.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/**
 * TestCase for DateFormatUtils.
 *
 */
public class DateFormatUtilsTest {

    @Test
    public void DateFormatUtils(){
        final TimeZone timeZone = TimeZone.getTimeZone("GMT-3");
        final Calendar cal = Calendar.getInstance(timeZone);
        cal.set(2002,1,23,10,11,12);
        String text = DateFormatUtils.format(cal.getTime(), 
                        DateFormatUtils.ISO_TIME_FORMAT.getPattern(), timeZone);
        assertEquals("T10:11:12", text);
        text = DateFormatUtils.format(cal.getTime().getTime(), 
                        DateFormatUtils.ISO_TIME_FORMAT.getPattern(), timeZone);
        assertEquals("T10:11:12", text);
        text = DateFormatUtils.ISO_TIME_FORMAT.format(cal);
        assertEquals("T10:11:12", text);
        
        text = DateFormatUtils.format(cal.getTime(), 
                      DateFormatUtils.ISO_TIME_TIME_ZONE_FORMAT.getPattern(), timeZone);
        assertEquals("T10:11:12-03:00", text);
        text = DateFormatUtils.format(cal.getTime().getTime(), 
                      DateFormatUtils.ISO_TIME_TIME_ZONE_FORMAT.getPattern(), timeZone);
        assertEquals("T10:11:12-03:00", text);
        text = DateFormatUtils.ISO_TIME_TIME_ZONE_FORMAT.format(cal);
        assertEquals("T10:11:12-03:00", text);
    }

    @Test
    public void DateFormatUtils(){
        final TimeZone timeZone = TimeZone.getTimeZone("GMT-3");
        final Calendar cal = Calendar.getInstance(timeZone);
        cal.set(2002,1,23,10,11,12);
        String text = DateFormatUtils.format(cal.getTime(), 
                        DateFormatUtils.ISO_TIME_NO_T_FORMAT.getPattern(), timeZone);
        assertEquals("10:11:12", text);
        text = DateFormatUtils.format(cal.getTime().getTime(), 
                        DateFormatUtils.ISO_TIME_NO_T_FORMAT.getPattern(), timeZone);
        assertEquals("10:11:12", text);
        text = DateFormatUtils.ISO_TIME_NO_T_FORMAT.format(cal);
        assertEquals("10:11:12", text);
        
        text = DateFormatUtils.format(cal.getTime(), 
                      DateFormatUtils.ISO_TIME_NO_T_TIME_ZONE_FORMAT.getPattern(), timeZone);
        assertEquals("10:11:12-03:00", text);
        text = DateFormatUtils.format(cal.getTime().getTime(), 
                      DateFormatUtils.ISO_TIME_NO_T_TIME_ZONE_FORMAT.getPattern(), timeZone);
        assertEquals("10:11:12-03:00", text);
        text = DateFormatUtils.ISO_TIME_NO_T_TIME_ZONE_FORMAT.format(cal);
        assertEquals("10:11:12-03:00", text);
    }

    @Test
    public void DateFormatUtils(){
        final TimeZone timeZone = TimeZone.getTimeZone("GMT-3");
        final Calendar cal = Calendar.getInstance(timeZone);
        cal.set(2003,5,8,10,11,12);
        String text = DateFormatUtils.format(cal.getTime(), 
                        DateFormatUtils.SMTP_DATETIME_FORMAT.getPattern(), timeZone,
                        DateFormatUtils.SMTP_DATETIME_FORMAT.getLocale());
        assertEquals("Sun, 08 Jun 2003 10:11:12 -0300", text);
        text = DateFormatUtils.format(cal.getTime().getTime(), 
                        DateFormatUtils.SMTP_DATETIME_FORMAT.getPattern(), timeZone,
                        DateFormatUtils.SMTP_DATETIME_FORMAT.getLocale());
        assertEquals("Sun, 08 Jun 2003 10:11:12 -0300", text);
        text = DateFormatUtils.SMTP_DATETIME_FORMAT.format(cal);
        assertEquals("Sun, 08 Jun 2003 10:11:12 -0300", text);
        
        // format UTC
        text = DateFormatUtils.formatUTC(cal.getTime().getTime(), 
                        DateFormatUtils.SMTP_DATETIME_FORMAT.getPattern(),
                        DateFormatUtils.SMTP_DATETIME_FORMAT.getLocale());
        assertEquals("Sun, 08 Jun 2003 13:11:12 +0000", text);
    }

}
