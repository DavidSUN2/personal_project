
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
package org.apache.commons.lang3.math;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.math.IEEE754rUtils}.
 *
 * @version $Id$
 */
public class IEEE754rUtilsTest  {

    @Test
    public void IEEE754rUtils() {
        try {
            IEEE754rUtils.min( (float[]) null);
            fail("IllegalArgumentException expected for null input");
        } catch(final IllegalArgumentException iae) { /* expected */ }

        try {
            IEEE754rUtils.min(new float[0]);
            fail("IllegalArgumentException expected for empty input");
        } catch(final IllegalArgumentException iae) { /* expected */ }

        try {
            IEEE754rUtils.max( (float[]) null);
            fail("IllegalArgumentException expected for null input");
        } catch(final IllegalArgumentException iae) { /* expected */ }

        try {
            IEEE754rUtils.max(new float[0]);
            fail("IllegalArgumentException expected for empty input");
        } catch(final IllegalArgumentException iae) { /* expected */ }

        try {
            IEEE754rUtils.min( (double[]) null);
            fail("IllegalArgumentException expected for null input");
        } catch(final IllegalArgumentException iae) { /* expected */ }

        try {
            IEEE754rUtils.min(new double[0]);
            fail("IllegalArgumentException expected for empty input");
        } catch(final IllegalArgumentException iae) { /* expected */ }

        try {
            IEEE754rUtils.max( (double[]) null);
            fail("IllegalArgumentException expected for null input");
        } catch(final IllegalArgumentException iae) { /* expected */ }

        try {
            IEEE754rUtils.max(new double[0]);
            fail("IllegalArgumentException expected for empty input");
        } catch(final IllegalArgumentException iae) { /* expected */ }

    }

    @Test
    public void IEEE754rUtils() {
        new IEEE754rUtils();
    }
}
