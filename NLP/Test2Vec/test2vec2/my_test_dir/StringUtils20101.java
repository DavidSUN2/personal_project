
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

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;

import org.apache.commons.lang3.text.WordUtils;
import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.StringUtils}.
 *
 * @version $Id$
 */
public class StringUtilsTest {
    
    @Test
    public void StringUtils20() {

        final String[][] chopCases = {
            { FOO_UNCAP + "\r\n", FOO_UNCAP } ,
            { FOO_UNCAP + "\n" , FOO_UNCAP } ,
            { FOO_UNCAP + "\r", FOO_UNCAP },
            { FOO_UNCAP + " \r", FOO_UNCAP + " " },
            { "foo", "fo"},
            { "foo\nfoo", "foo\nfo" },
            { "\n", "" },
            { "\r", "" },
            { "\r\n", "" },
            { null, null },
            { "", "" },
            { "a", "" },
        };
        for (final String[] chopCase : chopCases) {
            final String original = chopCase[0];
            final String expectedResult = chopCase[1];
            assertEquals("chop(String) failed",
                    expectedResult, StringUtils.chop(original));
        }
    }

    @SuppressWarnings("deprecation") // intentional test of deprecated method
    @Test
    public void StringUtils20() {

        final String[][] chompCases = {
            { FOO_UNCAP + "\r\n", FOO_UNCAP },
            { FOO_UNCAP + "\n" , FOO_UNCAP },
            { FOO_UNCAP + "\r", FOO_UNCAP },
            { FOO_UNCAP + " \r", FOO_UNCAP + " " },
            { FOO_UNCAP, FOO_UNCAP },
            { FOO_UNCAP + "\n\n", FOO_UNCAP + "\n"},
            { FOO_UNCAP + "\r\n\r\n", FOO_UNCAP + "\r\n" },
            { "foo\nfoo", "foo\nfoo" },
            { "foo\n\rfoo", "foo\n\rfoo" },
            { "\n", "" },
            { "\r", "" },
            { "a", "a" },
            { "\r\n", "" },
            { "", "" },
            { null, null },
            { FOO_UNCAP + "\n\r", FOO_UNCAP + "\n"}
        };
        for (final String[] chompCase : chompCases) {
            final String original = chompCase[0];
            final String expectedResult = chompCase[1];
            assertEquals("chomp(String) failed",
                    expectedResult, StringUtils.chomp(original));
        }

        assertEquals("chomp(String, String) failed",
                "foo", StringUtils.chomp("foobar", "bar"));
        assertEquals("chomp(String, String) failed",
                "foobar", StringUtils.chomp("foobar", "baz"));
        assertEquals("chomp(String, String) failed",
                "foo", StringUtils.chomp("foo", "foooo"));
        assertEquals("chomp(String, String) failed",
                "foobar", StringUtils.chomp("foobar", ""));
        assertEquals("chomp(String, String) failed",
                "foobar", StringUtils.chomp("foobar", null));
        assertEquals("chomp(String, String) failed",
                "", StringUtils.chomp("", "foo"));
        assertEquals("chomp(String, String) failed",
                "", StringUtils.chomp("", null));
        assertEquals("chomp(String, String) failed",
                "", StringUtils.chomp("", ""));
        assertEquals("chomp(String, String) failed",
                null, StringUtils.chomp(null, "foo"));
        assertEquals("chomp(String, String) failed",
                null, StringUtils.chomp(null, null));
        assertEquals("chomp(String, String) failed",
                null, StringUtils.chomp(null, ""));
        assertEquals("chomp(String, String) failed",
                "", StringUtils.chomp("foo", "foo"));
        assertEquals("chomp(String, String) failed",
                " ", StringUtils.chomp(" foo", "foo"));
        assertEquals("chomp(String, String) failed",
                "foo ", StringUtils.chomp("foo ", "foo"));
    }

    //-----------------------------------------------------------------------
    @Test
    public void StringUtils20() {
        assertEquals(null, StringUtils.rightPad(null, 5));
        assertEquals("     ", StringUtils.rightPad("", 5));
        assertEquals("abc  ", StringUtils.rightPad("abc", 5));
        assertEquals("abc", StringUtils.rightPad("abc", 2));
        assertEquals("abc", StringUtils.rightPad("abc", -1));
    }

    @Test
    public void StringUtils20() {
        assertEquals(null, StringUtils.rightPad(null, 5, ' '));
        assertEquals("     ", StringUtils.rightPad("", 5, ' '));
        assertEquals("abc  ", StringUtils.rightPad("abc", 5, ' '));
        assertEquals("abc", StringUtils.rightPad("abc", 2, ' '));
        assertEquals("abc", StringUtils.rightPad("abc", -1, ' '));
        assertEquals("abcxx", StringUtils.rightPad("abc", 5, 'x'));
        final String str = StringUtils.rightPad("aaa", 10000, 'a');  // bigger than pad length
        assertEquals(10000, str.length());
        assertTrue(StringUtils.containsOnly(str, new char[] {'a'}));
    }

    @Test
    public void StringUtils20() {
        assertEquals(null, StringUtils.rightPad(null, 5, "-+"));
        assertEquals("     ", StringUtils.rightPad("", 5, " "));
        assertEquals(null, StringUtils.rightPad(null, 8, null));
        assertEquals("abc-+-+", StringUtils.rightPad("abc", 7, "-+"));
        assertEquals("abc-+~", StringUtils.rightPad("abc", 6, "-+~"));
        assertEquals("abc-+", StringUtils.rightPad("abc", 5, "-+~"));
        assertEquals("abc", StringUtils.rightPad("abc", 2, " "));
        assertEquals("abc", StringUtils.rightPad("abc", -1, " "));
        assertEquals("abc  ", StringUtils.rightPad("abc", 5, null));
        assertEquals("abc  ", StringUtils.rightPad("abc", 5, ""));
    }
        
    //-----------------------------------------------------------------------
    @Test
    public void StringUtils20() {
        assertEquals(null, StringUtils.leftPad(null, 5));
        assertEquals("     ", StringUtils.leftPad("", 5));
        assertEquals("  abc", StringUtils.leftPad("abc", 5));
        assertEquals("abc", StringUtils.leftPad("abc", 2));
    }
        
    @Test
    public void StringUtils20() {
        assertEquals(null, StringUtils.leftPad(null, 5, ' '));
        assertEquals("     ", StringUtils.leftPad("", 5, ' '));
        assertEquals("  abc", StringUtils.leftPad("abc", 5, ' '));
        assertEquals("xxabc", StringUtils.leftPad("abc", 5, 'x'));
        assertEquals("\uffff\uffffabc", StringUtils.leftPad("abc", 5, '\uffff'));
        assertEquals("abc", StringUtils.leftPad("abc", 2, ' '));
        final String str = StringUtils.leftPad("aaa", 10000, 'a');  // bigger than pad length
        assertEquals(10000, str.length());
        assertTrue(StringUtils.containsOnly(str, new char[] {'a'}));
    }
        
    @Test
    public void StringUtils20() {
        assertEquals(null, StringUtils.leftPad(null, 5, "-+"));
        assertEquals(null, StringUtils.leftPad(null, 5, null));
        assertEquals("     ", StringUtils.leftPad("", 5, " "));
        assertEquals("-+-+abc", StringUtils.leftPad("abc", 7, "-+"));
        assertEquals("-+~abc", StringUtils.leftPad("abc", 6, "-+~"));
        assertEquals("-+abc", StringUtils.leftPad("abc", 5, "-+~"));
        assertEquals("abc", StringUtils.leftPad("abc", 2, " "));
        assertEquals("abc", StringUtils.leftPad("abc", -1, " "));
        assertEquals("  abc", StringUtils.leftPad("abc", 5, null));
        assertEquals("  abc", StringUtils.leftPad("abc", 5, ""));
    }

