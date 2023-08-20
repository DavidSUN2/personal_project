
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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Assert;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.Test;

/**
 * @version $Id$
 */
public class ReflectionToStringBuilderExcludeTest {

    @Test
    public void ReflectionToStringBuilder41() {
        final List<String> excludeList = new ArrayList<String>();
        excludeList.add(SECRET_FIELD);
        final String toString = ReflectionToStringBuilder.toStringExclude(new TestFixture(), excludeList);
        this.validateSecretFieldAbsent(toString);
    }

    @Test
    public void ReflectionToStringBuilder41() {
        final List<String> excludeList = new ArrayList<String>();
        excludeList.add(null);
        final String toString = ReflectionToStringBuilder.toStringExclude(new TestFixture(), excludeList);
        this.validateSecretFieldPresent(toString);
    }

    @Test
    public void ReflectionToStringBuilder41() {
        final List<String> excludeList = new ArrayList<String>();
        excludeList.add(null);
        excludeList.add(null);
        final String toString = ReflectionToStringBuilder.toStringExclude(new TestFixture(), excludeList);
        this.validateSecretFieldPresent(toString);
    }

    @Test
    public void ReflectionToStringBuilder41() {
        final String toString = ReflectionToStringBuilder.toStringExclude(new TestFixture(), ArrayUtils.EMPTY_STRING_ARRAY);
        this.validateSecretFieldPresent(toString);
    }

    @Test
    public void ReflectionToStringBuilder41() {
        final String toString = ReflectionToStringBuilder.toStringExclude(new TestFixture(), new ArrayList<String>());
        this.validateSecretFieldPresent(toString);
    }

    @Test
    public void ReflectionToStringBuilder41() {
        final String toString = ReflectionToStringBuilder.toStringExclude(new TestFixture(), (String[]) null);
        this.validateSecretFieldPresent(toString);
    }

    @Test
    public void ReflectionToStringBuilder41() {
        final String toString = ReflectionToStringBuilder.toStringExclude(new TestFixture(), (Collection<String>) null);
        this.validateSecretFieldPresent(toString);
    }
}
