
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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;

import org.junit.Test;

/**
 * Tests ArrayUtils add methods.
 *
 * @version $Id$
 */
public class ArrayUtilsAddTest {

    @Test
    public void ArrayUtils47(){
        Number[] n;
        // Valid array construction
        n = ArrayUtils.addAll(new Number[]{Integer.valueOf(1)}, new Long[]{Long.valueOf(2)});
        assertEquals(2,n.length);
        assertEquals(Number.class,n.getClass().getComponentType());
        try {
            // Invalid - can't store Long in Integer array
               n = ArrayUtils.addAll(new Integer[]{Integer.valueOf(1)}, new Long[]{Long.valueOf(2)});
               fail("Should have generated IllegalArgumentException");
        } catch (final IllegalArgumentException expected) {
        }
    }

    @Test
    public void ArrayUtils47() {
        boolean[] newArray;
        newArray = ArrayUtils.add((boolean[])null, false);
        assertTrue(Arrays.equals(new boolean[]{false}, newArray));
        assertEquals(Boolean.TYPE, newArray.getClass().getComponentType());
        newArray = ArrayUtils.add((boolean[])null, true);
        assertTrue(Arrays.equals(new boolean[]{true}, newArray));
        assertEquals(Boolean.TYPE, newArray.getClass().getComponentType());
        final boolean[] array1 = new boolean[]{true, false, true};
        newArray = ArrayUtils.add(array1, false);
        assertTrue(Arrays.equals(new boolean[]{true, false, true, false}, newArray));
        assertEquals(Boolean.TYPE, newArray.getClass().getComponentType());
    }

    @Test
    public void ArrayUtils47() {
        byte[] newArray;
        newArray = ArrayUtils.add((byte[])null, (byte)0);
        assertTrue(Arrays.equals(new byte[]{0}, newArray));
        assertEquals(Byte.TYPE, newArray.getClass().getComponentType());
        newArray = ArrayUtils.add((byte[])null, (byte)1);
        assertTrue(Arrays.equals(new byte[]{1}, newArray));
        assertEquals(Byte.TYPE, newArray.getClass().getComponentType());
        final byte[] array1 = new byte[]{1, 2, 3};
        newArray = ArrayUtils.add(array1, (byte)0);
        assertTrue(Arrays.equals(new byte[]{1, 2, 3, 0}, newArray));
        assertEquals(Byte.TYPE, newArray.getClass().getComponentType());
        newArray = ArrayUtils.add(array1, (byte)4);
        assertTrue(Arrays.equals(new byte[]{1, 2, 3, 4}, newArray));
        assertEquals(Byte.TYPE, newArray.getClass().getComponentType());
    }

    @Test
    public void ArrayUtils47() {
        char[] newArray;
        newArray = ArrayUtils.add((char[])null, (char)0);
        assertTrue(Arrays.equals(new char[]{0}, newArray));
        assertEquals(Character.TYPE, newArray.getClass().getComponentType());
        newArray = ArrayUtils.add((char[])null, (char)1);
        assertTrue(Arrays.equals(new char[]{1}, newArray));
        assertEquals(Character.TYPE, newArray.getClass().getComponentType());
        final char[] array1 = new char[]{1, 2, 3};
        newArray = ArrayUtils.add(array1, (char)0);
        assertTrue(Arrays.equals(new char[]{1, 2, 3, 0}, newArray));
        assertEquals(Character.TYPE, newArray.getClass().getComponentType());
        newArray = ArrayUtils.add(array1, (char)4);
        assertTrue(Arrays.equals(new char[]{1, 2, 3, 4}, newArray));
        assertEquals(Character.TYPE, newArray.getClass().getComponentType());
    }

    @Test
    public void ArrayUtils47() {
        double[] newArray;
        newArray = ArrayUtils.add((double[])null, 0);
        assertTrue(Arrays.equals(new double[]{0}, newArray));
        assertEquals(Double.TYPE, newArray.getClass().getComponentType());
        newArray = ArrayUtils.add((double[])null, 1);
        assertTrue(Arrays.equals(new double[]{1}, newArray));
        assertEquals(Double.TYPE, newArray.getClass().getComponentType());
        final double[] array1 = new double[]{1, 2, 3};
        newArray = ArrayUtils.add(array1, 0);
        assertTrue(Arrays.equals(new double[]{1, 2, 3, 0}, newArray));
        assertEquals(Double.TYPE, newArray.getClass().getComponentType());
        newArray = ArrayUtils.add(array1, 4);
        assertTrue(Arrays.equals(new double[]{1, 2, 3, 4}, newArray));
        assertEquals(Double.TYPE, newArray.getClass().getComponentType());
    }

    @Test
    public void ArrayUtils47() {
        float[] newArray;
        newArray = ArrayUtils.add((float[])null, 0);
        assertTrue(Arrays.equals(new float[]{0}, newArray));
        assertEquals(Float.TYPE, newArray.getClass().getComponentType());
        newArray = ArrayUtils.add((float[])null, 1);
        assertTrue(Arrays.equals(new float[]{1}, newArray));
        assertEquals(Float.TYPE, newArray.getClass().getComponentType());
        final float[] array1 = new float[]{1, 2, 3};
        newArray = ArrayUtils.add(array1, 0);
        assertTrue(Arrays.equals(new float[]{1, 2, 3, 0}, newArray));
        assertEquals(Float.TYPE, newArray.getClass().getComponentType());
        newArray = ArrayUtils.add(array1, 4);
        assertTrue(Arrays.equals(new float[]{1, 2, 3, 4}, newArray));
        assertEquals(Float.TYPE, newArray.getClass().getComponentType());
    }

