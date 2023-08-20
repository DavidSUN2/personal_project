package CharEncoding;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CharEncoding0 {

    public static boolean debug = false;

    @Test
    public void CharEncoding01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharEncoding0.CharEncoding01");
        java.lang.String str0 = org.apache.commons.lang3.CharEncoding.ISO_8859_1;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ISO-8859-1" + "'", str0.equals("ISO-8859-1"));
    }

    @Test
    public void CharEncoding02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharEncoding0.CharEncoding02");
        java.lang.String str0 = org.apache.commons.lang3.CharEncoding.UTF_16;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "UTF-16" + "'", str0.equals("UTF-16"));
    }

    @Test
    public void CharEncoding03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharEncoding0.CharEncoding03");
        boolean boolean1 = org.apache.commons.lang3.CharEncoding.isSupported("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharEncoding04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharEncoding0.CharEncoding04");
        java.lang.String str0 = org.apache.commons.lang3.CharEncoding.UTF_16LE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "UTF-16LE" + "'", str0.equals("UTF-16LE"));
    }

    @Test
    public void CharEncoding05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharEncoding0.CharEncoding05");
        boolean boolean1 = org.apache.commons.lang3.CharEncoding.isSupported("UTF-16");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharEncoding06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharEncoding0.CharEncoding06");
        java.lang.String str0 = org.apache.commons.lang3.CharEncoding.UTF_16BE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "UTF-16BE" + "'", str0.equals("UTF-16BE"));
    }

    @Test
    public void CharEncoding07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharEncoding0.CharEncoding07");
        org.apache.commons.lang3.CharEncoding charEncoding0 = new org.apache.commons.lang3.CharEncoding();
        java.lang.Class<?> wildcardClass1 = charEncoding0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void CharEncoding08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharEncoding0.CharEncoding08");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void CharEncoding09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharEncoding0.CharEncoding09");
        java.lang.String str0 = org.apache.commons.lang3.CharEncoding.US_ASCII;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "US-ASCII" + "'", str0.equals("US-ASCII"));
    }

    @Test
    public void CharEncoding10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharEncoding0.CharEncoding10");
        boolean boolean1 = org.apache.commons.lang3.CharEncoding.isSupported("ISO-8859-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharEncoding11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharEncoding0.CharEncoding11");
        java.lang.String str0 = org.apache.commons.lang3.CharEncoding.UTF_8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "UTF-8" + "'", str0.equals("UTF-8"));
    }

    @Test
    public void CharEncoding12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharEncoding0.CharEncoding12");
        boolean boolean1 = org.apache.commons.lang3.CharEncoding.isSupported("US-ASCII");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharEncoding13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharEncoding0.CharEncoding13");
        boolean boolean1 = org.apache.commons.lang3.CharEncoding.isSupported("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void CharEncoding14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharEncoding0.CharEncoding14");
        boolean boolean1 = org.apache.commons.lang3.CharEncoding.isSupported("UTF-8");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharEncoding15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharEncoding0.CharEncoding15");
        boolean boolean1 = org.apache.commons.lang3.CharEncoding.isSupported("UTF-16BE");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void CharEncoding16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharEncoding0.CharEncoding16");
        boolean boolean1 = org.apache.commons.lang3.CharEncoding.isSupported("UTF-16LE");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }
}

