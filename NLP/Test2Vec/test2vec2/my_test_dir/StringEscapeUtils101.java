
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
package org.apache.commons.lang3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.text.translate.CharSequenceTranslator;
import org.apache.commons.lang3.text.translate.NumericEntityEscaper;
import org.junit.Test;

/**
 * Unit tests for {@link StringEscapeUtils}.
 *
 * @version $Id$
 */
public class StringEscapeUtilsTest {
    @Test
    public void StringEscapeUtils() {
        final CharSequenceTranslator escapeXml = 
            StringEscapeUtils.ESCAPE_XML.with( NumericEntityEscaper.between(0x7f, Integer.MAX_VALUE) );

        assertEquals("Supplementary character must be represented using a single escape", "&#144308;",
                escapeXml.translate("\uD84C\uDFB4"));
    }
    
    @Test
    public void StringEscapeUtils() {
        // http://www.w3.org/TR/xml/#charsets says:
        // Char ::= #x9 | #xA | #xD | [#x20-#xD7FF] | [#xE000-#xFFFD] | [#x10000-#x10FFFF] /* any Unicode character,
        // excluding the surrogate blocks, FFFE, and FFFF. */
        final CharSequenceTranslator escapeXml = StringEscapeUtils.ESCAPE_XML
                .with(NumericEntityEscaper.below(9), NumericEntityEscaper.between(0xB, 0xC), NumericEntityEscaper.between(0xE, 0x19),
                        NumericEntityEscaper.between(0xD800, 0xDFFF), NumericEntityEscaper.between(0xFFFE, 0xFFFF), NumericEntityEscaper.above(0x110000));

        assertEquals("&#0;&#1;&#2;&#3;&#4;&#5;&#6;&#7;&#8;", escapeXml.translate("\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\u0008"));
        assertEquals("\t", escapeXml.translate("\t")); // 0x9
        assertEquals("\n", escapeXml.translate("\n")); // 0xA
        assertEquals("&#11;&#12;", escapeXml.translate("\u000B\u000C"));
        assertEquals("\r", escapeXml.translate("\r")); // 0xD
        assertEquals("Hello World! Ain&apos;t this great?", escapeXml.translate("Hello World! Ain't this great?"));
        assertEquals("&#14;&#15;&#24;&#25;", escapeXml.translate("\u000E\u000F\u0018\u0019"));
    }
    
    /**
     * Reverse of the above.
     *
     * @see <a href="https://issues.apache.org/jira/browse/LANG-729">LANG-729</a>
     */
    @Test
    public void StringEscapeUtils() {
        assertEquals("Supplementary character must be represented using a single escape", "\uD84C\uDFB4",
                StringEscapeUtils.unescapeXml("&#144308;") );
    }
        
    // Tests issue #38569
    // http://issues.apache.org/bugzilla/show_bug.cgi?id=38569
    @Test
    public void StringEscapeUtils() {
        assertEquals("<P&O>", StringEscapeUtils.unescapeHtml4("&lt;P&O&gt;"));
        assertEquals("test & <", StringEscapeUtils.unescapeHtml4("test & &lt;"));
        assertEquals("<P&O>", StringEscapeUtils.unescapeXml("&lt;P&O&gt;"));
        assertEquals("test & <", StringEscapeUtils.unescapeXml("test & &lt;"));
    }

    @Test
    public void StringEscapeUtils() {
        assertEquals("& &", StringEscapeUtils.unescapeHtml4("& &amp;"));
    }

    @Test
    public void StringEscapeUtils() throws Exception {
        assertEquals("foo.bar",          StringEscapeUtils.escapeCsv("foo.bar"));
        assertEquals("\"foo,bar\"",      StringEscapeUtils.escapeCsv("foo,bar"));
        assertEquals("\"foo\nbar\"",     StringEscapeUtils.escapeCsv("foo\nbar"));
        assertEquals("\"foo\rbar\"",     StringEscapeUtils.escapeCsv("foo\rbar"));
        assertEquals("\"foo\"\"bar\"",   StringEscapeUtils.escapeCsv("foo\"bar"));
        assertEquals("",   StringEscapeUtils.escapeCsv(""));
        assertEquals(null, StringEscapeUtils.escapeCsv(null));
    }

    @Test
    public void StringEscapeUtils() throws Exception {
        checkCsvEscapeWriter("foo.bar",        "foo.bar");
        checkCsvEscapeWriter("\"foo,bar\"",    "foo,bar");
        checkCsvEscapeWriter("\"foo\nbar\"",   "foo\nbar");
        checkCsvEscapeWriter("\"foo\rbar\"",   "foo\rbar");
        checkCsvEscapeWriter("\"foo\"\"bar\"", "foo\"bar");
        checkCsvEscapeWriter("", null);
        checkCsvEscapeWriter("", "");
    }

    private void checkCsvEscapeWriter(final String expected, final String value) {
        try {
            final StringWriter writer = new StringWriter();
            StringEscapeUtils.ESCAPE_CSV.translate(value, writer);
            assertEquals(expected, writer.toString());
        } catch (final IOException e) {
            fail("Threw: " + e);
        }
    }

