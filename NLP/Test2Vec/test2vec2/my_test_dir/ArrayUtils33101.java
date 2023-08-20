
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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.ArrayUtils}.
 *
 * @version $Id$
 */
public class ArrayUtilsTest  {

   @SuppressWarnings("cast")
    @Test
    public void ArrayUtils33() {
        float[] array = null;
        assertEquals(-1, ArrayUtils.lastIndexOf(array, (float) 0));
        array = new float[0];
        assertEquals(-1, ArrayUtils.lastIndexOf(array, (float) 0));
        array = new float[] { 0, 1, 2, 3, 0 };
        assertEquals(4, ArrayUtils.lastIndexOf(array, (float) 0));
        assertEquals(1, ArrayUtils.lastIndexOf(array, (float) 1));
        assertEquals(2, ArrayUtils.lastIndexOf(array, (float) 2));
        assertEquals(3, ArrayUtils.lastIndexOf(array, (float) 3));
        assertEquals(-1, ArrayUtils.lastIndexOf(array, (float) 99));
    }

    @SuppressWarnings("cast")
    @Test
    public void ArrayUtils33() {
        float[] array = null;
        assertEquals(-1, ArrayUtils.lastIndexOf(array, (float) 0, 2));
        array = new float[0];
        assertEquals(-1, ArrayUtils.lastIndexOf(array, (float) 0, 2));
        array = new float[] { 0, 1, 2, 3, 0 };
        assertEquals(0, ArrayUtils.lastIndexOf(array, (float) 0, 2));
        assertEquals(1, ArrayUtils.lastIndexOf(array, (float) 1, 2));
        assertEquals(2, ArrayUtils.lastIndexOf(array, (float) 2, 2));
        assertEquals(-1, ArrayUtils.lastIndexOf(array, (float) 3, 2));
        assertEquals(-1, ArrayUtils.lastIndexOf(array, (float) 3, -1));
        assertEquals(-1, ArrayUtils.lastIndexOf(array, (float) 99));
        assertEquals(4, ArrayUtils.lastIndexOf(array, (float) 0, 88));
    }

    @SuppressWarnings("cast")
    @Test
    public void ArrayUtils33() {
        float[] array = null;
        assertFalse(ArrayUtils.contains(array, (float) 1));
        array = new float[] { 0, 1, 2, 3, 0 };
        assertTrue(ArrayUtils.contains(array, (float) 0));
        assertTrue(ArrayUtils.contains(array, (float) 1));
        assertTrue(ArrayUtils.contains(array, (float) 2));
        assertTrue(ArrayUtils.contains(array, (float) 3));
        assertFalse(ArrayUtils.contains(array, (float) 99));
    }
    
    //-----------------------------------------------------------------------
    @Test
    public void ArrayUtils33() {
        boolean[] array = null;
        assertEquals(-1, ArrayUtils.indexOf(array, true));
        array = new boolean[0];
        assertEquals(-1, ArrayUtils.indexOf(array, true));
        array = new boolean[] { true, false, true };
        assertEquals(0, ArrayUtils.indexOf(array, true));
        assertEquals(1, ArrayUtils.indexOf(array, false));
        array = new boolean[] { true, true };
        assertEquals(-1, ArrayUtils.indexOf(array, false));
    }

    @Test
    public void ArrayUtils33() {
        boolean[] array = null;
        assertEquals(-1, ArrayUtils.indexOf(array, true, 2));
        array = new boolean[0];
        assertEquals(-1, ArrayUtils.indexOf(array, true, 2));
        array = new boolean[] { true, false, true };
        assertEquals(2, ArrayUtils.indexOf(array, true, 1));
        assertEquals(-1, ArrayUtils.indexOf(array, false, 2));
        assertEquals(1, ArrayUtils.indexOf(array, false, 0));
        assertEquals(1, ArrayUtils.indexOf(array, false, -1));
        array = new boolean[] { true, true };
        assertEquals(-1, ArrayUtils.indexOf(array, false, 0));
        assertEquals(-1, ArrayUtils.indexOf(array, false, -1));
    }

    @Test
    public void ArrayUtils33() {
        boolean[] array = null;
        assertEquals(-1, ArrayUtils.lastIndexOf(array, true));
        array = new boolean[0];
        assertEquals(-1, ArrayUtils.lastIndexOf(array, true));
        array = new boolean[] { true, false, true };
        assertEquals(2, ArrayUtils.lastIndexOf(array, true));
        assertEquals(1, ArrayUtils.lastIndexOf(array, false));
        array = new boolean[] { true, true };
        assertEquals(-1, ArrayUtils.lastIndexOf(array, false));
    }

