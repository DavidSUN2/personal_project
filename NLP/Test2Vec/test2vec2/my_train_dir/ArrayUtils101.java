
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

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

/**
 * Tests ArrayUtils remove and removeElement methods.
 * 
 * @version $Id$
 */
public class ArrayUtilsRemoveMultipleTest {

    @Test
    public void ArrayUtils() {
        Object[] array;
        array = ArrayUtils.removeAll(new Object[] { "a" }, 0);
        assertArrayEquals(ArrayUtils.EMPTY_OBJECT_ARRAY, array);
        assertEquals(Object.class, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new Object[] { "a", "b" }, 0, 1);
        assertArrayEquals(ArrayUtils.EMPTY_OBJECT_ARRAY, array);
        assertEquals(Object.class, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new Object[] { "a", "b", "c" }, 1, 2);
        assertArrayEquals(new Object[] { "a" }, array);
        assertEquals(Object.class, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new Object[] { "a", "b", "c", "d" }, 1, 2);
        assertArrayEquals(new Object[] { "a", "d" }, array);
        assertEquals(Object.class, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new Object[] { "a", "b", "c", "d" }, 0, 3);
        assertArrayEquals(new Object[] { "b", "c" }, array);
        assertEquals(Object.class, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new Object[] { "a", "b", "c", "d" }, 0, 1, 3);
        assertArrayEquals(new Object[] { "c" }, array);
        assertEquals(Object.class, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new Object[] { "a", "b", "c", "d", "e" }, 0, 1, 3);
        assertArrayEquals(new Object[] { "c", "e" }, array);
        assertEquals(Object.class, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new Object[] { "a", "b", "c", "d", "e" }, 0, 2, 4);
        assertArrayEquals(new Object[] { "b", "d" }, array);
        assertEquals(Object.class, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new Object[] { "a", "b", "c", "d" }, 0, 1, 3, 0, 1, 3);
        assertArrayEquals(new Object[] { "c" }, array);
        assertEquals(Object.class, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new Object[] { "a", "b", "c", "d" }, 2, 1, 0, 3);
        assertArrayEquals(ArrayUtils.EMPTY_OBJECT_ARRAY, array);
        assertEquals(Object.class, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new Object[] { "a", "b", "c", "d" }, 2, 0, 1, 3, 0, 2, 1, 3);
        assertArrayEquals(ArrayUtils.EMPTY_OBJECT_ARRAY, array);
        assertEquals(Object.class, array.getClass().getComponentType());
    }

