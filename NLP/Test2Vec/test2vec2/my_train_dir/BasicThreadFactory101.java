
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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.ThreadFactory;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

/**
 * Test class for {@code BasicThreadFactory}.
 *
 * @version $Id$
 */
public class BasicThreadFactoryTest {
    /** Constant for the test naming pattern. */
    private static final String PATTERN = "testThread-%d";

    /** The builder for creating a thread factory. */
    private BasicThreadFactory.Builder builder;

    @Before
    public void setUp() throws Exception {
        builder = new BasicThreadFactory.Builder();
    }

    /**
     * Tests the default options of a thread factory.
     *
     * @param factory the factory to be checked
     */
    private void checkFactoryDefaults(final BasicThreadFactory factory) {
        assertNull("Got a naming pattern", factory.getNamingPattern());
        assertNull("Got an exception handler", factory
                .getUncaughtExceptionHandler());
        assertNull("Got a priority", factory.getPriority());
        assertNull("Got a daemon flag", factory.getDaemonFlag());
        assertNotNull("No wrapped factory", factory.getWrappedFactory());
    }

    /**
     * Tests the default values used by the builder.
     */
    @Test
    public void BasicThreadFactory() {
        final BasicThreadFactory factory = builder.build();
        checkFactoryDefaults(factory);
    }

    /**
     * Tries to set a null naming pattern.
     */
    @Test(expected = NullPointerException.class)
    public void BasicThreadFactory() {
        builder.namingPattern(null);
    }

    /**
     * Tries to set a null wrapped factory.
     */
    @Test(expected = NullPointerException.class)
    public void BasicThreadFactory() {
        builder.wrappedFactory(null);
    }

    /**
     * Tries to set a null exception handler.
     */
    @Test(expected = NullPointerException.class)
    public void BasicThreadFactory() {
        builder.uncaughtExceptionHandler(null);
    }

    /**
     * Tests the reset() method of the builder.
     */
    @Test
    public void BasicThreadFactory() {
        final ThreadFactory wrappedFactory = EasyMock.createMock(ThreadFactory.class);
        final Thread.UncaughtExceptionHandler exHandler = EasyMock
                .createMock(Thread.UncaughtExceptionHandler.class);
        EasyMock.replay(wrappedFactory, exHandler);
        builder.namingPattern(PATTERN).daemon(true).priority(
                Thread.MAX_PRIORITY).uncaughtExceptionHandler(exHandler)
                .wrappedFactory(wrappedFactory);
        builder.reset();
        final BasicThreadFactory factory = builder.build();
        checkFactoryDefaults(factory);
        assertNotSame("Wrapped factory not reset", wrappedFactory, factory
                .getWrappedFactory());
        EasyMock.verify(wrappedFactory, exHandler);
    }

    /**
     * Tests whether reset() is automatically called after build().
     */
    @Test
    public void BasicThreadFactory() {
        builder.wrappedFactory(EasyMock.createNiceMock(ThreadFactory.class))
                .namingPattern(PATTERN).daemon(true).build();
        checkFactoryDefaults(builder.build());
    }

    /**
     * Tests whether the naming pattern is applied to new threads.
     */
    @Test
    public void BasicThreadFactory() {
        final ThreadFactory wrapped = EasyMock.createMock(ThreadFactory.class);
        final Runnable r = EasyMock.createMock(Runnable.class);
        final int count = 12;
        for (int i = 0; i < count; i++) {
            EasyMock.expect(wrapped.newThread(r)).andReturn(new Thread());
        }
        EasyMock.replay(wrapped, r);
        final BasicThreadFactory factory = builder.wrappedFactory(wrapped)
                .namingPattern(PATTERN).build();
        for (int i = 0; i < count; i++) {
            final Thread t = factory.newThread(r);
            assertEquals("Wrong thread name", String.format(PATTERN, Long
                    .valueOf(i + 1)), t.getName());
            assertEquals("Wrong thread count", i + 1, factory.getThreadCount());
        }
        EasyMock.verify(wrapped, r);
    }

    /**
     * Tests whether the thread name is not modified if no naming pattern is
     * set.
     */
    @Test
    public void BasicThreadFactory() {
        final ThreadFactory wrapped = EasyMock.createMock(ThreadFactory.class);
        final Runnable r = EasyMock.createMock(Runnable.class);
        final String name = "unchangedThreadName";
        final Thread t = new Thread(name);
        EasyMock.expect(wrapped.newThread(r)).andReturn(t);
        EasyMock.replay(wrapped, r);
        final BasicThreadFactory factory = builder.wrappedFactory(wrapped).build();
        assertSame("Wrong thread", t, factory.newThread(r));
        assertEquals("Name was changed", name, t.getName());
        EasyMock.verify(wrapped, r);
    }

    /**
     * Helper method for testing whether the daemon flag is taken into account.
     *
     * @param flag the value of the flag
     */
    private void checkDaemonFlag(final boolean flag) {
        final ThreadFactory wrapped = EasyMock.createMock(ThreadFactory.class);
        final Runnable r = EasyMock.createMock(Runnable.class);
        final Thread t = new Thread();
        EasyMock.expect(wrapped.newThread(r)).andReturn(t);
        EasyMock.replay(wrapped, r);
        final BasicThreadFactory factory = builder.wrappedFactory(wrapped).daemon(
                flag).build();
        assertSame("Wrong thread", t, factory.newThread(r));
        assertTrue("Wrong daemon flag", flag == t.isDaemon());
        EasyMock.verify(wrapped, r);
    }

    /**
     * Tests whether daemon threads can be created.
     */
    @Test
    public void BasicThreadFactory() {
        checkDaemonFlag(true);
    }

    /**
     * Tests whether the daemon status of new threads can be turned off.
     */
    @Test
    public void BasicThreadFactory() {
        checkDaemonFlag(false);
    }


}
