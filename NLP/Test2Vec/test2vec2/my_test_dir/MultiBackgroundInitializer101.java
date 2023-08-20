
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
package org.apache.commons.lang3.concurrent;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Before;
import org.junit.Test;

/**
 * Test class for {@link MultiBackgroundInitializer}.
 *
 * @version $Id$
 */
public class MultiBackgroundInitializerTest {
    @Test
    public void MultiBackgroundInitializer() {
        final ChildBackgroundInitializer child = new ChildBackgroundInitializer();
        child.ex = new RuntimeException();
        initializer.addInitializer(CHILD_INIT, child);
        initializer.start();
        try {
            initializer.get();
            fail("Runtime exception not thrown!");
        } catch (final Exception ex) {
            assertEquals("Wrong exception", child.ex, ex);
        }
    }

    /**
     * Tests the behavior of the initializer if one of the child initializers
     * throws a checked exception.
     */
    @Test
    public void MultiBackgroundInitializer() throws ConcurrentException {
        final ChildBackgroundInitializer child = new ChildBackgroundInitializer();
        child.ex = new Exception();
        initializer.addInitializer(CHILD_INIT, child);
        initializer.start();
        final MultiBackgroundInitializer.MultiBackgroundInitializerResults res = initializer
                .get();
        assertTrue("No exception flag", res.isException(CHILD_INIT));
        assertNull("Got a results object", res.getResultObject(CHILD_INIT));
        final ConcurrentException cex = res.getException(CHILD_INIT);
        assertEquals("Wrong cause", child.ex, cex.getCause());
    }

    /**
     * Tests the isSuccessful() method of the result object if no child
     * initializer has thrown an exception.
     */
    @Test
    public void MultiBackgroundInitializer()
            throws ConcurrentException {
        final ChildBackgroundInitializer child = new ChildBackgroundInitializer();
        initializer.addInitializer(CHILD_INIT, child);
        initializer.start();
        final MultiBackgroundInitializer.MultiBackgroundInitializerResults res = initializer
                .get();
        assertTrue("Wrong success flag", res.isSuccessful());
    }

    /**
     * Tests the isSuccessful() method of the result object if at least one
     * child initializer has thrown an exception.
     */
    @Test
    public void MultiBackgroundInitializer()
            throws ConcurrentException {
        final ChildBackgroundInitializer child = new ChildBackgroundInitializer();
        child.ex = new Exception();
        initializer.addInitializer(CHILD_INIT, child);
        initializer.start();
        final MultiBackgroundInitializer.MultiBackgroundInitializerResults res = initializer
                .get();
        assertFalse("Wrong success flag", res.isSuccessful());
    }

    /**
     * Tests whether MultiBackgroundInitializers can be combined in a nested
     * way.
     */
    @Test
    public void MultiBackgroundInitializer() throws ConcurrentException {
        final String nameMulti = "multiChildInitializer";
        initializer
                .addInitializer(CHILD_INIT, new ChildBackgroundInitializer());
        final MultiBackgroundInitializer mi2 = new MultiBackgroundInitializer();
        final int count = 3;
        for (int i = 0; i < count; i++) {
            mi2
                    .addInitializer(CHILD_INIT + i,
                            new ChildBackgroundInitializer());
        }
        initializer.addInitializer(nameMulti, mi2);
        initializer.start();
        final MultiBackgroundInitializer.MultiBackgroundInitializerResults res = initializer
                .get();
        final ExecutorService exec = initializer.getActiveExecutor();
        checkChild(res.getInitializer(CHILD_INIT), exec);
        final MultiBackgroundInitializer.MultiBackgroundInitializerResults res2 = (MultiBackgroundInitializer.MultiBackgroundInitializerResults) res
                .getResultObject(nameMulti);
        assertEquals("Wrong number of initializers", count, res2
                .initializerNames().size());
        for (int i = 0; i < count; i++) {
            checkChild(res2.getInitializer(CHILD_INIT + i), exec);
        }
        assertTrue("Executor not shutdown", exec.isShutdown());
    }
}
