
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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.HashMap;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.SerializationUtils}.
 *
 * @version $Id$
 */
public class SerializationUtilsTest {

    @Test
    public void SerializationUtils() throws Exception {
        final ByteArrayOutputStream streamReal = new ByteArrayOutputStream();
        final ObjectOutputStream oos = new ObjectOutputStream(streamReal);
        oos.writeObject(new ClassNotFoundSerialization());
        oos.flush();
        oos.close();

        final ByteArrayInputStream inTest = new ByteArrayInputStream(streamReal.toByteArray());
        try {
            @SuppressWarnings("unused")
            final
            Object test = SerializationUtils.deserialize(inTest);
        } catch(final SerializationException se) {
            assertEquals("java.lang.ClassNotFoundException: " + CLASS_NOT_FOUND_MESSAGE, se.getMessage());
        }
    }
    
    //-----------------------------------------------------------------------

    @Test
    public void SerializationUtils() throws Exception {
        final byte[] testBytes = SerializationUtils.serialize(iMap);

        final ByteArrayOutputStream streamReal = new ByteArrayOutputStream();
        final ObjectOutputStream oos = new ObjectOutputStream(streamReal);
        oos.writeObject(iMap);
        oos.flush();
        oos.close();

        final byte[] realBytes = streamReal.toByteArray();
        assertEquals(testBytes.length, realBytes.length);
        for (int i = 0; i < realBytes.length; i++) {
            assertEquals(realBytes[i], testBytes[i]);
        }
    }

    @Test
    public void SerializationUtils() throws Exception {
        try {
            iMap.put(new Object(), new Object());
            SerializationUtils.serialize(iMap);
        } catch (final SerializationException ex) {
            return;
        }
        fail();
    }

    @Test
    public void SerializationUtils() throws Exception {
        final byte[] testBytes = SerializationUtils.serialize(null);

        final ByteArrayOutputStream streamReal = new ByteArrayOutputStream();
        final ObjectOutputStream oos = new ObjectOutputStream(streamReal);
        oos.writeObject(null);
        oos.flush();
        oos.close();

        final byte[] realBytes = streamReal.toByteArray();
        assertEquals(testBytes.length, realBytes.length);
        for (int i = 0; i < realBytes.length; i++) {
            assertEquals(realBytes[i], testBytes[i]);
        }
    }

    //-----------------------------------------------------------------------

    @Test
    public void SerializationUtils() throws Exception {
        final ByteArrayOutputStream streamReal = new ByteArrayOutputStream();
        final ObjectOutputStream oos = new ObjectOutputStream(streamReal);
        oos.writeObject(iMap);
        oos.flush();
        oos.close();

        final Object test = SerializationUtils.deserialize(streamReal.toByteArray());
        assertNotNull(test);
        assertTrue(test instanceof HashMap<?, ?>);
        assertTrue(test != iMap);
        final HashMap<?, ?> testMap = (HashMap<?, ?>) test;
        assertEquals(iString, testMap.get("FOO"));
        assertTrue(iString != testMap.get("FOO"));
        assertEquals(iInteger, testMap.get("BAR"));
        assertTrue(iInteger != testMap.get("BAR"));
        assertEquals(iMap, testMap);
    }

    @Test
    public void SerializationUtils() throws Exception {
        final ByteArrayOutputStream streamReal = new ByteArrayOutputStream();
        final ObjectOutputStream oos = new ObjectOutputStream(streamReal);
        oos.writeObject(null);
        oos.flush();
        oos.close();

        final Object test = SerializationUtils.deserialize(streamReal.toByteArray());
        assertNull(test);
    }

    @Test
    public void SerializationUtils() throws Exception {
        try {
            SerializationUtils.deserialize((byte[]) null);
        } catch (final IllegalArgumentException ex) {
            return;
        }
        fail();
    }

    @Test
    public void SerializationUtils() throws Exception {
        try {
            SerializationUtils.deserialize(new byte[0]);
        } catch (final SerializationException ex) {
            return;
        }
        fail();
    }

    //-----------------------------------------------------------------------

    @Test
    public void SerializationUtils() throws Exception {
        final Object test = SerializationUtils.clone(iMap);
        assertNotNull(test);
        assertTrue(test instanceof HashMap<?,?>);
        assertTrue(test != iMap);
        final HashMap<?, ?> testMap = (HashMap<?, ?>) test;
        assertEquals(iString, testMap.get("FOO"));
        assertTrue(iString != testMap.get("FOO"));
        assertEquals(iInteger, testMap.get("BAR"));
        assertTrue(iInteger != testMap.get("BAR"));
        assertEquals(iMap, testMap);
    }

    @Test
    public void SerializationUtils() throws Exception {
        final Object test = SerializationUtils.clone(null);
        assertNull(test);
    }

    @Test
    public void SerializationUtils() throws Exception {
        try {
            iMap.put(new Object(), new Object());
            SerializationUtils.clone(iMap);
        } catch (final SerializationException ex) {
            return;
        }
        fail();
    }
    
    @Test
    public void SerializationUtils() {
        final Class<?>[] primitiveTypes = { byte.class, short.class, int.class, long.class, float.class, double.class,
                boolean.class, char.class, void.class };

        for (final Class<?> primitiveType : primitiveTypes) {
            final Class<?> clone = SerializationUtils.clone(primitiveType);
            assertEquals(primitiveType, clone);
        }
    }

}

