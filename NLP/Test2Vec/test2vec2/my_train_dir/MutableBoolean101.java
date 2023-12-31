
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

package org.apache.commons.lang3.mutable;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit tests.
 * 
 * @since 2.2
 * @see MutableBoolean
 * @version $Id$
 */
public class MutableBooleanTest {

    @Test
    public void MutableBoolean() {
        final MutableBoolean mutBool = new MutableBoolean(false);

        assertEquals(0, mutBool.compareTo(new MutableBoolean(false)));
        assertEquals(-1, mutBool.compareTo(new MutableBoolean(true)));
        mutBool.setValue(true);
        assertEquals(+1, mutBool.compareTo(new MutableBoolean(false)));
        assertEquals(0, mutBool.compareTo(new MutableBoolean(true)));
    }
    
    @Test(expected=NullPointerException.class)
    public void MutableBoolean() {
        final MutableBoolean mutBool = new MutableBoolean(false);
        mutBool.compareTo(null);
    }

    // ----------------------------------------------------------------
    @Test
    public void MutableBoolean() {
        assertFalse(new MutableBoolean().booleanValue());

        assertTrue(new MutableBoolean(true).booleanValue());
        assertFalse(new MutableBoolean(false).booleanValue());

        assertTrue(new MutableBoolean(Boolean.TRUE).booleanValue());
        assertFalse(new MutableBoolean(Boolean.FALSE).booleanValue());

    }

    @Test(expected=NullPointerException.class)
    public void MutableBoolean() {
        new MutableBoolean(null);
    }

    @Test
    public void MutableBoolean() {
        final MutableBoolean mutBoolA = new MutableBoolean(false);
        final MutableBoolean mutBoolB = new MutableBoolean(false);
        final MutableBoolean mutBoolC = new MutableBoolean(true);

        assertTrue(mutBoolA.equals(mutBoolA));
        assertTrue(mutBoolA.equals(mutBoolB));
        assertTrue(mutBoolB.equals(mutBoolA));
        assertTrue(mutBoolB.equals(mutBoolB));
        assertFalse(mutBoolA.equals(mutBoolC));
        assertFalse(mutBoolB.equals(mutBoolC));
        assertTrue(mutBoolC.equals(mutBoolC));
        assertFalse(mutBoolA.equals(null));
        assertFalse(mutBoolA.equals(Boolean.FALSE));
        assertFalse(mutBoolA.equals("false"));
    }



}
