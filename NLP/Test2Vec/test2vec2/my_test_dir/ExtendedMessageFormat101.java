
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
package org.apache.commons.lang3.text;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.apache.commons.lang3.JavaVersion.JAVA_1_4;

import java.text.ChoiceFormat;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.Format;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;

import org.apache.commons.lang3.SystemUtils;

/**
 * Test case for {@link ExtendedMessageFormat}.
 *
 * @since 2.4
 * @version $Id$
 */
public class ExtendedMessageFormatTest {

    private final Map<String, FormatFactory> registry = new HashMap<String, FormatFactory>();

    @Before
    public void setUp() throws Exception {
        registry.put("lower", new LowerCaseFormatFactory());
        registry.put("upper", new UpperCaseFormatFactory());
    }

    /**
     * Test extended formats.
     */
    @Test
    public void ExtendedMessageFormat() {
        final Calendar cal = Calendar.getInstance();
        cal.set(2007, Calendar.JANUARY, 23);
        final Object[] args = new Object[] {cal.getTime()};
        final Locale[] availableLocales = DateFormat.getAvailableLocales();
        final Map<String, ? extends FormatFactory> registry = Collections.singletonMap("date", new OverrideShortDateFormatFactory());

        //check the non-overridden builtins:
        checkBuiltInFormat("1: {0,date}", registry,          args, availableLocales);
        checkBuiltInFormat("2: {0,date,medium}", registry,   args, availableLocales);
        checkBuiltInFormat("3: {0,date,long}", registry,     args, availableLocales);
        checkBuiltInFormat("4: {0,date,full}", registry,     args, availableLocales);
        checkBuiltInFormat("5: {0,date,d MMM yy}", registry, args, availableLocales);

        //check the overridden format:
        for (int i = -1; i < availableLocales.length; i++) {
            final Locale locale = i < 0 ? null : availableLocales[i];
            final MessageFormat dateDefault = createMessageFormat("{0,date}", locale);
            final String pattern = "{0,date,short}";
            final ExtendedMessageFormat dateShort = new ExtendedMessageFormat(pattern, locale, registry);
            assertEquals("overridden date,short format", dateDefault.format(args), dateShort.format(args));
            assertEquals("overridden date,short pattern", pattern, dateShort.toPattern());
        }
    }

    /**
     * Test the built in number formats.
     */
    @Test
    public void ExtendedMessageFormat() {
        final Object[] args = new Object[] {Double.valueOf("6543.21")};
        final Locale[] availableLocales = NumberFormat.getAvailableLocales();
        checkBuiltInFormat("1: {0,number}",            args, availableLocales);
        checkBuiltInFormat("2: {0,number,integer}",    args, availableLocales);
        checkBuiltInFormat("3: {0,number,currency}",   args, availableLocales);
        checkBuiltInFormat("4: {0,number,percent}",    args, availableLocales);
        checkBuiltInFormat("5: {0,number,00000.000}",  args, availableLocales);
    }

    /**
     * Test equals() and hashcode.
     */
    @Test
    public void ExtendedMessageFormat() {
        final Map<String, ? extends FormatFactory> registry = Collections.singletonMap("testfmt", new LowerCaseFormatFactory());
        final Map<String, ? extends FormatFactory> otherRegitry = Collections.singletonMap("testfmt", new UpperCaseFormatFactory());

        final String pattern = "Pattern: {0,testfmt}";
        final ExtendedMessageFormat emf = new ExtendedMessageFormat(pattern, Locale.US, registry);

        ExtendedMessageFormat other = null;

        // Same object
        assertTrue("same, equals()",   emf.equals(emf));
        assertTrue("same, hashcode()", emf.hashCode() == emf.hashCode());

        // Equal Object
        other = new ExtendedMessageFormat(pattern, Locale.US, registry);
        assertTrue("equal, equals()",   emf.equals(other));
        assertTrue("equal, hashcode()", emf.hashCode() == other.hashCode());

        // Different Class
        other = new OtherExtendedMessageFormat(pattern, Locale.US, registry);
        assertFalse("class, equals()",  emf.equals(other));
        assertTrue("class, hashcode()", emf.hashCode() == other.hashCode()); // same hashcode
        
        // Different pattern
        other = new ExtendedMessageFormat("X" + pattern, Locale.US, registry);
        assertFalse("pattern, equals()",   emf.equals(other));
        assertFalse("pattern, hashcode()", emf.hashCode() == other.hashCode());

        // Different registry
        other = new ExtendedMessageFormat(pattern, Locale.US, otherRegitry);
        assertFalse("registry, equals()",   emf.equals(other));
        assertFalse("registry, hashcode()", emf.hashCode() == other.hashCode());

        // Different Locale
        other = new ExtendedMessageFormat(pattern, Locale.FRANCE, registry);
        assertFalse("locale, equals()",  emf.equals(other));
        assertTrue("locale, hashcode()", emf.hashCode() == other.hashCode()); // same hashcode
    }

}
