
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
        /**
     * Tests whether the daemon flag is not touched on newly created threads if
     * it is not specified.
     */
    @Test
    public void BasicThreadFactory() {
        final ThreadFactory wrapped = EasyMock.createMock(ThreadFactory.class);
        final Runnable r1 = EasyMock.createMock(Runnable.class);
        final Runnable r2 = EasyMock.createMock(Runnable.class);
        final Thread t1 = new Thread();
        final Thread t2 = new Thread();
        t1.setDaemon(true);
        EasyMock.expect(wrapped.newThread(r1)).andReturn(t1);
        EasyMock.expect(wrapped.newThread(r2)).andReturn(t2);
        EasyMock.replay(wrapped, r1, r2);
        final BasicThreadFactory factory = builder.wrappedFactory(wrapped).build();
        assertSame("Wrong thread 1", t1, factory.newThread(r1));
        assertTrue("No daemon thread", t1.isDaemon());
        assertSame("Wrong thread 2", t2, factory.newThread(r2));
        assertFalse("A daemon thread", t2.isDaemon());
        EasyMock.verify(wrapped, r1, r2);
    }

    /**
     * Tests whether the priority is set on newly created threads.
     */
    @Test
    public void BasicThreadFactory() {
        final ThreadFactory wrapped = EasyMock.createMock(ThreadFactory.class);
        final Runnable r = EasyMock.createMock(Runnable.class);
        final Thread t = new Thread();
        EasyMock.expect(wrapped.newThread(r)).andReturn(t);
        EasyMock.replay(wrapped, r);
        final int priority = Thread.NORM_PRIORITY + 1;
        final BasicThreadFactory factory = builder.wrappedFactory(wrapped).priority(
                priority).build();
        assertSame("Wrong thread", t, factory.newThread(r));
        assertEquals("Wrong priority", priority, t.getPriority());
        EasyMock.verify(wrapped, r);
    }

    /**
     * Tests whether the original priority is not changed if no priority is
     * specified.
     */
    @Test
    public void BasicThreadFactory() {
        final ThreadFactory wrapped = EasyMock.createMock(ThreadFactory.class);
        final Runnable r = EasyMock.createMock(Runnable.class);
        final int orgPriority = Thread.NORM_PRIORITY + 1;
        final Thread t = new Thread();
        t.setPriority(orgPriority);
        EasyMock.expect(wrapped.newThread(r)).andReturn(t);
        EasyMock.replay(wrapped, r);
        final BasicThreadFactory factory = builder.wrappedFactory(wrapped).build();
        assertSame("Wrong thread", t, factory.newThread(r));
        assertEquals("Wrong priority", orgPriority, t.getPriority());
        EasyMock.verify(wrapped, r);
    }

    /**
     * Tests whether the exception handler is set if one is provided.
     */
    @Test
    public void BasicThreadFactory() {
        final ThreadFactory wrapped = EasyMock.createMock(ThreadFactory.class);
        final Runnable r = EasyMock.createMock(Runnable.class);
        final Thread.UncaughtExceptionHandler handler = EasyMock
                .createMock(Thread.UncaughtExceptionHandler.class);
        final Thread t = new Thread();
        EasyMock.expect(wrapped.newThread(r)).andReturn(t);
        EasyMock.replay(wrapped, r, handler);
        final BasicThreadFactory factory = builder.wrappedFactory(wrapped)
                .uncaughtExceptionHandler(handler).build();
        assertSame("Wrong thread", t, factory.newThread(r));
        assertEquals("Wrong exception handler", handler, t
                .getUncaughtExceptionHandler());
        EasyMock.verify(wrapped, r, handler);
    }

    /**
     * Tests whether the original exception hander is not touched if none is
     * specified.
     */
    @Test
    public void BasicThreadFactory() {
        final ThreadFactory wrapped = EasyMock.createMock(ThreadFactory.class);
        final Runnable r = EasyMock.createMock(Runnable.class);
        final Thread.UncaughtExceptionHandler handler = EasyMock
                .createMock(Thread.UncaughtExceptionHandler.class);
        final Thread t = new Thread();
        t.setUncaughtExceptionHandler(handler);
        EasyMock.expect(wrapped.newThread(r)).andReturn(t);
        EasyMock.replay(wrapped, r, handler);
        final BasicThreadFactory factory = builder.wrappedFactory(wrapped).build();
        assertSame("Wrong thread", t, factory.newThread(r));
        assertEquals("Wrong exception handler", handler, t
                .getUncaughtExceptionHandler());
        EasyMock.verify(wrapped, r, handler);
    }
}
