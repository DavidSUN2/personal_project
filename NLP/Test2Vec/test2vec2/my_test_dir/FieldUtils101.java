
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
    public void FieldUtils() throws Exception {
        Field field = StaticContainer.class.getDeclaredField("mutablePublic");
        FieldUtils.writeStaticField(field, "new", true);
        assertEquals("new", StaticContainer.mutablePublic);
        field = StaticContainer.class.getDeclaredField("mutableProtected");
        FieldUtils.writeStaticField(field, "new", true);
        assertEquals("new", StaticContainer.getMutableProtected());
        field = StaticContainer.class.getDeclaredField("mutablePackage");
        FieldUtils.writeStaticField(field, "new", true);
        assertEquals("new", StaticContainer.getMutablePackage());
        field = StaticContainer.class.getDeclaredField("mutablePrivate");
        FieldUtils.writeStaticField(field, "new", true);
        assertEquals("new", StaticContainer.getMutablePrivate());
        field = StaticContainer.class.getDeclaredField("IMMUTABLE_PUBLIC");
        try {
            FieldUtils.writeStaticField(field, "new", true);
            fail("Expected IllegalAccessException");
        } catch (final IllegalAccessException e) {
            // pass
        }
        field = StaticContainer.class.getDeclaredField("IMMUTABLE_PROTECTED");
        try {
            FieldUtils.writeStaticField(field, "new", true);
            fail("Expected IllegalAccessException");
        } catch (final IllegalAccessException e) {
            // pass
        }
        field = StaticContainer.class.getDeclaredField("IMMUTABLE_PACKAGE");
        try {
            FieldUtils.writeStaticField(field, "new", true);
            fail("Expected IllegalAccessException");
        } catch (final IllegalAccessException e) {
            // pass
        }
        field = StaticContainer.class.getDeclaredField("IMMUTABLE_PRIVATE");
        try {
            FieldUtils.writeStaticField(field, "new", true);
            fail("Expected IllegalAccessException");
        } catch (final IllegalAccessException e) {
            // pass
        }
    }

    @Test
    public void FieldUtils() throws Exception {
        FieldUtils.writeStaticField(StaticContainerChild.class, "mutablePublic", "new");
        assertEquals("new", StaticContainer.mutablePublic);
        try {
            FieldUtils.writeStaticField(StaticContainerChild.class, "mutableProtected", "new");
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        try {
            FieldUtils.writeStaticField(StaticContainerChild.class, "mutablePackage", "new");
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        try {
            FieldUtils.writeStaticField(StaticContainerChild.class, "mutablePrivate", "new");
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        try {
            FieldUtils.writeStaticField(StaticContainerChild.class, "IMMUTABLE_PUBLIC", "new");
            fail("Expected IllegalAccessException");
        } catch (final IllegalAccessException e) {
            // pass
        }
        try {
            FieldUtils.writeStaticField(StaticContainerChild.class, "IMMUTABLE_PROTECTED", "new");
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        try {
            FieldUtils.writeStaticField(StaticContainerChild.class, "IMMUTABLE_PACKAGE", "new");
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        try {
            FieldUtils.writeStaticField(StaticContainerChild.class, "IMMUTABLE_PRIVATE", "new");
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
    }

    @Test
    public void FieldUtils() throws Exception {
        FieldUtils.writeStaticField(StaticContainerChild.class, "mutablePublic", "new", true);
        assertEquals("new", StaticContainer.mutablePublic);
        FieldUtils.writeStaticField(StaticContainerChild.class, "mutableProtected", "new", true);
        assertEquals("new", StaticContainer.getMutableProtected());
        FieldUtils.writeStaticField(StaticContainerChild.class, "mutablePackage", "new", true);
        assertEquals("new", StaticContainer.getMutablePackage());
        FieldUtils.writeStaticField(StaticContainerChild.class, "mutablePrivate", "new", true);
        assertEquals("new", StaticContainer.getMutablePrivate());
        try {
            FieldUtils.writeStaticField(StaticContainerChild.class, "IMMUTABLE_PUBLIC", "new", true);
            fail("Expected IllegalAccessException");
        } catch (final IllegalAccessException e) {
            // pass
        }
        try {
            FieldUtils.writeStaticField(StaticContainerChild.class, "IMMUTABLE_PROTECTED", "new", true);
            fail("Expected IllegalAccessException");
        } catch (final IllegalAccessException e) {
            // pass
        }
        try {
            FieldUtils.writeStaticField(StaticContainerChild.class, "IMMUTABLE_PACKAGE", "new", true);
            fail("Expected IllegalAccessException");
        } catch (final IllegalAccessException e) {
            // pass
        }
        try {
            FieldUtils.writeStaticField(StaticContainerChild.class, "IMMUTABLE_PRIVATE", "new", true);
            fail("Expected IllegalAccessException");
        } catch (final IllegalAccessException e) {
            // pass
        }
    }

    @Test
    public void FieldUtils() throws Exception {
        FieldUtils.writeStaticField(StaticContainer.class, "mutablePublic", "new");
        assertEquals("new", StaticContainer.mutablePublic);
        try {
            FieldUtils.writeDeclaredStaticField(StaticContainer.class, "mutableProtected", "new");
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        try {
            FieldUtils.writeDeclaredStaticField(StaticContainer.class, "mutablePackage", "new");
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        try {
            FieldUtils.writeDeclaredStaticField(StaticContainer.class, "mutablePrivate", "new");
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        try {
            FieldUtils.writeDeclaredStaticField(StaticContainer.class, "IMMUTABLE_PUBLIC", "new");
            fail("Expected IllegalAccessException");
        } catch (final IllegalAccessException e) {
            // pass
        }
        try {
            FieldUtils.writeDeclaredStaticField(StaticContainer.class, "IMMUTABLE_PROTECTED", "new");
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        try {
            FieldUtils.writeDeclaredStaticField(StaticContainer.class, "IMMUTABLE_PACKAGE", "new");
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        try {
            FieldUtils.writeDeclaredStaticField(StaticContainer.class, "IMMUTABLE_PRIVATE", "new");
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
    }

    @Test
    public void FieldUtils() throws Exception {
        FieldUtils.writeDeclaredStaticField(StaticContainer.class, "mutablePublic", "new", true);
        assertEquals("new", StaticContainer.mutablePublic);
        FieldUtils.writeDeclaredStaticField(StaticContainer.class, "mutableProtected", "new", true);
        assertEquals("new", StaticContainer.getMutableProtected());
        FieldUtils.writeDeclaredStaticField(StaticContainer.class, "mutablePackage", "new", true);
        assertEquals("new", StaticContainer.getMutablePackage());
        FieldUtils.writeDeclaredStaticField(StaticContainer.class, "mutablePrivate", "new", true);
        assertEquals("new", StaticContainer.getMutablePrivate());
        try {
            FieldUtils.writeDeclaredStaticField(StaticContainer.class, "IMMUTABLE_PUBLIC", "new", true);
            fail("Expected IllegalAccessException");
        } catch (final IllegalAccessException e) {
            // pass
        }
        try {
            FieldUtils.writeDeclaredStaticField(StaticContainer.class, "IMMUTABLE_PROTECTED", "new", true);
            fail("Expected IllegalAccessException");
        } catch (final IllegalAccessException e) {
            // pass
        }
        try {
            FieldUtils.writeDeclaredStaticField(StaticContainer.class, "IMMUTABLE_PACKAGE", "new", true);
            fail("Expected IllegalAccessException");
        } catch (final IllegalAccessException e) {
            // pass
        }
        try {
            FieldUtils.writeDeclaredStaticField(StaticContainer.class, "IMMUTABLE_PRIVATE", "new", true);
            fail("Expected IllegalAccessException");
        } catch (final IllegalAccessException e) {
            // pass
        }
    }

    @Test
    public void FieldUtils() throws Exception {
        Field field = parentClass.getDeclaredField("s");
        FieldUtils.writeField(field, publicChild, "S");
        assertEquals("S", field.get(publicChild));
        field = parentClass.getDeclaredField("b");
        try {
            FieldUtils.writeField(field, publicChild, Boolean.TRUE);
            fail("Expected IllegalAccessException");
        } catch (final IllegalAccessException e) {
            // pass
        }
        field = parentClass.getDeclaredField("i");
        try {
            FieldUtils.writeField(field, publicChild, Integer.valueOf(Integer.MAX_VALUE));
        } catch (final IllegalAccessException e) {
            // pass
        }
        field = parentClass.getDeclaredField("d");
        try {
            FieldUtils.writeField(field, publicChild, Double.valueOf(Double.MAX_VALUE));
        } catch (final IllegalAccessException e) {
            // pass
        }
    }

    @Test
    public void FieldUtils() throws Exception {
        Field field = parentClass.getDeclaredField("s");
        FieldUtils.writeField(field, publicChild, "S", true);
        assertEquals("S", field.get(publicChild));
        field = parentClass.getDeclaredField("b");
        FieldUtils.writeField(field, publicChild, Boolean.TRUE, true);
        assertEquals(Boolean.TRUE, field.get(publicChild));
        field = parentClass.getDeclaredField("i");
        FieldUtils.writeField(field, publicChild, Integer.valueOf(Integer.MAX_VALUE), true);
        assertEquals(Integer.valueOf(Integer.MAX_VALUE), field.get(publicChild));
        field = parentClass.getDeclaredField("d");
        FieldUtils.writeField(field, publicChild, Double.valueOf(Double.MAX_VALUE), true);
        assertEquals(Double.valueOf(Double.MAX_VALUE), field.get(publicChild));
    }

    @Test
    public void FieldUtils() throws Exception {
        FieldUtils.writeField(publicChild, "s", "S");
        assertEquals("S", FieldUtils.readField(publicChild, "s"));
        try {
            FieldUtils.writeField(publicChild, "b", Boolean.TRUE);
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        try {
            FieldUtils.writeField(publicChild, "i", Integer.valueOf(1));
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        try {
            FieldUtils.writeField(publicChild, "d", Double.valueOf(1.0));
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }

        FieldUtils.writeField(publiclyShadowedChild, "s", "S");
        assertEquals("S", FieldUtils.readField(publiclyShadowedChild, "s"));
        FieldUtils.writeField(publiclyShadowedChild, "b", Boolean.FALSE);
        assertEquals(Boolean.FALSE, FieldUtils.readField(publiclyShadowedChild, "b"));
        FieldUtils.writeField(publiclyShadowedChild, "i", Integer.valueOf(0));
        assertEquals(Integer.valueOf(0), FieldUtils.readField(publiclyShadowedChild, "i"));
        FieldUtils.writeField(publiclyShadowedChild, "d", Double.valueOf(0.0));
        assertEquals(Double.valueOf(0.0), FieldUtils.readField(publiclyShadowedChild, "d"));

        FieldUtils.writeField(privatelyShadowedChild, "s", "S");
        assertEquals("S", FieldUtils.readField(privatelyShadowedChild, "s"));
        try {
            FieldUtils.writeField(privatelyShadowedChild, "b", Boolean.TRUE);
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        try {
            FieldUtils.writeField(privatelyShadowedChild, "i", Integer.valueOf(1));
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        try {
            FieldUtils.writeField(privatelyShadowedChild, "d", Double.valueOf(1.0));
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
    }

    @Test
    public void FieldUtils() throws Exception {
        FieldUtils.writeField(publicChild, "s", "S", true);
        assertEquals("S", FieldUtils.readField(publicChild, "s", true));
        FieldUtils.writeField(publicChild, "b", Boolean.TRUE, true);
        assertEquals(Boolean.TRUE, FieldUtils.readField(publicChild, "b", true));
        FieldUtils.writeField(publicChild, "i", Integer.valueOf(1), true);
        assertEquals(Integer.valueOf(1), FieldUtils.readField(publicChild, "i", true));
        FieldUtils.writeField(publicChild, "d", Double.valueOf(1.0), true);
        assertEquals(Double.valueOf(1.0), FieldUtils.readField(publicChild, "d", true));

        FieldUtils.writeField(publiclyShadowedChild, "s", "S", true);
        assertEquals("S", FieldUtils.readField(publiclyShadowedChild, "s", true));
        FieldUtils.writeField(publiclyShadowedChild, "b", Boolean.FALSE, true);
        assertEquals(Boolean.FALSE, FieldUtils.readField(publiclyShadowedChild, "b", true));
        FieldUtils.writeField(publiclyShadowedChild, "i", Integer.valueOf(0), true);
        assertEquals(Integer.valueOf(0), FieldUtils.readField(publiclyShadowedChild, "i", true));
        FieldUtils.writeField(publiclyShadowedChild, "d", Double.valueOf(0.0), true);
        assertEquals(Double.valueOf(0.0), FieldUtils.readField(publiclyShadowedChild, "d", true));

        FieldUtils.writeField(privatelyShadowedChild, "s", "S", true);
        assertEquals("S", FieldUtils.readField(privatelyShadowedChild, "s", true));
        FieldUtils.writeField(privatelyShadowedChild, "b", Boolean.FALSE, true);
        assertEquals(Boolean.FALSE, FieldUtils.readField(privatelyShadowedChild, "b", true));
        FieldUtils.writeField(privatelyShadowedChild, "i", Integer.valueOf(0), true);
        assertEquals(Integer.valueOf(0), FieldUtils.readField(privatelyShadowedChild, "i", true));
        FieldUtils.writeField(privatelyShadowedChild, "d", Double.valueOf(0.0), true);
        assertEquals(Double.valueOf(0.0), FieldUtils.readField(privatelyShadowedChild, "d", true));
    }

    @Test
    public void FieldUtils() throws Exception {
        try {
            FieldUtils.writeDeclaredField(publicChild, "s", "S");
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        try {
            FieldUtils.writeDeclaredField(publicChild, "b", Boolean.TRUE);
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        try {
            FieldUtils.writeDeclaredField(publicChild, "i", Integer.valueOf(1));
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        try {
            FieldUtils.writeDeclaredField(publicChild, "d", Double.valueOf(1.0));
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }

        FieldUtils.writeDeclaredField(publiclyShadowedChild, "s", "S");
        assertEquals("S", FieldUtils.readDeclaredField(publiclyShadowedChild, "s"));
        FieldUtils.writeDeclaredField(publiclyShadowedChild, "b", Boolean.FALSE);
        assertEquals(Boolean.FALSE, FieldUtils.readDeclaredField(publiclyShadowedChild, "b"));
        FieldUtils.writeDeclaredField(publiclyShadowedChild, "i", Integer.valueOf(0));
        assertEquals(Integer.valueOf(0), FieldUtils.readDeclaredField(publiclyShadowedChild, "i"));
        FieldUtils.writeDeclaredField(publiclyShadowedChild, "d", Double.valueOf(0.0));
        assertEquals(Double.valueOf(0.0), FieldUtils.readDeclaredField(publiclyShadowedChild, "d"));

        try {
            FieldUtils.writeDeclaredField(privatelyShadowedChild, "s", "S");
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        try {
            FieldUtils.writeDeclaredField(privatelyShadowedChild, "b", Boolean.TRUE);
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        try {
            FieldUtils.writeDeclaredField(privatelyShadowedChild, "i", Integer.valueOf(1));
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        try {
            FieldUtils.writeDeclaredField(privatelyShadowedChild, "d", Double.valueOf(1.0));
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
    }

    @Test
    public void FieldUtils() throws Exception {
        try {
            FieldUtils.writeDeclaredField(publicChild, "s", "S", true);
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        try {
            FieldUtils.writeDeclaredField(publicChild, "b", Boolean.TRUE, true);
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        try {
            FieldUtils.writeDeclaredField(publicChild, "i", Integer.valueOf(1), true);
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        try {
            FieldUtils.writeDeclaredField(publicChild, "d", Double.valueOf(1.0), true);
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }

        FieldUtils.writeDeclaredField(publiclyShadowedChild, "s", "S", true);
        assertEquals("S", FieldUtils.readDeclaredField(publiclyShadowedChild, "s", true));
        FieldUtils.writeDeclaredField(publiclyShadowedChild, "b", Boolean.FALSE, true);
        assertEquals(Boolean.FALSE, FieldUtils.readDeclaredField(publiclyShadowedChild, "b", true));
        FieldUtils.writeDeclaredField(publiclyShadowedChild, "i", Integer.valueOf(0), true);
        assertEquals(Integer.valueOf(0), FieldUtils.readDeclaredField(publiclyShadowedChild, "i", true));
        FieldUtils.writeDeclaredField(publiclyShadowedChild, "d", Double.valueOf(0.0), true);
        assertEquals(Double.valueOf(0.0), FieldUtils.readDeclaredField(publiclyShadowedChild, "d", true));

        FieldUtils.writeDeclaredField(privatelyShadowedChild, "s", "S", true);
        assertEquals("S", FieldUtils.readDeclaredField(privatelyShadowedChild, "s", true));
        FieldUtils.writeDeclaredField(privatelyShadowedChild, "b", Boolean.FALSE, true);
        assertEquals(Boolean.FALSE, FieldUtils.readDeclaredField(privatelyShadowedChild, "b", true));
        FieldUtils.writeDeclaredField(privatelyShadowedChild, "i", Integer.valueOf(0), true);
        assertEquals(Integer.valueOf(0), FieldUtils.readDeclaredField(privatelyShadowedChild, "i", true));
        FieldUtils.writeDeclaredField(privatelyShadowedChild, "d", Double.valueOf(0.0), true);
        assertEquals(Double.valueOf(0.0), FieldUtils.readDeclaredField(privatelyShadowedChild, "d", true));
    }

    @Test(expected = IllegalArgumentException.class)
    public void FieldUtils() {
        FieldUtils.getField(Ambig.class, "VALUE");
    }

}
