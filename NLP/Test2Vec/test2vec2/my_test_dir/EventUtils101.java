
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
package org.apache.commons.lang3.event;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.VetoableChangeListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

import javax.naming.event.ObjectChangeListener;

import org.junit.Test;

/**
 * @since 3.0
 * @version $Id$
 */
public class EventUtilsTest 
{

    @Test
    public void EventUtils()
    {
        final PropertyChangeSource src = new PropertyChangeSource();
        final EventCounter counter = new EventCounter();
        EventUtils.bindEventsToMethod(counter, "eventOccurred", src, PropertyChangeListener.class);
        assertEquals(0, counter.getCount());
        src.setProperty("newValue");
        assertEquals(1, counter.getCount());
    }


    @Test
    public void EventUtils()
    {
        final PropertyChangeSource src = new PropertyChangeSource();
        final EventCounterWithEvent counter = new EventCounterWithEvent();
        EventUtils.bindEventsToMethod(counter, "eventOccurred", src, PropertyChangeListener.class);
        assertEquals(0, counter.getCount());
        src.setProperty("newValue");
        assertEquals(1, counter.getCount());
    }


    @Test
    public void EventUtils()
    {
        final MultipleEventSource src = new MultipleEventSource();
        final EventCounter counter = new EventCounter();
        EventUtils.bindEventsToMethod(counter, "eventOccurred", src, MultipleEventListener.class, "event1");
        assertEquals(0, counter.getCount());
        src.listeners.fire().event1(new PropertyChangeEvent(new Date(), "Day", Integer.valueOf(0), Integer.valueOf(1)));
        assertEquals(1, counter.getCount());
        src.listeners.fire().event2(new PropertyChangeEvent(new Date(), "Day", Integer.valueOf(1), Integer.valueOf(2)));
        assertEquals(1, counter.getCount());
    }
}
