
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
 * Test the Triple class.
 * @version $Id$
 */
public class ImmutableTripleTest {


    @Test
    public void ImmutableTriple() throws Exception {
        assertEquals(ImmutableTriple.of(null, "foo", Boolean.TRUE).hashCode(), ImmutableTriple.of(null, "foo", Boolean.TRUE).hashCode());
    }

    @Test
    public void ImmutableTriple() throws Exception {
        assertEquals("(null,null,null)", ImmutableTriple.of(null, null, null).toString());
        assertEquals("(null,two,null)", ImmutableTriple.of(null, "two", null).toString());
        assertEquals("(one,null,null)", ImmutableTriple.of("one", null, null).toString());
        assertEquals("(one,two,null)", ImmutableTriple.of("one", "two", null).toString());
        assertEquals("(null,two,three)", ImmutableTriple.of(null, "two", "three").toString());
        assertEquals("(one,null,three)", ImmutableTriple.of("one", null, "three").toString());
        assertEquals("(one,two,three)", MutableTriple.of("one", "two", "three").toString());
    }

    @Test
    @SuppressWarnings("unchecked")
    public void ImmutableTriple() throws Exception {
        final ImmutableTriple<Integer, String, Boolean> origTriple = ImmutableTriple.of(0, "foo", Boolean.TRUE);
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final ObjectOutputStream out = new ObjectOutputStream(baos);
        out.writeObject(origTriple);
        final ImmutableTriple<Integer, String, Boolean> deserializedTriple = (ImmutableTriple<Integer, String, Boolean>) new ObjectInputStream(
                new ByteArrayInputStream(baos.toByteArray())).readObject();
        assertEquals(origTriple, deserializedTriple);
        assertEquals(origTriple.hashCode(), deserializedTriple.hashCode());
    }
}

