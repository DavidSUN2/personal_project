
package EventListenerSupport;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EventListenerSupport0 {

    public static boolean debug = false;

    @Test
    public void EventListenerSupport() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EventListenerSupport0.test01");
        java.lang.Class<java.lang.CharSequence> charSequenceClass0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.event.EventListenerSupport<java.lang.CharSequence> charSequenceEventListenerSupport1 = new org.apache.commons.lang3.event.EventListenerSupport<java.lang.CharSequence>(charSequenceClass0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Listener interface cannot be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void EventListenerSupport() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EventListenerSupport0.test02");
        java.lang.Class<java.lang.String> strClass0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.event.EventListenerSupport<java.lang.String> strEventListenerSupport1 = new org.apache.commons.lang3.event.EventListenerSupport<java.lang.String>(strClass0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Listener interface cannot be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void EventListenerSupport() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EventListenerSupport0.test03");
        java.lang.Class<java.lang.Object> objClass0 = null;
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.event.EventListenerSupport<java.lang.Object> objEventListenerSupport2 = new org.apache.commons.lang3.event.EventListenerSupport<java.lang.Object>(objClass0, classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Listener interface cannot be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void EventListenerSupport() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EventListenerSupport0.test04");
        java.lang.Class<java.lang.reflect.GenericDeclaration> genericDeclarationClass0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.event.EventListenerSupport<java.lang.reflect.GenericDeclaration> genericDeclarationEventListenerSupport1 = new org.apache.commons.lang3.event.EventListenerSupport<java.lang.reflect.GenericDeclaration>(genericDeclarationClass0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Listener interface cannot be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void EventListenerSupport() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EventListenerSupport0.test05");
        java.lang.Class<java.io.Serializable> serializableClass0 = null;
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.event.EventListenerSupport<java.io.Serializable> serializableEventListenerSupport2 = new org.apache.commons.lang3.event.EventListenerSupport<java.io.Serializable>(serializableClass0, classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Listener interface cannot be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void EventListenerSupport() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EventListenerSupport0.test06");
        java.lang.Class<java.lang.Comparable<java.lang.String>> strComparableClass0 = null;
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.event.EventListenerSupport<java.lang.Comparable<java.lang.String>> strComparableEventListenerSupport2 = new org.apache.commons.lang3.event.EventListenerSupport<java.lang.Comparable<java.lang.String>>(strComparableClass0, classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Listener interface cannot be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void EventListenerSupport() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EventListenerSupport0.test07");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.event.EventListenerSupport<java.lang.Object> objEventListenerSupport3 = new org.apache.commons.lang3.event.EventListenerSupport<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass1, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: ClassLoader cannot be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void EventListenerSupport() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EventListenerSupport0.test08");
        java.lang.Class<java.lang.reflect.AnnotatedElement> annotatedElementClass0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.event.EventListenerSupport<java.lang.reflect.AnnotatedElement> annotatedElementEventListenerSupport1 = new org.apache.commons.lang3.event.EventListenerSupport<java.lang.reflect.AnnotatedElement>(annotatedElementClass0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Listener interface cannot be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void EventListenerSupport() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EventListenerSupport0.test09");
        java.lang.Class<java.lang.reflect.GenericDeclaration> genericDeclarationClass0 = null;
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.event.EventListenerSupport<java.lang.reflect.GenericDeclaration> genericDeclarationEventListenerSupport2 = new org.apache.commons.lang3.event.EventListenerSupport<java.lang.reflect.GenericDeclaration>(genericDeclarationClass0, classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Listener interface cannot be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void EventListenerSupport() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EventListenerSupport0.test10");
        java.lang.Class<java.lang.String> strClass0 = null;
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.event.EventListenerSupport<java.lang.String> strEventListenerSupport2 = new org.apache.commons.lang3.event.EventListenerSupport<java.lang.String>(strClass0, classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Listener interface cannot be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void EventListenerSupport() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EventListenerSupport0.test11");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.event.EventListenerSupport<java.lang.Object> objEventListenerSupport2 = new org.apache.commons.lang3.event.EventListenerSupport<java.lang.Object>((java.lang.Class<java.lang.Object>) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Class {0} is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void EventListenerSupport() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EventListenerSupport0.test12");
        java.lang.Class<java.lang.CharSequence> charSequenceClass0 = null;
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.event.EventListenerSupport<java.lang.CharSequence> charSequenceEventListenerSupport2 = new org.apache.commons.lang3.event.EventListenerSupport<java.lang.CharSequence>(charSequenceClass0, classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Listener interface cannot be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void EventListenerSupport() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EventListenerSupport0.test13");
        java.lang.Class<java.lang.reflect.AnnotatedElement> annotatedElementClass0 = null;
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.event.EventListenerSupport<java.lang.reflect.AnnotatedElement> annotatedElementEventListenerSupport2 = new org.apache.commons.lang3.event.EventListenerSupport<java.lang.reflect.AnnotatedElement>(annotatedElementClass0, classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Listener interface cannot be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void EventListenerSupport() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EventListenerSupport0.test14");
        java.lang.Class<java.lang.Comparable<java.lang.String>> strComparableClass0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.event.EventListenerSupport<java.lang.Comparable<java.lang.String>> strComparableEventListenerSupport1 = new org.apache.commons.lang3.event.EventListenerSupport<java.lang.Comparable<java.lang.String>>(strComparableClass0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Listener interface cannot be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void EventListenerSupport() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EventListenerSupport0.test15");
        java.lang.Class<java.lang.reflect.Type> typeClass0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.event.EventListenerSupport<java.lang.reflect.Type> typeEventListenerSupport1 = new org.apache.commons.lang3.event.EventListenerSupport<java.lang.reflect.Type>(typeClass0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Listener interface cannot be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void EventListenerSupport() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EventListenerSupport0.test16");
        java.lang.Class<java.io.Serializable> serializableClass0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.event.EventListenerSupport<java.io.Serializable> serializableEventListenerSupport1 = new org.apache.commons.lang3.event.EventListenerSupport<java.io.Serializable>(serializableClass0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Listener interface cannot be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void EventListenerSupport() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EventListenerSupport0.test17");
        java.lang.Class<java.lang.reflect.Type> typeClass0 = null;
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.event.EventListenerSupport<java.lang.reflect.Type> typeEventListenerSupport2 = new org.apache.commons.lang3.event.EventListenerSupport<java.lang.reflect.Type>(typeClass0, classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Listener interface cannot be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void EventListenerSupport() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EventListenerSupport0.test18");
        java.lang.Class<java.lang.Object> objClass0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.event.EventListenerSupport<java.lang.Object> objEventListenerSupport1 = new org.apache.commons.lang3.event.EventListenerSupport<java.lang.Object>(objClass0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Listener interface cannot be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }
}

