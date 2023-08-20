
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
package org.apache.commons.lang3.builder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigInteger;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.builder.CompareToBuilder}.
 *
 * @version $Id$
 */
public class CompareToBuilderTest {

    //-----------------------------------------------------------------------

    static class TestObject implements Comparable<TestObject> {
        private int a;
        public TestObject(final int a) {
            this.a = a;
        }
        @Override
        public boolean equals(final Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof TestObject)) {
                return false;
            }
            final TestObject rhs = (TestObject) o;
            return a == rhs.a;
        }

        @Override
        public int hashCode() {
            return a;
        }

        public void setA(final int a) {
            this.a = a;
        }

        public int getA() {
            return a;
        }
        @Override
        public int compareTo(final TestObject rhs) {
            return a < rhs.a ? -1 : a > rhs.a ? +1 : 0;
        }
    }

    static class TestSubObject extends TestObject {
        private int b;
        public TestSubObject() {
            super(0);
        }
        public TestSubObject(final int a, final int b) {
            super(a);
            this.b = b;
        }
        @Override
        public boolean equals(final Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof TestSubObject)) {
                return false;
            }
            final TestSubObject rhs = (TestSubObject) o;
            return super.equals(o) && b == rhs.b;
        }
    }

    static class TestTransientSubObject extends TestObject {
        @SuppressWarnings("unused")
        private transient int t;
        public TestTransientSubObject(final int a, final int t) {
            super(a);
            this.t = t;
        }
    }
    
     @Test
    public void CompareToBuilder() {
        final char[][] array1 = new char[2][2];
        final char[][] array2 = new char[2][2];
        final char[][] array3 = new char[2][3];
        for (short i = 0; i < array1.length; ++i) {
            for (short j = 0; j < array1[0].length; j++) {
                array1[i][j] = (char)((i + 1) * (j + 1));
                array2[i][j] = (char)((i + 1) * (j + 1));
                array3[i][j] = (char)((i + 1) * (j + 1));
            }
        }
        array3[1][2] = 100;
        array3[1][2] = 100;
        
        assertTrue(new CompareToBuilder().append(array1, array1).toComparison() == 0);
        assertTrue(new CompareToBuilder().append(array1, array2).toComparison() == 0);
        assertTrue(new CompareToBuilder().append(array1, array3).toComparison() < 0);
        assertTrue(new CompareToBuilder().append(array3, array1).toComparison() > 0);
        array1[1][1] = 200;
        assertTrue(new CompareToBuilder().append(array1, array2).toComparison() > 0);
        assertTrue(new CompareToBuilder().append(array2, array1).toComparison() < 0);
    }

    @Test
    public void CompareToBuilder() {
        final byte[][] array1 = new byte[2][2];
        final byte[][] array2 = new byte[2][2];
        final byte[][] array3 = new byte[2][3];
        for (byte i = 0; i < array1.length; ++i) {
            for (byte j = 0; j < array1[0].length; j++) {
                array1[i][j] = (byte)((i + 1) * (j + 1));
                array2[i][j] = (byte)((i + 1) * (j + 1));
                array3[i][j] = (byte)((i + 1) * (j + 1));
            }
        }
        array3[1][2] = 100;
        array3[1][2] = 100;
        
        assertTrue(new CompareToBuilder().append(array1, array1).toComparison() == 0);
        assertTrue(new CompareToBuilder().append(array1, array2).toComparison() == 0);
        assertTrue(new CompareToBuilder().append(array1, array3).toComparison() < 0);
        assertTrue(new CompareToBuilder().append(array3, array1).toComparison() > 0);
        array1[1][1] = 127;
        assertTrue(new CompareToBuilder().append(array1, array2).toComparison() > 0);
        assertTrue(new CompareToBuilder().append(array2, array1).toComparison() < 0);
    }
    
    @Test
    public void CompareToBuilder() {
        final float[][] array1 = new float[2][2];
        final float[][] array2 = new float[2][2];
        final float[][] array3 = new float[2][3];
        for (int i = 0; i < array1.length; ++i) {
            for (int j = 0; j < array1[0].length; j++) {
                array1[i][j] = (i + 1) * (j + 1);
                array2[i][j] = (i + 1) * (j + 1);
                array3[i][j] = (i + 1) * (j + 1);
            }
        }
        array3[1][2] = 100;
        array3[1][2] = 100;
        
        assertTrue(new CompareToBuilder().append(array1, array1).toComparison() == 0);
        assertTrue(new CompareToBuilder().append(array1, array2).toComparison() == 0);
        assertTrue(new CompareToBuilder().append(array1, array3).toComparison() < 0);
        assertTrue(new CompareToBuilder().append(array3, array1).toComparison() > 0);
        array1[1][1] = 127;
        assertTrue(new CompareToBuilder().append(array1, array2).toComparison() > 0);
        assertTrue(new CompareToBuilder().append(array2, array1).toComparison() < 0);
    }

    @Test
    public void CompareToBuilder() {
        final double[][] array1 = new double[2][2];
        final double[][] array2 = new double[2][2];
        final double[][] array3 = new double[2][3];
        for (int i = 0; i < array1.length; ++i) {
            for (int j = 0; j < array1[0].length; j++) {
                array1[i][j] = (i + 1) * (j + 1);
                array2[i][j] = (i + 1) * (j + 1);
                array3[i][j] = (i + 1) * (j + 1);
            }
        }
        array3[1][2] = 100;
        array3[1][2] = 100;
        
        assertTrue(new CompareToBuilder().append(array1, array1).toComparison() == 0);
        assertTrue(new CompareToBuilder().append(array1, array2).toComparison() == 0);
        assertTrue(new CompareToBuilder().append(array1, array3).toComparison() < 0);
        assertTrue(new CompareToBuilder().append(array3, array1).toComparison() > 0);
        array1[1][1] = 127;
        assertTrue(new CompareToBuilder().append(array1, array2).toComparison() > 0);
        assertTrue(new CompareToBuilder().append(array2, array1).toComparison() < 0);
    }

    @Test
    public void CompareToBuilder() {
        final boolean[][] array1 = new boolean[2][2];
        final boolean[][] array2 = new boolean[2][2];
        final boolean[][] array3 = new boolean[2][3];
        for (int i = 0; i < array1.length; ++i) {
            for (int j = 0; j < array1[0].length; j++) {
                array1[i][j] = i == 1 ^ j == 1;
                array2[i][j] = i == 1 ^ j == 1;
                array3[i][j] = i == 1 ^ j == 1;
            }
        }
        array3[1][2] = false;
        array3[1][2] = false;
        
        assertTrue(new CompareToBuilder().append(array1, array1).toComparison() == 0);
        assertTrue(new CompareToBuilder().append(array1, array2).toComparison() == 0);
        assertTrue(new CompareToBuilder().append(array1, array3).toComparison() < 0);
        assertTrue(new CompareToBuilder().append(array3, array1).toComparison() > 0);
        array1[1][1] = true;
        assertTrue(new CompareToBuilder().append(array1, array2).toComparison() > 0);
        assertTrue(new CompareToBuilder().append(array2, array1).toComparison() < 0);
    }

    @Test
    public void CompareToBuilder() {
        final long array1[][] = new long[2][];
        final long array2[][] = new long[2][];
        final long array3[][] = new long[3][];
        for (int i = 0; i < array1.length; ++i) {
            array1[i] = new long[2];
            array2[i] = new long[2];
            array3[i] = new long[3];
            for (int j = 0; j < array1[i].length; ++j) {
                array1[i][j] = (i + 1) * (j + 1);
                array2[i][j] = (i + 1) * (j + 1);
                array3[i][j] = (i + 1) * (j + 1);
            }
        }
        array3[1][2] = 100;
        array3[1][2] = 100;
        
        
        assertTrue(new CompareToBuilder().append(array1, array1).toComparison() == 0);
        assertTrue(new CompareToBuilder().append(array1, array2).toComparison() == 0);
        assertTrue(new CompareToBuilder().append(array1, array3).toComparison() < 0);
        assertTrue(new CompareToBuilder().append(array3, array1).toComparison() > 0);
        array1[1][1] = 200;
        assertTrue(new CompareToBuilder().append(array1, array2).toComparison() > 0);
        assertTrue(new CompareToBuilder().append(array2, array1).toComparison() < 0);
    }

    @Test
    public void CompareToBuilder() {
        final Object array1[] = new Object[2];
        final Object array2[] = new Object[2];
        final Object array3[] = new Object[2];
        for (int i = 0; i < array1.length; ++i) {
            array1[i] = new long[2];
            array2[i] = new long[2];
            array3[i] = new long[3];
            for (int j = 0; j < 2; ++j) {
                ((long[]) array1[i])[j] = (i + 1) * (j + 1);
                ((long[]) array2[i])[j] = (i + 1) * (j + 1);
                ((long[]) array3[i])[j] = (i + 1) * (j + 1);
            }
        }
        ((long[]) array3[0])[2] = 1;
        ((long[]) array3[1])[2] = 1;
        assertTrue(new CompareToBuilder().append(array1, array1).toComparison() == 0);
        assertTrue(new CompareToBuilder().append(array1, array2).toComparison() == 0);
        assertTrue(new CompareToBuilder().append(array1, array3).toComparison() < 0);
        assertTrue(new CompareToBuilder().append(array3, array1).toComparison() > 0);
        ((long[]) array1[1])[1] = 200;
        assertTrue(new CompareToBuilder().append(array1, array2).toComparison() > 0);
        assertTrue(new CompareToBuilder().append(array2, array1).toComparison() < 0);
    }

    @Test
    public void CompareToBuilder() {
        final TestObject[] array1 = new TestObject[2];
        array1[0] = new TestObject(4);
        array1[1] = new TestObject(5);
        final TestObject[] array2 = new TestObject[2];
        array2[0] = new TestObject(4);
        array2[1] = new TestObject(5);
        final TestObject[] array3 = new TestObject[3];
        array3[0] = new TestObject(4);
        array3[1] = new TestObject(5);
        array3[2] = new TestObject(6);
        
        final Object obj1 = array1;
        final Object obj2 = array2;
        final Object obj3 = array3;
        
        assertTrue(new CompareToBuilder().append(obj1, obj1).toComparison() == 0);
        assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() == 0);
        assertTrue(new CompareToBuilder().append(obj1, obj3).toComparison() < 0);
        assertTrue(new CompareToBuilder().append(obj3, obj1).toComparison() > 0);

        array1[1] = new TestObject(7);
        assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() > 0);
        assertTrue(new CompareToBuilder().append(obj2, obj1).toComparison() < 0);
    }

    @Test
    public void CompareToBuilder() {
        final long[] array1 = new long[2];
        array1[0] = 5L;
        array1[1] = 6L;
        final long[] array2 = new long[2];
        array2[0] = 5L;
        array2[1] = 6L;
        final long[] array3 = new long[3];
        array3[0] = 5L;
        array3[1] = 6L;
        array3[2] = 7L;
        final Object obj1 = array1;
        final Object obj2 = array2;
        final Object obj3 = array3;
        assertTrue(new CompareToBuilder().append(obj1, obj1).toComparison() == 0);
        assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() == 0);
        assertTrue(new CompareToBuilder().append(obj1, obj3).toComparison() < 0);
        assertTrue(new CompareToBuilder().append(obj3, obj1).toComparison() > 0);

        array1[1] = 7;
        assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() > 0);
        assertTrue(new CompareToBuilder().append(obj2, obj1).toComparison() < 0);
    }

    @Test
    public void CompareToBuilder() {
        final int[] array1 = new int[2];
        array1[0] = 5;
        array1[1] = 6;
        final int[] array2 = new int[2];
        array2[0] = 5;
        array2[1] = 6;
        final int[] array3 = new int[3];
        array3[0] = 5;
        array3[1] = 6;
        array3[2] = 7;
        final Object obj1 = array1;
        final Object obj2 = array2;
        final Object obj3 = array3;
        assertTrue(new CompareToBuilder().append(obj1, obj1).toComparison() == 0);
        assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() == 0);
        assertTrue(new CompareToBuilder().append(obj1, obj3).toComparison() < 0);
        assertTrue(new CompareToBuilder().append(obj3, obj1).toComparison() > 0);

        array1[1] = 7;
        assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() > 0);
        assertTrue(new CompareToBuilder().append(obj2, obj1).toComparison() < 0);
    }

    @Test
    public void CompareToBuilder() {
        final short[] array1 = new short[2];
        array1[0] = 5;
        array1[1] = 6;
        final short[] array2 = new short[2];
        array2[0] = 5;
        array2[1] = 6;
        final short[] array3 = new short[3];
        array3[0] = 5;
        array3[1] = 6;
        array3[2] = 7;
        final Object obj1 = array1;
        final Object obj2 = array2;
        final Object obj3 = array3;
        assertTrue(new CompareToBuilder().append(obj1, obj1).toComparison() == 0);
        assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() == 0);
        assertTrue(new CompareToBuilder().append(obj1, obj3).toComparison() < 0);
        assertTrue(new CompareToBuilder().append(obj3, obj1).toComparison() > 0);

        array1[1] = 7;
        assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() > 0);
        assertTrue(new CompareToBuilder().append(obj2, obj1).toComparison() < 0);
    }

    @Test
    public void CompareToBuilder() {
        final char[] array1 = new char[2];
        array1[0] = 5;
        array1[1] = 6;
        final char[] array2 = new char[2];
        array2[0] = 5;
        array2[1] = 6;
        final char[] array3 = new char[3];
        array3[0] = 5;
        array3[1] = 6;
        array3[2] = 7;
        final Object obj1 = array1;
        final Object obj2 = array2;
        final Object obj3 = array3;
        assertTrue(new CompareToBuilder().append(obj1, obj1).toComparison() == 0);
        assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() == 0);
        assertTrue(new CompareToBuilder().append(obj1, obj3).toComparison() < 0);
        assertTrue(new CompareToBuilder().append(obj3, obj1).toComparison() > 0);

        array1[1] = 7;
        assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() > 0);
        assertTrue(new CompareToBuilder().append(obj2, obj1).toComparison() < 0);
    }

    @Test
    public void CompareToBuilder() {
        final byte[] array1 = new byte[2];
        array1[0] = 5;
        array1[1] = 6;
        final byte[] array2 = new byte[2];
        array2[0] = 5;
        array2[1] = 6;
        final byte[] array3 = new byte[3];
        array3[0] = 5;
        array3[1] = 6;
        array3[2] = 7;
        final Object obj1 = array1;
        final Object obj2 = array2;
        final Object obj3 = array3;
        assertTrue(new CompareToBuilder().append(obj1, obj1).toComparison() == 0);
        assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() == 0);
        assertTrue(new CompareToBuilder().append(obj1, obj3).toComparison() < 0);
        assertTrue(new CompareToBuilder().append(obj3, obj1).toComparison() > 0);

        array1[1] = 7;
        assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() > 0);
        assertTrue(new CompareToBuilder().append(obj2, obj1).toComparison() < 0);
    }

    @Test
    public void CompareToBuilder() {
        final double[] array1 = new double[2];
        array1[0] = 5;
        array1[1] = 6;
        final double[] array2 = new double[2];
        array2[0] = 5;
        array2[1] = 6;
        final double[] array3 = new double[3];
        array3[0] = 5;
        array3[1] = 6;
        array3[2] = 7;
        final Object obj1 = array1;
        final Object obj2 = array2;
        final Object obj3 = array3;
        assertTrue(new CompareToBuilder().append(obj1, obj1).toComparison() == 0);
        assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() == 0);
        assertTrue(new CompareToBuilder().append(obj1, obj3).toComparison() < 0);
        assertTrue(new CompareToBuilder().append(obj3, obj1).toComparison() > 0);

        array1[1] = 7;
        assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() > 0);
        assertTrue(new CompareToBuilder().append(obj2, obj1).toComparison() < 0);
    }

    @Test
    public void CompareToBuilder() {
        final float[] array1 = new float[2];
        array1[0] = 5;
        array1[1] = 6;
        final float[] array2 = new float[2];
        array2[0] = 5;
        array2[1] = 6;
        final float[] array3 = new float[3];
        array3[0] = 5;
        array3[1] = 6;
        array3[2] = 7;
        final Object obj1 = array1;
        final Object obj2 = array2;
        final Object obj3 = array3;
        assertTrue(new CompareToBuilder().append(obj1, obj1).toComparison() == 0);
        assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() == 0);
        assertTrue(new CompareToBuilder().append(obj1, obj3).toComparison() < 0);
        assertTrue(new CompareToBuilder().append(obj3, obj1).toComparison() > 0);

        array1[1] = 7;
        assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() > 0);
        assertTrue(new CompareToBuilder().append(obj2, obj1).toComparison() < 0);
    }

    @Test
    public void CompareToBuilder() {
        final boolean[] array1 = new boolean[2];
        array1[0] = true;
        array1[1] = false;
        final boolean[] array2 = new boolean[2];
        array2[0] = true;
        array2[1] = false;
        final boolean[] array3 = new boolean[3];
        array3[0] = true;
        array3[1] = false;
        array3[2] = true;
        final Object obj1 = array1;
        final Object obj2 = array2;
        final Object obj3 = array3;
        assertTrue(new CompareToBuilder().append(obj1, obj1).toComparison() == 0);
        assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() == 0);
        assertTrue(new CompareToBuilder().append(obj1, obj3).toComparison() < 0);
        assertTrue(new CompareToBuilder().append(obj3, obj1).toComparison() > 0);

        array1[1] = true;
        assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() > 0);
        assertTrue(new CompareToBuilder().append(obj2, obj1).toComparison() < 0);
    }
  
 }
