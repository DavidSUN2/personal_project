
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
package org.apache.commons.lang3.text;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;

/**
 * Unit tests for WordUtils class.
 * 
 * @version $Id$
 */
public class WordUtilsTest {

    //-----------------------------------------------------------------------
    @Test
    public void WordUtils() {
        assertNotNull(new WordUtils());
        final Constructor<?>[] cons = WordUtils.class.getDeclaredConstructors();
        assertEquals(1, cons.length);
        assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        assertTrue(Modifier.isPublic(WordUtils.class.getModifiers()));
        assertFalse(Modifier.isFinal(WordUtils.class.getModifiers()));
    }
    
    //-----------------------------------------------------------------------
    @Test
    public void WordUtils() {
        assertEquals(null, WordUtils.wrap(null, 20));
        assertEquals(null, WordUtils.wrap(null, -1));
        
        assertEquals("", WordUtils.wrap("", 20));
        assertEquals("", WordUtils.wrap("", -1));
        
        // normal
        final String systemNewLine = System.getProperty("line.separator");
        String input = "Here is one line of text that is going to be wrapped after 20 columns.";
        String expected = "Here is one line of" + systemNewLine + "text that is going" 
            + systemNewLine + "to be wrapped after" + systemNewLine + "20 columns.";
        assertEquals(expected, WordUtils.wrap(input, 20));
        
        // long word at end
        input = "Click here to jump to the jakarta website - http://jakarta.apache.org";
        expected = "Click here to jump" + systemNewLine + "to the jakarta" + systemNewLine 
            + "website -" + systemNewLine + "http://jakarta.apache.org";
        assertEquals(expected, WordUtils.wrap(input, 20));
        
        // long word in middle
        input = "Click here, http://jakarta.apache.org, to jump to the jakarta website";
        expected = "Click here," + systemNewLine + "http://jakarta.apache.org," + systemNewLine 
            + "to jump to the" + systemNewLine + "jakarta website";
        assertEquals(expected, WordUtils.wrap(input, 20));
    }
    
