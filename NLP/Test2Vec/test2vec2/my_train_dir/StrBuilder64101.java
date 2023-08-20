
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

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder64() {
        final StrBuilder sb0 = new StrBuilder();
        assertEquals(32, sb0.capacity());
        assertEquals(0, sb0.length());
        assertEquals(0, sb0.size());

        final StrBuilder sb1 = new StrBuilder(32);
        assertEquals(32, sb1.capacity());
        assertEquals(0, sb1.length());
        assertEquals(0, sb1.size());

        final StrBuilder sb2 = new StrBuilder(0);
        assertEquals(32, sb2.capacity());
        assertEquals(0, sb2.length());
        assertEquals(0, sb2.size());

        final StrBuilder sb3 = new StrBuilder(-1);
        assertEquals(32, sb3.capacity());
        assertEquals(0, sb3.length());
        assertEquals(0, sb3.size());

        final StrBuilder sb4 = new StrBuilder(1);
        assertEquals(1, sb4.capacity());
        assertEquals(0, sb4.length());
        assertEquals(0, sb4.size());

        final StrBuilder sb5 = new StrBuilder((String) null);
        assertEquals(32, sb5.capacity());
        assertEquals(0, sb5.length());
        assertEquals(0, sb5.size());

        final StrBuilder sb6 = new StrBuilder("");
        assertEquals(32, sb6.capacity());
        assertEquals(0, sb6.length());
        assertEquals(0, sb6.size());

        final StrBuilder sb7 = new StrBuilder("foo");
        assertEquals(35, sb7.capacity());
        assertEquals(3, sb7.length());
        assertEquals(3, sb7.size());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder64() {
        final StrBuilder sb = new StrBuilder();
        assertSame(sb, sb.setNewLineText(null));
        assertSame(sb, sb.setNullText(null));
        assertSame(sb, sb.setLength(1));
        assertSame(sb, sb.setCharAt(0, 'a'));
        assertSame(sb, sb.ensureCapacity(0));
        assertSame(sb, sb.minimizeCapacity());
        assertSame(sb, sb.clear());
        assertSame(sb, sb.reverse());
        assertSame(sb, sb.trim());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder64() {
        final StrBuilder sb = new StrBuilder();
        assertEquals(null, sb.getNewLineText());

        sb.setNewLineText("#");
        assertEquals("#", sb.getNewLineText());

        sb.setNewLineText("");
        assertEquals("", sb.getNewLineText());

        sb.setNewLineText((String) null);
        assertEquals(null, sb.getNewLineText());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder64() {
        final StrBuilder sb = new StrBuilder();
        assertEquals(null, sb.getNullText());

        sb.setNullText("null");
        assertEquals("null", sb.getNullText());

        sb.setNullText("");
        assertEquals(null, sb.getNullText());

        sb.setNullText("NULL");
        assertEquals("NULL", sb.getNullText());

        sb.setNullText((String) null);
        assertEquals(null, sb.getNullText());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder64() {
        final StrBuilder sb = new StrBuilder();
        assertEquals(32, sb.capacity());
        assertEquals(0, sb.length());
        assertEquals(0, sb.size());
        assertTrue(sb.isEmpty());

        sb.minimizeCapacity();
        assertEquals(0, sb.capacity());
        assertEquals(0, sb.length());
        assertEquals(0, sb.size());
        assertTrue(sb.isEmpty());

        sb.ensureCapacity(32);
        assertTrue(sb.capacity() >= 32);
        assertEquals(0, sb.length());
        assertEquals(0, sb.size());
        assertTrue(sb.isEmpty());

        sb.append("foo");
        assertTrue(sb.capacity() >= 32);
        assertEquals(3, sb.length());
        assertEquals(3, sb.size());
        assertTrue(sb.isEmpty() == false);

        sb.clear();
        assertTrue(sb.capacity() >= 32);
        assertEquals(0, sb.length());
        assertEquals(0, sb.size());
        assertTrue(sb.isEmpty());

        sb.append("123456789012345678901234567890123");
        assertTrue(sb.capacity() > 32);
        assertEquals(33, sb.length());
        assertEquals(33, sb.size());
        assertTrue(sb.isEmpty() == false);

        sb.ensureCapacity(16);
        assertTrue(sb.capacity() > 16);
        assertEquals(33, sb.length());
        assertEquals(33, sb.size());
        assertTrue(sb.isEmpty() == false);

        sb.minimizeCapacity();
        assertEquals(33, sb.capacity());
        assertEquals(33, sb.length());
        assertEquals(33, sb.size());
        assertTrue(sb.isEmpty() == false);

        try {
            sb.setLength(-1);
            fail("setLength(-1) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        sb.setLength(33);
        assertEquals(33, sb.capacity());
        assertEquals(33, sb.length());
        assertEquals(33, sb.size());
        assertTrue(sb.isEmpty() == false);

        sb.setLength(16);
        assertTrue(sb.capacity() >= 16);
        assertEquals(16, sb.length());
        assertEquals(16, sb.size());
        assertEquals("1234567890123456", sb.toString());
        assertTrue(sb.isEmpty() == false);

        sb.setLength(32);
        assertTrue(sb.capacity() >= 32);
        assertEquals(32, sb.length());
        assertEquals(32, sb.size());
        assertEquals("1234567890123456\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0", sb.toString());
        assertTrue(sb.isEmpty() == false);

        sb.setLength(0);
        assertTrue(sb.capacity() >= 32);
        assertEquals(0, sb.length());
        assertEquals(0, sb.size());
        assertTrue(sb.isEmpty());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder64() {
        final StrBuilder sb = new StrBuilder();
        assertEquals(0, sb.length());
        
        sb.append("Hello");
        assertEquals(5, sb.length());
    }

    @Test
    public void StrBuilder64() {
        final StrBuilder sb = new StrBuilder();
        sb.append("Hello");
        sb.setLength(2);  // shorten
        assertEquals("He", sb.toString());
        sb.setLength(2);  // no change
        assertEquals("He", sb.toString());
        sb.setLength(3);  // lengthen
        assertEquals("He\0", sb.toString());

        try {
            sb.setLength(-1);
            fail("setLength(-1) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder64() {
        final StrBuilder sb = new StrBuilder();
        assertEquals(sb.buffer.length, sb.capacity());
        
        sb.append("HelloWorldHelloWorldHelloWorldHelloWorld");
        assertEquals(sb.buffer.length, sb.capacity());
    }

    @Test
    public void StrBuilder64() {
        final StrBuilder sb = new StrBuilder();
        sb.ensureCapacity(2);
        assertTrue(sb.capacity() >= 2);
        
        sb.ensureCapacity(-1);
        assertTrue(sb.capacity() >= 0);
        
        sb.append("HelloWorld");
        sb.ensureCapacity(40);
        assertTrue(sb.capacity() >= 40);
    }

    @Test
    public void StrBuilder64() {
        final StrBuilder sb = new StrBuilder();
        sb.minimizeCapacity();
        assertEquals(0, sb.capacity());
        
        sb.append("HelloWorld");
        sb.minimizeCapacity();
        assertEquals(10, sb.capacity());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder64() {
        final StrBuilder sb = new StrBuilder();
        assertEquals(0, sb.size());
        
        sb.append("Hello");
        assertEquals(5, sb.size());
    }

    @Test
    public void StrBuilder64() {
        final StrBuilder sb = new StrBuilder();
        assertTrue(sb.isEmpty());
        
        sb.append("Hello");
        assertFalse(sb.isEmpty());
        
        sb.clear();
        assertTrue(sb.isEmpty());
    }

    @Test
    public void StrBuilder64() {
        final StrBuilder sb = new StrBuilder();
        sb.append("Hello");
        sb.clear();
        assertEquals(0, sb.length());
        assertTrue(sb.buffer.length >= 5);
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder64() {
        final StrBuilder sb = new StrBuilder();
        try {
            sb.charAt(0);
            fail("charAt(0) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }
        try {
            sb.charAt(-1);
            fail("charAt(-1) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }
        sb.append("foo");
        assertEquals('f', sb.charAt(0));
        assertEquals('o', sb.charAt(1));
        assertEquals('o', sb.charAt(2));
        try {
            sb.charAt(-1);
            fail("charAt(-1) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }
        try {
            sb.charAt(3);
            fail("charAt(3) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder64() {
        final StrBuilder sb = new StrBuilder();
        try {
            sb.setCharAt(0, 'f');
            fail("setCharAt(0,) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }
        try {
            sb.setCharAt(-1, 'f');
            fail("setCharAt(-1,) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }
        sb.append("foo");
        sb.setCharAt(0, 'b');
        sb.setCharAt(1, 'a');
        sb.setCharAt(2, 'r');
        try {
            sb.setCharAt(3, '!');
            fail("setCharAt(3,) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }
        assertEquals("bar", sb.toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder64() {
        final StrBuilder sb = new StrBuilder("abc");
        sb.deleteCharAt(0);
        assertEquals("bc", sb.toString()); 
        
        try {
            sb.deleteCharAt(1000);
            fail("Expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {}
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder64() {
        final StrBuilder sb = new StrBuilder();
        assertEquals(ArrayUtils.EMPTY_CHAR_ARRAY, sb.toCharArray());

        char[] a = sb.toCharArray();
        assertNotNull("toCharArray() result is null", a);
        assertEquals("toCharArray() result is too large", 0, a.length);

        sb.append("junit");
        a = sb.toCharArray();
        assertEquals("toCharArray() result incorrect length", 5, a.length);
        assertTrue("toCharArray() result does not match", Arrays.equals("junit".toCharArray(), a));
    }

    @Test
    public void StrBuilder64() {
        final StrBuilder sb = new StrBuilder();
        assertEquals(ArrayUtils.EMPTY_CHAR_ARRAY, sb.toCharArray(0, 0));

        sb.append("junit");
        char[] a = sb.toCharArray(0, 20); // too large test
        assertEquals("toCharArray(int,int) result incorrect length", 5, a.length);
        assertTrue("toCharArray(int,int) result does not match", Arrays.equals("junit".toCharArray(), a));

        a = sb.toCharArray(0, 4);
        assertEquals("toCharArray(int,int) result incorrect length", 4, a.length);
        assertTrue("toCharArray(int,int) result does not match", Arrays.equals("juni".toCharArray(), a));

        a = sb.toCharArray(0, 4);
        assertEquals("toCharArray(int,int) result incorrect length", 4, a.length);
        assertTrue("toCharArray(int,int) result does not match", Arrays.equals("juni".toCharArray(), a));

        a = sb.toCharArray(0, 1);
        assertNotNull("toCharArray(int,int) result is null", a);

        try {
            sb.toCharArray(-1, 5);
            fail("no string index out of bound on -1");
        } catch (final IndexOutOfBoundsException e) {
        }

        try {
            sb.toCharArray(6, 5);
            fail("no string index out of bound on -1");
        } catch (final IndexOutOfBoundsException e) {
        }
    }

    @Test
    public void StrBuilder64( ) {
        final StrBuilder sb = new StrBuilder();
        
        char[] input = new char[10];
        char[] a = sb.getChars(input);
        assertSame (input, a);
        assertTrue(Arrays.equals(new char[10], a));
        
        sb.append("junit");
        a = sb.getChars(input);
        assertSame(input, a);
        assertTrue(Arrays.equals(new char[] {'j','u','n','i','t',0,0,0,0,0},a));
        
        a = sb.getChars(null);
        assertNotSame(input,a);
        assertEquals(5,a.length);
        assertTrue(Arrays.equals("junit".toCharArray(),a));
        
        input = new char[5];
        a = sb.getChars(input);
        assertSame(input, a);
        
        input = new char[4];
        a = sb.getChars(input);
        assertNotSame(input, a);
    }

    @Test
    public void StrBuilder64( ) {
        final StrBuilder sb = new StrBuilder();
               
        sb.append("junit");
        char[] a = new char[5];
        sb.getChars(0,5,a,0);
        assertTrue(Arrays.equals(new char[] {'j','u','n','i','t'},a));
        
        a = new char[5];
        sb.getChars(0,2,a,3);
        assertTrue(Arrays.equals(new char[] {0,0,0,'j','u'},a));
        
        try {
            sb.getChars(-1,0,a,0);
            fail("no exception");
        }
        catch (final IndexOutOfBoundsException e) {
        }
        
        try {
            sb.getChars(0,-1,a,0);
            fail("no exception");
        }
        catch (final IndexOutOfBoundsException e) {
        }
        
        try {
            sb.getChars(0,20,a,0);
            fail("no exception");
        }
        catch (final IndexOutOfBoundsException e) {
        }
        
        try {
            sb.getChars(4,2,a,0);
            fail("no exception");
        }
        catch (final IndexOutOfBoundsException e) {
        }
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder64() {
        StrBuilder sb = new StrBuilder("abc");
        sb.delete(0, 1);
        assertEquals("bc", sb.toString()); 
        sb.delete(1, 2);
        assertEquals("b", sb.toString());
        sb.delete(0, 1);
        assertEquals("", sb.toString()); 
        sb.delete(0, 1000);
        assertEquals("", sb.toString()); 
        
        try {
            sb.delete(1, 2);
            fail("Expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {}
        try {
            sb.delete(-1, 1);
            fail("Expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {}
        
        sb = new StrBuilder("anything");
        try {
            sb.delete(2, 1);
            fail("Expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {}
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder64() {
        StrBuilder sb = new StrBuilder("abcbccba");
        sb.deleteAll('X');
        assertEquals("abcbccba", sb.toString());
        sb.deleteAll('a');
        assertEquals("bcbccb", sb.toString());
        sb.deleteAll('c');
        assertEquals("bbb", sb.toString());
        sb.deleteAll('b');
        assertEquals("", sb.toString());

        sb = new StrBuilder("");
        sb.deleteAll('b');
        assertEquals("", sb.toString());
    }

    @Test
    public void StrBuilder64() {
        StrBuilder sb = new StrBuilder("abcba");
        sb.deleteFirst('X');
        assertEquals("abcba", sb.toString());
        sb.deleteFirst('a');
        assertEquals("bcba", sb.toString());
        sb.deleteFirst('c');
        assertEquals("bba", sb.toString());
        sb.deleteFirst('b');
        assertEquals("ba", sb.toString());

        sb = new StrBuilder("");
        sb.deleteFirst('b');
        assertEquals("", sb.toString());
    }

    // -----------------------------------------------------------------------
    @Test
    public void StrBuilder64() {
        StrBuilder sb = new StrBuilder("abcbccba");
        sb.deleteAll((String) null);
        assertEquals("abcbccba", sb.toString());
        sb.deleteAll("");
        assertEquals("abcbccba", sb.toString());
        
        sb.deleteAll("X");
        assertEquals("abcbccba", sb.toString());
        sb.deleteAll("a");
        assertEquals("bcbccb", sb.toString());
        sb.deleteAll("c");
        assertEquals("bbb", sb.toString());
        sb.deleteAll("b");
        assertEquals("", sb.toString());

        sb = new StrBuilder("abcbccba");
        sb.deleteAll("bc");
        assertEquals("acba", sb.toString());

        sb = new StrBuilder("");
        sb.deleteAll("bc");
        assertEquals("", sb.toString());
    }

    @Test
    public void StrBuilder64() {
        StrBuilder sb = new StrBuilder("abcbccba");
        sb.deleteFirst((String) null);
        assertEquals("abcbccba", sb.toString());
        sb.deleteFirst("");
        assertEquals("abcbccba", sb.toString());

        sb.deleteFirst("X");
        assertEquals("abcbccba", sb.toString());
        sb.deleteFirst("a");
        assertEquals("bcbccba", sb.toString());
        sb.deleteFirst("c");
        assertEquals("bbccba", sb.toString());
        sb.deleteFirst("b");
        assertEquals("bccba", sb.toString());

        sb = new StrBuilder("abcbccba");
        sb.deleteFirst("bc");
        assertEquals("abccba", sb.toString());

        sb = new StrBuilder("");
        sb.deleteFirst("bc");
        assertEquals("", sb.toString());
    }

    // -----------------------------------------------------------------------
    @Test
    public void StrBuilder64() {
        StrBuilder sb = new StrBuilder("A0xA1A2yA3");
        sb.deleteAll((StrMatcher) null);
        assertEquals("A0xA1A2yA3", sb.toString());
        sb.deleteAll(A_NUMBER_MATCHER);
        assertEquals("xy", sb.toString());

        sb = new StrBuilder("Ax1");
        sb.deleteAll(A_NUMBER_MATCHER);
        assertEquals("Ax1", sb.toString());

        sb = new StrBuilder("");
        sb.deleteAll(A_NUMBER_MATCHER);
        assertEquals("", sb.toString());
    }

    @Test
    public void StrBuilder64() {
        StrBuilder sb = new StrBuilder("A0xA1A2yA3");
        sb.deleteFirst((StrMatcher) null);
        assertEquals("A0xA1A2yA3", sb.toString());
        sb.deleteFirst(A_NUMBER_MATCHER);
        assertEquals("xA1A2yA3", sb.toString());

        sb = new StrBuilder("Ax1");
        sb.deleteFirst(A_NUMBER_MATCHER);
        assertEquals("Ax1", sb.toString());

        sb = new StrBuilder("");
        sb.deleteFirst(A_NUMBER_MATCHER);
        assertEquals("", sb.toString());
    }

    // -----------------------------------------------------------------------
    @Test
    public void StrBuilder64() {
        StrBuilder sb = new StrBuilder("abc");
        sb.replace(0, 1, "d");
        assertEquals("dbc", sb.toString());
        sb.replace(0, 1, "aaa");
        assertEquals("aaabc", sb.toString());
        sb.replace(0, 3, "");
        assertEquals("bc", sb.toString());
        sb.replace(1, 2, (String) null);
        assertEquals("b", sb.toString());
        sb.replace(1, 1000, "text");
        assertEquals("btext", sb.toString());
        sb.replace(0, 1000, "text");
        assertEquals("text", sb.toString());
        
        sb = new StrBuilder("atext");
        sb.replace(1, 1, "ny");
        assertEquals("anytext", sb.toString());
        try {
            sb.replace(2, 1, "anything");
            fail("Expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {}
        
        sb = new StrBuilder();
        try {
            sb.replace(1, 2, "anything");
            fail("Expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {}
        try {
            sb.replace(-1, 1, "anything");
            fail("Expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {}
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder64() {
        final StrBuilder sb = new StrBuilder("abcbccba");
        sb.replaceAll('x', 'y');
        assertEquals("abcbccba", sb.toString());
        sb.replaceAll('a', 'd');
        assertEquals("dbcbccbd", sb.toString());
        sb.replaceAll('b', 'e');
        assertEquals("dececced", sb.toString());
        sb.replaceAll('c', 'f');
        assertEquals("defeffed", sb.toString());
        sb.replaceAll('d', 'd');
        assertEquals("defeffed", sb.toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder64() {
        final StrBuilder sb = new StrBuilder("abcbccba");
        sb.replaceFirst('x', 'y');
        assertEquals("abcbccba", sb.toString());
        sb.replaceFirst('a', 'd');
        assertEquals("dbcbccba", sb.toString());
        sb.replaceFirst('b', 'e');
        assertEquals("decbccba", sb.toString());
        sb.replaceFirst('c', 'f');
        assertEquals("defbccba", sb.toString());
        sb.replaceFirst('d', 'd');
        assertEquals("defbccba", sb.toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder64() {
        StrBuilder sb = new StrBuilder("abcbccba");
        sb.replaceAll((String) null, null);
        assertEquals("abcbccba", sb.toString());
        sb.replaceAll((String) null, "anything");
        assertEquals("abcbccba", sb.toString());
        sb.replaceAll("", null);
        assertEquals("abcbccba", sb.toString());
        sb.replaceAll("", "anything");
        assertEquals("abcbccba", sb.toString());
        
        sb.replaceAll("x", "y");
        assertEquals("abcbccba", sb.toString());
        sb.replaceAll("a", "d");
        assertEquals("dbcbccbd", sb.toString());
        sb.replaceAll("d", null);
        assertEquals("bcbccb", sb.toString());
        sb.replaceAll("cb", "-");
        assertEquals("b-c-", sb.toString());
        
        sb = new StrBuilder("abcba");
        sb.replaceAll("b", "xbx");
        assertEquals("axbxcxbxa", sb.toString());
        
        sb = new StrBuilder("bb");
        sb.replaceAll("b", "xbx");
        assertEquals("xbxxbx", sb.toString());
    }

    @Test
    public void StrBuilder64() {
        StrBuilder sb = new StrBuilder("abcbccba");
        sb.replaceFirst((String) null, null);
        assertEquals("abcbccba", sb.toString());
        sb.replaceFirst((String) null, "anything");
        assertEquals("abcbccba", sb.toString());
        sb.replaceFirst("", null);
        assertEquals("abcbccba", sb.toString());
        sb.replaceFirst("", "anything");
        assertEquals("abcbccba", sb.toString());
        
        sb.replaceFirst("x", "y");
        assertEquals("abcbccba", sb.toString());
        sb.replaceFirst("a", "d");
        assertEquals("dbcbccba", sb.toString());
        sb.replaceFirst("d", null);
        assertEquals("bcbccba", sb.toString());
        sb.replaceFirst("cb", "-");
        assertEquals("b-ccba", sb.toString());
        
        sb = new StrBuilder("abcba");
        sb.replaceFirst("b", "xbx");
        assertEquals("axbxcba", sb.toString());
        
        sb = new StrBuilder("bb");
        sb.replaceFirst("b", "xbx");
        assertEquals("xbxb", sb.toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder64() {
        StrBuilder sb = new StrBuilder("abcbccba");
        sb.replaceAll((StrMatcher) null, null);
        assertEquals("abcbccba", sb.toString());
        sb.replaceAll((StrMatcher) null, "anything");
        assertEquals("abcbccba", sb.toString());
        sb.replaceAll(StrMatcher.noneMatcher(), null);
        assertEquals("abcbccba", sb.toString());
        sb.replaceAll(StrMatcher.noneMatcher(), "anything");
        assertEquals("abcbccba", sb.toString());
        
        sb.replaceAll(StrMatcher.charMatcher('x'), "y");
        assertEquals("abcbccba", sb.toString());
        sb.replaceAll(StrMatcher.charMatcher('a'), "d");
        assertEquals("dbcbccbd", sb.toString());
        sb.replaceAll(StrMatcher.charMatcher('d'), null);
        assertEquals("bcbccb", sb.toString());
        sb.replaceAll(StrMatcher.stringMatcher("cb"), "-");
        assertEquals("b-c-", sb.toString());
        
        sb = new StrBuilder("abcba");
        sb.replaceAll(StrMatcher.charMatcher('b'), "xbx");
        assertEquals("axbxcxbxa", sb.toString());
        
        sb = new StrBuilder("bb");
        sb.replaceAll(StrMatcher.charMatcher('b'), "xbx");
        assertEquals("xbxxbx", sb.toString());
        
        sb = new StrBuilder("A1-A2A3-A4");
        sb.replaceAll(A_NUMBER_MATCHER, "***");
        assertEquals("***-******-***", sb.toString());
    }

    @Test
    public void StrBuilder64() {
        StrBuilder sb = new StrBuilder("abcbccba");
        sb.replaceFirst((StrMatcher) null, null);
        assertEquals("abcbccba", sb.toString());
        sb.replaceFirst((StrMatcher) null, "anything");
        assertEquals("abcbccba", sb.toString());
        sb.replaceFirst(StrMatcher.noneMatcher(), null);
        assertEquals("abcbccba", sb.toString());
        sb.replaceFirst(StrMatcher.noneMatcher(), "anything");
        assertEquals("abcbccba", sb.toString());
        
        sb.replaceFirst(StrMatcher.charMatcher('x'), "y");
        assertEquals("abcbccba", sb.toString());
        sb.replaceFirst(StrMatcher.charMatcher('a'), "d");
        assertEquals("dbcbccba", sb.toString());
        sb.replaceFirst(StrMatcher.charMatcher('d'), null);
        assertEquals("bcbccba", sb.toString());
        sb.replaceFirst(StrMatcher.stringMatcher("cb"), "-");
        assertEquals("b-ccba", sb.toString());
        
        sb = new StrBuilder("abcba");
        sb.replaceFirst(StrMatcher.charMatcher('b'), "xbx");
        assertEquals("axbxcba", sb.toString());
        
        sb = new StrBuilder("bb");
        sb.replaceFirst(StrMatcher.charMatcher('b'), "xbx");
        assertEquals("xbxb", sb.toString());
        
        sb = new StrBuilder("A1-A2A3-A4");
        sb.replaceFirst(A_NUMBER_MATCHER, "***");
        assertEquals("***-A2A3-A4", sb.toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder64() {
        StrBuilder sb = new StrBuilder("abcbccba");
        sb.replace((StrMatcher) null, "x", 0, sb.length(), -1);
        assertEquals("abcbccba", sb.toString());
        
        sb.replace(StrMatcher.charMatcher('a'), "x", 0, sb.length(), -1);
        assertEquals("xbcbccbx", sb.toString());
        
        sb.replace(StrMatcher.stringMatcher("cb"), "x", 0, sb.length(), -1);
        assertEquals("xbxcxx", sb.toString());
        
        sb = new StrBuilder("A1-A2A3-A4");
        sb.replace(A_NUMBER_MATCHER, "***", 0, sb.length(), -1);
        assertEquals("***-******-***", sb.toString());
        
        sb = new StrBuilder();
        sb.replace(A_NUMBER_MATCHER, "***", 0, sb.length(), -1);
        assertEquals("", sb.toString());
    }

    @Test
    public void StrBuilder64() {
        StrBuilder sb = new StrBuilder("abcbccba");
        sb.replace(StrMatcher.stringMatcher("cb"), "cb", 0, sb.length(), -1);
        assertEquals("abcbccba", sb.toString());
        
        sb = new StrBuilder("abcbccba");
        sb.replace(StrMatcher.stringMatcher("cb"), "-", 0, sb.length(), -1);
        assertEquals("ab-c-a", sb.toString());
        
        sb = new StrBuilder("abcbccba");
        sb.replace(StrMatcher.stringMatcher("cb"), "+++", 0, sb.length(), -1);
        assertEquals("ab+++c+++a", sb.toString());
        
        sb = new StrBuilder("abcbccba");
        sb.replace(StrMatcher.stringMatcher("cb"), "", 0, sb.length(), -1);
        assertEquals("abca", sb.toString());
        
        sb = new StrBuilder("abcbccba");
        sb.replace(StrMatcher.stringMatcher("cb"), null, 0, sb.length(), -1);
        assertEquals("abca", sb.toString());
    }



}
