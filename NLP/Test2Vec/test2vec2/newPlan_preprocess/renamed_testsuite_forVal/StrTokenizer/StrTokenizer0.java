
package StrTokenizer;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StrTokenizer0 {

    public static boolean debug = false;

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test01");
        char[] charArray5 = new char[] { 'a', 'a', '#', 'a', 'a' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray5);
        int int7 = strTokenizer6.previousIndex();
        int int8 = strTokenizer6.previousIndex();
        java.lang.String str9 = strTokenizer6.previousToken();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test02");
        char[] charArray5 = new char[] { 'a', 'a', '#', 'a', 'a' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray5);
        int int7 = strTokenizer6.previousIndex();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = strTokenizer6.reset("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test03");
        char[] charArray5 = new char[] { 'a', 'a', '#', 'a', 'a' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray5);
        int int7 = strTokenizer6.previousIndex();
        int int8 = strTokenizer6.previousIndex();
        java.lang.String str9 = strTokenizer6.nextToken();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "aa#aa" + "'", str9.equals("aa#aa"));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test04");
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("aa#aa", strMatcher1, strMatcher2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = strTokenizer3.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test05");
        char[] charArray6 = new char[] { '#', '#', '#', '4', 'a', '4' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray6);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = strTokenizer7.setQuoteChar('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test06");
        char[] charArray5 = new char[] { 'a', 'a', '#', 'a', 'a' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray5);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = null;
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray5, strMatcher7, strMatcher8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test07");
        char[] charArray0 = new char[] {};
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, 'a');
        boolean boolean3 = strTokenizer2.hasNext();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test08");
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("hi!", strMatcher1, strMatcher2);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test09");
        char[] charArray5 = new char[] { 'a', 'a', '#', 'a', 'a' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray5);
        int int7 = strTokenizer6.previousIndex();
        java.lang.Class<?> wildcardClass8 = strTokenizer6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test10");
        char[] charArray5 = new char[] { 'a', 'a', '#', 'a', 'a' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray5);
        int int7 = strTokenizer6.previousIndex();
        java.util.List<java.lang.String> strList8 = strTokenizer6.getTokenList();
        int int9 = strTokenizer6.previousIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test11");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("aa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test12");
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("aa#aa", strMatcher1, strMatcher2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setDelimiterString("aa#aa");
        java.lang.String str6 = strTokenizer3.nextToken();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test13");
        char[] charArray5 = new char[] { 'a', 'a', '#', 'a', 'a' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray5);
        int int7 = strTokenizer6.previousIndex();
        int int8 = strTokenizer6.previousIndex();
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strTokenizer6.getQuoteMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test14");
        char[] charArray6 = new char[] { '#', '#', '#', '4', 'a', '4' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray6);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray6);
        java.lang.String[] strArray9 = strTokenizer8.getTokenArray();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test15");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = new org.apache.commons.lang3.text.StrTokenizer("aa#aa");
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test16");
        char[] charArray5 = new char[] { ' ', '4', '4', '4', 'a' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer(charArray5);
        int int7 = strTokenizer6.nextIndex();
        java.util.List<java.lang.String> strList8 = strTokenizer6.getTokenList();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test17");
        char[] charArray0 = new char[] {};
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, 'a');
        int int3 = strTokenizer2.size();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer("hi!");
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer5.setDelimiterMatcher(strMatcher6);
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strTokenizer7.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = strTokenizer2.setQuoteMatcher(strMatcher8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test18");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance();
        int int1 = strTokenizer0.size();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test19");
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("aa#aa", strMatcher1, strMatcher2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setDelimiterString("aa#aa");
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer3.getTrimmerMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test20");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strTokenizer0.getQuoteMatcher();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = strTokenizer0.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test21");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = strTokenizer1.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("aa#aa", strMatcher2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher2);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test22");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = new org.apache.commons.lang3.text.StrTokenizer();
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test23");
        char[] charArray5 = new char[] { ' ', '4', '4', '4', 'a' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer(charArray5);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray5, strMatcher7);
        int int9 = strTokenizer8.previousIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test24");
        char[] charArray0 = new char[] {};
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, 'a');
        int int3 = strTokenizer2.size();
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer2.getIgnoredMatcher();
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer2.add("aa#aa");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher4);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test25");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = new org.apache.commons.lang3.text.StrTokenizer("hi!");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setEmptyTokenAsNull(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test26");
        char[] charArray6 = new char[] { '#', '#', '#', '4', 'a', '4' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray6);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test27");
        char[] charArray5 = new char[] { ' ', '4', '4', '4', 'a' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer(charArray5);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray5, strMatcher7);
        int int9 = strTokenizer8.size();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test28");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        java.lang.String str2 = strTokenizer1.nextToken();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test29");
        char[] charArray5 = new char[] { 'a', 'a', '#', 'a', 'a' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray5);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray5, '#', '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test30");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("", '#', '4');
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test31");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("", ' ', ' ');
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test32");
        char[] charArray5 = new char[] { ' ', '4', '4', '4', 'a' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer(charArray5);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray5, strMatcher7);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test33");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("hi!", "hi!");
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test34");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = new org.apache.commons.lang3.text.StrTokenizer("hi!");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterString("aa#aa");
        int int4 = strTokenizer3.nextIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test35");
        char[] charArray5 = new char[] { ' ', '4', '4', '4', 'a' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer(charArray5);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray5, strMatcher7);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test36");
        char[] charArray6 = new char[] { '#', '#', '#', '4', 'a', '4' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray6);
        int int8 = strTokenizer7.nextIndex();
        java.lang.Class<?> wildcardClass9 = strTokenizer7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test37");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strTokenizer0.getDelimiterMatcher();
        int int2 = strTokenizer0.size();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test38");
        char[] charArray4 = new char[] { 'a', '4', '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray4);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer5.setDelimiterChar(' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = strTokenizer5.setQuoteChar('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test39");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", "hi!");
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test40");
        char[] charArray4 = new char[] { 'a', '4', '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray4);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray4, '4', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test41");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = new org.apache.commons.lang3.text.StrTokenizer("hi!");
        int int2 = strTokenizer1.nextIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test42");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = new org.apache.commons.lang3.text.StrTokenizer("");
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test43");
        char[] charArray0 = new char[] {};
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, 'a');
        int int3 = strTokenizer2.size();
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer2.getIgnoredMatcher();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = strTokenizer2.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher4);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test44");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = new org.apache.commons.lang3.text.StrTokenizer("hi!");
        java.lang.String str2 = strTokenizer1.next();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test45");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("", 'a', ' ');
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test46");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = new org.apache.commons.lang3.text.StrTokenizer("hi!");
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterMatcher(strMatcher2);
        java.util.List<java.lang.String> strList4 = strTokenizer1.getTokenList();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test47");
        char[] charArray5 = new char[] { 'a', 'a', '#', 'a', 'a' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray5);
        int int7 = strTokenizer6.previousIndex();
        int int8 = strTokenizer6.previousIndex();
        boolean boolean9 = strTokenizer6.hasPrevious();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test48");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = new org.apache.commons.lang3.text.StrTokenizer("hi!");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterString("aa#aa");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer1.setDelimiterChar('4');
        int int6 = strTokenizer1.previousIndex();
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer1.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test49");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = new org.apache.commons.lang3.text.StrTokenizer("hi!");
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterMatcher(strMatcher2);
        java.lang.Object obj4 = strTokenizer1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "StrTokenizer[not tokenized yet]");
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test50");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = new org.apache.commons.lang3.text.StrTokenizer("hi!");
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterMatcher(strMatcher2);
        boolean boolean4 = strTokenizer3.hasNext();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer3.setIgnoreEmptyTokens(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test51");
        char[] charArray5 = new char[] { 'a', '4', '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray5);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer6.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer("hi!", strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test52");
        char[] charArray6 = new char[] { '#', '#', '#', '4', 'a', '4' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray6);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray6);
        java.lang.String str9 = strTokenizer8.previousToken();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }
}

