
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
import static org.junit.Assert.*;
import java.io.Reader;
import java.io.Writer;
import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

/**
 * Unit tests for {@link org.apache.commons.lang3.text.StrBuilder}.
 * 
 * @version $Id$
 */
public class StrBuilderTest {

    @Test
    public void StrBuilder64() {
        StrBuilder sb = new StrBuilder("aaxaaaayaa");
        sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, sb.length(), -1);
        assertEquals("-x--y-", sb.toString());
        
        sb = new StrBuilder("aaxaaaayaa");
        sb.replace(StrMatcher.stringMatcher("aa"), "-", 1, sb.length(), -1);
        assertEquals("aax--y-", sb.toString());
        
        sb = new StrBuilder("aaxaaaayaa");
        sb.replace(StrMatcher.stringMatcher("aa"), "-", 2, sb.length(), -1);
        assertEquals("aax--y-", sb.toString());
        
        sb = new StrBuilder("aaxaaaayaa");
        sb.replace(StrMatcher.stringMatcher("aa"), "-", 3, sb.length(), -1);
        assertEquals("aax--y-", sb.toString());
        
        sb = new StrBuilder("aaxaaaayaa");
        sb.replace(StrMatcher.stringMatcher("aa"), "-", 4, sb.length(), -1);
        assertEquals("aaxa-ay-", sb.toString());
        
        sb = new StrBuilder("aaxaaaayaa");
        sb.replace(StrMatcher.stringMatcher("aa"), "-", 5, sb.length(), -1);
        assertEquals("aaxaa-y-", sb.toString());
        
        sb = new StrBuilder("aaxaaaayaa");
        sb.replace(StrMatcher.stringMatcher("aa"), "-", 6, sb.length(), -1);
        assertEquals("aaxaaaay-", sb.toString());
        
        sb = new StrBuilder("aaxaaaayaa");
        sb.replace(StrMatcher.stringMatcher("aa"), "-", 7, sb.length(), -1);
        assertEquals("aaxaaaay-", sb.toString());
        
        sb = new StrBuilder("aaxaaaayaa");
        sb.replace(StrMatcher.stringMatcher("aa"), "-", 8, sb.length(), -1);
        assertEquals("aaxaaaay-", sb.toString());
        
        sb = new StrBuilder("aaxaaaayaa");
        sb.replace(StrMatcher.stringMatcher("aa"), "-", 9, sb.length(), -1);
        assertEquals("aaxaaaayaa", sb.toString());
        
        sb = new StrBuilder("aaxaaaayaa");
        sb.replace(StrMatcher.stringMatcher("aa"), "-", 10, sb.length(), -1);
        assertEquals("aaxaaaayaa", sb.toString());
        
        sb = new StrBuilder("aaxaaaayaa");
        try {
            sb.replace(StrMatcher.stringMatcher("aa"), "-", 11, sb.length(), -1);
            fail();
        } catch (final IndexOutOfBoundsException ex) {}
        assertEquals("aaxaaaayaa", sb.toString());
        
