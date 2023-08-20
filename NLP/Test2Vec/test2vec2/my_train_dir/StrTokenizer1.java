
package StrTokenizer;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StrTokenizer1 {

    public static boolean debug = false;

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test501");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterString("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setEmptyTokenAsNull(false);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer3.setDelimiterChar(' ');
        java.lang.String str8 = strTokenizer7.previousToken();
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
            System.out.format("%n%s%n", "StrTokenizer1.test502");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        java.lang.Object obj7 = strTokenizer6.clone();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = strTokenizer6.setDelimiterChar('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj7.toString(), "StrTokenizer[not tokenized yet]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test503");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        java.lang.String str6 = strTokenizer5.next();
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer5.getTrimmerMatcher();
        java.lang.String str8 = strTokenizer5.getContent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4 " + "'", str6.equals("4 "));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4 " + "'", str8.equals("4 "));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test504");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("hi!");
        java.lang.String str2 = strTokenizer1.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer1.setIgnoreEmptyTokens(true);
        java.lang.String str5 = strTokenizer1.previousToken();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer1.reset();
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer1.getTrimmerMatcher();
        java.util.List<java.lang.String> strList8 = strTokenizer1.getTokenList();
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
        org.junit.Assert.assertNotNull(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test505");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = new org.apache.commons.lang3.text.StrTokenizer(charArray0);
        boolean boolean2 = strTokenizer1.isEmptyTokenAsNull();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        java.lang.Object obj4 = strTokenizer3.clone();
        java.lang.String str5 = strTokenizer3.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer3.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer1.setDelimiterMatcher(strMatcher6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = strTokenizer7.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test506");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        java.lang.Class<?> wildcardClass9 = strTokenizer8.getClass();
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
            System.out.format("%n%s%n", "StrTokenizer1.test507");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '4');
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
            System.out.format("%n%s%n", "StrTokenizer1.test508");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("hi!");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer3.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher4);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer1.setQuoteMatcher(strMatcher4);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer1.setEmptyTokenAsNull(true);
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
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test509");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4 ", '#');
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = strTokenizer2.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer2.setIgnoreEmptyTokens(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test510");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("hi!");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setIgnoreEmptyTokens(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test511");
        char[] charArray0 = new char[] {};
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, 'a', '#');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, '#');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray0);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, "StrTokenizer[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test512");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = new org.apache.commons.lang3.text.StrTokenizer("hi!", '4', 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strTokenizer4.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher5);
        java.util.List<java.lang.String> strList7 = strTokenizer6.getTokenList();
        java.lang.Class<?> wildcardClass8 = strTokenizer6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test513");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[not tokenized yet]", "");
        boolean boolean3 = strTokenizer2.isEmptyTokenAsNull();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test514");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", '#');
        java.lang.String str3 = strTokenizer2.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer2.setDelimiterString("4 ");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer2.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test515");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[not tokenized yet]", "StrTokenizer[]");
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test516");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterString("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setEmptyTokenAsNull(false);
        java.lang.String str6 = strTokenizer3.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer3.setDelimiterString("hi!");
        org.apache.commons.lang3.text.StrMatcher strMatcher9 = strTokenizer8.getQuoteMatcher();
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
        org.junit.Assert.assertNotNull(strMatcher9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test517");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        java.lang.Object obj3 = strTokenizer2.clone();
        java.lang.String str4 = strTokenizer2.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strTokenizer2.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer1.setIgnoredMatcher(strMatcher5);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer6.setQuoteChar('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj3.toString(), "StrTokenizer[not tokenized yet]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test518");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = strTokenizer0.setQuoteChar(' ');
        java.lang.String str3 = strTokenizer2.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer2.setQuoteChar('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test519");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4 ", '#');
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = strTokenizer2.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer2.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strTokenizer2.getDelimiterMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test520");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[]", ' ', 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer3.getDelimiterMatcher();
        java.lang.String str5 = strTokenizer3.next();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "StrTokenizer[]" + "'", str5.equals("StrTokenizer[]"));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test521");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        java.lang.Object obj2 = strTokenizer1.clone();
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = strTokenizer1.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("hi!");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer5.reset();
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer6.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher3, strMatcher7);
        java.lang.Class<?> wildcardClass9 = strMatcher7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj2.toString(), "StrTokenizer[not tokenized yet]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test522");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("4", ' ');
        java.lang.String str4 = strTokenizer3.toString();
        boolean boolean5 = strTokenizer3.hasNext();
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer3.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer("4 ", strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str4.equals("StrTokenizer[not tokenized yet]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test523");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = strTokenizer1.reset();
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = strTokenizer2.getTrimmerMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher3);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test524");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = strTokenizer0.setQuoteChar(' ');
        java.util.List<java.lang.String> strList3 = strTokenizer2.getTokenList();
        boolean boolean4 = strTokenizer2.isIgnoreEmptyTokens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = strTokenizer2.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test525");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        int int7 = strTokenizer6.size();
        java.lang.Class<?> wildcardClass8 = strTokenizer6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test526");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[]", ' ', ' ');
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer3.set("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: set() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test527");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = strTokenizer0.setQuoteChar(' ');
        boolean boolean3 = strTokenizer2.hasPrevious();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer2.setIgnoredChar('4');
        java.lang.Class<?> wildcardClass6 = strTokenizer5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test528");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("hi!");
        java.lang.String str2 = strTokenizer1.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer1.reset("hi!");
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
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test529");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[not tokenized yet]", ' ', '4');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setDelimiterString("StrTokenizer[not tokenized yet]");
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer3.set("4 ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: set() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test530");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer3.getDelimiterMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher4);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test531");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, "");
        java.util.List<java.lang.String> strList3 = strTokenizer2.getTokenList();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer2.setDelimiterString("4 ");
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() is unsupported");
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
            System.out.format("%n%s%n", "StrTokenizer1.test532");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4", ' ');
        java.lang.String str3 = strTokenizer2.nextToken();
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer2.getTrimmerMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4" + "'", str3.equals("4"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher4);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test533");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("4", ' ', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer3.getQuoteMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher4);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test534");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("hi!", "");
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = strTokenizer2.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer2.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test535");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("hi!");
        boolean boolean2 = strTokenizer1.isEmptyTokenAsNull();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.reset();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer1.reset("4 ");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer1.reset();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer1.setDelimiterChar('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
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
            System.out.format("%n%s%n", "StrTokenizer1.test536");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", '#');
        java.lang.String str3 = strTokenizer2.getContent();
        boolean boolean4 = strTokenizer2.isIgnoreEmptyTokens();
        java.lang.String str5 = strTokenizer2.previousToken();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer2.setDelimiterString("");
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strTokenizer7.getTrimmerMatcher();
        java.lang.Class<?> wildcardClass9 = strMatcher8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test537");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = strTokenizer0.setQuoteChar(' ');
        boolean boolean3 = strTokenizer2.hasPrevious();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer2.setDelimiterChar(' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer2.getDelimiterMatcher();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = strTokenizer2.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
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
            System.out.format("%n%s%n", "StrTokenizer1.test538");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = strTokenizer0.setQuoteChar(' ');
        boolean boolean3 = strTokenizer2.hasPrevious();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer2.setDelimiterChar(' ');
        java.util.List<java.lang.String> strList6 = strTokenizer5.getTokenList();
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer5.set("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: set() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test539");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strTokenizer0.getIgnoredMatcher();
        int int2 = strTokenizer0.previousIndex();
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = strTokenizer0.getQuoteMatcher();
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
            System.out.format("%n%s%n", "StrTokenizer1.test540");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4 ", ' ');
        int int3 = strTokenizer2.previousIndex();
        java.util.List<java.lang.String> strList4 = strTokenizer2.getTokenList();
        java.lang.Class<?> wildcardClass5 = strList4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test541");
        char[] charArray0 = new char[] {};
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, 'a', '#');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, '#');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray0);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray0);
        java.lang.String str8 = strTokenizer7.nextToken();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test542");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = new org.apache.commons.lang3.text.StrTokenizer();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = strTokenizer0.setIgnoreEmptyTokens(true);
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer2.set("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: set() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer2);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test543");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("4 ");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer2.setIgnoredChar('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strTokenizer2.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer2.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer("hi!", strMatcher6);
        boolean boolean8 = strTokenizer7.hasNext();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test544");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        java.lang.Object obj1 = strTokenizer0.clone();
        java.lang.String str2 = strTokenizer0.getContent();
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = strTokenizer0.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer0.setDelimiterString("4");
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
            System.out.format("%n%s%n", "StrTokenizer1.test545");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = strTokenizer0.getIgnoredMatcher();
        int int2 = strTokenizer0.previousIndex();
        int int3 = strTokenizer0.nextIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test546");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("", 'a', '4');
        boolean boolean4 = strTokenizer3.hasPrevious();
        java.lang.String[] strArray5 = strTokenizer3.getTokenArray();
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer3.getDelimiterMatcher();
        java.lang.String str7 = strTokenizer3.nextToken();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test547");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("hi!");
        java.lang.String str2 = strTokenizer1.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer1.setIgnoreEmptyTokens(true);
        boolean boolean5 = strTokenizer1.isIgnoreEmptyTokens();
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer1.getQuoteMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test548");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer6.getDelimiterMatcher();
        java.lang.String str8 = strTokenizer6.getContent();
        java.lang.String str9 = strTokenizer6.getContent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4 " + "'", str8.equals("4 "));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4 " + "'", str9.equals("4 "));
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test549");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, "hi!");
        java.lang.Class<?> wildcardClass3 = strTokenizer2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test550");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterString("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setIgnoreEmptyTokens(false);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer5.setIgnoredChar('#');
        java.util.List<java.lang.String> strList8 = strTokenizer7.getTokenList();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test551");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = strTokenizer0.setQuoteChar(' ');
        boolean boolean3 = strTokenizer2.hasPrevious();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer2.setIgnoredChar('4');
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
            System.out.format("%n%s%n", "StrTokenizer1.test552");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[]", ' ', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setIgnoredChar('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test553");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '#');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test554");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", "4");
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test555");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        java.lang.Object obj1 = strTokenizer0.clone();
        java.lang.String[] strArray2 = strTokenizer0.getTokenArray();
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = strTokenizer0.getQuoteMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj1.toString(), "StrTokenizer[not tokenized yet]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher3);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test556");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance();
        java.util.List<java.lang.String> strList1 = strTokenizer0.getTokenList();
        java.lang.Class<?> wildcardClass2 = strList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test557");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("", ' ', 'a');
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test558");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[]", '#');
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = strTokenizer2.getIgnoredMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher3);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test559");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer3.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer("4 ", strMatcher4);
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer("hi!", strMatcher6);
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strTokenizer7.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer("4 ", strMatcher8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher8);
    }

    @Test
    public void StrTokenizer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer1.test560");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
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
            System.out.format("%n%s%n", "StrTokenizer1.test561");
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[]", strMatcher1);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer("4 ", strMatcher5);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer2.setIgnoredMatcher(strMatcher5);
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer2.set("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: set() is unsupported");
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
}

