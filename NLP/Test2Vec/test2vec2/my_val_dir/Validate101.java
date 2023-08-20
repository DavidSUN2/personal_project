
/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.commons.lang3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.Validate}.
 *
 * @version $Id$
 */
public class ValidateTest  {
    
    //-----------------------------------------------------------------------
    @Test
    public void Validate() {
        Validate.isTrue(true);
        try {
            Validate.isTrue(false);
            fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            assertEquals("The validated expression is false", ex.getMessage());
        }
    }

    //-----------------------------------------------------------------------
    @Test
    public void Validate() {
        Validate.isTrue(true, "MSG");
        try {
            Validate.isTrue(false, "MSG");
            fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            assertEquals("MSG", ex.getMessage());
        }
    }

    //-----------------------------------------------------------------------
    @Test
    public void Validate() {
        Validate.isTrue(true, "MSG", 6);
        try {
            Validate.isTrue(false, "MSG", 6);
            fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            assertEquals("MSG", ex.getMessage());
        }
    }

    //-----------------------------------------------------------------------
    @Test
    public void Validate() {
        Validate.isTrue(true, "MSG", 7);
        try {
            Validate.isTrue(false, "MSG", 7);
            fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            assertEquals("MSG", ex.getMessage());
        }
    }

    //-----------------------------------------------------------------------
    @Test
    public void Validate() {
        Validate.isTrue(true, "MSG", 7.4d);
        try {
            Validate.isTrue(false, "MSG", 7.4d);
            fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            assertEquals("MSG", ex.getMessage());
        }
    }

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    @Test
    public void Validate() {
        Validate.notNull(new Object());
        try {
            Validate.notNull(null);
            fail("Expecting NullPointerException");
        } catch (final NullPointerException ex) {
            assertEquals("The validated object is null", ex.getMessage());
        }
        
        final String str = "Hi";
        final String testStr = Validate.notNull(str);
        assertSame(str, testStr);
    }

    //-----------------------------------------------------------------------
    @Test
    public void Validate() {
        Validate.notNull(new Object(), "MSG");
        try {
            Validate.notNull(null, "MSG");
            fail("Expecting NullPointerException");
        } catch (final NullPointerException ex) {
            assertEquals("MSG", ex.getMessage());
        }
        
        final String str = "Hi";
        final String testStr = Validate.notNull(str, "Message");
        assertSame(str, testStr);
    }

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    @Test
    public void Validate() {
        Validate.notEmpty(new Object[] {null});
        try {
            Validate.notEmpty((Object[]) null);
            fail("Expecting NullPointerException");
        } catch (final NullPointerException ex) {
            assertEquals("The validated array is empty", ex.getMessage());
        }
        try {
            Validate.notEmpty(new Object[0]);
            fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            assertEquals("The validated array is empty", ex.getMessage());
        }
        
        final String[] array = new String[] {"hi"};
        final String[] test = Validate.notEmpty(array);
        assertSame(array, test);
    }

    //-----------------------------------------------------------------------
    @Test
    public void Validate() {
        Validate.notEmpty(new Object[] {null}, "MSG");
        try {
            Validate.notEmpty((Object[]) null, "MSG");
            fail("Expecting NullPointerException");
        } catch (final NullPointerException ex) {
            assertEquals("MSG", ex.getMessage());
        }
        try {
            Validate.notEmpty(new Object[0], "MSG");
            fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            assertEquals("MSG", ex.getMessage());
        }
        
        final String[] array = new String[] {"hi"};
        final String[] test = Validate.notEmpty(array, "Message");
        assertSame(array, test);
    }

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    @Test
    public void Validate() {
        final Collection<Integer> coll = new ArrayList<Integer>();
        try {
            Validate.notEmpty((Collection<?>) null);
            fail("Expecting NullPointerException");
        } catch (final NullPointerException ex) {
            assertEquals("The validated collection is empty", ex.getMessage());
        }
        try {
            Validate.notEmpty(coll);
            fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            assertEquals("The validated collection is empty", ex.getMessage());
        }
        coll.add(Integer.valueOf(8));
        Validate.notEmpty(coll);
        
        final Collection<Integer> test = Validate.notEmpty(coll);
        assertSame(coll, test);
    }

