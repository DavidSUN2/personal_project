
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
 * @see MutableFloat
 */
public class MutableFloatTest {

    // ----------------------------------------------------------------
    @Test
    public void MutableFloat() {
        assertEquals(Float.valueOf(0f), new MutableFloat(0f).toFloat());
        assertEquals(Float.valueOf(12.3f), new MutableFloat(12.3f).toFloat());
    }

    @Test
    public void MutableFloat() {
        final MutableFloat mutNum = new MutableFloat(1);
        mutNum.increment();
        
        assertEquals(2, mutNum.intValue());
        assertEquals(2L, mutNum.longValue());
    }

    @Test
    public void MutableFloat() {
        final MutableFloat mutNum = new MutableFloat(1);
        mutNum.decrement();
        
        assertEquals(0, mutNum.intValue());
        assertEquals(0L, mutNum.longValue());
    }

    @Test
    public void MutableFloat() {
        final MutableFloat mutNum = new MutableFloat(1);
        mutNum.add(1.1f);
        
        assertEquals(2.1f, mutNum.floatValue(), 0.01f);
    }

    @Test
    public void MutableFloat() {
        final MutableFloat mutNum = new MutableFloat(1);
        mutNum.add(Float.valueOf(1.1f));
        
        assertEquals(2.1f, mutNum.floatValue(), 0.01f);
    }

    @Test
    public void MutableFloat() {
        final MutableFloat mutNum = new MutableFloat(1);
        mutNum.subtract(0.9f);
        
        assertEquals(0.1f, mutNum.floatValue(), 0.01f);
    }

    @Test
    public void MutableFloat() {
        final MutableFloat mutNum = new MutableFloat(1);
        mutNum.subtract(Float.valueOf(0.9f));
        
        assertEquals(0.1f, mutNum.floatValue(), 0.01f);
    }

    @Test
    public void MutableFloat() {
        assertEquals("0.0", new MutableFloat(0f).toString());
        assertEquals("10.0", new MutableFloat(10f).toString());
        assertEquals("-123.0", new MutableFloat(-123f).toString());
    }
}
