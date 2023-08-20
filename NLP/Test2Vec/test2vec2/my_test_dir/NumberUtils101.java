
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
package org.apache.commons.lang3.math;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.math.NumberUtils}.
 *
 * @version $Id$
 */
public class NumberUtilsTest {
    @Test
    public void NumberUtils() {        // trigger test
        assertEquals(Integer.valueOf(0x8000),      NumberUtils.createNumber("0x8000"));
        assertEquals(Integer.valueOf(0x80000),     NumberUtils.createNumber("0x80000"));
        assertEquals(Integer.valueOf(0x800000),    NumberUtils.createNumber("0x800000"));
        assertEquals(Integer.valueOf(0x8000000),   NumberUtils.createNumber("0x8000000"));
        assertEquals(Integer.valueOf(0x7FFFFFFF),  NumberUtils.createNumber("0x7FFFFFFF"));
        assertEquals(Long.valueOf(0x80000000L),    NumberUtils.createNumber("0x80000000"));
        assertEquals(Long.valueOf(0xFFFFFFFFL),    NumberUtils.createNumber("0xFFFFFFFF"));

        // Leading zero tests
        assertEquals(Integer.valueOf(0x8000000),   NumberUtils.createNumber("0x08000000"));
        assertEquals(Integer.valueOf(0x7FFFFFFF),  NumberUtils.createNumber("0x007FFFFFFF"));
        assertEquals(Long.valueOf(0x80000000L),    NumberUtils.createNumber("0x080000000"));
        assertEquals(Long.valueOf(0xFFFFFFFFL),    NumberUtils.createNumber("0x00FFFFFFFF"));

        assertEquals(Long.valueOf(0x800000000L),        NumberUtils.createNumber("0x800000000"));
        assertEquals(Long.valueOf(0x8000000000L),       NumberUtils.createNumber("0x8000000000"));
        assertEquals(Long.valueOf(0x80000000000L),      NumberUtils.createNumber("0x80000000000"));
        assertEquals(Long.valueOf(0x800000000000L),     NumberUtils.createNumber("0x800000000000"));
        assertEquals(Long.valueOf(0x8000000000000L),    NumberUtils.createNumber("0x8000000000000"));
        assertEquals(Long.valueOf(0x80000000000000L),   NumberUtils.createNumber("0x80000000000000"));
        assertEquals(Long.valueOf(0x800000000000000L),  NumberUtils.createNumber("0x800000000000000"));
        assertEquals(Long.valueOf(0x7FFFFFFFFFFFFFFFL), NumberUtils.createNumber("0x7FFFFFFFFFFFFFFF"));
        // N.B. Cannot use a hex constant such as 0x8000000000000000L here as that is interpreted as a negative long
        assertEquals(new BigInteger("8000000000000000", 16), NumberUtils.createNumber("0x8000000000000000"));
        assertEquals(new BigInteger("FFFFFFFFFFFFFFFF", 16), NumberUtils.createNumber("0xFFFFFFFFFFFFFFFF"));

        // Leading zero tests
        assertEquals(Long.valueOf(0x80000000000000L),   NumberUtils.createNumber("0x00080000000000000"));
        assertEquals(Long.valueOf(0x800000000000000L),  NumberUtils.createNumber("0x0800000000000000"));
        assertEquals(Long.valueOf(0x7FFFFFFFFFFFFFFFL), NumberUtils.createNumber("0x07FFFFFFFFFFFFFFF"));
        // N.B. Cannot use a hex constant such as 0x8000000000000000L here as that is interpreted as a negative long
        assertEquals(new BigInteger("8000000000000000", 16), NumberUtils.createNumber("0x00008000000000000000"));
        assertEquals(new BigInteger("FFFFFFFFFFFFFFFF", 16), NumberUtils.createNumber("0x0FFFFFFFFFFFFFFFF"));
    }


