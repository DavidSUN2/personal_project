
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
        //given
        final String string = "";

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
        final String string = "abc";

        //when
        Validate.notBlank(string);

        //then should not throw
    }

    //-----------------------------------------------------------------------
    @Test
    public void Validate() {
        //given
        final String string = "  abc   ";

        //when
        Validate.notBlank(string);

        //then should not throw
    }

    //-----------------------------------------------------------------------
    @Test
    public void Validate() {
        //given
        final String string = " \n \t abc \r \n ";

        //when
        Validate.notBlank(string);

        //then should not throw
    }

    //-----------------------------------------------------------------------
    @Test
    public void Validate() {
        //given
        final String string = "abc";

        //when
        Validate.notBlank(string, "Message");

        //then should not throw
    }

    //-----------------------------------------------------------------------
    @Test
    public void Validate() {
        //given
        final String string = "  abc   ";

        //when
        Validate.notBlank(string, "Message");

        //then should not throw
    }

    //-----------------------------------------------------------------------
    @Test
    public void Validate() {
        //given
        final String string = " \n \t abc \r \n ";

        //when
        Validate.notBlank(string, "Message");

        //then should not throw
    }

    //-----------------------------------------------------------------------
    @Test
    public void Validate() {
        final String str = "Hi";
        final String test = Validate.notBlank(str);
        assertSame(str, test);
    }

    @Test
    public void Validate() {
        final String str = "Hi";
        final String test = Validate.notBlank(str, "Message");
        assertSame(str, test);
    }

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    @Test
    public void Validate() {
        String[] array = new String[] {"a", "b"};
        Validate.noNullElements(array);
        try {
            Validate.noNullElements((Object[]) null);
            fail("Expecting NullPointerException");
        } catch (final NullPointerException ex) {
            assertEquals("The validated object is null", ex.getMessage());
        }
        array[1] = null;
        try {
            Validate.noNullElements(array);
            fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            assertEquals("The validated array contains null element at index: 1", ex.getMessage());
        }
        
        array = new String[] {"a", "b"};
        final String[] test = Validate.noNullElements(array);
        assertSame(array, test);
    }

    //-----------------------------------------------------------------------
    @Test
    public void Validate() {
        String[] array = new String[] {"a", "b"};
        Validate.noNullElements(array, "MSG");
        try {
            Validate.noNullElements((Object[]) null, "MSG");
            fail("Expecting NullPointerException");
        } catch (final NullPointerException ex) {
            assertEquals("The validated object is null", ex.getMessage());
        }
        array[1] = null;
        try {
            Validate.noNullElements(array, "MSG");
            fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            assertEquals("MSG", ex.getMessage());
        }
        
        array = new String[] {"a", "b"};
        final String[] test = Validate.noNullElements(array, "Message");
        assertSame(array, test);
    }

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    @Test
    public void Validate() {
        final List<String> coll = new ArrayList<String>();
        coll.add("a");
        coll.add("b");
        Validate.noNullElements(coll);
        try {
            Validate.noNullElements((Collection<?>) null);
            fail("Expecting NullPointerException");
        } catch (final NullPointerException ex) {
            assertEquals("The validated object is null", ex.getMessage());
        }
        coll.set(1, null);
        try {
            Validate.noNullElements(coll);
            fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            assertEquals("The validated collection contains null element at index: 1", ex.getMessage());
        }
        
        coll.set(1, "b");
        final List<String> test = Validate.noNullElements(coll);
        assertSame(coll, test);
    }

    //-----------------------------------------------------------------------
    @Test
    public void Validate() {
        final List<String> coll = new ArrayList<String>();
        coll.add("a");
        coll.add("b");
        Validate.noNullElements(coll, "MSG");
        try {
            Validate.noNullElements((Collection<?>) null, "MSG");
            fail("Expecting NullPointerException");
        } catch (final NullPointerException ex) {
            assertEquals("The validated object is null", ex.getMessage());
        }
        coll.set(1, null);
        try {
            Validate.noNullElements(coll, "MSG");
            fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            assertEquals("MSG", ex.getMessage());
        }
        
        coll.set(1, "b");
        final List<String> test = Validate.noNullElements(coll, "Message");
        assertSame(coll, test);
    }

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    @Test
    public void Validate() {
        assertNotNull(new Validate());
        final Constructor<?>[] cons = Validate.class.getDeclaredConstructors();
        assertEquals(1, cons.length);
        assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        assertTrue(Modifier.isPublic(Validate.class.getModifiers()));
        assertFalse(Modifier.isFinal(Validate.class.getModifiers()));
    }

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    @Test
    public void Validate() {
        final Object[] array = new Object[2];
        Validate.validIndex(array, 0, "Broken: ");
        Validate.validIndex(array, 1, "Broken: ");
        try {
            Validate.validIndex(array, -1, "Broken: ");
            fail("Expecting IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException ex) {
            assertEquals("Broken: ", ex.getMessage());
        }
        try {
            Validate.validIndex(array, 2, "Broken: ");
            fail("Expecting IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException ex) {
            assertEquals("Broken: ", ex.getMessage());
        }
        
        final String[] strArray = new String[] {"Hi"};
        final String[] test = Validate.noNullElements(strArray, "Message");
        assertSame(strArray, test);
    }

    @Test
    public void Validate() {
        final Object[] array = new Object[2];
        Validate.validIndex(array, 0);
        Validate.validIndex(array, 1);
        try {
            Validate.validIndex(array, -1);
            fail("Expecting IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException ex) {
            assertEquals("The validated array index is invalid: -1", ex.getMessage());
        }
        try {
            Validate.validIndex(array, 2);
            fail("Expecting IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException ex) {
            assertEquals("The validated array index is invalid: 2", ex.getMessage());
        }
        
        final String[] strArray = new String[] {"Hi"};
        final String[] test = Validate.noNullElements(strArray);
        assertSame(strArray, test);
    }

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    @Test
    public void Validate() {
        final Collection<String> coll = new ArrayList<String>();
        coll.add(null);
        coll.add(null);
        Validate.validIndex(coll, 0, "Broken: ");
        Validate.validIndex(coll, 1, "Broken: ");
        try {
            Validate.validIndex(coll, -1, "Broken: ");
            fail("Expecting IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException ex) {
            assertEquals("Broken: ", ex.getMessage());
        }
        try {
            Validate.validIndex(coll, 2, "Broken: ");
            fail("Expecting IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException ex) {
            assertEquals("Broken: ", ex.getMessage());
        }
        
        final List<String> strColl = Arrays.asList(new String[] {"Hi"});
        final List<String> test = Validate.validIndex(strColl, 0, "Message");
        assertSame(strColl, test);
    }

    @Test
    public void Validate() {
        final Collection<String> coll = new ArrayList<String>();
        coll.add(null);
        coll.add(null);
        Validate.validIndex(coll, 0);
        Validate.validIndex(coll, 1);
        try {
            Validate.validIndex(coll, -1);
            fail("Expecting IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException ex) {
            assertEquals("The validated collection index is invalid: -1", ex.getMessage());
        }
        try {
            Validate.validIndex(coll, 2);
            fail("Expecting IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException ex) {
            assertEquals("The validated collection index is invalid: 2", ex.getMessage());
        }
        
        final List<String> strColl = Arrays.asList(new String[] {"Hi"});
        final List<String> test = Validate.validIndex(strColl, 0);
        assertSame(strColl, test);
    }

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    @Test
    public void Validate() {
        final CharSequence str = "Hi";
        Validate.validIndex(str, 0, "Broken: ");
        Validate.validIndex(str, 1, "Broken: ");
        try {
            Validate.validIndex(str, -1, "Broken: ");
            fail("Expecting IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException ex) {
            assertEquals("Broken: ", ex.getMessage());
        }
        try {
            Validate.validIndex(str, 2, "Broken: ");
            fail("Expecting IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException ex) {
            assertEquals("Broken: ", ex.getMessage());
        }
        
        final String input = "Hi";
        final String test = Validate.validIndex(input, 0, "Message");
        assertSame(input, test);
    }

    @Test
    public void Validate() {
        final CharSequence str = "Hi";
        Validate.validIndex(str, 0);
        Validate.validIndex(str, 1);
        try {
            Validate.validIndex(str, -1);
            fail("Expecting IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException ex) {
            assertEquals("The validated character sequence index is invalid: -1", ex.getMessage());
        }
        try {
            Validate.validIndex(str, 2);
            fail("Expecting IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException ex) {
            assertEquals("The validated character sequence index is invalid: 2", ex.getMessage());
        }
        
        final String input = "Hi";
        final String test = Validate.validIndex(input, 0);
        assertSame(input, test);
    }
    
    @Test
    public void Validate()
    {
        final CharSequence str = "hi";
        Validate.matchesPattern(str, "[a-z]*");
        try
        {
            Validate.matchesPattern(str, "[0-9]*");
            fail("Expecting IllegalArgumentException");
        }
        catch (final IllegalArgumentException e)
        {
            assertEquals("The string hi does not match the pattern [0-9]*", e.getMessage());
        }
    }
    
    @Test
    public void Validate()
    {
        final CharSequence str = "hi";
        Validate.matchesPattern(str, "[a-z]*", "Does not match");
        try
        {
            Validate.matchesPattern(str, "[0-9]*", "Does not match");
            fail("Expecting IllegalArgumentException");
        }
        catch (final IllegalArgumentException e)
        {
            assertEquals("Does not match", e.getMessage());
        }
    }
    
    @Test
    public void Validate()
    {
        Validate.inclusiveBetween("a", "c", "b");
        Validate.inclusiveBetween(0, 2, 1);
        Validate.inclusiveBetween(0, 2, 2);
        try {
            Validate.inclusiveBetween(0, 5, 6);
            fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            assertEquals("The value 6 is not in the specified inclusive range of 0 to 5", e.getMessage());
        }
    }
    
    @Test
    public void Validate()
    {
        Validate.inclusiveBetween("a", "c", "b", "Error");
        Validate.inclusiveBetween(0, 2, 1, "Error");
        Validate.inclusiveBetween(0, 2, 2, "Error");
        try {
            Validate.inclusiveBetween(0, 5, 6, "Error");
            fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            assertEquals("Error", e.getMessage());
        }
    }
    
    @Test
    public void Validate()
    {
        Validate.exclusiveBetween("a", "c", "b");
        Validate.exclusiveBetween(0, 2, 1);
        try {
            Validate.exclusiveBetween(0, 5, 6);
            fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            assertEquals("The value 6 is not in the specified exclusive range of 0 to 5", e.getMessage());
        }
        try {
            Validate.exclusiveBetween(0, 5, 5);
            fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            assertEquals("The value 5 is not in the specified exclusive range of 0 to 5", e.getMessage());
        }
    }
    
    @Test
    public void Validate()
    {
        Validate.exclusiveBetween("a", "c", "b", "Error");
        Validate.exclusiveBetween(0, 2, 1, "Error");
        try {
            Validate.exclusiveBetween(0, 5, 6, "Error");
            fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            assertEquals("Error", e.getMessage());
        }
        try {
            Validate.exclusiveBetween(0, 5, 5, "Error");
            fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            assertEquals("Error", e.getMessage());
        }
    }

    @Test
    public void Validate() {
        Validate.isInstanceOf(String.class, "hi");
        Validate.isInstanceOf(Integer.class, 1);
    }
    
    @Test
    public void Validate() {
        try {
            Validate.isInstanceOf(List.class, "hi");
            fail("Expecting IllegalArgumentException");
        } catch(final IllegalArgumentException e) {
            assertEquals("Expected type: java.util.List, actual: java.lang.String", e.getMessage());
        }
    }
    
    @Test
    public void Validate() {
        Validate.isInstanceOf(String.class, "hi", "Error");
        Validate.isInstanceOf(Integer.class, 1, "Error");
        try {
            Validate.isInstanceOf(List.class, "hi", "Error");
            fail("Expecting IllegalArgumentException");
        } catch(final IllegalArgumentException e) {
            assertEquals("Error", e.getMessage());
        }
    }
    
    @Test
    public void Validate() {
        Validate.isAssignableFrom(CharSequence.class, String.class);
        Validate.isAssignableFrom(AbstractList.class, ArrayList.class);
    }
    
    @Test
    public void Validate() {
        try {
            Validate.isAssignableFrom(List.class, String.class);
            fail("Expecting IllegalArgumentException");
        } catch(final IllegalArgumentException e) {
            assertEquals("Cannot assign a java.lang.String to a java.util.List", e.getMessage());
        }
    }
    
    @Test
    public void Validate() {
        Validate.isAssignableFrom(CharSequence.class, String.class, "Error");
        Validate.isAssignableFrom(AbstractList.class, ArrayList.class, "Error");
        try {
            Validate.isAssignableFrom(List.class, String.class, "Error");
            fail("Expecting IllegalArgumentException");
        } catch(final IllegalArgumentException e) {
            assertEquals("Error", e.getMessage());
        }
    }
}
