
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
 * @see MutableByte
 */
public class MutableByteTest {

    @Test
    public void MutableByte() {
        assertEquals(Byte.valueOf((byte) 0), new MutableByte((byte) 0).toByte());
        assertEquals(Byte.valueOf((byte) 123), new MutableByte((byte) 123).toByte());
    }

    @Test
    public void MutableByte() {
        final MutableByte mutNum = new MutableByte((byte) 1);
        mutNum.increment();
        
        assertEquals(2, mutNum.intValue());
        assertEquals(2L, mutNum.longValue());
    }

    @Test
    public void MutableByte() {
        final MutableByte mutNum = new MutableByte((byte) 1);
        mutNum.decrement();
        
        assertEquals(0, mutNum.intValue());
        assertEquals(0L, mutNum.longValue());
    }

    @Test
    public void MutableByte() {
        final MutableByte mutNum = new MutableByte((byte) 1);
        mutNum.add((byte)1);
        
        assertEquals((byte) 2, mutNum.byteValue());
    }

    @Test
    public void MutableByte() {
        final MutableByte mutNum = new MutableByte((byte) 1);
        mutNum.add(Integer.valueOf(1));
        
        assertEquals((byte) 2, mutNum.byteValue());
    }

    @Test
    public void MutableByte() {
        final MutableByte mutNum = new MutableByte((byte) 1);
        mutNum.subtract((byte) 1);
        
        assertEquals((byte) 0, mutNum.byteValue());
    }

    @Test
    public void MutableByte() {
        final MutableByte mutNum = new MutableByte((byte) 1);
        mutNum.subtract(Integer.valueOf(1));
        
        assertEquals((byte) 0, mutNum.byteValue());
    }

    @Test
    public void MutableByte() {
        assertEquals("0", new MutableByte((byte) 0).toString());
        assertEquals("10", new MutableByte((byte) 10).toString());
        assertEquals("-123", new MutableByte((byte) -123).toString());
    }

}
