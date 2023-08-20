
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

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import org.apache.commons.lang3.SerializationUtils;
import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.time.FastDatePrinter}.
 *
 * @since 3.0
 */
public class FastDatePrinterTest {
    
    private static final String YYYY_MM_DD = "yyyy/MM/dd";
    private static final TimeZone NEW_YORK = TimeZone.getTimeZone("America/New_York");
    private static final Locale SWEDEN = new Locale("sv", "SE");

        DatePrinter getInstance(final String format) {
        return getInstance(format, TimeZone.getDefault(), Locale.getDefault());
    }

    private DatePrinter getDateInstance(final int dateStyle, final Locale locale) {
        return getInstance(FormatCache.getPatternForStyle(Integer.valueOf(dateStyle), null, locale), TimeZone.getDefault(), Locale.getDefault());
    }

    private DatePrinter getInstance(final String format, final Locale locale) {
        return getInstance(format, TimeZone.getDefault(), locale);
    }

    private DatePrinter getInstance(final String format, final TimeZone timeZone) {
        return getInstance(format, timeZone, Locale.getDefault());
    }

    /**
     * Override this method in derived tests to change the construction of instances
     * @param format
     * @param timeZone
     * @param locale
     * @return
     */
    protected DatePrinter getInstance(final String format, final TimeZone timeZone, final Locale locale) {
        return new FastDatePrinter(format, timeZone, locale);
    }

    @Test
    public void FastDatePrinter() {
        final Locale locale = new Locale("sv", "SE");

        final Calendar cal = Calendar.getInstance();
        cal.set(2010, 0, 1, 12, 0, 0);
        final Date d = cal.getTime();

        final DatePrinter fdf = getInstance("EEEE', week 'ww", locale);

        assertEquals("fredag, week 53", fdf.format(d));
    }
    
    @Test
    public void FastDatePrinter() {
        final DatePrinter printer1= getInstance(YYYY_MM_DD);
        final DatePrinter printer2= getInstance(YYYY_MM_DD);

        assertEquals(printer1, printer2);
        assertEquals(printer1.hashCode(), printer2.hashCode());        

        assertFalse(printer1.equals(new Object()));
    }
    
    @Test
    public void FastDatePrinter() {
        final DatePrinter printer= getInstance(YYYY_MM_DD);
        assertTrue(printer.toString().startsWith("FastDate"));
    }
    
    @Test
    public void FastDatePrinter() {
        final DatePrinter printer= getInstance(YYYY_MM_DD);
        assertEquals(YYYY_MM_DD, printer.getPattern());
    }
    
    @Test
    public void FastDatePrinter() {
        final DatePrinter printer= getInstance(YYYY_MM_DD, SWEDEN);
        assertEquals(SWEDEN, printer.getLocale());
    }
    
    @Test
    public void FastDatePrinter() {
        final DatePrinter printer= getInstance(YYYY_MM_DD, NEW_YORK);
        assertEquals(NEW_YORK, printer.getTimeZone());
    }
}
