package EventUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EventUtils0 {

    public static boolean debug = false;

    @Test
    public void EventUtils1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EventUtils0.EventUtils1");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void EventUtils2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EventUtils0.EventUtils2");
        org.apache.commons.lang3.event.EventUtils eventUtils0 = new org.apache.commons.lang3.event.EventUtils();
        java.lang.Class<?> wildcardClass1 = eventUtils0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