    @Test
    public void ArrayUtils33() {
        boolean[] array = null;
        assertEquals(-1, ArrayUtils.lastIndexOf(array, true, 2));
        array = new boolean[0];
        assertEquals(-1, ArrayUtils.lastIndexOf(array, true, 2));
        array = new boolean[] { true, false, true };
        assertEquals(2, ArrayUtils.lastIndexOf(array, true, 2));
        assertEquals(0, ArrayUtils.lastIndexOf(array, true, 1));
        assertEquals(1, ArrayUtils.lastIndexOf(array, false, 2));
        assertEquals(-1, ArrayUtils.lastIndexOf(array, true, -1));
        array = new boolean[] { true, true };
        assertEquals(-1, ArrayUtils.lastIndexOf(array, false, 2));
        assertEquals(-1, ArrayUtils.lastIndexOf(array, true, -1));
    }

    @Test
    public void ArrayUtils33() {
        boolean[] array = null;
        assertFalse(ArrayUtils.contains(array, true));
        array = new boolean[] { true, false, true };
        assertTrue(ArrayUtils.contains(array, true));
        assertTrue(ArrayUtils.contains(array, false));
        array = new boolean[] { true, true };
        assertTrue(ArrayUtils.contains(array, true));
        assertFalse(ArrayUtils.contains(array, false));
    }
    
    // testToPrimitive/Object for boolean
    //  -----------------------------------------------------------------------
    @Test
    public void ArrayUtils33() {
        final Boolean[] b = null;
        assertEquals(null, ArrayUtils.toPrimitive(b));
        assertSame(ArrayUtils.EMPTY_BOOLEAN_ARRAY, ArrayUtils.toPrimitive(new Boolean[0]));
        assertTrue(Arrays.equals(
            new boolean[] {true, false, true},
            ArrayUtils.toPrimitive(new Boolean[] {Boolean.TRUE, Boolean.FALSE, Boolean.TRUE}))
        );

        try {
            ArrayUtils.toPrimitive(new Boolean[] {Boolean.TRUE, null});
            fail();
        } catch (final NullPointerException ex) {}
    }

    @Test
    public void ArrayUtils33() {
        assertEquals(null, ArrayUtils.toPrimitive(null, false));
        assertSame(ArrayUtils.EMPTY_BOOLEAN_ARRAY, ArrayUtils.toPrimitive(new Boolean[0], false));
        assertTrue(Arrays.equals(
            new boolean[] {true, false, true},
            ArrayUtils.toPrimitive(new Boolean[] {Boolean.TRUE, Boolean.FALSE, Boolean.TRUE}, false))
        );
        assertTrue(Arrays.equals(
            new boolean[] {true, false, false},
            ArrayUtils.toPrimitive(new Boolean[] {Boolean.TRUE, null, Boolean.FALSE}, false))
        );
        assertTrue(Arrays.equals(
            new boolean[] {true, true, false},
            ArrayUtils.toPrimitive(new Boolean[] {Boolean.TRUE, null, Boolean.FALSE}, true))
        );
    }

    @Test
    public void ArrayUtils33() {
        final boolean[] b = null;
        assertArrayEquals(null, ArrayUtils.toObject(b));
        assertSame(ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY, ArrayUtils.toObject(new boolean[0]));
        assertTrue(Arrays.equals(
            new Boolean[] {Boolean.TRUE, Boolean.FALSE, Boolean.TRUE},
            ArrayUtils.toObject(new boolean[] {true, false, true}))
        );
    }

    // testToPrimitive/Object for byte
    //  -----------------------------------------------------------------------
    @Test
    public void ArrayUtils33() {
        final Character[] b = null;
        assertEquals(null, ArrayUtils.toPrimitive(b));
        
        assertSame(ArrayUtils.EMPTY_CHAR_ARRAY, ArrayUtils.toPrimitive(new Character[0]));
        
        assertTrue(Arrays.equals(
            new char[] {Character.MIN_VALUE, Character.MAX_VALUE, '0'},
            ArrayUtils.toPrimitive(new Character[] {new Character(Character.MIN_VALUE), 
                new Character(Character.MAX_VALUE), new Character('0')}))
        );

        try {
            ArrayUtils.toPrimitive(new Character[] {new Character(Character.MIN_VALUE), null});
            fail();
        } catch (final NullPointerException ex) {}
    }

