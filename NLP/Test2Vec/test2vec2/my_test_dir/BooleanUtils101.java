
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
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.BooleanUtils}.
 *
 * @version $Id$
 */
public class BooleanUtilsTest {

       @Test(expected = IllegalArgumentException.class)
    public void BooleanUtils() {
        BooleanUtils.and((boolean[]) null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void BooleanUtils() {
        BooleanUtils.and(new boolean[] {});
    }
    
    @Test
    public void BooleanUtils() {
        assertTrue(
            "False result for (true, true)",
            BooleanUtils.and(new boolean[] { true, true }));
        
        assertTrue(
            "True result for (false, false)",
            ! BooleanUtils.and(new boolean[] { false, false }));
        
        assertTrue(
            "True result for (true, false)",
            ! BooleanUtils.and(new boolean[] { true, false }));
        
        assertTrue(
            "True result for (false, true)",
            ! BooleanUtils.and(new boolean[] { false, true }));
    }
    
    @Test
    public void BooleanUtils() {
        assertTrue(
            "True result for (false, false, true)",
            ! BooleanUtils.and(new boolean[] { false, false, true }));
        
        assertTrue(
            "True result for (false, true, false)",
            ! BooleanUtils.and(new boolean[] { false, true, false }));
        
        assertTrue(
            "True result for (true, false, false)",
            ! BooleanUtils.and(new boolean[] { true, false, false }));
        
        assertTrue(
            "False result for (true, true, true)",
            BooleanUtils.and(new boolean[] { true, true, true }));
        
        assertTrue(
            "True result for (false, false)",
            ! BooleanUtils.and(new boolean[] { false, false, false }));
        
        assertTrue(
            "True result for (true, true, false)",
            ! BooleanUtils.and(new boolean[] { true, true, false }));
        
        assertTrue(
            "True result for (true, false, true)",
            ! BooleanUtils.and(new boolean[] { true, false, true }));
        
        assertTrue(
            "True result for (false, true, true)",
            ! BooleanUtils.and(new boolean[] { false, true, true }));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void BooleanUtils() {
        BooleanUtils.and((Boolean[]) null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void BooleanUtils() {
        BooleanUtils.and(new Boolean[] {});
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void BooleanUtils() {
        BooleanUtils.and(new Boolean[] {null});
    }
    
    @Test
    public void BooleanUtils() {
        assertTrue(
            "False result for (true, true)",
            BooleanUtils
            .and(new Boolean[] { Boolean.TRUE, Boolean.TRUE })
            .booleanValue());
        
        assertTrue(
            "True result for (false, false)",
            ! BooleanUtils
            .and(new Boolean[] { Boolean.FALSE, Boolean.FALSE })
            .booleanValue());
        
        assertTrue(
            "True result for (true, false)",
            ! BooleanUtils
            .and(new Boolean[] { Boolean.TRUE, Boolean.FALSE })
            .booleanValue());
        
        assertTrue(
            "True result for (false, true)",
            ! BooleanUtils
            .and(new Boolean[] { Boolean.FALSE, Boolean.TRUE })
            .booleanValue());
    }
    
    @Test
    public void BooleanUtils() {
        assertTrue(
            "True result for (false, false, true)",
            ! BooleanUtils
            .and(
                new Boolean[] {
                    Boolean.FALSE,
                    Boolean.FALSE,
                    Boolean.TRUE })
                    .booleanValue());
        
        assertTrue(
            "True result for (false, true, false)",
            ! BooleanUtils
            .and(
                new Boolean[] {
                    Boolean.FALSE,
                    Boolean.TRUE,
                    Boolean.FALSE })
                    .booleanValue());
        
        assertTrue(
            "True result for (true, false, false)",
            ! BooleanUtils
            .and(
                new Boolean[] {
                    Boolean.TRUE,
                    Boolean.FALSE,
                    Boolean.FALSE })
                    .booleanValue());
        
        assertTrue(
            "False result for (true, true, true)",
            BooleanUtils
            .and(new Boolean[] { Boolean.TRUE, Boolean.TRUE, Boolean.TRUE })
            .booleanValue());
        
        assertTrue(
            "True result for (false, false)",
            ! BooleanUtils.and(
                new Boolean[] {
                    Boolean.FALSE,
                    Boolean.FALSE,
                    Boolean.FALSE })
                    .booleanValue());
        
        assertTrue(
            "True result for (true, true, false)",
            ! BooleanUtils.and(
                new Boolean[] {
                    Boolean.TRUE,
                    Boolean.TRUE,
                    Boolean.FALSE })
                    .booleanValue());
        
        assertTrue(
            "True result for (true, false, true)",
            ! BooleanUtils.and(
                new Boolean[] {
                    Boolean.TRUE,
                    Boolean.FALSE,
                    Boolean.TRUE })
                    .booleanValue());
        
        assertTrue(
            "True result for (false, true, true)",
            ! BooleanUtils.and(
                new Boolean[] {
                    Boolean.FALSE,
                    Boolean.TRUE,
                    Boolean.TRUE })
                    .booleanValue());
    }
    
    //  testOr
    //  -----------------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void BooleanUtils() {
        BooleanUtils.or((boolean[]) null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void BooleanUtils() {
        BooleanUtils.or(new boolean[] {});
    }
    
    @Test
    public void BooleanUtils() {
        assertTrue(
            "False result for (true, true)",
            BooleanUtils.or(new boolean[] { true, true }));
        
        assertTrue(
            "True result for (false, false)",
            ! BooleanUtils.or(new boolean[] { false, false }));
        
        assertTrue(
            "False result for (true, false)",
            BooleanUtils.or(new boolean[] { true, false }));
        
        assertTrue(
            "False result for (false, true)",
            BooleanUtils.or(new boolean[] { false, true }));
    }
    
    @Test
    public void BooleanUtils() {
        assertTrue(
            "False result for (false, false, true)",
            BooleanUtils.or(new boolean[] { false, false, true }));
        
        assertTrue(
            "False result for (false, true, false)",
            BooleanUtils.or(new boolean[] { false, true, false }));
        
        assertTrue(
            "False result for (true, false, false)",
            BooleanUtils.or(new boolean[] { true, false, false }));
        
        assertTrue(
            "False result for (true, true, true)",
            BooleanUtils.or(new boolean[] { true, true, true }));
        
        assertTrue(
            "True result for (false, false)",
            ! BooleanUtils.or(new boolean[] { false, false, false }));
        
        assertTrue(
            "False result for (true, true, false)",
            BooleanUtils.or(new boolean[] { true, true, false }));
        
        assertTrue(
            "False result for (true, false, true)",
            BooleanUtils.or(new boolean[] { true, false, true }));
        
        assertTrue(
            "False result for (false, true, true)",
            BooleanUtils.or(new boolean[] { false, true, true }));
    
    }
    @Test(expected = IllegalArgumentException.class)
    public void BooleanUtils() {
        BooleanUtils.or((Boolean[]) null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void BooleanUtils() {
        BooleanUtils.or(new Boolean[] {});
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void BooleanUtils() {
        BooleanUtils.or(new Boolean[] {null});
    }
    
    @Test
    public void BooleanUtils() {
        assertTrue(
            "False result for (true, true)",
            BooleanUtils
            .or(new Boolean[] { Boolean.TRUE, Boolean.TRUE })
            .booleanValue());
        
        assertTrue(
            "True result for (false, false)",
            ! BooleanUtils
            .or(new Boolean[] { Boolean.FALSE, Boolean.FALSE })
            .booleanValue());
        
        assertTrue(
            "False result for (true, false)",
            BooleanUtils
            .or(new Boolean[] { Boolean.TRUE, Boolean.FALSE })
            .booleanValue());
        
        assertTrue(
            "False result for (false, true)",
            BooleanUtils
            .or(new Boolean[] { Boolean.FALSE, Boolean.TRUE })
            .booleanValue());
    }
    
    @Test
    public void BooleanUtils() {
        assertTrue(
            "False result for (false, false, true)",
            BooleanUtils
            .or(
                new Boolean[] {
                    Boolean.FALSE,
                    Boolean.FALSE,
                    Boolean.TRUE })
                    .booleanValue());
        
        assertTrue(
            "False result for (false, true, false)",
            BooleanUtils
            .or(
                new Boolean[] {
                    Boolean.FALSE,
                    Boolean.TRUE,
                    Boolean.FALSE })
                    .booleanValue());
        
        assertTrue(
            "False result for (true, false, false)",
            BooleanUtils
            .or(
                new Boolean[] {
                    Boolean.TRUE,
                    Boolean.FALSE,
                    Boolean.FALSE })
                    .booleanValue());
        
        assertTrue(
            "False result for (true, true, true)",
            BooleanUtils
            .or(new Boolean[] { Boolean.TRUE, Boolean.TRUE, Boolean.TRUE })
            .booleanValue());
        
        assertTrue(
            "True result for (false, false)",
            ! BooleanUtils.or(
                new Boolean[] {
                    Boolean.FALSE,
                    Boolean.FALSE,
                    Boolean.FALSE })
                    .booleanValue());
        
        assertTrue(
            "False result for (true, true, false)",
            BooleanUtils.or(
                new Boolean[] {
                    Boolean.TRUE,
                    Boolean.TRUE,
                    Boolean.FALSE })
                    .booleanValue());
        
        assertTrue(
            "False result for (true, false, true)",
            BooleanUtils.or(
                new Boolean[] {
                    Boolean.TRUE,
                    Boolean.FALSE,
                    Boolean.TRUE })
                    .booleanValue());
        
        assertTrue(
            "False result for (false, true, true)",
            BooleanUtils.or(
                new Boolean[] {
                    Boolean.FALSE,
                    Boolean.TRUE,
                    Boolean.TRUE })
                    .booleanValue());
    }
    
}