    @Test(expected = IllegalArgumentException.class)
    public void NumberUtils() {
        NumberUtils.max((int[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void NumberUtils() {
        NumberUtils.max(new int[0]);
    }

    @Test
    public void NumberUtils() {
        assertEquals(
            "max(int[]) failed for array length 1",
            5,
            NumberUtils.max(new int[] { 5 }));

        assertEquals(
            "max(int[]) failed for array length 2",
            9,
            NumberUtils.max(new int[] { 6, 9 }));

        assertEquals(
            "max(int[]) failed for array length 5",
            10,
            NumberUtils.max(new int[] { -10, -5, 0, 5, 10 }));
        assertEquals(10, NumberUtils.max(new int[] { -10, -5, 0, 5, 10 }));
        assertEquals(10, NumberUtils.max(new int[] { -5, 0, 10, 5, -10 }));
    }

    @Test(expected = IllegalArgumentException.class)
    public void NumberUtils() {
        NumberUtils.max((short[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void NumberUtils() {
        NumberUtils.max(new short[0]);
    }

    @Test
    public void NumberUtils() {
        assertEquals(
            "max(short[]) failed for array length 1",
            5,
            NumberUtils.max(new short[] { 5 }));

        assertEquals(
            "max(short[]) failed for array length 2",
            9,
            NumberUtils.max(new short[] { 6, 9 }));

        assertEquals(
            "max(short[]) failed for array length 5",
            10,
            NumberUtils.max(new short[] { -10, -5, 0, 5, 10 }));
        assertEquals(10, NumberUtils.max(new short[] { -10, -5, 0, 5, 10 }));
        assertEquals(10, NumberUtils.max(new short[] { -5, 0, 10, 5, -10 }));
    }

    @Test(expected = IllegalArgumentException.class)
    public void NumberUtils() {
        NumberUtils.max((byte[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void NumberUtils() {
        NumberUtils.max(new byte[0]);
    }

    @Test
    public void NumberUtils() {
        assertEquals(
            "max(byte[]) failed for array length 1",
            5,
            NumberUtils.max(new byte[] { 5 }));

        assertEquals(
            "max(byte[]) failed for array length 2",
            9,
            NumberUtils.max(new byte[] { 6, 9 }));

        assertEquals(
            "max(byte[]) failed for array length 5",
            10,
            NumberUtils.max(new byte[] { -10, -5, 0, 5, 10 }));
        assertEquals(10, NumberUtils.max(new byte[] { -10, -5, 0, 5, 10 }));
        assertEquals(10, NumberUtils.max(new byte[] { -5, 0, 10, 5, -10 }));
    }

    @Test(expected = IllegalArgumentException.class)
    public void NumberUtils() {
        NumberUtils.max((double[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void NumberUtils() {
        NumberUtils.max(new double[0]);
    }

    @Test
    public void NumberUtils() {
        final double[] d = null;
        try {
            NumberUtils.max(d);
            fail("No exception was thrown for null input.");
        } catch (final IllegalArgumentException ex) {}

        try {
            NumberUtils.max(new double[0]);
            fail("No exception was thrown for empty input.");
        } catch (final IllegalArgumentException ex) {}

        assertEquals(
            "max(double[]) failed for array length 1",
            5.1f,
            NumberUtils.max(new double[] { 5.1f }),
            0);

        assertEquals(
            "max(double[]) failed for array length 2",
            9.2f,
            NumberUtils.max(new double[] { 6.3f, 9.2f }),
            0);

        assertEquals(
            "max(double[]) failed for float length 5",
            10.4f,
            NumberUtils.max(new double[] { -10.5f, -5.6f, 0, 5.7f, 10.4f }),
            0);
        assertEquals(10, NumberUtils.max(new double[] { -10, -5, 0, 5, 10 }), 0.0001);
        assertEquals(10, NumberUtils.max(new double[] { -5, 0, 10, 5, -10 }), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void NumberUtils() {
        NumberUtils.max((float[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void NumberUtils() {
        NumberUtils.max(new float[0]);
    }

    @Test
    public void NumberUtils() {
        assertEquals(
            "max(float[]) failed for array length 1",
            5.1f,
            NumberUtils.max(new float[] { 5.1f }),
            0);

        assertEquals(
            "max(float[]) failed for array length 2",
            9.2f,
            NumberUtils.max(new float[] { 6.3f, 9.2f }),
            0);

        assertEquals(
            "max(float[]) failed for float length 5",
            10.4f,
            NumberUtils.max(new float[] { -10.5f, -5.6f, 0, 5.7f, 10.4f }),
            0);
        assertEquals(10, NumberUtils.max(new float[] { -10, -5, 0, 5, 10 }), 0.0001f);
        assertEquals(10, NumberUtils.max(new float[] { -5, 0, 10, 5, -10 }), 0.0001f);
    }

    @Test
    public void NumberUtils() {
        assertEquals("minimum(long,long,long) 1 failed", 12345L, NumberUtils.min(12345L, 12345L + 1L, 12345L + 2L));
        assertEquals("minimum(long,long,long) 2 failed", 12345L, NumberUtils.min(12345L + 1L, 12345L, 12345 + 2L));
        assertEquals("minimum(long,long,long) 3 failed", 12345L, NumberUtils.min(12345L + 1L, 12345L + 2L, 12345L));
        assertEquals("minimum(long,long,long) 4 failed", 12345L, NumberUtils.min(12345L + 1L, 12345L, 12345L));
        assertEquals("minimum(long,long,long) 5 failed", 12345L, NumberUtils.min(12345L, 12345L, 12345L));
    }

    @Test
    public void NumberUtils() {
        assertEquals("minimum(int,int,int) 1 failed", 12345, NumberUtils.min(12345, 12345 + 1, 12345 + 2));
        assertEquals("minimum(int,int,int) 2 failed", 12345, NumberUtils.min(12345 + 1, 12345, 12345 + 2));
        assertEquals("minimum(int,int,int) 3 failed", 12345, NumberUtils.min(12345 + 1, 12345 + 2, 12345));
        assertEquals("minimum(int,int,int) 4 failed", 12345, NumberUtils.min(12345 + 1, 12345, 12345));
        assertEquals("minimum(int,int,int) 5 failed", 12345, NumberUtils.min(12345, 12345, 12345));
    }

    @Test
    public void NumberUtils() {
        final short low = 1234;
        final short mid = 1234 + 1;
        final short high = 1234 + 2;
        assertEquals("minimum(short,short,short) 1 failed", low, NumberUtils.min(low, mid, high));
        assertEquals("minimum(short,short,short) 1 failed", low, NumberUtils.min(mid, low, high));
        assertEquals("minimum(short,short,short) 1 failed", low, NumberUtils.min(mid, high, low));
        assertEquals("minimum(short,short,short) 1 failed", low, NumberUtils.min(low, mid, low));
    }

    @Test
    public void NumberUtils() {
        final byte low = 123;
        final byte mid = 123 + 1;
        final byte high = 123 + 2;
        assertEquals("minimum(byte,byte,byte) 1 failed", low, NumberUtils.min(low, mid, high));
        assertEquals("minimum(byte,byte,byte) 1 failed", low, NumberUtils.min(mid, low, high));
        assertEquals("minimum(byte,byte,byte) 1 failed", low, NumberUtils.min(mid, high, low));
        assertEquals("minimum(byte,byte,byte) 1 failed", low, NumberUtils.min(low, mid, low));
    }

    @Test
    public void NumberUtils() {
        final double low = 12.3;
        final double mid = 12.3 + 1;
        final double high = 12.3 + 2;
        assertEquals(low, NumberUtils.min(low, mid, high), 0.0001);
        assertEquals(low, NumberUtils.min(mid, low, high), 0.0001);
        assertEquals(low, NumberUtils.min(mid, high, low), 0.0001);
        assertEquals(low, NumberUtils.min(low, mid, low), 0.0001);
        assertEquals(mid, NumberUtils.min(high, mid, high), 0.0001);
    }

    @Test
    public void NumberUtils() {
        final float low = 12.3f;
        final float mid = 12.3f + 1;
        final float high = 12.3f + 2;
        assertEquals(low, NumberUtils.min(low, mid, high), 0.0001f);
        assertEquals(low, NumberUtils.min(mid, low, high), 0.0001f);
        assertEquals(low, NumberUtils.min(mid, high, low), 0.0001f);
        assertEquals(low, NumberUtils.min(low, mid, low), 0.0001f);
        assertEquals(mid, NumberUtils.min(high, mid, high), 0.0001f);
    }

    @Test
    public void NumberUtils() {
        assertEquals("maximum(long,long,long) 1 failed", 12345L, NumberUtils.max(12345L, 12345L - 1L, 12345L - 2L));
        assertEquals("maximum(long,long,long) 2 failed", 12345L, NumberUtils.max(12345L - 1L, 12345L, 12345L - 2L));
        assertEquals("maximum(long,long,long) 3 failed", 12345L, NumberUtils.max(12345L - 1L, 12345L - 2L, 12345L));
        assertEquals("maximum(long,long,long) 4 failed", 12345L, NumberUtils.max(12345L - 1L, 12345L, 12345L));
        assertEquals("maximum(long,long,long) 5 failed", 12345L, NumberUtils.max(12345L, 12345L, 12345L));
    }

    @Test
    public void NumberUtils() {
        assertEquals("maximum(int,int,int) 1 failed", 12345, NumberUtils.max(12345, 12345 - 1, 12345 - 2));
        assertEquals("maximum(int,int,int) 2 failed", 12345, NumberUtils.max(12345 - 1, 12345, 12345 - 2));
        assertEquals("maximum(int,int,int) 3 failed", 12345, NumberUtils.max(12345 - 1, 12345 - 2, 12345));
        assertEquals("maximum(int,int,int) 4 failed", 12345, NumberUtils.max(12345 - 1, 12345, 12345));
        assertEquals("maximum(int,int,int) 5 failed", 12345, NumberUtils.max(12345, 12345, 12345));
    }

    @Test
    public void NumberUtils() {
        final short low = 1234;
        final short mid = 1234 + 1;
        final short high = 1234 + 2;
        assertEquals("maximum(short,short,short) 1 failed", high, NumberUtils.max(low, mid, high));
        assertEquals("maximum(short,short,short) 1 failed", high, NumberUtils.max(mid, low, high));
        assertEquals("maximum(short,short,short) 1 failed", high, NumberUtils.max(mid, high, low));
        assertEquals("maximum(short,short,short) 1 failed", high, NumberUtils.max(high, mid, high));
    }

    @Test
    public void NumberUtils() {
        final byte low = 123;
        final byte mid = 123 + 1;
        final byte high = 123 + 2;
        assertEquals("maximum(byte,byte,byte) 1 failed", high, NumberUtils.max(low, mid, high));
        assertEquals("maximum(byte,byte,byte) 1 failed", high, NumberUtils.max(mid, low, high));
        assertEquals("maximum(byte,byte,byte) 1 failed", high, NumberUtils.max(mid, high, low));
        assertEquals("maximum(byte,byte,byte) 1 failed", high, NumberUtils.max(high, mid, high));
    }

    @Test
    public void NumberUtils() {
        final double low = 12.3;
        final double mid = 12.3 + 1;
        final double high = 12.3 + 2;
        assertEquals(high, NumberUtils.max(low, mid, high), 0.0001);
        assertEquals(high, NumberUtils.max(mid, low, high), 0.0001);
        assertEquals(high, NumberUtils.max(mid, high, low), 0.0001);
        assertEquals(mid, NumberUtils.max(low, mid, low), 0.0001);
        assertEquals(high, NumberUtils.max(high, mid, high), 0.0001);
    }

    @Test
    public void NumberUtils() {
        final float low = 12.3f;
        final float mid = 12.3f + 1;
        final float high = 12.3f + 2;
        assertEquals(high, NumberUtils.max(low, mid, high), 0.0001f);
        assertEquals(high, NumberUtils.max(mid, low, high), 0.0001f);
        assertEquals(high, NumberUtils.max(mid, high, low), 0.0001f);
        assertEquals(mid, NumberUtils.max(low, mid, low), 0.0001f);
        assertEquals(high, NumberUtils.max(high, mid, high), 0.0001f);
    }

    // Testing JDK against old Lang functionality
    @Test
    public void NumberUtils() {
        assertTrue(Double.compare(Double.NaN, Double.NaN) == 0);
        assertTrue(Double.compare(Double.NaN, Double.POSITIVE_INFINITY) == +1);
        assertTrue(Double.compare(Double.NaN, Double.MAX_VALUE) == +1);
        assertTrue(Double.compare(Double.NaN, 1.2d) == +1);
        assertTrue(Double.compare(Double.NaN, 0.0d) == +1);
        assertTrue(Double.compare(Double.NaN, -0.0d) == +1);
        assertTrue(Double.compare(Double.NaN, -1.2d) == +1);
        assertTrue(Double.compare(Double.NaN, -Double.MAX_VALUE) == +1);
        assertTrue(Double.compare(Double.NaN, Double.NEGATIVE_INFINITY) == +1);

        assertTrue(Double.compare(Double.POSITIVE_INFINITY, Double.NaN) == -1);
        assertTrue(Double.compare(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY) == 0);
        assertTrue(Double.compare(Double.POSITIVE_INFINITY, Double.MAX_VALUE) == +1);
        assertTrue(Double.compare(Double.POSITIVE_INFINITY, 1.2d) == +1);
        assertTrue(Double.compare(Double.POSITIVE_INFINITY, 0.0d) == +1);
        assertTrue(Double.compare(Double.POSITIVE_INFINITY, -0.0d) == +1);
        assertTrue(Double.compare(Double.POSITIVE_INFINITY, -1.2d) == +1);
        assertTrue(Double.compare(Double.POSITIVE_INFINITY, -Double.MAX_VALUE) == +1);
        assertTrue(Double.compare(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY) == +1);

        assertTrue(Double.compare(Double.MAX_VALUE, Double.NaN) == -1);
        assertTrue(Double.compare(Double.MAX_VALUE, Double.POSITIVE_INFINITY) == -1);
        assertTrue(Double.compare(Double.MAX_VALUE, Double.MAX_VALUE) == 0);
        assertTrue(Double.compare(Double.MAX_VALUE, 1.2d) == +1);
        assertTrue(Double.compare(Double.MAX_VALUE, 0.0d) == +1);
        assertTrue(Double.compare(Double.MAX_VALUE, -0.0d) == +1);
        assertTrue(Double.compare(Double.MAX_VALUE, -1.2d) == +1);
        assertTrue(Double.compare(Double.MAX_VALUE, -Double.MAX_VALUE) == +1);
        assertTrue(Double.compare(Double.MAX_VALUE, Double.NEGATIVE_INFINITY) == +1);

        assertTrue(Double.compare(1.2d, Double.NaN) == -1);
        assertTrue(Double.compare(1.2d, Double.POSITIVE_INFINITY) == -1);
        assertTrue(Double.compare(1.2d, Double.MAX_VALUE) == -1);
        assertTrue(Double.compare(1.2d, 1.2d) == 0);
        assertTrue(Double.compare(1.2d, 0.0d) == +1);
        assertTrue(Double.compare(1.2d, -0.0d) == +1);
        assertTrue(Double.compare(1.2d, -1.2d) == +1);
        assertTrue(Double.compare(1.2d, -Double.MAX_VALUE) == +1);
        assertTrue(Double.compare(1.2d, Double.NEGATIVE_INFINITY) == +1);

        assertTrue(Double.compare(0.0d, Double.NaN) == -1);
        assertTrue(Double.compare(0.0d, Double.POSITIVE_INFINITY) == -1);
        assertTrue(Double.compare(0.0d, Double.MAX_VALUE) == -1);
        assertTrue(Double.compare(0.0d, 1.2d) == -1);
        assertTrue(Double.compare(0.0d, 0.0d) == 0);
        assertTrue(Double.compare(0.0d, -0.0d) == +1);
        assertTrue(Double.compare(0.0d, -1.2d) == +1);
        assertTrue(Double.compare(0.0d, -Double.MAX_VALUE) == +1);
        assertTrue(Double.compare(0.0d, Double.NEGATIVE_INFINITY) == +1);

        assertTrue(Double.compare(-0.0d, Double.NaN) == -1);
        assertTrue(Double.compare(-0.0d, Double.POSITIVE_INFINITY) == -1);
        assertTrue(Double.compare(-0.0d, Double.MAX_VALUE) == -1);
        assertTrue(Double.compare(-0.0d, 1.2d) == -1);
        assertTrue(Double.compare(-0.0d, 0.0d) == -1);
        assertTrue(Double.compare(-0.0d, -0.0d) == 0);
        assertTrue(Double.compare(-0.0d, -1.2d) == +1);
        assertTrue(Double.compare(-0.0d, -Double.MAX_VALUE) == +1);
        assertTrue(Double.compare(-0.0d, Double.NEGATIVE_INFINITY) == +1);

        assertTrue(Double.compare(-1.2d, Double.NaN) == -1);
        assertTrue(Double.compare(-1.2d, Double.POSITIVE_INFINITY) == -1);
        assertTrue(Double.compare(-1.2d, Double.MAX_VALUE) == -1);
        assertTrue(Double.compare(-1.2d, 1.2d) == -1);
        assertTrue(Double.compare(-1.2d, 0.0d) == -1);
        assertTrue(Double.compare(-1.2d, -0.0d) == -1);
        assertTrue(Double.compare(-1.2d, -1.2d) == 0);
        assertTrue(Double.compare(-1.2d, -Double.MAX_VALUE) == +1);
        assertTrue(Double.compare(-1.2d, Double.NEGATIVE_INFINITY) == +1);

        assertTrue(Double.compare(-Double.MAX_VALUE, Double.NaN) == -1);
        assertTrue(Double.compare(-Double.MAX_VALUE, Double.POSITIVE_INFINITY) == -1);
        assertTrue(Double.compare(-Double.MAX_VALUE, Double.MAX_VALUE) == -1);
        assertTrue(Double.compare(-Double.MAX_VALUE, 1.2d) == -1);
        assertTrue(Double.compare(-Double.MAX_VALUE, 0.0d) == -1);
        assertTrue(Double.compare(-Double.MAX_VALUE, -0.0d) == -1);
        assertTrue(Double.compare(-Double.MAX_VALUE, -1.2d) == -1);
        assertTrue(Double.compare(-Double.MAX_VALUE, -Double.MAX_VALUE) == 0);
        assertTrue(Double.compare(-Double.MAX_VALUE, Double.NEGATIVE_INFINITY) == +1);

        assertTrue(Double.compare(Double.NEGATIVE_INFINITY, Double.NaN) == -1);
        assertTrue(Double.compare(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY) == -1);
        assertTrue(Double.compare(Double.NEGATIVE_INFINITY, Double.MAX_VALUE) == -1);
        assertTrue(Double.compare(Double.NEGATIVE_INFINITY, 1.2d) == -1);
        assertTrue(Double.compare(Double.NEGATIVE_INFINITY, 0.0d) == -1);
        assertTrue(Double.compare(Double.NEGATIVE_INFINITY, -0.0d) == -1);
        assertTrue(Double.compare(Double.NEGATIVE_INFINITY, -1.2d) == -1);
        assertTrue(Double.compare(Double.NEGATIVE_INFINITY, -Double.MAX_VALUE) == -1);
        assertTrue(Double.compare(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY) == 0);
    }

    @Test
    public void NumberUtils() {
        assertTrue(Float.compare(Float.NaN, Float.NaN) == 0);
        assertTrue(Float.compare(Float.NaN, Float.POSITIVE_INFINITY) == +1);
        assertTrue(Float.compare(Float.NaN, Float.MAX_VALUE) == +1);
        assertTrue(Float.compare(Float.NaN, 1.2f) == +1);
        assertTrue(Float.compare(Float.NaN, 0.0f) == +1);
        assertTrue(Float.compare(Float.NaN, -0.0f) == +1);
        assertTrue(Float.compare(Float.NaN, -1.2f) == +1);
        assertTrue(Float.compare(Float.NaN, -Float.MAX_VALUE) == +1);
        assertTrue(Float.compare(Float.NaN, Float.NEGATIVE_INFINITY) == +1);

        assertTrue(Float.compare(Float.POSITIVE_INFINITY, Float.NaN) == -1);
        assertTrue(Float.compare(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY) == 0);
        assertTrue(Float.compare(Float.POSITIVE_INFINITY, Float.MAX_VALUE) == +1);
        assertTrue(Float.compare(Float.POSITIVE_INFINITY, 1.2f) == +1);
        assertTrue(Float.compare(Float.POSITIVE_INFINITY, 0.0f) == +1);
        assertTrue(Float.compare(Float.POSITIVE_INFINITY, -0.0f) == +1);
        assertTrue(Float.compare(Float.POSITIVE_INFINITY, -1.2f) == +1);
        assertTrue(Float.compare(Float.POSITIVE_INFINITY, -Float.MAX_VALUE) == +1);
        assertTrue(Float.compare(Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY) == +1);

        assertTrue(Float.compare(Float.MAX_VALUE, Float.NaN) == -1);
        assertTrue(Float.compare(Float.MAX_VALUE, Float.POSITIVE_INFINITY) == -1);
        assertTrue(Float.compare(Float.MAX_VALUE, Float.MAX_VALUE) == 0);
        assertTrue(Float.compare(Float.MAX_VALUE, 1.2f) == +1);
        assertTrue(Float.compare(Float.MAX_VALUE, 0.0f) == +1);
        assertTrue(Float.compare(Float.MAX_VALUE, -0.0f) == +1);
        assertTrue(Float.compare(Float.MAX_VALUE, -1.2f) == +1);
        assertTrue(Float.compare(Float.MAX_VALUE, -Float.MAX_VALUE) == +1);
        assertTrue(Float.compare(Float.MAX_VALUE, Float.NEGATIVE_INFINITY) == +1);

        assertTrue(Float.compare(1.2f, Float.NaN) == -1);
        assertTrue(Float.compare(1.2f, Float.POSITIVE_INFINITY) == -1);
        assertTrue(Float.compare(1.2f, Float.MAX_VALUE) == -1);
        assertTrue(Float.compare(1.2f, 1.2f) == 0);
        assertTrue(Float.compare(1.2f, 0.0f) == +1);
        assertTrue(Float.compare(1.2f, -0.0f) == +1);
        assertTrue(Float.compare(1.2f, -1.2f) == +1);
        assertTrue(Float.compare(1.2f, -Float.MAX_VALUE) == +1);
        assertTrue(Float.compare(1.2f, Float.NEGATIVE_INFINITY) == +1);

        assertTrue(Float.compare(0.0f, Float.NaN) == -1);
        assertTrue(Float.compare(0.0f, Float.POSITIVE_INFINITY) == -1);
        assertTrue(Float.compare(0.0f, Float.MAX_VALUE) == -1);
        assertTrue(Float.compare(0.0f, 1.2f) == -1);
        assertTrue(Float.compare(0.0f, 0.0f) == 0);
        assertTrue(Float.compare(0.0f, -0.0f) == +1);
        assertTrue(Float.compare(0.0f, -1.2f) == +1);
        assertTrue(Float.compare(0.0f, -Float.MAX_VALUE) == +1);
        assertTrue(Float.compare(0.0f, Float.NEGATIVE_INFINITY) == +1);

        assertTrue(Float.compare(-0.0f, Float.NaN) == -1);
        assertTrue(Float.compare(-0.0f, Float.POSITIVE_INFINITY) == -1);
        assertTrue(Float.compare(-0.0f, Float.MAX_VALUE) == -1);
        assertTrue(Float.compare(-0.0f, 1.2f) == -1);
        assertTrue(Float.compare(-0.0f, 0.0f) == -1);
        assertTrue(Float.compare(-0.0f, -0.0f) == 0);
        assertTrue(Float.compare(-0.0f, -1.2f) == +1);
        assertTrue(Float.compare(-0.0f, -Float.MAX_VALUE) == +1);
        assertTrue(Float.compare(-0.0f, Float.NEGATIVE_INFINITY) == +1);

        assertTrue(Float.compare(-1.2f, Float.NaN) == -1);
        assertTrue(Float.compare(-1.2f, Float.POSITIVE_INFINITY) == -1);
        assertTrue(Float.compare(-1.2f, Float.MAX_VALUE) == -1);
        assertTrue(Float.compare(-1.2f, 1.2f) == -1);
        assertTrue(Float.compare(-1.2f, 0.0f) == -1);
        assertTrue(Float.compare(-1.2f, -0.0f) == -1);
        assertTrue(Float.compare(-1.2f, -1.2f) == 0);
        assertTrue(Float.compare(-1.2f, -Float.MAX_VALUE) == +1);
        assertTrue(Float.compare(-1.2f, Float.NEGATIVE_INFINITY) == +1);

        assertTrue(Float.compare(-Float.MAX_VALUE, Float.NaN) == -1);
        assertTrue(Float.compare(-Float.MAX_VALUE, Float.POSITIVE_INFINITY) == -1);
        assertTrue(Float.compare(-Float.MAX_VALUE, Float.MAX_VALUE) == -1);
        assertTrue(Float.compare(-Float.MAX_VALUE, 1.2f) == -1);
        assertTrue(Float.compare(-Float.MAX_VALUE, 0.0f) == -1);
        assertTrue(Float.compare(-Float.MAX_VALUE, -0.0f) == -1);
        assertTrue(Float.compare(-Float.MAX_VALUE, -1.2f) == -1);
        assertTrue(Float.compare(-Float.MAX_VALUE, -Float.MAX_VALUE) == 0);
        assertTrue(Float.compare(-Float.MAX_VALUE, Float.NEGATIVE_INFINITY) == +1);

        assertTrue(Float.compare(Float.NEGATIVE_INFINITY, Float.NaN) == -1);
        assertTrue(Float.compare(Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY) == -1);
        assertTrue(Float.compare(Float.NEGATIVE_INFINITY, Float.MAX_VALUE) == -1);
        assertTrue(Float.compare(Float.NEGATIVE_INFINITY, 1.2f) == -1);
        assertTrue(Float.compare(Float.NEGATIVE_INFINITY, 0.0f) == -1);
        assertTrue(Float.compare(Float.NEGATIVE_INFINITY, -0.0f) == -1);
        assertTrue(Float.compare(Float.NEGATIVE_INFINITY, -1.2f) == -1);
        assertTrue(Float.compare(Float.NEGATIVE_INFINITY, -Float.MAX_VALUE) == -1);
        assertTrue(Float.compare(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY) == 0);
    }

    @Test
    public void NumberUtils() {
        assertFalse("isDigits(null) failed", NumberUtils.isDigits(null));
        assertFalse("isDigits('') failed", NumberUtils.isDigits(""));
        assertTrue("isDigits(String) failed", NumberUtils.isDigits("12345"));
        assertFalse("isDigits(String) neg 1 failed", NumberUtils.isDigits("1234.5"));
        assertFalse("isDigits(String) neg 3 failed", NumberUtils.isDigits("1ab"));
        assertFalse("isDigits(String) neg 4 failed", NumberUtils.isDigits("abc"));
    }

    /**
     * Tests isNumber(String) and tests that createNumber(String) returns
     * a valid number iff isNumber(String) returns false.
     */
    @Test
    public void NumberUtils() {
        String val = "12345";
        assertTrue("isNumber(String) 1 failed", NumberUtils.isNumber(val));
        assertTrue("isNumber(String)/createNumber(String) 1 failed", checkCreateNumber(val));
        val = "1234.5";
        assertTrue("isNumber(String) 2 failed", NumberUtils.isNumber(val));
        assertTrue("isNumber(String)/createNumber(String) 2 failed", checkCreateNumber(val));
        val = ".12345";
        assertTrue("isNumber(String) 3 failed", NumberUtils.isNumber(val));
        assertTrue("isNumber(String)/createNumber(String) 3 failed", checkCreateNumber(val));
        val = "1234E5";
        assertTrue("isNumber(String) 4 failed", NumberUtils.isNumber(val));
        assertTrue("isNumber(String)/createNumber(String) 4 failed", checkCreateNumber(val));
        val = "1234E+5";
        assertTrue("isNumber(String) 5 failed", NumberUtils.isNumber(val));
        assertTrue("isNumber(String)/createNumber(String) 5 failed", checkCreateNumber(val));
        val = "1234E-5";
        assertTrue("isNumber(String) 6 failed", NumberUtils.isNumber(val));
        assertTrue("isNumber(String)/createNumber(String) 6 failed", checkCreateNumber(val));
        val = "123.4E5";
        assertTrue("isNumber(String) 7 failed", NumberUtils.isNumber(val));
        assertTrue("isNumber(String)/createNumber(String) 7 failed", checkCreateNumber(val));
        val = "-1234";
        assertTrue("isNumber(String) 8 failed", NumberUtils.isNumber(val));
        assertTrue("isNumber(String)/createNumber(String) 8 failed", checkCreateNumber(val));
        val = "-1234.5";
        assertTrue("isNumber(String) 9 failed", NumberUtils.isNumber(val));
        assertTrue("isNumber(String)/createNumber(String) 9 failed", checkCreateNumber(val));
        val = "-.12345";
        assertTrue("isNumber(String) 10 failed", NumberUtils.isNumber(val));
        assertTrue("isNumber(String)/createNumber(String) 10 failed", checkCreateNumber(val));
        val = "-1234E5";
        assertTrue("isNumber(String) 11 failed", NumberUtils.isNumber(val));
        assertTrue("isNumber(String)/createNumber(String) 11 failed", checkCreateNumber(val));
        val = "0";
        assertTrue("isNumber(String) 12 failed", NumberUtils.isNumber(val));
        assertTrue("isNumber(String)/createNumber(String) 12 failed", checkCreateNumber(val));
        val = "-0";
        assertTrue("isNumber(String) 13 failed", NumberUtils.isNumber(val));
        assertTrue("isNumber(String)/createNumber(String) 13 failed", checkCreateNumber(val));
        val = "01234";
        assertTrue("isNumber(String) 14 failed", NumberUtils.isNumber(val));
        assertTrue("isNumber(String)/createNumber(String) 14 failed", checkCreateNumber(val));
        val = "-01234";
        assertTrue("isNumber(String) 15 failed", NumberUtils.isNumber(val));
        assertTrue("isNumber(String)/createNumber(String) 15 failed", checkCreateNumber(val));
        val = "0xABC123";
        assertTrue("isNumber(String) 16 failed", NumberUtils.isNumber(val));
        assertTrue("isNumber(String)/createNumber(String) 16 failed", checkCreateNumber(val));
        val = "0x0";
        assertTrue("isNumber(String) 17 failed", NumberUtils.isNumber(val));
        assertTrue("isNumber(String)/createNumber(String) 17 failed", checkCreateNumber(val));
        val = "123.4E21D";
        assertTrue("isNumber(String) 19 failed", NumberUtils.isNumber(val));
        assertTrue("isNumber(String)/createNumber(String) 19 failed", checkCreateNumber(val));
        val = "-221.23F";
        assertTrue("isNumber(String) 20 failed", NumberUtils.isNumber(val));
        assertTrue("isNumber(String)/createNumber(String) 20 failed", checkCreateNumber(val));
        val = "22338L";
        assertTrue("isNumber(String) 21 failed", NumberUtils.isNumber(val));
        assertTrue("isNumber(String)/createNumber(String) 21 failed", checkCreateNumber(val));
        val = null;
        assertTrue("isNumber(String) 1 Neg failed", !NumberUtils.isNumber(val));
        assertTrue("isNumber(String)/createNumber(String) 1 Neg failed", !checkCreateNumber(val));
        val = "";
        assertTrue("isNumber(String) 2 Neg failed", !NumberUtils.isNumber(val));
        assertTrue("isNumber(String)/createNumber(String) 2 Neg failed", !checkCreateNumber(val));
        val = "--2.3";
        assertTrue("isNumber(String) 3 Neg failed", !NumberUtils.isNumber(val));
        assertTrue("isNumber(String)/createNumber(String) 3 Neg failed", !checkCreateNumber(val));
        val = ".12.3";
        assertTrue("isNumber(String) 4 Neg failed", !NumberUtils.isNumber(val));
        assertTrue("isNumber(String)/createNumber(String) 4 Neg failed", !checkCreateNumber(val));
        val = "-123E";
        assertTrue("isNumber(String) 5 Neg failed", !NumberUtils.isNumber(val));
        assertTrue("isNumber(String)/createNumber(String) 5 Neg failed", !checkCreateNumber(val));
        val = "-123E+-212";
        assertTrue("isNumber(String) 6 Neg failed", !NumberUtils.isNumber(val));
        assertTrue("isNumber(String)/createNumber(String) 6 Neg failed", !checkCreateNumber(val));
        val = "-123E2.12";
        assertTrue("isNumber(String) 7 Neg failed", !NumberUtils.isNumber(val));
        assertTrue("isNumber(String)/createNumber(String) 7 Neg failed", !checkCreateNumber(val));
        val = "0xGF";
        assertTrue("isNumber(String) 8 Neg failed", !NumberUtils.isNumber(val));
        assertTrue("isNumber(String)/createNumber(String) 8 Neg failed", !checkCreateNumber(val));
        val = "0xFAE-1";
        assertTrue("isNumber(String) 9 Neg failed", !NumberUtils.isNumber(val));
        assertTrue("isNumber(String)/createNumber(String) 9 Neg failed", !checkCreateNumber(val));
        val = ".";
        assertTrue("isNumber(String) 10 Neg failed", !NumberUtils.isNumber(val));
        assertTrue("isNumber(String)/createNumber(String) 10 Neg failed", !checkCreateNumber(val));
        val = "-0ABC123";
        assertTrue("isNumber(String) 11 Neg failed", !NumberUtils.isNumber(val));
        assertTrue("isNumber(String)/createNumber(String) 11 Neg failed", !checkCreateNumber(val));
        val = "123.4E-D";
        assertTrue("isNumber(String) 12 Neg failed", !NumberUtils.isNumber(val));
        assertTrue("isNumber(String)/createNumber(String) 12 Neg failed", !checkCreateNumber(val));
        val = "123.4ED";
        assertTrue("isNumber(String) 13 Neg failed", !NumberUtils.isNumber(val));
        assertTrue("isNumber(String)/createNumber(String) 13 Neg failed", !checkCreateNumber(val));
        val = "1234E5l";
        assertTrue("isNumber(String) 14 Neg failed", !NumberUtils.isNumber(val));
        assertTrue("isNumber(String)/createNumber(String) 14 Neg failed", !checkCreateNumber(val));
        val = "11a";
        assertTrue("isNumber(String) 15 Neg failed", !NumberUtils.isNumber(val));
        assertTrue("isNumber(String)/createNumber(String) 15 Neg failed", !checkCreateNumber(val));
        val = "1a";
        assertTrue("isNumber(String) 16 Neg failed", !NumberUtils.isNumber(val));
        assertTrue("isNumber(String)/createNumber(String) 16 Neg failed", !checkCreateNumber(val));
        val = "a";
        assertTrue("isNumber(String) 17 Neg failed", !NumberUtils.isNumber(val));
        assertTrue("isNumber(String)/createNumber(String) 17 Neg failed", !checkCreateNumber(val));
        val = "11g";
        assertTrue("isNumber(String) 18 Neg failed", !NumberUtils.isNumber(val));
        assertTrue("isNumber(String)/createNumber(String) 18 Neg failed", !checkCreateNumber(val));
        val = "11z";
        assertTrue("isNumber(String) 19 Neg failed", !NumberUtils.isNumber(val));
        assertTrue("isNumber(String)/createNumber(String) 19 Neg failed", !checkCreateNumber(val));
        val = "11def";
        assertTrue("isNumber(String) 20 Neg failed", !NumberUtils.isNumber(val));
        assertTrue("isNumber(String)/createNumber(String) 20 Neg failed", !checkCreateNumber(val));
        val = "11d11";
        assertTrue("isNumber(String) 21 Neg failed", !NumberUtils.isNumber(val));
        assertTrue("isNumber(String)/createNumber(String) 21 Neg failed", !checkCreateNumber(val));
        val = "11 11";
        assertTrue("isNumber(String) 22 Neg failed", !NumberUtils.isNumber(val));
        assertTrue("isNumber(String)/createNumber(String) 22 Neg failed", !checkCreateNumber(val));
        val = " 1111";
        assertTrue("isNumber(String) 23 Neg failed", !NumberUtils.isNumber(val));
        assertTrue("isNumber(String)/createNumber(String) 23 Neg failed", !checkCreateNumber(val));
        val = "1111 ";
        assertTrue("isNumber(String) 24 Neg failed", !NumberUtils.isNumber(val));
        assertTrue("isNumber(String)/createNumber(String) 24 Neg failed", !checkCreateNumber(val));

        // LANG-521
        val = "2.";
        assertTrue("isNumber(String) LANG-521 failed", NumberUtils.isNumber(val));

        // LANG-664
        val = "1.1L";
        assertFalse("isNumber(String) LANG-664 failed", NumberUtils.isNumber(val));
    }

    private boolean checkCreateNumber(final String val) {
        try {
            final Object obj = NumberUtils.createNumber(val);
            if (obj == null) {
                return false;
            }
            return true;
        } catch (final NumberFormatException e) {
            return false;
       }
    }

    @SuppressWarnings("cast") // suppress instanceof warning check
    @Test
    public void NumberUtils() {
        assertTrue(NumberUtils.LONG_ZERO instanceof Long);
        assertTrue(NumberUtils.LONG_ONE instanceof Long);
        assertTrue(NumberUtils.LONG_MINUS_ONE instanceof Long);
        assertTrue(NumberUtils.INTEGER_ZERO instanceof Integer);
        assertTrue(NumberUtils.INTEGER_ONE instanceof Integer);
        assertTrue(NumberUtils.INTEGER_MINUS_ONE instanceof Integer);
        assertTrue(NumberUtils.SHORT_ZERO instanceof Short);
        assertTrue(NumberUtils.SHORT_ONE instanceof Short);
        assertTrue(NumberUtils.SHORT_MINUS_ONE instanceof Short);
        assertTrue(NumberUtils.BYTE_ZERO instanceof Byte);
        assertTrue(NumberUtils.BYTE_ONE instanceof Byte);
        assertTrue(NumberUtils.BYTE_MINUS_ONE instanceof Byte);
        assertTrue(NumberUtils.DOUBLE_ZERO instanceof Double);
        assertTrue(NumberUtils.DOUBLE_ONE instanceof Double);
        assertTrue(NumberUtils.DOUBLE_MINUS_ONE instanceof Double);
        assertTrue(NumberUtils.FLOAT_ZERO instanceof Float);
        assertTrue(NumberUtils.FLOAT_ONE instanceof Float);
        assertTrue(NumberUtils.FLOAT_MINUS_ONE instanceof Float);

        assertTrue(NumberUtils.LONG_ZERO.longValue() == 0);
        assertTrue(NumberUtils.LONG_ONE.longValue() == 1);
        assertTrue(NumberUtils.LONG_MINUS_ONE.longValue() == -1);
        assertTrue(NumberUtils.INTEGER_ZERO.intValue() == 0);
        assertTrue(NumberUtils.INTEGER_ONE.intValue() == 1);
        assertTrue(NumberUtils.INTEGER_MINUS_ONE.intValue() == -1);
        assertTrue(NumberUtils.SHORT_ZERO.shortValue() == 0);
        assertTrue(NumberUtils.SHORT_ONE.shortValue() == 1);
        assertTrue(NumberUtils.SHORT_MINUS_ONE.shortValue() == -1);
        assertTrue(NumberUtils.BYTE_ZERO.byteValue() == 0);
        assertTrue(NumberUtils.BYTE_ONE.byteValue() == 1);
        assertTrue(NumberUtils.BYTE_MINUS_ONE.byteValue() == -1);
        assertTrue(NumberUtils.DOUBLE_ZERO.doubleValue() == 0.0d);
        assertTrue(NumberUtils.DOUBLE_ONE.doubleValue() == 1.0d);
        assertTrue(NumberUtils.DOUBLE_MINUS_ONE.doubleValue() == -1.0d);
        assertTrue(NumberUtils.FLOAT_ZERO.floatValue() == 0.0f);
        assertTrue(NumberUtils.FLOAT_ONE.floatValue() == 1.0f);
        assertTrue(NumberUtils.FLOAT_MINUS_ONE.floatValue() == -1.0f);
    }

    @Test
    public void NumberUtils() {
        NumberUtils.createNumber("-1l");
        NumberUtils.createNumber("01l");
        NumberUtils.createNumber("1l");
    }

    @Test
    public void NumberUtils() {
        assertTrue(Double.isNaN(NumberUtils.min(1.2, 2.5, Double.NaN)));
        assertTrue(Double.isNaN(NumberUtils.max(1.2, 2.5, Double.NaN)));
        assertTrue(Float.isNaN(NumberUtils.min(1.2f, 2.5f, Float.NaN)));
        assertTrue(Float.isNaN(NumberUtils.max(1.2f, 2.5f, Float.NaN)));

        final double[] a = new double[] { 1.2, Double.NaN, 3.7, 27.0, 42.0, Double.NaN };
        assertTrue(Double.isNaN(NumberUtils.max(a)));
        assertTrue(Double.isNaN(NumberUtils.min(a)));

        final double[] b = new double[] { Double.NaN, 1.2, Double.NaN, 3.7, 27.0, 42.0, Double.NaN };
        assertTrue(Double.isNaN(NumberUtils.max(b)));
        assertTrue(Double.isNaN(NumberUtils.min(b)));

        final float[] aF = new float[] { 1.2f, Float.NaN, 3.7f, 27.0f, 42.0f, Float.NaN };
        assertTrue(Float.isNaN(NumberUtils.max(aF)));

        final float[] bF = new float[] { Float.NaN, 1.2f, Float.NaN, 3.7f, 27.0f, 42.0f, Float.NaN };
        assertTrue(Float.isNaN(NumberUtils.max(bF)));
    }
}