    @Test
    public void ArrayUtils33() {
        final Character[] b = null;
        assertEquals(null, ArrayUtils.toPrimitive(b, Character.MIN_VALUE));
        
        assertSame(ArrayUtils.EMPTY_CHAR_ARRAY, 
            ArrayUtils.toPrimitive(new Character[0], (char)0));
        
        assertTrue(Arrays.equals(
            new char[] {Character.MIN_VALUE, Character.MAX_VALUE, '0'},
            ArrayUtils.toPrimitive(new Character[] {new Character(Character.MIN_VALUE), 
                new Character(Character.MAX_VALUE), new Character('0')}, 
                Character.MIN_VALUE))
        );
        
        assertTrue(Arrays.equals(
            new char[] {Character.MIN_VALUE, Character.MAX_VALUE, '0'},
            ArrayUtils.toPrimitive(new Character[] {new Character(Character.MIN_VALUE), null, 
                new Character('0')}, Character.MAX_VALUE))
        );
    }

    @Test
    public void ArrayUtils33() {
        final char[] b = null;
        assertArrayEquals(null, ArrayUtils.toObject(b));
        
        assertSame(ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY, 
            ArrayUtils.toObject(new char[0]));
        
        assertTrue(Arrays.equals(
            new Character[] {new Character(Character.MIN_VALUE), 
                new Character(Character.MAX_VALUE), new Character('0')},
                ArrayUtils.toObject(new char[] {Character.MIN_VALUE, Character.MAX_VALUE, 
                '0'} ))
        );
    }
    
    // testToPrimitive/Object for byte
    //  -----------------------------------------------------------------------
    @Test
    public void ArrayUtils33() {
        final Byte[] b = null;
        assertEquals(null, ArrayUtils.toPrimitive(b));
        
        assertSame(ArrayUtils.EMPTY_BYTE_ARRAY, ArrayUtils.toPrimitive(new Byte[0]));
        
        assertTrue(Arrays.equals(
            new byte[] {Byte.MIN_VALUE, Byte.MAX_VALUE, (byte)9999999},
            ArrayUtils.toPrimitive(new Byte[] {Byte.valueOf(Byte.MIN_VALUE), 
                Byte.valueOf(Byte.MAX_VALUE), Byte.valueOf((byte)9999999)}))
        );

        try {
            ArrayUtils.toPrimitive(new Byte[] {Byte.valueOf(Byte.MIN_VALUE), null});
            fail();
        } catch (final NullPointerException ex) {}
    }

    @Test
    public void ArrayUtils33() {
        final Byte[] b = null;
        assertEquals(null, ArrayUtils.toPrimitive(b, Byte.MIN_VALUE));
        
        assertSame(ArrayUtils.EMPTY_BYTE_ARRAY, 
            ArrayUtils.toPrimitive(new Byte[0], (byte)1));
        
        assertTrue(Arrays.equals(
            new byte[] {Byte.MIN_VALUE, Byte.MAX_VALUE, (byte)9999999},
            ArrayUtils.toPrimitive(new Byte[] {Byte.valueOf(Byte.MIN_VALUE), 
                Byte.valueOf(Byte.MAX_VALUE), Byte.valueOf((byte)9999999)}, 
                Byte.MIN_VALUE))
        );
        
        assertTrue(Arrays.equals(
            new byte[] {Byte.MIN_VALUE, Byte.MAX_VALUE, (byte)9999999},
            ArrayUtils.toPrimitive(new Byte[] {Byte.valueOf(Byte.MIN_VALUE), null, 
                Byte.valueOf((byte)9999999)}, Byte.MAX_VALUE))
        );
    }

    @Test
    public void ArrayUtils33() {
        final byte[] b = null;
        assertArrayEquals(null, ArrayUtils.toObject(b));
        
        assertSame(ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY, 
            ArrayUtils.toObject(new byte[0]));
        
        assertTrue(Arrays.equals(
            new Byte[] {Byte.valueOf(Byte.MIN_VALUE), 
                Byte.valueOf(Byte.MAX_VALUE), Byte.valueOf((byte)9999999)},
                ArrayUtils.toObject(new byte[] {Byte.MIN_VALUE, Byte.MAX_VALUE, 
                (byte)9999999}))
        );
    }

    // testToPrimitive/Object for short
    //  -----------------------------------------------------------------------
    @Test
    public void ArrayUtils33() {
        final Short[] b = null;
        assertEquals(null, ArrayUtils.toPrimitive(b));
        
        assertSame(ArrayUtils.EMPTY_SHORT_ARRAY, ArrayUtils.toPrimitive(new Short[0]));
        
        assertTrue(Arrays.equals(
            new short[] {Short.MIN_VALUE, Short.MAX_VALUE, (short)9999999},
            ArrayUtils.toPrimitive(new Short[] {Short.valueOf(Short.MIN_VALUE), 
                Short.valueOf(Short.MAX_VALUE), Short.valueOf((short)9999999)}))
        );

        try {
            ArrayUtils.toPrimitive(new Short[] {Short.valueOf(Short.MIN_VALUE), null});
            fail();
        } catch (final NullPointerException ex) {}
    }

