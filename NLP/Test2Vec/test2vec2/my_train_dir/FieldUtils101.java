
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
package org.apache.commons.lang3.reflect;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.Assume.assumeNotNull;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.reflect.testbed.Ambig;
import org.apache.commons.lang3.reflect.testbed.Foo;
import org.apache.commons.lang3.reflect.testbed.PrivatelyShadowedChild;
import org.apache.commons.lang3.reflect.testbed.PublicChild;
import org.apache.commons.lang3.reflect.testbed.PubliclyShadowedChild;
import org.apache.commons.lang3.reflect.testbed.StaticContainer;
import org.apache.commons.lang3.reflect.testbed.StaticContainerChild;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests FieldUtils
 * 
 * @version $Id$
 */
public class FieldUtilsTest {

    static final String S = "s";
    static final String SS = "ss";
    static final Integer I0 = Integer.valueOf(0);
    static final Integer I1 = Integer.valueOf(1);
    static final Double D0 = Double.valueOf(0.0);
    static final Double D1 = Double.valueOf(1.0);

    private PublicChild publicChild;
    private PubliclyShadowedChild publiclyShadowedChild;
    private PrivatelyShadowedChild privatelyShadowedChild;
    private final Class<?> parentClass = PublicChild.class.getSuperclass();

    @Before
    public void setUp() {
        StaticContainer.reset();
        publicChild = new PublicChild();
        publiclyShadowedChild = new PubliclyShadowedChild();
        privatelyShadowedChild = new PrivatelyShadowedChild();
    }

    @Test
    public void FieldUtils() {
        assertNotNull(new FieldUtils());
        final Constructor<?>[] cons = FieldUtils.class.getDeclaredConstructors();
        assertEquals(1, cons.length);
        assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        assertTrue(Modifier.isPublic(FieldUtils.class.getModifiers()));
        assertFalse(Modifier.isFinal(FieldUtils.class.getModifiers()));
    }