        sb = new StrBuilder("aaxaaaayaa");
        try {
            sb.replace(StrMatcher.stringMatcher("aa"), "-", -1, sb.length(), -1);
            fail();
        } catch (final IndexOutOfBoundsException ex) {}
        assertEquals("aaxaaaayaa", sb.toString());
    }

    @Test
    public void StrBuilder64() {
        StrBuilder sb = new StrBuilder("aaxaaaayaa");
        sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 0, -1);
        assertEquals("aaxaaaayaa", sb.toString());
        
        sb = new StrBuilder("aaxaaaayaa");
        sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 2, -1);
        assertEquals("-xaaaayaa", sb.toString());
        
        sb = new StrBuilder("aaxaaaayaa");
        sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 3, -1);
        assertEquals("-xaaaayaa", sb.toString());
        
        sb = new StrBuilder("aaxaaaayaa");
        sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 4, -1);
        assertEquals("-xaaaayaa", sb.toString());
        
        sb = new StrBuilder("aaxaaaayaa");
        sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 5, -1);
        assertEquals("-x-aayaa", sb.toString());
        
        sb = new StrBuilder("aaxaaaayaa");
        sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 6, -1);
        assertEquals("-x-aayaa", sb.toString());
        
        sb = new StrBuilder("aaxaaaayaa");
        sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 7, -1);
        assertEquals("-x--yaa", sb.toString());
        
        sb = new StrBuilder("aaxaaaayaa");
        sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 8, -1);
        assertEquals("-x--yaa", sb.toString());
        
        sb = new StrBuilder("aaxaaaayaa");
        sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 9, -1);
        assertEquals("-x--yaa", sb.toString());
        
        sb = new StrBuilder("aaxaaaayaa");
        sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 10, -1);
        assertEquals("-x--y-", sb.toString());
        
        sb = new StrBuilder("aaxaaaayaa");
        sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 1000, -1);
        assertEquals("-x--y-", sb.toString());
        
        sb = new StrBuilder("aaxaaaayaa");
        try {
            sb.replace(StrMatcher.stringMatcher("aa"), "-", 2, 1, -1);
            fail();
        } catch (final IndexOutOfBoundsException ex) {}
        assertEquals("aaxaaaayaa", sb.toString());
    }

    @Test
    public void StrBuilder64() {
        StrBuilder sb = new StrBuilder("aaxaaaayaa");
        sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 10, -1);
        assertEquals("-x--y-", sb.toString());
        
        sb = new StrBuilder("aaxaaaayaa");
        sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 10, 0);
        assertEquals("aaxaaaayaa", sb.toString());
        
        sb = new StrBuilder("aaxaaaayaa");
        sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 10, 1);
        assertEquals("-xaaaayaa", sb.toString());
        
        sb = new StrBuilder("aaxaaaayaa");
        sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 10, 2);
        assertEquals("-x-aayaa", sb.toString());
        
        sb = new StrBuilder("aaxaaaayaa");
        sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 10, 3);
        assertEquals("-x--yaa", sb.toString());
        
        sb = new StrBuilder("aaxaaaayaa");
        sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 10, 4);
        assertEquals("-x--y-", sb.toString());
        
        sb = new StrBuilder("aaxaaaayaa");
        sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 10, 5);
        assertEquals("-x--y-", sb.toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder64() {
        final StrBuilder sb = new StrBuilder();
        assertEquals("", sb.reverse().toString());
        
        sb.clear().append(true);
        assertEquals("eurt", sb.reverse().toString());
        assertEquals("true", sb.reverse().toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder64() {
        final StrBuilder sb = new StrBuilder();
        assertEquals("", sb.reverse().toString());
        
        sb.clear().append(" \u0000 ");
        assertEquals("", sb.trim().toString());
        
        sb.clear().append(" \u0000 a b c");
        assertEquals("a b c", sb.trim().toString());
        
        sb.clear().append("a b c \u0000 ");
        assertEquals("a b c", sb.trim().toString());
        
        sb.clear().append(" \u0000 a b c \u0000 ");
        assertEquals("a b c", sb.trim().toString());
        
        sb.clear().append("a b c");
        assertEquals("a b c", sb.trim().toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder64() {
        final StrBuilder sb = new StrBuilder();
        assertFalse(sb.startsWith("a"));
        assertFalse(sb.startsWith(null));
        assertTrue(sb.startsWith(""));
        sb.append("abc");
        assertTrue(sb.startsWith("a"));
        assertTrue(sb.startsWith("ab"));
        assertTrue(sb.startsWith("abc"));
        assertFalse(sb.startsWith("cba"));
    }

    @Test
    public void StrBuilder64() {
        final StrBuilder sb = new StrBuilder();
        assertFalse(sb.endsWith("a"));
        assertFalse(sb.endsWith("c"));
        assertTrue(sb.endsWith(""));
        assertFalse(sb.endsWith(null));
        sb.append("abc");
        assertTrue(sb.endsWith("c"));
        assertTrue(sb.endsWith("bc"));
        assertTrue(sb.endsWith("abc"));
        assertFalse(sb.endsWith("cba"));
        assertFalse(sb.endsWith("abcd"));
        assertFalse(sb.endsWith(" abc"));
        assertFalse(sb.endsWith("abc "));
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder64() {
       final StrBuilder sb = new StrBuilder ("hello goodbye");
       // Start index is negative
       try {
            sb.subSequence(-1, 5);
            fail();
        } catch (final IndexOutOfBoundsException e) {}
        
        // End index is negative
       try {
            sb.subSequence(2, -1);
            fail();
        } catch (final IndexOutOfBoundsException e) {}
        
        // End index greater than length()
        try {
            sb.subSequence(2, sb.length() + 1);
            fail();
        } catch (final IndexOutOfBoundsException e) {}
        
        // Start index greater then end index
        try {
            sb.subSequence(3, 2);
            fail();
        } catch (final IndexOutOfBoundsException e) {}
        
        // Normal cases
        assertEquals ("hello", sb.subSequence(0, 5));
        assertEquals ("hello goodbye".subSequence(0, 6), sb.subSequence(0, 6));
        assertEquals ("goodbye", sb.subSequence(6, 13));
        assertEquals ("hello goodbye".subSequence(6,13), sb.subSequence(6, 13));
    }

    @Test
    public void StrBuilder64() {
        final StrBuilder sb = new StrBuilder ("hello goodbye");
        assertEquals ("goodbye", sb.substring(6));
        assertEquals ("hello goodbye".substring(6), sb.substring(6));
        assertEquals ("hello goodbye", sb.substring(0));
        assertEquals ("hello goodbye".substring(0), sb.substring(0));
        try {
            sb.substring(-1);
            fail ();
        } catch (final IndexOutOfBoundsException e) {}
        
        try {
            sb.substring(15);
            fail ();
        } catch (final IndexOutOfBoundsException e) {}
    
    }
    
    @Test
    public void StrBuilder64() {
        final StrBuilder sb = new StrBuilder ("hello goodbye");
        assertEquals ("hello", sb.substring(0, 5));
        assertEquals ("hello goodbye".substring(0, 6), sb.substring(0, 6));
        
        assertEquals ("goodbye", sb.substring(6, 13));
        assertEquals ("hello goodbye".substring(6,13), sb.substring(6, 13));
        
        assertEquals ("goodbye", sb.substring(6, 20));
        
        try {
            sb.substring(-1, 5);
            fail();
        } catch (final IndexOutOfBoundsException e) {}
        
        try {
            sb.substring(15, 20);
            fail();
        } catch (final IndexOutOfBoundsException e) {}
    }

    // -----------------------------------------------------------------------
    @Test
    public void StrBuilder64() {
        final StrBuilder sb = new StrBuilder("hello goodbye hello");
        assertEquals("goodbye", sb.midString(6, 7));
        assertEquals("hello", sb.midString(0, 5));
        assertEquals("hello", sb.midString(-5, 5));
        assertEquals("", sb.midString(0, -1));
        assertEquals("", sb.midString(20, 2));
        assertEquals("hello", sb.midString(14, 22));
    }

    @Test
    public void StrBuilder64() {
        final StrBuilder sb = new StrBuilder("left right");
        assertEquals("right", sb.rightString(5));
        assertEquals("", sb.rightString(0));
        assertEquals("", sb.rightString(-5));
        assertEquals("left right", sb.rightString(15));
    }

    @Test
    public void StrBuilder64() {
        final StrBuilder sb = new StrBuilder("left right");
        assertEquals("left", sb.leftString(4));
        assertEquals("", sb.leftString(0));
        assertEquals("", sb.leftString(-5));
        assertEquals("left right", sb.leftString(15));
    }

    // -----------------------------------------------------------------------
    @Test
    public void StrBuilder64() {
        final StrBuilder sb = new StrBuilder("abcdefghijklmnopqrstuvwxyz");
        assertTrue(sb.contains('a'));
        assertTrue(sb.contains('o'));
        assertTrue(sb.contains('z'));
        assertFalse(sb.contains('1'));
    }

    @Test
    public void StrBuilder64() {
        final StrBuilder sb = new StrBuilder("abcdefghijklmnopqrstuvwxyz");
        assertTrue(sb.contains("a"));
        assertTrue(sb.contains("pq"));
        assertTrue(sb.contains("z"));
        assertFalse(sb.contains("zyx"));
        assertFalse(sb.contains((String) null));
    }

    @Test
    public void StrBuilder64() {
        StrBuilder sb = new StrBuilder("abcdefghijklmnopqrstuvwxyz");
        assertTrue(sb.contains(StrMatcher.charMatcher('a')));
        assertTrue(sb.contains(StrMatcher.stringMatcher("pq")));
        assertTrue(sb.contains(StrMatcher.charMatcher('z')));
        assertFalse(sb.contains(StrMatcher.stringMatcher("zy")));
        assertFalse(sb.contains((StrMatcher) null));

        sb = new StrBuilder();
        assertFalse(sb.contains(A_NUMBER_MATCHER));
        sb.append("B A1 C");
        assertTrue(sb.contains(A_NUMBER_MATCHER));
    }

    // -----------------------------------------------------------------------
    @Test
    public void StrBuilder64() {
        final StrBuilder sb = new StrBuilder("abab");
        assertEquals(0, sb.indexOf('a'));
        
        // should work like String#indexOf
        assertEquals("abab".indexOf('a'), sb.indexOf('a'));

        assertEquals(1, sb.indexOf('b'));
        assertEquals("abab".indexOf('b'), sb.indexOf('b'));

        assertEquals(-1, sb.indexOf('z'));
    }

    @Test
    public void StrBuilder64() {
        StrBuilder sb = new StrBuilder("abab");
        assertEquals(0, sb.indexOf('a', -1));
        assertEquals(0, sb.indexOf('a', 0));
        assertEquals(2, sb.indexOf('a', 1));
        assertEquals(-1, sb.indexOf('a', 4));
        assertEquals(-1, sb.indexOf('a', 5));

        // should work like String#indexOf
        assertEquals("abab".indexOf('a', 1), sb.indexOf('a', 1));

        assertEquals(3, sb.indexOf('b', 2));
        assertEquals("abab".indexOf('b', 2), sb.indexOf('b', 2));

        assertEquals(-1, sb.indexOf('z', 2));

        sb = new StrBuilder("xyzabc");
        assertEquals(2, sb.indexOf('z', 0));
        assertEquals(-1, sb.indexOf('z', 3));
    }

    @Test
    public void StrBuilder64() {
        final StrBuilder sb = new StrBuilder("abab");
        
        assertEquals (2, sb.lastIndexOf('a'));
        //should work like String#lastIndexOf
        assertEquals ("abab".lastIndexOf('a'), sb.lastIndexOf('a'));
        
        assertEquals(3, sb.lastIndexOf('b'));
        assertEquals ("abab".lastIndexOf('b'), sb.lastIndexOf('b'));
        
        assertEquals (-1, sb.lastIndexOf('z'));
    }

    @Test
    public void StrBuilder64() {
        StrBuilder sb = new StrBuilder("abab");
        assertEquals(-1, sb.lastIndexOf('a', -1));
        assertEquals(0, sb.lastIndexOf('a', 0));
        assertEquals(0, sb.lastIndexOf('a', 1));

        // should work like String#lastIndexOf
        assertEquals("abab".lastIndexOf('a', 1), sb.lastIndexOf('a', 1));

        assertEquals(1, sb.lastIndexOf('b', 2));
        assertEquals("abab".lastIndexOf('b', 2), sb.lastIndexOf('b', 2));

        assertEquals(-1, sb.lastIndexOf('z', 2));

        sb = new StrBuilder("xyzabc");
        assertEquals(2, sb.lastIndexOf('z', sb.length()));
        assertEquals(-1, sb.lastIndexOf('z', 1));
    }

    // -----------------------------------------------------------------------
    @Test
    public void StrBuilder64() {
        final StrBuilder sb = new StrBuilder("abab");
        
        assertEquals(0, sb.indexOf("a"));
        //should work like String#indexOf
        assertEquals("abab".indexOf("a"), sb.indexOf("a"));
        
        assertEquals(0, sb.indexOf("ab"));
        //should work like String#indexOf
        assertEquals("abab".indexOf("ab"), sb.indexOf("ab"));
        
        assertEquals(1, sb.indexOf("b"));
        assertEquals("abab".indexOf("b"), sb.indexOf("b"));
        
        assertEquals(1, sb.indexOf("ba"));
        assertEquals("abab".indexOf("ba"), sb.indexOf("ba"));
        
        assertEquals(-1, sb.indexOf("z"));
        
        assertEquals(-1, sb.indexOf((String) null));
    }

    @Test
    public void StrBuilder64() {
        StrBuilder sb = new StrBuilder("abab");
        assertEquals(0, sb.indexOf("a", -1));
        assertEquals(0, sb.indexOf("a", 0));
        assertEquals(2, sb.indexOf("a", 1));
        assertEquals(2, sb.indexOf("a", 2));
        assertEquals(-1, sb.indexOf("a", 3));
        assertEquals(-1, sb.indexOf("a", 4));
        assertEquals(-1, sb.indexOf("a", 5));
        
        assertEquals(-1, sb.indexOf("abcdef", 0));
        assertEquals(0, sb.indexOf("", 0));
        assertEquals(1, sb.indexOf("", 1));
        
        //should work like String#indexOf
        assertEquals ("abab".indexOf("a", 1), sb.indexOf("a", 1));
        
        assertEquals(2, sb.indexOf("ab", 1));
        //should work like String#indexOf
        assertEquals("abab".indexOf("ab", 1), sb.indexOf("ab", 1));
        
        assertEquals(3, sb.indexOf("b", 2));
        assertEquals("abab".indexOf("b", 2), sb.indexOf("b", 2));
        
        assertEquals(1, sb.indexOf("ba", 1));
        assertEquals("abab".indexOf("ba", 2), sb.indexOf("ba", 2));
        
        assertEquals(-1, sb.indexOf("z", 2));
        
        sb = new StrBuilder("xyzabc");
        assertEquals(2, sb.indexOf("za", 0));
        assertEquals(-1, sb.indexOf("za", 3));
        
        assertEquals(-1, sb.indexOf((String) null, 2));
    }

    @Test
    public void StrBuilder64() {
        final StrBuilder sb = new StrBuilder("abab");
        
        assertEquals(2, sb.lastIndexOf("a"));
        //should work like String#lastIndexOf
        assertEquals("abab".lastIndexOf("a"), sb.lastIndexOf("a"));
        
        assertEquals(2, sb.lastIndexOf("ab"));
        //should work like String#lastIndexOf
        assertEquals("abab".lastIndexOf("ab"), sb.lastIndexOf("ab"));
        
        assertEquals(3, sb.lastIndexOf("b"));
        assertEquals("abab".lastIndexOf("b"), sb.lastIndexOf("b"));
        
        assertEquals(1, sb.lastIndexOf("ba"));
        assertEquals("abab".lastIndexOf("ba"), sb.lastIndexOf("ba"));
        
        assertEquals(-1, sb.lastIndexOf("z"));
        
        assertEquals(-1, sb.lastIndexOf((String) null));
    }

    @Test
    public void StrBuilder64() {
        StrBuilder sb = new StrBuilder("abab");
        assertEquals(-1, sb.lastIndexOf("a", -1));
        assertEquals(0, sb.lastIndexOf("a", 0));
        assertEquals(0, sb.lastIndexOf("a", 1));
        assertEquals(2, sb.lastIndexOf("a", 2));
        assertEquals(2, sb.lastIndexOf("a", 3));
        assertEquals(2, sb.lastIndexOf("a", 4));
        assertEquals(2, sb.lastIndexOf("a", 5));
        
        assertEquals(-1, sb.lastIndexOf("abcdef", 3));
        assertEquals("abab".lastIndexOf("", 3), sb.lastIndexOf("", 3));
        assertEquals("abab".lastIndexOf("", 1), sb.lastIndexOf("", 1));
        
        //should work like String#lastIndexOf
        assertEquals("abab".lastIndexOf("a", 1), sb.lastIndexOf("a", 1));
        
        assertEquals(0, sb.lastIndexOf("ab", 1));
        //should work like String#lastIndexOf
        assertEquals("abab".lastIndexOf("ab", 1), sb.lastIndexOf("ab", 1));
        
        assertEquals(1, sb.lastIndexOf("b", 2));
        assertEquals("abab".lastIndexOf("b", 2), sb.lastIndexOf("b", 2));
        
        assertEquals(1, sb.lastIndexOf("ba", 2));
        assertEquals("abab".lastIndexOf("ba", 2), sb.lastIndexOf("ba", 2));
        
        assertEquals(-1, sb.lastIndexOf("z", 2));
        
        sb = new StrBuilder("xyzabc");
        assertEquals(2, sb.lastIndexOf("za", sb.length()));
        assertEquals(-1, sb.lastIndexOf("za", 1));
        
        assertEquals(-1, sb.lastIndexOf((String) null, 2));
    }

    // -----------------------------------------------------------------------
    @Test
    public void StrBuilder64() {
        final StrBuilder sb = new StrBuilder();
        assertEquals(-1, sb.indexOf((StrMatcher) null));
        assertEquals(-1, sb.indexOf(StrMatcher.charMatcher('a')));
        
        sb.append("ab bd");
        assertEquals(0, sb.indexOf(StrMatcher.charMatcher('a')));
        assertEquals(1, sb.indexOf(StrMatcher.charMatcher('b')));
        assertEquals(2, sb.indexOf(StrMatcher.spaceMatcher()));
        assertEquals(4, sb.indexOf(StrMatcher.charMatcher('d')));
        assertEquals(-1, sb.indexOf(StrMatcher.noneMatcher()));
        assertEquals(-1, sb.indexOf((StrMatcher) null));
        
        sb.append(" A1 junction");
        assertEquals(6, sb.indexOf(A_NUMBER_MATCHER));
    }

    @Test
    public void StrBuilder64() {
        final StrBuilder sb = new StrBuilder();
        assertEquals(-1, sb.indexOf((StrMatcher) null, 2));
        assertEquals(-1, sb.indexOf(StrMatcher.charMatcher('a'), 2));
        assertEquals(-1, sb.indexOf(StrMatcher.charMatcher('a'), 0));
        
        sb.append("ab bd");
        assertEquals(0, sb.indexOf(StrMatcher.charMatcher('a'), -2));
        assertEquals(0, sb.indexOf(StrMatcher.charMatcher('a'), 0));
        assertEquals(-1, sb.indexOf(StrMatcher.charMatcher('a'), 2));
        assertEquals(-1, sb.indexOf(StrMatcher.charMatcher('a'), 20));
        
        assertEquals(1, sb.indexOf(StrMatcher.charMatcher('b'), -1));
        assertEquals(1, sb.indexOf(StrMatcher.charMatcher('b'), 0));
        assertEquals(1, sb.indexOf(StrMatcher.charMatcher('b'), 1));
        assertEquals(3, sb.indexOf(StrMatcher.charMatcher('b'), 2));
        assertEquals(3, sb.indexOf(StrMatcher.charMatcher('b'), 3));
        assertEquals(-1, sb.indexOf(StrMatcher.charMatcher('b'), 4));
        assertEquals(-1, sb.indexOf(StrMatcher.charMatcher('b'), 5));
        assertEquals(-1, sb.indexOf(StrMatcher.charMatcher('b'), 6));
        
        assertEquals(2, sb.indexOf(StrMatcher.spaceMatcher(), -2));
        assertEquals(2, sb.indexOf(StrMatcher.spaceMatcher(), 0));
        assertEquals(2, sb.indexOf(StrMatcher.spaceMatcher(), 2));
        assertEquals(-1, sb.indexOf(StrMatcher.spaceMatcher(), 4));
        assertEquals(-1, sb.indexOf(StrMatcher.spaceMatcher(), 20));
        
        assertEquals(-1, sb.indexOf(StrMatcher.noneMatcher(), 0));
        assertEquals(-1, sb.indexOf((StrMatcher) null, 0));
        
        sb.append(" A1 junction with A2");
        assertEquals(6, sb.indexOf(A_NUMBER_MATCHER, 5));
        assertEquals(6, sb.indexOf(A_NUMBER_MATCHER, 6));
        assertEquals(23, sb.indexOf(A_NUMBER_MATCHER, 7));
        assertEquals(23, sb.indexOf(A_NUMBER_MATCHER, 22));
        assertEquals(23, sb.indexOf(A_NUMBER_MATCHER, 23));
        assertEquals(-1, sb.indexOf(A_NUMBER_MATCHER, 24));
    }

    @Test
    public void StrBuilder64() {
        final StrBuilder sb = new StrBuilder();
        assertEquals(-1, sb.lastIndexOf((StrMatcher) null));
        assertEquals(-1, sb.lastIndexOf(StrMatcher.charMatcher('a')));
        
        sb.append("ab bd");
        assertEquals(0, sb.lastIndexOf(StrMatcher.charMatcher('a')));
        assertEquals(3, sb.lastIndexOf(StrMatcher.charMatcher('b')));
        assertEquals(2, sb.lastIndexOf(StrMatcher.spaceMatcher()));
        assertEquals(4, sb.lastIndexOf(StrMatcher.charMatcher('d')));
        assertEquals(-1, sb.lastIndexOf(StrMatcher.noneMatcher()));
        assertEquals(-1, sb.lastIndexOf((StrMatcher) null));
        
        sb.append(" A1 junction");
        assertEquals(6, sb.lastIndexOf(A_NUMBER_MATCHER));
    }

    @Test
    public void StrBuilder64() {
        final StrBuilder sb = new StrBuilder();
        assertEquals(-1, sb.lastIndexOf((StrMatcher) null, 2));
        assertEquals(-1, sb.lastIndexOf(StrMatcher.charMatcher('a'), 2));
        assertEquals(-1, sb.lastIndexOf(StrMatcher.charMatcher('a'), 0));
        assertEquals(-1, sb.lastIndexOf(StrMatcher.charMatcher('a'), -1));
        
        sb.append("ab bd");
        assertEquals(-1, sb.lastIndexOf(StrMatcher.charMatcher('a'), -2));
        assertEquals(0, sb.lastIndexOf(StrMatcher.charMatcher('a'), 0));
        assertEquals(0, sb.lastIndexOf(StrMatcher.charMatcher('a'), 2));
        assertEquals(0, sb.lastIndexOf(StrMatcher.charMatcher('a'), 20));
        
        assertEquals(-1, sb.lastIndexOf(StrMatcher.charMatcher('b'), -1));
        assertEquals(-1, sb.lastIndexOf(StrMatcher.charMatcher('b'), 0));
        assertEquals(1, sb.lastIndexOf(StrMatcher.charMatcher('b'), 1));
        assertEquals(1, sb.lastIndexOf(StrMatcher.charMatcher('b'), 2));
        assertEquals(3, sb.lastIndexOf(StrMatcher.charMatcher('b'), 3));
        assertEquals(3, sb.lastIndexOf(StrMatcher.charMatcher('b'), 4));
        assertEquals(3, sb.lastIndexOf(StrMatcher.charMatcher('b'), 5));
        assertEquals(3, sb.lastIndexOf(StrMatcher.charMatcher('b'), 6));
        
        assertEquals(-1, sb.lastIndexOf(StrMatcher.spaceMatcher(), -2));
        assertEquals(-1, sb.lastIndexOf(StrMatcher.spaceMatcher(), 0));
        assertEquals(2, sb.lastIndexOf(StrMatcher.spaceMatcher(), 2));
        assertEquals(2, sb.lastIndexOf(StrMatcher.spaceMatcher(), 4));
        assertEquals(2, sb.lastIndexOf(StrMatcher.spaceMatcher(), 20));
        
        assertEquals(-1, sb.lastIndexOf(StrMatcher.noneMatcher(), 0));
        assertEquals(-1, sb.lastIndexOf((StrMatcher) null, 0));
        
        sb.append(" A1 junction with A2");
        assertEquals(-1, sb.lastIndexOf(A_NUMBER_MATCHER, 5));
        assertEquals(-1, sb.lastIndexOf(A_NUMBER_MATCHER, 6)); // A matches, 1 is outside bounds
        assertEquals(6, sb.lastIndexOf(A_NUMBER_MATCHER, 7));
        assertEquals(6, sb.lastIndexOf(A_NUMBER_MATCHER, 22));
        assertEquals(6, sb.lastIndexOf(A_NUMBER_MATCHER, 23)); // A matches, 2 is outside bounds
        assertEquals(23, sb.lastIndexOf(A_NUMBER_MATCHER, 24));
    }

    static final StrMatcher A_NUMBER_MATCHER = new StrMatcher() {
        @Override
        public int isMatch(final char[] buffer, int pos, final int bufferStart, final int bufferEnd) {
            if (buffer[pos] == 'A') {
                pos++;
                if (pos < bufferEnd && buffer[pos] >= '0' && buffer[pos] <= '9') {
                    return 2;
                }
            }
            return 0;
        }
    };

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder64() throws Exception {
        // from Javadoc
        final StrBuilder b = new StrBuilder();
        b.append("a b ");
        final StrTokenizer t = b.asTokenizer();
        
        final String[] tokens1 = t.getTokenArray();
        assertEquals(2, tokens1.length);
        assertEquals("a", tokens1[0]);
        assertEquals("b", tokens1[1]);
        assertEquals(2, t.size());
        
        b.append("c d ");
        final String[] tokens2 = t.getTokenArray();
        assertEquals(2, tokens2.length);
        assertEquals("a", tokens2[0]);
        assertEquals("b", tokens2[1]);
        assertEquals(2, t.size());
        assertEquals("a", t.next());
        assertEquals("b", t.next());
        
        t.reset();
        final String[] tokens3 = t.getTokenArray();
        assertEquals(4, tokens3.length);
        assertEquals("a", tokens3[0]);
        assertEquals("b", tokens3[1]);
        assertEquals("c", tokens3[2]);
        assertEquals("d", tokens3[3]);
        assertEquals(4, t.size());
        assertEquals("a", t.next());
        assertEquals("b", t.next());
        assertEquals("c", t.next());
        assertEquals("d", t.next());
        
        assertEquals("a b c d ", t.getContent());
    }

    // -----------------------------------------------------------------------
    @Test
    public void StrBuilder64() throws Exception {
        final StrBuilder sb = new StrBuilder("some text");
        Reader reader = sb.asReader();
        assertTrue(reader.ready());
        final char[] buf = new char[40];
        assertEquals(9, reader.read(buf));
        assertEquals("some text", new String(buf, 0, 9));
        
        assertEquals(-1, reader.read());
        assertFalse(reader.ready());
        assertEquals(0, reader.skip(2));
        assertEquals(0, reader.skip(-1));
        
        assertTrue(reader.markSupported());
        reader = sb.asReader();
        assertEquals('s', reader.read());
        reader.mark(-1);
        char[] array = new char[3];
        assertEquals(3, reader.read(array, 0, 3));
        assertEquals('o', array[0]);
        assertEquals('m', array[1]);
        assertEquals('e', array[2]);
        reader.reset();
        assertEquals(1, reader.read(array, 1, 1));
        assertEquals('o', array[0]);
        assertEquals('o', array[1]);
        assertEquals('e', array[2]);
        assertEquals(2, reader.skip(2));
        assertEquals(' ', reader.read());
        
        assertTrue(reader.ready());
        reader.close();
        assertTrue(reader.ready());
        
        reader = sb.asReader();
        array = new char[3];
        try {
            reader.read(array, -1, 0);
            fail();
        } catch (final IndexOutOfBoundsException ex) {}
        try {
            reader.read(array, 0, -1);
            fail();
        } catch (final IndexOutOfBoundsException ex) {}
        try {
            reader.read(array, 100, 1);
            fail();
        } catch (final IndexOutOfBoundsException ex) {}
        try {
            reader.read(array, 0, 100);
            fail();
        } catch (final IndexOutOfBoundsException ex) {}
        try {
            reader.read(array, Integer.MAX_VALUE, Integer.MAX_VALUE);
            fail();
        } catch (final IndexOutOfBoundsException ex) {}
        
        assertEquals(0, reader.read(array, 0, 0));
        assertEquals(0, array[0]);
        assertEquals(0, array[1]);
        assertEquals(0, array[2]);
        
        reader.skip(9);
        assertEquals(-1, reader.read(array, 0, 1));
        
        reader.reset();
        array = new char[30];
        assertEquals(9, reader.read(array, 0, 30));
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder64() throws Exception {
        final StrBuilder sb = new StrBuilder("base");
        final Writer writer = sb.asWriter();
        
        writer.write('l');
        assertEquals("basel", sb.toString());
        
        writer.write(new char[] {'i', 'n'});
        assertEquals("baselin", sb.toString());
        
        writer.write(new char[] {'n', 'e', 'r'}, 1, 2);
        assertEquals("baseliner", sb.toString());
        
        writer.write(" rout");
        assertEquals("baseliner rout", sb.toString());
        
        writer.write("ping that server", 1, 3);
        assertEquals("baseliner routing", sb.toString());
        
        writer.flush();  // no effect
        assertEquals("baseliner routing", sb.toString());
        
        writer.close();  // no effect
        assertEquals("baseliner routing", sb.toString());
        
        writer.write(" hi");  // works after close
        assertEquals("baseliner routing hi", sb.toString());
        
        sb.setLength(4);  // mix and match
        writer.write('d');
        assertEquals("based", sb.toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder64() {
        final StrBuilder sb1 = new StrBuilder();
        final StrBuilder sb2 = new StrBuilder();
        assertTrue(sb1.equalsIgnoreCase(sb1));
        assertTrue(sb1.equalsIgnoreCase(sb2));
        assertTrue(sb2.equalsIgnoreCase(sb2));
        
        sb1.append("abc");
        assertFalse(sb1.equalsIgnoreCase(sb2));
        
        sb2.append("ABC");
        assertTrue(sb1.equalsIgnoreCase(sb2));
        
        sb2.clear().append("abc");
        assertTrue(sb1.equalsIgnoreCase(sb2));
        assertTrue(sb1.equalsIgnoreCase(sb1));
        assertTrue(sb2.equalsIgnoreCase(sb2));
        
        sb2.clear().append("aBc");
        assertTrue(sb1.equalsIgnoreCase(sb2));
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder64() {
        final StrBuilder sb1 = new StrBuilder();
        final StrBuilder sb2 = new StrBuilder();
        assertTrue(sb1.equals(sb2));
        assertTrue(sb1.equals(sb1));
        assertTrue(sb2.equals(sb2));
        assertTrue(sb1.equals((Object) sb2));
        
        sb1.append("abc");
        assertFalse(sb1.equals(sb2));
        assertFalse(sb1.equals((Object) sb2));
        
        sb2.append("ABC");
        assertFalse(sb1.equals(sb2));
        assertFalse(sb1.equals((Object) sb2));
        
        sb2.clear().append("abc");
        assertTrue(sb1.equals(sb2));
        assertTrue(sb1.equals((Object) sb2));
        
        assertFalse(sb1.equals(Integer.valueOf(1)));
        assertFalse(sb1.equals("abc"));
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder64() {
        final StrBuilder sb = new StrBuilder();
        final int hc1a = sb.hashCode();
        final int hc1b = sb.hashCode();
        assertEquals(0, hc1a);
        assertEquals(hc1a, hc1b);
        
        sb.append("abc");
        final int hc2a = sb.hashCode();
        final int hc2b = sb.hashCode();
        assertTrue(hc2a != 0);
        assertEquals(hc2a, hc2b);
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder64() {
        final StrBuilder sb = new StrBuilder("abc");
        assertEquals("abc", sb.toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder64() {
        final StrBuilder sb = new StrBuilder();
        assertEquals(new StringBuffer().toString(), sb.toStringBuffer().toString());
        
        sb.append("junit");
        assertEquals(new StringBuffer("junit").toString(), sb.toStringBuffer().toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder64() {
        final StrBuilder sb = new StrBuilder();
        assertEquals(new StringBuilder().toString(), sb.toStringBuilder().toString());
        
        sb.append("junit");
        assertEquals(new StringBuilder("junit").toString(), sb.toStringBuilder().toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder64() {
        final StrBuilder sb = new StrBuilder("\n%BLAH%\nDo more stuff\neven more stuff\n%BLAH%\n");
        sb.deleteAll("\n%BLAH%");
        assertEquals("\nDo more stuff\neven more stuff\n", sb.toString()); 
    }

    @Test
    public void StrBuilder64() {
        final StrBuilder sb = new StrBuilder("onetwothree");
        sb.deleteFirst("three");
        assertEquals(-1, sb.indexOf("three"));
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder64() {
        final StrBuilder sb = new StrBuilder("onetwothree");
        sb.deleteFirst("three");
        assertFalse( "The contains(char) method is looking beyond the end of the string", sb.contains('h'));
        assertEquals( "The indexOf(char) method is looking beyond the end of the string", -1, sb.indexOf('h'));
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder64() {
        final StrBuilder sb = new StrBuilder();
        sb.appendFixedWidthPadRight(null, 10, '*');
        assertEquals( "Failed to invoke appendFixedWidthPadRight correctly", "**********", sb.toString());
    }

    @Test
    public void StrBuilder64() {
        final StrBuilder sb = new StrBuilder();
        sb.appendFixedWidthPadLeft(null, 10, '*');
        assertEquals( "Failed to invoke appendFixedWidthPadLeft correctly", "**********", sb.toString());
    }

    @Test
    public void StrBuilder64() {
        final StrBuilder sb = new StrBuilder().appendAll("Lorem", " ", "ipsum", " ", "dolor");
        assertEquals(sb.toString(), sb.build());
    }
}