    @Test
    public void ArrayUtils33() {
        final Short[] s = null;
        assertEquals(null, ArrayUtils.toPrimitive(s, Short.MIN_VALUE));
        
        assertSame(ArrayUtils.EMPTY_SHORT_ARRAY, ArrayUtils.toPrimitive(new Short[0], 
        Short.MIN_VALUE));
        
        assertTrue(Arrays.equals(
            new short[] {Short.MIN_VALUE, Short.MAX_VALUE, (short)9999999},
            ArrayUtils.toPrimitive(new Short[] {Short.valueOf(Short.MIN_VALUE), 
                Short.valueOf(Short.MAX_VALUE), Short.valueOf((short)9999999)}, Short.MIN_VALUE))
        );
        
        assertTrue(Arrays.equals(
            new short[] {Short.MIN_VALUE, Short.MAX_VALUE, (short)9999999},
            ArrayUtils.toPrimitive(new Short[] {Short.valueOf(Short.MIN_VALUE), null, 
                Short.valueOf((short)9999999)}, Short.MAX_VALUE))
        );
    }

    @Test
    public void ArrayUtils33() {
        final short[] b = null;
        assertArrayEquals(null, ArrayUtils.toObject(b));
        
        assertSame(ArrayUtils.EMPTY_SHORT_OBJECT_ARRAY, 
        ArrayUtils.toObject(new short[0]));
        
        assertTrue(Arrays.equals(
            new Short[] {Short.valueOf(Short.MIN_VALUE), Short.valueOf(Short.MAX_VALUE), 
                Short.valueOf((short)9999999)},
            ArrayUtils.toObject(new short[] {Short.MIN_VALUE, Short.MAX_VALUE, 
                (short)9999999}))
        );
    }

    //  testToPrimitive/Object for int
    //  -----------------------------------------------------------------------
     @Test
     public void ArrayUtils33() {
         final Integer[] b = null;
         assertEquals(null, ArrayUtils.toPrimitive(b));
         assertSame(ArrayUtils.EMPTY_INT_ARRAY, ArrayUtils.toPrimitive(new Integer[0]));
         assertTrue(Arrays.equals(
             new int[] {Integer.MIN_VALUE, Integer.MAX_VALUE, 9999999},
             ArrayUtils.toPrimitive(new Integer[] {Integer.valueOf(Integer.MIN_VALUE), 
                 Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(9999999)}))
         );

         try {
             ArrayUtils.toPrimitive(new Integer[] {Integer.valueOf(Integer.MIN_VALUE), null});
             fail();
         } catch (final NullPointerException ex) {}
     }

     @Test
     public void ArrayUtils33() {
         final Long[] l = null;
         assertEquals(null, ArrayUtils.toPrimitive(l, Integer.MIN_VALUE));
         assertSame(ArrayUtils.EMPTY_INT_ARRAY, 
         ArrayUtils.toPrimitive(new Integer[0], 1));
         assertTrue(Arrays.equals(
             new int[] {Integer.MIN_VALUE, Integer.MAX_VALUE, 9999999},
             ArrayUtils.toPrimitive(new Integer[] {Integer.valueOf(Integer.MIN_VALUE), 
                 Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(9999999)},1)));
         assertTrue(Arrays.equals(
             new int[] {Integer.MIN_VALUE, Integer.MAX_VALUE, 9999999},
             ArrayUtils.toPrimitive(new Integer[] {Integer.valueOf(Integer.MIN_VALUE), 
                 null, Integer.valueOf(9999999)}, Integer.MAX_VALUE))
         );
     }
     
    @Test
    public void ArrayUtils33() {
        final Integer[] iArray = null;
        assertEquals(null, ArrayUtils.toPrimitive(iArray, Integer.MIN_VALUE));
    }

    @Test
    public void ArrayUtils33() {
        final int[] b = null;
        assertArrayEquals(null, ArrayUtils.toObject(b));
    
        assertSame(
            ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY,
            ArrayUtils.toObject(new int[0]));
    
        assertTrue(
            Arrays.equals(
                new Integer[] {
                    Integer.valueOf(Integer.MIN_VALUE),
                    Integer.valueOf(Integer.MAX_VALUE),
                    Integer.valueOf(9999999)},
            ArrayUtils.toObject(
                new int[] { Integer.MIN_VALUE, Integer.MAX_VALUE, 9999999 })));
    }

