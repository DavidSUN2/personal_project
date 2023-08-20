
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
 * @see MutableInt
 */
public class MutableIntTest {

    @Test
    public void MutableInt() {
        assertEquals(Integer.valueOf(0), new MutableInt(0).toInteger());
        assertEquals(Integer.valueOf(123), new MutableInt(123).toInteger());
    }

    @Test
    public void MutableInt() {
        final MutableInt mutNum = new MutableInt(1);
        mutNum.increment();
        
        assertEquals(2, mutNum.intValue());
        assertEquals(2L, mutNum.longValue());
    }

    @Test
    public void MutableInt() {
        final MutableInt mutNum = new MutableInt(1);
        mutNum.decrement();
        
        assertEquals(0, mutNum.intValue());
        assertEquals(0L, mutNum.longValue());
    }

    @Test
    public void MutableInt() {
        final MutableInt mutNum = new MutableInt(1);
        mutNum.add(1);
        
        assertEquals(2, mutNum.intValue());
        assertEquals(2L, mutNum.longValue());
    }

    @Test
    public void MutableInt() {
        final MutableInt mutNum = new MutableInt(1);
        mutNum.add(Integer.valueOf(1));
        
        assertEquals(2, mutNum.intValue());
        assertEquals(2L, mutNum.longValue());
    }

    @Test
    public void MutableInt() {
        final MutableInt mutNum = new MutableInt(1);
        mutNum.subtract(1);
        
        assertEquals(0, mutNum.intValue());
        assertEquals(0L, mutNum.longValue());
    }

    @Test
    public void MutableInt() {
        final MutableInt mutNum = new MutableInt(1);
        mutNum.subtract(Integer.valueOf(1));
        
        assertEquals(0, mutNum.intValue());
        assertEquals(0L, mutNum.longValue());
    }

    @Test
    public void MutableInt() {
        assertEquals("0", new MutableInt(0).toString());
        assertEquals("10", new MutableInt(10).toString());
        assertEquals("-123", new MutableInt(-123).toString());
    }

}
