
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
import static org.junit.Assert.assertSame;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.easymock.EasyMock;
import org.junit.Test;

/**
 * @since 3.0
 * @version $Id$
 */
public class EventListenerSupportTest 
{
    @Test(expected=NullPointerException.class)
    public void EventListenerSupport()
    {
        final EventListenerSupport<VetoableChangeListener> listenerSupport = EventListenerSupport.create(VetoableChangeListener.class);
        listenerSupport.addListener(null);
    }

    @Test(expected=NullPointerException.class)
    public void EventListenerSupport()
    {
        final EventListenerSupport<VetoableChangeListener> listenerSupport = EventListenerSupport.create(VetoableChangeListener.class);
        listenerSupport.removeListener(null);
    }

    @Test
    public void EventListenerSupport() throws PropertyVetoException
    {
        final EventListenerSupport<VetoableChangeListener> listenerSupport = EventListenerSupport.create(VetoableChangeListener.class);
        final List<VetoableChangeListener> calledListeners = new ArrayList<VetoableChangeListener>();

        final VetoableChangeListener listener1 = createListener(calledListeners);
        final VetoableChangeListener listener2 = createListener(calledListeners);
        listenerSupport.addListener(listener1);
        listenerSupport.addListener(listener2);
        listenerSupport.fire().vetoableChange(new PropertyChangeEvent(new Date(), "Day", 4, 5));
        assertEquals(calledListeners.size(), 2);
        assertSame(calledListeners.get(0), listener1);
        assertSame(calledListeners.get(1), listener2);
    }

    @Test(expected=IllegalArgumentException.class)
    public void EventListenerSupport()
    {
        EventListenerSupport.create(String.class);
    }

    @Test(expected=NullPointerException.class)
    public void EventListenerSupport()
    {
        EventListenerSupport.create(null);
    }

    @Test
    public void EventListenerSupport() throws PropertyVetoException
    {
        final EventListenerSupport<VetoableChangeListener> listenerSupport = EventListenerSupport.create(VetoableChangeListener.class);
        for (int i = 0; i < 10; ++i)
        {
            addDeregisterListener(listenerSupport);
        }
        assertEquals(listenerSupport.getListenerCount(), 10);
        listenerSupport.fire().vetoableChange(new PropertyChangeEvent(new Date(), "Day", 4, 5));
        assertEquals(listenerSupport.getListenerCount(), 0);
    }



    private void addDeregisterListener(final EventListenerSupport<VetoableChangeListener> listenerSupport)
    {
        listenerSupport.addListener(new VetoableChangeListener()
        {
            @Override
            public void vetoableChange(final PropertyChangeEvent e)
            {
                listenerSupport.removeListener(this);
            }
        });
    }

    private VetoableChangeListener createListener(final List<VetoableChangeListener> calledListeners)
    {
        return new VetoableChangeListener()
        {
            @Override
            public void vetoableChange(final PropertyChangeEvent e)
            {
                calledListeners.add(this);
            }
        };
    }
}
