
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

import org.junit.After;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.lang3.mutable.MutableObject;

/**
 * Test class for StrSubstitutor.
 *
 * @version $Id$
 */
public class StrSubstitutorTest {

    @Test
    public void StrSubstitutor() {
        values.put("animal", "$${${thing}}");
        values.put("thing", "animal");
        doTestReplace("The ${animal} jumps.", "The ${animal} jumps.", true);
    }

    /**
     * Tests a cyclic replace operation.
     * The cycle should be detected and cause an exception to be thrown.
     */
    @Test
    public void StrSubstitutor() {
        final Map<String, String> map = new HashMap<String, String>();
        map.put("animal", "${critter}");
        map.put("target", "${pet}");
        map.put("pet", "${petCharacteristic} dog");
        map.put("petCharacteristic", "lazy");
        map.put("critter", "${critterSpeed} ${critterColor} ${critterType}");
        map.put("critterSpeed", "quick");
        map.put("critterColor", "brown");
        map.put("critterType", "${animal}");
        final StrSubstitutor sub = new StrSubstitutor(map);
        try {
            sub.replace("The ${animal} jumps over the ${target}.");
            fail("Cyclic replacement was not detected!");
        } catch (final IllegalStateException ex) {
            // expected
        }
    }

    /**
     * Tests interpolation with weird boundary patterns.
     */
    @Test
    public void StrSubstitutor() {
        doTestNoReplace("");
        doTestNoReplace("${}");
        doTestNoReplace("${ }");
        doTestNoReplace("${\t}");
        doTestNoReplace("${\n}");
        doTestNoReplace("${\b}");
        doTestNoReplace("${");
        doTestNoReplace("$}");
        doTestNoReplace("}");
        doTestNoReplace("${}$");
        doTestNoReplace("${${");
        doTestNoReplace("${${}}");
        doTestNoReplace("${$${}}");
        doTestNoReplace("${$$${}}");
        doTestNoReplace("${$$${$}}");
        doTestNoReplace("${${}}");
        doTestNoReplace("${${ }}");
    }

    /**
     * Tests simple key replace.
     */
    @Test
    public void StrSubstitutor() {
        final StrSubstitutor sub = new StrSubstitutor();
        assertEquals("${animal} jumps", sub.replace("The ${animal} jumps over the ${target}.", 4, 15));
    }

    /**
     * Tests whether a variable can be replaced in a variable name.
     */
    @Test
    public void StrSubstitutor() {
        values.put("animal.1", "fox");
        values.put("animal.2", "mouse");
        values.put("species", "2");
        final StrSubstitutor sub = new StrSubstitutor(values);
        sub.setEnableSubstitutionInVariables(true);
        assertEquals(
                "Wrong result (1)",
                "The mouse jumps over the lazy dog.",
                sub.replace("The ${animal.${species}} jumps over the ${target}."));
        values.put("species", "1");
        assertEquals(
                "Wrong result (2)",
                "The fox jumps over the lazy dog.",
                sub.replace("The ${animal.${species}} jumps over the ${target}."));
    }

    /**
     * Tests whether substitution in variable names is disabled per default.
     */
    @Test
    public void StrSubstitutor() {
        values.put("animal.1", "fox");
        values.put("animal.2", "mouse");
        values.put("species", "2");
        final StrSubstitutor sub = new StrSubstitutor(values);
        assertEquals(
                "Wrong result",
                "The ${animal.${species}} jumps over the lazy dog.",
                sub.replace("The ${animal.${species}} jumps over the ${target}."));
    }

    /**
     * Tests complex and recursive substitution in variable names.
     */
    @Test
    public void StrSubstitutor() {
        values.put("animal.2", "brown fox");
        values.put("animal.1", "white mouse");
        values.put("color", "white");
        values.put("species.white", "1");
        values.put("species.brown", "2");
        final StrSubstitutor sub = new StrSubstitutor(values);
        sub.setEnableSubstitutionInVariables(true);
        assertEquals(
                "Wrong result",
                "The white mouse jumps over the lazy dog.",
                sub.replace("The ${animal.${species.${color}}} jumps over the ${target}."));
    }

    //-----------------------------------------------------------------------
    /**
     * Tests protected.
     */
    @Test
    public void StrSubstitutor() {
        final StrBuilder builder = new StrBuilder("Hi ${name}!");
        final Map<String, String> map = new HashMap<String, String>();
        map.put("name", "commons");
        final StrSubstitutor sub = new StrSubstitutor(map) {
            @Override
            protected String resolveVariable(final String variableName, final StrBuilder buf, final int startPos, final int endPos) {
                assertEquals("name", variableName);
                assertSame(builder, buf);
                assertEquals(3, startPos);
                assertEquals(10, endPos);
                return "jakarta";
            }
        };
        sub.replaceIn(builder);
        assertEquals("Hi jakarta!", builder.toString());
    }

    //-----------------------------------------------------------------------
    /**
     * Tests constructor.
     */
    @Test
    public void StrSubstitutor() {
        final StrSubstitutor sub = new StrSubstitutor();
        assertEquals("Hi ${name}", sub.replace("Hi ${name}"));
    }

    /**
     * Tests constructor.
     */
    @Test
    public void StrSubstitutor() {
        final Map<String, String> map = new HashMap<String, String>();
        map.put("name", "commons");
        final StrSubstitutor sub = new StrSubstitutor(map, "<", ">");
        assertEquals("Hi < commons", sub.replace("Hi $< <name>"));
    }