    @Test
    public void ArrayUtils47() {
        int[] newArray;
        newArray = ArrayUtils.add((int[])null, 0);
        assertTrue(Arrays.equals(new int[]{0}, newArray));
        assertEquals(Integer.TYPE, newArray.getClass().getComponentType());
        newArray = ArrayUtils.add((int[])null, 1);
        assertTrue(Arrays.equals(new int[]{1}, newArray));
        assertEquals(Integer.TYPE, newArray.getClass().getComponentType());
        final int[] array1 = new int[]{1, 2, 3};
        newArray = ArrayUtils.add(array1, 0);
        assertTrue(Arrays.equals(new int[]{1, 2, 3, 0}, newArray));
        assertEquals(Integer.TYPE, newArray.getClass().getComponentType());
        newArray = ArrayUtils.add(array1, 4);
        assertTrue(Arrays.equals(new int[]{1, 2, 3, 4}, newArray));
        assertEquals(Integer.TYPE, newArray.getClass().getComponentType());
    }

    @Test
    public void ArrayUtils47() {
        long[] newArray;
        newArray = ArrayUtils.add((long[])null, 0);
        assertTrue(Arrays.equals(new long[]{0}, newArray));
        assertEquals(Long.TYPE, newArray.getClass().getComponentType());
        newArray = ArrayUtils.add((long[])null, 1);
        assertTrue(Arrays.equals(new long[]{1}, newArray));
        assertEquals(Long.TYPE, newArray.getClass().getComponentType());
        final long[] array1 = new long[]{1, 2, 3};
        newArray = ArrayUtils.add(array1, 0);
        assertTrue(Arrays.equals(new long[]{1, 2, 3, 0}, newArray));
        assertEquals(Long.TYPE, newArray.getClass().getComponentType());
        newArray = ArrayUtils.add(array1, 4);
        assertTrue(Arrays.equals(new long[]{1, 2, 3, 4}, newArray));
        assertEquals(Long.TYPE, newArray.getClass().getComponentType());
    }

    @Test
    public void ArrayUtils47() {
        short[] newArray;
        newArray = ArrayUtils.add((short[])null, (short)0);
        assertTrue(Arrays.equals(new short[]{0}, newArray));
        assertEquals(Short.TYPE, newArray.getClass().getComponentType());
        newArray = ArrayUtils.add((short[])null, (short)1);
        assertTrue(Arrays.equals(new short[]{1}, newArray));
        assertEquals(Short.TYPE, newArray.getClass().getComponentType());
        final short[] array1 = new short[]{1, 2, 3};
        newArray = ArrayUtils.add(array1, (short)0);
        assertTrue(Arrays.equals(new short[]{1, 2, 3, 0}, newArray));
        assertEquals(Short.TYPE, newArray.getClass().getComponentType());
        newArray = ArrayUtils.add(array1, (short)4);
        assertTrue(Arrays.equals(new short[]{1, 2, 3, 4}, newArray));
        assertEquals(Short.TYPE, newArray.getClass().getComponentType());
    }

    @Test
    public void ArrayUtils47() {
        Object[] newArray;

        //show that not casting is okay
        newArray = ArrayUtils.add((Object[])null, "a");
        assertTrue(Arrays.equals(new String[]{"a"}, newArray));
        assertTrue(Arrays.equals(new Object[]{"a"}, newArray));
        assertEquals(String.class, newArray.getClass().getComponentType());

        //show that not casting to Object[] is okay and will assume String based on "a"
        final String[] newStringArray = ArrayUtils.add(null, "a");
        assertTrue(Arrays.equals(new String[]{"a"}, newStringArray));
        assertTrue(Arrays.equals(new Object[]{"a"}, newStringArray));
        assertEquals(String.class, newStringArray.getClass().getComponentType());

        final String[] stringArray1 = new String[]{"a", "b", "c"};
        newArray = ArrayUtils.add(stringArray1, null);
        assertTrue(Arrays.equals(new String[]{"a", "b", "c", null}, newArray));
        assertEquals(String.class, newArray.getClass().getComponentType());

        newArray = ArrayUtils.add(stringArray1, "d");
        assertTrue(Arrays.equals(new String[]{"a", "b", "c", "d"}, newArray));
        assertEquals(String.class, newArray.getClass().getComponentType());

        Number[] numberArray1 = new Number[]{Integer.valueOf(1), Double.valueOf(2)};
        newArray = ArrayUtils.add(numberArray1, Float.valueOf(3));
        assertTrue(Arrays.equals(new Number[]{Integer.valueOf(1), Double.valueOf(2), Float.valueOf(3)}, newArray));
        assertEquals(Number.class, newArray.getClass().getComponentType());

        numberArray1 = null;
        newArray = ArrayUtils.add(numberArray1, Float.valueOf(3));
        assertTrue(Arrays.equals(new Float[]{Float.valueOf(3)}, newArray));
        assertEquals(Float.class, newArray.getClass().getComponentType());
    }
    
    @Test
    public void ArrayUtils47(){
        final String[] stringArray=null;
        final String aString=null;
        try {
            @SuppressWarnings("unused")
            final
            String[] sa = ArrayUtils.add(stringArray, aString);
            fail("Should have caused IllegalArgumentException");
        } catch (final IllegalArgumentException iae){
            //expected
        }
        try {
            @SuppressWarnings("unused")
            final
            String[] sa = ArrayUtils.add(stringArray, 0, aString);
            fail("Should have caused IllegalArgumentException");
        } catch (final IllegalArgumentException iae){
            //expected
        }
    }

   

}
