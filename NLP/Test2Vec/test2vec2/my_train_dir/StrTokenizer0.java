
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
            System.out.format("%n%s%n", "StrTokenizer0.test001");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strTokenizer8.getTrimmerMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test002");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setDelimiterString("");
        java.lang.Object obj9 = strTokenizer5.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj9.toString(), "StrTokenizer[not tokenized yet]");
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test003");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher7);
        int int9 = strTokenizer8.nextIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test004");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strTokenizer8.getQuoteMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test005");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setDelimiterString("");
        int int9 = strTokenizer5.size();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test006");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer7.set("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: set() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test007");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setDelimiterString("");
        boolean boolean9 = strTokenizer8.hasPrevious();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test008");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        int int2 = strTokenizer1.previousIndex();
        java.lang.String str3 = strTokenizer1.getContent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test009");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setDelimiterString("");
        java.util.List<java.lang.String> strList9 = strTokenizer8.getTokenList();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test010");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '4', 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test011");
        char[] charArray3 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer(charArray3, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer6.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strTokenizer6.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer("hi!", strMatcher8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test012");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, '4');
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test013");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("hi!", '4', 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer3.getQuoteMatcher();
        java.lang.Class<?> wildcardClass5 = strMatcher4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test014");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher7);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test015");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("4 ", '4', ' ');
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test016");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", '#');
        java.lang.String str3 = strTokenizer2.getContent();
        java.lang.Class<?> wildcardClass4 = strTokenizer2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test017");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, "");
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test018");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("hi!");
        java.lang.String str2 = strTokenizer1.getContent();
        boolean boolean3 = strTokenizer1.hasPrevious();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test019");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        int int2 = strTokenizer1.previousIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = strTokenizer1.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test020");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        java.lang.Object obj1 = strTokenizer0.clone();
        java.lang.String str2 = strTokenizer0.getContent();
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer0.set("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: set() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj1.toString(), "StrTokenizer[not tokenized yet]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test021");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, "StrTokenizer[not tokenized yet]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test022");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setIgnoredChar('#');
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strTokenizer5.getIgnoredMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test023");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance();
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test024");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, strMatcher7);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test025");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        java.lang.Object obj4 = strTokenizer3.clone();
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strTokenizer3.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer2.setDelimiterMatcher(strMatcher5);
        java.lang.Class<?> wildcardClass7 = strMatcher5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "StrTokenizer[not tokenized yet]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test026");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = strTokenizer1.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test027");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setDelimiterString("");
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer8.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test028");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer2.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test029");
        char[] charArray3 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer(charArray3, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray3);
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strTokenizer7.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer("4 ", strMatcher8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test030");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterString("");
        java.lang.String str4 = strTokenizer1.previousToken();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test031");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strTokenizer8.getDelimiterMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test032");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        java.lang.Object obj7 = strTokenizer6.clone();
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer6.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj7.toString(), "StrTokenizer[not tokenized yet]");
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test033");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("hi!", '#', '4');
        java.lang.String[] strArray4 = strTokenizer3.getTokenArray();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test034");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a');
        java.lang.Object obj8 = strTokenizer7.clone();
        java.lang.String str9 = strTokenizer7.previousToken();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj8.toString(), "StrTokenizer[not tokenized yet]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test035");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("");
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer1.add("4 ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test036");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("", 'a', '4');
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer3.getIgnoredMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher4);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test037");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setIgnoredChar('#');
        java.lang.Class<?> wildcardClass9 = strTokenizer8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test038");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '4', 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test039");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setDelimiterString("");
        int int9 = strTokenizer8.nextIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test040");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a');
        java.lang.String str8 = strTokenizer7.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = strTokenizer7.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str8.equals("StrTokenizer[not tokenized yet]"));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test041");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, '4', 'a');
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer3.set("4 ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: set() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test042");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = strTokenizer1.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer("hi!", '4', 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer6.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher2, strMatcher7);
        boolean boolean9 = strTokenizer8.hasNext();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test043");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("4 ", '4', 'a');
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test044");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        java.lang.Object obj1 = strTokenizer0.clone();
        java.lang.String str2 = strTokenizer0.getContent();
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer0.add("StrTokenizer[not tokenized yet]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj1.toString(), "StrTokenizer[not tokenized yet]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test045");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        java.lang.String str6 = strTokenizer5.next();
        java.lang.Class<?> wildcardClass7 = strTokenizer5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4 " + "'", str6.equals("4 "));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test046");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("hi!");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("hi!");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher6);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer3.setQuoteMatcher(strMatcher6);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = strTokenizer1.setTrimmerMatcher(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test047");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = strTokenizer1.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher2);
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer3.getIgnoredMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher4);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test048");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        java.lang.Object obj4 = strTokenizer3.clone();
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strTokenizer3.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer2.setDelimiterMatcher(strMatcher5);
        int int7 = strTokenizer6.size();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "StrTokenizer[not tokenized yet]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test049");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer0.set("4 ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: set() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test050");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterChar('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = strTokenizer1.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test051");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = strTokenizer7.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test052");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = strTokenizer1.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("4 ", strMatcher2);
        java.util.List<java.lang.String> strList4 = strTokenizer3.getTokenList();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test053");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strTokenizer0.getIgnoredMatcher();
        java.lang.Class<?> wildcardClass2 = strMatcher1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test054");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        java.lang.Object obj1 = strTokenizer0.clone();
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = strTokenizer0.getQuoteMatcher();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = strTokenizer0.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj1.toString(), "StrTokenizer[not tokenized yet]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher2);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test055");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = new org.apache.commons.lang3.text.StrTokenizer("");
        boolean boolean2 = strTokenizer1.isEmptyTokenAsNull();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test056");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        int int9 = strTokenizer8.nextIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test057");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        java.lang.String str6 = strTokenizer5.next();
        int int7 = strTokenizer5.previousIndex();
        java.lang.Object obj8 = strTokenizer5.clone();
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4 " + "'", str6.equals("4 "));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj8.toString(), "StrTokenizer[not tokenized yet]");
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test058");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, "");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test059");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, "");
        java.lang.Object obj9 = strTokenizer8.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj9.toString(), "StrTokenizer[not tokenized yet]");
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test060");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        java.lang.String str6 = strTokenizer5.next();
        int int7 = strTokenizer5.previousIndex();
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strTokenizer5.getTrimmerMatcher();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = strTokenizer5.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4 " + "'", str6.equals("4 "));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test061");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        int int7 = strTokenizer5.previousIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test062");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("hi!", '#', '4');
        java.util.List<java.lang.String> strList4 = strTokenizer3.getTokenList();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = strTokenizer3.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test063");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '4');
        java.lang.Class<?> wildcardClass8 = charArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test064");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance();
        boolean boolean1 = strTokenizer0.isEmptyTokenAsNull();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test065");
        char[] charArray5 = new char[] { '4', '#', '#', ' ', 'a' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray5, "4 ");
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strTokenizer7.getQuoteMatcher();
        java.lang.String[] strArray9 = strTokenizer7.getTokenArray();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test066");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        int int7 = strTokenizer6.nextIndex();
        java.lang.String str8 = strTokenizer6.nextToken();
        java.lang.String str9 = strTokenizer6.previousToken();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4" + "'", str8.equals("4"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4" + "'", str9.equals("4"));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test067");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setDelimiterString("");
        java.lang.String str9 = strTokenizer8.nextToken();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4 " + "'", str9.equals("4 "));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test068");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = new org.apache.commons.lang3.text.StrTokenizer("4");
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test069");
        char[] charArray5 = new char[] { '4', '#', '#', ' ', 'a' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray5, "4 ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = strTokenizer7.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test070");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '#');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test071");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, "");
        java.util.List<java.lang.String> strList3 = strTokenizer2.getTokenList();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer2.setDelimiterString("4 ");
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer2.getIgnoredMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test072");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setIgnoredChar('#');
        java.lang.Object obj9 = strTokenizer8.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj9.toString(), "StrTokenizer[not tokenized yet]");
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test073");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        java.lang.Object obj4 = strTokenizer3.clone();
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strTokenizer3.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer2.setDelimiterMatcher(strMatcher5);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer6.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = strTokenizer6.setDelimiterString("4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "StrTokenizer[not tokenized yet]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test074");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        java.lang.String str6 = strTokenizer5.next();
        int int7 = strTokenizer5.previousIndex();
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strTokenizer5.getTrimmerMatcher();
        java.lang.String str9 = strTokenizer5.previous();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4 " + "'", str6.equals("4 "));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4 " + "'", str9.equals("4 "));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test075");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, "");
        boolean boolean9 = strTokenizer8.hasPrevious();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test076");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterString("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setEmptyTokenAsNull(false);
        java.lang.String str6 = strTokenizer3.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer3.setDelimiterString("hi!");
        java.lang.String str9 = strTokenizer3.previousToken();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test077");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, '4', 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.reset("");
        java.lang.String[] strArray6 = strTokenizer5.getTokenArray();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test078");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getIgnoredMatcher();
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer5.set("4 ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: set() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test079");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4", "");
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test080");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        java.lang.Object obj4 = strTokenizer3.clone();
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strTokenizer3.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer2.setDelimiterMatcher(strMatcher5);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer6.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = strTokenizer6.setIgnoredChar('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "StrTokenizer[not tokenized yet]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test081");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer6.getDelimiterMatcher();
        java.lang.Object obj8 = strTokenizer6.clone();
        java.lang.String str9 = strTokenizer6.previousToken();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj8.toString(), "StrTokenizer[not tokenized yet]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test082");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", '#');
        java.lang.String str3 = strTokenizer2.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer2.setDelimiterString("4 ");
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer5.add("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test083");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", "hi!");
        boolean boolean3 = strTokenizer2.hasNext();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer2.setIgnoreEmptyTokens(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = strTokenizer2.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test084");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = new org.apache.commons.lang3.text.StrTokenizer("4 ");
        java.lang.String str2 = strTokenizer1.previousToken();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test085");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("hi!");
        java.lang.String str2 = strTokenizer1.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer1.setIgnoreEmptyTokens(true);
        java.lang.String str5 = strTokenizer1.previousToken();
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer1.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer1.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = strTokenizer1.setIgnoredChar('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test086");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        java.lang.String[] strArray9 = strTokenizer8.getTokenArray();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test087");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("hi!");
        java.lang.String str2 = strTokenizer1.getContent();
        java.lang.String str3 = strTokenizer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str3.equals("StrTokenizer[not tokenized yet]"));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test088");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        java.lang.String str8 = strTokenizer7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str8.equals("StrTokenizer[not tokenized yet]"));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test089");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        boolean boolean2 = strTokenizer1.hasPrevious();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test090");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", '#');
        java.lang.String str3 = strTokenizer2.getContent();
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test091");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer6.getDelimiterMatcher();
        int int8 = strTokenizer6.previousIndex();
        boolean boolean9 = strTokenizer6.isEmptyTokenAsNull();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test092");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = strTokenizer1.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("4", strMatcher2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher2);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test093");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = new org.apache.commons.lang3.text.StrTokenizer("hi!", '4', 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strTokenizer4.getQuoteMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[]", strMatcher5, strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test094");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = strTokenizer0.reset("");
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer2);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test095");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        int int7 = strTokenizer6.nextIndex();
        java.lang.String str8 = strTokenizer6.getContent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4 " + "'", str8.equals("4 "));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test096");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        java.lang.Object obj1 = strTokenizer0.clone();
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = strTokenizer0.getQuoteMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = strTokenizer0.getIgnoredMatcher();
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj1.toString(), "StrTokenizer[not tokenized yet]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher3);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test097");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, ' ');
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test098");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test099");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, "");
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = strTokenizer2.getDelimiterMatcher();
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher3);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test100");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setQuoteChar('#');
        java.lang.String str9 = strTokenizer8.nextToken();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4 " + "'", str9.equals("4 "));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test101");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("hi!");
        java.lang.String str2 = strTokenizer1.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer1.reset("hi!");
        java.lang.String str5 = strTokenizer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str5.equals("StrTokenizer[not tokenized yet]"));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test102");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer6.getIgnoredMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test103");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test104");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = strTokenizer1.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher2);
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher2);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test105");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = strTokenizer1.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test106");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterString("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setEmptyTokenAsNull(false);
        java.lang.String str6 = strTokenizer3.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer3.setDelimiterString("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = strTokenizer8.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test107");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = new org.apache.commons.lang3.text.StrTokenizer("hi!");
        java.lang.String str2 = strTokenizer1.getContent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test108");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        java.lang.Object obj4 = strTokenizer3.clone();
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strTokenizer3.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer2.setDelimiterMatcher(strMatcher5);
        boolean boolean7 = strTokenizer2.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = strTokenizer2.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "StrTokenizer[not tokenized yet]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test109");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = strTokenizer2.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test110");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("hi!");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer3.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher4);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer1.setQuoteMatcher(strMatcher4);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer1.setDelimiterString("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strTokenizer1.getQuoteMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test111");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '4');
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strTokenizer7.getIgnoredMatcher();
        java.lang.Object obj9 = strTokenizer7.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj9.toString(), "StrTokenizer[not tokenized yet]");
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test112");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", "hi!");
        boolean boolean3 = strTokenizer2.hasPrevious();
        java.lang.Class<?> wildcardClass4 = strTokenizer2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test113");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("hi!", '4', 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer3.getQuoteMatcher();
        boolean boolean5 = strTokenizer3.hasNext();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer3.reset();
        java.lang.Object obj7 = strTokenizer6.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj7.toString(), "StrTokenizer[not tokenized yet]");
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test114");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test115");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        java.lang.String str9 = strTokenizer8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str9.equals("StrTokenizer[not tokenized yet]"));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test116");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a');
        java.lang.Object obj8 = strTokenizer7.clone();
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strTokenizer7.getTrimmerMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj8.toString(), "StrTokenizer[not tokenized yet]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test117");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = new org.apache.commons.lang3.text.StrTokenizer("hi!", '4', 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strTokenizer4.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher5);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer6.getIgnoredMatcher();
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer6.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test118");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, "");
        java.util.List<java.lang.String> strList3 = strTokenizer2.getTokenList();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer2.setDelimiterString("4 ");
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer2.set("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: set() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test119");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        java.lang.String str6 = strTokenizer5.next();
        java.util.List<java.lang.String> strList7 = strTokenizer5.getTokenList();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = strTokenizer5.setIgnoredChar('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4 " + "'", str6.equals("4 "));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test120");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = new org.apache.commons.lang3.text.StrTokenizer(charArray0);
        java.lang.Class<?> wildcardClass2 = strTokenizer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test121");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = strTokenizer0.setQuoteChar(' ');
        java.lang.String str3 = strTokenizer2.getContent();
        int int4 = strTokenizer2.size();
        boolean boolean5 = strTokenizer2.isEmptyTokenAsNull();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test122");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("");
        boolean boolean2 = strTokenizer1.hasNext();
        boolean boolean3 = strTokenizer1.isEmptyTokenAsNull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = strTokenizer1.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test123");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("", 'a', '4');
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer3.add("StrTokenizer[]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test124");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("hi!");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer3.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher4);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer1.setQuoteMatcher(strMatcher4);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer1.setDelimiterString("StrTokenizer[not tokenized yet]");
        boolean boolean9 = strTokenizer1.hasNext();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test125");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        java.lang.Object obj1 = strTokenizer0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = strTokenizer0.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj1.toString(), "StrTokenizer[not tokenized yet]");
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test126");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        java.lang.String str6 = strTokenizer5.next();
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.reset();
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strTokenizer8.getDelimiterMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4 " + "'", str6.equals("4 "));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test127");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '#');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test128");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("hi!");
        java.lang.String str2 = strTokenizer1.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer1.setIgnoreEmptyTokens(true);
        java.lang.String str5 = strTokenizer1.next();
        boolean boolean6 = strTokenizer1.hasNext();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test129");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", "hi!");
        boolean boolean3 = strTokenizer2.hasNext();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer2.setIgnoreEmptyTokens(false);
        java.lang.String str6 = strTokenizer5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "StrTokenizer[]" + "'", str6.equals("StrTokenizer[]"));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test130");
        char[] charArray5 = new char[] { '4', '#', '#', ' ', 'a' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray5, "4 ");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray5, "4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test131");
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[]", strMatcher1);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer("4 ", strMatcher5);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer2.setIgnoredMatcher(strMatcher5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = strTokenizer7.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test132");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        java.lang.String str1 = strTokenizer0.toString();
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str1.equals("StrTokenizer[not tokenized yet]"));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test133");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        java.lang.String str6 = strTokenizer5.next();
        int int7 = strTokenizer5.previousIndex();
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strTokenizer5.getIgnoredMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4 " + "'", str6.equals("4 "));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test134");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("hi!");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer();
        int int3 = strTokenizer2.previousIndex();
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer2.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer1.setTrimmerMatcher(strMatcher4);
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer5.set("4");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: set() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test135");
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[]", strMatcher1);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer("4 ", strMatcher5);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer2.setIgnoredMatcher(strMatcher5);
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer2.add("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test136");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = strTokenizer1.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("4 ", strMatcher2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setIgnoreEmptyTokens(true);
        boolean boolean6 = strTokenizer5.hasNext();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test137");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, "");
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer8.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test138");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = new org.apache.commons.lang3.text.StrTokenizer("hi!", '4', 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strTokenizer4.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher5);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer6.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = strTokenizer6.setDelimiterString("StrTokenizer[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test139");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("hi!");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = strTokenizer1.reset();
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = strTokenizer2.getQuoteMatcher();
        boolean boolean4 = strTokenizer2.hasNext();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test140");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '#');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test141");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = strTokenizer1.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("4 ", strMatcher2);
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer3.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer3.setIgnoredChar('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test142");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        java.lang.String str7 = strTokenizer5.nextToken();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "4 " + "'", str7.equals("4 "));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test143");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = new org.apache.commons.lang3.text.StrTokenizer("hi!", '4', 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strTokenizer4.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher5);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer6.setDelimiterChar('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test144");
        char[] charArray3 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer(charArray3, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer6.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[]", strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test145");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("hi!", '4', 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer3.getQuoteMatcher();
        boolean boolean5 = strTokenizer3.hasNext();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer3.reset();
        int int7 = strTokenizer3.previousIndex();
        java.lang.String str8 = strTokenizer3.nextToken();
        boolean boolean9 = strTokenizer3.hasPrevious();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test146");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("", 'a', '4');
        boolean boolean4 = strTokenizer3.hasPrevious();
        java.lang.String[] strArray5 = strTokenizer3.getTokenArray();
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer3.getDelimiterMatcher();
        java.lang.String str7 = strTokenizer3.toString();
        java.lang.Object obj8 = strTokenizer3.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "StrTokenizer[]" + "'", str7.equals("StrTokenizer[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj8.toString(), "StrTokenizer[not tokenized yet]");
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test147");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterString("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setEmptyTokenAsNull(false);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer3.setDelimiterChar(' ');
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test148");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterString("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setEmptyTokenAsNull(false);
        int int6 = strTokenizer5.size();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test149");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance();
        java.util.List<java.lang.String> strList1 = strTokenizer0.getTokenList();
        java.lang.String str2 = strTokenizer0.toString();
        boolean boolean3 = strTokenizer0.hasNext();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "StrTokenizer[]" + "'", str2.equals("StrTokenizer[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test150");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strTokenizer0.getTrimmerMatcher();
        boolean boolean2 = strTokenizer0.isEmptyTokenAsNull();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer0.setIgnoredChar('#');
        int int5 = strTokenizer0.size();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test151");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterString("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setEmptyTokenAsNull(false);
        java.lang.String str6 = strTokenizer3.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer3.setDelimiterString("hi!");
        int int9 = strTokenizer3.size();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test152");
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("hi!");
        java.lang.String str4 = strTokenizer3.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer3.setIgnoreEmptyTokens(true);
        java.lang.String str7 = strTokenizer3.previousToken();
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strTokenizer3.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer("hi!", strMatcher1, strMatcher8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test153");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, "");
        java.util.List<java.lang.String> strList3 = strTokenizer2.getTokenList();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer2.setDelimiterString("4 ");
        int int6 = strTokenizer2.nextIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test154");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setQuoteChar('#');
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strTokenizer8.getQuoteMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test155");
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4 ", strMatcher1);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test156");
        char[] charArray5 = new char[] { '4', '#', '#', ' ', 'a' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray5, "4 ");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray5);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test157");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setQuoteChar('#');
        java.util.List<java.lang.String> strList9 = strTokenizer8.getTokenList();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test158");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("hi!");
        java.lang.String str2 = strTokenizer1.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer1.setIgnoreEmptyTokens(true);
        java.lang.String str5 = strTokenizer1.next();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer1.setQuoteChar(' ');
        java.lang.String[] strArray8 = strTokenizer1.getTokenArray();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test159");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("");
        boolean boolean2 = strTokenizer1.hasNext();
        boolean boolean3 = strTokenizer1.isEmptyTokenAsNull();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer1.setDelimiterString("4");
        boolean boolean6 = strTokenizer5.isIgnoreEmptyTokens();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test160");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterString("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setIgnoreEmptyTokens(false);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer5.setIgnoredChar('#');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = strTokenizer7.setIgnoreEmptyTokens(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
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
            System.out.format("%n%s%n", "StrTokenizer0.test161");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("StrTokenizer[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test162");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", "hi!");
        boolean boolean3 = strTokenizer2.hasNext();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer2.setIgnoreEmptyTokens(false);
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test163");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '#');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test164");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = strTokenizer1.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher2);
        java.lang.String[] strArray4 = strTokenizer3.getTokenArray();
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test165");
        char[] charArray3 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer(charArray3, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer6.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[]", strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test166");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[not tokenized yet]", ' ', '4');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setIgnoreEmptyTokens(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test167");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = new org.apache.commons.lang3.text.StrTokenizer("4 ");
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
            System.out.format("%n%s%n", "StrTokenizer0.test168");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("hi!");
        java.lang.String str2 = strTokenizer1.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher5);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer1.setTrimmerMatcher(strMatcher5);
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer7.set("4");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: set() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test169");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterChar('a');
        java.util.List<java.lang.String> strList4 = strTokenizer3.getTokenList();
        boolean boolean5 = strTokenizer3.hasNext();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test170");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a');
        java.lang.Object obj8 = strTokenizer7.clone();
        int int9 = strTokenizer7.size();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj8.toString(), "StrTokenizer[not tokenized yet]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test171");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterString("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setEmptyTokenAsNull(false);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer3.setDelimiterChar(' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = strTokenizer7.reset("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
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
            System.out.format("%n%s%n", "StrTokenizer0.test172");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a');
        boolean boolean8 = strTokenizer7.isIgnoreEmptyTokens();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test173");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        java.lang.Object obj1 = strTokenizer0.clone();
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = strTokenizer0.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer0.setDelimiterChar('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj1.toString(), "StrTokenizer[not tokenized yet]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test174");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("", 'a', '4');
        java.lang.String str4 = strTokenizer3.toString();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer3.setIgnoreEmptyTokens(false);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer3.setDelimiterString("StrTokenizer[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str4.equals("StrTokenizer[not tokenized yet]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test175");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '#');
        int int8 = strTokenizer7.previousIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test176");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("hi!");
        java.lang.String str3 = strTokenizer2.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer2.setIgnoreEmptyTokens(true);
        java.lang.String str6 = strTokenizer2.previousToken();
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer2.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, strMatcher7);
        boolean boolean9 = strTokenizer8.isIgnoreEmptyTokens();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test177");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        java.lang.Object obj1 = strTokenizer0.clone();
        java.lang.String str2 = strTokenizer0.getContent();
        java.lang.String str3 = strTokenizer0.previousToken();
        char[] charArray4 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer0.reset(charArray4);
        int int6 = strTokenizer5.size();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj1.toString(), "StrTokenizer[not tokenized yet]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test178");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterString("");
        java.lang.String[] strArray4 = strTokenizer3.getTokenArray();
        int int5 = strTokenizer3.nextIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test179");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        java.lang.String str6 = strTokenizer5.next();
        int int7 = strTokenizer5.previousIndex();
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strTokenizer5.getQuoteMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4 " + "'", str6.equals("4 "));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test180");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("hi!");
        java.lang.String str2 = strTokenizer1.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer1.setIgnoreEmptyTokens(true);
        java.lang.String str5 = strTokenizer4.getContent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test181");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        java.lang.String str6 = strTokenizer5.next();
        java.lang.Object obj7 = strTokenizer5.clone();
        int int8 = strTokenizer5.nextIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4 " + "'", str6.equals("4 "));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj7.toString(), "StrTokenizer[not tokenized yet]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test182");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        int int7 = strTokenizer6.nextIndex();
        java.lang.String str8 = strTokenizer6.nextToken();
        boolean boolean9 = strTokenizer6.hasPrevious();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4" + "'", str8.equals("4"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test183");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        java.lang.Object obj7 = strTokenizer6.clone();
        java.lang.Class<?> wildcardClass8 = strTokenizer6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj7.toString(), "StrTokenizer[not tokenized yet]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test184");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterString("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setEmptyTokenAsNull(false);
        java.lang.String str6 = strTokenizer5.getContent();
        java.lang.String str7 = strTokenizer5.nextToken();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test185");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("hi!");
        java.lang.String str2 = strTokenizer1.getContent();
        boolean boolean3 = strTokenizer1.isEmptyTokenAsNull();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test186");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, "");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, "4 ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test187");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        java.lang.String str6 = strTokenizer5.next();
        int int7 = strTokenizer5.previousIndex();
        java.lang.Object obj8 = strTokenizer5.clone();
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strTokenizer5.getIgnoredMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4 " + "'", str6.equals("4 "));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj8.toString(), "StrTokenizer[not tokenized yet]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test188");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterString("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setIgnoreEmptyTokens(false);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer5.setIgnoredChar('#');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = strTokenizer5.setDelimiterString("StrTokenizer[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
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
            System.out.format("%n%s%n", "StrTokenizer0.test189");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, "");
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = strTokenizer2.getDelimiterMatcher();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = strTokenizer2.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher3);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test190");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = strTokenizer0.reset("");
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer0.set("StrTokenizer[not tokenized yet]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: set() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer2);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test191");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, ' ', '#');
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test192");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("hi!");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = strTokenizer1.reset();
        int int3 = strTokenizer2.size();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test193");
        char[] charArray5 = new char[] { '4', '#', '#', ' ', 'a' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray5, "4 ");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray5);
        boolean boolean9 = strTokenizer8.isEmptyTokenAsNull();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test194");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterString("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setEmptyTokenAsNull(false);
        java.lang.String str6 = strTokenizer3.getContent();
        int int7 = strTokenizer3.size();
        boolean boolean8 = strTokenizer3.hasNext();
        boolean boolean9 = strTokenizer3.isIgnoreEmptyTokens();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test195");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("4");
        int int2 = strTokenizer1.nextIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test196");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '4');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strTokenizer8.getQuoteMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test197");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("", 'a', '4');
        boolean boolean4 = strTokenizer3.hasPrevious();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer3.setIgnoredChar('4');
        java.lang.String[] strArray7 = strTokenizer6.getTokenArray();
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer6.set("StrTokenizer[not tokenized yet]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: set() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test198");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("hi!");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = strTokenizer1.reset();
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer2.set("StrTokenizer[]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: set() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer2);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test199");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4", '4');
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test200");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = strTokenizer1.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer("hi!", '4', 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer6.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher2, strMatcher7);
        boolean boolean9 = strTokenizer8.hasPrevious();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test201");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[not tokenized yet]", ' ', '4');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer4.setDelimiterString("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer4.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[]", strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test202");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = strTokenizer0.setQuoteChar(' ');
        java.util.List<java.lang.String> strList3 = strTokenizer2.getTokenList();
        int int4 = strTokenizer2.size();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test203");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterString("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setIgnoreEmptyTokens(false);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer5.setIgnoredChar('#');
        java.lang.String str8 = strTokenizer5.previousToken();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test204");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '#');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test205");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[]", '#', '4');
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test206");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        java.lang.String str6 = strTokenizer5.next();
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.reset();
        java.lang.String str9 = strTokenizer8.next();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4 " + "'", str6.equals("4 "));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4 " + "'", str9.equals("4 "));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test207");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = strTokenizer0.setQuoteChar(' ');
        boolean boolean3 = strTokenizer2.hasPrevious();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer2.setDelimiterChar(' ');
        java.lang.String str6 = strTokenizer2.getContent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test208");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("hi!");
        java.lang.String str3 = strTokenizer2.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer2.setIgnoreEmptyTokens(true);
        java.lang.String str6 = strTokenizer2.previousToken();
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer2.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[not tokenized yet]", strMatcher7);
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strTokenizer8.getQuoteMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test209");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance();
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer0.set("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: set() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test210");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4", "StrTokenizer[]");
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test211");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        java.lang.String str9 = strTokenizer8.previousToken();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test212");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance();
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer0.add("4 ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test213");
        char[] charArray0 = new char[] {};
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, 'a', '#');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, '#');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test214");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance();
        java.lang.String str1 = strTokenizer0.getContent();
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
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test215");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("hi!");
        java.lang.String str2 = strTokenizer1.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer1.setIgnoreEmptyTokens(true);
        java.lang.String str5 = strTokenizer1.previousToken();
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer1.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer1.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = strTokenizer1.reset("StrTokenizer[not tokenized yet]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test216");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4 ", 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer2.setDelimiterString("StrTokenizer[]");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer2.setIgnoreEmptyTokens(true);
        boolean boolean7 = strTokenizer6.isIgnoreEmptyTokens();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test217");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[not tokenized yet]", "StrTokenizer[not tokenized yet]");
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test218");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("StrTokenizer[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test219");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterString("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setIgnoreEmptyTokens(false);
        java.lang.String str6 = strTokenizer5.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setQuoteChar('#');
        java.lang.String str9 = strTokenizer5.getContent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test220");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("hi!");
        boolean boolean2 = strTokenizer1.isEmptyTokenAsNull();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.reset();
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer3.getDelimiterMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher4);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test221");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        java.lang.String str6 = strTokenizer5.next();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer5.reset();
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer7.add("StrTokenizer[]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4 " + "'", str6.equals("4 "));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test222");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4 ", 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer2.setDelimiterString("StrTokenizer[]");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer4.setDelimiterChar('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test223");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = new org.apache.commons.lang3.text.StrTokenizer();
        int int1 = strTokenizer0.previousIndex();
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = strTokenizer0.getQuoteMatcher();
        java.lang.Class<?> wildcardClass3 = strMatcher2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test224");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        java.lang.Object obj4 = strTokenizer3.clone();
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strTokenizer3.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer2.setDelimiterMatcher(strMatcher5);
        boolean boolean7 = strTokenizer2.hasNext();
        java.lang.Class<?> wildcardClass8 = strTokenizer2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "StrTokenizer[not tokenized yet]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test225");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("hi!", '#', '4');
        java.util.List<java.lang.String> strList4 = strTokenizer3.getTokenList();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("hi!");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer6.reset();
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strTokenizer7.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = strTokenizer3.setIgnoredMatcher(strMatcher8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
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
            System.out.format("%n%s%n", "StrTokenizer0.test226");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = new org.apache.commons.lang3.text.StrTokenizer();
        java.lang.Class<?> wildcardClass1 = strTokenizer0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test227");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer("hi!", '4', 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher6);
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strTokenizer7.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, strMatcher8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test228");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("hi!");
        java.lang.Class<?> wildcardClass2 = strTokenizer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test229");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("");
        boolean boolean2 = strTokenizer1.hasNext();
        boolean boolean3 = strTokenizer1.isEmptyTokenAsNull();
        java.lang.Object obj4 = strTokenizer1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "StrTokenizer[not tokenized yet]");
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test230");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strTokenizer0.getTrimmerMatcher();
        boolean boolean2 = strTokenizer0.isEmptyTokenAsNull();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer0.setIgnoredChar('#');
        boolean boolean5 = strTokenizer4.isIgnoreEmptyTokens();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test231");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("hi!", "4");
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test232");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test233");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, '4', 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.reset("");
        int int6 = strTokenizer3.previousIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test234");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = strTokenizer0.setQuoteChar(' ');
        boolean boolean3 = strTokenizer0.isIgnoreEmptyTokens();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test235");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '#');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test236");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance();
        java.lang.String str1 = strTokenizer0.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer0.setIgnoredChar('#');
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setIgnoredMatcher(strMatcher4);
        int int6 = strTokenizer5.nextIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test237");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("hi!", '4', 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer3.getQuoteMatcher();
        boolean boolean5 = strTokenizer3.hasNext();
        boolean boolean6 = strTokenizer3.hasNext();
        boolean boolean7 = strTokenizer3.isEmptyTokenAsNull();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test238");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        java.lang.Class<?> wildcardClass8 = charArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test239");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setIgnoredChar('#');
        java.lang.String str9 = strTokenizer8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str9.equals("StrTokenizer[not tokenized yet]"));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test240");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[not tokenized yet]", ' ', '4');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setDelimiterString("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer3.reset();
        int int7 = strTokenizer3.nextIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test241");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("hi!");
        java.lang.String str2 = strTokenizer1.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer1.reset("hi!");
        java.lang.Object obj5 = strTokenizer1.clone();
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer1.add("StrTokenizer[not tokenized yet]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "StrTokenizer[not tokenized yet]");
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test242");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = new org.apache.commons.lang3.text.StrTokenizer();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = strTokenizer0.setDelimiterString("StrTokenizer[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer2);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test243");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance();
        java.lang.String str1 = strTokenizer0.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer0.setIgnoredChar('#');
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer3.set("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: set() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test244");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterString("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setIgnoreEmptyTokens(false);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer5.setIgnoredChar('#');
        java.lang.String[] strArray8 = strTokenizer5.getTokenArray();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test245");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '4', 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test246");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getQuoteMatcher();
        boolean boolean7 = strTokenizer5.hasPrevious();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test247");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("hi!");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer3.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher4);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer1.setQuoteMatcher(strMatcher4);
        java.lang.String str7 = strTokenizer6.previousToken();
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strTokenizer6.getTrimmerMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test248");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("hi!", '4', 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer3.getQuoteMatcher();
        boolean boolean5 = strTokenizer3.hasNext();
        boolean boolean6 = strTokenizer3.hasNext();
        int int7 = strTokenizer3.nextIndex();
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strTokenizer3.getDelimiterMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test249");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("", 'a', '4');
        java.lang.String str4 = strTokenizer3.toString();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer3.setIgnoreEmptyTokens(false);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer6.setIgnoreEmptyTokens(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str4.equals("StrTokenizer[not tokenized yet]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test250");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[]", "hi!");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer2.reset("4 ");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer("4 ", "4 ");
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strTokenizer7.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = strTokenizer2.setIgnoredMatcher(strMatcher8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test251");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a');
        java.lang.String str9 = strTokenizer8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str9.equals("StrTokenizer[not tokenized yet]"));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test252");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        java.lang.String str1 = strTokenizer0.toString();
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = strTokenizer0.getIgnoredMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str1.equals("StrTokenizer[not tokenized yet]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher2);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test253");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer6.getDelimiterMatcher();
        boolean boolean8 = strTokenizer6.isEmptyTokenAsNull();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test254");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        java.lang.Object obj1 = strTokenizer0.clone();
        java.lang.String str2 = strTokenizer0.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = strTokenizer0.getQuoteMatcher();
        java.lang.String str4 = strTokenizer0.getContent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj1.toString(), "StrTokenizer[not tokenized yet]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test255");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        java.lang.Class<?> wildcardClass7 = strMatcher6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test256");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        java.lang.Object obj1 = strTokenizer0.clone();
        java.lang.String[] strArray2 = strTokenizer0.getTokenArray();
        int int3 = strTokenizer0.nextIndex();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj1.toString(), "StrTokenizer[not tokenized yet]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test257");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[]", 'a', 'a');
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test258");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4 ", '#');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer("hi!", '4', 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer6.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer2.setTrimmerMatcher(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test259");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strTokenizer7.getTrimmerMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test260");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("hi!");
        java.lang.String str2 = strTokenizer1.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer1.setIgnoreEmptyTokens(true);
        java.lang.String str5 = strTokenizer1.previousToken();
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer1.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer1.getIgnoredMatcher();
        boolean boolean8 = strTokenizer1.hasNext();
        boolean boolean9 = strTokenizer1.hasNext();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test261");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("hi!");
        java.lang.String str2 = strTokenizer1.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer1.setIgnoreEmptyTokens(true);
        java.lang.String str5 = strTokenizer1.next();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer1.setEmptyTokenAsNull(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test262");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("");
        boolean boolean2 = strTokenizer1.hasNext();
        boolean boolean3 = strTokenizer1.isEmptyTokenAsNull();
        java.lang.Class<?> wildcardClass4 = strTokenizer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test263");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("hi!");
        java.lang.String str2 = strTokenizer1.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer1.setIgnoreEmptyTokens(true);
        java.lang.String str5 = strTokenizer1.next();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer1.setQuoteChar(' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = strTokenizer7.setEmptyTokenAsNull(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test264");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray0);
        java.lang.Class<?> wildcardClass2 = strTokenizer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test265");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("4 ");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setIgnoredChar('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer1.getDelimiterMatcher();
        int int5 = strTokenizer1.nextIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test266");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", ' ');
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test267");
        char[] charArray3 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer(charArray3, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer6.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test268");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("", 'a', '4');
        boolean boolean4 = strTokenizer3.hasPrevious();
        java.lang.String[] strArray5 = strTokenizer3.getTokenArray();
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer3.getDelimiterMatcher();
        boolean boolean7 = strTokenizer3.isEmptyTokenAsNull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = strTokenizer3.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test269");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, '4', 'a');
        java.lang.String str4 = strTokenizer3.nextToken();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test270");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        java.lang.Object obj4 = strTokenizer3.clone();
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strTokenizer3.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer2.setDelimiterMatcher(strMatcher5);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer6.getTrimmerMatcher();
        java.lang.String str8 = strTokenizer6.toString();
        java.lang.Class<?> wildcardClass9 = strTokenizer6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "StrTokenizer[not tokenized yet]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str8.equals("StrTokenizer[not tokenized yet]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test271");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", "hi!");
        boolean boolean3 = strTokenizer2.hasNext();
        boolean boolean4 = strTokenizer2.isEmptyTokenAsNull();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer2.setIgnoreEmptyTokens(false);
        java.lang.String[] strArray7 = strTokenizer2.getTokenArray();
        java.lang.String str8 = strTokenizer2.previousToken();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test272");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("hi!");
        java.lang.String str2 = strTokenizer1.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer1.setIgnoreEmptyTokens(true);
        java.lang.String str5 = strTokenizer1.next();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer1.setQuoteChar(' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = strTokenizer1.setQuoteChar('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test273");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[not tokenized yet]", ' ', '4');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setDelimiterString("StrTokenizer[not tokenized yet]");
        boolean boolean6 = strTokenizer3.hasNext();
        java.lang.Object obj7 = strTokenizer3.clone();
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strTokenizer3.getIgnoredMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj7.toString(), "StrTokenizer[not tokenized yet]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test274");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, "");
        int int8 = strTokenizer7.size();
        int int9 = strTokenizer7.previousIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test275");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '4');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test276");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strTokenizer0.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer0.setDelimiterString("");
        boolean boolean4 = strTokenizer3.hasPrevious();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test277");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        java.lang.Object obj1 = strTokenizer0.clone();
        java.lang.String[] strArray2 = strTokenizer0.getTokenArray();
        int int3 = strTokenizer0.nextIndex();
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj1.toString(), "StrTokenizer[not tokenized yet]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test278");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterString("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setEmptyTokenAsNull(false);
        boolean boolean6 = strTokenizer5.hasPrevious();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test279");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("hi!", "");
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer3.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[]", strMatcher4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher4);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test280");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        java.lang.Object obj1 = strTokenizer0.clone();
        java.lang.String[] strArray2 = strTokenizer0.getTokenArray();
        int int3 = strTokenizer0.nextIndex();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer0.setQuoteChar(' ');
        boolean boolean6 = strTokenizer5.hasNext();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj1.toString(), "StrTokenizer[not tokenized yet]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test281");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("hi!", '#', '4');
        java.util.List<java.lang.String> strList4 = strTokenizer3.getTokenList();
        java.lang.Class<?> wildcardClass5 = strList4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test282");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = strTokenizer2.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer1.setIgnoredMatcher(strMatcher3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test283");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = new org.apache.commons.lang3.text.StrTokenizer(charArray0);
        boolean boolean2 = strTokenizer1.isEmptyTokenAsNull();
        boolean boolean3 = strTokenizer1.hasPrevious();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test284");
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[]", strMatcher1);
        java.lang.String[] strArray3 = strTokenizer2.getTokenArray();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test285");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4 ", 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer2.setDelimiterString("StrTokenizer[]");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer4.setQuoteChar('4');
        int int7 = strTokenizer4.size();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test286");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("", 'a', '4');
        java.lang.String str4 = strTokenizer3.toString();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.reset();
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str4.equals("StrTokenizer[not tokenized yet]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test287");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", '#');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer2.setDelimiterString("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test288");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        java.lang.Object obj1 = strTokenizer0.clone();
        java.lang.String[] strArray2 = strTokenizer0.getTokenArray();
        int int3 = strTokenizer0.nextIndex();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer0.setQuoteChar(' ');
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj1.toString(), "StrTokenizer[not tokenized yet]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test289");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strTokenizer0.getIgnoredMatcher();
        boolean boolean2 = strTokenizer0.isEmptyTokenAsNull();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test290");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        boolean boolean2 = strTokenizer1.isIgnoreEmptyTokens();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test291");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("hi!");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer3.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher4);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer1.setQuoteMatcher(strMatcher4);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer1.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test292");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[not tokenized yet]", ' ', '4');
        boolean boolean4 = strTokenizer3.isIgnoreEmptyTokens();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test293");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterString("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer("hi!", '4', 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strTokenizer7.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = strTokenizer3.setQuoteMatcher(strMatcher8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test294");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        java.lang.String str6 = strTokenizer5.next();
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setIgnoredMatcher(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4 " + "'", str6.equals("4 "));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test295");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("4", '#', '4');
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test296");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("hi!", '4', 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer3.getQuoteMatcher();
        boolean boolean5 = strTokenizer3.hasNext();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer3.reset();
        java.lang.String str7 = strTokenizer6.toString();
        boolean boolean8 = strTokenizer6.hasPrevious();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str7.equals("StrTokenizer[not tokenized yet]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test297");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, '4', 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.reset("");
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getDelimiterMatcher();
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer5.set("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: set() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test298");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer5.getQuoteMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strTokenizer5.getTrimmerMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test299");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4 ", 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer2.setDelimiterString("StrTokenizer[]");
        java.lang.String str5 = strTokenizer2.next();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4 " + "'", str5.equals("4 "));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test300");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        boolean boolean6 = strTokenizer5.hasPrevious();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setQuoteChar('a');
        int int9 = strTokenizer5.nextIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test301");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        java.lang.Object obj4 = strTokenizer3.clone();
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strTokenizer3.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer2.setDelimiterMatcher(strMatcher5);
        boolean boolean7 = strTokenizer6.isEmptyTokenAsNull();
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strTokenizer6.getDelimiterMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "StrTokenizer[not tokenized yet]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test302");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("hi!");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterString("4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test303");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, '4', 'a');
        int int4 = strTokenizer3.previousIndex();
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer3.set("StrTokenizer[not tokenized yet]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: set() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test304");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4 ", "4 ");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer2.reset("hi!");
        boolean boolean5 = strTokenizer2.isIgnoreEmptyTokens();
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer2.set("StrTokenizer[not tokenized yet]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: set() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test305");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterString("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer1.reset();
        java.lang.String str5 = strTokenizer1.previousToken();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test306");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("hi!", '4', 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer3.getQuoteMatcher();
        boolean boolean5 = strTokenizer3.hasNext();
        boolean boolean6 = strTokenizer3.hasNext();
        int int7 = strTokenizer3.nextIndex();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer3.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test307");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", "StrTokenizer[not tokenized yet]");
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test308");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        java.lang.Object obj1 = strTokenizer0.clone();
        java.lang.String[] strArray2 = strTokenizer0.getTokenArray();
        int int3 = strTokenizer0.nextIndex();
        java.lang.Object obj4 = strTokenizer0.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj1.toString(), "StrTokenizer[not tokenized yet]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "StrTokenizer[not tokenized yet]");
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test309");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[]");
        java.lang.Object obj2 = strTokenizer1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj2.toString(), "StrTokenizer[not tokenized yet]");
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test310");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterString("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setIgnoreEmptyTokens(false);
        java.lang.String str6 = strTokenizer3.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer3.getTrimmerMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test311");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("", 'a', '#');
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test312");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", "hi!");
        boolean boolean3 = strTokenizer2.hasNext();
        boolean boolean4 = strTokenizer2.isEmptyTokenAsNull();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer2.setIgnoreEmptyTokens(false);
        java.lang.String str7 = strTokenizer2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "StrTokenizer[]" + "'", str7.equals("StrTokenizer[]"));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test313");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4", "hi!");
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test314");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[not tokenized yet]", ' ', '4');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setDelimiterString("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer3.reset();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer3.reset("StrTokenizer[not tokenized yet]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test315");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", '#');
        java.lang.String str3 = strTokenizer2.getContent();
        boolean boolean4 = strTokenizer2.isIgnoreEmptyTokens();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer2.reset("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test316");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4 ", '#');
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = strTokenizer2.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer2.getIgnoredMatcher();
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer2.set("StrTokenizer[not tokenized yet]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: set() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher4);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test317");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("");
        boolean boolean2 = strTokenizer1.hasNext();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer1.setIgnoreEmptyTokens(true);
        boolean boolean5 = strTokenizer1.isEmptyTokenAsNull();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer1.setDelimiterString("4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test318");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        java.lang.String str6 = strTokenizer5.next();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer5.reset();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = strTokenizer5.setDelimiterChar('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4 " + "'", str6.equals("4 "));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test319");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getIgnoredMatcher();
        boolean boolean7 = strTokenizer5.isEmptyTokenAsNull();
        java.lang.String str8 = strTokenizer5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str8.equals("StrTokenizer[not tokenized yet]"));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test320");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        java.lang.String str1 = strTokenizer0.previousToken();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = strTokenizer2.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer2.setDelimiterString("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer6.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer2.setDelimiterMatcher(strMatcher7);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = strTokenizer0.setDelimiterMatcher(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test321");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4", ' ');
        java.lang.String str3 = strTokenizer2.toString();
        boolean boolean4 = strTokenizer2.hasNext();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer2.setDelimiterString("4 ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str3.equals("StrTokenizer[not tokenized yet]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test322");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", "4 ");
        java.lang.Class<?> wildcardClass3 = strTokenizer2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test323");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4 ", 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer2.setDelimiterString("StrTokenizer[]");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer2.setIgnoreEmptyTokens(true);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer2.reset();
        java.lang.String[] strArray8 = strTokenizer2.getTokenArray();
        java.lang.String str9 = strTokenizer2.previousToken();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test324");
        char[] charArray0 = new char[] {};
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, 'a', '#');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, '#');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, "4 ");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test325");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("hi!");
        boolean boolean2 = strTokenizer1.isEmptyTokenAsNull();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.reset();
        boolean boolean4 = strTokenizer1.hasPrevious();
        java.util.List<java.lang.String> strList5 = strTokenizer1.getTokenList();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test326");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = strTokenizer7.setDelimiterChar(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test327");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, '#', ' ');
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test328");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, '4', 'a');
        int int4 = strTokenizer3.previousIndex();
        java.lang.String str5 = strTokenizer3.toString();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer3.reset("4");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = strTokenizer3.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str5.equals("StrTokenizer[not tokenized yet]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test329");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("4 ", ' ', 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setDelimiterString("StrTokenizer[not tokenized yet]");
        boolean boolean6 = strTokenizer3.hasPrevious();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test330");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = new org.apache.commons.lang3.text.StrTokenizer();
        int int1 = strTokenizer0.previousIndex();
        java.lang.String str2 = strTokenizer0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str2.equals("StrTokenizer[not tokenized yet]"));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test331");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("hi!", ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer2.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test332");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strTokenizer0.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer0.setDelimiterString("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strTokenizer4.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer0.setDelimiterMatcher(strMatcher5);
        java.lang.Class<?> wildcardClass7 = strTokenizer6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test333");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", "StrTokenizer[]");
        java.lang.Class<?> wildcardClass3 = strTokenizer2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test334");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = new org.apache.commons.lang3.text.StrTokenizer();
        int int1 = strTokenizer0.previousIndex();
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = strTokenizer0.getQuoteMatcher();
        boolean boolean3 = strTokenizer0.hasNext();
        int int4 = strTokenizer0.nextIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test335");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, '4', 'a');
        int int4 = strTokenizer3.previousIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = strTokenizer3.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test336");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", "hi!");
        boolean boolean3 = strTokenizer2.hasNext();
        boolean boolean4 = strTokenizer2.isEmptyTokenAsNull();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer2.setIgnoreEmptyTokens(false);
        java.lang.String str7 = strTokenizer2.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = strTokenizer2.setEmptyTokenAsNull(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test337");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        java.lang.Object obj4 = strTokenizer3.clone();
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strTokenizer3.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer2.setDelimiterMatcher(strMatcher5);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer6.getTrimmerMatcher();
        java.lang.String str8 = strTokenizer6.toString();
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strTokenizer6.getQuoteMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "StrTokenizer[not tokenized yet]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str8.equals("StrTokenizer[not tokenized yet]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test338");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("hi!", '4', 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer3.getQuoteMatcher();
        boolean boolean5 = strTokenizer3.hasNext();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer3.reset();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer6.setIgnoreEmptyTokens(true);
        java.lang.String str9 = strTokenizer6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str9.equals("StrTokenizer[not tokenized yet]"));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test339");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterString("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer1.reset();
        boolean boolean5 = strTokenizer1.hasPrevious();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test340");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("4");
        int int2 = strTokenizer1.nextIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test341");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer("hi!", '4', 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher6);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher6);
        java.lang.Object obj9 = strTokenizer8.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj9.toString(), "StrTokenizer[not tokenized yet]");
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test342");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        int int7 = strTokenizer6.nextIndex();
        java.lang.String str8 = strTokenizer6.nextToken();
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strTokenizer6.getTrimmerMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4" + "'", str8.equals("4"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test343");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[not tokenized yet]", ' ', '4');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setDelimiterString("StrTokenizer[not tokenized yet]");
        boolean boolean6 = strTokenizer3.hasNext();
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer3.getQuoteMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test344");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, '#');
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test345");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strTokenizer0.getIgnoredMatcher();
        int int2 = strTokenizer0.previousIndex();
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = strTokenizer0.getIgnoredMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher3);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test346");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setEmptyTokenAsNull(false);
        boolean boolean4 = strTokenizer3.hasNext();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test347");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = new org.apache.commons.lang3.text.StrTokenizer("hi!", '4', 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strTokenizer4.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher5);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer6.getIgnoredMatcher();
        boolean boolean8 = strTokenizer6.isEmptyTokenAsNull();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test348");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("hi!");
        java.lang.String str3 = strTokenizer2.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer2.setIgnoreEmptyTokens(true);
        java.lang.String str6 = strTokenizer2.previousToken();
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer2.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer("4 ", strMatcher7);
        java.lang.String str9 = strTokenizer8.previousToken();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test349");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", "hi!");
        boolean boolean3 = strTokenizer2.hasNext();
        java.lang.String[] strArray4 = strTokenizer2.getTokenArray();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test350");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        boolean boolean6 = strTokenizer5.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer5.set("4 ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: set() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test351");
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher1);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer2.setDelimiterChar('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test352");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4 ", 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer2.setDelimiterString("StrTokenizer[]");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer2.setIgnoreEmptyTokens(true);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer2.reset();
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strTokenizer2.getDelimiterMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test353");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance();
        java.lang.String str1 = strTokenizer0.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer0.setIgnoredChar('#');
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setIgnoredMatcher(strMatcher4);
        int int6 = strTokenizer5.size();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test354");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strTokenizer0.getDelimiterMatcher();
        java.lang.String str2 = strTokenizer0.toString();
        java.lang.String str3 = strTokenizer0.toString();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer0.reset("hi!");
        java.lang.String str6 = strTokenizer0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str2.equals("StrTokenizer[not tokenized yet]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str3.equals("StrTokenizer[not tokenized yet]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str6.equals("StrTokenizer[not tokenized yet]"));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test355");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        java.lang.Object obj1 = strTokenizer0.clone();
        java.lang.String str2 = strTokenizer0.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = strTokenizer0.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer0.setIgnoredChar('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj1.toString(), "StrTokenizer[not tokenized yet]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test356");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = new org.apache.commons.lang3.text.StrTokenizer();
        int int1 = strTokenizer0.previousIndex();
        java.util.List<java.lang.String> strList2 = strTokenizer0.getTokenList();
        java.lang.Object obj3 = strTokenizer0.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj3.toString(), "StrTokenizer[not tokenized yet]");
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test357");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("hi!");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = strTokenizer1.reset();
        java.lang.String str3 = strTokenizer2.toString();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer2.reset();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer4.setEmptyTokenAsNull(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str3.equals("StrTokenizer[not tokenized yet]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test358");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '4');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test359");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", '#');
        java.lang.String str3 = strTokenizer2.getContent();
        boolean boolean4 = strTokenizer2.isIgnoreEmptyTokens();
        java.lang.String str5 = strTokenizer2.previousToken();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer2.setDelimiterString("");
        boolean boolean8 = strTokenizer7.isEmptyTokenAsNull();
        java.lang.String str9 = strTokenizer7.nextToken();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test360");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = new org.apache.commons.lang3.text.StrTokenizer("hi!", '4', 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strTokenizer4.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher5);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer6.getIgnoredMatcher();
        boolean boolean8 = strTokenizer6.hasPrevious();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test361");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = strTokenizer1.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("4 ", strMatcher2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setIgnoreEmptyTokens(true);
        java.lang.Object obj6 = strTokenizer5.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj6.toString(), "StrTokenizer[not tokenized yet]");
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test362");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterString("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setEmptyTokenAsNull(false);
        java.lang.String str6 = strTokenizer5.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setDelimiterChar(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test363");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterChar('a');
        boolean boolean4 = strTokenizer1.hasNext();
        int int5 = strTokenizer1.nextIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test364");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test365");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("hi!");
        java.lang.String str2 = strTokenizer1.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer1.reset("hi!");
        int int5 = strTokenizer4.previousIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test366");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("hi!");
        boolean boolean2 = strTokenizer1.isEmptyTokenAsNull();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.reset();
        java.lang.String str4 = strTokenizer3.previousToken();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer6.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer("4", strMatcher7);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = strTokenizer3.setTrimmerMatcher(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test367");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        java.lang.Class<?> wildcardClass9 = charArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test368");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4 ", '4');
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test369");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        int int7 = strTokenizer6.size();
        boolean boolean8 = strTokenizer6.hasPrevious();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test370");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = strTokenizer0.setQuoteChar(' ');
        java.lang.String str3 = strTokenizer2.getContent();
        int int4 = strTokenizer2.size();
        java.util.List<java.lang.String> strList5 = strTokenizer2.getTokenList();
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer2.add("4 ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test371");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strTokenizer7.getIgnoredMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test372");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterString("");
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test373");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("", 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        java.lang.Object obj5 = strTokenizer4.clone();
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer4.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer3.setDelimiterMatcher(strMatcher6);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer("hi!", strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "StrTokenizer[not tokenized yet]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test374");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("hi!");
        java.lang.String str2 = strTokenizer1.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer1.setIgnoreEmptyTokens(true);
        java.lang.String str5 = strTokenizer1.previousToken();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer1.reset();
        boolean boolean7 = strTokenizer1.hasNext();
        java.lang.String str8 = strTokenizer1.next();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test375");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[]", "hi!");
        int int3 = strTokenizer2.size();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test376");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = strTokenizer1.reset();
        java.lang.Object obj3 = strTokenizer2.clone();
        java.lang.String[] strArray4 = strTokenizer2.getTokenArray();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj3.toString(), "StrTokenizer[not tokenized yet]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test377");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("4 ");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setIgnoredChar('a');
        boolean boolean4 = strTokenizer1.hasNext();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test378");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4", ' ');
        java.lang.String str3 = strTokenizer2.toString();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer2.reset("hi!");
        java.util.List<java.lang.String> strList6 = strTokenizer2.getTokenList();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str3.equals("StrTokenizer[not tokenized yet]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test379");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, "");
        int int8 = strTokenizer7.size();
        java.lang.String str9 = strTokenizer7.next();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4 " + "'", str9.equals("4 "));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test380");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        java.lang.Object obj4 = strTokenizer3.clone();
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strTokenizer3.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer2.setDelimiterMatcher(strMatcher5);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer6.getTrimmerMatcher();
        java.lang.String str8 = strTokenizer6.toString();
        java.lang.String str9 = strTokenizer6.getContent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "StrTokenizer[not tokenized yet]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str8.equals("StrTokenizer[not tokenized yet]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test381");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        java.lang.String[] strArray2 = strTokenizer1.getTokenArray();
        boolean boolean3 = strTokenizer1.isEmptyTokenAsNull();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test382");
        char[] charArray0 = new char[] {};
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, 'a', '#');
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test383");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = strTokenizer0.reset("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer2.setDelimiterString("4 ");
        java.lang.String str5 = strTokenizer2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str5.equals("StrTokenizer[not tokenized yet]"));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test384");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("hi!", '#', 'a');
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test385");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer6.getDelimiterMatcher();
        java.lang.String str8 = strTokenizer6.nextToken();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4" + "'", str8.equals("4"));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test386");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("");
        boolean boolean2 = strTokenizer1.hasNext();
        boolean boolean3 = strTokenizer1.isEmptyTokenAsNull();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer1.setDelimiterString("4");
        java.util.List<java.lang.String> strList6 = strTokenizer1.getTokenList();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer1.reset("StrTokenizer[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test387");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("");
        boolean boolean2 = strTokenizer1.hasNext();
        boolean boolean3 = strTokenizer1.isEmptyTokenAsNull();
        boolean boolean4 = strTokenizer1.isEmptyTokenAsNull();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer1.reset("StrTokenizer[not tokenized yet]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test388");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        java.lang.Object obj1 = strTokenizer0.clone();
        int int2 = strTokenizer0.previousIndex();
        boolean boolean3 = strTokenizer0.isIgnoreEmptyTokens();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = new org.apache.commons.lang3.text.StrTokenizer();
        int int5 = strTokenizer4.previousIndex();
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer4.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer0.setIgnoredMatcher(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj1.toString(), "StrTokenizer[not tokenized yet]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test389");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("4");
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test390");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4", ' ');
        java.lang.String str3 = strTokenizer2.nextToken();
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer2.getQuoteMatcher();
        int int5 = strTokenizer2.previousIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4" + "'", str3.equals("4"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test391");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", '#');
        java.lang.String str3 = strTokenizer2.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer2.setDelimiterString("4 ");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer2.reset("4 ");
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer2.add("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test392");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = strTokenizer1.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("4 ", strMatcher2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer("4", strMatcher6);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer3.setQuoteMatcher(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test393");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[not tokenized yet]", ' ');
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test394");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterString("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setIgnoreEmptyTokens(false);
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer3.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer3.reset("StrTokenizer[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test395");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        java.lang.Object obj1 = strTokenizer0.clone();
        java.lang.String[] strArray2 = strTokenizer0.getTokenArray();
        int int3 = strTokenizer0.nextIndex();
        java.util.List<java.lang.String> strList4 = strTokenizer0.getTokenList();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer0.setDelimiterChar(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj1.toString(), "StrTokenizer[not tokenized yet]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test396");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("hi!", ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = strTokenizer2.getTrimmerMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher3);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test397");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[not tokenized yet]", '#');
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test398");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("");
        boolean boolean2 = strTokenizer1.hasNext();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer1.setIgnoreEmptyTokens(true);
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer1.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test399");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, '4', 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.reset("");
        java.lang.String[] strArray6 = strTokenizer3.getTokenArray();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test400");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4 ", 'a');
        boolean boolean3 = strTokenizer2.hasPrevious();
        java.lang.Object obj4 = strTokenizer2.clone();
        boolean boolean5 = strTokenizer2.isEmptyTokenAsNull();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "StrTokenizer[not tokenized yet]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test401");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test402");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("", 'a', '4');
        java.lang.String str4 = strTokenizer3.nextToken();
        java.lang.String str5 = strTokenizer3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "StrTokenizer[]" + "'", str5.equals("StrTokenizer[]"));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test403");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterString("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setIgnoreEmptyTokens(false);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer5.setQuoteChar('a');
        char[] charArray8 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = strTokenizer7.reset(charArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
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
            System.out.format("%n%s%n", "StrTokenizer0.test404");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        int int7 = strTokenizer6.nextIndex();
        boolean boolean8 = strTokenizer6.hasNext();
        java.lang.String str9 = strTokenizer6.previousToken();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test405");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[not tokenized yet]", "4 ");
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test406");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", '#');
        java.lang.String str3 = strTokenizer2.getContent();
        boolean boolean4 = strTokenizer2.isIgnoreEmptyTokens();
        java.lang.String str5 = strTokenizer2.previousToken();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer2.setDelimiterString("");
        boolean boolean8 = strTokenizer7.isEmptyTokenAsNull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = strTokenizer7.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test407");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strTokenizer0.getIgnoredMatcher();
        int int2 = strTokenizer0.previousIndex();
        int int3 = strTokenizer0.size();
        java.lang.String str4 = strTokenizer0.nextToken();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test408");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("4", 'a', 'a');
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test409");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        int int7 = strTokenizer6.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = strTokenizer6.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test410");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("hi!");
        java.lang.String str2 = strTokenizer1.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer1.setIgnoreEmptyTokens(true);
        java.lang.String str5 = strTokenizer1.next();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer1.setQuoteChar(' ');
        java.lang.String[] strArray8 = strTokenizer7.getTokenArray();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test411");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("hi!", '4', 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer3.getQuoteMatcher();
        boolean boolean5 = strTokenizer3.hasNext();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer3.reset();
        java.lang.String str7 = strTokenizer6.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = strTokenizer6.setQuoteChar(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test412");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[not tokenized yet]", ' ', '4');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setDelimiterString("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer3.reset();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer3.setDelimiterString("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test413");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strTokenizer0.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer0.setDelimiterString("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strTokenizer4.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer0.setDelimiterMatcher(strMatcher5);
        java.lang.String str7 = strTokenizer6.previousToken();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test414");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, "");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer2.setEmptyTokenAsNull(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test415");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = strTokenizer0.reset("");
        boolean boolean3 = strTokenizer0.isEmptyTokenAsNull();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer0.setDelimiterChar(' ');
        java.lang.String str6 = strTokenizer0.getContent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test416");
        char[] charArray0 = new char[] {};
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, 'a', '#');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, "4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test417");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterChar('a');
        java.util.List<java.lang.String> strList4 = strTokenizer3.getTokenList();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer3.setDelimiterChar(' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer3.setIgnoreEmptyTokens(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test418");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance();
        java.lang.String str1 = strTokenizer0.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer0.setIgnoredChar('#');
        int int4 = strTokenizer0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = strTokenizer0.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test419");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = new org.apache.commons.lang3.text.StrTokenizer("hi!");
        boolean boolean2 = strTokenizer1.hasPrevious();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test420");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("", 'a', '4');
        java.lang.String str4 = strTokenizer3.toString();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer3.setIgnoreEmptyTokens(false);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer3.getDelimiterMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str4.equals("StrTokenizer[not tokenized yet]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test421");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, "");
        java.util.List<java.lang.String> strList3 = strTokenizer2.getTokenList();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer2.setDelimiterString("4 ");
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        int int7 = strTokenizer5.size();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test422");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test423");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, "4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test424");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = strTokenizer0.reset("");
        boolean boolean3 = strTokenizer0.isEmptyTokenAsNull();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer0.setDelimiterString("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getQuoteMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test425");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[not tokenized yet]", '4', '4');
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test426");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", '#');
        java.lang.String str3 = strTokenizer2.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer2.setDelimiterString("4 ");
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer5.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test427");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '#');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strTokenizer8.getIgnoredMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test428");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[not tokenized yet]", ' ', '4');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setDelimiterString("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer3.reset();
        boolean boolean7 = strTokenizer3.isEmptyTokenAsNull();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = strTokenizer3.reset("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test429");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("4", '#', '#');
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test430");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        java.lang.Object obj1 = strTokenizer0.clone();
        int int2 = strTokenizer0.previousIndex();
        java.lang.String str3 = strTokenizer0.previousToken();
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj1.toString(), "StrTokenizer[not tokenized yet]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test431");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("", 'a', '4');
        java.lang.String str4 = strTokenizer3.toString();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.reset();
        int int6 = strTokenizer3.size();
        boolean boolean7 = strTokenizer3.hasPrevious();
        java.lang.String str8 = strTokenizer3.getContent();
        int int9 = strTokenizer3.previousIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str4.equals("StrTokenizer[not tokenized yet]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test432");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strTokenizer0.getTrimmerMatcher();
        boolean boolean2 = strTokenizer0.isEmptyTokenAsNull();
        java.lang.Object obj3 = strTokenizer0.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj3.toString(), "StrTokenizer[not tokenized yet]");
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test433");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("hi!");
        boolean boolean2 = strTokenizer1.isEmptyTokenAsNull();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.reset();
        boolean boolean4 = strTokenizer1.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = strTokenizer1.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test434");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterString("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setEmptyTokenAsNull(false);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer3.setDelimiterChar(' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strTokenizer3.getQuoteMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test435");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterString("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setEmptyTokenAsNull(false);
        java.lang.String str6 = strTokenizer5.getContent();
        int int7 = strTokenizer5.nextIndex();
        int int8 = strTokenizer5.nextIndex();
        java.lang.String str9 = strTokenizer5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str9.equals("StrTokenizer[not tokenized yet]"));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test436");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = strTokenizer0.reset("");
        boolean boolean3 = strTokenizer0.isEmptyTokenAsNull();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer0.setDelimiterChar(' ');
        java.lang.String str6 = strTokenizer5.getContent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test437");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", '#');
        java.lang.String str3 = strTokenizer2.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer2.setDelimiterString("4 ");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer5.setIgnoreEmptyTokens(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test438");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("", 'a', '4');
        java.lang.String str4 = strTokenizer3.toString();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.reset();
        java.lang.String str6 = strTokenizer3.previousToken();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str4.equals("StrTokenizer[not tokenized yet]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test439");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = strTokenizer0.setQuoteChar(' ');
        boolean boolean3 = strTokenizer2.hasPrevious();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer2.setDelimiterChar(' ');
        java.util.List<java.lang.String> strList6 = strTokenizer5.getTokenList();
        java.lang.String str7 = strTokenizer5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "StrTokenizer[]" + "'", str7.equals("StrTokenizer[]"));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test440");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("4", '#', 'a');
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test441");
        char[] charArray5 = new char[] { ' ', ' ', 'a', '#', 'a' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray5, "4 ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test442");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[]", '4', '#');
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test443");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("hi!");
        java.lang.String str3 = strTokenizer2.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer2.setIgnoreEmptyTokens(true);
        java.lang.String str6 = strTokenizer2.previousToken();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer2.reset();
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strTokenizer2.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer("4 ", strMatcher8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test444");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterString("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer1.reset();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer4.setIgnoreEmptyTokens(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test445");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("hi!");
        java.lang.String str2 = strTokenizer1.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer1.setIgnoreEmptyTokens(true);
        java.lang.String str5 = strTokenizer1.next();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer1.setQuoteChar(' ');
        java.lang.String str8 = strTokenizer1.previousToken();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test446");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance();
        java.util.List<java.lang.String> strList1 = strTokenizer0.getTokenList();
        int int2 = strTokenizer0.size();
        java.lang.String str3 = strTokenizer0.previousToken();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test447");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("hi!");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = strTokenizer1.reset();
        boolean boolean3 = strTokenizer2.hasPrevious();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test448");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        java.lang.Object obj1 = strTokenizer0.clone();
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = strTokenizer0.getQuoteMatcher();
        java.util.List<java.lang.String> strList3 = strTokenizer0.getTokenList();
        int int4 = strTokenizer0.previousIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj1.toString(), "StrTokenizer[not tokenized yet]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test449");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = strTokenizer1.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("4 ", strMatcher2);
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer3.getQuoteMatcher();
        int int5 = strTokenizer3.size();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer3.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = strTokenizer6.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test450");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setIgnoredChar('#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = strTokenizer8.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test451");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4", ' ');
        java.lang.String str3 = strTokenizer2.nextToken();
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer2.getQuoteMatcher();
        java.lang.String str5 = strTokenizer2.previous();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer2.setQuoteChar('4');
        java.lang.Object obj8 = strTokenizer7.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4" + "'", str3.equals("4"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4" + "'", str5.equals("4"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj8.toString(), "StrTokenizer[not tokenized yet]");
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test452");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        boolean boolean6 = strTokenizer5.hasNext();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test453");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, '4', 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.reset("");
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer5.add("4 ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test454");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setIgnoredChar(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test455");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = strTokenizer7.setDelimiterString("StrTokenizer[not tokenized yet]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test456");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterString("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setEmptyTokenAsNull(false);
        java.lang.String str6 = strTokenizer3.getContent();
        int int7 = strTokenizer3.size();
        int int8 = strTokenizer3.size();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test457");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = strTokenizer1.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("4 ", strMatcher2);
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer3.getQuoteMatcher();
        int int5 = strTokenizer3.size();
        int int6 = strTokenizer3.previousIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test458");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = new org.apache.commons.lang3.text.StrTokenizer();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = strTokenizer0.setIgnoreEmptyTokens(true);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher5);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer2.setDelimiterMatcher(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test459");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = new org.apache.commons.lang3.text.StrTokenizer(charArray0);
        boolean boolean2 = strTokenizer1.isEmptyTokenAsNull();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        java.lang.Object obj4 = strTokenizer3.clone();
        java.lang.String str5 = strTokenizer3.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer3.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer1.setDelimiterMatcher(strMatcher6);
        boolean boolean8 = strTokenizer7.hasPrevious();
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strTokenizer7.getQuoteMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "StrTokenizer[not tokenized yet]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test460");
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[]", strMatcher1);
        java.lang.String str3 = strTokenizer2.previousToken();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test461");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4 ", 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer2.setDelimiterString("StrTokenizer[]");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer2.setIgnoreEmptyTokens(true);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer2.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = strTokenizer2.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test462");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = strTokenizer0.reset("");
        boolean boolean3 = strTokenizer0.isEmptyTokenAsNull();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer0.setDelimiterChar(' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer0.setDelimiterChar('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test463");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterString("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setEmptyTokenAsNull(false);
        java.lang.String str6 = strTokenizer3.getContent();
        int int7 = strTokenizer3.size();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = strTokenizer3.setDelimiterChar('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test464");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4", ' ');
        boolean boolean3 = strTokenizer2.hasPrevious();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test465");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("hi!", 'a', 'a');
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test466");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("4 ");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer3.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer("hi!", strMatcher4);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer1.setTrimmerMatcher(strMatcher4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test467");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, "");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test468");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test469");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4 ", 'a');
        java.lang.String str3 = strTokenizer2.nextToken();
        boolean boolean4 = strTokenizer2.hasNext();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4 " + "'", str3.equals("4 "));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test470");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("hi!");
        boolean boolean2 = strTokenizer1.hasNext();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer1.setEmptyTokenAsNull(false);
        java.util.List<java.lang.String> strList5 = strTokenizer1.getTokenList();
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer1.getQuoteMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test471");
        char[] charArray3 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer(charArray3, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer6.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[not tokenized yet]", strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test472");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", '#');
        java.lang.Class<?> wildcardClass3 = strTokenizer2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test473");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = strTokenizer1.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer1.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer();
        int int7 = strTokenizer6.previousIndex();
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strTokenizer6.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer("4 ", strMatcher5, strMatcher8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test474");
        char[] charArray0 = new char[] {};
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, 'a', '#');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, '#');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test475");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", "hi!");
        boolean boolean3 = strTokenizer2.hasNext();
        boolean boolean4 = strTokenizer2.isEmptyTokenAsNull();
        boolean boolean5 = strTokenizer2.hasPrevious();
        java.lang.String str6 = strTokenizer2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "StrTokenizer[]" + "'", str6.equals("StrTokenizer[]"));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test476");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '4');
        java.lang.Class<?> wildcardClass9 = charArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test477");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", "4 ");
        java.lang.String[] strArray3 = strTokenizer2.getTokenArray();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test478");
        char[] charArray0 = new char[] {};
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray0);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer2);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test479");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance();
        java.lang.String str1 = strTokenizer0.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer0.setIgnoredChar('#');
        int int4 = strTokenizer0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = strTokenizer0.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test480");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test481");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("hi!");
        java.lang.String str2 = strTokenizer1.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer1.setIgnoreEmptyTokens(true);
        java.lang.String str5 = strTokenizer1.next();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer1.setQuoteChar(' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strTokenizer1.getQuoteMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test482");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = strTokenizer1.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("4 ", strMatcher2);
        java.lang.Class<?> wildcardClass4 = strMatcher2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test483");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = strTokenizer1.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher2);
        java.lang.String[] strArray4 = strTokenizer3.getTokenArray();
        java.lang.String str5 = strTokenizer3.getContent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test484");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer6.getQuoteMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test485");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance();
        java.util.List<java.lang.String> strList1 = strTokenizer0.getTokenList();
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = strTokenizer0.getDelimiterMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher2);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test486");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("", 'a', 'a');
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test487");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterString("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setEmptyTokenAsNull(false);
        boolean boolean6 = strTokenizer3.hasNext();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test488");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("hi!");
        boolean boolean2 = strTokenizer1.isEmptyTokenAsNull();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.reset();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setIgnoredChar('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test489");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("", 'a', '4');
        boolean boolean4 = strTokenizer3.hasPrevious();
        java.lang.String[] strArray5 = strTokenizer3.getTokenArray();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer3.setDelimiterString("");
        java.lang.Class<?> wildcardClass8 = strTokenizer3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test490");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("hi!");
        boolean boolean2 = strTokenizer1.isEmptyTokenAsNull();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.reset();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer1.reset("4 ");
        boolean boolean6 = strTokenizer5.isIgnoreEmptyTokens();
        java.lang.String[] strArray7 = strTokenizer5.getTokenArray();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test491");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterString("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setIgnoreEmptyTokens(false);
        java.lang.String str6 = strTokenizer5.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setQuoteChar('#');
        java.util.List<java.lang.String> strList9 = strTokenizer5.getTokenList();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test492");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("hi!", ' ', '#');
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test493");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = strTokenizer1.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("4 ", strMatcher2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setIgnoreEmptyTokens(true);
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer5.setQuoteMatcher(strMatcher6);
        boolean boolean8 = strTokenizer5.hasPrevious();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test494");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4 ", 'a');
        java.lang.String str3 = strTokenizer2.nextToken();
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer2.getQuoteMatcher();
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer2.add("4 ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4 " + "'", str3.equals("4 "));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher4);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test495");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("4", '4', '4');
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test496");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("", 'a', '4');
        java.lang.String str4 = strTokenizer3.toString();
        boolean boolean5 = strTokenizer3.hasNext();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str4.equals("StrTokenizer[not tokenized yet]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test497");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[not tokenized yet]");
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test498");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = strTokenizer7.setIgnoredChar('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test499");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4 ", '#');
        boolean boolean3 = strTokenizer2.hasPrevious();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.test500");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("hi!");
        int int2 = strTokenizer1.previousIndex();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer1.setEmptyTokenAsNull(false);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer4.setIgnoreEmptyTokens(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
    }
}

