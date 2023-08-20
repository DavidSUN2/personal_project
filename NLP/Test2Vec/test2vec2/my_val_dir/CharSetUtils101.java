
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
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.CharSetUtils}.
 *
 * @version $Id$
 */
public class CharSetUtilsTest  {

    //-----------------------------------------------------------------------
    @Test
    public void CharSetUtils() {
        assertNotNull(new CharSetUtils());
        final Constructor<?>[] cons = CharSetUtils.class.getDeclaredConstructors();
        assertEquals(1, cons.length);
        assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        assertTrue(Modifier.isPublic(CharSetUtils.class.getModifiers()));
        assertFalse(Modifier.isFinal(CharSetUtils.class.getModifiers()));
    }
    
    //-----------------------------------------------------------------------
    @Test
    public void CharSetUtils() {
        assertEquals(null, CharSetUtils.squeeze(null, (String) null));
        assertEquals(null, CharSetUtils.squeeze(null, ""));
        
        assertEquals("", CharSetUtils.squeeze("", (String) null));
        assertEquals("", CharSetUtils.squeeze("", ""));
        assertEquals("", CharSetUtils.squeeze("", "a-e"));
        
        assertEquals("hello", CharSetUtils.squeeze("hello", (String) null));
        assertEquals("hello", CharSetUtils.squeeze("hello", ""));
        assertEquals("hello", CharSetUtils.squeeze("hello", "a-e"));
        assertEquals("helo", CharSetUtils.squeeze("hello", "l-p"));
        assertEquals("heloo", CharSetUtils.squeeze("helloo", "l"));
        assertEquals("hello", CharSetUtils.squeeze("helloo", "^l"));
    }
    
    @Test
    public void CharSetUtils() {
        assertEquals(null, CharSetUtils.squeeze(null, (String[]) null));
        assertEquals(null, CharSetUtils.squeeze(null, new String[0]));
        assertEquals(null, CharSetUtils.squeeze(null, new String[] {null}));
        assertEquals(null, CharSetUtils.squeeze(null, new String[] {"el"}));
        
        assertEquals("", CharSetUtils.squeeze("", (String[]) null));
        assertEquals("", CharSetUtils.squeeze("", new String[0]));
        assertEquals("", CharSetUtils.squeeze("", new String[] {null}));
        assertEquals("", CharSetUtils.squeeze("", new String[] {"a-e"}));
        
        assertEquals("hello", CharSetUtils.squeeze("hello", (String[]) null));
        assertEquals("hello", CharSetUtils.squeeze("hello", new String[0]));
        assertEquals("hello", CharSetUtils.squeeze("hello", new String[] {null}));
        assertEquals("hello", CharSetUtils.squeeze("hello", new String[] {"a-e"}));
        
        assertEquals("helo", CharSetUtils.squeeze("hello", new String[] { "el" }));
        assertEquals("hello", CharSetUtils.squeeze("hello", new String[] { "e" }));
        assertEquals("fofof", CharSetUtils.squeeze("fooffooff", new String[] { "of" }));
        assertEquals("fof", CharSetUtils.squeeze("fooooff", new String[] { "fo" }));
    }

    //-----------------------------------------------------------------------
    @Test
    public void CharSetUtils() {
        assertFalse(CharSetUtils.containsAny(null, (String) null));
        assertFalse(CharSetUtils.containsAny(null, ""));
        
        assertFalse(CharSetUtils.containsAny("", (String) null));
        assertFalse(CharSetUtils.containsAny("", ""));
        assertFalse(CharSetUtils.containsAny("", "a-e"));
        
        assertFalse(CharSetUtils.containsAny("hello", (String) null));
        assertFalse(CharSetUtils.containsAny("hello", ""));
        assertTrue(CharSetUtils.containsAny("hello", "a-e"));
        assertTrue(CharSetUtils.containsAny("hello", "l-p"));
    }
    
    @Test
    public void CharSetUtils() {
        assertFalse(CharSetUtils.containsAny(null, (String[]) null));
        assertFalse(CharSetUtils.containsAny(null, new String[0]));
        assertFalse(CharSetUtils.containsAny(null, new String[] {null}));
        assertFalse(CharSetUtils.containsAny(null, new String[] {"a-e"}));
        
        assertFalse(CharSetUtils.containsAny("", (String[]) null));
        assertFalse(CharSetUtils.containsAny("", new String[0]));
        assertFalse(CharSetUtils.containsAny("", new String[] {null}));
        assertFalse(CharSetUtils.containsAny("", new String[] {"a-e"}));
        
        assertFalse(CharSetUtils.containsAny("hello", (String[]) null));
        assertFalse(CharSetUtils.containsAny("hello", new String[0]));
        assertFalse(CharSetUtils.containsAny("hello", new String[] {null}));
        assertTrue(CharSetUtils.containsAny("hello", new String[] {"a-e"}));
        
        assertTrue(CharSetUtils.containsAny("hello", new String[] { "el" }));
        assertFalse(CharSetUtils.containsAny("hello", new String[] { "x" }));
        assertTrue(CharSetUtils.containsAny("hello", new String[] { "e-i" }));
        assertTrue(CharSetUtils.containsAny("hello", new String[] { "a-z" }));
        assertFalse(CharSetUtils.containsAny("hello", new String[] { "" }));
    }

    //-----------------------------------------------------------------------
    @Test
    public void CharSetUtils() {
        assertEquals(0, CharSetUtils.count(null, (String) null));
        assertEquals(0, CharSetUtils.count(null, ""));
        
        assertEquals(0, CharSetUtils.count("", (String) null));
        assertEquals(0, CharSetUtils.count("", ""));
        assertEquals(0, CharSetUtils.count("", "a-e"));
        
        assertEquals(0, CharSetUtils.count("hello", (String) null));
        assertEquals(0, CharSetUtils.count("hello", ""));
        assertEquals(1, CharSetUtils.count("hello", "a-e"));
        assertEquals(3, CharSetUtils.count("hello", "l-p"));
    }
    
    @Test
    public void CharSetUtils() {
        assertEquals(0, CharSetUtils.count(null, (String[]) null));
        assertEquals(0, CharSetUtils.count(null, new String[0]));
        assertEquals(0, CharSetUtils.count(null, new String[] {null}));
        assertEquals(0, CharSetUtils.count(null, new String[] {"a-e"}));
        
        assertEquals(0, CharSetUtils.count("", (String[]) null));
        assertEquals(0, CharSetUtils.count("", new String[0]));
        assertEquals(0, CharSetUtils.count("", new String[] {null}));
        assertEquals(0, CharSetUtils.count("", new String[] {"a-e"}));
        
        assertEquals(0, CharSetUtils.count("hello", (String[]) null));
        assertEquals(0, CharSetUtils.count("hello", new String[0]));
        assertEquals(0, CharSetUtils.count("hello", new String[] {null}));
        assertEquals(1, CharSetUtils.count("hello", new String[] {"a-e"}));
        
        assertEquals(3, CharSetUtils.count("hello", new String[] { "el" }));
        assertEquals(0, CharSetUtils.count("hello", new String[] { "x" }));
        assertEquals(2, CharSetUtils.count("hello", new String[] { "e-i" }));
        assertEquals(5, CharSetUtils.count("hello", new String[] { "a-z" }));
        assertEquals(0, CharSetUtils.count("hello", new String[] { "" }));
    }


    
}
