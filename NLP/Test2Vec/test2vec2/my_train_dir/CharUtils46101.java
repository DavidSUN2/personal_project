
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
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.CharUtils}.
 *
 * @version $Id$
 */
public class CharUtilsTest {

    private static final Character CHARACTER_A = new Character('A');
    private static final Character CHARACTER_B = new Character('B');
    private static final char CHAR_COPY = '\u00a9';
    
    @Test
    public void CharUtils46() {
        assertNotNull(new CharUtils());
        final Constructor<?>[] cons = CharUtils.class.getDeclaredConstructors();
        assertEquals(1, cons.length);
        assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        assertTrue(Modifier.isPublic(BooleanUtils.class.getModifiers()));
        assertFalse(Modifier.isFinal(BooleanUtils.class.getModifiers()));
    }
    
    @SuppressWarnings("deprecation") // intentional test of deprecated method
    @Test
    public void CharUtils46() {
        assertEquals(new Character('a'), CharUtils.toCharacterObject('a'));
        assertSame(CharUtils.toCharacterObject('a'), CharUtils.toCharacterObject('a'));
       
        for (int i = 0; i < 128; i++) {
            final Character ch = CharUtils.toCharacterObject((char) i);
            final Character ch2 = CharUtils.toCharacterObject((char) i);
            assertSame(ch, ch2);
            assertEquals(i, ch.charValue());
        }
        for (int i = 128; i < 196; i++) {
            final Character ch = CharUtils.toCharacterObject((char) i);
            final Character ch2 = CharUtils.toCharacterObject((char) i);
            assertEquals(ch, ch2);
            assertTrue(ch != ch2);
            assertEquals(i, ch.charValue());
            assertEquals(i, ch2.charValue());
        }
        assertSame(CharUtils.toCharacterObject("a"), CharUtils.toCharacterObject('a'));
    }
    
    @Test
    public void CharUtils46() {
        assertEquals(null, CharUtils.toCharacterObject(null));
        assertEquals(null, CharUtils.toCharacterObject(""));
        assertEquals(new Character('a'), CharUtils.toCharacterObject("a"));
        assertEquals(new Character('a'), CharUtils.toCharacterObject("abc"));
        assertSame(CharUtils.toCharacterObject("a"), CharUtils.toCharacterObject("a"));
    }
    
    @Test
    public void CharUtils46() {
        assertEquals('A', CharUtils.toChar(CHARACTER_A));
        assertEquals('B', CharUtils.toChar(CHARACTER_B));
        try {
            CharUtils.toChar((Character) null);
        } catch (final IllegalArgumentException ex) {}
    }
    
    @Test
    public void CharUtils46() {
        assertEquals('A', CharUtils.toChar(CHARACTER_A, 'X'));
        assertEquals('B', CharUtils.toChar(CHARACTER_B, 'X'));
        assertEquals('X', CharUtils.toChar((Character) null, 'X'));
    }
    
    @Test
    public void CharUtils46() {
        assertEquals('A', CharUtils.toChar("A"));
        assertEquals('B', CharUtils.toChar("BA"));
        try {
            CharUtils.toChar((String) null);
        } catch (final IllegalArgumentException ex) {}
        try {
            CharUtils.toChar("");
        } catch (final IllegalArgumentException ex) {}
    }
    
    @Test
    public void CharUtils46() {
        assertEquals('A', CharUtils.toChar("A", 'X'));
        assertEquals('B', CharUtils.toChar("BA", 'X'));
        assertEquals('X', CharUtils.toChar("", 'X'));
        assertEquals('X', CharUtils.toChar((String) null, 'X'));
    }
    
    @Test
    public void CharUtils46() {
        assertEquals(0, CharUtils.toIntValue('0'));
        assertEquals(1, CharUtils.toIntValue('1'));
        assertEquals(2, CharUtils.toIntValue('2'));
        assertEquals(3, CharUtils.toIntValue('3'));
        assertEquals(4, CharUtils.toIntValue('4'));
        assertEquals(5, CharUtils.toIntValue('5'));
        assertEquals(6, CharUtils.toIntValue('6'));
        assertEquals(7, CharUtils.toIntValue('7'));
        assertEquals(8, CharUtils.toIntValue('8'));
        assertEquals(9, CharUtils.toIntValue('9'));
        try {
            CharUtils.toIntValue('a');
        } catch (final IllegalArgumentException ex) {}
    }
    
    @Test
    public void CharUtils46() {
        assertEquals(0, CharUtils.toIntValue('0', -1));
        assertEquals(3, CharUtils.toIntValue('3', -1));
        assertEquals(-1, CharUtils.toIntValue('a', -1));
    }
    
    @Test
    public void CharUtils46() {
        assertEquals(0, CharUtils.toIntValue(new Character('0')));
        assertEquals(3, CharUtils.toIntValue(new Character('3')));
        try {
            CharUtils.toIntValue(null);
        } catch (final IllegalArgumentException ex) {}
        try {
            CharUtils.toIntValue(CHARACTER_A);
        } catch (final IllegalArgumentException ex) {}
    }
    
    @Test
    public void CharUtils46() {
        assertEquals(0, CharUtils.toIntValue(new Character('0'), -1));
        assertEquals(3, CharUtils.toIntValue(new Character('3'), -1));
        assertEquals(-1, CharUtils.toIntValue(new Character('A'), -1));
        assertEquals(-1, CharUtils.toIntValue(null, -1));
    }
    
    @Test
    public void CharUtils46() {
        assertEquals("a", CharUtils.toString('a'));
        assertSame(CharUtils.toString('a'), CharUtils.toString('a'));
       
        for (int i = 0; i < 128; i++) {
            final String str = CharUtils.toString((char) i);
            final String str2 = CharUtils.toString((char) i);
            assertSame(str, str2);
            assertEquals(1, str.length());
            assertEquals(i, str.charAt(0));
        }
        for (int i = 128; i < 196; i++) {
            final String str = CharUtils.toString((char) i);
            final String str2 = CharUtils.toString((char) i);
            assertEquals(str, str2);
            assertTrue(str != str2);
            assertEquals(1, str.length());
            assertEquals(i, str.charAt(0));
            assertEquals(1, str2.length());
            assertEquals(i, str2.charAt(0));
        }
    }
    
    @Test
    public void CharUtils46() {
        assertEquals(null, CharUtils.toString(null));
        assertEquals("A", CharUtils.toString(CHARACTER_A));
        assertSame(CharUtils.toString(CHARACTER_A), CharUtils.toString(CHARACTER_A));
    }
    
    @Test
    public void CharUtils46() {
        assertEquals("\\u0041", CharUtils.unicodeEscaped('A'));
       
        for (int i = 0; i < 196; i++) {
            final String str = CharUtils.unicodeEscaped((char) i);
            assertEquals(6, str.length());
            final int val = Integer.parseInt(str.substring(2), 16);
            assertEquals(i, val);
        }
        assertEquals("\\u0999", CharUtils.unicodeEscaped((char) 0x999));
        assertEquals("\\u1001", CharUtils.unicodeEscaped((char) 0x1001));
    }
    
    @Test
    public void CharUtils46() {
        assertEquals(null, CharUtils.unicodeEscaped(null));
        assertEquals("\\u0041", CharUtils.unicodeEscaped(CHARACTER_A));
    }
    
   
    
}
