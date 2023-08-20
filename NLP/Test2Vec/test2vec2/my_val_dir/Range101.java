
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
import static org.junit.Assert.fail;

import java.util.Comparator;

import org.junit.Before;
import org.junit.Test;

/**
 * <p>
 * Tests the methods in the {@link org.apache.commons.lang3.Range} class.
 * </p>
 * 
 * @version $Id$
 */
@SuppressWarnings("boxing")
public class RangeTest {

    private Range<Byte> byteRange;
    private Range<Byte> byteRange2;
    private Range<Byte> byteRange3;

    private Range<Integer> intRange;
    private Range<Long> longRange;
    private Range<Float> floatRange;
    private Range<Double> doubleRange;

    @SuppressWarnings("cast") // intRange
    @Before
    public void setUp() {
        byteRange   = Range.between((byte) 0, (byte) 5);
        byteRange2  = Range.between((byte) 0, (byte) 5);
        byteRange3  = Range.between((byte) 0, (byte) 10);

        intRange    = Range.between((int) 10, (int) 20);
        longRange   = Range.between((long) 10, (long) 20);
        floatRange  = Range.between((float) 10, (float) 20);
        doubleRange = Range.between((double) 10, (double) 20);
    }

    //-----------------------------------------------------------------------
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Test
    public void Range() {
        final Comparable c = 
            new Comparable() { 
                @Override
                public int compareTo(final Object other) {
                    return 1;
                }
            };
        final Range r1 = Range.is(c);
        final Range r2 = Range.between(c, c);
        assertEquals(true, r1.isNaturalOrdering());
        assertEquals(true, r2.isNaturalOrdering());
    }

    @Test
    public void Range(){
        final Comparator<Integer> c = new Comparator<Integer>(){
            @Override
            public int compare(final Integer o1, final Integer o2) {
                return 0; // all integers are equal
            }
        };
        Range<Integer> ri = Range.is(10);
        assertFalse("should not contain null",ri.contains(null));
        assertTrue("should contain 10",ri.contains(10));
        assertFalse("should not contain 11",ri.contains(11));
        ri = Range.is(10,c);
        assertFalse("should not contain null",ri.contains(null));
        assertTrue("should contain 10",ri.contains(10));
        assertTrue("should contain 11",ri.contains(11));
    }

    @Test
    public void Range(){
        // TODO add tests with a better comparator
        final Comparator<Integer> c = new Comparator<Integer>(){
            @Override
            public int compare(final Integer o1, final Integer o2) {
                return 0; // all integers are equal
            }
        };
        Range<Integer> rb = Range.between(-10,20);
        assertFalse("should not contain null",rb.contains(null));
        assertTrue("should contain 10",rb.contains(10));
        assertTrue("should contain -10",rb.contains(-10));
        assertFalse("should not contain 21",rb.contains(21));
        assertFalse("should not contain -11",rb.contains(-11));
        rb = Range.between(-10,20,c);
        assertFalse("should not contain null",rb.contains(null));
        assertTrue("should contain 10",rb.contains(10));
        assertTrue("should contain -10",rb.contains(-10));
        assertTrue("should contain 21",rb.contains(21));
        assertTrue("should contain -11",rb.contains(-11));
    }

    //-----------------------------------------------------------------------
    @Test
    public void Range() {
        final Range<Character> chars = Range.between('a', 'z');
        assertTrue(chars.contains('b'));
        assertFalse(chars.contains('B'));
    }

    //-----------------------------------------------------------------------
    @Test
    public void Range() {
        assertEquals(byteRange, byteRange);
        assertEquals(byteRange, byteRange2);
        assertEquals(byteRange2, byteRange2);
        assertTrue(byteRange.equals(byteRange));
        assertTrue(byteRange2.equals(byteRange2));
        assertTrue(byteRange3.equals(byteRange3));
        assertFalse(byteRange2.equals(byteRange3));
        assertFalse(byteRange2.equals(null));
        assertFalse(byteRange2.equals("Ni!"));
    }

    @Test
    public void Range() {
        assertEquals(byteRange.hashCode(), byteRange2.hashCode());
        assertFalse(byteRange.hashCode() == byteRange3.hashCode());
        
        assertEquals(intRange.hashCode(), intRange.hashCode());
        assertTrue(intRange.hashCode() != 0);
    }

    @Test
    public void Range() {
        assertNotNull(byteRange.toString());
        
        final String str = intRange.toString();
        assertEquals("[10..20]", str);
        assertEquals("[-20..-10]", Range.between(-20, -10).toString());
    }

    @Test
    public void Range() {
        final String str = intRange.toString("From %1$s to %2$s");
        assertEquals("From 10 to 20", str);
    }

    //-----------------------------------------------------------------------
    @Test
    public void Range() {
        assertEquals(10, (int) intRange.getMinimum());
        assertEquals(10L, (long) longRange.getMinimum());
        assertEquals(10f, floatRange.getMinimum(), 0.00001f);
        assertEquals(10d, doubleRange.getMinimum(), 0.00001d);
    }

    @Test
    public void Range() {
        assertEquals(20, (int) intRange.getMaximum());
        assertEquals(20L, (long) longRange.getMaximum());
        assertEquals(20f, floatRange.getMaximum(), 0.00001f);
        assertEquals(20d, doubleRange.getMaximum(), 0.00001d);
    }

    @Test
    public void Range() {
        assertFalse(intRange.contains(null));
        
        assertFalse(intRange.contains(5));
        assertTrue(intRange.contains(10));
        assertTrue(intRange.contains(15));
        assertTrue(intRange.contains(20));
        assertFalse(intRange.contains(25));
    }

    @Test
    public void Range() {
        assertFalse(intRange.isAfter(null));
        
        assertTrue(intRange.isAfter(5));
        assertFalse(intRange.isAfter(10));
        assertFalse(intRange.isAfter(15));
        assertFalse(intRange.isAfter(20));
        assertFalse(intRange.isAfter(25));
    }



}
