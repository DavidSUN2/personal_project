
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
        assertTrue(CharUtils.isAscii('a'));
        assertTrue(CharUtils.isAscii('A'));
        assertTrue(CharUtils.isAscii('3'));
        assertTrue(CharUtils.isAscii('-'));
        assertTrue(CharUtils.isAscii('\n'));
        assertFalse(CharUtils.isAscii(CHAR_COPY));
       
        for (int i = 0; i < 128; i++) {
            if (i < 128) {
                assertTrue(CharUtils.isAscii((char) i));
            } else {
                assertFalse(CharUtils.isAscii((char) i));
            }
        }
    }
    
    @Test
    public void CharUtils46() {
        assertTrue(CharUtils.isAsciiPrintable('a'));
        assertTrue(CharUtils.isAsciiPrintable('A'));
        assertTrue(CharUtils.isAsciiPrintable('3'));
        assertTrue(CharUtils.isAsciiPrintable('-'));
        assertFalse(CharUtils.isAsciiPrintable('\n'));
        assertFalse(CharUtils.isAscii(CHAR_COPY));
       
        for (int i = 0; i < 196; i++) {
            if (i >= 32 && i <= 126) {
                assertTrue(CharUtils.isAsciiPrintable((char) i));
            } else {
                assertFalse(CharUtils.isAsciiPrintable((char) i));
            }
        }
    }
    
    @Test
    public void CharUtils46() {
        assertFalse(CharUtils.isAsciiControl('a'));
        assertFalse(CharUtils.isAsciiControl('A'));
        assertFalse(CharUtils.isAsciiControl('3'));
        assertFalse(CharUtils.isAsciiControl('-'));
        assertTrue(CharUtils.isAsciiControl('\n'));
        assertFalse(CharUtils.isAsciiControl(CHAR_COPY));
       
        for (int i = 0; i < 196; i++) {
            if (i < 32 || i == 127) {
                assertTrue(CharUtils.isAsciiControl((char) i));
            } else {
                assertFalse(CharUtils.isAsciiControl((char) i));
            }
        }
    }
    
    @Test
    public void CharUtils46() {
        assertTrue(CharUtils.isAsciiAlpha('a'));
        assertTrue(CharUtils.isAsciiAlpha('A'));
        assertFalse(CharUtils.isAsciiAlpha('3'));
        assertFalse(CharUtils.isAsciiAlpha('-'));
        assertFalse(CharUtils.isAsciiAlpha('\n'));
        assertFalse(CharUtils.isAsciiAlpha(CHAR_COPY));
       
        for (int i = 0; i < 196; i++) {
            if ((i >= 'A' && i <= 'Z') || (i >= 'a' && i <= 'z')) {
                assertTrue(CharUtils.isAsciiAlpha((char) i));
            } else {
                assertFalse(CharUtils.isAsciiAlpha((char) i));
            }
        }
    }
    
    @Test
    public void CharUtils46() {
        assertFalse(CharUtils.isAsciiAlphaUpper('a'));
        assertTrue(CharUtils.isAsciiAlphaUpper('A'));
        assertFalse(CharUtils.isAsciiAlphaUpper('3'));
        assertFalse(CharUtils.isAsciiAlphaUpper('-'));
        assertFalse(CharUtils.isAsciiAlphaUpper('\n'));
        assertFalse(CharUtils.isAsciiAlphaUpper(CHAR_COPY));
       
        for (int i = 0; i < 196; i++) {
            if (i >= 'A' && i <= 'Z') {
                assertTrue(CharUtils.isAsciiAlphaUpper((char) i));
            } else {
                assertFalse(CharUtils.isAsciiAlphaUpper((char) i));
            }
        }
    }
    
    @Test
    public void CharUtils46() {
        assertTrue(CharUtils.isAsciiAlphaLower('a'));
        assertFalse(CharUtils.isAsciiAlphaLower('A'));
        assertFalse(CharUtils.isAsciiAlphaLower('3'));
        assertFalse(CharUtils.isAsciiAlphaLower('-'));
        assertFalse(CharUtils.isAsciiAlphaLower('\n'));
        assertFalse(CharUtils.isAsciiAlphaLower(CHAR_COPY));
       
        for (int i = 0; i < 196; i++) {
            if (i >= 'a' && i <= 'z') {
                assertTrue(CharUtils.isAsciiAlphaLower((char) i));
            } else {
                assertFalse(CharUtils.isAsciiAlphaLower((char) i));
            }
        }
    }
    
    @Test
    public void CharUtils46() {
        assertFalse(CharUtils.isAsciiNumeric('a'));
        assertFalse(CharUtils.isAsciiNumeric('A'));
        assertTrue(CharUtils.isAsciiNumeric('3'));
        assertFalse(CharUtils.isAsciiNumeric('-'));
        assertFalse(CharUtils.isAsciiNumeric('\n'));
        assertFalse(CharUtils.isAsciiNumeric(CHAR_COPY));
       
        for (int i = 0; i < 196; i++) {
            if (i >= '0' && i <= '9') {
                assertTrue(CharUtils.isAsciiNumeric((char) i));
            } else {
                assertFalse(CharUtils.isAsciiNumeric((char) i));
            }
        }
    }
    
    @Test
    public void CharUtils46() {
        assertTrue(CharUtils.isAsciiAlphanumeric('a'));
        assertTrue(CharUtils.isAsciiAlphanumeric('A'));
        assertTrue(CharUtils.isAsciiAlphanumeric('3'));
        assertFalse(CharUtils.isAsciiAlphanumeric('-'));
        assertFalse(CharUtils.isAsciiAlphanumeric('\n'));
        assertFalse(CharUtils.isAsciiAlphanumeric(CHAR_COPY));
       
        for (int i = 0; i < 196; i++) {
            if ((i >= 'A' && i <= 'Z') || (i >= 'a' && i <= 'z') || (i >= '0' && i <= '9')) {
                assertTrue(CharUtils.isAsciiAlphanumeric((char) i));
            } else {
                assertFalse(CharUtils.isAsciiAlphanumeric((char) i));
            }
        }
    }
    
}
