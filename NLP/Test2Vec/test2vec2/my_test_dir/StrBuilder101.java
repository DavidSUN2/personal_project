
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
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import org.apache.commons.lang3.SystemUtils;

/**
 * Unit tests for {@link org.apache.commons.lang3.text.StrBuilder}.
 *
 * @version $Id$
 */
public class StrBuilderAppendInsertTest {

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder() {
        final int[] count = new int[2];
        final StrBuilder sb = new StrBuilder() {
            @Override
            public StrBuilder append(final StrBuilder str, final int startIndex, final int length) {
                count[0]++;
                return super.append(str, startIndex, length);
            }
            @Override
            public StrBuilder appendNewLine() {
                count[1]++;
                return super.appendNewLine();
            }
        };
        sb.appendln(new StrBuilder("foo"), 0, 3);
        assertEquals("foo" + SEP, sb.toString());
        assertEquals(1, count[0]);
        assertEquals(1, count[1]);
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder() {
        final int[] count = new int[2];
        final StrBuilder sb = new StrBuilder() {
            @Override
            public StrBuilder append(final char[] str) {
                count[0]++;
                return super.append(str);
            }
            @Override
            public StrBuilder appendNewLine() {
                count[1]++;
                return super.appendNewLine();
            }
        };
        sb.appendln("foo".toCharArray());
        assertEquals("foo" + SEP, sb.toString());
        assertEquals(1, count[0]);
        assertEquals(1, count[1]);
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder() {
        final int[] count = new int[2];
        final StrBuilder sb = new StrBuilder() {
            @Override
            public StrBuilder append(final char[] str, final int startIndex, final int length) {
                count[0]++;
                return super.append(str, startIndex, length);
            }
            @Override
            public StrBuilder appendNewLine() {
                count[1]++;
                return super.appendNewLine();
            }
        };
        sb.appendln("foo".toCharArray(), 0, 3);
        assertEquals("foo" + SEP, sb.toString());
        assertEquals(1, count[0]);
        assertEquals(1, count[1]);
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder() {
        final StrBuilder sb = new StrBuilder();
        sb.appendln(true);
        assertEquals("true" + SEP, sb.toString());
        
        sb.clear();
        sb.appendln(false);
        assertEquals("false" + SEP, sb.toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder() {
        final StrBuilder sb = new StrBuilder();
        sb.appendln(0);
        assertEquals("0" + SEP, sb.toString());
        
        sb.clear();
        sb.appendln(1L);
        assertEquals("1" + SEP, sb.toString());
        
        sb.clear();
        sb.appendln(2.3f);
        assertEquals("2.3" + SEP, sb.toString());
        
        sb.clear();
        sb.appendln(4.5d);
        assertEquals("4.5" + SEP, sb.toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder() {
        final StrBuilder sb = new StrBuilder();
        sb.append("foo");
        assertEquals("foo", sb.toString());

        sb.appendPadding(-1, '-');
        assertEquals("foo", sb.toString());

        sb.appendPadding(0, '-');
        assertEquals("foo", sb.toString());

        sb.appendPadding(1, '-');
        assertEquals("foo-", sb.toString());

        sb.appendPadding(16, '-');
        assertEquals(20, sb.length());
        //            12345678901234567890
        assertEquals("foo-----------------", sb.toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder() {
        final StrBuilder sb = new StrBuilder();
        sb.appendFixedWidthPadLeft("foo", -1, '-');
        assertEquals("", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadLeft("foo", 0, '-');
        assertEquals("", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadLeft("foo", 1, '-');
        assertEquals("o", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadLeft("foo", 2, '-');
        assertEquals("oo", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadLeft("foo", 3, '-');
        assertEquals("foo", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadLeft("foo", 4, '-');
        assertEquals("-foo", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadLeft("foo", 10, '-');
        assertEquals(10, sb.length());
        //            1234567890
        assertEquals("-------foo", sb.toString());

        sb.clear();
        sb.setNullText("null");
        sb.appendFixedWidthPadLeft(null, 5, '-');
        assertEquals("-null", sb.toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder() {
        final StrBuilder sb = new StrBuilder();
        sb.appendFixedWidthPadLeft(123, -1, '-');
        assertEquals("", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadLeft(123, 0, '-');
        assertEquals("", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadLeft(123, 1, '-');
        assertEquals("3", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadLeft(123, 2, '-');
        assertEquals("23", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadLeft(123, 3, '-');
        assertEquals("123", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadLeft(123, 4, '-');
        assertEquals("-123", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadLeft(123, 10, '-');
        assertEquals(10, sb.length());
        //            1234567890
        assertEquals("-------123", sb.toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder() {
        final StrBuilder sb = new StrBuilder();
        sb.appendFixedWidthPadRight("foo", -1, '-');
        assertEquals("", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadRight("foo", 0, '-');
        assertEquals("", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadRight("foo", 1, '-');
        assertEquals("f", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadRight("foo", 2, '-');
        assertEquals("fo", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadRight("foo", 3, '-');
        assertEquals("foo", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadRight("foo", 4, '-');
        assertEquals("foo-", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadRight("foo", 10, '-');
        assertEquals(10, sb.length());
        //            1234567890
        assertEquals("foo-------", sb.toString());

        sb.clear();
        sb.setNullText("null");
        sb.appendFixedWidthPadRight(null, 5, '-');
        assertEquals("null-", sb.toString());
    }

    // See: http://issues.apache.org/jira/browse/LANG-299
    @Test
    public void StrBuilder() {
        final StrBuilder sb = new StrBuilder(1);
        sb.appendFixedWidthPadRight("foo", 1, '-');
        assertEquals("f", sb.toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder() {
        final StrBuilder sb = new StrBuilder();
        sb.appendFixedWidthPadRight(123, -1, '-');
        assertEquals("", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadRight(123, 0, '-');
        assertEquals("", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadRight(123, 1, '-');
        assertEquals("1", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadRight(123, 2, '-');
        assertEquals("12", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadRight(123, 3, '-');
        assertEquals("123", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadRight(123, 4, '-');
        assertEquals("123-", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadRight(123, 10, '-');
        assertEquals(10, sb.length());
        //            1234567890
        assertEquals("123-------", sb.toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder() {
        StrBuilder sb;

        sb = new StrBuilder();
        sb.append("Hi", (Object[]) null);
        assertEquals("Hi", sb.toString());

        sb = new StrBuilder();
        sb.append("Hi", "Alice");
        assertEquals("Hi", sb.toString());

        sb = new StrBuilder();
        sb.append("Hi %s", "Alice");
        assertEquals("Hi Alice", sb.toString());

        sb = new StrBuilder();
        sb.append("Hi %s %,d", "Alice", 5000);
        assertEquals("Hi Alice 5,000", sb.toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder() {
        final StrBuilder sb = new StrBuilder();
        sb.appendAll((Object[]) null);
        assertEquals("", sb.toString());

        sb.clear();
        sb.appendAll(new Object[0]);
        assertEquals("", sb.toString());

        sb.clear();
        sb.appendAll(new Object[]{"foo", "bar", "baz"});
        assertEquals("foobarbaz", sb.toString());

        sb.clear();
        sb.appendAll("foo", "bar", "baz");
        assertEquals("foobarbaz", sb.toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder() {
        final StrBuilder sb = new StrBuilder();
        sb.appendAll((Collection<?>) null);
        assertEquals("", sb.toString());

        sb.clear();
        sb.appendAll(Collections.EMPTY_LIST);
        assertEquals("", sb.toString());

        sb.clear();
        sb.appendAll(Arrays.asList(new Object[]{"foo", "bar", "baz"}));
        assertEquals("foobarbaz", sb.toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder() {
        final StrBuilder sb = new StrBuilder();
        sb.appendAll((Iterator<?>) null);
        assertEquals("", sb.toString());

        sb.clear();
        sb.appendAll(Collections.EMPTY_LIST.iterator());
        assertEquals("", sb.toString());

        sb.clear();
        sb.appendAll(Arrays.asList(new Object[]{"foo", "bar", "baz"}).iterator());
        assertEquals("foobarbaz", sb.toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder() {
        final StrBuilder sb = new StrBuilder();
        sb.appendWithSeparators((Object[]) null, ",");
        assertEquals("", sb.toString());

        sb.clear();
        sb.appendWithSeparators(new Object[0], ",");
        assertEquals("", sb.toString());

        sb.clear();
        sb.appendWithSeparators(new Object[]{"foo", "bar", "baz"}, ",");
        assertEquals("foo,bar,baz", sb.toString());

        sb.clear();
        sb.appendWithSeparators(new Object[]{"foo", "bar", "baz"}, null);
        assertEquals("foobarbaz", sb.toString());

        sb.clear();
        sb.appendWithSeparators(new Object[]{"foo", null, "baz"}, ",");
        assertEquals("foo,,baz", sb.toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder() {
        final StrBuilder sb = new StrBuilder();
        sb.appendWithSeparators((Collection<?>) null, ",");
        assertEquals("", sb.toString());

        sb.clear();
        sb.appendWithSeparators(Collections.EMPTY_LIST, ",");
        assertEquals("", sb.toString());

        sb.clear();
        sb.appendWithSeparators(Arrays.asList(new Object[]{"foo", "bar", "baz"}), ",");
        assertEquals("foo,bar,baz", sb.toString());

        sb.clear();
        sb.appendWithSeparators(Arrays.asList(new Object[]{"foo", "bar", "baz"}), null);
        assertEquals("foobarbaz", sb.toString());

        sb.clear();
        sb.appendWithSeparators(Arrays.asList(new Object[]{"foo", null, "baz"}), ",");
        assertEquals("foo,,baz", sb.toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder() {
        final StrBuilder sb = new StrBuilder();
        sb.appendWithSeparators((Iterator<?>) null, ",");
        assertEquals("", sb.toString());

        sb.clear();
        sb.appendWithSeparators(Collections.EMPTY_LIST.iterator(), ",");
        assertEquals("", sb.toString());

        sb.clear();
        sb.appendWithSeparators(Arrays.asList(new Object[]{"foo", "bar", "baz"}).iterator(), ",");
        assertEquals("foo,bar,baz", sb.toString());

        sb.clear();
        sb.appendWithSeparators(Arrays.asList(new Object[]{"foo", "bar", "baz"}).iterator(), null);
        assertEquals("foobarbaz", sb.toString());

        sb.clear();
        sb.appendWithSeparators(Arrays.asList(new Object[]{"foo", null, "baz"}).iterator(), ",");
        assertEquals("foo,,baz", sb.toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder() {
        final StrBuilder sb = new StrBuilder();
        sb.setNullText("null");
        sb.appendWithSeparators(new Object[]{"foo", null, "baz"}, ",");
        assertEquals("foo,null,baz", sb.toString());

        sb.clear();
        sb.appendWithSeparators(Arrays.asList(new Object[]{"foo", null, "baz"}), ",");
        assertEquals("foo,null,baz", sb.toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder() {
        final StrBuilder sb = new StrBuilder();
        sb.appendSeparator(",");  // no effect
        assertEquals("", sb.toString());
        sb.append("foo");
        assertEquals("foo", sb.toString());
        sb.appendSeparator(",");
        assertEquals("foo,", sb.toString());
    }
    
    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder() {
        final StrBuilder sb = new StrBuilder();
        final String startSeparator = "order by ";
        final String standardSeparator = ",";
        final String foo = "foo";
        sb.appendSeparator(null, null);
        assertEquals("", sb.toString());
        sb.appendSeparator(standardSeparator, null);
        assertEquals("", sb.toString());
        sb.appendSeparator(standardSeparator, startSeparator); 
        assertEquals(startSeparator, sb.toString());
        sb.appendSeparator(null, null); 
        assertEquals(startSeparator, sb.toString());
        sb.appendSeparator(null, startSeparator); 
        assertEquals(startSeparator, sb.toString());
        sb.append(foo);
        assertEquals(startSeparator + foo, sb.toString());
        sb.appendSeparator(standardSeparator, startSeparator);
        assertEquals(startSeparator + foo + standardSeparator, sb.toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder() {
        final StrBuilder sb = new StrBuilder();
        sb.appendSeparator(',');  // no effect
        assertEquals("", sb.toString());
        sb.append("foo");
        assertEquals("foo", sb.toString());
        sb.appendSeparator(',');
        assertEquals("foo,", sb.toString());
    }
    @Test
    public void StrBuilder() {
        final StrBuilder sb = new StrBuilder();
        final char startSeparator = ':';
        final char standardSeparator = ',';
        final String foo = "foo";
        sb.appendSeparator(standardSeparator, startSeparator);  // no effect
        assertEquals(String.valueOf(startSeparator), sb.toString());
        sb.append(foo);
        assertEquals(String.valueOf(startSeparator) + foo, sb.toString());
        sb.appendSeparator(standardSeparator, startSeparator);
        assertEquals(String.valueOf(startSeparator) + foo + standardSeparator, sb.toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder() {
        final StrBuilder sb = new StrBuilder();
        sb.appendSeparator(",", 0);  // no effect
        assertEquals("", sb.toString());
        sb.append("foo");
        assertEquals("foo", sb.toString());
        sb.appendSeparator(",", 1);
        assertEquals("foo,", sb.toString());
        
        sb.appendSeparator(",", -1);  // no effect
        assertEquals("foo,", sb.toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder() {
        final StrBuilder sb = new StrBuilder();
        sb.appendSeparator(',', 0);  // no effect
        assertEquals("", sb.toString());
        sb.append("foo");
        assertEquals("foo", sb.toString());
        sb.appendSeparator(',', 1);
        assertEquals("foo,", sb.toString());
        
        sb.appendSeparator(',', -1);  // no effect
        assertEquals("foo,", sb.toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder() {

        final StrBuilder sb = new StrBuilder();
        sb.append("barbaz");
        assertEquals("barbaz", sb.toString());

        try {
            sb.insert(-1, FOO);
            fail("insert(-1, Object) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.insert(7, FOO);
            fail("insert(7, Object) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        sb.insert(0, (Object) null);
        assertEquals("barbaz", sb.toString());

        sb.insert(0, FOO);
        assertEquals("foobarbaz", sb.toString());

        sb.clear();
        sb.append("barbaz");
        assertEquals("barbaz", sb.toString());

        try {
            sb.insert(-1, "foo");
            fail("insert(-1, String) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.insert(7, "foo");
            fail("insert(7, String) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        sb.insert(0, (String) null);
        assertEquals("barbaz", sb.toString());

        sb.insert(0, "foo");
        assertEquals("foobarbaz", sb.toString());

        sb.clear();
        sb.append("barbaz");
        assertEquals("barbaz", sb.toString());

        try {
            sb.insert(-1, new char[]{'f', 'o', 'o'});
            fail("insert(-1, char[]) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.insert(7, new char[]{'f', 'o', 'o'});
            fail("insert(7, char[]) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        sb.insert(0, (char[]) null);
        assertEquals("barbaz", sb.toString());

        sb.insert(0, new char[0]);
        assertEquals("barbaz", sb.toString());

        sb.insert(0, new char[]{'f', 'o', 'o'});
        assertEquals("foobarbaz", sb.toString());

        sb.clear();
        sb.append("barbaz");
        assertEquals("barbaz", sb.toString());

        try {
            sb.insert(-1, new char[]{'a', 'b', 'c', 'f', 'o', 'o', 'd', 'e', 'f'}, 3, 3);
            fail("insert(-1, char[], 3, 3) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.insert(7, new char[]{'a', 'b', 'c', 'f', 'o', 'o', 'd', 'e', 'f'}, 3, 3);
            fail("insert(7, char[], 3, 3) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        sb.insert(0, (char[]) null, 0, 0);
        assertEquals("barbaz", sb.toString());

        sb.insert(0, new char[0], 0, 0);
        assertEquals("barbaz", sb.toString());

        try {
            sb.insert(0, new char[]{'a', 'b', 'c', 'f', 'o', 'o', 'd', 'e', 'f'}, -1, 3);
            fail("insert(0, char[], -1, 3) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.insert(0, new char[]{'a', 'b', 'c', 'f', 'o', 'o', 'd', 'e', 'f'}, 10, 3);
            fail("insert(0, char[], 10, 3) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.insert(0, new char[]{'a', 'b', 'c', 'f', 'o', 'o', 'd', 'e', 'f'}, 0, -1);
            fail("insert(0, char[], 0, -1) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.insert(0, new char[]{'a', 'b', 'c', 'f', 'o', 'o', 'd', 'e', 'f'}, 0, 10);
            fail("insert(0, char[], 0, 10) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        sb.insert(0, new char[]{'a', 'b', 'c', 'f', 'o', 'o', 'd', 'e', 'f'}, 0, 0);
        assertEquals("barbaz", sb.toString());

        sb.insert(0, new char[]{'a', 'b', 'c', 'f', 'o', 'o', 'd', 'e', 'f'}, 3, 3);
        assertEquals("foobarbaz", sb.toString());

        sb.clear();
        sb.append("barbaz");
        assertEquals("barbaz", sb.toString());

        try {
            sb.insert(-1, true);
            fail("insert(-1, boolean) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.insert(7, true);
            fail("insert(7, boolean) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        sb.insert(0, true);
        assertEquals("truebarbaz", sb.toString());

        sb.insert(0, false);
        assertEquals("falsetruebarbaz", sb.toString());

        sb.clear();
        sb.append("barbaz");
        assertEquals("barbaz", sb.toString());

        try {
            sb.insert(-1, '!');
            fail("insert(-1, char) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.insert(7, '!');
            fail("insert(7, char) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        sb.insert(0, '!');
        assertEquals("!barbaz", sb.toString());

        sb.clear();
        sb.append("barbaz");
        assertEquals("barbaz", sb.toString());

        try {
            sb.insert(-1, 0);
            fail("insert(-1, int) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.insert(7, 0);
            fail("insert(7, int) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        sb.insert(0, '0');
        assertEquals("0barbaz", sb.toString());

        sb.clear();
        sb.append("barbaz");
        assertEquals("barbaz", sb.toString());

        try {
            sb.insert(-1, 1L);
            fail("insert(-1, long) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.insert(7, 1L);
            fail("insert(7, long) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        sb.insert(0, 1L);
        assertEquals("1barbaz", sb.toString());

        sb.clear();
        sb.append("barbaz");
        assertEquals("barbaz", sb.toString());

        try {
            sb.insert(-1, 2.3F);
            fail("insert(-1, float) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.insert(7, 2.3F);
            fail("insert(7, float) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        sb.insert(0, 2.3F);
        assertEquals("2.3barbaz", sb.toString());

        sb.clear();
        sb.append("barbaz");
        assertEquals("barbaz", sb.toString());

        try {
            sb.insert(-1, 4.5D);
            fail("insert(-1, double) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.insert(7, 4.5D);
            fail("insert(7, double) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        sb.insert(0, 4.5D);
        assertEquals("4.5barbaz", sb.toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder() {
        final StrBuilder sb = new StrBuilder();
        sb.setNullText("null");
        sb.append("barbaz");
        assertEquals("barbaz", sb.toString());

        try {
            sb.insert(-1, FOO);
            fail("insert(-1, Object) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.insert(7, FOO);
            fail("insert(7, Object) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        sb.insert(0, (Object) null);
        assertEquals("nullbarbaz", sb.toString());

        sb.insert(0, FOO);
        assertEquals("foonullbarbaz", sb.toString());

        sb.clear();
        sb.append("barbaz");
        assertEquals("barbaz", sb.toString());

        try {
            sb.insert(-1, "foo");
            fail("insert(-1, String) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.insert(7, "foo");
            fail("insert(7, String) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        sb.insert(0, (String) null);
        assertEquals("nullbarbaz", sb.toString());

        sb.insert(0, "foo");
        assertEquals("foonullbarbaz", sb.toString());

        sb.insert(0, (char[]) null);
        assertEquals("nullfoonullbarbaz", sb.toString());

        sb.insert(0, (char[]) null, 0, 0);
        assertEquals("nullnullfoonullbarbaz", sb.toString());
    }
}