    /**
     * Tests constructor.
     */
    @Test
    public void StrSubstitutor() {
        final Map<String, String> map = new HashMap<String, String>();
        map.put("name", "commons");
        final StrSubstitutor sub = new StrSubstitutor(map, "<", ">", '!');
        assertEquals("Hi < commons", sub.replace("Hi !< <name>"));
    }

    //-----------------------------------------------------------------------
    /**
     * Tests get set.
     */
    @Test
    public void StrSubstitutor() {
        final StrSubstitutor sub = new StrSubstitutor();
        assertEquals('$', sub.getEscapeChar());
        sub.setEscapeChar('<');
        assertEquals('<', sub.getEscapeChar());
    }

    /**
     * Tests get set.
     */
    @Test
    public void StrSubstitutor() {
        final StrSubstitutor sub = new StrSubstitutor();
        assertTrue(sub.getVariablePrefixMatcher() instanceof StrMatcher.StringMatcher);
        sub.setVariablePrefix('<');
        assertTrue(sub.getVariablePrefixMatcher() instanceof StrMatcher.CharMatcher);

        sub.setVariablePrefix("<<");
        assertTrue(sub.getVariablePrefixMatcher() instanceof StrMatcher.StringMatcher);
        try {
            sub.setVariablePrefix((String) null);
            fail();
        } catch (final IllegalArgumentException ex) {
            // expected
        }
        assertTrue(sub.getVariablePrefixMatcher() instanceof StrMatcher.StringMatcher);

        final StrMatcher matcher = StrMatcher.commaMatcher();
        sub.setVariablePrefixMatcher(matcher);
        assertSame(matcher, sub.getVariablePrefixMatcher());
        try {
            sub.setVariablePrefixMatcher((StrMatcher) null);
            fail();
        } catch (final IllegalArgumentException ex) {
            // expected
        }
        assertSame(matcher, sub.getVariablePrefixMatcher());
    }

    /**
     * Tests get set.
     */
    @Test
    public void StrSubstitutor() {
        final StrSubstitutor sub = new StrSubstitutor();
        assertTrue(sub.getVariableSuffixMatcher() instanceof StrMatcher.StringMatcher);
        sub.setVariableSuffix('<');
        assertTrue(sub.getVariableSuffixMatcher() instanceof StrMatcher.CharMatcher);

        sub.setVariableSuffix("<<");
        assertTrue(sub.getVariableSuffixMatcher() instanceof StrMatcher.StringMatcher);
        try {
            sub.setVariableSuffix((String) null);
            fail();
        } catch (final IllegalArgumentException ex) {
            // expected
        }
        assertTrue(sub.getVariableSuffixMatcher() instanceof StrMatcher.StringMatcher);

        final StrMatcher matcher = StrMatcher.commaMatcher();
        sub.setVariableSuffixMatcher(matcher);
        assertSame(matcher, sub.getVariableSuffixMatcher());
        try {
            sub.setVariableSuffixMatcher((StrMatcher) null);
            fail();
        } catch (final IllegalArgumentException ex) {
            // expected
        }
        assertSame(matcher, sub.getVariableSuffixMatcher());
    }

    //-----------------------------------------------------------------------
    /**
     * Tests static.
     */
    @Test
    public void StrSubstitutor() {
        final Map<String, String> map = new HashMap<String, String>();
        map.put("name", "commons");
        assertEquals("Hi commons!", StrSubstitutor.replace("Hi ${name}!", map));
    }

    /**
     * Tests static.
     */
    @Test
    public void StrSubstitutor() {
        final Map<String, String> map = new HashMap<String, String>();
        map.put("name", "commons");
        assertEquals("Hi commons!", StrSubstitutor.replace("Hi <name>!", map, "<", ">"));
    }

    /**
     * Tests interpolation with system properties.
     */
    @Test
    public void StrSubstitutor() {
        final StrBuilder buf = new StrBuilder();
        buf.append("Hi ").append(System.getProperty("user.name"));
        buf.append(", you are working with ");
        buf.append(System.getProperty("os.name"));
        buf.append(", your home directory is ");
        buf.append(System.getProperty("user.home")).append('.');
        assertEquals(buf.toString(), StrSubstitutor.replaceSystemProperties("Hi ${user.name}, you are "
            + "working with ${os.name}, your home "
            + "directory is ${user.home}."));
    }

    /**
     * Test the replace of a properties object
     */
    @Test
    public void StrSubstitutor(){
        final String org = "${doesnotwork}";
        System.setProperty("doesnotwork", "It works!");

        // create a new Properties object with the System.getProperties as default
        final Properties props = new Properties(System.getProperties());

        assertEquals("It works!", StrSubstitutor.replace(org, props));
    }
    
    @Test
    public void StrSubstitutor() {
        final Map<String, String> map = new HashMap<String, String>();
        map.put("greeting", "Hello");
        map.put(" there ", "XXX");
        map.put("name", "commons");
        assertEquals("Hi commons!", StrSubstitutor.replace("Hi @name@!", map, "@", "@"));
        assertEquals("Hello there commons!", StrSubstitutor.replace("@greeting@ there @name@!", map, "@", "@"));
    }

}