    @Test
    public void StringUtils20() {
        assertEquals(0, StringUtils.length(null));
        assertEquals(0, StringUtils.length(""));
        assertEquals(0, StringUtils.length(StringUtils.EMPTY));
        assertEquals(1, StringUtils.length("A"));
        assertEquals(1, StringUtils.length(" "));
        assertEquals(8, StringUtils.length("ABCDEFGH"));
    }

    @Test
    public void StringUtils20() {
        assertEquals(0, StringUtils.length(new StringBuffer("")));
        assertEquals(0, StringUtils.length(new StringBuffer(StringUtils.EMPTY)));
        assertEquals(1, StringUtils.length(new StringBuffer("A")));
        assertEquals(1, StringUtils.length(new StringBuffer(" ")));
        assertEquals(8, StringUtils.length(new StringBuffer("ABCDEFGH")));
    }

    @Test
    public void StringUtils20() {
        assertEquals(0, StringUtils.length(new StringBuilder("")));
        assertEquals(0, StringUtils.length(new StringBuilder(StringUtils.EMPTY)));
        assertEquals(1, StringUtils.length(new StringBuilder("A")));
        assertEquals(1, StringUtils.length(new StringBuilder(" ")));
        assertEquals(8, StringUtils.length(new StringBuilder("ABCDEFGH")));
    }
    
    @Test
    public void StringUtils20() {
        assertEquals(0, StringUtils.length(CharBuffer.wrap("")));
        assertEquals(1, StringUtils.length(CharBuffer.wrap("A")));
        assertEquals(1, StringUtils.length(CharBuffer.wrap(" ")));
        assertEquals(8, StringUtils.length(CharBuffer.wrap("ABCDEFGH")));
    }

    //-----------------------------------------------------------------------
    @Test
    public void StringUtils20() {
        assertEquals(null, StringUtils.center(null, -1));
        assertEquals(null, StringUtils.center(null, 4));
        assertEquals("    ", StringUtils.center("", 4));
        assertEquals("ab", StringUtils.center("ab", 0));
        assertEquals("ab", StringUtils.center("ab", -1));
        assertEquals("ab", StringUtils.center("ab", 1));
        assertEquals("    ", StringUtils.center("", 4));
        assertEquals(" ab ", StringUtils.center("ab", 4));
        assertEquals("abcd", StringUtils.center("abcd", 2));
        assertEquals(" a  ", StringUtils.center("a", 4));
        assertEquals("  a  ", StringUtils.center("a", 5));
    }
    
    @Test
    public void StringUtils20() {
        assertEquals(null, StringUtils.center(null, -1, ' '));
        assertEquals(null, StringUtils.center(null, 4, ' '));
        assertEquals("    ", StringUtils.center("", 4, ' '));
        assertEquals("ab", StringUtils.center("ab", 0, ' '));
        assertEquals("ab", StringUtils.center("ab", -1, ' '));
        assertEquals("ab", StringUtils.center("ab", 1, ' '));
        assertEquals("    ", StringUtils.center("", 4, ' '));
        assertEquals(" ab ", StringUtils.center("ab", 4, ' '));
        assertEquals("abcd", StringUtils.center("abcd", 2, ' '));
        assertEquals(" a  ", StringUtils.center("a", 4, ' '));
        assertEquals("  a  ", StringUtils.center("a", 5, ' '));
        assertEquals("xxaxx", StringUtils.center("a", 5, 'x'));
    }
    
    @Test
    public void StringUtils20() {
        assertEquals(null, StringUtils.center(null, 4, null));
        assertEquals(null, StringUtils.center(null, -1, " "));
        assertEquals(null, StringUtils.center(null, 4, " "));
        assertEquals("    ", StringUtils.center("", 4, " "));
        assertEquals("ab", StringUtils.center("ab", 0, " "));
        assertEquals("ab", StringUtils.center("ab", -1, " "));
        assertEquals("ab", StringUtils.center("ab", 1, " "));
        assertEquals("    ", StringUtils.center("", 4, " "));
        assertEquals(" ab ", StringUtils.center("ab", 4, " "));
        assertEquals("abcd", StringUtils.center("abcd", 2, " "));
        assertEquals(" a  ", StringUtils.center("a", 4, " "));
        assertEquals("yayz", StringUtils.center("a", 4, "yz"));
        assertEquals("yzyayzy", StringUtils.center("a", 7, "yz"));
        assertEquals("  abc  ", StringUtils.center("abc", 7, null));
        assertEquals("  abc  ", StringUtils.center("abc", 7, ""));
    }

    //-----------------------------------------------------------------------
    @Test
    public void StringUtils20() {
        assertEquals(null, StringUtils.reverse(null) );
        assertEquals("", StringUtils.reverse("") );
        assertEquals("sdrawkcab", StringUtils.reverse("backwards") );
    }
        
    @Test
    public void StringUtils20() {
        assertEquals(null, StringUtils.reverseDelimited(null, '.') );
        assertEquals("", StringUtils.reverseDelimited("", '.') );
        assertEquals("c.b.a", StringUtils.reverseDelimited("a.b.c", '.') );
        assertEquals("a b c", StringUtils.reverseDelimited("a b c", '.') );
        assertEquals("", StringUtils.reverseDelimited("", '.') );
    }

    //-----------------------------------------------------------------------
    @Test
    public void StringUtils20() {
        assertEquals("", StringUtils.defaultString(null));
        assertEquals("", StringUtils.defaultString(""));
        assertEquals("abc", StringUtils.defaultString("abc"));
    }

    @Test
    public void StringUtils20() {
        assertEquals("NULL", StringUtils.defaultString(null, "NULL"));
        assertEquals("", StringUtils.defaultString("", "NULL"));
        assertEquals("abc", StringUtils.defaultString("abc", "NULL"));
    }

    @Test
    public void StringUtils20() {
        assertEquals("NULL", StringUtils.defaultIfEmpty(null, "NULL"));
        assertEquals("NULL", StringUtils.defaultIfEmpty("", "NULL"));
        assertEquals("abc", StringUtils.defaultIfEmpty("abc", "NULL"));
        assertNull(StringUtils.defaultIfEmpty("", null));
        // Tests compatibility for the API return type
        final String s = StringUtils.defaultIfEmpty("abc", "NULL");
        assertEquals("abc", s);
    }

    @Test
    public void StringUtils20() {
        assertEquals("NULL", StringUtils.defaultIfBlank(null, "NULL"));
        assertEquals("NULL", StringUtils.defaultIfBlank("", "NULL"));
        assertEquals("NULL", StringUtils.defaultIfBlank(" ", "NULL"));
        assertEquals("abc", StringUtils.defaultIfBlank("abc", "NULL"));
        assertNull(StringUtils.defaultIfBlank("", null));
        // Tests compatibility for the API return type
        final String s = StringUtils.defaultIfBlank("abc", "NULL");
        assertEquals("abc", s);
    }

    @Test
    public void StringUtils20() {
        assertEquals("NULL", StringUtils.defaultIfEmpty(new StringBuilder(""), new StringBuilder("NULL")).toString());
        assertEquals("abc", StringUtils.defaultIfEmpty(new StringBuilder("abc"), new StringBuilder("NULL")).toString());
        assertNull(StringUtils.defaultIfEmpty(new StringBuilder(""), null));
        // Tests compatibility for the API return type
        final StringBuilder s = StringUtils.defaultIfEmpty(new StringBuilder("abc"), new StringBuilder("NULL"));
        assertEquals("abc", s.toString());
    }

