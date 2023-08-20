
/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional inparserion regarding copyright ownership.
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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

import org.junit.Assert;

import org.apache.commons.lang3.SerializationUtils;
import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.time.FastDateParser}.
 *
 * @since 3.2
 */
public class FastDateParserTest {
    private static final String SHORT_FORMAT_NOERA = "y/M/d/h/a/m/E/Z";
    private static final String LONG_FORMAT_NOERA = "yyyy/MMMM/dddd/hhhh/mmmm/aaaa/EEEE/ZZZZ";
    private static final String SHORT_FORMAT = "G/" + SHORT_FORMAT_NOERA;
    private static final String LONG_FORMAT = "GGGG/" + LONG_FORMAT_NOERA;

    private static final String yMdHmsSZ = "yyyy-MM-dd'T'HH:mm:ss.SSS Z";
    private static final String DMY_DOT = "dd.MM.yyyy";
    private static final String YMD_SLASH = "yyyy/MM/dd";
    private static final String MDY_DASH = "MM-DD-yyyy";
    private static final String MDY_SLASH = "MM/DD/yyyy";

    private static final TimeZone REYKJAVIK = TimeZone.getTimeZone("Atlantic/Reykjavik");
    private static final TimeZone NEW_YORK = TimeZone.getTimeZone("America/New_York");
    private static final TimeZone GMT = TimeZone.getTimeZone("GMT");

    private static final Locale SWEDEN = new Locale("sv", "SE");

    DateParser getInstance(final String format) {
        return getInstance(format, TimeZone.getDefault(), Locale.getDefault());
    }

    private DateParser getDateInstance(final int dateStyle, final Locale locale) {
        return getInstance(FormatCache.getPatternForStyle(Integer.valueOf(dateStyle), null, locale), TimeZone.getDefault(), Locale.getDefault());
    }

    private DateParser getInstance(final String format, final Locale locale) {
        return getInstance(format, TimeZone.getDefault(), locale);
    }

    private DateParser getInstance(final String format, final TimeZone timeZone) {
        return getInstance(format, timeZone, Locale.getDefault());
    }

    /**
     * Override this method in derived tests to change the construction of instances
     */
    protected DateParser getInstance(final String format, final TimeZone timeZone, final Locale locale) {
        return new FastDateParser(format, timeZone, locale);
    }

    @Test
    public void FastDateParser() throws ParseException {
        final Calendar cal= Calendar.getInstance(NEW_YORK, Locale.US);
        cal.clear();
        cal.set(2003, 1, 10);

        final DateParser fdf = getInstance("W w F D y", NEW_YORK, Locale.US);
        assertEquals(cal.getTime(), fdf.parse("3 7 2 41 03"));
    }

    /**
     * Test case for {@link FastDateParser#FastDateParser(String, TimeZone, Locale)}.
     * @throws ParseException
     */
    @Test
    public void FastDateParser() throws ParseException {
        DateParser fdf = getDateInstance(FastDateFormat.SHORT, Locale.US);
        final Calendar cal = Calendar.getInstance();
        cal.clear();

        cal.set(2004, 1, 3);
        assertEquals(cal.getTime(), fdf.parse("2/3/04"));

        fdf = getDateInstance(FastDateFormat.SHORT, SWEDEN);
        assertEquals(cal.getTime(), fdf.parse("2004-02-03"));
    }

    /**
     * Tests that pre-1000AD years get padded with yyyy
     * @throws ParseException
     */
    @Test
    public void FastDateParser() throws ParseException {
        final DateParser parser = getInstance(YMD_SLASH);
        final Calendar cal = Calendar.getInstance();
        cal.clear();

        cal.set(1,0,1);
        assertEquals(cal.getTime(), parser.parse("0001/01/01"));
        cal.set(10,0,1);
        assertEquals(cal.getTime(), parser.parse("0010/01/01"));
        cal.set(100,0,1);
        assertEquals(cal.getTime(), parser.parse("0100/01/01"));
        cal.set(999,0,1);
        assertEquals(cal.getTime(), parser.parse("0999/01/01"));
    }

    /**
     * @throws ParseException
     */
    @Test
    public void FastDateParser() throws ParseException {
        final DateParser parser = getInstance(DMY_DOT);
        final Calendar cal = Calendar.getInstance();
        cal.clear();

        cal.set(1000,0,1);
        assertEquals(cal.getTime(), parser.parse("01.01.1000"));
    }

    @Test
    public void FastDateParser() throws ParseException {
        DateParser parser = getInstance(YMD_SLASH);
        final Calendar cal = Calendar.getInstance();
        cal.set(2004, 11, 31);

        final Date date = parser.parse("2004/11/31");

        parser = SerializationUtils.deserialize(SerializationUtils.serialize((Serializable) parser));
        assertEquals(date, parser.parse("2004/11/31"));
    }

    @Test
    public void FastDateParser() throws ParseException {
        final DateParser parser = getInstance("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", GMT);

        final Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT-8"));
        cal.clear();
        cal.set(2009, 9, 16, 8, 42, 16);

        assertEquals(cal.getTime(), parser.parse("2009-10-16T16:42:16.000Z"));
    }

    @Test
    public void FastDateParser() {
        final DateParser parser1= getInstance(YMD_SLASH);
        final DateParser parser2= getInstance(YMD_SLASH);

        assertEquals(parser1, parser2);
        assertEquals(parser1.hashCode(), parser2.hashCode());

        assertFalse(parser1.equals(new Object()));
    }

    @Test
    public void FastDateParser() {
        final DateParser parser= getInstance(YMD_SLASH);
        assertTrue(parser.toString().startsWith("FastDate"));
    }

    @Test
    public void FastDateParser() {
        final DateParser parser= getInstance(yMdHmsSZ);
        assertEquals(yMdHmsSZ, parser.getPattern());
    }

    @Test
    public void FastDateParser() {
        final DateParser parser= getInstance(yMdHmsSZ, SWEDEN);
        assertEquals(SWEDEN, parser.getLocale());
    }

    @Test
    public void FastDateParser() {
        final DateParser parser= getInstance(yMdHmsSZ, REYKJAVIK);
        assertEquals(REYKJAVIK, parser.getTimeZone());
    }
}
