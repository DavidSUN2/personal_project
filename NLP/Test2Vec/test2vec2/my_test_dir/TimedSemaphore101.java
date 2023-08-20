
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
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.easymock.EasyMock;
import org.junit.Test;

/**
 * Test class for TimedSemaphore.
 *
 * @version $Id$
 */
public class TimedSemaphoreTest {
    /**
     * Tests the acquire() method if a limit is set.
     */
    @Test
    public void TimedSemaphore() throws InterruptedException {
        final ScheduledExecutorService service = EasyMock
                .createMock(ScheduledExecutorService.class);
        final ScheduledFuture<?> future = EasyMock.createMock(ScheduledFuture.class);
        prepareStartTimer(service, future);
        EasyMock.replay(service, future);
        final int count = 10;
        final CountDownLatch latch = new CountDownLatch(count - 1);
        final TimedSemaphore semaphore = new TimedSemaphore(service, PERIOD, UNIT, 1);
        final SemaphoreThread t = new SemaphoreThread(semaphore, latch, count,
                count - 1);
        semaphore.setLimit(count - 1);

        // start a thread that calls the semaphore count times
        t.start();
        latch.await();
        // now the semaphore's limit should be reached and the thread blocked
        assertEquals("Wrong semaphore count", count - 1, semaphore
                .getAcquireCount());

        // this wakes up the thread, it should call the semaphore once more
        semaphore.endOfPeriod();
        t.join();
        assertEquals("Wrong semaphore count (2)", 1, semaphore
                .getAcquireCount());
        assertEquals("Wrong acquire() count", count - 1, semaphore
                .getLastAcquiresPerPeriod());
        EasyMock.verify(service, future);
    }

    /**
     * Tests the acquire() method if more threads are involved than the limit.
     * This method starts a number of threads that all invoke the semaphore. The
     * semaphore's limit is set to 1, so in each period only a single thread can
     * acquire the semaphore.
     */
    @Test
    public void TimedSemaphore() throws InterruptedException {
        final ScheduledExecutorService service = EasyMock
                .createMock(ScheduledExecutorService.class);
        final ScheduledFuture<?> future = EasyMock.createMock(ScheduledFuture.class);
        prepareStartTimer(service, future);
        EasyMock.replay(service, future);
        final TimedSemaphoreTestImpl semaphore = new TimedSemaphoreTestImpl(service,
                PERIOD, UNIT, 1);
        semaphore.latch = new CountDownLatch(1);
        final int count = 10;
        final SemaphoreThread[] threads = new SemaphoreThread[count];
        for (int i = 0; i < count; i++) {
            threads[i] = new SemaphoreThread(semaphore, null, 1, 0);
            threads[i].start();
        }
        for (int i = 0; i < count; i++) {
            semaphore.latch.await();
            assertEquals("Wrong count", 1, semaphore.getAcquireCount());
            semaphore.latch = new CountDownLatch(1);
            semaphore.endOfPeriod();
            assertEquals("Wrong acquire count", 1, semaphore
                    .getLastAcquiresPerPeriod());
        }
        for (int i = 0; i < count; i++) {
            threads[i].join();
        }
        EasyMock.verify(service, future);
    }

    /**
     * Tests the acquire() method if no limit is set. A test thread is started
     * that calls the semaphore a large number of times. Even if the semaphore's
     * period does not end, the thread should never block.
     */
    @Test
    public void TimedSemaphore() throws InterruptedException {
        final ScheduledExecutorService service = EasyMock
                .createMock(ScheduledExecutorService.class);
        final ScheduledFuture<?> future = EasyMock.createMock(ScheduledFuture.class);
        prepareStartTimer(service, future);
        EasyMock.replay(service, future);
        final TimedSemaphoreTestImpl semaphore = new TimedSemaphoreTestImpl(service,
                PERIOD, UNIT, TimedSemaphore.NO_LIMIT);
        final int count = 1000;
        final CountDownLatch latch = new CountDownLatch(count);
        final SemaphoreThread t = new SemaphoreThread(semaphore, latch, count, count);
        t.start();
        latch.await();
        EasyMock.verify(service, future);
    }

    /**
     * Tries to call acquire() after shutdown(). This should cause an exception.
     */
    @Test(expected = IllegalStateException.class)
    public void TimedSemaphore() throws InterruptedException {
        final TimedSemaphore semaphore = new TimedSemaphore(PERIOD, UNIT, LIMIT);
        semaphore.shutdown();
        semaphore.acquire();
    }

    /**
     * Tests a bigger number of invocations that span multiple periods. The
     * period is set to a very short time. A background thread calls the
     * semaphore a large number of times. While it runs at last one end of a
     * period should be reached.
     */
    @Test
    public void TimedSemaphore() throws InterruptedException {
        final int count = 1000;
        final TimedSemaphoreTestImpl semaphore = new TimedSemaphoreTestImpl(
                PERIOD / 10, TimeUnit.MILLISECONDS, 1);
        semaphore.setLimit(count / 4);
        final CountDownLatch latch = new CountDownLatch(count);
        final SemaphoreThread t = new SemaphoreThread(semaphore, latch, count, count);
        t.start();
        latch.await();
        semaphore.shutdown();
        assertTrue("End of period not reached", semaphore.getPeriodEnds() > 0);
    }

    /**
     * Tests the methods for statistics.
     */
    @Test
    public void TimedSemaphore() throws InterruptedException {
        final ScheduledExecutorService service = EasyMock
                .createMock(ScheduledExecutorService.class);
        final ScheduledFuture<?> future = EasyMock.createMock(ScheduledFuture.class);
        prepareStartTimer(service, future);
        EasyMock.replay(service, future);
        final TimedSemaphore semaphore = new TimedSemaphore(service, PERIOD, UNIT,
                LIMIT);
        semaphore.acquire();
        semaphore.endOfPeriod();
        assertEquals("Wrong average (1)", 1.0, semaphore
                .getAverageCallsPerPeriod(), .005);
        semaphore.acquire();
        semaphore.acquire();
        semaphore.endOfPeriod();
        assertEquals("Wrong average (2)", 1.5, semaphore
                .getAverageCallsPerPeriod(), .005);
        EasyMock.verify(service, future);
    }

    /**
     * Tests whether the available non-blocking calls can be queried.
     */
    @Test
    public void TimedSemaphore() throws InterruptedException {
        final ScheduledExecutorService service = EasyMock
                .createMock(ScheduledExecutorService.class);
        final ScheduledFuture<?> future = EasyMock.createMock(ScheduledFuture.class);
        prepareStartTimer(service, future);
        EasyMock.replay(service, future);
        final TimedSemaphore semaphore = new TimedSemaphore(service, PERIOD, UNIT,
                LIMIT);
        for (int i = 0; i < LIMIT; i++) {
            assertEquals("Wrong available count at " + i, LIMIT - i, semaphore
                    .getAvailablePermits());
            semaphore.acquire();
        }
        semaphore.endOfPeriod();
        assertEquals("Wrong available count in new period", LIMIT, semaphore
                .getAvailablePermits());
        EasyMock.verify(service, future);
    }
}