    @Test
    public void StringUtils20() {
        assertEquals("NULL", StringUtils.defaultIfBlank(new StringBuilder(""), new StringBuilder("NULL")).toString());
        assertEquals("NULL", StringUtils.defaultIfBlank(new StringBuilder(" "), new StringBuilder("NULL")).toString());
        assertEquals("abc", StringUtils.defaultIfBlank(new StringBuilder("abc"), new StringBuilder("NULL")).toString());
        assertNull(StringUtils.defaultIfBlank(new StringBuilder(""), null));
        // Tests compatibility for the API return type
        final StringBuilder s = StringUtils.defaultIfBlank(new StringBuilder("abc"), new StringBuilder("NULL"));
        assertEquals("abc", s.toString());
    }

    @Test
    public void StringUtils20() {
        assertEquals("NULL", StringUtils.defaultIfEmpty(new StringBuffer(""), new StringBuffer("NULL")).toString());
        assertEquals("abc", StringUtils.defaultIfEmpty(new StringBuffer("abc"), new StringBuffer("NULL")).toString());
        assertNull(StringUtils.defaultIfEmpty(new StringBuffer(""), null));
        // Tests compatibility for the API return type
        final StringBuffer s = StringUtils.defaultIfEmpty(new StringBuffer("abc"), new StringBuffer("NULL"));
        assertEquals("abc", s.toString());
    }

    @Test
    public void StringUtils20() {
        assertEquals("NULL", StringUtils.defaultIfBlank(new StringBuffer(""), new StringBuffer("NULL")).toString());
        assertEquals("NULL", StringUtils.defaultIfBlank(new StringBuffer(" "), new StringBuffer("NULL")).toString());
        assertEquals("abc", StringUtils.defaultIfBlank(new StringBuffer("abc"), new StringBuffer("NULL")).toString());
        assertNull(StringUtils.defaultIfBlank(new StringBuffer(""), null));
        // Tests compatibility for the API return type
        final StringBuffer s = StringUtils.defaultIfBlank(new StringBuffer("abc"), new StringBuffer("NULL"));
        assertEquals("abc", s.toString());
    }

    @Test
    public void StringUtils20() {
        assertEquals("NULL", StringUtils.defaultIfEmpty(CharBuffer.wrap(""), CharBuffer.wrap("NULL")).toString());
        assertEquals("abc", StringUtils.defaultIfEmpty(CharBuffer.wrap("abc"), CharBuffer.wrap("NULL")).toString());
        assertNull(StringUtils.defaultIfEmpty(CharBuffer.wrap(""), null));
        // Tests compatibility for the API return type
        final CharBuffer s = StringUtils.defaultIfEmpty(CharBuffer.wrap("abc"), CharBuffer.wrap("NULL"));
        assertEquals("abc", s.toString());
    }

