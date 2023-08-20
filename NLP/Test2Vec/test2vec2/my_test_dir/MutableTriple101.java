
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
package org.apache.commons.lang3.tuple;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

/**
 * Test the MutableTriple class.
 * @version $Id$
 */
public class MutableTripleTest {

    @Test
    public void MutableTriple() throws Exception {
        assertEquals(MutableTriple.of(null, "foo", "baz"), MutableTriple.of(null, "foo", "baz"));
        assertFalse(MutableTriple.of("foo", 0, Boolean.TRUE).equals(MutableTriple.of("foo", null, Boolean.TRUE)));
        assertFalse(MutableTriple.of("foo", "bar", "baz").equals(MutableTriple.of("xyz", "bar", "baz")));
        assertFalse(MutableTriple.of("foo", "bar", "baz").equals(MutableTriple.of("foo", "bar", "blo")));

        final MutableTriple<String, String, String> p = MutableTriple.of("foo", "bar", "baz");
        assertTrue(p.equals(p));
        assertFalse(p.equals(new Object()));
    }

    @Test
    public void MutableTriple() throws Exception {
        assertEquals(MutableTriple.of(null, "foo", "baz").hashCode(), MutableTriple.of(null, "foo", "baz").hashCode());
    }

    @Test
    public void MutableTriple() throws Exception {
        assertEquals("(null,null,null)", MutableTriple.of(null, null, null).toString());
        assertEquals("(null,two,null)", MutableTriple.of(null, "two", null).toString());
        assertEquals("(one,null,null)", MutableTriple.of("one", null, null).toString());
        assertEquals("(one,two,null)", MutableTriple.of("one", "two", null).toString());
        assertEquals("(null,two,three)", MutableTriple.of(null, "two", "three").toString());
        assertEquals("(one,null,three)", MutableTriple.of("one", null, "three").toString());
        assertEquals("(one,two,three)", MutableTriple.of("one", "two", "three").toString());
    }

    @Test
    @SuppressWarnings("unchecked")
    public void MutableTriple() throws Exception {
        final MutableTriple<Integer, String, Boolean> origTriple = MutableTriple.of(0, "foo", Boolean.TRUE);
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final ObjectOutputStream out = new ObjectOutputStream(baos);
        out.writeObject(origTriple);
        final MutableTriple<Integer, String, Boolean> deserializedTriple = (MutableTriple<Integer, String, Boolean>) new ObjectInputStream(
                new ByteArrayInputStream(baos.toByteArray())).readObject();
        assertEquals(origTriple, deserializedTriple);
        assertEquals(origTriple.hashCode(), deserializedTriple.hashCode());
    }
}