    @Test
    public void StringEscapeUtils() throws Exception {
        assertEquals("foo.bar",          StringEscapeUtils.unescapeCsv("foo.bar"));
        assertEquals("foo,bar",      StringEscapeUtils.unescapeCsv("\"foo,bar\""));
        assertEquals("foo\nbar",     StringEscapeUtils.unescapeCsv("\"foo\nbar\""));
        assertEquals("foo\rbar",     StringEscapeUtils.unescapeCsv("\"foo\rbar\""));
        assertEquals("foo\"bar",   StringEscapeUtils.unescapeCsv("\"foo\"\"bar\""));
        assertEquals("",   StringEscapeUtils.unescapeCsv(""));
        assertEquals(null, StringEscapeUtils.unescapeCsv(null));

        assertEquals("\"foo.bar\"",          StringEscapeUtils.unescapeCsv("\"foo.bar\""));
    }

    @Test
    public void StringEscapeUtils() throws Exception {
        checkCsvUnescapeWriter("foo.bar",        "foo.bar");
        checkCsvUnescapeWriter("foo,bar",    "\"foo,bar\"");
        checkCsvUnescapeWriter("foo\nbar",   "\"foo\nbar\"");
        checkCsvUnescapeWriter("foo\rbar",   "\"foo\rbar\"");
        checkCsvUnescapeWriter("foo\"bar", "\"foo\"\"bar\"");
        checkCsvUnescapeWriter("", null);
        checkCsvUnescapeWriter("", "");

        checkCsvUnescapeWriter("\"foo.bar\"",        "\"foo.bar\"");
    }

    private void checkCsvUnescapeWriter(final String expected, final String value) {
        try {
            final StringWriter writer = new StringWriter();
            StringEscapeUtils.UNESCAPE_CSV.translate(value, writer);
            assertEquals(expected, writer.toString());
        } catch (final IOException e) {
            fail("Threw: " + e);
        }
    }

    /**
     * Tests // https://issues.apache.org/jira/browse/LANG-480
     * 
     * @throws java.io.UnsupportedEncodingException
     */
    @Test
    public void StringEscapeUtils() throws java.io.UnsupportedEncodingException {
        // this is the utf8 representation of the character:
        // COUNTING ROD UNIT DIGIT THREE
        // in Unicode
        // codepoint: U+1D362
        final byte[] data = new byte[] { (byte)0xF0, (byte)0x9D, (byte)0x8D, (byte)0xA2 };

        final String original = new String(data, "UTF8");

        final String escaped = StringEscapeUtils.escapeHtml4( original );
        assertEquals( "High Unicode should not have been escaped", original, escaped);

        final String unescaped = StringEscapeUtils.unescapeHtml4( escaped );
        assertEquals( "High Unicode should have been unchanged", original, unescaped);

// TODO: I think this should hold, needs further investigation
//        String unescapedFromEntity = StringEscapeUtils.unescapeHtml4( "&#119650;" );
//        assertEquals( "High Unicode should have been unescaped", original, unescapedFromEntity);
    }

    /**
     * Tests https://issues.apache.org/jira/browse/LANG-339
     */
    @Test
    public void StringEscapeUtils() {
        // Some random Japanese Unicode characters
        final String original = "\u304B\u304C\u3068";
        final String escaped = StringEscapeUtils.escapeHtml4(original);
        assertEquals( "Hiragana character Unicode behaviour should not be being escaped by escapeHtml4",
        original, escaped);

        final String unescaped = StringEscapeUtils.unescapeHtml4( escaped );

        assertEquals( "Hiragana character Unicode behaviour has changed - expected no unescaping", escaped, unescaped);
    }

    /**
     * Tests https://issues.apache.org/jira/browse/LANG-708
     * 
     * @throws IOException
     *             if an I/O error occurs
     */
    @Test
    public void StringEscapeUtils() throws IOException {
        final String input = IOUtils.toString(new FileInputStream("src/test/resources/lang-708-input.txt"), "UTF-8");
        final String escaped = StringEscapeUtils.escapeEcmaScript(input);
        // just the end:
        assertTrue(escaped, escaped.endsWith("}]"));
        // a little more:
        assertTrue(escaped, escaped.endsWith("\"valueCode\\\":\\\"\\\"}]"));
    }

    /**
     * Tests https://issues.apache.org/jira/browse/LANG-720
     */
    @Test
    public void StringEscapeUtils() {
        final String input = new StringBuilder("\ud842\udfb7").append("A").toString();
        final String escaped = StringEscapeUtils.escapeXml(input);
        assertEquals(input, escaped);
    }

    @Test
    public void StringEscapeUtils() {
        assertEquals(null, StringEscapeUtils.escapeJson(null));
        try {
            StringEscapeUtils.ESCAPE_JSON.translate(null, null);
            fail();
        } catch (final IOException ex) {
            fail();
        } catch (final IllegalArgumentException ex) {
        }
        try {
            StringEscapeUtils.ESCAPE_JSON.translate("", null);
            fail();
        } catch (final IOException ex) {
            fail();
        } catch (final IllegalArgumentException ex) {
        }

        assertEquals("He didn't say, \\\"stop!\\\"", StringEscapeUtils.escapeJson("He didn't say, \"stop!\""));

        String expected = "\\\"foo\\\" isn't \\\"bar\\\". specials: \\b\\r\\n\\f\\t\\\\\\/";
        String input ="\"foo\" isn't \"bar\". specials: \b\r\n\f\t\\/";

        assertEquals(expected, StringEscapeUtils.escapeJson(input));
    }
}
