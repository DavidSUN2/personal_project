
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

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.StringUtils} - Substring methods
 *
 * @version $Id$
 */
public class StringUtilsIsTest  {

    //-----------------------------------------------------------------------

    @Test
    public void StringUtils34() {
        assertFalse(StringUtils.isAlpha(null));
        assertFalse(StringUtils.isAlpha(""));
        assertFalse(StringUtils.isAlpha(" "));
        assertTrue(StringUtils.isAlpha("a"));
        assertTrue(StringUtils.isAlpha("A"));
        assertTrue(StringUtils.isAlpha("kgKgKgKgkgkGkjkjlJlOKLgHdGdHgl"));
        assertFalse(StringUtils.isAlpha("ham kso"));
        assertFalse(StringUtils.isAlpha("1"));
        assertFalse(StringUtils.isAlpha("hkHKHik6iUGHKJgU7tUJgKJGI87GIkug"));
        assertFalse(StringUtils.isAlpha("_"));
        assertFalse(StringUtils.isAlpha("hkHKHik*khbkuh"));
    }

    @Test
    public void StringUtils34() {
        assertFalse(StringUtils.isAlphanumeric(null));
        assertFalse(StringUtils.isAlphanumeric(""));
        assertFalse(StringUtils.isAlphanumeric(" "));
        assertTrue(StringUtils.isAlphanumeric("a"));
        assertTrue(StringUtils.isAlphanumeric("A"));
        assertTrue(StringUtils.isAlphanumeric("kgKgKgKgkgkGkjkjlJlOKLgHdGdHgl"));
        assertFalse(StringUtils.isAlphanumeric("ham kso"));
        assertTrue(StringUtils.isAlphanumeric("1"));
        assertTrue(StringUtils.isAlphanumeric("hkHKHik6iUGHKJgU7tUJgKJGI87GIkug"));
        assertFalse(StringUtils.isAlphanumeric("_"));
        assertFalse(StringUtils.isAlphanumeric("hkHKHik*khbkuh"));
    }

    @Test
    public void StringUtils34() {
        assertFalse(StringUtils.isWhitespace(null));
        assertTrue(StringUtils.isWhitespace(""));
        assertTrue(StringUtils.isWhitespace(" "));
        assertTrue(StringUtils.isWhitespace("\t \n \t"));
        assertFalse(StringUtils.isWhitespace("\t aa\n \t"));
        assertTrue(StringUtils.isWhitespace(" "));
        assertFalse(StringUtils.isWhitespace(" a "));
        assertFalse(StringUtils.isWhitespace("a  "));
        assertFalse(StringUtils.isWhitespace("  a"));
        assertFalse(StringUtils.isWhitespace("aba"));
        assertTrue(StringUtils.isWhitespace(StringUtilsTest.WHITESPACE));
        assertFalse(StringUtils.isWhitespace(StringUtilsTest.NON_WHITESPACE));
    }



}
