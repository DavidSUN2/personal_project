
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
import static org.junit.Assert.assertSame;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.SystemUtils;
import org.junit.After;
import org.junit.Test;

/**
 * Unit tests for {@link org.apache.commons.lang3.builder.ToStringBuilder}.
 *
 * @version $Id$
 */
public class ToStringBuilderTest {

    private final Integer base = Integer.valueOf(5);
    private final String baseStr = base.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(base));

    /*
     * All tests should leave the registry empty. 
     */
    @After
    public void after(){
        validateNullToStringStyleRegistry();
    }

    //-----------------------------------------------------------------------

    @Test
    public void ToStringBuilder() {
        assertEquals("<null>", new ToStringBuilder(null).toString());
    }

    @Test
    public void ToStringBuilder() {
        assertEquals("<null>", new ToStringBuilder(null, null).toString());
        new ToStringBuilder(this.base, null).toString();
    }

    @Test
    public void ToStringBuilder() {
        assertEquals("<null>", new ToStringBuilder(null, null, null).toString());
        new ToStringBuilder(this.base, null, null).toString();
        new ToStringBuilder(this.base, ToStringStyle.DEFAULT_STYLE, null).toString();
    }

    @Test
    public void ToStringBuilder() {
        try {
            ToStringBuilder.setDefaultStyle(ToStringStyle.NO_FIELD_NAMES_STYLE);
            assertSame(ToStringStyle.NO_FIELD_NAMES_STYLE, ToStringBuilder.getDefaultStyle());
        } finally {
            // reset for other tests
            ToStringBuilder.setDefaultStyle(ToStringStyle.DEFAULT_STYLE);
        }
    }

    @Test(expected=IllegalArgumentException.class)
    public void ToStringBuilder() {
        ToStringBuilder.setDefaultStyle(null);
    }

    @Test
    public void ToStringBuilder() {
        assertEquals(baseStr + "[]", new ToStringBuilder(base).toString());
    }

    /**
     * Test wrapper for int primitive.
     */
    @Test
    public void ToStringBuilder() {
        assertEquals(baseStr + "[value=5]", ToStringBuilder.reflectionToString(base));
    }

    /**
     * Test wrapper for char primitive.
     */
    @Test
    public void ToStringBuilder() {
        final Character c = new Character('A');
        assertEquals(this.toBaseString(c) + "[value=A]", ToStringBuilder.reflectionToString(c));
    }

    /**
     * Test wrapper for char boolean.
     */
    @Test
    public void ToStringBuilder() {
        Boolean b;
        b = Boolean.TRUE;
        assertEquals(this.toBaseString(b) + "[value=true]", ToStringBuilder.reflectionToString(b));
        b = Boolean.FALSE;
        assertEquals(this.toBaseString(b) + "[value=false]", ToStringBuilder.reflectionToString(b));
    }

    /**
     * Create the same toString() as Object.toString().
     * @param o the object to create the string for.
     * @return a String in the Object.toString format.
     */
    private String toBaseString(final Object o) {
        return o.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(o));
    }

    // Reflection Array tests

    //
    // Note on the following line of code repeated in the reflection array tests.
    //
    // assertReflectionArray("<null>", array);
    //
    // The expected value is not baseStr + "[<null>]" since array==null and is typed as Object.
    // The null array does not carry array type information.
    // If we added a primitive array type constructor and pile of associated methods,
    // then type declaring type information could be carried forward. IMHO, null is null.
    //
    // Gary Gregory - 2003-03-12 - ggregory@seagullsw.com
    //

    public void assertReflectionArray(final String expected, final Object actual) {
        if (actual == null) {
            // Until ToStringBuilder supports null objects.
            return;
        }
        assertEquals(expected, ToStringBuilder.reflectionToString(actual));
        assertEquals(expected, ToStringBuilder.reflectionToString(actual, null));
        assertEquals(expected, ToStringBuilder.reflectionToString(actual, null, true));
        assertEquals(expected, ToStringBuilder.reflectionToString(actual, null, false));
    }

    @Test
    public void ToStringBuilder() {
        Object[] array = new Object[] { null, base, new int[] { 3, 6 } };
        final String baseStr = this.toBaseString(array);
        assertEquals(baseStr + "[{<null>,5,{3,6}}]", ToStringBuilder.reflectionToString(array));
        array = null;
        assertReflectionArray("<null>", array);
    }

    @Test
    public void ToStringBuilder() {
        long[] array = new long[] { 1, 2, -3, 4 };
        final String baseStr = this.toBaseString(array);
        assertEquals(baseStr + "[{1,2,-3,4}]", ToStringBuilder.reflectionToString(array));
        array = null;
        assertReflectionArray("<null>", array);
    }

    @Test
    public void ToStringBuilder() {
        int[] array = new int[] { 1, 2, -3, 4 };
        final String baseStr = this.toBaseString(array);
        assertEquals(baseStr + "[{1,2,-3,4}]", ToStringBuilder.reflectionToString(array));
        array = null;
        assertReflectionArray("<null>", array);
    }

    @Test
    public void ToStringBuilder() {
        short[] array = new short[] { 1, 2, -3, 4 };
        final String baseStr = this.toBaseString(array);
        assertEquals(baseStr + "[{1,2,-3,4}]", ToStringBuilder.reflectionToString(array));
        array = null;
        assertReflectionArray("<null>", array);
    }

    @Test
    public void ToStringBuilder() {
        byte[] array = new byte[] { 1, 2, -3, 4 };
        final String baseStr = this.toBaseString(array);
        assertEquals(baseStr + "[{1,2,-3,4}]", ToStringBuilder.reflectionToString(array));
        array = null;
        assertReflectionArray("<null>", array);
    }

    @Test
    public void ToStringBuilder() {
        char[] array = new char[] { 'A', '2', '_', 'D' };
        final String baseStr = this.toBaseString(array);
        assertEquals(baseStr + "[{A,2,_,D}]", ToStringBuilder.reflectionToString(array));
        array = null;
        assertReflectionArray("<null>", array);
    }

    @Test
    public void ToStringBuilder() {
        double[] array = new double[] { 1.0, 2.9876, -3.00001, 4.3 };
        final String baseStr = this.toBaseString(array);
        assertEquals(baseStr + "[{1.0,2.9876,-3.00001,4.3}]", ToStringBuilder.reflectionToString(array));
        array = null;
        assertReflectionArray("<null>", array);
    }

    @Test
    public void ToStringBuilder() {
        float[] array = new float[] { 1.0f, 2.9876f, -3.00001f, 4.3f };
        final String baseStr = this.toBaseString(array);
        assertEquals(baseStr + "[{1.0,2.9876,-3.00001,4.3}]", ToStringBuilder.reflectionToString(array));
        array = null;
        assertReflectionArray("<null>", array);
    }

    @Test
    public void ToStringBuilder() {
        boolean[] array = new boolean[] { true, false, false };
        final String baseStr = this.toBaseString(array);
        assertEquals(baseStr + "[{true,false,false}]", ToStringBuilder.reflectionToString(array));
        array = null;
        assertReflectionArray("<null>", array);
    }

    // Reflection Array Array tests

    @Test
    public void ToStringBuilder() {
        float[][] array = new float[][] { { 1.0f, 2.29686f }, null, { Float.NaN } };
        final String baseStr = this.toBaseString(array);
        assertEquals(baseStr + "[{{1.0,2.29686},<null>,{NaN}}]", ToStringBuilder.reflectionToString(array));
        array = null;
        assertReflectionArray("<null>", array);
    }


    @Test
    public void ToStringBuilder() {
        long[][] array = new long[][] { { 1, 2 }, null, { 5 } };
        final String baseStr = this.toBaseString(array);
        assertEquals(baseStr + "[{{1,2},<null>,{5}}]", ToStringBuilder.reflectionToString(array));
        array = null;
        assertReflectionArray("<null>", array);
    }

    @Test
    public void ToStringBuilder() {
        int[][] array = new int[][] { { 1, 2 }, null, { 5 } };
        final String baseStr = this.toBaseString(array);
        assertEquals(baseStr + "[{{1,2},<null>,{5}}]", ToStringBuilder.reflectionToString(array));
        array = null;
        assertReflectionArray("<null>", array);
    }

    @Test
    public void ToStringBuilder() {
        short[][] array = new short[][] { { 1, 2 }, null, { 5 } };
        final String baseStr = this.toBaseString(array);
        assertEquals(baseStr + "[{{1,2},<null>,{5}}]", ToStringBuilder.reflectionToString(array));
        array = null;
        assertReflectionArray("<null>", array);
    }

    @Test
    public void ToStringBuilder() {
        byte[][] array = new byte[][] { { 1, 2 }, null, { 5 } };
        final String baseStr = this.toBaseString(array);
        assertEquals(baseStr + "[{{1,2},<null>,{5}}]", ToStringBuilder.reflectionToString(array));
        array = null;
        assertReflectionArray("<null>", array);
    }

    @Test
    public void ToStringBuilder() {
        char[][] array = new char[][] { { 'A', 'B' }, null, { 'p' } };
        final String baseStr = this.toBaseString(array);
        assertEquals(baseStr + "[{{A,B},<null>,{p}}]", ToStringBuilder.reflectionToString(array));
        array = null;
        assertReflectionArray("<null>", array);
    }

    @Test
    public void ToStringBuilder() {
        double[][] array = new double[][] { { 1.0, 2.29686 }, null, { Double.NaN } };
        final String baseStr = this.toBaseString(array);
        assertEquals(baseStr + "[{{1.0,2.29686},<null>,{NaN}}]", ToStringBuilder.reflectionToString(array));
        array = null;
        assertReflectionArray("<null>", array);
    }

    @Test
    public void ToStringBuilder() {
        boolean[][] array = new boolean[][] { { true, false }, null, { false } };
        final String baseStr = this.toBaseString(array);
        assertEquals(baseStr + "[{{true,false},<null>,{false}}]", ToStringBuilder.reflectionToString(array));
        assertEquals(baseStr + "[{{true,false},<null>,{false}}]", ToStringBuilder.reflectionToString(array));
        array = null;
        assertReflectionArray("<null>", array);
    }

    // Reflection hierarchy tests
    @Test
    public void ToStringBuilder() {}
