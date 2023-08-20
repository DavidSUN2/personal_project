
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

    @Test
    public void Range() {
        assertFalse(intRange.isStartedBy(null));
        
        assertFalse(intRange.isStartedBy(5));
        assertTrue(intRange.isStartedBy(10));
        assertFalse(intRange.isStartedBy(15));
        assertFalse(intRange.isStartedBy(20));
        assertFalse(intRange.isStartedBy(25));
    }

    @Test
    public void Range() {
        assertFalse(intRange.isEndedBy(null));
        
        assertFalse(intRange.isEndedBy(5));
        assertFalse(intRange.isEndedBy(10));
        assertFalse(intRange.isEndedBy(15));
        assertTrue(intRange.isEndedBy(20));
        assertFalse(intRange.isEndedBy(25));
    }

    @Test
    public void Range() {
        assertFalse(intRange.isBefore(null));
        
        assertFalse(intRange.isBefore(5));
        assertFalse(intRange.isBefore(10));
        assertFalse(intRange.isBefore(15));
        assertFalse(intRange.isBefore(20));
        assertTrue(intRange.isBefore(25));
    }

    @Test
    public void Range() {
        try {
            intRange.elementCompareTo(null);
            fail("NullPointerException should have been thrown");
        } catch(final NullPointerException npe) {
            // expected
        }
        
        assertEquals(-1, intRange.elementCompareTo(5));
        assertEquals(0, intRange.elementCompareTo(10));
        assertEquals(0, intRange.elementCompareTo(15));
        assertEquals(0, intRange.elementCompareTo(20));
        assertEquals(1, intRange.elementCompareTo(25));
    }

    //-----------------------------------------------------------------------
    @Test
    public void Range() {

        // null handling
        assertFalse(intRange.containsRange(null));

        // easy inside range
        assertTrue(intRange.containsRange(Range.between(12, 18)));

        // outside range on each side
        assertFalse(intRange.containsRange(Range.between(32, 45)));
        assertFalse(intRange.containsRange(Range.between(2, 8)));

        // equals range
        assertTrue(intRange.containsRange(Range.between(10, 20)));

        // overlaps
        assertFalse(intRange.containsRange(Range.between(9, 14)));
        assertFalse(intRange.containsRange(Range.between(16, 21)));

        // touches lower boundary
        assertTrue(intRange.containsRange(Range.between(10, 19)));
        assertFalse(intRange.containsRange(Range.between(10, 21)));

        // touches upper boundary
        assertTrue(intRange.containsRange(Range.between(11, 20)));
        assertFalse(intRange.containsRange(Range.between(9, 20)));
        
        // negative
        assertFalse(intRange.containsRange(Range.between(-11, -18)));
    }

    @Test
    public void Range() {
        assertFalse(intRange.isAfterRange(null));
        
        assertTrue(intRange.isAfterRange(Range.between(5, 9)));
        
        assertFalse(intRange.isAfterRange(Range.between(5, 10)));
        assertFalse(intRange.isAfterRange(Range.between(5, 20)));
        assertFalse(intRange.isAfterRange(Range.between(5, 25)));
        assertFalse(intRange.isAfterRange(Range.between(15, 25)));
        
        assertFalse(intRange.isAfterRange(Range.between(21, 25)));
        
        assertFalse(intRange.isAfterRange(Range.between(10, 20)));
    }

    @Test
    public void Range() {

        // null handling
        assertFalse(intRange.isOverlappedBy(null));

        // easy inside range
        assertTrue(intRange.isOverlappedBy(Range.between(12, 18)));

        // outside range on each side
        assertFalse(intRange.isOverlappedBy(Range.between(32, 45)));
        assertFalse(intRange.isOverlappedBy(Range.between(2, 8)));

        // equals range
        assertTrue(intRange.isOverlappedBy(Range.between(10, 20)));

        // overlaps
        assertTrue(intRange.isOverlappedBy(Range.between(9, 14)));
        assertTrue(intRange.isOverlappedBy(Range.between(16, 21)));

        // touches lower boundary
        assertTrue(intRange.isOverlappedBy(Range.between(10, 19)));
        assertTrue(intRange.isOverlappedBy(Range.between(10, 21)));

        // touches upper boundary
        assertTrue(intRange.isOverlappedBy(Range.between(11, 20)));
        assertTrue(intRange.isOverlappedBy(Range.between(9, 20)));
        
        // negative
        assertFalse(intRange.isOverlappedBy(Range.between(-11, -18)));
    }

    @Test
    public void Range() {
        assertFalse(intRange.isBeforeRange(null));
        
        assertFalse(intRange.isBeforeRange(Range.between(5, 9)));
        
        assertFalse(intRange.isBeforeRange(Range.between(5, 10)));
        assertFalse(intRange.isBeforeRange(Range.between(5, 20)));
        assertFalse(intRange.isBeforeRange(Range.between(5, 25)));
        assertFalse(intRange.isBeforeRange(Range.between(15, 25)));
        
        assertTrue(intRange.isBeforeRange(Range.between(21, 25)));
        
        assertFalse(intRange.isBeforeRange(Range.between(10, 20)));
    }

    @Test
    public void Range() {
        assertSame(intRange, intRange.intersectionWith(intRange));
        assertSame(byteRange, byteRange.intersectionWith(byteRange));
        assertSame(longRange, longRange.intersectionWith(longRange));
        assertSame(floatRange, floatRange.intersectionWith(floatRange));
        assertSame(doubleRange, doubleRange.intersectionWith(doubleRange));

        assertEquals(Range.between(10, 15), intRange.intersectionWith(Range.between(5, 15)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void Range() {
        intRange.intersectionWith(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void Range() {
        intRange.intersectionWith(Range.between(0, 9));
    }

    //-----------------------------------------------------------------------
    @Test
    public void Range() {
        SerializationUtils.clone(intRange);
    }
}
