
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
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Class to test BitField functionality
 *
 * @version $Id$
 */
public class BitFieldTest  {

    private static final BitField bf_multi  = new BitField(0x3F80);
    private static final BitField bf_single = new BitField(0x4000);
    private static final BitField bf_zero = new BitField(0);

    /**
     * test the getValue() method
     */
     /**
     * test the clearShort() method
     */
    @Test
    public void BitField() {
        assertEquals(bf_multi.clearShort((short) - 1), (short) 0xC07F);
        assertEquals(bf_single.clearShort((short) - 1), (short) 0xBFFF);
        assertEquals(bf_zero.clearShort((short) -1), (short) 0xFFFF);
    }

    /**
     * test the set() method
     */
    @Test
    public void BitField() {
        assertEquals(bf_multi.set(0), 0x3F80);
        assertEquals(bf_single.set(0), 0x4000);
        assertEquals(bf_zero.set(0), 0);
    }

    /**
     * test the setShort() method
     */
    @Test
    public void BitField() {
        assertEquals(bf_multi.setShort((short) 0), (short) 0x3F80);
        assertEquals(bf_single.setShort((short) 0), (short) 0x4000);
        assertEquals(bf_zero.setShort((short) 0), (short) 0);
    }

    /**
     * test the setBoolean() method
     */
    @Test
    public void BitField() {
        assertEquals(bf_multi.set(0), bf_multi.setBoolean(0, true));
        assertEquals(bf_single.set(0), bf_single.setBoolean(0, true));
        assertEquals(bf_zero.set(0), bf_zero.setBoolean(0, true));
        assertEquals(bf_multi.clear(-1), bf_multi.setBoolean(-1, false));
        assertEquals(bf_single.clear(-1), bf_single.setBoolean(-1, false));
        assertEquals(bf_zero.clear(-1), bf_zero.setBoolean(-1, false));
    }

    /**
     * test the setShortBoolean() method
     */
    @Test
    public void BitField() {
        assertEquals(bf_multi.setShort((short) 0), bf_multi.setShortBoolean((short) 0, true));
        assertEquals(bf_single.setShort((short) 0), bf_single.setShortBoolean((short) 0, true));
        assertEquals(bf_zero.setShort((short) 0), bf_zero.setShortBoolean((short) 0, true));
        assertEquals(bf_multi.clearShort((short) - 1), bf_multi.setShortBoolean((short) - 1, false));
        assertEquals(bf_single.clearShort((short) - 1), bf_single.setShortBoolean((short) - 1, false));
        assertEquals(bf_zero.clearShort((short) -1), bf_zero.setShortBoolean((short) -1, false));
    }

}
