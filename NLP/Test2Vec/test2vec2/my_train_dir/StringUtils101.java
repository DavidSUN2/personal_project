
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
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.StringUtils} - Substring methods
 *
 * @version $Id$
 */
public class StringUtilsSubstringTest  {
    private static final String FOO = "foo";
    private static final String BAR = "bar";
    private static final String BAZ = "baz";
    private static final String FOOBAR = "foobar";
    private static final String SENTENCE = "foo bar baz";

    //-----------------------------------------------------------------------

    @Test
    public void StringUtils() {
        assertEquals(null, StringUtils.substring(null, 0));
        assertEquals("", StringUtils.substring("", 0));
        assertEquals("", StringUtils.substring("", 2));
        
        assertEquals("", StringUtils.substring(SENTENCE, 80));
        assertEquals(BAZ, StringUtils.substring(SENTENCE, 8));
        assertEquals(BAZ, StringUtils.substring(SENTENCE, -3));
        assertEquals(SENTENCE, StringUtils.substring(SENTENCE, 0));
        assertEquals("abc", StringUtils.substring("abc", -4));
        assertEquals("abc", StringUtils.substring("abc", -3));
        assertEquals("bc", StringUtils.substring("abc", -2));
        assertEquals("c", StringUtils.substring("abc", -1));
        assertEquals("abc", StringUtils.substring("abc", 0));
        assertEquals("bc", StringUtils.substring("abc", 1));
        assertEquals("c", StringUtils.substring("abc", 2));
        assertEquals("", StringUtils.substring("abc", 3));
        assertEquals("", StringUtils.substring("abc", 4));
    }
    
    @Test
    public void StringUtils() {
        assertEquals(null, StringUtils.substring(null, 0, 0));
        assertEquals(null, StringUtils.substring(null, 1, 2));
        assertEquals("", StringUtils.substring("", 0, 0));
        assertEquals("", StringUtils.substring("", 1, 2));
        assertEquals("", StringUtils.substring("", -2, -1));
        
        assertEquals("", StringUtils.substring(SENTENCE, 8, 6));
        assertEquals(FOO, StringUtils.substring(SENTENCE, 0, 3));
        assertEquals("o", StringUtils.substring(SENTENCE, -9, 3));
        assertEquals(FOO, StringUtils.substring(SENTENCE, 0, -8));
        assertEquals("o", StringUtils.substring(SENTENCE, -9, -8));
        assertEquals(SENTENCE, StringUtils.substring(SENTENCE, 0, 80));
        assertEquals("", StringUtils.substring(SENTENCE, 2, 2));
        assertEquals("b",StringUtils.substring("abc", -2, -1));
    }
           
    @Test
    public void StringUtils() {
        assertSame(null, StringUtils.left(null, -1));
        assertSame(null, StringUtils.left(null, 0));
        assertSame(null, StringUtils.left(null, 2));
        
        assertEquals("", StringUtils.left("", -1));
        assertEquals("", StringUtils.left("", 0));
        assertEquals("", StringUtils.left("", 2));
        
        assertEquals("", StringUtils.left(FOOBAR, -1));
        assertEquals("", StringUtils.left(FOOBAR, 0));
        assertEquals(FOO, StringUtils.left(FOOBAR, 3));
        assertSame(FOOBAR, StringUtils.left(FOOBAR, 80));
    }
    
    @Test
    public void StringUtils() {
        assertSame(null, StringUtils.right(null, -1));
        assertSame(null, StringUtils.right(null, 0));
        assertSame(null, StringUtils.right(null, 2));
        
        assertEquals("", StringUtils.right("", -1));
        assertEquals("", StringUtils.right("", 0));
        assertEquals("", StringUtils.right("", 2));
        
        assertEquals("", StringUtils.right(FOOBAR, -1));
        assertEquals("", StringUtils.right(FOOBAR, 0));
        assertEquals(BAR, StringUtils.right(FOOBAR, 3));
        assertSame(FOOBAR, StringUtils.right(FOOBAR, 80));
    }
    
    @Test
    public void StringUtils() {
        assertSame(null, StringUtils.mid(null, -1, 0));
        assertSame(null, StringUtils.mid(null, 0, -1));
        assertSame(null, StringUtils.mid(null, 3, 0));
        assertSame(null, StringUtils.mid(null, 3, 2));
        
        assertEquals("", StringUtils.mid("", 0, -1));
        assertEquals("", StringUtils.mid("", 0, 0));
        assertEquals("", StringUtils.mid("", 0, 2));
        
        assertEquals("", StringUtils.mid(FOOBAR, 3, -1));
        assertEquals("", StringUtils.mid(FOOBAR, 3, 0));
        assertEquals("b", StringUtils.mid(FOOBAR, 3, 1));
        assertEquals(FOO, StringUtils.mid(FOOBAR, 0, 3));
        assertEquals(BAR, StringUtils.mid(FOOBAR, 3, 3));
        assertEquals(FOOBAR, StringUtils.mid(FOOBAR, 0, 80));
        assertEquals(BAR, StringUtils.mid(FOOBAR, 3, 80));
        assertEquals("", StringUtils.mid(FOOBAR, 9, 3));
        assertEquals(FOO, StringUtils.mid(FOOBAR, -1, 3));
    }
    
    //-----------------------------------------------------------------------
    @Test
    public void StringUtils() {
        assertEquals("foo", StringUtils.substringBefore("fooXXbarXXbaz", "XX"));

        assertEquals(null, StringUtils.substringBefore(null, null));
        assertEquals(null, StringUtils.substringBefore(null, ""));
        assertEquals(null, StringUtils.substringBefore(null, "XX"));
        assertEquals("", StringUtils.substringBefore("", null));
        assertEquals("", StringUtils.substringBefore("", ""));
        assertEquals("", StringUtils.substringBefore("", "XX"));
        
        assertEquals("foo", StringUtils.substringBefore("foo", null));
        assertEquals("foo", StringUtils.substringBefore("foo", "b"));
        assertEquals("f", StringUtils.substringBefore("foot", "o"));
        assertEquals("", StringUtils.substringBefore("abc", "a"));
        assertEquals("a", StringUtils.substringBefore("abcba", "b"));
        assertEquals("ab", StringUtils.substringBefore("abc", "c"));
        assertEquals("", StringUtils.substringBefore("abc", ""));
    }
    


}