    //  testToPrimitive/Object for long
    //  -----------------------------------------------------------------------
     @Test
     public void ArrayUtils33() {
         final Long[] b = null;
         assertEquals(null, ArrayUtils.toPrimitive(b));
         
         assertSame(ArrayUtils.EMPTY_LONG_ARRAY, 
            ArrayUtils.toPrimitive(new Long[0]));
         
         assertTrue(Arrays.equals(
             new long[] {Long.MIN_VALUE, Long.MAX_VALUE, 9999999},
             ArrayUtils.toPrimitive(new Long[] {Long.valueOf(Long.MIN_VALUE), 
                 Long.valueOf(Long.MAX_VALUE), Long.valueOf(9999999)}))
         );

         try {
             ArrayUtils.toPrimitive(new Long[] {Long.valueOf(Long.MIN_VALUE), null});
             fail();
         } catch (final NullPointerException ex) {}
     }

     @Test
     public void ArrayUtils33() {
         final Long[] l = null;
         assertEquals(null, ArrayUtils.toPrimitive(l, Long.MIN_VALUE));
         
         assertSame(ArrayUtils.EMPTY_LONG_ARRAY, 
         ArrayUtils.toPrimitive(new Long[0], 1));
         
         assertTrue(Arrays.equals(
             new long[] {Long.MIN_VALUE, Long.MAX_VALUE, 9999999},
             ArrayUtils.toPrimitive(new Long[] {Long.valueOf(Long.MIN_VALUE), 
                 Long.valueOf(Long.MAX_VALUE), Long.valueOf(9999999)},1)));
         
         assertTrue(Arrays.equals(
             new long[] {Long.MIN_VALUE, Long.MAX_VALUE, 9999999},
             ArrayUtils.toPrimitive(new Long[] {Long.valueOf(Long.MIN_VALUE), 
                 null, Long.valueOf(9999999)}, Long.MAX_VALUE))
         );
     }
     
    @Test
    public void ArrayUtils33() {
        final long[] b = null;
        assertArrayEquals(null, ArrayUtils.toObject(b));
    
        assertSame(
            ArrayUtils.EMPTY_LONG_OBJECT_ARRAY,
            ArrayUtils.toObject(new long[0]));
    
        assertTrue(
            Arrays.equals(
                new Long[] {
                    Long.valueOf(Long.MIN_VALUE),
                    Long.valueOf(Long.MAX_VALUE),
                    Long.valueOf(9999999)},
            ArrayUtils.toObject(
                new long[] { Long.MIN_VALUE, Long.MAX_VALUE, 9999999 })));
    }

    //  testToPrimitive/Object for float
    //  -----------------------------------------------------------------------
     @Test
     public void ArrayUtils33() {
         final Float[] b = null;
         assertEquals(null, ArrayUtils.toPrimitive(b));
         
         assertSame(ArrayUtils.EMPTY_FLOAT_ARRAY, 
            ArrayUtils.toPrimitive(new Float[0]));
         
         assertTrue(Arrays.equals(
             new float[] {Float.MIN_VALUE, Float.MAX_VALUE, 9999999},
             ArrayUtils.toPrimitive(new Float[] {Float.valueOf(Float.MIN_VALUE), 
                 Float.valueOf(Float.MAX_VALUE), Float.valueOf(9999999)}))
         );

         try {
             ArrayUtils.toPrimitive(new Float[] {Float.valueOf(Float.MIN_VALUE), null});
             fail();
         } catch (final NullPointerException ex) {}
     }

     @Test
     public void ArrayUtils33() {
         final Float[] l = null;
         assertEquals(null, ArrayUtils.toPrimitive(l, Float.MIN_VALUE));
         
         assertSame(ArrayUtils.EMPTY_FLOAT_ARRAY, 
         ArrayUtils.toPrimitive(new Float[0], 1));
         
         assertTrue(Arrays.equals(
             new float[] {Float.MIN_VALUE, Float.MAX_VALUE, 9999999},
             ArrayUtils.toPrimitive(new Float[] {Float.valueOf(Float.MIN_VALUE), 
                 Float.valueOf(Float.MAX_VALUE), Float.valueOf(9999999)},1)));
         
         assertTrue(Arrays.equals(
             new float[] {Float.MIN_VALUE, Float.MAX_VALUE, 9999999},
             ArrayUtils.toPrimitive(new Float[] {Float.valueOf(Float.MIN_VALUE), 
                 null, Float.valueOf(9999999)}, Float.MAX_VALUE))
         );
     }
     
