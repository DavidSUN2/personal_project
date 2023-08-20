
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

    /** The system line separator. */
    private static final String SEP = SystemUtils.LINE_SEPARATOR;

    /** Test subclass of Object, with a toString method. */
    private static final Object FOO = new Object() {
        @Override
        public String toString() {
            return "foo";
        }
    };

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder() {
        StrBuilder sb = new StrBuilder("---");
        sb.appendNewLine().append("+++");
        assertEquals("---" + SEP + "+++", sb.toString());
        
        sb = new StrBuilder("---");
        sb.setNewLineText("#").appendNewLine().setNewLineText(null).appendNewLine();
        assertEquals("---#" + SEP, sb.toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder() {
        final StrBuilder sb = new StrBuilder();
        sb.setNullText("NULL");
        assertEquals("", sb.toString());

        sb.appendNull();
        assertEquals("NULL", sb.toString());

        sb.append((Object) null);
        assertEquals("NULLNULL", sb.toString());

        sb.append(FOO);
        assertEquals("NULLNULLfoo", sb.toString());

        sb.append((String) null);
        assertEquals("NULLNULLfooNULL", sb.toString());

        sb.append("");
        assertEquals("NULLNULLfooNULL", sb.toString());

        sb.append("bar");
        assertEquals("NULLNULLfooNULLbar", sb.toString());

        sb.append((StringBuffer) null);
        assertEquals("NULLNULLfooNULLbarNULL", sb.toString());

        sb.append(new StringBuffer("baz"));
        assertEquals("NULLNULLfooNULLbarNULLbaz", sb.toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder() {
        final StrBuilder sb = new StrBuilder();
        sb.appendNull();
        assertEquals("", sb.toString());

        sb.append((Object) null);
        assertEquals("", sb.toString());

        sb.append(FOO);
        assertEquals("foo", sb.toString());

        sb.append((StringBuffer) null);
        assertEquals("foo", sb.toString());

        sb.append(new StringBuffer("baz"));
        assertEquals("foobaz", sb.toString());

        sb.append(new StrBuilder("yes"));
        assertEquals("foobazyes", sb.toString());

        sb.append((CharSequence) "Seq");
        assertEquals("foobazyesSeq", sb.toString());

        sb.append(new StringBuilder("bld")); // Check it supports StringBuilder
        assertEquals("foobazyesSeqbld", sb.toString());
    }
    
    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder() {
        StrBuilder sb = new StrBuilder();
        sb.setNullText("NULL").append((String) null);
        assertEquals("NULL", sb.toString());

        sb = new StrBuilder();
        sb.append(new StringBuilder("foo"));
        assertEquals("foo", sb.toString());

        sb.append(new StringBuilder(""));
        assertEquals("foo", sb.toString());

        sb.append(new StringBuilder("bar"));
        assertEquals("foobar", sb.toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder() {
        StrBuilder sb = new StrBuilder();
        sb.setNullText("NULL").append((String) null);
        assertEquals("NULL", sb.toString());

        sb = new StrBuilder();
        sb.append("foo");
        assertEquals("foo", sb.toString());

        sb.append("");
        assertEquals("foo", sb.toString());

        sb.append("bar");
        assertEquals("foobar", sb.toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder() {
        StrBuilder sb = new StrBuilder();
        sb.setNullText("NULL").append((String) null, 0, 1);
        assertEquals("NULL", sb.toString());

        sb = new StrBuilder();
        sb.append("foo", 0, 3);
        assertEquals("foo", sb.toString());

        try {
            sb.append("bar", -1, 1);
            fail("append(char[], -1,) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.append("bar", 3, 1);
            fail("append(char[], 3,) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.append("bar", 1, -1);
            fail("append(char[],, -1) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.append("bar", 1, 3);
            fail("append(char[], 1, 3) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.append("bar", -1, 3);
            fail("append(char[], -1, 3) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.append("bar", 4, 0);
            fail("append(char[], 4, 0) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        sb.append("bar", 3, 0);
        assertEquals("foo", sb.toString());

        sb.append("abcbardef", 3, 3);
        assertEquals("foobar", sb.toString());

        sb.append( (CharSequence)"abcbardef", 4, 3);
        assertEquals("foobarard", sb.toString());
    }
    
    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder() {
        StrBuilder sb = new StrBuilder();
        sb.setNullText("NULL").append((String) null, 0, 1);
        assertEquals("NULL", sb.toString());

        sb = new StrBuilder();
        sb.append(new StringBuilder("foo"), 0, 3);
        assertEquals("foo", sb.toString());

        try {
            sb.append(new StringBuilder("bar"), -1, 1);
            fail("append(StringBuilder, -1,) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.append(new StringBuilder("bar"), 3, 1);
            fail("append(StringBuilder, 3,) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.append(new StringBuilder("bar"), 1, -1);
            fail("append(StringBuilder,, -1) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.append(new StringBuilder("bar"), 1, 3);
            fail("append(StringBuilder, 1, 3) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.append(new StringBuilder("bar"), -1, 3);
            fail("append(StringBuilder, -1, 3) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.append(new StringBuilder("bar"), 4, 0);
            fail("append(StringBuilder, 4, 0) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        sb.append(new StringBuilder("bar"), 3, 0);
        assertEquals("foo", sb.toString());

        sb.append(new StringBuilder("abcbardef"), 3, 3);
        assertEquals("foobar", sb.toString());

        sb.append( new StringBuilder("abcbardef"), 4, 3);
        assertEquals("foobarard", sb.toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder() {
        StrBuilder sb = new StrBuilder();
        sb.setNullText("NULL").append((StringBuffer) null);
        assertEquals("NULL", sb.toString());

        sb = new StrBuilder();
        sb.append(new StringBuffer("foo"));
        assertEquals("foo", sb.toString());

        sb.append(new StringBuffer(""));
        assertEquals("foo", sb.toString());

        sb.append(new StringBuffer("bar"));
        assertEquals("foobar", sb.toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder() {
        StrBuilder sb = new StrBuilder();
        sb.setNullText("NULL").append((StringBuffer) null, 0, 1);
        assertEquals("NULL", sb.toString());

        sb = new StrBuilder();
        sb.append(new StringBuffer("foo"), 0, 3);
        assertEquals("foo", sb.toString());

        try {
            sb.append(new StringBuffer("bar"), -1, 1);
            fail("append(char[], -1,) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.append(new StringBuffer("bar"), 3, 1);
            fail("append(char[], 3,) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.append(new StringBuffer("bar"), 1, -1);
            fail("append(char[],, -1) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.append(new StringBuffer("bar"), 1, 3);
            fail("append(char[], 1, 3) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.append(new StringBuffer("bar"), -1, 3);
            fail("append(char[], -1, 3) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.append(new StringBuffer("bar"), 4, 0);
            fail("append(char[], 4, 0) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        sb.append(new StringBuffer("bar"), 3, 0);
        assertEquals("foo", sb.toString());

        sb.append(new StringBuffer("abcbardef"), 3, 3);
        assertEquals("foobar", sb.toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder() {
        StrBuilder sb = new StrBuilder();
        sb.setNullText("NULL").append((StrBuilder) null);
        assertEquals("NULL", sb.toString());

        sb = new StrBuilder();
        sb.append(new StrBuilder("foo"));
        assertEquals("foo", sb.toString());

        sb.append(new StrBuilder(""));
        assertEquals("foo", sb.toString());

        sb.append(new StrBuilder("bar"));
        assertEquals("foobar", sb.toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder() {
        StrBuilder sb = new StrBuilder();
        sb.setNullText("NULL").append((StrBuilder) null, 0, 1);
        assertEquals("NULL", sb.toString());

        sb = new StrBuilder();
        sb.append(new StrBuilder("foo"), 0, 3);
        assertEquals("foo", sb.toString());

        try {
            sb.append(new StrBuilder("bar"), -1, 1);
            fail("append(char[], -1,) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.append(new StrBuilder("bar"), 3, 1);
            fail("append(char[], 3,) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.append(new StrBuilder("bar"), 1, -1);
            fail("append(char[],, -1) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.append(new StrBuilder("bar"), 1, 3);
            fail("append(char[], 1, 3) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.append(new StrBuilder("bar"), -1, 3);
            fail("append(char[], -1, 3) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.append(new StrBuilder("bar"), 4, 0);
            fail("append(char[], 4, 0) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        sb.append(new StrBuilder("bar"), 3, 0);
        assertEquals("foo", sb.toString());

        sb.append(new StrBuilder("abcbardef"), 3, 3);
        assertEquals("foobar", sb.toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder() {
        StrBuilder sb = new StrBuilder();
        sb.setNullText("NULL").append((char[]) null);
        assertEquals("NULL", sb.toString());

        sb = new StrBuilder();
        sb.append(new char[0]);
        assertEquals("", sb.toString());

        sb.append(new char[]{'f', 'o', 'o'});
        assertEquals("foo", sb.toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder() {
        StrBuilder sb = new StrBuilder();
        sb.setNullText("NULL").append((char[]) null, 0, 1);
        assertEquals("NULL", sb.toString());

        sb = new StrBuilder();
        sb.append(new char[]{'f', 'o', 'o'}, 0, 3);
        assertEquals("foo", sb.toString());

        try {
            sb.append(new char[]{'b', 'a', 'r'}, -1, 1);
            fail("append(char[], -1,) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.append(new char[]{'b', 'a', 'r'}, 3, 1);
            fail("append(char[], 3,) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.append(new char[]{'b', 'a', 'r'}, 1, -1);
            fail("append(char[],, -1) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.append(new char[]{'b', 'a', 'r'}, 1, 3);
            fail("append(char[], 1, 3) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.append(new char[]{'b', 'a', 'r'}, -1, 3);
            fail("append(char[], -1, 3) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        try {
            sb.append(new char[]{'b', 'a', 'r'}, 4, 0);
            fail("append(char[], 4, 0) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        sb.append(new char[]{'b', 'a', 'r'}, 3, 0);
        assertEquals("foo", sb.toString());

        sb.append(new char[]{'a', 'b', 'c', 'b', 'a', 'r', 'd', 'e', 'f'}, 3, 3);
        assertEquals("foobar", sb.toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder() {
        final StrBuilder sb = new StrBuilder();
        sb.append(true);
        assertEquals("true", sb.toString());

        sb.append(false);
        assertEquals("truefalse", sb.toString());

        sb.append('!');
        assertEquals("truefalse!", sb.toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder() {
        final StrBuilder sb = new StrBuilder();
        sb.append(0);
        assertEquals("0", sb.toString());

        sb.append(1L);
        assertEquals("01", sb.toString());

        sb.append(2.3f);
        assertEquals("012.3", sb.toString());

        sb.append(4.5d);
        assertEquals("012.34.5", sb.toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder() {
        final int[] count = new int[2];
        final StrBuilder sb = new StrBuilder() {
            @Override
            public StrBuilder append(final String str) {
                count[0]++;
                return super.append(str);
            }
            @Override
            public StrBuilder appendNewLine() {
                count[1]++;
                return super.appendNewLine();
            }
        };
        sb.appendln("Hello %s", "Alice");
        assertEquals("Hello Alice" + SEP, sb.toString());
        assertEquals(2, count[0]);  // appendNewLine() calls append(String)
        assertEquals(1, count[1]);
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder() {
        final StrBuilder sb = new StrBuilder();
        sb.appendln((Object) null);
        assertEquals("" + SEP, sb.toString());

        sb.appendln(FOO);
        assertEquals(SEP + "foo" + SEP, sb.toString());

        sb.appendln(Integer.valueOf(6));
        assertEquals(SEP + "foo" + SEP + "6" + SEP, sb.toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder() {
        final int[] count = new int[2];
        final StrBuilder sb = new StrBuilder() {
            @Override
            public StrBuilder append(final String str) {
                count[0]++;
                return super.append(str);
            }
            @Override
            public StrBuilder appendNewLine() {
                count[1]++;
                return super.appendNewLine();
            }
        };
        sb.appendln("foo");
        assertEquals("foo" + SEP, sb.toString());
        assertEquals(2, count[0]);  // appendNewLine() calls append(String)
        assertEquals(1, count[1]);
    }

    //-----------------------------------------------------------------------
    @Test
    public void StrBuilder() {
        final int[] count = new int[2];
        final StrBuilder sb = new StrBuilder() {
            @Override
            public StrBuilder append(final String str, final int startIndex, final int length) {
                count[0]++;
                return super.append(str, startIndex, length);
            }
            @Override
            public StrBuilder appendNewLine() {
                count[1]++;
                return super.appendNewLine();
            }
        };
        sb.appendln("foo", 0, 3);
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
            public StrBuilder append(final StringBuffer str) {
                count[0]++;
                return super.append(str);
            }
            @Override
            public StrBuilder appendNewLine() {
                count[1]++;
                return super.appendNewLine();
            }
        };
        sb.appendln(new StringBuffer("foo"));
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
            public StrBuilder append(final StringBuilder str) {
                count[0]++;
                return super.append(str);
            }
            @Override
            public StrBuilder appendNewLine() {
                count[1]++;
                return super.appendNewLine();
            }
        };
        sb.appendln(new StringBuilder("foo"));
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
            public StrBuilder append(final StringBuffer str, final int startIndex, final int length) {
                count[0]++;
                return super.append(str, startIndex, length);
            }
            @Override
            public StrBuilder appendNewLine() {
                count[1]++;
                return super.appendNewLine();
            }
        };
        sb.appendln(new StringBuffer("foo"), 0, 3);
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
            public StrBuilder append(final StringBuilder str, final int startIndex, final int length) {
                count[0]++;
                return super.append(str, startIndex, length);
            }
            @Override
            public StrBuilder appendNewLine() {
                count[1]++;
                return super.appendNewLine();
            }
        };
        sb.appendln(new StringBuilder("foo"), 0, 3);
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
            public StrBuilder append(final StrBuilder str) {
                count[0]++;
                return super.append(str);
            }
            @Override
            public StrBuilder appendNewLine() {
                count[1]++;
                return super.appendNewLine();
            }
        };
        sb.appendln(new StrBuilder("foo"));
        assertEquals("foo" + SEP, sb.toString());
        assertEquals(1, count[0]);
        assertEquals(1, count[1]);
    }


}
