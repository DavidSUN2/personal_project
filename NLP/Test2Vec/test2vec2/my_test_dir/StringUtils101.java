
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
    @Test
    public void StringUtils() {
        assertEquals("barXXbaz", StringUtils.substringAfter("fooXXbarXXbaz", "XX"));
        
        assertEquals(null, StringUtils.substringAfter(null, null));
        assertEquals(null, StringUtils.substringAfter(null, ""));
        assertEquals(null, StringUtils.substringAfter(null, "XX"));
        assertEquals("", StringUtils.substringAfter("", null));
        assertEquals("", StringUtils.substringAfter("", ""));
        assertEquals("", StringUtils.substringAfter("", "XX"));
        
        assertEquals("", StringUtils.substringAfter("foo", null));
        assertEquals("ot", StringUtils.substringAfter("foot", "o"));
        assertEquals("bc", StringUtils.substringAfter("abc", "a"));
        assertEquals("cba", StringUtils.substringAfter("abcba", "b"));
        assertEquals("", StringUtils.substringAfter("abc", "c"));
        assertEquals("abc", StringUtils.substringAfter("abc", ""));
        assertEquals("", StringUtils.substringAfter("abc", "d"));
    }

    @Test
    public void StringUtils() {
        assertEquals("fooXXbar", StringUtils.substringBeforeLast("fooXXbarXXbaz", "XX"));

        assertEquals(null, StringUtils.substringBeforeLast(null, null));
        assertEquals(null, StringUtils.substringBeforeLast(null, ""));
        assertEquals(null, StringUtils.substringBeforeLast(null, "XX"));
        assertEquals("", StringUtils.substringBeforeLast("", null));
        assertEquals("", StringUtils.substringBeforeLast("", ""));
        assertEquals("", StringUtils.substringBeforeLast("", "XX"));

        assertEquals("foo", StringUtils.substringBeforeLast("foo", null));
        assertEquals("foo", StringUtils.substringBeforeLast("foo", "b"));
        assertEquals("fo", StringUtils.substringBeforeLast("foo", "o"));
        assertEquals("abc\r\n", StringUtils.substringBeforeLast("abc\r\n", "d"));
        assertEquals("abc", StringUtils.substringBeforeLast("abcdabc", "d"));
        assertEquals("abcdabc", StringUtils.substringBeforeLast("abcdabcd", "d"));
        assertEquals("a", StringUtils.substringBeforeLast("abc", "b"));
        assertEquals("abc ", StringUtils.substringBeforeLast("abc \n", "\n"));
        assertEquals("a", StringUtils.substringBeforeLast("a", null));
        assertEquals("a", StringUtils.substringBeforeLast("a", ""));
        assertEquals("", StringUtils.substringBeforeLast("a", "a"));
    }
    
    @Test
    public void StringUtils() {
        assertEquals("baz", StringUtils.substringAfterLast("fooXXbarXXbaz", "XX"));

        assertEquals(null, StringUtils.substringAfterLast(null, null));
        assertEquals(null, StringUtils.substringAfterLast(null, ""));
        assertEquals(null, StringUtils.substringAfterLast(null, "XX"));
        assertEquals("", StringUtils.substringAfterLast("", null));
        assertEquals("", StringUtils.substringAfterLast("", ""));
        assertEquals("", StringUtils.substringAfterLast("", "a"));

        assertEquals("", StringUtils.substringAfterLast("foo", null));
        assertEquals("", StringUtils.substringAfterLast("foo", "b"));
        assertEquals("t", StringUtils.substringAfterLast("foot", "o"));
        assertEquals("bc", StringUtils.substringAfterLast("abc", "a"));
        assertEquals("a", StringUtils.substringAfterLast("abcba", "b"));
        assertEquals("", StringUtils.substringAfterLast("abc", "c"));
        assertEquals("", StringUtils.substringAfterLast("", "d"));
        assertEquals("", StringUtils.substringAfterLast("abc", ""));
    }        
        
    //-----------------------------------------------------------------------
    @Test
    public void StringUtils() {
        assertEquals(null, StringUtils.substringBetween(null, "tag"));
        assertEquals("", StringUtils.substringBetween("", ""));
        assertEquals(null, StringUtils.substringBetween("", "abc"));
        assertEquals("", StringUtils.substringBetween("    ", " "));
        assertEquals(null, StringUtils.substringBetween("abc", null));
        assertEquals("", StringUtils.substringBetween("abc", ""));
        assertEquals(null, StringUtils.substringBetween("abc", "a"));
        assertEquals("bc", StringUtils.substringBetween("abca", "a"));
        assertEquals("bc", StringUtils.substringBetween("abcabca", "a"));
        assertEquals("bar", StringUtils.substringBetween("\nbar\n", "\n"));
    }
            
    @Test
    public void StringUtils() {
        assertEquals(null, StringUtils.substringBetween(null, "", ""));
        assertEquals(null, StringUtils.substringBetween("", null, ""));
        assertEquals(null, StringUtils.substringBetween("", "", null));
        assertEquals("", StringUtils.substringBetween("", "", ""));
        assertEquals("", StringUtils.substringBetween("foo", "", ""));
        assertEquals(null, StringUtils.substringBetween("foo", "", "]"));
        assertEquals(null, StringUtils.substringBetween("foo", "[", "]"));
        assertEquals("", StringUtils.substringBetween("    ", " ", "  "));
        assertEquals("bar", StringUtils.substringBetween("<foo>bar</foo>", "<foo>", "</foo>") );
    }

   /**
     * Tests the substringsBetween method that returns an String Array of substrings.
     */
    @Test
    public void StringUtils() {

        String[] results = StringUtils.substringsBetween("[one], [two], [three]", "[", "]");
        assertEquals(3, results.length);
        assertEquals("one", results[0]);
        assertEquals("two", results[1]);
        assertEquals("three", results[2]);

        results = StringUtils.substringsBetween("[one], [two], three", "[", "]");
        assertEquals(2, results.length);
        assertEquals("one", results[0]);
        assertEquals("two", results[1]);

        results = StringUtils.substringsBetween("[one], [two], three]", "[", "]");
        assertEquals(2, results.length);
        assertEquals("one", results[0]);
        assertEquals("two", results[1]);

        results = StringUtils.substringsBetween("[one], two], three]", "[", "]");
        assertEquals(1, results.length);
        assertEquals("one", results[0]);

        results = StringUtils.substringsBetween("one], two], [three]", "[", "]");
        assertEquals(1, results.length);
        assertEquals("three", results[0]);

        // 'ab hello ba' will match, but 'ab non ba' won't
        // this is because the 'a' is shared between the two and can't be matched twice
        results = StringUtils.substringsBetween("aabhellobabnonba", "ab", "ba");
        assertEquals(1, results.length);
        assertEquals("hello", results[0]);

        results = StringUtils.substringsBetween("one, two, three", "[", "]");
        assertNull(results);

        results = StringUtils.substringsBetween("[one, two, three", "[", "]");
        assertNull(results);

        results = StringUtils.substringsBetween("one, two, three]", "[", "]");
        assertNull(results);

        results = StringUtils.substringsBetween("[one], [two], [three]", "[", null);
        assertNull(results);

        results = StringUtils.substringsBetween("[one], [two], [three]", null, "]");
        assertNull(results);

        results = StringUtils.substringsBetween("[one], [two], [three]", "", "");
        assertNull(results);

        results = StringUtils.substringsBetween(null, "[", "]");
        assertNull(results);

        results = StringUtils.substringsBetween("", "[", "]");
        assertEquals(0, results.length);
    }

    //-----------------------------------------------------------------------
    @Test
    public void StringUtils() {
        assertEquals(0, StringUtils.countMatches(null, null));
        assertEquals(0, StringUtils.countMatches("blah", null));
        assertEquals(0, StringUtils.countMatches(null, "DD"));

        assertEquals(0, StringUtils.countMatches("x", ""));
        assertEquals(0, StringUtils.countMatches("", ""));

        assertEquals(3, 
             StringUtils.countMatches("one long someone sentence of one", "one"));
        assertEquals(0, 
             StringUtils.countMatches("one long someone sentence of one", "two"));
        assertEquals(4, 
             StringUtils.countMatches("oooooooooooo", "ooo"));
    }

}