    @Test
    public void ArrayUtils33() {
        final float[] b = null;
        assertArrayEquals(null, ArrayUtils.toObject(b));
    
        assertSame(
            ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY,
            ArrayUtils.toObject(new float[0]));
    
        assertTrue(
            Arrays.equals(
                new Float[] {
                    Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE),
                    Float.valueOf(9999999)},
            ArrayUtils.toObject(
                new float[] { Float.MIN_VALUE, Float.MAX_VALUE, 9999999 })));
    }

    //  testToPrimitive/Object for double
    //  -----------------------------------------------------------------------
     @Test
     public void ArrayUtils33() {
         final Double[] b = null;
         assertEquals(null, ArrayUtils.toPrimitive(b));
         
         assertSame(ArrayUtils.EMPTY_DOUBLE_ARRAY, 
            ArrayUtils.toPrimitive(new Double[0]));
         
         assertTrue(Arrays.equals(
             new double[] {Double.MIN_VALUE, Double.MAX_VALUE, 9999999},
             ArrayUtils.toPrimitive(new Double[] {Double.valueOf(Double.MIN_VALUE), 
                 Double.valueOf(Double.MAX_VALUE), Double.valueOf(9999999)}))
         );

         try {
             ArrayUtils.toPrimitive(new Float[] {Float.valueOf(Float.MIN_VALUE), null});
             fail();
         } catch (final NullPointerException ex) {}
     }

     @Test
     public void ArrayUtils33() {
         final Double[] l = null;
         assertEquals(null, ArrayUtils.toPrimitive(l, Double.MIN_VALUE));
         
         assertSame(ArrayUtils.EMPTY_DOUBLE_ARRAY, 
         ArrayUtils.toPrimitive(new Double[0], 1));
         
         assertTrue(Arrays.equals(
             new double[] {Double.MIN_VALUE, Double.MAX_VALUE, 9999999},
             ArrayUtils.toPrimitive(new Double[] {Double.valueOf(Double.MIN_VALUE), 
                 Double.valueOf(Double.MAX_VALUE), Double.valueOf(9999999)},1)));
         
         assertTrue(Arrays.equals(
             new double[] {Double.MIN_VALUE, Double.MAX_VALUE, 9999999},
             ArrayUtils.toPrimitive(new Double[] {Double.valueOf(Double.MIN_VALUE), 
                 null, Double.valueOf(9999999)}, Double.MAX_VALUE))
         );
     }
     
    @Test
    public void ArrayUtils33() {
        final double[] b = null;
        assertArrayEquals(null, ArrayUtils.toObject(b));
    
        assertSame(
            ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY,
            ArrayUtils.toObject(new double[0]));
    
        assertTrue(
            Arrays.equals(
                new Double[] {
                    Double.valueOf(Double.MIN_VALUE),
                    Double.valueOf(Double.MAX_VALUE),
                    Double.valueOf(9999999)},
            ArrayUtils.toObject(
                new double[] { Double.MIN_VALUE, Double.MAX_VALUE, 9999999 })));
    }

    //-----------------------------------------------------------------------
    /**
     * Test for {@link ArrayUtils#isEmpty(java.lang.Object[])}.
     */
    @Test
    public void ArrayUtils33() {
        final Object[] emptyArray = new Object[] {};
        final Object[] notEmptyArray = new Object[] { new String("Value") };
        assertTrue(ArrayUtils.isEmpty((Object[])null));
        assertTrue(ArrayUtils.isEmpty(emptyArray));
        assertFalse(ArrayUtils.isEmpty(notEmptyArray));
    }

    /**
     * Tests for {@link ArrayUtils#isEmpty(long[])},
     * {@link ArrayUtils#isEmpty(int[])},
     * {@link ArrayUtils#isEmpty(short[])},
     * {@link ArrayUtils#isEmpty(char[])},
     * {@link ArrayUtils#isEmpty(byte[])},
     * {@link ArrayUtils#isEmpty(double[])},
     * {@link ArrayUtils#isEmpty(float[])} and
     * {@link ArrayUtils#isEmpty(boolean[])}.
     */
    @Test
    public void ArrayUtils33() {
        final long[] emptyLongArray = new long[] {};
        final long[] notEmptyLongArray = new long[] { 1L };
        assertTrue(ArrayUtils.isEmpty((long[])null));
        assertTrue(ArrayUtils.isEmpty(emptyLongArray));
        assertFalse(ArrayUtils.isEmpty(notEmptyLongArray));

        final int[] emptyIntArray = new int[] {};
        final int[] notEmptyIntArray = new int[] { 1 };
        assertTrue(ArrayUtils.isEmpty((int[])null));
        assertTrue(ArrayUtils.isEmpty(emptyIntArray));
        assertFalse(ArrayUtils.isEmpty(notEmptyIntArray));

        final short[] emptyShortArray = new short[] {};
        final short[] notEmptyShortArray = new short[] { 1 };
        assertTrue(ArrayUtils.isEmpty((short[])null));
        assertTrue(ArrayUtils.isEmpty(emptyShortArray));
        assertFalse(ArrayUtils.isEmpty(notEmptyShortArray));

        final char[] emptyCharArray = new char[] {};
        final char[] notEmptyCharArray = new char[] { 1 };
        assertTrue(ArrayUtils.isEmpty((char[])null));
        assertTrue(ArrayUtils.isEmpty(emptyCharArray));
        assertFalse(ArrayUtils.isEmpty(notEmptyCharArray));

        final byte[] emptyByteArray = new byte[] {};
        final byte[] notEmptyByteArray = new byte[] { 1 };
        assertTrue(ArrayUtils.isEmpty((byte[])null));
        assertTrue(ArrayUtils.isEmpty(emptyByteArray));
        assertFalse(ArrayUtils.isEmpty(notEmptyByteArray));

        final double[] emptyDoubleArray = new double[] {};
        final double[] notEmptyDoubleArray = new double[] { 1.0 };
        assertTrue(ArrayUtils.isEmpty((double[])null));
        assertTrue(ArrayUtils.isEmpty(emptyDoubleArray));
        assertFalse(ArrayUtils.isEmpty(notEmptyDoubleArray));

        final float[] emptyFloatArray = new float[] {};
        final float[] notEmptyFloatArray = new float[] { 1.0F };
        assertTrue(ArrayUtils.isEmpty((float[])null));
        assertTrue(ArrayUtils.isEmpty(emptyFloatArray));
        assertFalse(ArrayUtils.isEmpty(notEmptyFloatArray));

        final boolean[] emptyBooleanArray = new boolean[] {};
        final boolean[] notEmptyBooleanArray = new boolean[] { true };
        assertTrue(ArrayUtils.isEmpty((boolean[])null));
        assertTrue(ArrayUtils.isEmpty(emptyBooleanArray));
        assertFalse(ArrayUtils.isEmpty(notEmptyBooleanArray));
    }
    
   /**
     * Test for {@link ArrayUtils#isNotEmpty(java.lang.Object[])}.
     */
    @Test
    public void ArrayUtils33() {
        final Object[] emptyArray = new Object[] {};
        final Object[] notEmptyArray = new Object[] { new String("Value") };
        assertFalse(ArrayUtils.isNotEmpty((Object[])null));
        assertFalse(ArrayUtils.isNotEmpty(emptyArray));
        assertTrue(ArrayUtils.isNotEmpty(notEmptyArray));
    }

   /**
     * Tests for {@link ArrayUtils#isNotEmpty(long[])},
     * {@link ArrayUtils#isNotEmpty(int[])},
     * {@link ArrayUtils#isNotEmpty(short[])},
     * {@link ArrayUtils#isNotEmpty(char[])},
     * {@link ArrayUtils#isNotEmpty(byte[])},
     * {@link ArrayUtils#isNotEmpty(double[])},
     * {@link ArrayUtils#isNotEmpty(float[])} and
     * {@link ArrayUtils#isNotEmpty(boolean[])}.
     */
    @Test
    public void ArrayUtils33() {
        final long[] emptyLongArray = new long[] {};
        final long[] notEmptyLongArray = new long[] { 1L };
        assertFalse(ArrayUtils.isNotEmpty((long[])null));
        assertFalse(ArrayUtils.isNotEmpty(emptyLongArray));
        assertTrue(ArrayUtils.isNotEmpty(notEmptyLongArray));

        final int[] emptyIntArray = new int[] {};
        final int[] notEmptyIntArray = new int[] { 1 };
        assertFalse(ArrayUtils.isNotEmpty((int[])null));
        assertFalse(ArrayUtils.isNotEmpty(emptyIntArray));
        assertTrue(ArrayUtils.isNotEmpty(notEmptyIntArray));

        final short[] emptyShortArray = new short[] {};
        final short[] notEmptyShortArray = new short[] { 1 };
        assertFalse(ArrayUtils.isNotEmpty((short[])null));
        assertFalse(ArrayUtils.isNotEmpty(emptyShortArray));
        assertTrue(ArrayUtils.isNotEmpty(notEmptyShortArray));

        final char[] emptyCharArray = new char[] {};
        final char[] notEmptyCharArray = new char[] { 1 };
        assertFalse(ArrayUtils.isNotEmpty((char[])null));
        assertFalse(ArrayUtils.isNotEmpty(emptyCharArray));
        assertTrue(ArrayUtils.isNotEmpty(notEmptyCharArray));

        final byte[] emptyByteArray = new byte[] {};
        final byte[] notEmptyByteArray = new byte[] { 1 };
        assertFalse(ArrayUtils.isNotEmpty((byte[])null));
        assertFalse(ArrayUtils.isNotEmpty(emptyByteArray));
        assertTrue(ArrayUtils.isNotEmpty(notEmptyByteArray));

        final double[] emptyDoubleArray = new double[] {};
        final double[] notEmptyDoubleArray = new double[] { 1.0 };
        assertFalse(ArrayUtils.isNotEmpty((double[])null));
        assertFalse(ArrayUtils.isNotEmpty(emptyDoubleArray));
        assertTrue(ArrayUtils.isNotEmpty(notEmptyDoubleArray));

        final float[] emptyFloatArray = new float[] {};
        final float[] notEmptyFloatArray = new float[] { 1.0F };
        assertFalse(ArrayUtils.isNotEmpty((float[])null));
        assertFalse(ArrayUtils.isNotEmpty(emptyFloatArray));
        assertTrue(ArrayUtils.isNotEmpty(notEmptyFloatArray));

        final boolean[] emptyBooleanArray = new boolean[] {};
        final boolean[] notEmptyBooleanArray = new boolean[] { true };
        assertFalse(ArrayUtils.isNotEmpty((boolean[])null));
        assertFalse(ArrayUtils.isNotEmpty(emptyBooleanArray));
        assertTrue(ArrayUtils.isNotEmpty(notEmptyBooleanArray));
    }
    // ------------------------------------------------------------------------
    @Test
    public void ArrayUtils33() {
        assertEquals(0, ArrayUtils.getLength(null));
        
        final Object[] emptyObjectArray = new Object[0];
        final Object[] notEmptyObjectArray = new Object[] {"aValue"};
        assertEquals(0, ArrayUtils.getLength((Object[]) null));
        assertEquals(0, ArrayUtils.getLength(emptyObjectArray));
        assertEquals(1, ArrayUtils.getLength(notEmptyObjectArray));
 
        final int[] emptyIntArray = new int[] {};
        final int[] notEmptyIntArray = new int[] { 1 };
        assertEquals(0, ArrayUtils.getLength((int[]) null));
        assertEquals(0, ArrayUtils.getLength(emptyIntArray));
        assertEquals(1, ArrayUtils.getLength(notEmptyIntArray));

        final short[] emptyShortArray = new short[] {};
        final short[] notEmptyShortArray = new short[] { 1 };
        assertEquals(0, ArrayUtils.getLength((short[]) null));
        assertEquals(0, ArrayUtils.getLength(emptyShortArray));
        assertEquals(1, ArrayUtils.getLength(notEmptyShortArray));

        final char[] emptyCharArray = new char[] {};
        final char[] notEmptyCharArray = new char[] { 1 };
        assertEquals(0, ArrayUtils.getLength((char[]) null));
        assertEquals(0, ArrayUtils.getLength(emptyCharArray));
        assertEquals(1, ArrayUtils.getLength(notEmptyCharArray));

        final byte[] emptyByteArray = new byte[] {};
        final byte[] notEmptyByteArray = new byte[] { 1 };
        assertEquals(0, ArrayUtils.getLength((byte[]) null));
        assertEquals(0, ArrayUtils.getLength(emptyByteArray));
        assertEquals(1, ArrayUtils.getLength(notEmptyByteArray));

        final double[] emptyDoubleArray = new double[] {};
        final double[] notEmptyDoubleArray = new double[] { 1.0 };
        assertEquals(0, ArrayUtils.getLength((double[]) null));
        assertEquals(0, ArrayUtils.getLength(emptyDoubleArray));
        assertEquals(1, ArrayUtils.getLength(notEmptyDoubleArray));

        final float[] emptyFloatArray = new float[] {};
        final float[] notEmptyFloatArray = new float[] { 1.0F };
        assertEquals(0, ArrayUtils.getLength((float[]) null));
        assertEquals(0, ArrayUtils.getLength(emptyFloatArray));
        assertEquals(1, ArrayUtils.getLength(notEmptyFloatArray));

        final boolean[] emptyBooleanArray = new boolean[] {};
        final boolean[] notEmptyBooleanArray = new boolean[] { true };
        assertEquals(0, ArrayUtils.getLength((boolean[]) null));
        assertEquals(0, ArrayUtils.getLength(emptyBooleanArray));
        assertEquals(1, ArrayUtils.getLength(notEmptyBooleanArray));
        
        try {
            ArrayUtils.getLength("notAnArray");
            fail("IllegalArgumentException should have been thrown");
        } catch (final IllegalArgumentException e) {}
    }

}