    @Test
    public void WordUtils() {
        assertEquals(null, WordUtils.wrap(null, 20, "\n", false));
        assertEquals(null, WordUtils.wrap(null, 20, "\n", true));
        assertEquals(null, WordUtils.wrap(null, 20, null, true));
        assertEquals(null, WordUtils.wrap(null, 20, null, false));
        assertEquals(null, WordUtils.wrap(null, -1, null, true));
        assertEquals(null, WordUtils.wrap(null, -1, null, false));
        
        assertEquals("", WordUtils.wrap("", 20, "\n", false));
        assertEquals("", WordUtils.wrap("", 20, "\n", true));
        assertEquals("", WordUtils.wrap("", 20, null, false));
        assertEquals("", WordUtils.wrap("", 20, null, true));
        assertEquals("", WordUtils.wrap("", -1, null, false));
        assertEquals("", WordUtils.wrap("", -1, null, true));
        
        // normal
        String input = "Here is one line of text that is going to be wrapped after 20 columns.";
        String expected = "Here is one line of\ntext that is going\nto be wrapped after\n20 columns.";
        assertEquals(expected, WordUtils.wrap(input, 20, "\n", false));
        assertEquals(expected, WordUtils.wrap(input, 20, "\n", true));

        // unusual newline char
        input = "Here is one line of text that is going to be wrapped after 20 columns.";
        expected = "Here is one line of<br />text that is going<br />to be wrapped after<br />20 columns.";
        assertEquals(expected, WordUtils.wrap(input, 20, "<br />", false));
        assertEquals(expected, WordUtils.wrap(input, 20, "<br />", true));

        // short line length
        input = "Here is one line";
        expected = "Here\nis one\nline";
        assertEquals(expected, WordUtils.wrap(input, 6, "\n", false));
        expected = "Here\nis\none\nline";
        assertEquals(expected, WordUtils.wrap(input, 2, "\n", false));
        assertEquals(expected, WordUtils.wrap(input, -1, "\n", false));

        // system newline char
        final String systemNewLine = System.getProperty("line.separator");
        input = "Here is one line of text that is going to be wrapped after 20 columns.";
        expected = "Here is one line of" + systemNewLine + "text that is going" + systemNewLine 
            + "to be wrapped after" + systemNewLine + "20 columns.";
        assertEquals(expected, WordUtils.wrap(input, 20, null, false));
        assertEquals(expected, WordUtils.wrap(input, 20, null, true));

        // with extra spaces
        input = " Here:  is  one  line  of  text  that  is  going  to  be  wrapped  after  20  columns.";
        expected = "Here:  is  one  line\nof  text  that  is \ngoing  to  be \nwrapped  after  20 \ncolumns.";
        assertEquals(expected, WordUtils.wrap(input, 20, "\n", false));
        assertEquals(expected, WordUtils.wrap(input, 20, "\n", true));
        
        // with tab
        input = "Here is\tone line of text that is going to be wrapped after 20 columns.";
        expected = "Here is\tone line of\ntext that is going\nto be wrapped after\n20 columns.";
        assertEquals(expected, WordUtils.wrap(input, 20, "\n", false));
        assertEquals(expected, WordUtils.wrap(input, 20, "\n", true));
        
        // with tab at wrapColumn
        input = "Here is one line of\ttext that is going to be wrapped after 20 columns.";
        expected = "Here is one line\nof\ttext that is\ngoing to be wrapped\nafter 20 columns.";
        assertEquals(expected, WordUtils.wrap(input, 20, "\n", false));
        assertEquals(expected, WordUtils.wrap(input, 20, "\n", true));
        
        // difference because of long word
        input = "Click here to jump to the jakarta website - http://jakarta.apache.org";
        expected = "Click here to jump\nto the jakarta\nwebsite -\nhttp://jakarta.apache.org";
        assertEquals(expected, WordUtils.wrap(input, 20, "\n", false));
        expected = "Click here to jump\nto the jakarta\nwebsite -\nhttp://jakarta.apach\ne.org";
        assertEquals(expected, WordUtils.wrap(input, 20, "\n", true));
        
        // difference because of long word in middle
        input = "Click here, http://jakarta.apache.org, to jump to the jakarta website";
        expected = "Click here,\nhttp://jakarta.apache.org,\nto jump to the\njakarta website";
        assertEquals(expected, WordUtils.wrap(input, 20, "\n", false));
        expected = "Click here,\nhttp://jakarta.apach\ne.org, to jump to\nthe jakarta website";
        assertEquals(expected, WordUtils.wrap(input, 20, "\n", true));
//        System.err.println(expected);
//        System.err.println(WordUtils.wrap(input, 20, "\n", false));
    }
    
    //-----------------------------------------------------------------------
    @Test
    public void WordUtils() {
        assertEquals(null, WordUtils.capitalize(null));
        assertEquals("", WordUtils.capitalize(""));
        assertEquals("  ", WordUtils.capitalize("  "));
        
        assertEquals("I", WordUtils.capitalize("I") );
        assertEquals("I", WordUtils.capitalize("i") );
        assertEquals("I Am Here 123", WordUtils.capitalize("i am here 123") );
        assertEquals("I Am Here 123", WordUtils.capitalize("I Am Here 123") );
        assertEquals("I Am HERE 123", WordUtils.capitalize("i am HERE 123") );
        assertEquals("I AM HERE 123", WordUtils.capitalize("I AM HERE 123") );
    }
    
    @Test
    public void WordUtils() {
        assertEquals(null, WordUtils.capitalize(null, null));
        assertEquals("", WordUtils.capitalize("", new char[0]));
        assertEquals("  ", WordUtils.capitalize("  ", new char[0]));
        
        char[] chars = new char[] { '-', '+', ' ', '@' };
        assertEquals("I", WordUtils.capitalize("I", chars) );
        assertEquals("I", WordUtils.capitalize("i", chars) );
        assertEquals("I-Am Here+123", WordUtils.capitalize("i-am here+123", chars) );
        assertEquals("I Am+Here-123", WordUtils.capitalize("I Am+Here-123", chars) );
        assertEquals("I+Am-HERE 123", WordUtils.capitalize("i+am-HERE 123", chars) );
        assertEquals("I-AM HERE+123", WordUtils.capitalize("I-AM HERE+123", chars) );
        chars = new char[] {'.'};
        assertEquals("I aM.Fine", WordUtils.capitalize("i aM.fine", chars) );
        assertEquals("I Am.fine", WordUtils.capitalize("i am.fine", null) );
    }


}
