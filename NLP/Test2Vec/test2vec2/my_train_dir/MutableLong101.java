
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
 * @version $Id$
 * @see MutableLong
 */
public class MutableLongTest {

    // ----------------------------------------------------------------
    @Test
    public void MutableLong() {
        assertEquals(0, new MutableLong().longValue());
        
        assertEquals(1, new MutableLong(1).longValue());
        
        assertEquals(2, new MutableLong(Long.valueOf(2)).longValue());
        assertEquals(3, new MutableLong(new MutableLong(3)).longValue());

        assertEquals(2, new MutableLong("2").longValue());

    }

    @Test(expected=NullPointerException.class)
    public void MutableLong() {
        new MutableLong((Number)null);
    }

    @Test
    public void MutableLong() {
        final MutableLong mutNum = new MutableLong(0);
        assertEquals(0, new MutableLong().longValue());
        assertEquals(Long.valueOf(0), new MutableLong().getValue());
        
        mutNum.setValue(1);
        assertEquals(1, mutNum.longValue());
        assertEquals(Long.valueOf(1), mutNum.getValue());
        
        mutNum.setValue(Long.valueOf(2));
        assertEquals(2, mutNum.longValue());
        assertEquals(Long.valueOf(2), mutNum.getValue());
        
        mutNum.setValue(new MutableLong(3));
        assertEquals(3, mutNum.longValue());
        assertEquals(Long.valueOf(3), mutNum.getValue());
    }

    @Test(expected=NullPointerException.class)
    public void MutableLong() {
        final MutableLong mutNum = new MutableLong(0);
        mutNum.setValue(null);
    }

    @Test
    public void MutableLong() {
        final MutableLong mutNumA = new MutableLong(0);
        final MutableLong mutNumB = new MutableLong(0);
        final MutableLong mutNumC = new MutableLong(1);

        assertTrue(mutNumA.equals(mutNumA));
        assertTrue(mutNumA.equals(mutNumB));
        assertTrue(mutNumB.equals(mutNumA));
        assertTrue(mutNumB.equals(mutNumB));
        assertFalse(mutNumA.equals(mutNumC));
        assertFalse(mutNumB.equals(mutNumC));
        assertTrue(mutNumC.equals(mutNumC));
        assertFalse(mutNumA.equals(null));
        assertFalse(mutNumA.equals(Long.valueOf(0)));
        assertFalse(mutNumA.equals("0"));
    }


}
