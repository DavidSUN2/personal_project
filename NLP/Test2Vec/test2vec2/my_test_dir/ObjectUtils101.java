
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
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.exception.CloneFailedException;
import org.apache.commons.lang3.mutable.MutableObject;
import org.apache.commons.lang3.text.StrBuilder;
import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.ObjectUtils}.
 *
 * @version $Id$
 */
public class ObjectUtilsTest {
    @SuppressWarnings("cast") // 1 OK, because we are checking for code change
    @Test
    public void ObjectUtils() {
        assertNotNull(ObjectUtils.NULL);
        // 1 Check that NULL really is a Null i.e. the definition has not been changed
        assertTrue(ObjectUtils.NULL instanceof ObjectUtils.Null);
        assertSame(ObjectUtils.NULL, SerializationUtils.clone(ObjectUtils.NULL));
    }

    @Test
    public void ObjectUtils() {
        final Calendar calendar = Calendar.getInstance();
        final Date nonNullComparable1 = calendar.getTime();
        final Date nonNullComparable2 = calendar.getTime();
        final String[] nullAray = null;
        
        calendar.set( Calendar.YEAR, calendar.get( Calendar.YEAR ) -1 );
        final Date minComparable = calendar.getTime();
        
        assertNotSame( nonNullComparable1, nonNullComparable2 );
        
        assertNull(ObjectUtils.max( (String) null ) );
        assertNull(ObjectUtils.max( nullAray ) );
        assertSame( nonNullComparable1, ObjectUtils.max( null, nonNullComparable1 ) );
        assertSame( nonNullComparable1, ObjectUtils.max( nonNullComparable1, null ) );
        assertSame( nonNullComparable1, ObjectUtils.max( null, nonNullComparable1, null ) );
        assertSame( nonNullComparable1, ObjectUtils.max( nonNullComparable1, nonNullComparable2 ) );
        assertSame( nonNullComparable2, ObjectUtils.max( nonNullComparable2, nonNullComparable1 ) );
        assertSame( nonNullComparable1, ObjectUtils.max( nonNullComparable1, minComparable ) );
        assertSame( nonNullComparable1, ObjectUtils.max( minComparable, nonNullComparable1 ) );
        assertSame( nonNullComparable1, ObjectUtils.max( null, minComparable, null, nonNullComparable1 ) );

        assertNull( ObjectUtils.max((String)null, (String)null) );
    }

    @Test
    public void ObjectUtils() {
        final Calendar calendar = Calendar.getInstance();
        final Date nonNullComparable1 = calendar.getTime();
        final Date nonNullComparable2 = calendar.getTime();
        final String[] nullAray = null;
        
        calendar.set( Calendar.YEAR, calendar.get( Calendar.YEAR ) -1 );
        final Date minComparable = calendar.getTime();
        
        assertNotSame( nonNullComparable1, nonNullComparable2 );
        
        assertNull(ObjectUtils.min( (String) null ) );
        assertNull(ObjectUtils.min( nullAray ) );
        assertSame( nonNullComparable1, ObjectUtils.min( null, nonNullComparable1 ) );
        assertSame( nonNullComparable1, ObjectUtils.min( nonNullComparable1, null ) );
        assertSame( nonNullComparable1, ObjectUtils.min( null, nonNullComparable1, null ) );
        assertSame( nonNullComparable1, ObjectUtils.min( nonNullComparable1, nonNullComparable2 ) );
        assertSame( nonNullComparable2, ObjectUtils.min( nonNullComparable2, nonNullComparable1 ) );
        assertSame( minComparable, ObjectUtils.min( nonNullComparable1, minComparable ) );
        assertSame( minComparable, ObjectUtils.min( minComparable, nonNullComparable1 ) );
        assertSame( minComparable, ObjectUtils.min( null, nonNullComparable1, null, minComparable ) );

        assertNull( ObjectUtils.min((String)null, (String)null) );
    }

    /**
     * Tests {@link ObjectUtils#compare(Comparable, Comparable, boolean)}.
     */
    @Test
    public void ObjectUtils() {
        final Integer one = Integer.valueOf(1);
        final Integer two = Integer.valueOf(2);
        final Integer nullValue = null;

        assertEquals("Null Null false", 0, ObjectUtils.compare(nullValue, nullValue));
        assertEquals("Null Null true",  0, ObjectUtils.compare(nullValue, nullValue, true));

        assertEquals("Null one false", -1, ObjectUtils.compare(nullValue, one));
        assertEquals("Null one true",   1, ObjectUtils.compare(nullValue, one, true));
        
        assertEquals("one Null false", 1, ObjectUtils.compare(one, nullValue));
        assertEquals("one Null true", -1, ObjectUtils.compare(one, nullValue, true));

        assertEquals("one two false", -1, ObjectUtils.compare(one, two));
        assertEquals("one two true",  -1, ObjectUtils.compare(one, two, true));
    }

