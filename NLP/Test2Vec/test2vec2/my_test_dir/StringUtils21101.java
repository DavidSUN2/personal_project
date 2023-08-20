
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

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang3.text.StrBuilder;

/**
 * Unit tests {@link org.apache.commons.lang3.StringUtils} - StartsWith/EndsWith methods
 *
 * @version $Id$
 */
public class StringUtilsStartsEndsWithTest {
    /**
     * Test StringUtils.endsWith()
     */
    @Test
    public void StringUtils21() {
        assertTrue("endsWith(null, null)",    StringUtils.endsWith(null, (String)null));
        assertFalse("endsWith(FOOBAR, null)", StringUtils.endsWith(FOOBAR, (String)null));
        assertFalse("endsWith(null, FOO)",    StringUtils.endsWith(null, FOO));
        assertTrue("endsWith(FOOBAR, \"\")",  StringUtils.endsWith(FOOBAR, ""));

        assertFalse("endsWith(foobar, foo)", StringUtils.endsWith(foobar, foo));
        assertFalse("endsWith(FOOBAR, FOO)", StringUtils.endsWith(FOOBAR, FOO));
        assertFalse("endsWith(foobar, FOO)", StringUtils.endsWith(foobar, FOO));
        assertFalse("endsWith(FOOBAR, foo)", StringUtils.endsWith(FOOBAR, foo));

        assertFalse("endsWith(foo, foobar)", StringUtils.endsWith(foo, foobar));
        assertFalse("endsWith(foo, foobar)", StringUtils.endsWith(bar, foobar));

        assertTrue("endsWith(foobar, bar)",  StringUtils.endsWith(foobar, bar));
        assertTrue("endsWith(FOOBAR, BAR)",  StringUtils.endsWith(FOOBAR, BAR));
        assertFalse("endsWith(foobar, BAR)", StringUtils.endsWith(foobar, BAR));
        assertFalse("endsWith(FOOBAR, bar)", StringUtils.endsWith(FOOBAR, bar));

        // "alpha,beta,gamma,delta".endsWith("delta")
        assertTrue("endsWith(\u03B1\u03B2\u03B3\u03B4, \u03B4)",
                StringUtils.endsWith("\u03B1\u03B2\u03B3\u03B4", "\u03B4"));
        // "alpha,beta,gamma,delta".endsWith("gamma,DELTA")
        assertFalse("endsWith(\u03B1\u03B2\u03B3\u03B4, \u03B3\u0394)",
                StringUtils.endsWith("\u03B1\u03B2\u03B3\u03B4", "\u03B3\u0394"));
    }

    /**
     * Test StringUtils.endsWithIgnoreCase()
     */
    @Test
    public void StringUtils21() {
        assertTrue("endsWithIgnoreCase(null, null)",    StringUtils.endsWithIgnoreCase(null, (String)null));
        assertFalse("endsWithIgnoreCase(FOOBAR, null)", StringUtils.endsWithIgnoreCase(FOOBAR, (String)null));
        assertFalse("endsWithIgnoreCase(null, FOO)",    StringUtils.endsWithIgnoreCase(null, FOO));
        assertTrue("endsWithIgnoreCase(FOOBAR, \"\")",  StringUtils.endsWithIgnoreCase(FOOBAR, ""));

        assertFalse("endsWithIgnoreCase(foobar, foo)", StringUtils.endsWithIgnoreCase(foobar, foo));
        assertFalse("endsWithIgnoreCase(FOOBAR, FOO)", StringUtils.endsWithIgnoreCase(FOOBAR, FOO));
        assertFalse("endsWithIgnoreCase(foobar, FOO)", StringUtils.endsWithIgnoreCase(foobar, FOO));
        assertFalse("endsWithIgnoreCase(FOOBAR, foo)", StringUtils.endsWithIgnoreCase(FOOBAR, foo));

        assertFalse("endsWithIgnoreCase(foo, foobar)", StringUtils.endsWithIgnoreCase(foo, foobar));
        assertFalse("endsWithIgnoreCase(foo, foobar)", StringUtils.endsWithIgnoreCase(bar, foobar));

        assertTrue("endsWithIgnoreCase(foobar, bar)", StringUtils.endsWithIgnoreCase(foobar, bar));
        assertTrue("endsWithIgnoreCase(FOOBAR, BAR)", StringUtils.endsWithIgnoreCase(FOOBAR, BAR));
        assertTrue("endsWithIgnoreCase(foobar, BAR)", StringUtils.endsWithIgnoreCase(foobar, BAR));
        assertTrue("endsWithIgnoreCase(FOOBAR, bar)", StringUtils.endsWithIgnoreCase(FOOBAR, bar));

        // javadoc
        assertTrue(StringUtils.endsWithIgnoreCase("abcdef", "def"));
        assertTrue(StringUtils.endsWithIgnoreCase("ABCDEF", "def"));
        assertFalse(StringUtils.endsWithIgnoreCase("ABCDEF", "cde"));

        // "alpha,beta,gamma,delta".endsWith("DELTA")
        assertTrue("endsWith(\u03B1\u03B2\u03B3\u03B4, \u0394)",
                StringUtils.endsWithIgnoreCase("\u03B1\u03B2\u03B3\u03B4", "\u0394"));
        // "alpha,beta,gamma,delta".endsWith("GAMMA")
        assertFalse("endsWith(\u03B1\u03B2\u03B3\u03B4, \u0393)",
                StringUtils.endsWithIgnoreCase("\u03B1\u03B2\u03B3\u03B4", "\u0393"));
    }

    @Test
    public void StringUtils21() {
        assertFalse("StringUtils.endsWithAny(null, null)", StringUtils.endsWithAny(null, (String)null));
        assertFalse("StringUtils.endsWithAny(null, new String[] {abc})", StringUtils.endsWithAny(null, new String[] {"abc"}));
        assertFalse("StringUtils.endsWithAny(abcxyz, null)", StringUtils.endsWithAny("abcxyz", (String)null));
        assertTrue("StringUtils.endsWithAny(abcxyz, new String[] {\"\"})", StringUtils.endsWithAny("abcxyz", new String[] {""}));
        assertTrue("StringUtils.endsWithAny(abcxyz, new String[] {xyz})", StringUtils.endsWithAny("abcxyz", new String[] {"xyz"}));
        assertTrue("StringUtils.endsWithAny(abcxyz, new String[] {null, xyz, abc})", StringUtils.endsWithAny("abcxyz", new String[] {null, "xyz", "abc"}));
        assertFalse("StringUtils.endsWithAny(defg, new String[] {null, xyz, abc})", StringUtils.endsWithAny("defg", new String[] {null, "xyz", "abc"}));

        assertTrue("StringUtils.endsWithAny(abcxyz, StringBuilder(abc), StringBuffer(xyz))", StringUtils.endsWithAny("abcxyz", new StringBuilder("abc"), new StringBuffer("xyz")));
        assertTrue("StringUtils.endsWithAny( StrBuilder(abcxyz), StringBuilder(abc), StringBuffer(xyz))", StringUtils.endsWithAny( new StrBuilder("abcxyz"), new StringBuilder("abc"), new StringBuffer("xyz")));
    }

}
