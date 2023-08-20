
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
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;

import org.junit.Test;

/**
 * Tests ArrayUtils remove and removeElement methods.
 * 
 * @version $Id$
 */
public class ArrayUtilsRemoveTest {

     @Test
    public void ArrayUtils32() {
        char[] array;
        array = ArrayUtils.removeElement((char[]) null, 'a');
        assertNull(array);
        array = ArrayUtils.removeElement(ArrayUtils.EMPTY_CHAR_ARRAY, 'a');
        assertTrue(Arrays.equals(ArrayUtils.EMPTY_CHAR_ARRAY, array));
        assertEquals(Character.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeElement(new char[] {'a'}, 'a');
        assertTrue(Arrays.equals(ArrayUtils.EMPTY_CHAR_ARRAY, array));
        assertEquals(Character.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeElement(new char[] {'a', 'b'}, 'a');
        assertTrue(Arrays.equals(new char[] {'b'}, array));
        assertEquals(Character.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeElement(new char[] {'a', 'b', 'a'}, 'a');
        assertTrue(Arrays.equals(new char[] {'b', 'a'}, array));
        assertEquals(Character.TYPE, array.getClass().getComponentType());
    }
    
    @Test
    @SuppressWarnings("cast")
    public void ArrayUtils32() {
        double[] array;
        array = ArrayUtils.removeElement((double[]) null, (double) 1);
        assertNull(array);
        array = ArrayUtils.removeElement(ArrayUtils.EMPTY_DOUBLE_ARRAY, (double) 1);
        assertTrue(Arrays.equals(ArrayUtils.EMPTY_DOUBLE_ARRAY, array));
        assertEquals(Double.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeElement(new double[] {1}, (double) 1);
        assertTrue(Arrays.equals(ArrayUtils.EMPTY_DOUBLE_ARRAY, array));
        assertEquals(Double.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeElement(new double[] {1, 2}, (double) 1);
        assertTrue(Arrays.equals(new double[] {2}, array));
        assertEquals(Double.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeElement(new double[] {1, 2, 1}, (double) 1);
        assertTrue(Arrays.equals(new double[] {2, 1}, array));
        assertEquals(Double.TYPE, array.getClass().getComponentType());
    }
    
    @Test
    @SuppressWarnings("cast")
    public void ArrayUtils32() {
        float[] array;
        array = ArrayUtils.removeElement((float[]) null, (float) 1);
        assertNull(array);
        array = ArrayUtils.removeElement(ArrayUtils.EMPTY_FLOAT_ARRAY, (float) 1);
        assertTrue(Arrays.equals(ArrayUtils.EMPTY_FLOAT_ARRAY, array));
        assertEquals(Float.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeElement(new float[] {1}, (float) 1);
        assertTrue(Arrays.equals(ArrayUtils.EMPTY_FLOAT_ARRAY, array));
        assertEquals(Float.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeElement(new float[] {1, 2}, (float) 1);
        assertTrue(Arrays.equals(new float[] {2}, array));
        assertEquals(Float.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeElement(new float[] {1, 2, 1}, (float) 1);
        assertTrue(Arrays.equals(new float[] {2, 1}, array));
        assertEquals(Float.TYPE, array.getClass().getComponentType());
    }
    
    @Test
    public void ArrayUtils32() {
        int[] array;
        array = ArrayUtils.removeElement((int[]) null, 1);
        assertNull(array);
        array = ArrayUtils.removeElement(ArrayUtils.EMPTY_INT_ARRAY, 1);
        assertTrue(Arrays.equals(ArrayUtils.EMPTY_INT_ARRAY, array));
        assertEquals(Integer.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeElement(new int[] {1}, 1);
        assertTrue(Arrays.equals(ArrayUtils.EMPTY_INT_ARRAY, array));
        assertEquals(Integer.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeElement(new int[] {1, 2}, 1);
        assertTrue(Arrays.equals(new int[] {2}, array));
        assertEquals(Integer.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeElement(new int[] {1, 2, 1}, 1);
        assertTrue(Arrays.equals(new int[] {2, 1}, array));
        assertEquals(Integer.TYPE, array.getClass().getComponentType());
    }
    
    @Test
    @SuppressWarnings("cast")
    public void ArrayUtils32() {
        long[] array;
        array = ArrayUtils.removeElement((long[]) null, (long) 1);
        assertNull(array);
        array = ArrayUtils.removeElement(ArrayUtils.EMPTY_LONG_ARRAY, (long) 1);
        assertTrue(Arrays.equals(ArrayUtils.EMPTY_LONG_ARRAY, array));
        assertEquals(Long.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeElement(new long[] {1}, (long) 1);
        assertTrue(Arrays.equals(ArrayUtils.EMPTY_LONG_ARRAY, array));
        assertEquals(Long.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeElement(new long[] {1, 2}, (long) 1);
        assertTrue(Arrays.equals(new long[] {2}, array));
        assertEquals(Long.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeElement(new long[] {1, 2, 1}, (long) 1);
        assertTrue(Arrays.equals(new long[] {2, 1}, array));
        assertEquals(Long.TYPE, array.getClass().getComponentType());
    }
    
    @Test
    public void ArrayUtils32() {
        short[] array;
        array = ArrayUtils.removeElement((short[]) null, (short) 1);
        assertNull(array);
        array = ArrayUtils.removeElement(ArrayUtils.EMPTY_SHORT_ARRAY, (short) 1);
        assertTrue(Arrays.equals(ArrayUtils.EMPTY_SHORT_ARRAY, array));
        assertEquals(Short.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeElement(new short[] {1}, (short) 1);
        assertTrue(Arrays.equals(ArrayUtils.EMPTY_SHORT_ARRAY, array));
        assertEquals(Short.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeElement(new short[] {1, 2}, (short) 1);
        assertTrue(Arrays.equals(new short[] {2}, array));
        assertEquals(Short.TYPE, array.getClass().getComponentType());
        array = ArrayUtils.removeElement(new short[] {1, 2, 1}, (short) 1);
        assertTrue(Arrays.equals(new short[] {2, 1}, array));
        assertEquals(Short.TYPE, array.getClass().getComponentType());
    }
    
}
