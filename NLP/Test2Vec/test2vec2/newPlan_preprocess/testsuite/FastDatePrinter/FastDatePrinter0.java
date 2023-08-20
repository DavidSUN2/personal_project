package FastDatePrinter;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FastDatePrinter0 {

    public static boolean debug = false;

    @Test
    public void FastDatePrinter1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDatePrinter0.FastDatePrinter1");
        int int0 = org.apache.commons.lang3.time.FastDatePrinter.SHORT;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void FastDatePrinter2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDatePrinter0.FastDatePrinter2");
        int int0 = org.apache.commons.lang3.time.FastDatePrinter.LONG;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void FastDatePrinter3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDatePrinter0.FastDatePrinter3");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FastDatePrinter4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDatePrinter0.FastDatePrinter4");
        int int0 = org.apache.commons.lang3.time.FastDatePrinter.MEDIUM;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void FastDatePrinter5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDatePrinter0.FastDatePrinter5");
        int int0 = org.apache.commons.lang3.time.FastDatePrinter.FULL;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }
}