    //-----------------------------------------------------------------------
    @Test
    public void Validate() {
        final Collection<Integer> coll = new ArrayList<Integer>();
        try {
            Validate.notEmpty((Collection<?>) null, "MSG");
            fail("Expecting NullPointerException");
        } catch (final NullPointerException ex) {
            assertEquals("MSG", ex.getMessage());
        }
        try {
            Validate.notEmpty(coll, "MSG");
            fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            assertEquals("MSG", ex.getMessage());
        }
        coll.add(Integer.valueOf(8));
        Validate.notEmpty(coll, "MSG");
        
        final Collection<Integer> test = Validate.notEmpty(coll, "Message");
        assertSame(coll, test);
    }

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    @Test
    public void Validate() {
        final Map<String, Integer> map = new HashMap<String, Integer>();
        try {
            Validate.notEmpty((Map<?, ?>) null);
            fail("Expecting NullPointerException");
        } catch (final NullPointerException ex) {
            assertEquals("The validated map is empty", ex.getMessage());
        }
        try {
            Validate.notEmpty(map);
            fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            assertEquals("The validated map is empty", ex.getMessage());
        }
        map.put("ll", Integer.valueOf(8));
        Validate.notEmpty(map);
        
        final Map<String, Integer> test = Validate.notEmpty(map);
        assertSame(map, test);
    }

    //-----------------------------------------------------------------------
    @Test
    public void Validate() {
        final Map<String, Integer> map = new HashMap<String, Integer>();
        try {
            Validate.notEmpty((Map<?, ?>) null, "MSG");
            fail("Expecting NullPointerException");
        } catch (final NullPointerException ex) {
            assertEquals("MSG", ex.getMessage());
        }
        try {
            Validate.notEmpty(map, "MSG");
            fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            assertEquals("MSG", ex.getMessage());
        }
        map.put("ll", Integer.valueOf(8));
        Validate.notEmpty(map, "MSG");
        
        final Map<String, Integer> test = Validate.notEmpty(map, "Message");
        assertSame(map, test);
    }

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    @Test
    public void Validate() {
        Validate.notEmpty("hjl");
        try {
            Validate.notEmpty((String) null);
            fail("Expecting NullPointerException");
        } catch (final NullPointerException ex) {
            assertEquals("The validated character sequence is empty", ex.getMessage());
        }
        try {
            Validate.notEmpty("");
            fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            assertEquals("The validated character sequence is empty", ex.getMessage());
        }
        
        final String str = "Hi";
        final String testStr = Validate.notEmpty(str);
        assertSame(str, testStr);
    }

    //-----------------------------------------------------------------------
    @Test
    public void Validate() {
        Validate.notEmpty("a", "MSG");
        try {
            Validate.notEmpty((String) null, "MSG");
            fail("Expecting NullPointerException");
        } catch (final NullPointerException ex) {
            assertEquals("MSG", ex.getMessage());
        }
        try {
            Validate.notEmpty("", "MSG");
            fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            assertEquals("MSG", ex.getMessage());
        }
        
        final String str = "Hi";
        final String testStr = Validate.notEmpty(str, "Message");
        assertSame(str, testStr);
    }

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    @Test
    public void Validate() {
        //given
        final String string = null;

        try {
            //when
            Validate.notBlank(string);
            fail("Expecting NullPointerException");
        } catch (final NullPointerException e) {
            //then
            assertEquals("The validated character sequence is blank", e.getMessage());
        }
    }

    //-----------------------------------------------------------------------
    @Test
    public void Validate() {
        //given
        final String string = null;

        try {
            //when
            Validate.notBlank(string, "Message");
            fail("Expecting NullPointerException");
        } catch (final NullPointerException e) {
            //then
            assertEquals("Message", e.getMessage());
        }
    }

    //-----------------------------------------------------------------------
    @Test
    public void Validate() {
        //given
        final String string = "";

        try {
            //when
            Validate.notBlank(string);
            fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            //then
            assertEquals("The validated character sequence is blank", e.getMessage());
        }
    }

    //-----------------------------------------------------------------------
    @Test
    public void Validate() {
        //given
        final String string = "   ";

        try {
            //when
            Validate.notBlank(string);
            fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            //then
            assertEquals("The validated character sequence is blank", e.getMessage());
        }
    }

    //-----------------------------------------------------------------------
    @Test
    public void Validate() {
        //given
        final String string = " \n \t \r \n ";

        try {
            //when
            Validate.notBlank(string);
            fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            //then
            assertEquals("The validated character sequence is blank", e.getMessage());
        }
    }

    //-----------------------------------------------------------------------
    @Test
    public void Validate() {
        //given
        final String string = " \n \t \r \n ";

        try {
            //when
            Validate.notBlank(string, "Message");
            fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            //then
            assertEquals("Message", e.getMessage());
        }
    }

    //-----------------------------------------------------------------------
    @Test
    public void Validate() {
        //given
        final String string = "   ";

        try {
            //when
            Validate.notBlank(string, "Message");
            fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            //then
            assertEquals("Message", e.getMessage());
        }
    }



}
