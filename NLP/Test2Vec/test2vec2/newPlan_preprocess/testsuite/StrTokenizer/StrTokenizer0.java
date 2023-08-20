package StrTokenizer;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StrTokenizer0 {

    public static boolean debug = false;

    @Test
    public void StrTokenizer001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer001");
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
    public void StrTokenizer002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer002");
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
    public void StrTokenizer003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer003");
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
    public void StrTokenizer004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer004");
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
    public void StrTokenizer005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer005");
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
    public void StrTokenizer006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer006");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer007");
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
    public void StrTokenizer008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer008");
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
    public void StrTokenizer009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer009");
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
    public void StrTokenizer010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer010");
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
    public void StrTokenizer011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer011");
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
    public void StrTokenizer012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer012");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, '4');
    }

    @Test
    public void StrTokenizer013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer013");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("hi!", '4', 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer3.getQuoteMatcher();
        java.lang.Class<?> wildcardClass5 = strMatcher4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void StrTokenizer014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer014");
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
    public void StrTokenizer015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer015");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("4 ", '4', ' ');
    }

    @Test
    public void StrTokenizer016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer016");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", '#');
        java.lang.String str3 = strTokenizer2.getContent();
        java.lang.Class<?> wildcardClass4 = strTokenizer2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void StrTokenizer017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer017");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, "");
        // The following exception was thrown during execution in StrTokenizer generation
        try {
            strTokenizer2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrTokenizer018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer018");
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
    public void StrTokenizer019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer019");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        int int2 = strTokenizer1.previousIndex();
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer020");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        java.lang.Object obj1 = strTokenizer0.clone();
        java.lang.String str2 = strTokenizer0.getContent();
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer021");
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
    public void StrTokenizer022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer022");
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
    public void StrTokenizer023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer023");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance();
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer024");
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
    public void StrTokenizer025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer025");
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
    public void StrTokenizer026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer026");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("");
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer027");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setDelimiterString("");
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer028");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", "hi!");
        // The following exception was thrown during execution in StrTokenizer generation
        try {
            strTokenizer2.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrTokenizer029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer029");
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
    public void StrTokenizer030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer030");
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
    public void StrTokenizer031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer031");
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
    public void StrTokenizer032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer032");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        java.lang.Object obj7 = strTokenizer6.clone();
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer033");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("hi!", '#', '4');
        java.lang.String[] strArray4 = strTokenizer3.getTokenArray();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void StrTokenizer034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer034");
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
    public void StrTokenizer035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer035");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("");
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer036");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("", 'a', '4');
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer3.getIgnoredMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher4);
    }

    @Test
    public void StrTokenizer037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer037");
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
    public void StrTokenizer038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer038");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '4', 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
    }

    @Test
    public void StrTokenizer039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer039");
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
    public void StrTokenizer040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer040");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a');
        java.lang.String str8 = strTokenizer7.toString();
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer041");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, '4', 'a');
        // The following exception was thrown during execution in StrTokenizer generation
        try {
            strTokenizer3.set("4 ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: set() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrTokenizer042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer042");
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
    public void StrTokenizer043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer043");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("4 ", '4', 'a');
    }

    @Test
    public void StrTokenizer044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer044");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        java.lang.Object obj1 = strTokenizer0.clone();
        java.lang.String str2 = strTokenizer0.getContent();
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer045");
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
    public void StrTokenizer046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer046");
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
    public void StrTokenizer047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer047");
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
    public void StrTokenizer048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer048");
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
    public void StrTokenizer049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer049");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer050");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterChar('a');
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer051");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray2);
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer052");
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
    public void StrTokenizer053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer053");
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
    public void StrTokenizer054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer054");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        java.lang.Object obj1 = strTokenizer0.clone();
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = strTokenizer0.getQuoteMatcher();
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer055");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = new org.apache.commons.lang3.text.StrTokenizer("");
        boolean boolean2 = strTokenizer1.isEmptyTokenAsNull();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StrTokenizer056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer056");
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
    public void StrTokenizer057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer057");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        java.lang.String str6 = strTokenizer5.next();
        int int7 = strTokenizer5.previousIndex();
        java.lang.Object obj8 = strTokenizer5.clone();
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer058");
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
    public void StrTokenizer059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer059");
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
    public void StrTokenizer060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer060");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        java.lang.String str6 = strTokenizer5.next();
        int int7 = strTokenizer5.previousIndex();
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = strTokenizer5.getTrimmerMatcher();
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer061");
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
    public void StrTokenizer062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer062");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("hi!", '#', '4');
        java.util.List<java.lang.String> strList4 = strTokenizer3.getTokenList();
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer063");
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
    public void StrTokenizer064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer064");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance();
        boolean boolean1 = strTokenizer0.isEmptyTokenAsNull();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StrTokenizer065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer065");
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
    public void StrTokenizer066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer066");
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
    public void StrTokenizer067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer067");
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
    public void StrTokenizer068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer068");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = new org.apache.commons.lang3.text.StrTokenizer("4");
    }

    @Test
    public void StrTokenizer069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer069");
        char[] charArray5 = new char[] { '4', '#', '#', ' ', 'a' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray5, "4 ");
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer070");
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
    public void StrTokenizer071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer071");
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
    public void StrTokenizer072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer072");
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
    public void StrTokenizer073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer073");
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
    public void StrTokenizer074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer074");
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
    public void StrTokenizer075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer075");
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
    public void StrTokenizer076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer076");
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
    public void StrTokenizer077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer077");
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
    public void StrTokenizer078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer078");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getIgnoredMatcher();
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer079");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4", "");
    }

    @Test
    public void StrTokenizer080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer080");
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
    public void StrTokenizer081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer081");
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
    public void StrTokenizer082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer082");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", '#');
        java.lang.String str3 = strTokenizer2.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer2.setDelimiterString("4 ");
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer083");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", "hi!");
        boolean boolean3 = strTokenizer2.hasNext();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer2.setIgnoreEmptyTokens(false);
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer084");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = new org.apache.commons.lang3.text.StrTokenizer("4 ");
        java.lang.String str2 = strTokenizer1.previousToken();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void StrTokenizer085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer085");
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
    public void StrTokenizer086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer086");
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
    public void StrTokenizer087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer087");
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
    public void StrTokenizer088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer088");
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
    public void StrTokenizer089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer089");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        boolean boolean2 = strTokenizer1.hasPrevious();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StrTokenizer090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer090");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", '#');
        java.lang.String str3 = strTokenizer2.getContent();
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer091");
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
    public void StrTokenizer092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer092");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = strTokenizer1.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("4", strMatcher2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher2);
    }

    @Test
    public void StrTokenizer093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer093");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = new org.apache.commons.lang3.text.StrTokenizer("hi!", '4', 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strTokenizer4.getQuoteMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[]", strMatcher5, strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher5);
    }

    @Test
    public void StrTokenizer094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer094");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = strTokenizer0.reset("");
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer095");
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
    public void StrTokenizer096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer096");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        java.lang.Object obj1 = strTokenizer0.clone();
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = strTokenizer0.getQuoteMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = strTokenizer0.getIgnoredMatcher();
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer097");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, ' ');
        // The following exception was thrown during execution in StrTokenizer generation
        try {
            strTokenizer2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrTokenizer098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer098");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("hi!", "");
        // The following exception was thrown during execution in StrTokenizer generation
        try {
            strTokenizer2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrTokenizer099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer099");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, "");
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = strTokenizer2.getDelimiterMatcher();
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer100");
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
    public void StrTokenizer101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer101");
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
    public void StrTokenizer102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer102");
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
    public void StrTokenizer103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer103");
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
    public void StrTokenizer104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer104");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = strTokenizer1.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher2);
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer105");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer106");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterString("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setEmptyTokenAsNull(false);
        java.lang.String str6 = strTokenizer3.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer3.setDelimiterString("hi!");
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer107");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = new org.apache.commons.lang3.text.StrTokenizer("hi!");
        java.lang.String str2 = strTokenizer1.getContent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void StrTokenizer108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer108");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        java.lang.Object obj4 = strTokenizer3.clone();
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strTokenizer3.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer2.setDelimiterMatcher(strMatcher5);
        boolean boolean7 = strTokenizer2.hasNext();
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer109");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", 'a');
        // The following exception was thrown during execution in StrTokenizer generation
        try {
            java.lang.String str3 = strTokenizer2.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrTokenizer110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer110");
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
    public void StrTokenizer111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer111");
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
    public void StrTokenizer112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer112");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", "hi!");
        boolean boolean3 = strTokenizer2.hasPrevious();
        java.lang.Class<?> wildcardClass4 = strTokenizer2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void StrTokenizer113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer113");
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
    public void StrTokenizer114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer114");
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
    public void StrTokenizer115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer115");
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
    public void StrTokenizer116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer116");
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
    public void StrTokenizer117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer117");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = new org.apache.commons.lang3.text.StrTokenizer("hi!", '4', 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strTokenizer4.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher5);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = strTokenizer6.getIgnoredMatcher();
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer118");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, "");
        java.util.List<java.lang.String> strList3 = strTokenizer2.getTokenList();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer2.setDelimiterString("4 ");
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer119");
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
    public void StrTokenizer120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer120");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = new org.apache.commons.lang3.text.StrTokenizer(charArray0);
        java.lang.Class<?> wildcardClass2 = strTokenizer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void StrTokenizer121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer121");
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
    public void StrTokenizer122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer122");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("");
        boolean boolean2 = strTokenizer1.hasNext();
        boolean boolean3 = strTokenizer1.isEmptyTokenAsNull();
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer123");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("", 'a', '4');
        // The following exception was thrown during execution in StrTokenizer generation
        try {
            strTokenizer3.add("StrTokenizer[]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrTokenizer124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer124");
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
    public void StrTokenizer125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer125");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        java.lang.Object obj1 = strTokenizer0.clone();
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer126");
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
    public void StrTokenizer127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer127");
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
    public void StrTokenizer128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer128");
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
    public void StrTokenizer129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer129");
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
    public void StrTokenizer130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer130");
        char[] charArray5 = new char[] { '4', '#', '#', ' ', 'a' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray5, "4 ");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray5, "4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
    }

    @Test
    public void StrTokenizer131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer131");
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[]", strMatcher1);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer("4 ", strMatcher5);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer2.setIgnoredMatcher(strMatcher5);
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer132");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        java.lang.String str1 = strTokenizer0.toString();
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer133");
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
    public void StrTokenizer134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer134");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("hi!");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer();
        int int3 = strTokenizer2.previousIndex();
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer2.getQuoteMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer1.setTrimmerMatcher(strMatcher4);
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer135");
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[]", strMatcher1);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer("4 ", strMatcher5);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer2.setIgnoredMatcher(strMatcher5);
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer136");
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
    public void StrTokenizer137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer137");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, "");
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer138");
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
    public void StrTokenizer139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer139");
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
    public void StrTokenizer140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer140");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '#');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
    }

    @Test
    public void StrTokenizer141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer141");
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
    public void StrTokenizer142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer142");
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
    public void StrTokenizer143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer143");
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
    public void StrTokenizer144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer144");
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
    public void StrTokenizer145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer145");
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
    public void StrTokenizer146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer146");
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
    public void StrTokenizer147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer147");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterString("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setEmptyTokenAsNull(false);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer3.setDelimiterChar(' ');
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer148");
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
    public void StrTokenizer149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer149");
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
    public void StrTokenizer150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer150");
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
    public void StrTokenizer151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer151");
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
    public void StrTokenizer152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer152");
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
    public void StrTokenizer153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer153");
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
    public void StrTokenizer154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer154");
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
    public void StrTokenizer155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer155");
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4 ", strMatcher1);
    }

    @Test
    public void StrTokenizer156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer156");
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
    public void StrTokenizer157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer157");
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
    public void StrTokenizer158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer158");
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
    public void StrTokenizer159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer159");
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
    public void StrTokenizer160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer160");
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
    public void StrTokenizer161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer161");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("StrTokenizer[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
    }

    @Test
    public void StrTokenizer162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer162");
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
    public void StrTokenizer163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer163");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '#');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
    }

    @Test
    public void StrTokenizer164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer164");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = strTokenizer1.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher2);
        java.lang.String[] strArray4 = strTokenizer3.getTokenArray();
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer165");
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
    public void StrTokenizer166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer166");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[not tokenized yet]", ' ', '4');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setIgnoreEmptyTokens(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
    }

    @Test
    public void StrTokenizer167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer167");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = new org.apache.commons.lang3.text.StrTokenizer("4 ");
        // The following exception was thrown during execution in StrTokenizer generation
        try {
            strTokenizer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrTokenizer168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer168");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("hi!");
        java.lang.String str2 = strTokenizer1.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher5);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer1.setTrimmerMatcher(strMatcher5);
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer169");
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
    public void StrTokenizer170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer170");
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
    public void StrTokenizer171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer171");
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
    public void StrTokenizer172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer172");
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
    public void StrTokenizer173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer173");
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
    public void StrTokenizer174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer174");
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
    public void StrTokenizer175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer175");
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
    public void StrTokenizer176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer176");
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
    public void StrTokenizer177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer177");
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
    public void StrTokenizer178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer178");
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
    public void StrTokenizer179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer179");
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
    public void StrTokenizer180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer180");
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
    public void StrTokenizer181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer181");
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
    public void StrTokenizer182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer182");
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
    public void StrTokenizer183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer183");
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
    public void StrTokenizer184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer184");
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
    public void StrTokenizer185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer185");
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
    public void StrTokenizer186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer186");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, "");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, "4 ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
    }

    @Test
    public void StrTokenizer187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer187");
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
    public void StrTokenizer188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer188");
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
    public void StrTokenizer189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer189");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, "");
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = strTokenizer2.getDelimiterMatcher();
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer190");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = strTokenizer0.reset("");
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer191");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, ' ', '#');
    }

    @Test
    public void StrTokenizer192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer192");
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
    public void StrTokenizer193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer193");
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
    public void StrTokenizer194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer194");
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
    public void StrTokenizer195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer195");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("4");
        int int2 = strTokenizer1.nextIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StrTokenizer196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer196");
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
    public void StrTokenizer197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer197");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("", 'a', '4');
        boolean boolean4 = strTokenizer3.hasPrevious();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer3.setIgnoredChar('4');
        java.lang.String[] strArray7 = strTokenizer6.getTokenArray();
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer198");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("hi!");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = strTokenizer1.reset();
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer199");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4", '4');
    }

    @Test
    public void StrTokenizer200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer200");
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
    public void StrTokenizer201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer201");
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
    public void StrTokenizer202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer202");
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
    public void StrTokenizer203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer203");
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
    public void StrTokenizer204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer204");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '#');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
    }

    @Test
    public void StrTokenizer205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer205");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[]", '#', '4');
    }

    @Test
    public void StrTokenizer206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer206");
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
    public void StrTokenizer207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer207");
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
    public void StrTokenizer208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer208");
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
    public void StrTokenizer209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer209");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance();
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer210");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4", "StrTokenizer[]");
    }

    @Test
    public void StrTokenizer211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer211");
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
    public void StrTokenizer212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer212");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance();
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer213");
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
    public void StrTokenizer214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer214");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance();
        java.lang.String str1 = strTokenizer0.getContent();
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer215");
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
    public void StrTokenizer216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer216");
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
    public void StrTokenizer217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer217");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[not tokenized yet]", "StrTokenizer[not tokenized yet]");
    }

    @Test
    public void StrTokenizer218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer218");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("StrTokenizer[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
    }

    @Test
    public void StrTokenizer219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer219");
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
    public void StrTokenizer220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer220");
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
    public void StrTokenizer221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer221");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        java.lang.String str6 = strTokenizer5.next();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer5.reset();
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer222");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4 ", 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer2.setDelimiterString("StrTokenizer[]");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer4.setDelimiterChar('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
    }

    @Test
    public void StrTokenizer223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer223");
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
    public void StrTokenizer224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer224");
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
    public void StrTokenizer225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer225");
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
    public void StrTokenizer226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer226");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = new org.apache.commons.lang3.text.StrTokenizer();
        java.lang.Class<?> wildcardClass1 = strTokenizer0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void StrTokenizer227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer227");
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
    public void StrTokenizer228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer228");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("hi!");
        java.lang.Class<?> wildcardClass2 = strTokenizer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void StrTokenizer229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer229");
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
    public void StrTokenizer230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer230");
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
    public void StrTokenizer231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer231");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("hi!", "4");
    }

    @Test
    public void StrTokenizer232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer232");
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
    public void StrTokenizer233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer233");
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
    public void StrTokenizer234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer234");
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
    public void StrTokenizer235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer235");
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
    public void StrTokenizer236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer236");
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
    public void StrTokenizer237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer237");
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
    public void StrTokenizer238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer238");
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
    public void StrTokenizer239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer239");
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
    public void StrTokenizer240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer240");
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
    public void StrTokenizer241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer241");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("hi!");
        java.lang.String str2 = strTokenizer1.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer1.reset("hi!");
        java.lang.Object obj5 = strTokenizer1.clone();
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer242");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = new org.apache.commons.lang3.text.StrTokenizer();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = strTokenizer0.setDelimiterString("StrTokenizer[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer2);
    }

    @Test
    public void StrTokenizer243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer243");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance();
        java.lang.String str1 = strTokenizer0.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer0.setIgnoredChar('#');
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer244");
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
    public void StrTokenizer245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer245");
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
    public void StrTokenizer246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer246");
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
    public void StrTokenizer247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer247");
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
    public void StrTokenizer248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer248");
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
    public void StrTokenizer249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer249");
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
    public void StrTokenizer250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer250");
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
    public void StrTokenizer251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer251");
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
    public void StrTokenizer252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer252");
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
    public void StrTokenizer253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer253");
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
    public void StrTokenizer254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer254");
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
    public void StrTokenizer255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer255");
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
    public void StrTokenizer256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer256");
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
    public void StrTokenizer257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer257");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[]", 'a', 'a');
    }

    @Test
    public void StrTokenizer258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer258");
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
    public void StrTokenizer259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer259");
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
    public void StrTokenizer260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer260");
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
    public void StrTokenizer261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer261");
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
    public void StrTokenizer262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer262");
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
    public void StrTokenizer263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer263");
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
    public void StrTokenizer264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer264");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(charArray0);
        java.lang.Class<?> wildcardClass2 = strTokenizer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void StrTokenizer265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer265");
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
    public void StrTokenizer266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer266");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", ' ');
    }

    @Test
    public void StrTokenizer267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer267");
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
    public void StrTokenizer268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer268");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("", 'a', '4');
        boolean boolean4 = strTokenizer3.hasPrevious();
        java.lang.String[] strArray5 = strTokenizer3.getTokenArray();
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer3.getDelimiterMatcher();
        boolean boolean7 = strTokenizer3.isEmptyTokenAsNull();
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer269");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, '4', 'a');
        java.lang.String str4 = strTokenizer3.nextToken();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void StrTokenizer270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer270");
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
    public void StrTokenizer271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer271");
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
    public void StrTokenizer272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer272");
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
    public void StrTokenizer273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer273");
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
    public void StrTokenizer274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer274");
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
    public void StrTokenizer275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer275");
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
    public void StrTokenizer276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer276");
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
    public void StrTokenizer277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer277");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        java.lang.Object obj1 = strTokenizer0.clone();
        java.lang.String[] strArray2 = strTokenizer0.getTokenArray();
        int int3 = strTokenizer0.nextIndex();
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer278");
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
    public void StrTokenizer279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer279");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("hi!", "");
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer3.getDelimiterMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[]", strMatcher4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher4);
    }

    @Test
    public void StrTokenizer280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer280");
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
    public void StrTokenizer281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer281");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("hi!", '#', '4');
        java.util.List<java.lang.String> strList4 = strTokenizer3.getTokenList();
        java.lang.Class<?> wildcardClass5 = strList4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void StrTokenizer282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer282");
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
    public void StrTokenizer283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer283");
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
    public void StrTokenizer284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer284");
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[]", strMatcher1);
        java.lang.String[] strArray3 = strTokenizer2.getTokenArray();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void StrTokenizer285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer285");
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
    public void StrTokenizer286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer286");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("", 'a', '4');
        java.lang.String str4 = strTokenizer3.toString();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.reset();
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer287");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", '#');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer2.setDelimiterString("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
    }

    @Test
    public void StrTokenizer288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer288");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        java.lang.Object obj1 = strTokenizer0.clone();
        java.lang.String[] strArray2 = strTokenizer0.getTokenArray();
        int int3 = strTokenizer0.nextIndex();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer0.setQuoteChar(' ');
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer289");
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
    public void StrTokenizer290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer290");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        boolean boolean2 = strTokenizer1.isIgnoreEmptyTokens();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StrTokenizer291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer291");
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
    public void StrTokenizer292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer292");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[not tokenized yet]", ' ', '4');
        boolean boolean4 = strTokenizer3.isIgnoreEmptyTokens();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void StrTokenizer293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer293");
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
    public void StrTokenizer294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer294");
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
    public void StrTokenizer295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer295");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("4", '#', '4');
    }

    @Test
    public void StrTokenizer296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer296");
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
    public void StrTokenizer297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer297");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, '4', 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.reset("");
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getDelimiterMatcher();
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer298");
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
    public void StrTokenizer299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer299");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4 ", 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer2.setDelimiterString("StrTokenizer[]");
        java.lang.String str5 = strTokenizer2.next();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4 " + "'", str5.equals("4 "));
    }

    @Test
    public void StrTokenizer300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer300");
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
    public void StrTokenizer301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer301");
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
    public void StrTokenizer302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer302");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("hi!");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterString("4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
    }

    @Test
    public void StrTokenizer303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer303");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, '4', 'a');
        int int4 = strTokenizer3.previousIndex();
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer304");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4 ", "4 ");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer2.reset("hi!");
        boolean boolean5 = strTokenizer2.isIgnoreEmptyTokens();
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer305");
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
    public void StrTokenizer306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer306");
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
    public void StrTokenizer307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer307");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", "StrTokenizer[not tokenized yet]");
    }

    @Test
    public void StrTokenizer308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer308");
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
    public void StrTokenizer309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer309");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[]");
        java.lang.Object obj2 = strTokenizer1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj2.toString(), "StrTokenizer[not tokenized yet]");
    }

    @Test
    public void StrTokenizer310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer310");
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
    public void StrTokenizer311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer311");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("", 'a', '#');
    }

    @Test
    public void StrTokenizer312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer312");
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
    public void StrTokenizer313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer313");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4", "hi!");
    }

    @Test
    public void StrTokenizer314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer314");
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
    public void StrTokenizer315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer315");
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
    public void StrTokenizer316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer316");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4 ", '#');
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = strTokenizer2.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer2.getIgnoredMatcher();
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer317");
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
    public void StrTokenizer318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer318");
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
    public void StrTokenizer319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer319");
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
    public void StrTokenizer320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer320");
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
    public void StrTokenizer321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer321");
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
    public void StrTokenizer322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer322");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", "4 ");
        java.lang.Class<?> wildcardClass3 = strTokenizer2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void StrTokenizer323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer323");
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
    public void StrTokenizer324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer324");
        char[] charArray0 = new char[] {};
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, 'a', '#');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, '#');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, "4 ");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
    }

    @Test
    public void StrTokenizer325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer325");
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
    public void StrTokenizer326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer326");
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
    public void StrTokenizer327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer327");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, '#', ' ');
    }

    @Test
    public void StrTokenizer328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer328");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, '4', 'a');
        int int4 = strTokenizer3.previousIndex();
        java.lang.String str5 = strTokenizer3.toString();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer3.reset("4");
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer329");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("4 ", ' ', 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setDelimiterString("StrTokenizer[not tokenized yet]");
        boolean boolean6 = strTokenizer3.hasPrevious();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void StrTokenizer330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer330");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = new org.apache.commons.lang3.text.StrTokenizer();
        int int1 = strTokenizer0.previousIndex();
        java.lang.String str2 = strTokenizer0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str2.equals("StrTokenizer[not tokenized yet]"));
    }

    @Test
    public void StrTokenizer331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer331");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("hi!", ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer2.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
    }

    @Test
    public void StrTokenizer332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer332");
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
    public void StrTokenizer333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer333");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", "StrTokenizer[]");
        java.lang.Class<?> wildcardClass3 = strTokenizer2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void StrTokenizer334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer334");
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
    public void StrTokenizer335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer335");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, '4', 'a');
        int int4 = strTokenizer3.previousIndex();
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer336");
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
    public void StrTokenizer337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer337");
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
    public void StrTokenizer338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer338");
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
    public void StrTokenizer339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer339");
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
    public void StrTokenizer340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer340");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("4");
        int int2 = strTokenizer1.nextIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StrTokenizer341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer341");
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
    public void StrTokenizer342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer342");
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
    public void StrTokenizer343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer343");
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
    public void StrTokenizer344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer344");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, '#');
    }

    @Test
    public void StrTokenizer345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer345");
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
    public void StrTokenizer346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer346");
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
    public void StrTokenizer347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer347");
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
    public void StrTokenizer348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer348");
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
    public void StrTokenizer349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer349");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", "hi!");
        boolean boolean3 = strTokenizer2.hasNext();
        java.lang.String[] strArray4 = strTokenizer2.getTokenArray();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void StrTokenizer350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer350");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        boolean boolean6 = strTokenizer5.hasPrevious();
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer351");
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", strMatcher1);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer2.setDelimiterChar('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
    }

    @Test
    public void StrTokenizer352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer352");
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
    public void StrTokenizer353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer353");
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
    public void StrTokenizer354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer354");
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
    public void StrTokenizer355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer355");
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
    public void StrTokenizer356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer356");
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
    public void StrTokenizer357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer357");
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
    public void StrTokenizer358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer358");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, '4');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
    }

    @Test
    public void StrTokenizer359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer359");
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
    public void StrTokenizer360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer360");
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
    public void StrTokenizer361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer361");
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
    public void StrTokenizer362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer362");
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
    public void StrTokenizer363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer363");
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
    public void StrTokenizer364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer364");
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
    public void StrTokenizer365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer365");
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
    public void StrTokenizer366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer366");
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
    public void StrTokenizer367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer367");
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
    public void StrTokenizer368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer368");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4 ", '4');
    }

    @Test
    public void StrTokenizer369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer369");
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
    public void StrTokenizer370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer370");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = strTokenizer0.setQuoteChar(' ');
        java.lang.String str3 = strTokenizer2.getContent();
        int int4 = strTokenizer2.size();
        java.util.List<java.lang.String> strList5 = strTokenizer2.getTokenList();
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer371");
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
    public void StrTokenizer372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer372");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterString("");
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer373");
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
    public void StrTokenizer374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer374");
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
    public void StrTokenizer375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer375");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[]", "hi!");
        int int3 = strTokenizer2.size();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void StrTokenizer376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer376");
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
    public void StrTokenizer377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer377");
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
    public void StrTokenizer378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer378");
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
    public void StrTokenizer379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer379");
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
    public void StrTokenizer380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer380");
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
    public void StrTokenizer381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer381");
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
    public void StrTokenizer382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer382");
        char[] charArray0 = new char[] {};
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, 'a', '#');
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer383");
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
    public void StrTokenizer384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer384");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("hi!", '#', 'a');
    }

    @Test
    public void StrTokenizer385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer385");
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
    public void StrTokenizer386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer386");
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
    public void StrTokenizer387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer387");
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
    public void StrTokenizer388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer388");
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
    public void StrTokenizer389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer389");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("4");
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer390");
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
    public void StrTokenizer391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer391");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", '#');
        java.lang.String str3 = strTokenizer2.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer2.setDelimiterString("4 ");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer2.reset("4 ");
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer392");
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
    public void StrTokenizer393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer393");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[not tokenized yet]", ' ');
    }

    @Test
    public void StrTokenizer394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer394");
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
    public void StrTokenizer395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer395");
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
    public void StrTokenizer396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer396");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("hi!", ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = strTokenizer2.getTrimmerMatcher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMatcher3);
    }

    @Test
    public void StrTokenizer397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer397");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[not tokenized yet]", '#');
    }

    @Test
    public void StrTokenizer398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer398");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance("");
        boolean boolean2 = strTokenizer1.hasNext();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer1.setIgnoreEmptyTokens(true);
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer399");
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
    public void StrTokenizer400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer400");
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
    public void StrTokenizer401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer401");
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
    public void StrTokenizer402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer402");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("", 'a', '4');
        java.lang.String str4 = strTokenizer3.nextToken();
        java.lang.String str5 = strTokenizer3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "StrTokenizer[]" + "'", str5.equals("StrTokenizer[]"));
    }

    @Test
    public void StrTokenizer403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer403");
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
    public void StrTokenizer404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer404");
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
    public void StrTokenizer405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer405");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[not tokenized yet]", "4 ");
        // The following exception was thrown during execution in StrTokenizer generation
        try {
            strTokenizer2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrTokenizer406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer406");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", '#');
        java.lang.String str3 = strTokenizer2.getContent();
        boolean boolean4 = strTokenizer2.isIgnoreEmptyTokens();
        java.lang.String str5 = strTokenizer2.previousToken();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer2.setDelimiterString("");
        boolean boolean8 = strTokenizer7.isEmptyTokenAsNull();
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer407");
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
    public void StrTokenizer408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer408");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("4", 'a', 'a');
    }

    @Test
    public void StrTokenizer409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer409");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(charArray2);
        int int7 = strTokenizer6.size();
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer410");
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
    public void StrTokenizer411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer411");
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
    public void StrTokenizer412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer412");
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
    public void StrTokenizer413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer413");
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
    public void StrTokenizer414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer414");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, "");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer2.setEmptyTokenAsNull(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
    }

    @Test
    public void StrTokenizer415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer415");
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
    public void StrTokenizer416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer416");
        char[] charArray0 = new char[] {};
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, 'a', '#');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, "4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
    }

    @Test
    public void StrTokenizer417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer417");
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
    public void StrTokenizer418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer418");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance();
        java.lang.String str1 = strTokenizer0.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer0.setIgnoredChar('#');
        int int4 = strTokenizer0.size();
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer419");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = new org.apache.commons.lang3.text.StrTokenizer("hi!");
        boolean boolean2 = strTokenizer1.hasPrevious();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer3);
    }

    @Test
    public void StrTokenizer420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer420");
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
    public void StrTokenizer421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer421");
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
    public void StrTokenizer422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer422");
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
    public void StrTokenizer423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer423");
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
    public void StrTokenizer424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer424");
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
    public void StrTokenizer425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer425");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[not tokenized yet]", '4', '4');
    }

    @Test
    public void StrTokenizer426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer426");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", '#');
        java.lang.String str3 = strTokenizer2.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer2.setDelimiterString("4 ");
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer427");
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
    public void StrTokenizer428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer428");
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
    public void StrTokenizer429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer429");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("4", '#', '#');
    }

    @Test
    public void StrTokenizer430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer430");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        java.lang.Object obj1 = strTokenizer0.clone();
        int int2 = strTokenizer0.previousIndex();
        java.lang.String str3 = strTokenizer0.previousToken();
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer431");
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
    public void StrTokenizer432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer432");
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
    public void StrTokenizer433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer433");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance("hi!");
        boolean boolean2 = strTokenizer1.isEmptyTokenAsNull();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer1.reset();
        boolean boolean4 = strTokenizer1.hasPrevious();
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer434");
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
    public void StrTokenizer435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer435");
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
    public void StrTokenizer436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer436");
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
    public void StrTokenizer437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer437");
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
    public void StrTokenizer438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer438");
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
    public void StrTokenizer439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer439");
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
    public void StrTokenizer440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer440");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("4", '#', 'a');
    }

    @Test
    public void StrTokenizer441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer441");
        char[] charArray5 = new char[] { ' ', ' ', 'a', '#', 'a' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray5, "4 ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
    }

    @Test
    public void StrTokenizer442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer442");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[]", '4', '#');
    }

    @Test
    public void StrTokenizer443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer443");
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
    public void StrTokenizer444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer444");
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
    public void StrTokenizer445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer445");
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
    public void StrTokenizer446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer446");
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
    public void StrTokenizer447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer447");
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
    public void StrTokenizer448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer448");
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
    public void StrTokenizer449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer449");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = strTokenizer1.getIgnoredMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("4 ", strMatcher2);
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer3.getQuoteMatcher();
        int int5 = strTokenizer3.size();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer3.reset();
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer450");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strTokenizer5.setIgnoredChar('#');
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer451");
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
    public void StrTokenizer452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer452");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        boolean boolean6 = strTokenizer5.hasNext();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void StrTokenizer453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer453");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, '4', 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.reset("");
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer454");
        char[] charArray0 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = strTokenizer3.setIgnoredChar(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer5);
    }

    @Test
    public void StrTokenizer455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer455");
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
    public void StrTokenizer456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer456");
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
    public void StrTokenizer457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer457");
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
    public void StrTokenizer458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer458");
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
    public void StrTokenizer459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer459");
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
    public void StrTokenizer460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer460");
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[]", strMatcher1);
        java.lang.String str3 = strTokenizer2.previousToken();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void StrTokenizer461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer461");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4 ", 'a');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strTokenizer2.setDelimiterString("StrTokenizer[]");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strTokenizer2.setIgnoreEmptyTokens(true);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = strTokenizer2.reset();
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer462");
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
    public void StrTokenizer463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer463");
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
    public void StrTokenizer464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer464");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4", ' ');
        boolean boolean3 = strTokenizer2.hasPrevious();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void StrTokenizer465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer465");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("hi!", 'a', 'a');
    }

    @Test
    public void StrTokenizer466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer466");
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
    public void StrTokenizer467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer467");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, 'a', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer7 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, "");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = new org.apache.commons.lang3.text.StrTokenizer(charArray2, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
    }

    @Test
    public void StrTokenizer468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer468");
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
    public void StrTokenizer469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer469");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4 ", 'a');
        java.lang.String str3 = strTokenizer2.nextToken();
        boolean boolean4 = strTokenizer2.hasNext();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4 " + "'", str3.equals("4 "));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void StrTokenizer470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer470");
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
    public void StrTokenizer471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer471");
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
    public void StrTokenizer472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer472");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", '#');
        java.lang.Class<?> wildcardClass3 = strTokenizer2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void StrTokenizer473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer473");
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
    public void StrTokenizer474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer474");
        char[] charArray0 = new char[] {};
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, 'a', '#');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer5 = new org.apache.commons.lang3.text.StrTokenizer(charArray0, '#');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = new org.apache.commons.lang3.text.StrTokenizer(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
    }

    @Test
    public void StrTokenizer475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer475");
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
    public void StrTokenizer476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer476");
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
    public void StrTokenizer477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer477");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("", "4 ");
        java.lang.String[] strArray3 = strTokenizer2.getTokenArray();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void StrTokenizer478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer478");
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
    public void StrTokenizer479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer479");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer0 = org.apache.commons.lang3.text.StrTokenizer.getTSVInstance();
        java.lang.String str1 = strTokenizer0.getContent();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = strTokenizer0.setIgnoredChar('#');
        int int4 = strTokenizer0.size();
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer480");
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
    public void StrTokenizer481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer481");
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
    public void StrTokenizer482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer482");
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
    public void StrTokenizer483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer483");
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
    public void StrTokenizer484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer484");
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
    public void StrTokenizer485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer485");
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
    public void StrTokenizer486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer486");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("", 'a', 'a');
    }

    @Test
    public void StrTokenizer487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer487");
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
    public void StrTokenizer488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer488");
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
    public void StrTokenizer489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer489");
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
    public void StrTokenizer490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer490");
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
    public void StrTokenizer491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer491");
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
    public void StrTokenizer492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer492");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("hi!", ' ', '#');
    }

    @Test
    public void StrTokenizer493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer493");
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
    public void StrTokenizer494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer494");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4 ", 'a');
        java.lang.String str3 = strTokenizer2.nextToken();
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = strTokenizer2.getQuoteMatcher();
        // The following exception was thrown during execution in StrTokenizer generation
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
    public void StrTokenizer495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer495");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("4", '4', '4');
    }

    @Test
    public void StrTokenizer496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer496");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer3 = new org.apache.commons.lang3.text.StrTokenizer("", 'a', '4');
        java.lang.String str4 = strTokenizer3.toString();
        boolean boolean5 = strTokenizer3.hasNext();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str4.equals("StrTokenizer[not tokenized yet]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void StrTokenizer497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer497");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer1 = new org.apache.commons.lang3.text.StrTokenizer("StrTokenizer[not tokenized yet]");
    }

    @Test
    public void StrTokenizer498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer498");
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
    public void StrTokenizer499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer499");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer2 = new org.apache.commons.lang3.text.StrTokenizer("4 ", '#');
        boolean boolean3 = strTokenizer2.hasPrevious();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void StrTokenizer500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrTokenizer0.StrTokenizer500");
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