    @Test
    public void FieldUtils() {
        assertEquals(Foo.class, FieldUtils.getField(PublicChild.class, "VALUE").getDeclaringClass());
        assertEquals(parentClass, FieldUtils.getField(PublicChild.class, "s").getDeclaringClass());
        assertNull(FieldUtils.getField(PublicChild.class, "b"));
        assertNull(FieldUtils.getField(PublicChild.class, "i"));
        assertNull(FieldUtils.getField(PublicChild.class, "d"));
        assertEquals(Foo.class, FieldUtils.getField(PubliclyShadowedChild.class, "VALUE").getDeclaringClass());
        assertEquals(PubliclyShadowedChild.class, FieldUtils.getField(PubliclyShadowedChild.class, "s").getDeclaringClass());
        assertEquals(PubliclyShadowedChild.class, FieldUtils.getField(PubliclyShadowedChild.class, "b").getDeclaringClass());
        assertEquals(PubliclyShadowedChild.class, FieldUtils.getField(PubliclyShadowedChild.class, "i").getDeclaringClass());
        assertEquals(PubliclyShadowedChild.class, FieldUtils.getField(PubliclyShadowedChild.class, "d").getDeclaringClass());
        assertEquals(Foo.class, FieldUtils.getField(PrivatelyShadowedChild.class, "VALUE").getDeclaringClass());
        assertEquals(parentClass, FieldUtils.getField(PrivatelyShadowedChild.class, "s").getDeclaringClass());
        assertNull(FieldUtils.getField(PrivatelyShadowedChild.class, "b"));
        assertNull(FieldUtils.getField(PrivatelyShadowedChild.class, "i"));
        assertNull(FieldUtils.getField(PrivatelyShadowedChild.class, "d"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void FieldUtils() {
        FieldUtils.getField(null, "none");
    }

    @Test(expected = IllegalArgumentException.class)
    public void FieldUtils() {
        FieldUtils.getField(PublicChild.class, null);
    }

    @Test
    public void FieldUtils() {
        assertEquals(PublicChild.class, FieldUtils.getField(PublicChild.class, "VALUE", true).getDeclaringClass());
        assertEquals(parentClass, FieldUtils.getField(PublicChild.class, "s", true).getDeclaringClass());
        assertEquals(parentClass, FieldUtils.getField(PublicChild.class, "b", true).getDeclaringClass());
        assertEquals(parentClass, FieldUtils.getField(PublicChild.class, "i", true).getDeclaringClass());
        assertEquals(parentClass, FieldUtils.getField(PublicChild.class, "d", true).getDeclaringClass());
        assertEquals(Foo.class, FieldUtils.getField(PubliclyShadowedChild.class, "VALUE", true).getDeclaringClass());
        assertEquals(PubliclyShadowedChild.class, FieldUtils.getField(PubliclyShadowedChild.class, "s", true).getDeclaringClass());
        assertEquals(PubliclyShadowedChild.class, FieldUtils.getField(PubliclyShadowedChild.class, "b", true).getDeclaringClass());
        assertEquals(PubliclyShadowedChild.class, FieldUtils.getField(PubliclyShadowedChild.class, "i", true).getDeclaringClass());
        assertEquals(PubliclyShadowedChild.class, FieldUtils.getField(PubliclyShadowedChild.class, "d", true).getDeclaringClass());
        assertEquals(Foo.class, FieldUtils.getField(PrivatelyShadowedChild.class, "VALUE", true).getDeclaringClass());
        assertEquals(PrivatelyShadowedChild.class, FieldUtils.getField(PrivatelyShadowedChild.class, "s", true).getDeclaringClass());
        assertEquals(PrivatelyShadowedChild.class, FieldUtils.getField(PrivatelyShadowedChild.class, "b", true).getDeclaringClass());
        assertEquals(PrivatelyShadowedChild.class, FieldUtils.getField(PrivatelyShadowedChild.class, "i", true).getDeclaringClass());
        assertEquals(PrivatelyShadowedChild.class, FieldUtils.getField(PrivatelyShadowedChild.class, "d", true).getDeclaringClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void FieldUtils() {
        FieldUtils.getField(null, "none", true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void FieldUtils() {
        FieldUtils.getField(PublicChild.class, null, true);
    }

    @Test
    public void FieldUtils() {
        assertArrayEquals(new Field[0], FieldUtils.getAllFields(Object.class));
        final Field[] fieldsNumber = Number.class.getDeclaredFields();
        assertArrayEquals(fieldsNumber, FieldUtils.getAllFields(Number.class));
        final Field[] fieldsInteger = Integer.class.getDeclaredFields();
        assertArrayEquals(ArrayUtils.addAll(fieldsInteger, fieldsNumber), FieldUtils.getAllFields(Integer.class));
        assertEquals(5, FieldUtils.getAllFields(PublicChild.class).length);
    }

    private <T> List<T> asArrayList(T... values) {
        final ArrayList<T> arrayList = new ArrayList<T>();
        for (T t : values) {
            arrayList.add(t);
        }
        return arrayList;
    }

    @Test
    public void FieldUtils() {
        assertEquals(0, FieldUtils.getAllFieldsList(Object.class).size());
        final List<Field> fieldsNumber = asArrayList(Number.class.getDeclaredFields());
        assertEquals(fieldsNumber, FieldUtils.getAllFieldsList(Number.class));
        final List<Field> fieldsInteger = asArrayList(Integer.class.getDeclaredFields());
        final List<Field> allFieldsInteger = new ArrayList<Field>(fieldsInteger);
        allFieldsInteger.addAll(fieldsNumber);
        assertEquals(allFieldsInteger, FieldUtils.getAllFieldsList(Integer.class));
        assertEquals(5, FieldUtils.getAllFieldsList(PublicChild.class).size());
    }

    @Test
    public void FieldUtils() {
        assertNull(FieldUtils.getDeclaredField(PublicChild.class, "VALUE"));
        assertNull(FieldUtils.getDeclaredField(PublicChild.class, "s"));
        assertNull(FieldUtils.getDeclaredField(PublicChild.class, "b"));
        assertNull(FieldUtils.getDeclaredField(PublicChild.class, "i"));
        assertNull(FieldUtils.getDeclaredField(PublicChild.class, "d"));
        assertNull(FieldUtils.getDeclaredField(PubliclyShadowedChild.class, "VALUE"));
        assertEquals(PubliclyShadowedChild.class, FieldUtils.getDeclaredField(PubliclyShadowedChild.class, "s").getDeclaringClass());
        assertEquals(PubliclyShadowedChild.class, FieldUtils.getDeclaredField(PubliclyShadowedChild.class, "b").getDeclaringClass());
        assertEquals(PubliclyShadowedChild.class, FieldUtils.getDeclaredField(PubliclyShadowedChild.class, "i").getDeclaringClass());
        assertEquals(PubliclyShadowedChild.class, FieldUtils.getDeclaredField(PubliclyShadowedChild.class, "d").getDeclaringClass());
        assertNull(FieldUtils.getDeclaredField(PrivatelyShadowedChild.class, "VALUE"));
        assertNull(FieldUtils.getDeclaredField(PrivatelyShadowedChild.class, "s"));
        assertNull(FieldUtils.getDeclaredField(PrivatelyShadowedChild.class, "b"));
        assertNull(FieldUtils.getDeclaredField(PrivatelyShadowedChild.class, "i"));
        assertNull(FieldUtils.getDeclaredField(PrivatelyShadowedChild.class, "d"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void FieldUtils() {
        FieldUtils.getDeclaredField(null, "none");
    }

    @Test(expected = IllegalArgumentException.class)
    public void FieldUtils() {
        FieldUtils.getDeclaredField(PublicChild.class, null);
    }

    @Test
    public void FieldUtils() {
        assertEquals(PublicChild.class, FieldUtils.getDeclaredField(PublicChild.class, "VALUE", true).getDeclaringClass());
        assertNull(FieldUtils.getDeclaredField(PublicChild.class, "s", true));
        assertNull(FieldUtils.getDeclaredField(PublicChild.class, "b", true));
        assertNull(FieldUtils.getDeclaredField(PublicChild.class, "i", true));
        assertNull(FieldUtils.getDeclaredField(PublicChild.class, "d", true));
        assertNull(FieldUtils.getDeclaredField(PubliclyShadowedChild.class, "VALUE", true));
        assertEquals(PubliclyShadowedChild.class, FieldUtils.getDeclaredField(PubliclyShadowedChild.class, "s", true).getDeclaringClass());
        assertEquals(PubliclyShadowedChild.class, FieldUtils.getDeclaredField(PubliclyShadowedChild.class, "b", true).getDeclaringClass());
        assertEquals(PubliclyShadowedChild.class, FieldUtils.getDeclaredField(PubliclyShadowedChild.class, "i", true).getDeclaringClass());
        assertEquals(PubliclyShadowedChild.class, FieldUtils.getDeclaredField(PubliclyShadowedChild.class, "d", true).getDeclaringClass());
        assertNull(FieldUtils.getDeclaredField(PrivatelyShadowedChild.class, "VALUE", true));
        assertEquals(PrivatelyShadowedChild.class, FieldUtils.getDeclaredField(PrivatelyShadowedChild.class, "s", true).getDeclaringClass());
        assertEquals(PrivatelyShadowedChild.class, FieldUtils.getDeclaredField(PrivatelyShadowedChild.class, "b", true).getDeclaringClass());
        assertEquals(PrivatelyShadowedChild.class, FieldUtils.getDeclaredField(PrivatelyShadowedChild.class, "i", true).getDeclaringClass());
        assertEquals(PrivatelyShadowedChild.class, FieldUtils.getDeclaredField(PrivatelyShadowedChild.class, "d", true).getDeclaringClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void FieldUtils() {
        FieldUtils.getDeclaredField(null, "none", true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void FieldUtils() {
        FieldUtils.getDeclaredField(PublicChild.class, null, true);
    }

    @Test
    public void FieldUtils() throws Exception {
        assertEquals(Foo.VALUE, FieldUtils.readStaticField(FieldUtils.getField(Foo.class, "VALUE")));
    }

    @Test(expected = IllegalArgumentException.class)
    public void FieldUtils() throws Exception {
        FieldUtils.readStaticField(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void FieldUtils() throws Exception {
        assertEquals(Foo.VALUE, FieldUtils.readStaticField(FieldUtils.getField(Foo.class, "VALUE")));
        final Field nonStaticField = FieldUtils.getField(PublicChild.class, "s");
        assumeNotNull(nonStaticField);
        FieldUtils.readStaticField(nonStaticField);
    }

    @Test
    public void FieldUtils() throws Exception {
        assertEquals(Foo.VALUE, FieldUtils.readStaticField(FieldUtils.getField(Foo.class, "VALUE")));
        assertEquals(Foo.VALUE, FieldUtils.readStaticField(FieldUtils.getField(PublicChild.class, "VALUE")));
    }

    @Test(expected = IllegalArgumentException.class)
    public void FieldUtils() throws Exception {
        FieldUtils.readStaticField(null, true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void FieldUtils() throws Exception {
        final Field nonStaticField = FieldUtils.getField(PublicChild.class, "s", true);
        assumeNotNull(nonStaticField);
        FieldUtils.readStaticField(nonStaticField);
    }

    @Test
    public void FieldUtils() throws Exception {
        assertEquals(Foo.VALUE, FieldUtils.readStaticField(Foo.class, "VALUE"));
        assertEquals(Foo.VALUE, FieldUtils.readStaticField(PubliclyShadowedChild.class, "VALUE"));
        assertEquals(Foo.VALUE, FieldUtils.readStaticField(PrivatelyShadowedChild.class, "VALUE"));
        assertEquals(Foo.VALUE, FieldUtils.readStaticField(PublicChild.class, "VALUE"));

        try {
            FieldUtils.readStaticField(null, "none");
            fail("null class should cause an IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }

        try {
            FieldUtils.readStaticField(Foo.class, null);
            fail("null field name should cause an IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }

        try {
            FieldUtils.readStaticField(Foo.class, "does_not_exist");
            fail("a field that doesn't exist should cause an IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }

        try {
            FieldUtils.readStaticField(PublicChild.class, "s");
            fail("non-static field should cause an IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void FieldUtils() throws Exception {
        assertEquals(Foo.VALUE, FieldUtils.readStaticField(Foo.class, "VALUE", true));
        assertEquals(Foo.VALUE, FieldUtils.readStaticField(PubliclyShadowedChild.class, "VALUE", true));
        assertEquals(Foo.VALUE, FieldUtils.readStaticField(PrivatelyShadowedChild.class, "VALUE", true));
        assertEquals("child", FieldUtils.readStaticField(PublicChild.class, "VALUE", true));

        try {
            FieldUtils.readStaticField(null, "none", true);
            fail("null class should cause an IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }

        try {
            FieldUtils.readStaticField(Foo.class, null, true);
            fail("null field name should cause an IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }

        try {
            FieldUtils.readStaticField(Foo.class, "does_not_exist", true);
            fail("a field that doesn't exist should cause an IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }

        try {
            FieldUtils.readStaticField(PublicChild.class, "s", false);
            fail("non-static field should cause an IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void FieldUtils() throws Exception {
        assertEquals(Foo.VALUE, FieldUtils.readDeclaredStaticField(Foo.class, "VALUE"));
        try {
            assertEquals("child", FieldUtils.readDeclaredStaticField(PublicChild.class, "VALUE"));
            fail("expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        try {
            assertEquals(Foo.VALUE, FieldUtils.readDeclaredStaticField(PubliclyShadowedChild.class, "VALUE"));
            fail("expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        try {
            assertEquals(Foo.VALUE, FieldUtils.readDeclaredStaticField(PrivatelyShadowedChild.class, "VALUE"));
            fail("expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
    }

    @Test
    public void FieldUtils() throws Exception {
        assertEquals(Foo.VALUE, FieldUtils.readDeclaredStaticField(Foo.class, "VALUE", true));
        assertEquals("child", FieldUtils.readDeclaredStaticField(PublicChild.class, "VALUE", true));
        try {
            assertEquals(Foo.VALUE, FieldUtils.readDeclaredStaticField(PubliclyShadowedChild.class, "VALUE", true));
            fail("expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        try {
            assertEquals(Foo.VALUE, FieldUtils.readDeclaredStaticField(PrivatelyShadowedChild.class, "VALUE", true));
            fail("expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
    }

    @Test
    public void FieldUtils() throws Exception {
        final Field parentS = FieldUtils.getDeclaredField(parentClass, "s");
        assertEquals("s", FieldUtils.readField(parentS, publicChild));
        assertEquals("s", FieldUtils.readField(parentS, publiclyShadowedChild));
        assertEquals("s", FieldUtils.readField(parentS, privatelyShadowedChild));
        final Field parentB = FieldUtils.getDeclaredField(parentClass, "b", true);
        assertEquals(Boolean.FALSE, FieldUtils.readField(parentB, publicChild));
        assertEquals(Boolean.FALSE, FieldUtils.readField(parentB, publiclyShadowedChild));
        assertEquals(Boolean.FALSE, FieldUtils.readField(parentB, privatelyShadowedChild));
        final Field parentI = FieldUtils.getDeclaredField(parentClass, "i", true);
        assertEquals(I0, FieldUtils.readField(parentI, publicChild));
        assertEquals(I0, FieldUtils.readField(parentI, publiclyShadowedChild));
        assertEquals(I0, FieldUtils.readField(parentI, privatelyShadowedChild));
        final Field parentD = FieldUtils.getDeclaredField(parentClass, "d", true);
        assertEquals(D0, FieldUtils.readField(parentD, publicChild));
        assertEquals(D0, FieldUtils.readField(parentD, publiclyShadowedChild));
        assertEquals(D0, FieldUtils.readField(parentD, privatelyShadowedChild));

        try {
            FieldUtils.readField((Field) null, publicChild);
            fail("a null field should cause an IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void FieldUtils() throws Exception {
        final Field parentS = FieldUtils.getDeclaredField(parentClass, "s");
        parentS.setAccessible(false);
        assertEquals("s", FieldUtils.readField(parentS, publicChild, true));
        assertEquals("s", FieldUtils.readField(parentS, publiclyShadowedChild, true));
        assertEquals("s", FieldUtils.readField(parentS, privatelyShadowedChild, true));
        final Field parentB = FieldUtils.getDeclaredField(parentClass, "b", true);
        parentB.setAccessible(false);
        assertEquals(Boolean.FALSE, FieldUtils.readField(parentB, publicChild, true));
        assertEquals(Boolean.FALSE, FieldUtils.readField(parentB, publiclyShadowedChild, true));
        assertEquals(Boolean.FALSE, FieldUtils.readField(parentB, privatelyShadowedChild, true));
        final Field parentI = FieldUtils.getDeclaredField(parentClass, "i", true);
        parentI.setAccessible(false);
        assertEquals(I0, FieldUtils.readField(parentI, publicChild, true));
        assertEquals(I0, FieldUtils.readField(parentI, publiclyShadowedChild, true));
        assertEquals(I0, FieldUtils.readField(parentI, privatelyShadowedChild, true));
        final Field parentD = FieldUtils.getDeclaredField(parentClass, "d", true);
        parentD.setAccessible(false);
        assertEquals(D0, FieldUtils.readField(parentD, publicChild, true));
        assertEquals(D0, FieldUtils.readField(parentD, publiclyShadowedChild, true));
        assertEquals(D0, FieldUtils.readField(parentD, privatelyShadowedChild, true));

        try {
            FieldUtils.readField((Field) null, publicChild, true);
            fail("a null field should cause an IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void FieldUtils() throws Exception {
        assertEquals("s", FieldUtils.readField(publicChild, "s"));
        assertEquals("ss", FieldUtils.readField(publiclyShadowedChild, "s"));
        assertEquals("s", FieldUtils.readField(privatelyShadowedChild, "s"));

        try {
            FieldUtils.readField(publicChild, null);
            fail("a null field name should cause an IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }

        try {
            FieldUtils.readField((Object) null, "none");
            fail("a null target should cause an IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }

        try {
            assertEquals(Boolean.FALSE, FieldUtils.readField(publicChild, "b"));
            fail("expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        assertEquals(Boolean.TRUE, FieldUtils.readField(publiclyShadowedChild, "b"));
        try {
            assertEquals(Boolean.FALSE, FieldUtils.readField(privatelyShadowedChild, "b"));
            fail("expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        try {
            assertEquals(I0, FieldUtils.readField(publicChild, "i"));
            fail("expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        assertEquals(I1, FieldUtils.readField(publiclyShadowedChild, "i"));
        try {
            assertEquals(I0, FieldUtils.readField(privatelyShadowedChild, "i"));
            fail("expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        try {
            assertEquals(D0, FieldUtils.readField(publicChild, "d"));
            fail("expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        assertEquals(D1, FieldUtils.readField(publiclyShadowedChild, "d"));
        try {
            assertEquals(D0, FieldUtils.readField(privatelyShadowedChild, "d"));
            fail("expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
    }

    @Test
    public void FieldUtils() throws Exception {
        assertEquals("s", FieldUtils.readField(publicChild, "s", true));
        assertEquals("ss", FieldUtils.readField(publiclyShadowedChild, "s", true));
        assertEquals("ss", FieldUtils.readField(privatelyShadowedChild, "s", true));
        assertEquals(Boolean.FALSE, FieldUtils.readField(publicChild, "b", true));
        assertEquals(Boolean.TRUE, FieldUtils.readField(publiclyShadowedChild, "b", true));
        assertEquals(Boolean.TRUE, FieldUtils.readField(privatelyShadowedChild, "b", true));
        assertEquals(I0, FieldUtils.readField(publicChild, "i", true));
        assertEquals(I1, FieldUtils.readField(publiclyShadowedChild, "i", true));
        assertEquals(I1, FieldUtils.readField(privatelyShadowedChild, "i", true));
        assertEquals(D0, FieldUtils.readField(publicChild, "d", true));
        assertEquals(D1, FieldUtils.readField(publiclyShadowedChild, "d", true));
        assertEquals(D1, FieldUtils.readField(privatelyShadowedChild, "d", true));

        try {
            FieldUtils.readField(publicChild, null, true);
            fail("a null field name should cause an IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }

        try {
            FieldUtils.readField((Object) null, "none", true);
            fail("a null target should cause an IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void FieldUtils() throws Exception {
        try {
            FieldUtils.readDeclaredField(publicChild, null);
            fail("a null field name should cause an IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }

        try {
            FieldUtils.readDeclaredField((Object) null, "none");
            fail("a null target should cause an IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }

        try {
            assertEquals("s", FieldUtils.readDeclaredField(publicChild, "s"));
            fail("expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        assertEquals("ss", FieldUtils.readDeclaredField(publiclyShadowedChild, "s"));
        try {
            assertEquals("s", FieldUtils.readDeclaredField(privatelyShadowedChild, "s"));
            fail("expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        try {
            assertEquals(Boolean.FALSE, FieldUtils.readDeclaredField(publicChild, "b"));
            fail("expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        assertEquals(Boolean.TRUE, FieldUtils.readDeclaredField(publiclyShadowedChild, "b"));
        try {
            assertEquals(Boolean.FALSE, FieldUtils.readDeclaredField(privatelyShadowedChild, "b"));
            fail("expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        try {
            assertEquals(I0, FieldUtils.readDeclaredField(publicChild, "i"));
            fail("expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        assertEquals(I1, FieldUtils.readDeclaredField(publiclyShadowedChild, "i"));
        try {
            assertEquals(I0, FieldUtils.readDeclaredField(privatelyShadowedChild, "i"));
            fail("expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        try {
            assertEquals(D0, FieldUtils.readDeclaredField(publicChild, "d"));
            fail("expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        assertEquals(D1, FieldUtils.readDeclaredField(publiclyShadowedChild, "d"));
        try {
            assertEquals(D0, FieldUtils.readDeclaredField(privatelyShadowedChild, "d"));
            fail("expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
    }

    @Test
    public void FieldUtils() throws Exception {
        try {
            FieldUtils.readDeclaredField(publicChild, null, true);
            fail("a null field name should cause an IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }

        try {
            FieldUtils.readDeclaredField((Object) null, "none", true);
            fail("a null target should cause an IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }

        try {
            assertEquals("s", FieldUtils.readDeclaredField(publicChild, "s", true));
            fail("expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        assertEquals("ss", FieldUtils.readDeclaredField(publiclyShadowedChild, "s", true));
        assertEquals("ss", FieldUtils.readDeclaredField(privatelyShadowedChild, "s", true));
        try {
            assertEquals(Boolean.FALSE, FieldUtils.readDeclaredField(publicChild, "b", true));
            fail("expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        assertEquals(Boolean.TRUE, FieldUtils.readDeclaredField(publiclyShadowedChild, "b", true));
        assertEquals(Boolean.TRUE, FieldUtils.readDeclaredField(privatelyShadowedChild, "b", true));
        try {
            assertEquals(I0, FieldUtils.readDeclaredField(publicChild, "i", true));
            fail("expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        assertEquals(I1, FieldUtils.readDeclaredField(publiclyShadowedChild, "i", true));
        assertEquals(I1, FieldUtils.readDeclaredField(privatelyShadowedChild, "i", true));
        try {
            assertEquals(D0, FieldUtils.readDeclaredField(publicChild, "d", true));
            fail("expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        assertEquals(D1, FieldUtils.readDeclaredField(publiclyShadowedChild, "d", true));
        assertEquals(D1, FieldUtils.readDeclaredField(privatelyShadowedChild, "d", true));
    }

    @Test
    public void FieldUtils() throws Exception {
        Field field = StaticContainer.class.getDeclaredField("mutablePublic");
        FieldUtils.writeStaticField(field, "new");
        assertEquals("new", StaticContainer.mutablePublic);
        field = StaticContainer.class.getDeclaredField("mutableProtected");
        try {
            FieldUtils.writeStaticField(field, "new");
            fail("Expected IllegalAccessException");
        } catch (final IllegalAccessException e) {
            // pass
        }
        field = StaticContainer.class.getDeclaredField("mutablePackage");
        try {
            FieldUtils.writeStaticField(field, "new");
            fail("Expected IllegalAccessException");
        } catch (final IllegalAccessException e) {
            // pass
        }
        field = StaticContainer.class.getDeclaredField("mutablePrivate");
        try {
            FieldUtils.writeStaticField(field, "new");
            fail("Expected IllegalAccessException");
        } catch (final IllegalAccessException e) {
            // pass
        }
        field = StaticContainer.class.getDeclaredField("IMMUTABLE_PUBLIC");
        try {
            FieldUtils.writeStaticField(field, "new");
            fail("Expected IllegalAccessException");
        } catch (final IllegalAccessException e) {
            // pass
        }
        field = StaticContainer.class.getDeclaredField("IMMUTABLE_PROTECTED");
        try {
            FieldUtils.writeStaticField(field, "new");
            fail("Expected IllegalAccessException");
        } catch (final IllegalAccessException e) {
            // pass
        }
        field = StaticContainer.class.getDeclaredField("IMMUTABLE_PACKAGE");
        try {
            FieldUtils.writeStaticField(field, "new");
            fail("Expected IllegalAccessException");
        } catch (final IllegalAccessException e) {
            // pass
        }
        field = StaticContainer.class.getDeclaredField("IMMUTABLE_PRIVATE");
        try {
            FieldUtils.writeStaticField(field, "new");
            fail("Expected IllegalAccessException");
        } catch (final IllegalAccessException e) {
            // pass
        }
    }



}
