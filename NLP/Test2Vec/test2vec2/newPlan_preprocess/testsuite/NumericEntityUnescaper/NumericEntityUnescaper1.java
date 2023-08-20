package NumericEntityUnescaper;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NumericEntityUnescaper1 {

    public static boolean debug = false;

    @Test
    public void NumericEntityUnescaper501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper501");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            numericEntityUnescaper5.translate((java.lang.CharSequence) "FFFFFFFF", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
    }

    @Test
    public void NumericEntityUnescaper502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper502");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = numericEntityUnescaper2.with(charSequenceTranslatorArray5);
        java.lang.String str8 = charSequenceTranslator6.translate((java.lang.CharSequence) "0");
        java.lang.Class<?> wildcardClass9 = charSequenceTranslator6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper503");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.CharSequence charSequence6 = null;
        java.lang.String str7 = numericEntityUnescaper5.translate(charSequence6);
        java.lang.CharSequence charSequence8 = null;
        java.lang.String str9 = numericEntityUnescaper5.translate(charSequence8);
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void NumericEntityUnescaper504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper504");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "");
        java.lang.String str6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            numericEntityUnescaper2.translate((java.lang.CharSequence) "A", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
    }

    @Test
    public void NumericEntityUnescaper505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper505");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            numericEntityUnescaper2.translate((java.lang.CharSequence) "FFFFFFFF", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
    }

    @Test
    public void NumericEntityUnescaper506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper506");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        java.lang.String str6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "64");
        java.lang.String str8 = numericEntityUnescaper2.translate((java.lang.CharSequence) "34");
        java.lang.Class<?> wildcardClass9 = numericEntityUnescaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "34" + "'", str8.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper507");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = numericEntityUnescaper1.with(charSequenceTranslatorArray4);
        java.lang.String str7 = charSequenceTranslator5.translate((java.lang.CharSequence) "");
        java.lang.String str9 = charSequenceTranslator5.translate((java.lang.CharSequence) "23");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "23" + "'", str9.equals("23"));
    }

    @Test
    public void NumericEntityUnescaper508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper508");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        java.lang.String str6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        java.lang.String str8 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "61" + "'", str8.equals("61"));
    }

    @Test
    public void NumericEntityUnescaper509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper509");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.io.Writer writer6 = null;
        int int7 = numericEntityUnescaper3.translate((java.lang.CharSequence) "34", (int) (byte) 1, writer6);
        java.lang.String str9 = numericEntityUnescaper3.translate((java.lang.CharSequence) "0");
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0" + "'", str9.equals("0"));
    }

    @Test
    public void NumericEntityUnescaper510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper510");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            int int9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "23", (int) (short) 100, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "64" + "'", str3.equals("64"));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void NumericEntityUnescaper511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper511");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "61");
        java.lang.CharSequence charSequence6 = null;
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            int int9 = numericEntityUnescaper1.translate(charSequence6, 0, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "61" + "'", str5.equals("61"));
    }

    @Test
    public void NumericEntityUnescaper512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper512");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str7 = numericEntityUnescaper5.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray8 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator9 = numericEntityUnescaper5.with(charSequenceTranslatorArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void NumericEntityUnescaper513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper513");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            numericEntityUnescaper5.translate((java.lang.CharSequence) "", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION3 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION3.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray4);
    }

    @Test
    public void NumericEntityUnescaper514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper514");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "20");
        java.io.Writer writer6 = null;
        int int7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "hi!", 0, writer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "20" + "'", str3.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void NumericEntityUnescaper515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper515");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            numericEntityUnescaper3.translate((java.lang.CharSequence) "1", writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
    }

    @Test
    public void NumericEntityUnescaper516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper516");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.CharSequence charSequence6 = null;
        java.lang.String str7 = numericEntityUnescaper5.translate(charSequence6);
        java.lang.String str9 = numericEntityUnescaper5.translate((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void NumericEntityUnescaper517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper517");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "61");
        java.lang.Class<?> wildcardClass6 = numericEntityUnescaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "61" + "'", str5.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void NumericEntityUnescaper518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper518");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "");
        java.lang.String str6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION7 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean8 = numericEntityUnescaper2.isSet(oPTION7);
        java.lang.Class<?> wildcardClass9 = numericEntityUnescaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
        org.junit.Assert.assertTrue("'" + oPTION7 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION7.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper519");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = numericEntityUnescaper1.with(charSequenceTranslatorArray4);
        java.lang.String str7 = charSequenceTranslator5.translate((java.lang.CharSequence) "64");
        java.lang.String str9 = charSequenceTranslator5.translate((java.lang.CharSequence) "A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "64" + "'", str7.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "A" + "'", str9.equals("A"));
    }

    @Test
    public void NumericEntityUnescaper520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper520");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "");
        java.lang.String str6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "1");
        java.lang.String str8 = numericEntityUnescaper2.translate((java.lang.CharSequence) "64");
        java.lang.Class<?> wildcardClass9 = numericEntityUnescaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "64" + "'", str8.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper521");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "1");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION6 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean7 = numericEntityUnescaper1.isSet(oPTION6);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray8 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION6 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper9 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        org.junit.Assert.assertTrue("'" + oPTION6 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION6.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray8);
    }

    @Test
    public void NumericEntityUnescaper522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper522");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str9 = numericEntityUnescaper7.translate((java.lang.CharSequence) "0");
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0" + "'", str9.equals("0"));
    }

    @Test
    public void NumericEntityUnescaper523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper523");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.CharSequence charSequence4 = null;
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            numericEntityUnescaper3.translate(charSequence4, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
    }

    @Test
    public void NumericEntityUnescaper524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper524");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "20");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            int int7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "1", (int) '#', writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "20" + "'", str3.equals("20"));
    }

    @Test
    public void NumericEntityUnescaper525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper525");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            int int9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "1", (int) (byte) 1, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "64" + "'", str3.equals("64"));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void NumericEntityUnescaper526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper526");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.io.Writer writer6 = null;
        int int7 = numericEntityUnescaper3.translate((java.lang.CharSequence) "20", (int) (short) 0, writer6);
        java.lang.String str9 = numericEntityUnescaper3.translate((java.lang.CharSequence) "23");
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "23" + "'", str9.equals("23"));
    }

    @Test
    public void NumericEntityUnescaper527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper527");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str5 = numericEntityUnescaper3.translate((java.lang.CharSequence) "34");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            numericEntityUnescaper3.translate((java.lang.CharSequence) "23", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "34" + "'", str5.equals("34"));
    }

    @Test
    public void NumericEntityUnescaper528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper528");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            numericEntityUnescaper1.translate((java.lang.CharSequence) "61", writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FFFFFFFF" + "'", str3.equals("FFFFFFFF"));
    }

    @Test
    public void NumericEntityUnescaper529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper529");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "34");
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "34");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "34" + "'", str7.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "34" + "'", str9.equals("34"));
    }

    @Test
    public void NumericEntityUnescaper530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper530");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            numericEntityUnescaper4.translate((java.lang.CharSequence) "A", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
    }

    @Test
    public void NumericEntityUnescaper531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper531");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence5 = null;
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            numericEntityUnescaper2.translate(charSequence5, writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void NumericEntityUnescaper532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper532");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = numericEntityUnescaper1.with(charSequenceTranslatorArray4);
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "20");
        java.lang.Class<?> wildcardClass8 = numericEntityUnescaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "20" + "'", str7.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper533");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION5 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean6 = numericEntityUnescaper2.isSet(oPTION5);
        java.lang.Class<?> wildcardClass7 = oPTION5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + oPTION5 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION5.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void NumericEntityUnescaper534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper534");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION6 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean7 = numericEntityUnescaper1.isSet(oPTION6);
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + oPTION6 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION6.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "20" + "'", str9.equals("20"));
    }

    @Test
    public void NumericEntityUnescaper535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper535");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        java.io.Writer writer6 = null;
        int int7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "FFFFFFFF", (int) (byte) 1, writer6);
        java.lang.Class<?> wildcardClass8 = numericEntityUnescaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "64" + "'", str3.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper536");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            int int9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "0", (int) (short) -1, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void NumericEntityUnescaper537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper537");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.io.Writer writer6 = null;
        int int7 = numericEntityUnescaper3.translate((java.lang.CharSequence) "20", (int) (short) 0, writer6);
        java.lang.String str9 = numericEntityUnescaper3.translate((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void NumericEntityUnescaper538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper538");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str6 = numericEntityUnescaper4.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            numericEntityUnescaper4.translate((java.lang.CharSequence) "FFFFFFFF", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void NumericEntityUnescaper539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper539");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str7 = numericEntityUnescaper5.translate((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = null;
        java.lang.String str9 = numericEntityUnescaper5.translate(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void NumericEntityUnescaper540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper540");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "1");
        java.lang.Class<?> wildcardClass8 = numericEntityUnescaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "64" + "'", str3.equals("64"));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper541");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = numericEntityUnescaper1.with(charSequenceTranslatorArray4);
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "20");
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "20" + "'", str7.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void NumericEntityUnescaper542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper542");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper3.isSet(oPTION4);
        java.lang.Class<?> wildcardClass6 = oPTION4.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void NumericEntityUnescaper543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper543");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str6 = numericEntityUnescaper4.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str8 = numericEntityUnescaper4.translate((java.lang.CharSequence) "64");
        java.lang.Class<?> wildcardClass9 = numericEntityUnescaper4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "64" + "'", str8.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper544");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION5 = null;
        boolean boolean6 = numericEntityUnescaper4.isSet(oPTION5);
        java.lang.String str8 = numericEntityUnescaper4.translate((java.lang.CharSequence) "20");
        java.lang.Class<?> wildcardClass9 = numericEntityUnescaper4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "20" + "'", str8.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper545");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        java.lang.String str6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "64");
        java.lang.String str8 = numericEntityUnescaper2.translate((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void NumericEntityUnescaper546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper546");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            numericEntityUnescaper4.translate((java.lang.CharSequence) "1", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
    }

    @Test
    public void NumericEntityUnescaper547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper547");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str5 = numericEntityUnescaper3.translate((java.lang.CharSequence) "");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            int int9 = numericEntityUnescaper3.translate((java.lang.CharSequence) "0", (int) (byte) 100, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void NumericEntityUnescaper548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper548");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION6 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        boolean boolean7 = numericEntityUnescaper5.isSet(oPTION6);
        java.lang.String str9 = numericEntityUnescaper5.translate((java.lang.CharSequence) "23");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION6 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION6.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "23" + "'", str9.equals("23"));
    }

    @Test
    public void NumericEntityUnescaper549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper549");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            numericEntityUnescaper6.translate((java.lang.CharSequence) "hi!", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
    }

    @Test
    public void NumericEntityUnescaper550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper550");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            numericEntityUnescaper1.translate((java.lang.CharSequence) "1", writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void NumericEntityUnescaper551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper551");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION5 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        boolean boolean6 = numericEntityUnescaper2.isSet(oPTION5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            numericEntityUnescaper2.translate((java.lang.CharSequence) "34", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        org.junit.Assert.assertTrue("'" + oPTION5 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION5.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void NumericEntityUnescaper552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper552");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            numericEntityUnescaper5.translate((java.lang.CharSequence) "FFFFFFFF", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION3 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION3.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray4);
    }

    @Test
    public void NumericEntityUnescaper553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper553");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "");
        java.lang.String str6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "1");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            numericEntityUnescaper2.translate((java.lang.CharSequence) "0", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
    }

    @Test
    public void NumericEntityUnescaper554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper554");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION5 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean6 = numericEntityUnescaper4.isSet(oPTION5);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION7 = null;
        boolean boolean8 = numericEntityUnescaper4.isSet(oPTION7);
        java.lang.Class<?> wildcardClass9 = numericEntityUnescaper4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION5 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION5.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper555");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = numericEntityUnescaper1.with(charSequenceTranslatorArray4);
        java.lang.Class<?> wildcardClass6 = charSequenceTranslator5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void NumericEntityUnescaper556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper556");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str7 = numericEntityUnescaper5.translate((java.lang.CharSequence) "23");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION8 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        boolean boolean9 = numericEntityUnescaper5.isSet(oPTION8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "23" + "'", str7.equals("23"));
        org.junit.Assert.assertTrue("'" + oPTION8 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION8.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void NumericEntityUnescaper557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper557");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean5 = numericEntityUnescaper3.isSet(oPTION4);
        java.lang.String str7 = numericEntityUnescaper3.translate((java.lang.CharSequence) "23");
        java.lang.String str9 = numericEntityUnescaper3.translate((java.lang.CharSequence) "64");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "23" + "'", str7.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "64" + "'", str9.equals("64"));
    }

    @Test
    public void NumericEntityUnescaper558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper558");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer6 = null;
        int int7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "23", (int) (byte) 1, writer6);
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "61");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FFFFFFFF" + "'", str3.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "61" + "'", str9.equals("61"));
    }

    @Test
    public void NumericEntityUnescaper559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper559");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer7 = null;
        int int8 = numericEntityUnescaper4.translate((java.lang.CharSequence) "FFFFFFFF", (int) (short) 0, writer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void NumericEntityUnescaper560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper560");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str6 = numericEntityUnescaper4.translate((java.lang.CharSequence) "A");
        java.lang.Class<?> wildcardClass7 = numericEntityUnescaper4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void NumericEntityUnescaper561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper561");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str6 = numericEntityUnescaper4.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            numericEntityUnescaper4.translate((java.lang.CharSequence) "64", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
    }

    @Test
    public void NumericEntityUnescaper562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper562");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            int int6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "23", (int) (byte) 100, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
    }

    @Test
    public void NumericEntityUnescaper563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper563");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str5 = numericEntityUnescaper3.translate((java.lang.CharSequence) "34");
        java.lang.String str7 = numericEntityUnescaper3.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass8 = numericEntityUnescaper3.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "34" + "'", str5.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper564");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str7 = numericEntityUnescaper5.translate((java.lang.CharSequence) "23");
        java.lang.String str9 = numericEntityUnescaper5.translate((java.lang.CharSequence) "A");
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "23" + "'", str7.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "A" + "'", str9.equals("A"));
    }

    @Test
    public void NumericEntityUnescaper565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper565");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str5 = numericEntityUnescaper3.translate((java.lang.CharSequence) "1");
        java.lang.String str7 = numericEntityUnescaper3.translate((java.lang.CharSequence) "1");
        java.lang.String str9 = numericEntityUnescaper3.translate((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void NumericEntityUnescaper566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper566");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = numericEntityUnescaper1.with(charSequenceTranslatorArray4);
        java.lang.String str7 = charSequenceTranslator5.translate((java.lang.CharSequence) "");
        java.lang.String str9 = charSequenceTranslator5.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "20" + "'", str9.equals("20"));
    }

    @Test
    public void NumericEntityUnescaper567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper567");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            numericEntityUnescaper2.translate((java.lang.CharSequence) "61", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void NumericEntityUnescaper568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper568");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = null;
        boolean boolean5 = numericEntityUnescaper3.isSet(oPTION4);
        java.lang.String str7 = numericEntityUnescaper3.translate((java.lang.CharSequence) "1");
        java.lang.String str9 = numericEntityUnescaper3.translate((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void NumericEntityUnescaper569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper569");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str6 = numericEntityUnescaper4.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            numericEntityUnescaper4.translate((java.lang.CharSequence) "20", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void NumericEntityUnescaper570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper570");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION5 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean6 = numericEntityUnescaper2.isSet(oPTION5);
        java.lang.String str8 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + oPTION5 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION5.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "A" + "'", str8.equals("A"));
    }

    @Test
    public void NumericEntityUnescaper571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper571");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        java.lang.String str7 = numericEntityUnescaper5.translate((java.lang.CharSequence) "34");
        java.lang.String str9 = numericEntityUnescaper5.translate((java.lang.CharSequence) "23");
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION3 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION3.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "34" + "'", str7.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "23" + "'", str9.equals("23"));
    }

    @Test
    public void NumericEntityUnescaper572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper572");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = numericEntityUnescaper2.with(charSequenceTranslatorArray5);
        java.lang.String str8 = charSequenceTranslator6.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass9 = charSequenceTranslator6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper573");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "1");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION6 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean7 = numericEntityUnescaper1.isSet(oPTION6);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray8 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator9 = numericEntityUnescaper1.with(charSequenceTranslatorArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        org.junit.Assert.assertTrue("'" + oPTION6 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION6.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void NumericEntityUnescaper574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper574");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION5 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean6 = numericEntityUnescaper4.isSet(oPTION5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            numericEntityUnescaper4.translate((java.lang.CharSequence) "20", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION5 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION5.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void NumericEntityUnescaper575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper575");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "20");
        java.lang.Class<?> wildcardClass4 = numericEntityUnescaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "20" + "'", str3.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void NumericEntityUnescaper576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper576");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "");
        java.lang.String str6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "1");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            numericEntityUnescaper2.translate((java.lang.CharSequence) "", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
    }

    @Test
    public void NumericEntityUnescaper577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper577");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION5 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean6 = numericEntityUnescaper2.isSet(oPTION5);
        java.lang.String str8 = numericEntityUnescaper2.translate((java.lang.CharSequence) "23");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + oPTION5 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION5.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "23" + "'", str8.equals("23"));
    }

    @Test
    public void NumericEntityUnescaper578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper578");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        java.lang.String str6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            numericEntityUnescaper2.translate((java.lang.CharSequence) "20", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
    }

    @Test
    public void NumericEntityUnescaper579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper579");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION5 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean6 = numericEntityUnescaper2.isSet(oPTION5);
        java.lang.Class<?> wildcardClass7 = oPTION5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        org.junit.Assert.assertTrue("'" + oPTION5 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION5.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void NumericEntityUnescaper580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper580");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "20");
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "64" + "'", str3.equals("64"));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "20" + "'", str7.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void NumericEntityUnescaper581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper581");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION6 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean7 = numericEntityUnescaper1.isSet(oPTION6);
        java.lang.Class<?> wildcardClass8 = numericEntityUnescaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "64" + "'", str3.equals("64"));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + oPTION6 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION6.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper582");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION6 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean7 = numericEntityUnescaper1.isSet(oPTION6);
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + oPTION6 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION6.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0" + "'", str9.equals("0"));
    }

    @Test
    public void NumericEntityUnescaper583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper583");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str5 = numericEntityUnescaper3.translate((java.lang.CharSequence) "34");
        java.lang.String str7 = numericEntityUnescaper3.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray8 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator9 = numericEntityUnescaper3.with(charSequenceTranslatorArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "34" + "'", str5.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void NumericEntityUnescaper584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper584");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper8 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.Class<?> wildcardClass9 = numericEntityUnescaper8.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper585");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "20");
        java.lang.CharSequence charSequence8 = null;
        java.lang.String str9 = numericEntityUnescaper1.translate(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "64" + "'", str3.equals("64"));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "20" + "'", str7.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void NumericEntityUnescaper586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper586");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str5 = numericEntityUnescaper3.translate((java.lang.CharSequence) "34");
        java.lang.String str7 = numericEntityUnescaper3.translate((java.lang.CharSequence) "23");
        java.lang.String str9 = numericEntityUnescaper3.translate((java.lang.CharSequence) "20");
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "34" + "'", str5.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "23" + "'", str7.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "20" + "'", str9.equals("20"));
    }

    @Test
    public void NumericEntityUnescaper587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper587");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer4 = null;
        int int5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "0", (int) (short) 0, writer4);
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "34");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "34" + "'", str7.equals("34"));
    }

    @Test
    public void NumericEntityUnescaper588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper588");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str7 = numericEntityUnescaper5.translate((java.lang.CharSequence) "23");
        java.lang.String str9 = numericEntityUnescaper5.translate((java.lang.CharSequence) "34");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "23" + "'", str7.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "34" + "'", str9.equals("34"));
    }

    @Test
    public void NumericEntityUnescaper589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper589");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "20");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            int int7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "20", 10, writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "20" + "'", str3.equals("20"));
    }

    @Test
    public void NumericEntityUnescaper590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper590");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str7 = numericEntityUnescaper5.translate((java.lang.CharSequence) "");
        java.lang.String str9 = numericEntityUnescaper5.translate((java.lang.CharSequence) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void NumericEntityUnescaper591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper591");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "61");
        java.io.Writer writer8 = null;
        int int9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "FFFFFFFF", (int) (short) 0, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "61" + "'", str5.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void NumericEntityUnescaper592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper592");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        java.lang.Class<?> wildcardClass8 = numericEntityUnescaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "64" + "'", str7.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper593");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = numericEntityUnescaper1.with(charSequenceTranslatorArray6);
        java.lang.CharSequence charSequence8 = null;
        java.lang.String str9 = charSequenceTranslator7.translate(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void NumericEntityUnescaper594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper594");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "23");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION8 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean9 = numericEntityUnescaper1.isSet(oPTION8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "23" + "'", str7.equals("23"));
        org.junit.Assert.assertTrue("'" + oPTION8 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION8.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void NumericEntityUnescaper595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper595");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "61");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "64" + "'", str7.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "61" + "'", str9.equals("61"));
    }

    @Test
    public void NumericEntityUnescaper596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper596");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            int int7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A", 1, writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void NumericEntityUnescaper597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper597");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = numericEntityUnescaper1.with(charSequenceTranslatorArray4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            numericEntityUnescaper1.translate((java.lang.CharSequence) "61", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator5);
    }

    @Test
    public void NumericEntityUnescaper598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper598");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = numericEntityUnescaper1.with(charSequenceTranslatorArray4);
        java.lang.String str7 = charSequenceTranslator5.translate((java.lang.CharSequence) "0");
        java.lang.String str9 = charSequenceTranslator5.translate((java.lang.CharSequence) "FFFFFFFF");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0" + "'", str7.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "FFFFFFFF" + "'", str9.equals("FFFFFFFF"));
    }

    @Test
    public void NumericEntityUnescaper599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper599");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "20");
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "61");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FFFFFFFF" + "'", str3.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "20" + "'", str7.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "61" + "'", str9.equals("61"));
    }

    @Test
    public void NumericEntityUnescaper600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper600");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str5 = numericEntityUnescaper3.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass6 = numericEntityUnescaper3.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void NumericEntityUnescaper601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper601");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean5 = numericEntityUnescaper3.isSet(oPTION4);
        java.lang.String str7 = numericEntityUnescaper3.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "20" + "'", str7.equals("20"));
    }

    @Test
    public void NumericEntityUnescaper602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper602");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer4 = null;
        int int5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "1", 0, writer4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION6 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        boolean boolean7 = numericEntityUnescaper1.isSet(oPTION6);
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + oPTION6 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION6.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void NumericEntityUnescaper603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper603");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = numericEntityUnescaper1.with(charSequenceTranslatorArray4);
        java.lang.String str7 = charSequenceTranslator5.translate((java.lang.CharSequence) "1");
        java.lang.String str9 = charSequenceTranslator5.translate((java.lang.CharSequence) "FFFFFFFF");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "FFFFFFFF" + "'", str9.equals("FFFFFFFF"));
    }

    @Test
    public void NumericEntityUnescaper604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper604");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION5 = null;
        boolean boolean6 = numericEntityUnescaper4.isSet(oPTION5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            numericEntityUnescaper4.translate((java.lang.CharSequence) "61", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void NumericEntityUnescaper605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper605");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean5 = numericEntityUnescaper3.isSet(oPTION4);
        java.lang.String str7 = numericEntityUnescaper3.translate((java.lang.CharSequence) "23");
        java.lang.String str9 = numericEntityUnescaper3.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "23" + "'", str7.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "20" + "'", str9.equals("20"));
    }

    @Test
    public void NumericEntityUnescaper606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper606");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "61");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "23");
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "61" + "'", str5.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "23" + "'", str7.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void NumericEntityUnescaper607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper607");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        boolean boolean4 = numericEntityUnescaper2.isSet(oPTION3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            numericEntityUnescaper2.translate((java.lang.CharSequence) "61", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION3 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION3.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void NumericEntityUnescaper608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper608");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = numericEntityUnescaper1.with(charSequenceTranslatorArray4);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = numericEntityUnescaper1.with(charSequenceTranslatorArray6);
        java.lang.Class<?> wildcardClass8 = charSequenceTranslator7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper609");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.io.Writer writer6 = null;
        int int7 = numericEntityUnescaper3.translate((java.lang.CharSequence) "61", (int) (byte) 1, writer6);
        java.lang.Class<?> wildcardClass8 = numericEntityUnescaper3.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper610");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FFFFFFFF" + "'", str3.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
    }

    @Test
    public void NumericEntityUnescaper611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper611");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str5 = numericEntityUnescaper3.translate((java.lang.CharSequence) "34");
        java.lang.String str7 = numericEntityUnescaper3.translate((java.lang.CharSequence) "23");
        java.lang.Class<?> wildcardClass8 = numericEntityUnescaper3.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "34" + "'", str5.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "23" + "'", str7.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper612");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "20");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            int int7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "FFFFFFFF", (-1), writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "20" + "'", str3.equals("20"));
    }

    @Test
    public void NumericEntityUnescaper613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper613");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str5 = numericEntityUnescaper3.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION6 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        boolean boolean7 = numericEntityUnescaper3.isSet(oPTION6);
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + oPTION6 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION6.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void NumericEntityUnescaper614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper614");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0" + "'", str7.equals("0"));
    }

    @Test
    public void NumericEntityUnescaper615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper615");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            int int8 = numericEntityUnescaper2.translate((java.lang.CharSequence) "", (int) (byte) 0, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
    }

    @Test
    public void NumericEntityUnescaper616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper616");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.Class<?> wildcardClass7 = numericEntityUnescaper6.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void NumericEntityUnescaper617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper617");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            int int7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64", (int) '#', writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void NumericEntityUnescaper618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper618");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = numericEntityUnescaper1.with(charSequenceTranslatorArray4);
        java.lang.String str7 = charSequenceTranslator5.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "20" + "'", str7.equals("20"));
    }

    @Test
    public void NumericEntityUnescaper619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper619");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION6 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean7 = numericEntityUnescaper5.isSet(oPTION6);
        boolean boolean8 = numericEntityUnescaper3.isSet(oPTION6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray4);
        org.junit.Assert.assertTrue("'" + oPTION6 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION6.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void NumericEntityUnescaper620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper620");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "20");
        java.io.Writer writer6 = null;
        int int7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "FFFFFFFF", (int) (byte) 1, writer6);
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "20" + "'", str3.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void NumericEntityUnescaper621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper621");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            numericEntityUnescaper1.translate((java.lang.CharSequence) "23", writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "64" + "'", str3.equals("64"));
    }

    @Test
    public void NumericEntityUnescaper622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper622");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        java.lang.String str7 = numericEntityUnescaper5.translate((java.lang.CharSequence) "34");
        java.lang.String str9 = numericEntityUnescaper5.translate((java.lang.CharSequence) "34");
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION3 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION3.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "34" + "'", str7.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "34" + "'", str9.equals("34"));
    }

    @Test
    public void NumericEntityUnescaper623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper623");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.lang.CharSequence charSequence6 = null;
        java.lang.String str7 = numericEntityUnescaper1.translate(charSequence6);
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "64" + "'", str3.equals("64"));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "20" + "'", str9.equals("20"));
    }

    @Test
    public void NumericEntityUnescaper624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper624");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
    }

    @Test
    public void NumericEntityUnescaper625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper625");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION5 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean6 = numericEntityUnescaper4.isSet(oPTION5);
        java.lang.String str8 = numericEntityUnescaper4.translate((java.lang.CharSequence) "23");
        java.lang.Class<?> wildcardClass9 = numericEntityUnescaper4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION5 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION5.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "23" + "'", str8.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper626");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            numericEntityUnescaper1.translate((java.lang.CharSequence) "20", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "64" + "'", str3.equals("64"));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void NumericEntityUnescaper627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper627");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = numericEntityUnescaper1.with(charSequenceTranslatorArray4);
        java.lang.String str7 = charSequenceTranslator5.translate((java.lang.CharSequence) "1");
        java.lang.String str9 = charSequenceTranslator5.translate((java.lang.CharSequence) "34");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "34" + "'", str9.equals("34"));
    }

    @Test
    public void NumericEntityUnescaper628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper628");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str6 = numericEntityUnescaper4.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            numericEntityUnescaper4.translate((java.lang.CharSequence) "23", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
    }

    @Test
    public void NumericEntityUnescaper629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper629");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            int int9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A", (int) (short) -1, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "64" + "'", str3.equals("64"));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void NumericEntityUnescaper630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper630");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "");
        java.lang.String str6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        java.lang.String str8 = numericEntityUnescaper2.translate((java.lang.CharSequence) "23");
        java.lang.Class<?> wildcardClass9 = numericEntityUnescaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "23" + "'", str8.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper631");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = null;
        boolean boolean5 = numericEntityUnescaper3.isSet(oPTION4);
        java.io.Writer writer8 = null;
        int int9 = numericEntityUnescaper3.translate((java.lang.CharSequence) "23", 1, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void NumericEntityUnescaper632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper632");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FFFFFFFF" + "'", str3.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "64" + "'", str7.equals("64"));
    }

    @Test
    public void NumericEntityUnescaper633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper633");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str6 = numericEntityUnescaper4.translate((java.lang.CharSequence) "23");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION7 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        boolean boolean8 = numericEntityUnescaper4.isSet(oPTION7);
        java.lang.Class<?> wildcardClass9 = oPTION7.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "23" + "'", str6.equals("23"));
        org.junit.Assert.assertTrue("'" + oPTION7 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION7.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper634");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION5 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean6 = numericEntityUnescaper2.isSet(oPTION5);
        java.lang.Class<?> wildcardClass7 = numericEntityUnescaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        org.junit.Assert.assertTrue("'" + oPTION5 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION5.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void NumericEntityUnescaper635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper635");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "1");
        java.io.Writer writer8 = null;
        int int9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "1", (int) (short) 0, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void NumericEntityUnescaper636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper636");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str5 = numericEntityUnescaper3.translate((java.lang.CharSequence) "1");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION6 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean7 = numericEntityUnescaper3.isSet(oPTION6);
        java.lang.Class<?> wildcardClass8 = numericEntityUnescaper3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        org.junit.Assert.assertTrue("'" + oPTION6 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION6.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper637");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "0");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            numericEntityUnescaper2.translate((java.lang.CharSequence) "23", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
    }

    @Test
    public void NumericEntityUnescaper638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper638");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        java.lang.String str6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            numericEntityUnescaper2.translate((java.lang.CharSequence) "34", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
    }

    @Test
    public void NumericEntityUnescaper639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper639");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "23");
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "23" + "'", str7.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void NumericEntityUnescaper640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper640");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        java.lang.String str6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void NumericEntityUnescaper641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper641");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        java.io.Writer writer6 = null;
        int int7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "hi!", (int) (byte) 1, writer6);
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void NumericEntityUnescaper642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper642");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "34");
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "34");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "64" + "'", str3.equals("64"));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "34" + "'", str7.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "34" + "'", str9.equals("34"));
    }

    @Test
    public void NumericEntityUnescaper643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper643");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            int int8 = numericEntityUnescaper2.translate((java.lang.CharSequence) "hi!", (int) 'a', writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
    }

    @Test
    public void NumericEntityUnescaper644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper644");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str5 = numericEntityUnescaper3.translate((java.lang.CharSequence) "1");
        java.lang.String str7 = numericEntityUnescaper3.translate((java.lang.CharSequence) "1");
        java.lang.String str9 = numericEntityUnescaper3.translate((java.lang.CharSequence) "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0" + "'", str9.equals("0"));
    }

    @Test
    public void NumericEntityUnescaper645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper645");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        java.lang.Class<?> wildcardClass8 = oPTIONArray4.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION3 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION3.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper646");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "1");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION6 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean7 = numericEntityUnescaper1.isSet(oPTION6);
        java.lang.Class<?> wildcardClass8 = oPTION6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        org.junit.Assert.assertTrue("'" + oPTION6 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION6.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper647");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "23");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "23" + "'", str7.equals("23"));
    }

    @Test
    public void NumericEntityUnescaper648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper648");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = numericEntityUnescaper1.with(charSequenceTranslatorArray6);
        java.lang.Class<?> wildcardClass8 = charSequenceTranslatorArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper649");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = numericEntityUnescaper1.with(charSequenceTranslatorArray4);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = numericEntityUnescaper1.with(charSequenceTranslatorArray6);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray8 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator9 = charSequenceTranslator7.with(charSequenceTranslatorArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
    }

    @Test
    public void NumericEntityUnescaper650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper650");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean5 = numericEntityUnescaper3.isSet(oPTION4);
        java.io.Writer writer8 = null;
        int int9 = numericEntityUnescaper3.translate((java.lang.CharSequence) "34", 0, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void NumericEntityUnescaper651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper651");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "FFFFFFFF");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "64" + "'", str3.equals("64"));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "FFFFFFFF" + "'", str7.equals("FFFFFFFF"));
    }

    @Test
    public void NumericEntityUnescaper652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper652");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            numericEntityUnescaper1.translate((java.lang.CharSequence) "61", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void NumericEntityUnescaper653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper653");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            numericEntityUnescaper5.translate((java.lang.CharSequence) "20", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
    }

    @Test
    public void NumericEntityUnescaper654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper654");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            int int7 = numericEntityUnescaper3.translate((java.lang.CharSequence) "20", (int) (byte) -1, writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
    }

    @Test
    public void NumericEntityUnescaper655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper655");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.io.Writer writer6 = null;
        int int7 = numericEntityUnescaper3.translate((java.lang.CharSequence) "FFFFFFFF", (int) (byte) 0, writer6);
        java.lang.Class<?> wildcardClass8 = numericEntityUnescaper3.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper656");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str6 = numericEntityUnescaper4.translate((java.lang.CharSequence) "A");
        java.lang.CharSequence charSequence7 = null;
        java.lang.String str8 = numericEntityUnescaper4.translate(charSequence7);
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void NumericEntityUnescaper657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper657");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.lang.CharSequence charSequence6 = null;
        java.lang.String str7 = numericEntityUnescaper1.translate(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "64" + "'", str3.equals("64"));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void NumericEntityUnescaper658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper658");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass8 = numericEntityUnescaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper659");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            numericEntityUnescaper2.translate((java.lang.CharSequence) "A", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
    }

    @Test
    public void NumericEntityUnescaper660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper660");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = numericEntityUnescaper2.with(charSequenceTranslatorArray5);
        java.lang.String str8 = numericEntityUnescaper2.translate((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void NumericEntityUnescaper661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper661");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            numericEntityUnescaper2.translate((java.lang.CharSequence) "A", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void NumericEntityUnescaper662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper662");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION5 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean6 = numericEntityUnescaper2.isSet(oPTION5);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION5 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper8 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray7);
        java.lang.Class<?> wildcardClass9 = numericEntityUnescaper8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        org.junit.Assert.assertTrue("'" + oPTION5 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION5.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper663");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.CharSequence charSequence5 = null;
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            numericEntityUnescaper4.translate(charSequence5, writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
    }

    @Test
    public void NumericEntityUnescaper664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper664");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "20");
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "64" + "'", str3.equals("64"));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "20" + "'", str7.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "A" + "'", str9.equals("A"));
    }

    @Test
    public void NumericEntityUnescaper665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper665");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "20");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            int int9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64", 100, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "64" + "'", str3.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "20" + "'", str5.equals("20"));
    }

    @Test
    public void NumericEntityUnescaper666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper666");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer4 = null;
        int int5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "0", (int) (short) 0, writer4);
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "23");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "23" + "'", str7.equals("23"));
    }

    @Test
    public void NumericEntityUnescaper667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper667");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str5 = numericEntityUnescaper3.translate((java.lang.CharSequence) "");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            numericEntityUnescaper3.translate((java.lang.CharSequence) "FFFFFFFF", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void NumericEntityUnescaper668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper668");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str5 = numericEntityUnescaper3.translate((java.lang.CharSequence) "1");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION6 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean7 = numericEntityUnescaper3.isSet(oPTION6);
        java.lang.String str9 = numericEntityUnescaper3.translate((java.lang.CharSequence) "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        org.junit.Assert.assertTrue("'" + oPTION6 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION6.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0" + "'", str9.equals("0"));
    }

    @Test
    public void NumericEntityUnescaper669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper669");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            int int8 = numericEntityUnescaper4.translate((java.lang.CharSequence) "", 0, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
    }

    @Test
    public void NumericEntityUnescaper670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper670");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str6 = numericEntityUnescaper4.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            numericEntityUnescaper4.translate((java.lang.CharSequence) "1", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
    }

    @Test
    public void NumericEntityUnescaper671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper671");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "64" + "'", str3.equals("64"));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "64" + "'", str7.equals("64"));
    }

    @Test
    public void NumericEntityUnescaper672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper672");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str6 = numericEntityUnescaper4.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str8 = numericEntityUnescaper4.translate((java.lang.CharSequence) "1");
        java.lang.Class<?> wildcardClass9 = numericEntityUnescaper4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper673");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str7 = numericEntityUnescaper5.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION8 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean9 = numericEntityUnescaper5.isSet(oPTION8);
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + oPTION8 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION8.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void NumericEntityUnescaper674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper674");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            numericEntityUnescaper1.translate((java.lang.CharSequence) "FFFFFFFF", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "64" + "'", str3.equals("64"));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void NumericEntityUnescaper675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper675");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "1");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "61");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "61" + "'", str7.equals("61"));
    }

    @Test
    public void NumericEntityUnescaper676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper676");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in NumericEntityUnescaper generation
        try {
            int int8 = numericEntityUnescaper2.translate((java.lang.CharSequence) "", 1, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
    }

    @Test
    public void NumericEntityUnescaper677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper677");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str7 = numericEntityUnescaper5.translate((java.lang.CharSequence) "");
        java.lang.String str9 = numericEntityUnescaper5.translate((java.lang.CharSequence) "64");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "64" + "'", str9.equals("64"));
    }

    @Test
    public void NumericEntityUnescaper678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper678");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str5 = numericEntityUnescaper3.translate((java.lang.CharSequence) "");
        java.lang.String str7 = numericEntityUnescaper3.translate((java.lang.CharSequence) "A");
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "A" + "'", str7.equals("A"));
    }

    @Test
    public void NumericEntityUnescaper679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper679");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper8 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.Class<?> wildcardClass9 = numericEntityUnescaper8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper680");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str5 = numericEntityUnescaper3.translate((java.lang.CharSequence) "20");
        java.lang.String str7 = numericEntityUnescaper3.translate((java.lang.CharSequence) "20");
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "20" + "'", str5.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "20" + "'", str7.equals("20"));
    }

    @Test
    public void NumericEntityUnescaper681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper681");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION5 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean6 = numericEntityUnescaper4.isSet(oPTION5);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION5 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper8 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray7);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper9 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION5 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION5.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray7);
    }

    @Test
    public void NumericEntityUnescaper682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.NumericEntityUnescaper682");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION5 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean6 = numericEntityUnescaper2.isSet(oPTION5);
        java.lang.String str8 = numericEntityUnescaper2.translate((java.lang.CharSequence) "20");
        java.lang.Class<?> wildcardClass9 = numericEntityUnescaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        org.junit.Assert.assertTrue("'" + oPTION5 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION5.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "20" + "'", str8.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }
}