    @Test
    public void ObjectUtils() {
        assertEquals("foo", ObjectUtils.median("foo"));
        assertEquals("bar", ObjectUtils.median("foo", "bar"));
        assertEquals("baz", ObjectUtils.median("foo", "bar", "baz"));
        assertEquals("baz", ObjectUtils.median("foo", "bar", "baz", "blah"));
        assertEquals("blah", ObjectUtils.median("foo", "bar", "baz", "blah", "wah"));
        assertEquals(Integer.valueOf(5),
            ObjectUtils.median(Integer.valueOf(1), Integer.valueOf(5), Integer.valueOf(10)));
        assertEquals(
            Integer.valueOf(7),
            ObjectUtils.median(Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(7), Integer.valueOf(8),
                Integer.valueOf(9)));
        assertEquals(Integer.valueOf(6),
            ObjectUtils.median(Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(7), Integer.valueOf(8)));
    }

    @Test(expected = NullPointerException.class)
    public void ObjectUtils() {
        ObjectUtils.median((String[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ObjectUtils() {
        ObjectUtils.<String> median();
    }

    @Test
    public void ObjectUtils() {
        final CharSequenceComparator cmp = new CharSequenceComparator();
        final NonComparableCharSequence foo = new NonComparableCharSequence("foo");
        final NonComparableCharSequence bar = new NonComparableCharSequence("bar");
        final NonComparableCharSequence baz = new NonComparableCharSequence("baz");
        final NonComparableCharSequence blah = new NonComparableCharSequence("blah");
        final NonComparableCharSequence wah = new NonComparableCharSequence("wah");
        assertSame(foo, ObjectUtils.median(cmp, foo));
        assertSame(bar, ObjectUtils.median(cmp, foo, bar));
        assertSame(baz, ObjectUtils.median(cmp, foo, bar, baz));
        assertSame(baz, ObjectUtils.median(cmp, foo, bar, baz, blah));
        assertSame(blah, ObjectUtils.median(cmp, foo, bar, baz, blah, wah));
    }

    @Test(expected = NullPointerException.class)
    public void ObjectUtils() {
        ObjectUtils.median((Comparator<CharSequence>) null, new NonComparableCharSequence("foo"));
    }

    @Test(expected = NullPointerException.class)
    public void ObjectUtils() {
        ObjectUtils.median(new CharSequenceComparator(), (CharSequence[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ObjectUtils() {
        ObjectUtils.median(new CharSequenceComparator());
    }

    @SuppressWarnings("unchecked")
    @Test
    public void ObjectUtils() {
        assertNull(ObjectUtils.mode((Object[]) null));
        assertNull(ObjectUtils.mode());
        assertNull(ObjectUtils.mode("foo", "bar", "baz"));
        assertNull(ObjectUtils.mode("foo", "bar", "baz", "foo", "bar"));
        assertEquals("foo", ObjectUtils.mode("foo", "bar", "baz", "foo"));
        assertEquals(Integer.valueOf(9),
            ObjectUtils.mode("foo", "bar", "baz", Integer.valueOf(9), Integer.valueOf(10), Integer.valueOf(9)));
    }

    /**
     * Tests {@link ObjectUtils#clone(Object)} with a cloneable object.
     */
    @Test
    public void ObjectUtils() {
        final CloneableString string = new CloneableString("apache");
        final CloneableString stringClone = ObjectUtils.clone(string);
        assertEquals("apache", stringClone.getValue());
    }

    /**
     * Tests {@link ObjectUtils#clone(Object)} with a not cloneable object.
     */
    @Test
    public void ObjectUtils() {
        final String string = new String("apache");
        assertNull(ObjectUtils.clone(string));
    }

    /**
     * Tests {@link ObjectUtils#clone(Object)} with an uncloneable object.
     */
    @Test(expected = NoSuchMethodException.class)
    public void ObjectUtils() throws Throwable {
        final UncloneableString string = new UncloneableString("apache");
        try {
            ObjectUtils.clone(string);
            fail("Thrown " + CloneFailedException.class.getName() + " expected");
        } catch (final CloneFailedException e) {
            throw e.getCause();
        }
    }

    /**
     * Tests {@link ObjectUtils#clone(Object)} with an object array.
     */
    @Test
    public void ObjectUtils() {
        assertTrue(Arrays.deepEquals(
            new String[]{"string"}, ObjectUtils.clone(new String[]{"string"})));
    }

    /**
     * Tests {@link ObjectUtils#clone(Object)} with an array of primitives.
     */
    @Test
    public void ObjectUtils() {
        assertTrue(Arrays.equals(new int[]{1}, ObjectUtils.clone(new int[]{1})));
    }

    /**
     * Tests {@link ObjectUtils#cloneIfPossible(Object)} with a cloneable object.
     */
    @Test
    public void ObjectUtils() {
        final CloneableString string = new CloneableString("apache");
        final CloneableString stringClone = ObjectUtils.cloneIfPossible(string);
        assertEquals("apache", stringClone.getValue());
    }

    /**
     * Tests {@link ObjectUtils#cloneIfPossible(Object)} with a not cloneable object.
     */
    @Test
    public void ObjectUtils() {
        final String string = new String("apache");
        assertSame(string, ObjectUtils.cloneIfPossible(string));
    }

    /**
     * Tests {@link ObjectUtils#cloneIfPossible(Object)} with an uncloneable object.
     */
    @Test(expected = NoSuchMethodException.class)
    public void ObjectUtils() throws Throwable {
        final UncloneableString string = new UncloneableString("apache");
        try {
            ObjectUtils.cloneIfPossible(string);
            fail("Thrown " + CloneFailedException.class.getName() + " expected");
        } catch (final CloneFailedException e) {
            throw e.getCause();
        }
    }

    @Test
    public void ObjectUtils() {

        // To truly test the CONST() method, we'd want to look in the
        // bytecode to see if the literals were folded into the
        // class, or if the bytecode kept the method call.

        assertTrue("CONST(boolean)", ObjectUtils.CONST(true));
        assertEquals("CONST(byte)", (byte) 3, ObjectUtils.CONST((byte) 3));
        assertEquals("CONST(char)", (char) 3, ObjectUtils.CONST((char) 3));
        assertEquals("CONST(short)", (short) 3, ObjectUtils.CONST((short) 3));
        assertEquals("CONST(int)", 3, ObjectUtils.CONST(3));
        assertEquals("CONST(long)", 3l, ObjectUtils.CONST(3l));
        assertEquals("CONST(float)", 3f, ObjectUtils.CONST(3f), 0);
        assertEquals("CONST(double)", 3.0, ObjectUtils.CONST(3.0), 0);
        assertEquals("CONST(Object)", "abc", ObjectUtils.CONST("abc"));

        // Make sure documentation examples from Javadoc all work
        // (this fixed a lot of my bugs when I these!)
        //
        // My bugs should be in a software engineering textbook
        // for "Can you screw this up?"  The answer is, yes,
        // you can even screw this up.  (When you == Julius)
        // .
        final boolean MAGIC_FLAG = ObjectUtils.CONST(true);
        final byte MAGIC_BYTE1 = ObjectUtils.CONST((byte) 127);
        final byte MAGIC_BYTE2 = ObjectUtils.CONST_BYTE(127);
        final char MAGIC_CHAR = ObjectUtils.CONST('a');
        final short MAGIC_SHORT1 = ObjectUtils.CONST((short) 123);
        final short MAGIC_SHORT2 = ObjectUtils.CONST_SHORT(127);
        final int MAGIC_INT = ObjectUtils.CONST(123);
        final long MAGIC_LONG1 = ObjectUtils.CONST(123L);
        final long MAGIC_LONG2 = ObjectUtils.CONST(3);
        final float MAGIC_FLOAT = ObjectUtils.CONST(1.0f);
        final double MAGIC_DOUBLE = ObjectUtils.CONST(1.0);
        final String MAGIC_STRING = ObjectUtils.CONST("abc");

        assertTrue(MAGIC_FLAG);
        assertEquals(127, MAGIC_BYTE1);
        assertEquals(127, MAGIC_BYTE2);
        assertEquals('a', MAGIC_CHAR);
        assertEquals(123, MAGIC_SHORT1);
        assertEquals(127, MAGIC_SHORT2);
        assertEquals(123, MAGIC_INT);
        assertEquals(123, MAGIC_LONG1);
        assertEquals(3, MAGIC_LONG2);
        assertEquals(1.0f, MAGIC_FLOAT, 0.0f);
        assertEquals(1.0, MAGIC_DOUBLE, 0.0);
        assertEquals("abc", MAGIC_STRING);

        try {
            ObjectUtils.CONST_BYTE(-129);
            fail("CONST_BYTE(-129): IllegalArgumentException should have been thrown.");
        } catch (final IllegalArgumentException iae) {

        }
        try {
            ObjectUtils.CONST_BYTE(128);
            fail("CONST_BYTE(128): IllegalArgumentException should have been thrown.");
        } catch (final IllegalArgumentException iae) {

        }
        try {
            ObjectUtils.CONST_SHORT(-32769);
            fail("CONST_SHORT(-32769): IllegalArgumentException should have been thrown.");
        } catch (final IllegalArgumentException iae) {

        }
        try {
            ObjectUtils.CONST_BYTE(32768);
            fail("CONST_SHORT(32768): IllegalArgumentException should have been thrown.");
        } catch (final IllegalArgumentException iae) {

        }

    }
}