    @Test
    public void StringUtils20() {
        assertEquals("NULL", StringUtils.defaultIfBlank(CharBuffer.wrap(""), CharBuffer.wrap("NULL")).toString());
        assertEquals("NULL", StringUtils.defaultIfBlank(CharBuffer.wrap(" "), CharBuffer.wrap("NULL")).toString());
        assertEquals("abc", StringUtils.defaultIfBlank(CharBuffer.wrap("abc"), CharBuffer.wrap("NULL")).toString());
        assertNull(StringUtils.defaultIfBlank(CharBuffer.wrap(""), null));
        // Tests compatibility for the API return type
        final CharBuffer s = StringUtils.defaultIfBlank(CharBuffer.wrap("abc"), CharBuffer.wrap("NULL"));
        assertEquals("abc", s.toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StringUtils20() {
        assertEquals(null, StringUtils.abbreviate(null, 10));
        assertEquals("", StringUtils.abbreviate("", 10));
        assertEquals("short", StringUtils.abbreviate("short", 10));
        assertEquals("Now is ...", StringUtils.abbreviate("Now is the time for all good men to come to the aid of their party.", 10));

        final String raspberry = "raspberry peach";
        assertEquals("raspberry p...", StringUtils.abbreviate(raspberry, 14));
        assertEquals("raspberry peach", StringUtils.abbreviate("raspberry peach", 15));
        assertEquals("raspberry peach", StringUtils.abbreviate("raspberry peach", 16));
        assertEquals("abc...", StringUtils.abbreviate("abcdefg", 6));
        assertEquals("abcdefg", StringUtils.abbreviate("abcdefg", 7));
        assertEquals("abcdefg", StringUtils.abbreviate("abcdefg", 8));
        assertEquals("a...", StringUtils.abbreviate("abcdefg", 4));
        assertEquals("", StringUtils.abbreviate("", 4));
        
        try {
            @SuppressWarnings("unused")
            final
            String res = StringUtils.abbreviate("abc", 3);
            fail("StringUtils.abbreviate expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
                // empty
        }              
    }
    
    @Test
    public void StringUtils20() {
        assertEquals(null, StringUtils.abbreviate(null, 10, 12));
        assertEquals("", StringUtils.abbreviate("", 0, 10));
        assertEquals("", StringUtils.abbreviate("", 2, 10));
        
        try {
            @SuppressWarnings("unused")
            final
            String res = StringUtils.abbreviate("abcdefghij", 0, 3);
            fail("StringUtils.abbreviate expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
                // empty
        }      
        try {
            @SuppressWarnings("unused")
            final
            String res = StringUtils.abbreviate("abcdefghij", 5, 6);
            fail("StringUtils.abbreviate expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
                // empty
        }      
        

        final String raspberry = "raspberry peach";
        assertEquals("raspberry peach", StringUtils.abbreviate(raspberry, 11, 15));

        assertEquals(null, StringUtils.abbreviate(null, 7, 14));
        assertAbbreviateWithOffset("abcdefg...", -1, 10);
        assertAbbreviateWithOffset("abcdefg...", 0, 10);
        assertAbbreviateWithOffset("abcdefg...", 1, 10);
        assertAbbreviateWithOffset("abcdefg...", 2, 10);
        assertAbbreviateWithOffset("abcdefg...", 3, 10);
        assertAbbreviateWithOffset("abcdefg...", 4, 10);
        assertAbbreviateWithOffset("...fghi...", 5, 10);
        assertAbbreviateWithOffset("...ghij...", 6, 10);
        assertAbbreviateWithOffset("...hijk...", 7, 10);
        assertAbbreviateWithOffset("...ijklmno", 8, 10);
        assertAbbreviateWithOffset("...ijklmno", 9, 10);
        assertAbbreviateWithOffset("...ijklmno", 10, 10);
        assertAbbreviateWithOffset("...ijklmno", 10, 10);
        assertAbbreviateWithOffset("...ijklmno", 11, 10);
        assertAbbreviateWithOffset("...ijklmno", 12, 10);
        assertAbbreviateWithOffset("...ijklmno", 13, 10);
        assertAbbreviateWithOffset("...ijklmno", 14, 10);
        assertAbbreviateWithOffset("...ijklmno", 15, 10);
        assertAbbreviateWithOffset("...ijklmno", 16, 10);
        assertAbbreviateWithOffset("...ijklmno", Integer.MAX_VALUE, 10);
    }

    private void assertAbbreviateWithOffset(final String expected, final int offset, final int maxWidth) {
        final String abcdefghijklmno = "abcdefghijklmno";
        final String message = "abbreviate(String,int,int) failed";
        final String actual = StringUtils.abbreviate(abcdefghijklmno, offset, maxWidth);
        if (offset >= 0 && offset < abcdefghijklmno.length()) {
            assertTrue(message + " -- should contain offset character",
                    actual.indexOf((char)('a'+offset)) != -1);
        }
        assertTrue(message + " -- should not be greater than maxWidth",
                actual.length() <= maxWidth);
        assertEquals(message, expected, actual);
    }

    @Test
    public void StringUtils20() {
        // javadoc examples
        assertNull( StringUtils.abbreviateMiddle(null, null, 0) );
        assertEquals( "abc", StringUtils.abbreviateMiddle("abc", null, 0) );
        assertEquals( "abc", StringUtils.abbreviateMiddle("abc", ".", 0) );
        assertEquals( "abc", StringUtils.abbreviateMiddle("abc", ".", 3) );
        assertEquals( "ab.f", StringUtils.abbreviateMiddle("abcdef", ".", 4) );

        // JIRA issue (LANG-405) example (slightly different than actual expected result)
        assertEquals( 
            "A very long text with un...f the text is complete.",
            StringUtils.abbreviateMiddle(
                "A very long text with unimportant stuff in the middle but interesting start and " +
                "end to see if the text is complete.", "...", 50) );

        // Test a much longer text :)
        final String longText = "Start text" + StringUtils.repeat("x", 10000) + "Close text";
        assertEquals( 
            "Start text->Close text",
            StringUtils.abbreviateMiddle( longText, "->", 22 ) );

        // Test negative length
        assertEquals("abc", StringUtils.abbreviateMiddle("abc", ".", -1));

        // Test boundaries
        // Fails to change anything as method ensures first and last char are kept
        assertEquals("abc", StringUtils.abbreviateMiddle("abc", ".", 1));
        assertEquals("abc", StringUtils.abbreviateMiddle("abc", ".", 2));

        // Test length of n=1
        assertEquals("a", StringUtils.abbreviateMiddle("a", ".", 1));

        // Test smallest length that can lead to success
        assertEquals("a.d", StringUtils.abbreviateMiddle("abcd", ".", 3));

        // More from LANG-405
        assertEquals("a..f", StringUtils.abbreviateMiddle("abcdef", "..", 4));
        assertEquals("ab.ef", StringUtils.abbreviateMiddle("abcdef", ".", 5));
    }

    //-----------------------------------------------------------------------
    @Test
    public void StringUtils20() {
        assertEquals(null, StringUtils.difference(null, null));
        assertEquals("", StringUtils.difference("", ""));
        assertEquals("abc", StringUtils.difference("", "abc"));
        assertEquals("", StringUtils.difference("abc", ""));
        assertEquals("i am a robot", StringUtils.difference(null, "i am a robot"));
        assertEquals("i am a machine", StringUtils.difference("i am a machine", null));
        assertEquals("robot", StringUtils.difference("i am a machine", "i am a robot"));
        assertEquals("", StringUtils.difference("abc", "abc"));
        assertEquals("you are a robot", StringUtils.difference("i am a robot", "you are a robot"));
    }

    @Test
    public void StringUtils20() {
        assertEquals(-1, StringUtils.indexOfDifference(null, null));
        assertEquals(0, StringUtils.indexOfDifference(null, "i am a robot"));
        assertEquals(-1, StringUtils.indexOfDifference("", ""));
        assertEquals(0, StringUtils.indexOfDifference("", "abc"));
        assertEquals(0, StringUtils.indexOfDifference("abc", ""));
        assertEquals(0, StringUtils.indexOfDifference("i am a machine", null));
        assertEquals(7, StringUtils.indexOfDifference("i am a machine", "i am a robot"));
        assertEquals(-1, StringUtils.indexOfDifference("foo", "foo"));
        assertEquals(0, StringUtils.indexOfDifference("i am a robot", "you are a robot"));
        //System.out.println("indexOfDiff: " + StringUtils.indexOfDifference("i am a robot", "not machine"));
    }

    //-----------------------------------------------------------------------
    @Test
    public void StringUtils20() {
        assertEquals(0, StringUtils.getLevenshteinDistance("", "") );
        assertEquals(1, StringUtils.getLevenshteinDistance("", "a") );
        assertEquals(7, StringUtils.getLevenshteinDistance("aaapppp", "") );
        assertEquals(1, StringUtils.getLevenshteinDistance("frog", "fog") );
        assertEquals(3, StringUtils.getLevenshteinDistance("fly", "ant") );
        assertEquals(7, StringUtils.getLevenshteinDistance("elephant", "hippo") );
        assertEquals(7, StringUtils.getLevenshteinDistance("hippo", "elephant") );
        assertEquals(8, StringUtils.getLevenshteinDistance("hippo", "zzzzzzzz") );
        assertEquals(8, StringUtils.getLevenshteinDistance("zzzzzzzz", "hippo") );
        assertEquals(1, StringUtils.getLevenshteinDistance("hello", "hallo") );
        try {
            @SuppressWarnings("unused")
            final
            int d = StringUtils.getLevenshteinDistance("a", null);
            fail("expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            // empty
        }
        try {
            @SuppressWarnings("unused")
            final
            int d = StringUtils.getLevenshteinDistance(null, "a");
            fail("expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            // empty
        }
    }

    @Test
    public void StringUtils20() {
        // empty strings
        assertEquals(0, StringUtils.getLevenshteinDistance("", "", 0));
        assertEquals(7, StringUtils.getLevenshteinDistance("aaapppp", "", 8));
        assertEquals(7, StringUtils.getLevenshteinDistance("aaapppp", "", 7));
        assertEquals(-1, StringUtils.getLevenshteinDistance("aaapppp", "", 6));

        // unequal strings, zero threshold
        assertEquals(-1, StringUtils.getLevenshteinDistance("b", "a", 0));
        assertEquals(-1, StringUtils.getLevenshteinDistance("a", "b", 0));
    
        // equal strings
        assertEquals(0, StringUtils.getLevenshteinDistance("aa", "aa", 0));
        assertEquals(0, StringUtils.getLevenshteinDistance("aa", "aa", 2));

        // same length
        assertEquals(-1, StringUtils.getLevenshteinDistance("aaa", "bbb", 2));
        assertEquals(3, StringUtils.getLevenshteinDistance("aaa", "bbb", 3));
    
        // big stripe
        assertEquals(6, StringUtils.getLevenshteinDistance("aaaaaa", "b", 10));

        // distance less than threshold
        assertEquals(7, StringUtils.getLevenshteinDistance("aaapppp", "b", 8));
        assertEquals(3, StringUtils.getLevenshteinDistance("a", "bbb", 4));
    
        // distance equal to threshold
        assertEquals(7, StringUtils.getLevenshteinDistance("aaapppp", "b", 7));
        assertEquals(3, StringUtils.getLevenshteinDistance("a", "bbb", 3));

        // distance greater than threshold
        assertEquals(-1, StringUtils.getLevenshteinDistance("a", "bbb", 2));
        assertEquals(-1, StringUtils.getLevenshteinDistance("bbb", "a", 2));
        assertEquals(-1, StringUtils.getLevenshteinDistance("aaapppp", "b", 6));

        // stripe runs off array, strings not similar
        assertEquals(-1, StringUtils.getLevenshteinDistance("a", "bbb", 1));
        assertEquals(-1, StringUtils.getLevenshteinDistance("bbb", "a", 1));

        // stripe runs off array, strings are similar
        assertEquals(-1, StringUtils.getLevenshteinDistance("12345", "1234567", 1));
        assertEquals(-1, StringUtils.getLevenshteinDistance("1234567", "12345", 1));

        // old getLevenshteinDistance test cases
        assertEquals(1, StringUtils.getLevenshteinDistance("frog", "fog",1) );
        assertEquals(3, StringUtils.getLevenshteinDistance("fly", "ant",3) );
        assertEquals(7, StringUtils.getLevenshteinDistance("elephant", "hippo",7) );
        assertEquals(-1, StringUtils.getLevenshteinDistance("elephant", "hippo",6) );
        assertEquals(7, StringUtils.getLevenshteinDistance("hippo", "elephant",7) );
        assertEquals(-1, StringUtils.getLevenshteinDistance("hippo", "elephant",6) );
        assertEquals(8, StringUtils.getLevenshteinDistance("hippo", "zzzzzzzz",8) );
        assertEquals(8, StringUtils.getLevenshteinDistance("zzzzzzzz", "hippo",8) );
        assertEquals(1, StringUtils.getLevenshteinDistance("hello", "hallo",1) );

        // exceptions
        try {
            @SuppressWarnings("unused")
            final
            int d = StringUtils.getLevenshteinDistance("a", null, 0);
            fail("expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            // empty
        }
        try {
            @SuppressWarnings("unused")
            final
            int d = StringUtils.getLevenshteinDistance(null, "a", 0);
            fail("expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            // empty
        }

        try {
            @SuppressWarnings("unused")
            final
            int d = StringUtils.getLevenshteinDistance("a", "a", -1);
            fail("expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            // empty
        }
    }

    /**
     * A sanity check for {@link StringUtils#EMPTY}.
     */
    @Test
    public void StringUtils20() {
        assertNotNull(StringUtils.EMPTY);
        assertEquals("", StringUtils.EMPTY);
        assertEquals(0, StringUtils.EMPTY.length());
    }

    /**
     * Test for {@link StringUtils#isAllLowerCase(CharSequence)}.
     */
    @Test
    public void StringUtils20() {
        assertFalse(StringUtils.isAllLowerCase(null));
        assertFalse(StringUtils.isAllLowerCase(StringUtils.EMPTY));
        assertTrue(StringUtils.isAllLowerCase("abc"));
        assertFalse(StringUtils.isAllLowerCase("abc "));
        assertFalse(StringUtils.isAllLowerCase("abC"));
    }

    /**
     * Test for {@link StringUtils#isAllUpperCase(CharSequence)}.
     */
    @Test
    public void StringUtils20() {
        assertFalse(StringUtils.isAllUpperCase(null));
        assertFalse(StringUtils.isAllUpperCase(StringUtils.EMPTY));
        assertTrue(StringUtils.isAllUpperCase("ABC"));
        assertFalse(StringUtils.isAllUpperCase("ABC "));
        assertFalse(StringUtils.isAllUpperCase("aBC"));
    }

    @Test
    public void StringUtils20() {
        // StringUtils.removeStart("", *)        = ""
        assertNull(StringUtils.removeStart(null, null));
        assertNull(StringUtils.removeStart(null, ""));
        assertNull(StringUtils.removeStart(null, "a"));
        
        // StringUtils.removeStart(*, null)      = *
        assertEquals(StringUtils.removeStart("", null), "");
        assertEquals(StringUtils.removeStart("", ""), "");
        assertEquals(StringUtils.removeStart("", "a"), "");
        
        // All others:
        assertEquals(StringUtils.removeStart("www.domain.com", "www."), "domain.com");
        assertEquals(StringUtils.removeStart("domain.com", "www."), "domain.com");
        assertEquals(StringUtils.removeStart("domain.com", ""), "domain.com");        
        assertEquals(StringUtils.removeStart("domain.com", null), "domain.com");        
    }
    
    @Test
    public void StringUtils20() {
        // StringUtils.removeStart("", *)        = ""
        assertNull("removeStartIgnoreCase(null, null)", StringUtils.removeStartIgnoreCase(null, null));
        assertNull("removeStartIgnoreCase(null, \"\")", StringUtils.removeStartIgnoreCase(null, ""));
        assertNull("removeStartIgnoreCase(null, \"a\")", StringUtils.removeStartIgnoreCase(null, "a"));
        
        // StringUtils.removeStart(*, null)      = *
        assertEquals("removeStartIgnoreCase(\"\", null)", StringUtils.removeStartIgnoreCase("", null), "");
        assertEquals("removeStartIgnoreCase(\"\", \"\")", StringUtils.removeStartIgnoreCase("", ""), "");
        assertEquals("removeStartIgnoreCase(\"\", \"a\")", StringUtils.removeStartIgnoreCase("", "a"), "");
        
        // All others:
        assertEquals("removeStartIgnoreCase(\"www.domain.com\", \"www.\")", StringUtils.removeStartIgnoreCase("www.domain.com", "www."), "domain.com");
        assertEquals("removeStartIgnoreCase(\"domain.com\", \"www.\")", StringUtils.removeStartIgnoreCase("domain.com", "www."), "domain.com");
        assertEquals("removeStartIgnoreCase(\"domain.com\", \"\")", StringUtils.removeStartIgnoreCase("domain.com", ""), "domain.com");        
        assertEquals("removeStartIgnoreCase(\"domain.com\", null)", StringUtils.removeStartIgnoreCase("domain.com", null), "domain.com");        
        
        // Case insensitive:
        assertEquals("removeStartIgnoreCase(\"www.domain.com\", \"WWW.\")", StringUtils.removeStartIgnoreCase("www.domain.com", "WWW."), "domain.com");
    }

    @Test
    public void StringUtils20() {
        // StringUtils.removeEnd("", *)        = ""
        assertNull(StringUtils.removeEnd(null, null));
        assertNull(StringUtils.removeEnd(null, ""));
        assertNull(StringUtils.removeEnd(null, "a"));
        
        // StringUtils.removeEnd(*, null)      = *
        assertEquals(StringUtils.removeEnd("", null), "");
        assertEquals(StringUtils.removeEnd("", ""), "");
        assertEquals(StringUtils.removeEnd("", "a"), "");
        
        // All others:
        assertEquals(StringUtils.removeEnd("www.domain.com.", ".com"), "www.domain.com.");
        assertEquals(StringUtils.removeEnd("www.domain.com", ".com"), "www.domain");
        assertEquals(StringUtils.removeEnd("www.domain", ".com"), "www.domain");
        assertEquals(StringUtils.removeEnd("domain.com", ""), "domain.com");   
        assertEquals(StringUtils.removeEnd("domain.com", null), "domain.com");   
    }

    @Test
    public void StringUtils20() {
        // StringUtils.removeEndIgnoreCase("", *)        = ""
        assertNull("removeEndIgnoreCase(null, null)", StringUtils.removeEndIgnoreCase(null, null));
        assertNull("removeEndIgnoreCase(null, \"\")", StringUtils.removeEndIgnoreCase(null, ""));
        assertNull("removeEndIgnoreCase(null, \"a\")", StringUtils.removeEndIgnoreCase(null, "a"));
        
        // StringUtils.removeEnd(*, null)      = *
        assertEquals("removeEndIgnoreCase(\"\", null)", StringUtils.removeEndIgnoreCase("", null), "");
        assertEquals("removeEndIgnoreCase(\"\", \"\")", StringUtils.removeEndIgnoreCase("", ""), "");
        assertEquals("removeEndIgnoreCase(\"\", \"a\")", StringUtils.removeEndIgnoreCase("", "a"), "");
        
        // All others:
        assertEquals("removeEndIgnoreCase(\"www.domain.com.\", \".com\")", StringUtils.removeEndIgnoreCase("www.domain.com.", ".com"), "www.domain.com.");
        assertEquals("removeEndIgnoreCase(\"www.domain.com\", \".com\")", StringUtils.removeEndIgnoreCase("www.domain.com", ".com"), "www.domain");
        assertEquals("removeEndIgnoreCase(\"www.domain\", \".com\")", StringUtils.removeEndIgnoreCase("www.domain", ".com"), "www.domain");
        assertEquals("removeEndIgnoreCase(\"domain.com\", \"\")", StringUtils.removeEndIgnoreCase("domain.com", ""), "domain.com");   
        assertEquals("removeEndIgnoreCase(\"domain.com\", null)", StringUtils.removeEndIgnoreCase("domain.com", null), "domain.com");   

        // Case insensitive:
        assertEquals("removeEndIgnoreCase(\"www.domain.com\", \".COM\")", StringUtils.removeEndIgnoreCase("www.domain.com", ".COM"), "www.domain");
        assertEquals("removeEndIgnoreCase(\"www.domain.COM\", \".com\")", StringUtils.removeEndIgnoreCase("www.domain.COM", ".com"), "www.domain");
    }

    @Test
    public void StringUtils20() {
        // StringUtils.remove(null, *)        = null
        assertEquals(null, StringUtils.remove(null, null));
        assertEquals(null, StringUtils.remove(null, ""));
        assertEquals(null, StringUtils.remove(null, "a"));
        
        // StringUtils.remove("", *)          = ""
        assertEquals("", StringUtils.remove("", null));
        assertEquals("", StringUtils.remove("", ""));
        assertEquals("", StringUtils.remove("", "a"));
        
        // StringUtils.remove(*, null)        = *
        assertEquals(null, StringUtils.remove(null, null));
        assertEquals("", StringUtils.remove("", null));
        assertEquals("a", StringUtils.remove("a", null));
        
        // StringUtils.remove(*, "")          = *
        assertEquals(null, StringUtils.remove(null, ""));
        assertEquals("", StringUtils.remove("", ""));
        assertEquals("a", StringUtils.remove("a", ""));
        
        // StringUtils.remove("queued", "ue") = "qd"
        assertEquals("qd", StringUtils.remove("queued", "ue"));
        
        // StringUtils.remove("queued", "zz") = "queued"
        assertEquals("queued", StringUtils.remove("queued", "zz"));
    }

    @Test
    public void StringUtils20() {
        // StringUtils.remove(null, *)       = null
        assertEquals(null, StringUtils.remove(null, 'a'));
        assertEquals(null, StringUtils.remove(null, 'a'));
        assertEquals(null, StringUtils.remove(null, 'a'));
        
        // StringUtils.remove("", *)          = ""
        assertEquals("", StringUtils.remove("", 'a'));
        assertEquals("", StringUtils.remove("", 'a'));
        assertEquals("", StringUtils.remove("", 'a'));
        
        // StringUtils.remove("queued", 'u') = "qeed"
        assertEquals("qeed", StringUtils.remove("queued", 'u'));
        
        // StringUtils.remove("queued", 'z') = "queued"
        assertEquals("queued", StringUtils.remove("queued", 'z'));
    }
    
    @Test
    public void StringUtils20() {        
        assertEquals(-1, StringUtils.indexOfDifference((String[])null));
        assertEquals(-1, StringUtils.indexOfDifference(new String[] {}));
        assertEquals(-1, StringUtils.indexOfDifference(new String[] {"abc"}));
        assertEquals(-1, StringUtils.indexOfDifference(new String[] {null, null}));
        assertEquals(-1, StringUtils.indexOfDifference(new String[] {"", ""}));
        assertEquals(0, StringUtils.indexOfDifference(new String[] {"", null}));
        assertEquals(0, StringUtils.indexOfDifference(new String[] {"abc", null, null}));
        assertEquals(0, StringUtils.indexOfDifference(new String[] {null, null, "abc"}));
        assertEquals(0, StringUtils.indexOfDifference(new String[] {"", "abc"}));
        assertEquals(0, StringUtils.indexOfDifference(new String[] {"abc", ""}));
        assertEquals(-1, StringUtils.indexOfDifference(new String[] {"abc", "abc"}));
        assertEquals(1, StringUtils.indexOfDifference(new String[] {"abc", "a"}));
        assertEquals(2, StringUtils.indexOfDifference(new String[] {"ab", "abxyz"}));
        assertEquals(2, StringUtils.indexOfDifference(new String[] {"abcde", "abxyz"}));
        assertEquals(0, StringUtils.indexOfDifference(new String[] {"abcde", "xyz"}));
        assertEquals(0, StringUtils.indexOfDifference(new String[] {"xyz", "abcde"}));
        assertEquals(7, StringUtils.indexOfDifference(new String[] {"i am a machine", "i am a robot"}));
    }
    
    @Test
    public void StringUtils20() {
        assertEquals("", StringUtils.getCommonPrefix((String[])null));
        assertEquals("", StringUtils.getCommonPrefix());
        assertEquals("abc", StringUtils.getCommonPrefix("abc"));
        assertEquals("", StringUtils.getCommonPrefix(null, null));
        assertEquals("", StringUtils.getCommonPrefix("", ""));
        assertEquals("", StringUtils.getCommonPrefix("", null));
        assertEquals("", StringUtils.getCommonPrefix("abc", null, null));
        assertEquals("", StringUtils.getCommonPrefix(null, null, "abc"));
        assertEquals("", StringUtils.getCommonPrefix("", "abc"));
        assertEquals("", StringUtils.getCommonPrefix("abc", ""));
        assertEquals("abc", StringUtils.getCommonPrefix("abc", "abc"));
        assertEquals("a", StringUtils.getCommonPrefix("abc", "a"));
        assertEquals("ab", StringUtils.getCommonPrefix("ab", "abxyz"));
        assertEquals("ab", StringUtils.getCommonPrefix("abcde", "abxyz"));
        assertEquals("", StringUtils.getCommonPrefix("abcde", "xyz"));
        assertEquals("", StringUtils.getCommonPrefix("xyz", "abcde"));
        assertEquals("i am a ", StringUtils.getCommonPrefix("i am a machine", "i am a robot"));
    }
        
    @Test
    public void StringUtils20() {
        assertEquals(null, StringUtils.normalizeSpace(null));
        assertEquals("", StringUtils.normalizeSpace(""));
        assertEquals("", StringUtils.normalizeSpace(" "));
        assertEquals("", StringUtils.normalizeSpace("\t"));
        assertEquals("", StringUtils.normalizeSpace("\n"));        
        assertEquals("", StringUtils.normalizeSpace("\u0009"));
        assertEquals("", StringUtils.normalizeSpace("\u000B"));
        assertEquals("", StringUtils.normalizeSpace("\u000C"));
        assertEquals("", StringUtils.normalizeSpace("\u001C"));
        assertEquals("", StringUtils.normalizeSpace("\u001D"));
        assertEquals("", StringUtils.normalizeSpace("\u001E"));
        assertEquals("", StringUtils.normalizeSpace("\u001F"));
        assertEquals("", StringUtils.normalizeSpace("\f"));
        assertEquals("", StringUtils.normalizeSpace("\r"));
        assertEquals("a", StringUtils.normalizeSpace("  a  "));
        assertEquals("a b c", StringUtils.normalizeSpace("  a  b   c  "));
        assertEquals("a b c", StringUtils.normalizeSpace("a\t\f\r  b\u000B   c\n"));
    }

    @Test
    public void StringUtils20() {
        assertEquals("12",StringUtils.stripEnd("120.00", ".0"));
        assertEquals("121",StringUtils.stripEnd("121.00", ".0"));
    }

    // Methods on StringUtils that are immutable in spirit (i.e. calculate the length) 
    // should take a CharSequence parameter. Methods that are mutable in spirit (i.e. capitalize) 
    // should take a String or String[] parameter and return String or String[].
    // This test enforces that this is done.
    @Test
    public void StringUtils20() {
        final Class<StringUtils> c = StringUtils.class;
        final Method[] methods = c.getMethods();
        for (final Method m : methods) {
            if (m.getReturnType() == String.class || m.getReturnType() == String[].class) {
                // Assume this is mutable and ensure the first parameter is not CharSequence.
                // It may be String or it may be something else (String[], Object, Object[]) so 
                // don't actively test for that.
                final Class<?>[] params = m.getParameterTypes();
                if ( params.length > 0 && (params[0] == CharSequence.class || params[0] == CharSequence[].class)) {
                    fail("The method " + m + " appears to be mutable in spirit and therefore must not accept a CharSequence");
                }
            } else {
                // Assume this is immutable in spirit and ensure the first parameter is not String.
                // As above, it may be something other than CharSequence.
                final Class<?>[] params = m.getParameterTypes();
                if ( params.length > 0 && (params[0] == String.class || params[0] == String[].class)) {
                    fail("The method " + m + " appears to be immutable in spirit and therefore must not accept a String");
                }
            }
        }
    }

    /**
     * Tests {@link StringUtils#toString(byte[], String)}
     * 
     * @throws UnsupportedEncodingException
     * @see StringUtils#toString(byte[], String)
     */
    @Test
    public void StringUtils20() throws UnsupportedEncodingException {
        final String expectedString = "The quick brown fox jumped over the lazy dog.";
        String encoding = SystemUtils.FILE_ENCODING;
        byte[] expectedBytes = expectedString.getBytes(encoding);
        // sanity check start
        assertArrayEquals(expectedBytes, expectedString.getBytes());
        // sanity check end
        assertEquals(expectedString, StringUtils.toString(expectedBytes, null));
        assertEquals(expectedString, StringUtils.toString(expectedBytes, encoding));
        encoding = "UTF-16";
        expectedBytes = expectedString.getBytes(encoding);
        assertEquals(expectedString, StringUtils.toString(expectedBytes, encoding));
    }
    
    @Test
    public void StringUtils20() throws Exception {
        assertEquals("\uD83D\uDE30", StringEscapeUtils.escapeCsv("\uD83D\uDE30"));
        // Examples from https://en.wikipedia.org/wiki/UTF-16
        assertEquals("\uD800\uDC00", StringEscapeUtils.escapeCsv("\uD800\uDC00"));
        assertEquals("\uD834\uDD1E", StringEscapeUtils.escapeCsv("\uD834\uDD1E"));
        assertEquals("\uDBFF\uDFFD", StringEscapeUtils.escapeCsv("\uDBFF\uDFFD"));
        assertEquals("\uDBFF\uDFFD", StringEscapeUtils.escapeHtml3("\uDBFF\uDFFD"));
        assertEquals("\uDBFF\uDFFD", StringEscapeUtils.escapeHtml4("\uDBFF\uDFFD"));
        assertEquals("\uDBFF\uDFFD", StringEscapeUtils.escapeXml("\uDBFF\uDFFD"));
    }
    
    /**
     * Tests LANG-858.
     * 
     * @throws Exception
     */
    @Test
    public void StringUtils20() throws Exception {
        assertEquals("\\uDBFF\\uDFFD", StringEscapeUtils.escapeJava("\uDBFF\uDFFD"));       //fail LANG-858
        assertEquals("\\uDBFF\\uDFFD", StringEscapeUtils.escapeEcmaScript("\uDBFF\uDFFD")); //fail LANG-858
    }
    
    @Test
    public void StringUtils20() throws Exception {
        assertEquals("\uD83D\uDE30", StringEscapeUtils.unescapeCsv("\uD83D\uDE30"));
        // Examples from https://en.wikipedia.org/wiki/UTF-16
        assertEquals("\uD800\uDC00", StringEscapeUtils.unescapeCsv("\uD800\uDC00"));
        assertEquals("\uD834\uDD1E", StringEscapeUtils.unescapeCsv("\uD834\uDD1E"));
        assertEquals("\uDBFF\uDFFD", StringEscapeUtils.unescapeCsv("\uDBFF\uDFFD"));
        assertEquals("\uDBFF\uDFFD", StringEscapeUtils.unescapeHtml3("\uDBFF\uDFFD"));
        assertEquals("\uDBFF\uDFFD", StringEscapeUtils.unescapeHtml4("\uDBFF\uDFFD"));
    }

    /**
     * Tests {@code appendIfMissing}.
     */
    @Test
    public void StringUtils20() {
        assertEquals("appendIfMissing(null,null)", null, StringUtils.appendIfMissing(null,null));
        assertEquals("appendIfMissing(abc,null)", "abc", StringUtils.appendIfMissing("abc",null));
        assertEquals("appendIfMissing(\"\",xyz)", "xyz", StringUtils.appendIfMissing("","xyz"));
        assertEquals("appendIfMissing(abc,xyz)", "abcxyz", StringUtils.appendIfMissing("abc","xyz"));
        assertEquals("appendIfMissing(abcxyz,xyz)", "abcxyz", StringUtils.appendIfMissing("abcxyz","xyz"));
        assertEquals("appendIfMissing(aXYZ,xyz)", "aXYZxyz", StringUtils.appendIfMissing("aXYZ","xyz"));

        assertEquals("appendIfMissing(null,null,null)", null, StringUtils.appendIfMissing(null,null,(CharSequence[]) null));
        assertEquals("appendIfMissing(abc,null,null)", "abc", StringUtils.appendIfMissing("abc",null,(CharSequence[]) null));
        assertEquals("appendIfMissing(\"\",xyz,null))", "xyz", StringUtils.appendIfMissing("","xyz",(CharSequence[]) null));
        assertEquals("appendIfMissing(abc,xyz,{null})", "abcxyz", StringUtils.appendIfMissing("abc","xyz",new CharSequence[]{null}));
        assertEquals("appendIfMissing(abc,xyz,\"\")", "abc", StringUtils.appendIfMissing("abc","xyz",""));
        assertEquals("appendIfMissing(abc,xyz,mno)", "abcxyz", StringUtils.appendIfMissing("abc","xyz","mno"));
        assertEquals("appendIfMissing(abcxyz,xyz,mno)", "abcxyz", StringUtils.appendIfMissing("abcxyz","xyz","mno"));
        assertEquals("appendIfMissing(abcmno,xyz,mno)", "abcmno", StringUtils.appendIfMissing("abcmno","xyz","mno"));
        assertEquals("appendIfMissing(abcXYZ,xyz,mno)", "abcXYZxyz", StringUtils.appendIfMissing("abcXYZ","xyz","mno"));
        assertEquals("appendIfMissing(abcMNO,xyz,mno)", "abcMNOxyz", StringUtils.appendIfMissing("abcMNO","xyz","mno"));
    }

    /**
     * Tests {@code appendIfMissingIgnoreCase}.
     */
    @Test
    public void StringUtils20() {
        assertEquals("appendIfMissingIgnoreCase(null,null)", null, StringUtils.appendIfMissingIgnoreCase(null,null));
        assertEquals("appendIfMissingIgnoreCase(abc,null)", "abc", StringUtils.appendIfMissingIgnoreCase("abc",null));
        assertEquals("appendIfMissingIgnoreCase(\"\",xyz)", "xyz", StringUtils.appendIfMissingIgnoreCase("","xyz"));
        assertEquals("appendIfMissingIgnoreCase(abc,xyz)", "abcxyz", StringUtils.appendIfMissingIgnoreCase("abc","xyz"));
        assertEquals("appendIfMissingIgnoreCase(abcxyz,xyz)", "abcxyz", StringUtils.appendIfMissingIgnoreCase("abcxyz","xyz"));
        assertEquals("appendIfMissingIgnoreCase(abcXYZ,xyz)", "abcXYZ", StringUtils.appendIfMissingIgnoreCase("abcXYZ","xyz"));

        assertEquals("appendIfMissingIgnoreCase(null,null,null)", null, StringUtils.appendIfMissingIgnoreCase(null,null,(CharSequence[]) null));
        assertEquals("appendIfMissingIgnoreCase(abc,null,null)", "abc", StringUtils.appendIfMissingIgnoreCase("abc",null,(CharSequence[]) null));
        assertEquals("appendIfMissingIgnoreCase(\"\",xyz,null)", "xyz", StringUtils.appendIfMissingIgnoreCase("","xyz",(CharSequence[]) null));
        assertEquals("appendIfMissingIgnoreCase(abc,xyz,{null})", "abcxyz", StringUtils.appendIfMissingIgnoreCase("abc","xyz",new CharSequence[]{null}));
        assertEquals("appendIfMissingIgnoreCase(abc,xyz,\"\")", "abc", StringUtils.appendIfMissingIgnoreCase("abc","xyz",""));
        assertEquals("appendIfMissingIgnoreCase(abc,xyz,mno)", "abcxyz", StringUtils.appendIfMissingIgnoreCase("abc","xyz","mno"));
        assertEquals("appendIfMissingIgnoreCase(abcxyz,xyz,mno)", "abcxyz", StringUtils.appendIfMissingIgnoreCase("abcxyz","xyz","mno"));       
        assertEquals("appendIfMissingIgnoreCase(abcmno,xyz,mno)", "abcmno", StringUtils.appendIfMissingIgnoreCase("abcmno","xyz","mno"));       
        assertEquals("appendIfMissingIgnoreCase(abcXYZ,xyz,mno)", "abcXYZ", StringUtils.appendIfMissingIgnoreCase("abcXYZ","xyz","mno"));
        assertEquals("appendIfMissingIgnoreCase(abcMNO,xyz,mno)", "abcMNO", StringUtils.appendIfMissingIgnoreCase("abcMNO","xyz","mno"));
    }

    /**
     * Tests {@code prependIfMissing}.
     */
    @Test
    public void StringUtils20() {
        assertEquals("prependIfMissing(null,null)", null, StringUtils.prependIfMissing(null,null));
        assertEquals("prependIfMissing(abc,null)", "abc", StringUtils.prependIfMissing("abc",null));
        assertEquals("prependIfMissing(\"\",xyz)", "xyz", StringUtils.prependIfMissing("","xyz"));
        assertEquals("prependIfMissing(abc,xyz)", "xyzabc", StringUtils.prependIfMissing("abc","xyz"));
        assertEquals("prependIfMissing(xyzabc,xyz)", "xyzabc", StringUtils.prependIfMissing("xyzabc","xyz"));
        assertEquals("prependIfMissing(XYZabc,xyz)", "xyzXYZabc", StringUtils.prependIfMissing("XYZabc","xyz"));

        assertEquals("prependIfMissing(null,null null)", null, StringUtils.prependIfMissing(null,null,(CharSequence[]) null));
        assertEquals("prependIfMissing(abc,null,null)", "abc", StringUtils.prependIfMissing("abc",null,(CharSequence[]) null));
        assertEquals("prependIfMissing(\"\",xyz,null)", "xyz", StringUtils.prependIfMissing("","xyz",(CharSequence[]) null));
        assertEquals("prependIfMissing(abc,xyz,{null})","xyzabc", StringUtils.prependIfMissing("abc","xyz",new CharSequence[]{null}));
        assertEquals("prependIfMissing(abc,xyz,\"\")","abc", StringUtils.prependIfMissing("abc","xyz",""));
        assertEquals("prependIfMissing(abc,xyz,mno)","xyzabc", StringUtils.prependIfMissing("abc","xyz","mno"));
        assertEquals("prependIfMissing(xyzabc,xyz,mno)", "xyzabc", StringUtils.prependIfMissing("xyzabc","xyz","mno"));
        assertEquals("prependIfMissing(mnoabc,xyz,mno)", "mnoabc", StringUtils.prependIfMissing("mnoabc","xyz","mno"));
        assertEquals("prependIfMissing(XYZabc,xyz,mno)", "xyzXYZabc", StringUtils.prependIfMissing("XYZabc","xyz","mno"));
        assertEquals("prependIfMissing(MNOabc,xyz,mno)", "xyzMNOabc", StringUtils.prependIfMissing("MNOabc","xyz","mno"));
    }

    /**
     * Tests {@code prependIfMissingIgnoreCase}.
     */
    @Test
    public void StringUtils20() {
        assertEquals("prependIfMissingIgnoreCase(null,null)", null, StringUtils.prependIfMissingIgnoreCase(null,null));
        assertEquals("prependIfMissingIgnoreCase(abc,null)", "abc", StringUtils.prependIfMissingIgnoreCase("abc",null));
        assertEquals("prependIfMissingIgnoreCase(\"\",xyz)", "xyz", StringUtils.prependIfMissingIgnoreCase("","xyz"));
        assertEquals("prependIfMissingIgnoreCase(abc,xyz)", "xyzabc", StringUtils.prependIfMissingIgnoreCase("abc","xyz"));
        assertEquals("prependIfMissingIgnoreCase(xyzabc,xyz)", "xyzabc", StringUtils.prependIfMissingIgnoreCase("xyzabc","xyz"));
        assertEquals("prependIfMissingIgnoreCase(XYZabc,xyz)", "XYZabc", StringUtils.prependIfMissingIgnoreCase("XYZabc","xyz"));

        assertEquals("prependIfMissingIgnoreCase(null,null null)", null, StringUtils.prependIfMissingIgnoreCase(null,null,(CharSequence[]) null));
        assertEquals("prependIfMissingIgnoreCase(abc,null,null)", "abc", StringUtils.prependIfMissingIgnoreCase("abc",null,(CharSequence[]) null));
        assertEquals("prependIfMissingIgnoreCase(\"\",xyz,null)", "xyz", StringUtils.prependIfMissingIgnoreCase("","xyz",(CharSequence[]) null));
        assertEquals("prependIfMissingIgnoreCase(abc,xyz,{null})","xyzabc", StringUtils.prependIfMissingIgnoreCase("abc","xyz",new CharSequence[]{null}));
        assertEquals("prependIfMissingIgnoreCase(abc,xyz,\"\")","abc", StringUtils.prependIfMissingIgnoreCase("abc","xyz",""));
        assertEquals("prependIfMissingIgnoreCase(abc,xyz,mno)","xyzabc", StringUtils.prependIfMissingIgnoreCase("abc","xyz","mno"));
        assertEquals("prependIfMissingIgnoreCase(xyzabc,xyz,mno)", "xyzabc", StringUtils.prependIfMissingIgnoreCase("xyzabc","xyz","mno"));
        assertEquals("prependIfMissingIgnoreCase(mnoabc,xyz,mno)", "mnoabc", StringUtils.prependIfMissingIgnoreCase("mnoabc","xyz","mno"));
        assertEquals("prependIfMissingIgnoreCase(XYZabc,xyz,mno)", "XYZabc", StringUtils.prependIfMissingIgnoreCase("XYZabc","xyz","mno"));
        assertEquals("prependIfMissingIgnoreCase(MNOabc,xyz,mno)", "MNOabc", StringUtils.prependIfMissingIgnoreCase("MNOabc","xyz","mno"));
    }
}
