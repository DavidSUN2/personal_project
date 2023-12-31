
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
package org.apache.commons.lang3.builder;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Tests {@link org.apache.commons.lang3.builder.HashCodeBuilder} and
 * {@link org.apache.commons.lang3.builder.EqualsBuilderTest} to insure that equal
 * objects must have equal hash codes.
 * 
 * @version $Id$
 */
public class HashCodeBuilderAndEqualsBuilderTest {

    //-----------------------------------------------------------------------

    private void testInteger(final boolean testTransients) {
        final Integer i1 = Integer.valueOf(12345);
        final Integer i2 = Integer.valueOf(12345);
        assertEqualsAndHashCodeContract(i1, i2, testTransients);
    }


    @Test
    public void HashCodeBuilder() {
        testFixture(false);
    }

    @Test
    public void HashCodeBuilder() {
        testFixture(true);
    }
}