    @Test
    public void ArrayUtils() {
        final Object[] array1 = new Object[] { "foo", "bar", "baz" };
        final Object[] array2 = ArrayUtils.removeAll(array1);
        assertNotSame(array1, array2);
        assertArrayEquals(array1, array2);
        assertEquals(Object.class, array2.getClass().getComponentType());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void ArrayUtils() {
        ArrayUtils.removeAll(new Object[] { "a", "b" }, -1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void ArrayUtils() {
        ArrayUtils.removeAll(new Object[] { "a", "b" }, 2);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void ArrayUtils() {
        ArrayUtils.remove((Object[]) null, 0);
    }

    @Test
    public void ArrayUtils() {
        final Number[] inarray = { Integer.valueOf(1), Long.valueOf(2L), Byte.valueOf((byte) 3) };
        assertEquals(3, inarray.length);
        Number[] outarray;
        outarray = ArrayUtils.removeAll(inarray, 1);
        assertArrayEquals(new Number[] { Integer.valueOf(1), Byte.valueOf((byte) 3) }, outarray);
        assertEquals(Number.class, outarray.getClass().getComponentType());
        outarray = ArrayUtils.removeAll(outarray, 1);
        assertArrayEquals(new Number[] { Integer.valueOf(1) }, outarray);
        assertEquals(Number.class, outarray.getClass().getComponentType());
        outarray = ArrayUtils.removeAll(outarray, 0);
        assertEquals(0, outarray.length);
        assertEquals(Number.class, outarray.getClass().getComponentType());

        outarray = ArrayUtils.removeAll(inarray, 0, 1);
        assertArrayEquals(new Number[] { Byte.valueOf((byte) 3) }, outarray);
        assertEquals(Number.class, outarray.getClass().getComponentType());
        outarray = ArrayUtils.removeAll(inarray, 0, 2);
        assertArrayEquals(new Number[] { Long.valueOf(2L) }, outarray);
        assertEquals(Number.class, outarray.getClass().getComponentType());
        outarray = ArrayUtils.removeAll(inarray, 1, 2);
        assertArrayEquals(new Number[] { Integer.valueOf(1) }, outarray);
        assertEquals(Number.class, outarray.getClass().getComponentType());
    }

    @Test
    public void ArrayUtils() {
        boolean[] array;
        array = ArrayUtils.removeAll(new boolean[] { true }, 0);
        assertTrue(Arrays.equals(ArrayUtils.EMPTY_BOOLEAN_ARRAY, array));
        assertEquals(Boolean.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new boolean[] { true, false }, 0);
        assertTrue(Arrays.equals(new boolean[] { false }, array));
        assertEquals(Boolean.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new boolean[] { true, false }, 1);
        assertTrue(Arrays.equals(new boolean[] { true }, array));
        assertEquals(Boolean.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new boolean[] { true, false, true }, 1);
        assertTrue(Arrays.equals(new boolean[] { true, true }, array));
        assertEquals(Boolean.TYPE, array.getClass().getComponentType());

        array = ArrayUtils.removeAll(new boolean[] { true, false }, 0, 1);
        assertTrue(Arrays.equals(ArrayUtils.EMPTY_BOOLEAN_ARRAY, array));
        assertEquals(Boolean.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new boolean[] { true, false, false }, 0, 1);
        assertTrue(Arrays.equals(new boolean[] { false }, array));
        assertEquals(Boolean.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new boolean[] { true, false, false }, 0, 2);
        assertTrue(Arrays.equals(new boolean[] { false }, array));
        assertEquals(Boolean.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new boolean[] { true, false, false }, 1, 2);
        assertTrue(Arrays.equals(new boolean[] { true }, array));
        assertEquals(Boolean.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new boolean[] { true, false, true, false, true }, 0, 2, 4);
        assertTrue(Arrays.equals(new boolean[] { false, false }, array));
        assertEquals(Boolean.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new boolean[] { true, false, true, false, true }, 1, 3);
        assertTrue(Arrays.equals(new boolean[] { true, true, true }, array));
        assertEquals(Boolean.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new boolean[] { true, false, true, false, true }, 1, 3, 4);
        assertTrue(Arrays.equals(new boolean[] { true, true }, array));
        assertEquals(Boolean.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new boolean[] { true, false, true, false, true, false, true }, 0, 2, 4, 6);
        assertTrue(Arrays.equals(new boolean[] { false, false, false }, array));
        assertEquals(Boolean.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new boolean[] { true, false, true, false, true, false, true }, 1, 3, 5);
        assertTrue(Arrays.equals(new boolean[] { true, true, true, true }, array));
        assertEquals(Boolean.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new boolean[] { true, false, true, false, true, false, true }, 0, 1, 2);
        assertTrue(Arrays.equals(new boolean[] { false, true, false, true }, array));
        assertEquals(Boolean.TYPE, array.getClass().getComponentType());
    }

    @Test
    public void ArrayUtils() {
        final boolean[] array1 = new boolean[] { true, false };
        final boolean[] array2 = ArrayUtils.removeAll(array1);
        assertNotSame(array1, array2);
        assertTrue(Arrays.equals(array1, array2));
        assertEquals(boolean.class, array2.getClass().getComponentType());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void ArrayUtils() {
        ArrayUtils.removeAll(new boolean[] { true, false }, -1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void ArrayUtils() {
        ArrayUtils.removeAll(new boolean[] { true, false }, 2);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void ArrayUtils() {
        ArrayUtils.removeAll((boolean[]) null, 0);
    }

    @Test
    public void ArrayUtils() {
        byte[] array;
        array = ArrayUtils.removeAll(new byte[] { 1 }, 0);
        assertTrue(Arrays.equals(ArrayUtils.EMPTY_BYTE_ARRAY, array));
        assertEquals(Byte.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new byte[] { 1, 2 }, 0);
        assertTrue(Arrays.equals(new byte[] { 2 }, array));
        assertEquals(Byte.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new byte[] { 1, 2 }, 1);
        assertTrue(Arrays.equals(new byte[] { 1 }, array));
        assertEquals(Byte.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new byte[] { 1, 2, 1 }, 1);
        assertTrue(Arrays.equals(new byte[] { 1, 1 }, array));
        assertEquals(Byte.TYPE, array.getClass().getComponentType());

        array = ArrayUtils.removeAll(new byte[] { 1, 2 }, 0, 1);
        assertTrue(Arrays.equals(ArrayUtils.EMPTY_BYTE_ARRAY, array));
        assertEquals(Byte.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new byte[] { 1, 2, 3 }, 0, 1);
        assertTrue(Arrays.equals(new byte[] { 3 }, array));
        assertEquals(Byte.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new byte[] { 1, 2, 3 }, 1, 2);
        assertTrue(Arrays.equals(new byte[] { 1 }, array));
        assertEquals(Byte.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new byte[] { 1, 2, 3 }, 0, 2);
        assertTrue(Arrays.equals(new byte[] { 2 }, array));
        assertEquals(Byte.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new byte[] { 1, 2, 3, 4, 5 }, 1, 3);
        assertTrue(Arrays.equals(new byte[] { 1, 3, 5 }, array));
        assertEquals(Byte.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new byte[] { 1, 2, 3, 4, 5 }, 0, 2, 4);
        assertTrue(Arrays.equals(new byte[] { 2, 4 }, array));
        assertEquals(Byte.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new byte[] { 1, 2, 3, 4, 5, 6, 7 }, 1, 3, 5);
        assertTrue(Arrays.equals(new byte[] { 1, 3, 5, 7 }, array));
        assertEquals(Byte.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new byte[] { 1, 2, 3, 4, 5, 6, 7 }, 0, 2, 4, 6);
        assertTrue(Arrays.equals(new byte[] { 2, 4, 6 }, array));
        assertEquals(Byte.TYPE, array.getClass().getComponentType());
    }

    @Test
    public void ArrayUtils() {
        final byte[] array1 = new byte[] { 1, 2 };
        final byte[] array2 = ArrayUtils.removeAll(array1);
        assertNotSame(array1, array2);
        assertArrayEquals(array1, array2);
        assertEquals(byte.class, array2.getClass().getComponentType());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void ArrayUtils() {
        ArrayUtils.removeAll(new byte[] { 1, 2 }, -1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void ArrayUtils() {
        ArrayUtils.removeAll(new byte[] { 1, 2 }, 2);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void ArrayUtils() {
        ArrayUtils.removeAll((byte[]) null, 0);
    }

    @Test
    public void ArrayUtils() {
        char[] array;
        array = ArrayUtils.removeAll(new char[] { 'a' }, 0);
        assertTrue(Arrays.equals(ArrayUtils.EMPTY_CHAR_ARRAY, array));
        assertEquals(Character.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new char[] { 'a', 'b' }, 0);
        assertTrue(Arrays.equals(new char[] { 'b' }, array));
        assertEquals(Character.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new char[] { 'a', 'b' }, 1);
        assertTrue(Arrays.equals(new char[] { 'a' }, array));
        assertEquals(Character.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new char[] { 'a', 'b', 'c' }, 1);
        assertTrue(Arrays.equals(new char[] { 'a', 'c' }, array));
        assertEquals(Character.TYPE, array.getClass().getComponentType());

        array = ArrayUtils.removeAll(new char[] { 'a', 'b' }, 0, 1);
        assertTrue(Arrays.equals(ArrayUtils.EMPTY_CHAR_ARRAY, array));
        assertEquals(Character.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new char[] { 'a', 'b', 'c' }, 0, 1);
        assertTrue(Arrays.equals(new char[] { 'c' }, array));
        assertEquals(Character.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new char[] { 'a', 'b', 'c' }, 1, 2);
        assertTrue(Arrays.equals(new char[] { 'a' }, array));
        assertEquals(Character.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new char[] { 'a', 'b', 'c' }, 0, 2);
        assertTrue(Arrays.equals(new char[] { 'b' }, array));
        assertEquals(Character.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new char[] { 'a', 'b', 'c', 'd', 'e' }, 1, 3);
        assertTrue(Arrays.equals(new char[] { 'a', 'c', 'e' }, array));
        assertEquals(Character.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new char[] { 'a', 'b', 'c', 'd', 'e' }, 0, 2, 4);
        assertTrue(Arrays.equals(new char[] { 'b', 'd' }, array));
        assertEquals(Character.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g' }, 1, 3, 5);
        assertTrue(Arrays.equals(new char[] { 'a', 'c', 'e', 'g' }, array));
        assertEquals(Character.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g' }, 0, 2, 4, 6);
        assertTrue(Arrays.equals(new char[] { 'b', 'd', 'f' }, array));
        assertEquals(Character.TYPE, array.getClass().getComponentType());
    }

    @Test
    public void ArrayUtils() {
        final char[] array1 = new char[] { 'a', 'b' };
        final char[] array2 = ArrayUtils.removeAll(array1);
        assertNotSame(array1, array2);
        assertArrayEquals(array1, array2);
        assertEquals(char.class, array2.getClass().getComponentType());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void ArrayUtils() {
        ArrayUtils.removeAll(new char[] { 'a', 'b' }, -1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void ArrayUtils() {
        ArrayUtils.removeAll(new char[] { 'a', 'b' }, 2);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void ArrayUtils() {
        ArrayUtils.removeAll((char[]) null, 0);
    }

    @Test
    public void ArrayUtils() {
        double[] array;
        array = ArrayUtils.removeAll(new double[] { 1 }, 0);
        assertTrue(Arrays.equals(ArrayUtils.EMPTY_DOUBLE_ARRAY, array));
        assertEquals(Double.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new double[] { 1, 2 }, 0);
        assertTrue(Arrays.equals(new double[] { 2 }, array));
        assertEquals(Double.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new double[] { 1, 2 }, 1);
        assertTrue(Arrays.equals(new double[] { 1 }, array));
        assertEquals(Double.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new double[] { 1, 2, 1 }, 1);
        assertTrue(Arrays.equals(new double[] { 1, 1 }, array));
        assertEquals(Double.TYPE, array.getClass().getComponentType());

        array = ArrayUtils.removeAll(new double[] { 1, 2 }, 0, 1);
        assertTrue(Arrays.equals(ArrayUtils.EMPTY_DOUBLE_ARRAY, array));
        assertEquals(Double.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new double[] { 1, 2, 3 }, 0, 1);
        assertTrue(Arrays.equals(new double[] { 3 }, array));
        assertEquals(Double.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new double[] { 1, 2, 3 }, 1, 2);
        assertTrue(Arrays.equals(new double[] { 1 }, array));
        assertEquals(Double.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new double[] { 1, 2, 3 }, 0, 2);
        assertTrue(Arrays.equals(new double[] { 2 }, array));
        assertEquals(Double.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new double[] { 1, 2, 3, 4, 5 }, 1, 3);
        assertTrue(Arrays.equals(new double[] { 1, 3, 5 }, array));
        assertEquals(Double.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new double[] { 1, 2, 3, 4, 5 }, 0, 2, 4);
        assertTrue(Arrays.equals(new double[] { 2, 4 }, array));
        assertEquals(Double.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new double[] { 1, 2, 3, 4, 5, 6, 7 }, 1, 3, 5);
        assertTrue(Arrays.equals(new double[] { 1, 3, 5, 7 }, array));
        assertEquals(Double.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new double[] { 1, 2, 3, 4, 5, 6, 7 }, 0, 2, 4, 6);
        assertTrue(Arrays.equals(new double[] { 2, 4, 6 }, array));
        assertEquals(Double.TYPE, array.getClass().getComponentType());
    }

    @Test
    public void ArrayUtils() {
        final double[] array1 = new double[] { 1, 2 };
        final double[] array2 = ArrayUtils.removeAll(array1);
        assertNotSame(array1, array2);
        assertTrue(Arrays.equals(array1, array2));
        assertEquals(double.class, array2.getClass().getComponentType());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void ArrayUtils() {
        ArrayUtils.removeAll(new double[] { 1, 2 }, -1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void ArrayUtils() {
        ArrayUtils.removeAll(new double[] { 1, 2 }, 2);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void ArrayUtils() {
        ArrayUtils.removeAll((double[]) null, 0);
    }

    @Test
    public void ArrayUtils() {
        float[] array;
        array = ArrayUtils.removeAll(new float[] { 1 }, 0);
        assertTrue(Arrays.equals(ArrayUtils.EMPTY_FLOAT_ARRAY, array));
        assertEquals(Float.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new float[] { 1, 2 }, 0);
        assertTrue(Arrays.equals(new float[] { 2 }, array));
        assertEquals(Float.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new float[] { 1, 2 }, 1);
        assertTrue(Arrays.equals(new float[] { 1 }, array));
        assertEquals(Float.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new float[] { 1, 2, 1 }, 1);
        assertTrue(Arrays.equals(new float[] { 1, 1 }, array));
        assertEquals(Float.TYPE, array.getClass().getComponentType());

        array = ArrayUtils.removeAll(new float[] { 1, 2 }, 0, 1);
        assertTrue(Arrays.equals(ArrayUtils.EMPTY_FLOAT_ARRAY, array));
        assertEquals(Float.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new float[] { 1, 2, 3 }, 0, 1);
        assertTrue(Arrays.equals(new float[] { 3 }, array));
        assertEquals(Float.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new float[] { 1, 2, 3 }, 1, 2);
        assertTrue(Arrays.equals(new float[] { 1 }, array));
        assertEquals(Float.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new float[] { 1, 2, 3 }, 0, 2);
        assertTrue(Arrays.equals(new float[] { 2 }, array));
        assertEquals(Float.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new float[] { 1, 2, 3, 4, 5 }, 1, 3);
        assertTrue(Arrays.equals(new float[] { 1, 3, 5 }, array));
        assertEquals(Float.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new float[] { 1, 2, 3, 4, 5 }, 0, 2, 4);
        assertTrue(Arrays.equals(new float[] { 2, 4 }, array));
        assertEquals(Float.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new float[] { 1, 2, 3, 4, 5, 6, 7 }, 1, 3, 5);
        assertTrue(Arrays.equals(new float[] { 1, 3, 5, 7 }, array));
        assertEquals(Float.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new float[] { 1, 2, 3, 4, 5, 6, 7 }, 0, 2, 4, 6);
        assertTrue(Arrays.equals(new float[] { 2, 4, 6 }, array));
        assertEquals(Float.TYPE, array.getClass().getComponentType());
    }

    @Test
    public void ArrayUtils() {
        final float[] array1 = new float[] { 1, 2 };
        final float[] array2 = ArrayUtils.removeAll(array1);
        assertNotSame(array1, array2);
        assertTrue(Arrays.equals(array1, array2));
        assertEquals(float.class, array2.getClass().getComponentType());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void ArrayUtils() {
        ArrayUtils.removeAll(new float[] { 1, 2 }, -1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void ArrayUtils() {
        ArrayUtils.removeAll(new float[] { 1, 2 }, 2);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void ArrayUtils() {
        ArrayUtils.removeAll((float[]) null, 0);
    }

    @Test
    public void ArrayUtils() {
        int[] array;
        array = ArrayUtils.removeAll(ArrayUtils.EMPTY_INT_ARRAY, ArrayUtils.EMPTY_INT_ARRAY);
        assertTrue(Arrays.equals(ArrayUtils.EMPTY_INT_ARRAY, array));
        array = ArrayUtils.removeAll(new int[] { 1 }, ArrayUtils.EMPTY_INT_ARRAY);
        assertTrue(Arrays.equals(new int[] { 1 }, array));
        array = ArrayUtils.removeAll(new int[] { 1 }, 0);
        assertTrue(Arrays.equals(ArrayUtils.EMPTY_INT_ARRAY, array));
        assertEquals(Integer.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new int[] { 1, 2 }, 0);
        assertTrue(Arrays.equals(new int[] { 2 }, array));
        assertEquals(Integer.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new int[] { 1, 2 }, 1);
        assertTrue(Arrays.equals(new int[] { 1 }, array));
        assertEquals(Integer.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new int[] { 1, 2, 1 }, 1);
        assertTrue(Arrays.equals(new int[] { 1, 1 }, array));
        assertEquals(Integer.TYPE, array.getClass().getComponentType());

        array = ArrayUtils.removeAll(new int[] { 1, 2 }, 0, 1);
        assertTrue(Arrays.equals(ArrayUtils.EMPTY_INT_ARRAY, array));
        assertEquals(Integer.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new int[] { 1, 2, 3 }, 0, 1);
        assertTrue(Arrays.equals(new int[] { 3 }, array));
        assertEquals(Integer.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new int[] { 1, 2, 3 }, 1, 2);
        assertTrue(Arrays.equals(new int[] { 1 }, array));
        assertEquals(Integer.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new int[] { 1, 2, 3 }, 0, 2);
        assertTrue(Arrays.equals(new int[] { 2 }, array));
        assertEquals(Integer.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new int[] { 1, 2, 3, 4, 5 }, 1, 3);
        assertTrue(Arrays.equals(new int[] { 1, 3, 5 }, array));
        assertEquals(Integer.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new int[] { 1, 2, 3, 4, 5 }, 0, 2, 4);
        assertTrue(Arrays.equals(new int[] { 2, 4 }, array));
        assertEquals(Integer.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 1, 3, 5);
        assertTrue(Arrays.equals(new int[] { 1, 3, 5, 7 }, array));
        assertEquals(Integer.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 0, 2, 4, 6);
        assertTrue(Arrays.equals(new int[] { 2, 4, 6 }, array));
        assertEquals(Integer.TYPE, array.getClass().getComponentType());
    }

    @Test
    public void ArrayUtils() {
        final int[] array1 = new int[] { 1, 2 };
        final int[] array2 = ArrayUtils.removeAll(array1);
        assertNotSame(array1, array2);
        assertArrayEquals(array1, array2);
        assertEquals(int.class, array2.getClass().getComponentType());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void ArrayUtils() {
        ArrayUtils.removeAll(new int[] { 1, 2 }, -1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void ArrayUtils() {
        ArrayUtils.removeAll(new int[] { 1, 2 }, 2);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void ArrayUtils() {
        ArrayUtils.removeAll((int[]) null, 0);
    }

    @Test
    public void ArrayUtils() {
        long[] array;
        array = ArrayUtils.removeAll(new long[] { 1 }, 0);
        assertTrue(Arrays.equals(ArrayUtils.EMPTY_LONG_ARRAY, array));
        assertEquals(Long.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new long[] { 1, 2 }, 0);
        assertTrue(Arrays.equals(new long[] { 2 }, array));
        assertEquals(Long.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new long[] { 1, 2 }, 1);
        assertTrue(Arrays.equals(new long[] { 1 }, array));
        assertEquals(Long.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new long[] { 1, 2, 1 }, 1);
        assertTrue(Arrays.equals(new long[] { 1, 1 }, array));
        assertEquals(Long.TYPE, array.getClass().getComponentType());

        array = ArrayUtils.removeAll(new long[] { 1, 2 }, 0, 1);
        assertTrue(Arrays.equals(ArrayUtils.EMPTY_LONG_ARRAY, array));
        assertEquals(Long.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new long[] { 1, 2, 3 }, 0, 1);
        assertTrue(Arrays.equals(new long[] { 3 }, array));
        assertEquals(Long.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new long[] { 1, 2, 3 }, 1, 2);
        assertTrue(Arrays.equals(new long[] { 1 }, array));
        assertEquals(Long.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new long[] { 1, 2, 3 }, 0, 2);
        assertTrue(Arrays.equals(new long[] { 2 }, array));
        assertEquals(Long.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new long[] { 1, 2, 3, 4, 5 }, 1, 3);
        assertTrue(Arrays.equals(new long[] { 1, 3, 5 }, array));
        assertEquals(Long.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new long[] { 1, 2, 3, 4, 5 }, 0, 2, 4);
        assertTrue(Arrays.equals(new long[] { 2, 4 }, array));
        assertEquals(Long.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new long[] { 1, 2, 3, 4, 5, 6, 7 }, 1, 3, 5);
        assertTrue(Arrays.equals(new long[] { 1, 3, 5, 7 }, array));
        assertEquals(Long.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new long[] { 1, 2, 3, 4, 5, 6, 7 }, 0, 2, 4, 6);
        assertTrue(Arrays.equals(new long[] { 2, 4, 6 }, array));
        assertEquals(Long.TYPE, array.getClass().getComponentType());
    }

    @Test
    public void ArrayUtils() {
        final long[] array1 = new long[] { 1, 2 };
        final long[] array2 = ArrayUtils.removeAll(array1);
        assertNotSame(array1, array2);
        assertArrayEquals(array1, array2);
        assertEquals(long.class, array2.getClass().getComponentType());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void ArrayUtils() {
        ArrayUtils.removeAll(new long[] { 1, 2 }, -1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void ArrayUtils() {
        ArrayUtils.removeAll(new long[] { 1, 2 }, 2);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void ArrayUtils() {
        ArrayUtils.removeAll((long[]) null, 0);
    }

    @Test
    public void ArrayUtils() {
        short[] array;
        array = ArrayUtils.removeAll(new short[] { 1 }, 0);
        assertTrue(Arrays.equals(ArrayUtils.EMPTY_SHORT_ARRAY, array));
        assertEquals(Short.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new short[] { 1, 2 }, 0);
        assertTrue(Arrays.equals(new short[] { 2 }, array));
        assertEquals(Short.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new short[] { 1, 2 }, 1);
        assertTrue(Arrays.equals(new short[] { 1 }, array));
        assertEquals(Short.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new short[] { 1, 2, 1 }, 1);
        assertTrue(Arrays.equals(new short[] { 1, 1 }, array));
        assertEquals(Short.TYPE, array.getClass().getComponentType());

        array = ArrayUtils.removeAll(new short[] { 1, 2 }, 0, 1);
        assertTrue(Arrays.equals(ArrayUtils.EMPTY_SHORT_ARRAY, array));
        assertEquals(Short.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new short[] { 1, 2, 3 }, 0, 1);
        assertTrue(Arrays.equals(new short[] { 3 }, array));
        assertEquals(Short.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new short[] { 1, 2, 3 }, 1, 2);
        assertTrue(Arrays.equals(new short[] { 1 }, array));
        assertEquals(Short.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new short[] { 1, 2, 3 }, 0, 2);
        assertTrue(Arrays.equals(new short[] { 2 }, array));
        assertEquals(Short.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new short[] { 1, 2, 3, 4, 5 }, 1, 3);
        assertTrue(Arrays.equals(new short[] { 1, 3, 5 }, array));
        assertEquals(Short.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new short[] { 1, 2, 3, 4, 5 }, 0, 2, 4);
        assertTrue(Arrays.equals(new short[] { 2, 4 }, array));
        assertEquals(Short.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new short[] { 1, 2, 3, 4, 5, 6, 7 }, 1, 3, 5);
        assertTrue(Arrays.equals(new short[] { 1, 3, 5, 7 }, array));
        assertEquals(Short.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeAll(new short[] { 1, 2, 3, 4, 5, 6, 7 }, 0, 2, 4, 6);
        assertTrue(Arrays.equals(new short[] { 2, 4, 6 }, array));
        assertEquals(Short.TYPE, array.getClass().getComponentType());
    }

    @Test
    public void ArrayUtils() {
        final short[] array1 = new short[] { 1, 2 };
        final short[] array2 = ArrayUtils.removeAll(array1);
        assertNotSame(array1, array2);
        assertArrayEquals(array1, array2);
        assertEquals(short.class, array2.getClass().getComponentType());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void ArrayUtils() {
        ArrayUtils.removeAll(new short[] { 1, 2 }, -1, 0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void ArrayUtils() {
        ArrayUtils.removeAll(new short[] { 1, 2 }, 2, 0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void ArrayUtils() {
        ArrayUtils.removeAll((short[]) null, 0);
    }

    @Test
    public void ArrayUtils() {
        Object[] array;
        array = ArrayUtils.removeElements((Object[]) null, "a");
        assertNull(array);
        array = ArrayUtils.removeElements(ArrayUtils.EMPTY_OBJECT_ARRAY, "a");
        assertTrue(Arrays.equals(ArrayUtils.EMPTY_OBJECT_ARRAY, array));
        assertEquals(Object.class, array.getClass().getComponentType());
        array = ArrayUtils.removeElements(new Object[] { "a" }, "a");
        assertTrue(Arrays.equals(ArrayUtils.EMPTY_OBJECT_ARRAY, array));
        assertEquals(Object.class, array.getClass().getComponentType());
        array = ArrayUtils.removeElements(new Object[] { "a", "b" }, "a");
        assertTrue(Arrays.equals(new Object[] { "b" }, array));
        assertEquals(Object.class, array.getClass().getComponentType());
        array = ArrayUtils.removeElements(new Object[] { "a", "b", "a" }, "a");
        assertTrue(Arrays.equals(new Object[] { "b", "a" }, array));
        assertEquals(Object.class, array.getClass().getComponentType());

        array = ArrayUtils.removeElements((Object[]) null, "a", "b");
        assertNull(array);
        array = ArrayUtils.removeElements(ArrayUtils.EMPTY_OBJECT_ARRAY, "a", "b");
        assertTrue(Arrays.equals(ArrayUtils.EMPTY_OBJECT_ARRAY, array));
        assertEquals(Object.class, array.getClass().getComponentType());
        array = ArrayUtils.removeElements(new Object[] { "a" }, "a", "b");
        assertTrue(Arrays.equals(ArrayUtils.EMPTY_OBJECT_ARRAY, array));
        assertEquals(Object.class, array.getClass().getComponentType());
        array = ArrayUtils.removeElements(new Object[] { "a", "b" }, "a", "c");
        assertTrue(Arrays.equals(new Object[] { "b" }, array));
        assertEquals(Object.class, array.getClass().getComponentType());
        array = ArrayUtils.removeElements(new Object[] { "a", "b", "a" }, "a");
        assertTrue(Arrays.equals(new Object[] { "b", "a" }, array));
        assertEquals(Object.class, array.getClass().getComponentType());
        array = ArrayUtils.removeElements(new Object[] { "a", "b", "a" }, "a", "b");
        assertTrue(Arrays.equals(new Object[] { "a" }, array));
        assertEquals(Object.class, array.getClass().getComponentType());
        array = ArrayUtils.removeElements(new Object[] { "a", "b", "a" }, "a", "a");
        assertTrue(Arrays.equals(new Object[] { "b" }, array));
        assertEquals(Object.class, array.getClass().getComponentType());
        array = ArrayUtils.removeElements(new Object[] { "a", "b", "a" }, "a", "a", "a", "a");
        assertTrue(Arrays.equals(new Object[] { "b" }, array));
        assertEquals(Object.class, array.getClass().getComponentType());
    }

   

}