// Defects4J: flaky method
//     @Test
//     public void ToStringBuilder() {
//         final List<Object> base = new ArrayList<Object>();
//         final String baseStr = this.toBaseString(base);
//         // note, the test data depends on the internal representation of the ArrayList, which may differ between JDK versions and vendors
//         final String expectedWithTransients = baseStr + "[elementData={<null>,<null>,<null>,<null>,<null>,<null>,<null>,<null>,<null>,<null>},size=0,modCount=0]";
//         final String toStringWithTransients = ToStringBuilder.reflectionToString(base, null, true);
//         if (!expectedWithTransients.equals(toStringWithTransients)) {
//             // representation different for IBM JDK 1.6.0, LANG-727
//             if (!("IBM Corporation".equals(SystemUtils.JAVA_VENDOR) && "1.6".equals(SystemUtils.JAVA_SPECIFICATION_VERSION))) {
//                 assertEquals(expectedWithTransients, toStringWithTransients);
//             }
//         }
//         final String expectedWithoutTransients = baseStr + "[size=0]";
//         final String toStringWithoutTransients = ToStringBuilder.reflectionToString(base, null, false);
//         if (!expectedWithoutTransients.equals(toStringWithoutTransients)) {
//             // representation different for IBM JDK 1.6.0, LANG-727
//             if (!("IBM Corporation".equals(SystemUtils.JAVA_VENDOR) && "1.6".equals(SystemUtils.JAVA_SPECIFICATION_VERSION))) {
//                 assertEquals(expectedWithoutTransients, toStringWithoutTransients);
//             }
//         }
//     }

    @Test
    public void ToStringBuilder() {
        final ReflectionTestFixtureA baseA = new ReflectionTestFixtureA();
        String baseStr = this.toBaseString(baseA);
        assertEquals(baseStr + "[a=a]", ToStringBuilder.reflectionToString(baseA));
        assertEquals(baseStr + "[a=a]", ToStringBuilder.reflectionToString(baseA, null));
        assertEquals(baseStr + "[a=a]", ToStringBuilder.reflectionToString(baseA, null, false));
        assertEquals(baseStr + "[a=a,transientA=t]", ToStringBuilder.reflectionToString(baseA, null, true));
        assertEquals(baseStr + "[a=a]", ToStringBuilder.reflectionToString(baseA, null, false, null));
        assertEquals(baseStr + "[a=a]", ToStringBuilder.reflectionToString(baseA, null, false, Object.class));
        assertEquals(baseStr + "[a=a]", ToStringBuilder.reflectionToString(baseA, null, false, ReflectionTestFixtureA.class));

        final ReflectionTestFixtureB baseB = new ReflectionTestFixtureB();
        baseStr = this.toBaseString(baseB);
        assertEquals(baseStr + "[b=b,a=a]", ToStringBuilder.reflectionToString(baseB));
        assertEquals(baseStr + "[b=b,a=a]", ToStringBuilder.reflectionToString(baseB));
        assertEquals(baseStr + "[b=b,a=a]", ToStringBuilder.reflectionToString(baseB, null));
        assertEquals(baseStr + "[b=b,a=a]", ToStringBuilder.reflectionToString(baseB, null, false));
        assertEquals(baseStr + "[b=b,transientB=t,a=a,transientA=t]", ToStringBuilder.reflectionToString(baseB, null, true));
        assertEquals(baseStr + "[b=b,a=a]", ToStringBuilder.reflectionToString(baseB, null, false, null));
        assertEquals(baseStr + "[b=b,a=a]", ToStringBuilder.reflectionToString(baseB, null, false, Object.class));
        assertEquals(baseStr + "[b=b,a=a]", ToStringBuilder.reflectionToString(baseB, null, false, ReflectionTestFixtureA.class));
        assertEquals(baseStr + "[b=b]", ToStringBuilder.reflectionToString(baseB, null, false, ReflectionTestFixtureB.class));
    }

    static class ReflectionTestFixtureA {
        @SuppressWarnings("unused")
        private final char a='a';
        @SuppressWarnings("unused")
        private transient char transientA='t';
    }

    static class ReflectionTestFixtureB extends ReflectionTestFixtureA {
        @SuppressWarnings("unused")
        private final char b='b';
        @SuppressWarnings("unused")
        private transient char transientB='t';
    }

    @Test
    public void ToStringBuilder() {
        final Outer outer = new Outer();
        assertEquals(toBaseString(outer) + "[inner=" + toBaseString(outer.inner) + "[]]", outer.toString());
    }

    static class Outer {
        Inner inner = new Inner();
        class Inner {
            @Override
            public String toString() {
                return ToStringBuilder.reflectionToString(this);
            }
        }
        @Override
        public String toString() {
            return ToStringBuilder.reflectionToString(this);
        }
    }

    // Reflection cycle tests

    /**
     * Test an array element pointing to its container.
     */
    @Test
    public void ToStringBuilder() throws Exception {
        final Object[] objects = new Object[1];
        objects[0] = objects;
        assertEquals(
            this.toBaseString(objects) + "[{" + this.toBaseString(objects) + "}]",
            ToStringBuilder.reflectionToString(objects));
    }

    /**
     * Test an array element pointing to its container.
     */
    @Test
    public void ToStringBuilder() throws Exception {
        final Object[] objects = new Object[1];
        final Object[] objectsLevel2 = new Object[1];
        objects[0] = objectsLevel2;
        objectsLevel2[0] = objects;
        assertEquals(
            this.toBaseString(objects) + "[{{" + this.toBaseString(objects) + "}}]",
            ToStringBuilder.reflectionToString(objects));
        assertEquals(
            this.toBaseString(objectsLevel2) + "[{{" + this.toBaseString(objectsLevel2) + "}}]",
            ToStringBuilder.reflectionToString(objectsLevel2));
    }

    @Test
    public void ToStringBuilder() throws Exception {
        final Object[][] objects = new Object[2][2];
        objects[0][0] = objects;
        objects[0][1] = objects;
        objects[1][0] = objects;
        objects[1][1] = objects;
        final String basicToString = this.toBaseString(objects);
        assertEquals(
            basicToString
                + "[{{"
                + basicToString
                + ","
                + basicToString
                + "},{"
                + basicToString
                + ","
                + basicToString
                + "}}]",
            ToStringBuilder.reflectionToString(objects));
    }

    /**
     * A reflection test fixture.
     */
    static class ReflectionTestCycleA {
        ReflectionTestCycleB b;

        @Override
        public String toString() {
            return ToStringBuilder.reflectionToString(this);
        }
    }

    /**
     * A reflection test fixture.
     */
    static class ReflectionTestCycleB {
        ReflectionTestCycleA a;

        @Override
        public String toString() {
            return ToStringBuilder.reflectionToString(this);
        }
    }

    /**
     * A reflection test fixture.
     */
    static class SimpleReflectionTestFixture {
        Object o;

        public SimpleReflectionTestFixture() {
        }

        public SimpleReflectionTestFixture(final Object o) {
            this.o = o;
        }

        @Override
        public String toString() {
            return ToStringBuilder.reflectionToString(this);
        }
    }

    private static class SelfInstanceVarReflectionTestFixture {
        @SuppressWarnings("unused")
        private final SelfInstanceVarReflectionTestFixture typeIsSelf;

        public SelfInstanceVarReflectionTestFixture() {
            this.typeIsSelf = this;
        }

        @Override
        public String toString() {
            return ToStringBuilder.reflectionToString(this);
        }
      }

    private static class SelfInstanceTwoVarsReflectionTestFixture {
        @SuppressWarnings("unused")
        private final SelfInstanceTwoVarsReflectionTestFixture typeIsSelf;
        private final String otherType = "The Other Type";

        public SelfInstanceTwoVarsReflectionTestFixture() {
            this.typeIsSelf = this;
        }

        public String getOtherType(){
            return this.otherType;
        }

        @Override
        public String toString() {
            return ToStringBuilder.reflectionToString(this);
        }
      }




}
