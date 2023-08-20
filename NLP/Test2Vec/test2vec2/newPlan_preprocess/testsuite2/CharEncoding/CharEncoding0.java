package CharEncoding;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CharEncoding0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharEncoding0.test01");
        java.lang.String str0 = org.apache.commons.lang3.CharEncoding.UTF_16LE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "UTF-16LE" + "'", str0.equals("UTF-16LE"));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharEncoding0.test02");
        boolean boolean1 = org.apache.commons.lang3.CharEncoding.isSupported("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharEncoding0.test03");
        java.lang.String str0 = org.apache.commons.lang3.CharEncoding.ISO_8859_1;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ISO-8859-1" + "'", str0.equals("ISO-8859-1"));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharEncoding0.test04");
        java.lang.String str0 = org.apache.commons.lang3.CharEncoding.US_ASCII;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "US-ASCII" + "'", str0.equals("US-ASCII"));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharEncoding0.test05");
        boolean boolean1 = org.apache.commons.lang3.CharEncoding.isSupported("ISO-8859-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharEncoding0.test06");
        java.lang.String str0 = org.apache.commons.lang3.CharEncoding.UTF_16BE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "UTF-16BE" + "'", str0.equals("UTF-16BE"));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharEncoding0.test07");
        java.lang.String str0 = org.apache.commons.lang3.CharEncoding.UTF_8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "UTF-8" + "'", str0.equals("UTF-8"));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharEncoding0.test08");
        java.lang.String str0 = org.apache.commons.lang3.CharEncoding.UTF_16;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "UTF-16" + "'", str0.equals("UTF-16"));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharEncoding0.test09");
        boolean boolean1 = org.apache.commons.lang3.CharEncoding.isSupported("UTF-16LE");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharEncoding0.test10");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharEncoding0.test11");
        org.apache.commons.lang3.CharEncoding charEncoding0 = new org.apache.commons.lang3.CharEncoding();
        java.lang.Class<?> wildcardClass1 = charEncoding0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharEncoding0.test12");
        boolean boolean1 = org.apache.commons.lang3.CharEncoding.isSupported("US-ASCII");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharEncoding0.test13");
        boolean boolean1 = org.apache.commons.lang3.CharEncoding.isSupported("UTF-16BE");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharEncoding0.test14");
        boolean boolean1 = org.apache.commons.lang3.CharEncoding.isSupported("UTF-8");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharEncoding0.test15");
        boolean boolean1 = org.apache.commons.lang3.CharEncoding.isSupported("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharEncoding0.test16");
        boolean boolean1 = org.apache.commons.lang3.CharEncoding.isSupported("UTF-16");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }
}

