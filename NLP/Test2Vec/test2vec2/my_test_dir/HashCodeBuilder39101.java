
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
import static org.junit.Assert.assertNull;
import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.builder.HashCodeBuilder}.
 * 
 * @version $Id$
 */
public class HashCodeBuilderTest {

    /**
     * A reflection test fixture.
     */
    static class ReflectionTestCycleA {
        ReflectionTestCycleB b;

        @Override
        public int hashCode() {
            return HashCodeBuilder.reflectionHashCode(this);
        }
    }

    /**
     * A reflection test fixture.
     */
    static class ReflectionTestCycleB {
        ReflectionTestCycleA a;

        @Override
        public int hashCode() {
            return HashCodeBuilder.reflectionHashCode(this);
        }
    }

    // -----------------------------------------------------------------------

    @Test
    public void HashCodeBuilder39() {
        assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((char[]) null).toHashCode());
        final char[] obj = new char[2];
        assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        obj[0] = (char) 5;
        assertEquals((17 * 37 + 5) * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        obj[1] = (char) 6;
        assertEquals((17 * 37 + 5) * 37 + 6, new HashCodeBuilder(17, 37).append(obj).toHashCode());
    }

    @Test
    public void HashCodeBuilder39() {
        final char[] obj = new char[2];
        assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
        obj[0] = (char) 5;
        assertEquals((17 * 37 + 5) * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
        obj[1] = (char) 6;
        assertEquals((17 * 37 + 5) * 37 + 6, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
    }

    @Test
    public void HashCodeBuilder39() {
        assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((byte[]) null).toHashCode());
        final byte[] obj = new byte[2];
        assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        obj[0] = (byte) 5;
        assertEquals((17 * 37 + 5) * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        obj[1] = (byte) 6;
        assertEquals((17 * 37 + 5) * 37 + 6, new HashCodeBuilder(17, 37).append(obj).toHashCode());
    }

    @Test
    public void HashCodeBuilder39() {
        final byte[] obj = new byte[2];
        assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
        obj[0] = (byte) 5;
        assertEquals((17 * 37 + 5) * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
        obj[1] = (byte) 6;
        assertEquals((17 * 37 + 5) * 37 + 6, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
    }

    @Test
    public void HashCodeBuilder39() {
        assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((double[]) null).toHashCode());
        final double[] obj = new double[2];
        assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        obj[0] = 5.4d;
        final long l1 = Double.doubleToLongBits(5.4d);
        final int h1 = (int) (l1 ^ l1 >> 32);
        assertEquals((17 * 37 + h1) * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        obj[1] = 6.3d;
        final long l2 = Double.doubleToLongBits(6.3d);
        final int h2 = (int) (l2 ^ l2 >> 32);
        assertEquals((17 * 37 + h1) * 37 + h2, new HashCodeBuilder(17, 37).append(obj).toHashCode());
    }

    @Test
    public void HashCodeBuilder39() {
        final double[] obj = new double[2];
        assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
        obj[0] = 5.4d;
        final long l1 = Double.doubleToLongBits(5.4d);
        final int h1 = (int) (l1 ^ l1 >> 32);
        assertEquals((17 * 37 + h1) * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
        obj[1] = 6.3d;
        final long l2 = Double.doubleToLongBits(6.3d);
        final int h2 = (int) (l2 ^ l2 >> 32);
        assertEquals((17 * 37 + h1) * 37 + h2, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
    }

    @Test
    public void HashCodeBuilder39() {
        assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((float[]) null).toHashCode());
        final float[] obj = new float[2];
        assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        obj[0] = 5.4f;
        final int h1 = Float.floatToIntBits(5.4f);
        assertEquals((17 * 37 + h1) * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        obj[1] = 6.3f;
        final int h2 = Float.floatToIntBits(6.3f);
        assertEquals((17 * 37 + h1) * 37 + h2, new HashCodeBuilder(17, 37).append(obj).toHashCode());
    }

    @Test
    public void HashCodeBuilder39() {
        final float[] obj = new float[2];
        assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
        obj[0] = 5.4f;
        final int h1 = Float.floatToIntBits(5.4f);
        assertEquals((17 * 37 + h1) * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
        obj[1] = 6.3f;
        final int h2 = Float.floatToIntBits(6.3f);
        assertEquals((17 * 37 + h1) * 37 + h2, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
    }

    @Test
    public void HashCodeBuilder39() {
        assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((boolean[]) null).toHashCode());
        final boolean[] obj = new boolean[2];
        assertEquals((17 * 37 + 1) * 37 + 1, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        obj[0] = true;
        assertEquals((17 * 37 + 0) * 37 + 1, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        obj[1] = false;
        assertEquals((17 * 37 + 0) * 37 + 1, new HashCodeBuilder(17, 37).append(obj).toHashCode());
    }

    @Test
    public void HashCodeBuilder39() {
        final boolean[] obj = new boolean[2];
        assertEquals((17 * 37 + 1) * 37 + 1, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
        obj[0] = true;
        assertEquals((17 * 37 + 0) * 37 + 1, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
        obj[1] = false;
        assertEquals((17 * 37 + 0) * 37 + 1, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
    }

    @Test
    public void HashCodeBuilder39() {
        final boolean[][] obj = new boolean[2][];
        assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        obj[0] = new boolean[0];
        assertEquals(17 * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        obj[0] = new boolean[1];
        assertEquals((17 * 37 + 1) * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        obj[0] = new boolean[2];
        assertEquals(((17 * 37 + 1) * 37 + 1) * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        obj[0][0] = true;
        assertEquals(((17 * 37 + 0) * 37 + 1) * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        obj[1] = new boolean[1];
        assertEquals(((17 * 37 + 0) * 37 + 1) * 37 + 1, new HashCodeBuilder(17, 37).append(obj).toHashCode());
    }

    @Test
    public void HashCodeBuilder39() throws Exception {
        final TestObjectWithMultipleFields x = new TestObjectWithMultipleFields(1, 2, 3);

        assertEquals(((17 * 37 + 1) * 37 + 2) * 37 + 3, HashCodeBuilder.reflectionHashCode(x));

        assertEquals(((17 * 37 + 1) * 37 + 2) * 37 + 3, HashCodeBuilder.reflectionHashCode(x, (String[]) null));
        assertEquals(((17 * 37 + 1) * 37 + 2) * 37 + 3, HashCodeBuilder.reflectionHashCode(x, new String[]{}));
        assertEquals(((17 * 37 + 1) * 37 + 2) * 37 + 3, HashCodeBuilder.reflectionHashCode(x, new String[]{"xxx"}));

        assertEquals((17 * 37 + 1) * 37 + 3, HashCodeBuilder.reflectionHashCode(x, new String[]{"two"}));
        assertEquals((17 * 37 + 1) * 37 + 2, HashCodeBuilder.reflectionHashCode(x, new String[]{"three"}));

        assertEquals(17 * 37 + 1, HashCodeBuilder.reflectionHashCode(x, new String[]{"two", "three"}));

        assertEquals(17, HashCodeBuilder.reflectionHashCode(x, new String[]{"one", "two", "three"}));
        assertEquals(17, HashCodeBuilder.reflectionHashCode(x, new String[]{"one", "two", "three", "xxx"}));
    }

    static class TestObjectWithMultipleFields {
        @SuppressWarnings("unused")
        private int one = 0;

        @SuppressWarnings("unused")
        private int two = 0;

        @SuppressWarnings("unused")
        private int three = 0;

        public TestObjectWithMultipleFields(final int one, final int two, final int three) {
            this.one = one;
            this.two = two;
            this.three = three;
        }
    }

    /**
     * Test Objects pointing to each other.
     */
    @Test
    public void HashCodeBuilder39() {
        final ReflectionTestCycleA a = new ReflectionTestCycleA();
        final ReflectionTestCycleB b = new ReflectionTestCycleB();
        a.b = b;
        b.a = a;
        
        // Used to caused:
        // java.lang.StackOverflowError
        // at java.lang.ClassLoader.getCallerClassLoader(Native Method)
        // at java.lang.Class.getDeclaredFields(Class.java:992)
        // at org.apache.commons.lang.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:373)
        // at org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:349)
        // at org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:155)
        // at
        // org.apache.commons.lang.builder.HashCodeBuilderTest$ReflectionTestCycleB.hashCode(HashCodeBuilderTest.java:53)
        // at org.apache.commons.lang.builder.HashCodeBuilder.append(HashCodeBuilder.java:422)
        // at org.apache.commons.lang.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:383)
        // at org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:349)
        // at org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:155)
        // at
        // org.apache.commons.lang.builder.HashCodeBuilderTest$ReflectionTestCycleA.hashCode(HashCodeBuilderTest.java:42)
        // at org.apache.commons.lang.builder.HashCodeBuilder.append(HashCodeBuilder.java:422)

        a.hashCode();
        assertNull(HashCodeBuilder.getRegistry());
        b.hashCode();
        assertNull(HashCodeBuilder.getRegistry());
    }

    /**
     * Ensures LANG-520 remains true
     */
    @Test
    public void HashCodeBuilder39() {
        final HashCodeBuilder hcb = new HashCodeBuilder(17, 37).append(new Object()).append('a');
        assertEquals("hashCode() is no longer returning the same value as toHashCode() - see LANG-520", 
                     hcb.toHashCode(), hcb.hashCode());
    }

}
