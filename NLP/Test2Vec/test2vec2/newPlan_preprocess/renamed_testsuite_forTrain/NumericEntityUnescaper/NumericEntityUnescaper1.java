
package NumericEntityUnescaper;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NumericEntityUnescaper1 {

    public static boolean debug = false;

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test501");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test502");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test503");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test504");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "");
        java.lang.String str6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test505");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test506");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test507");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test508");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test509");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test510");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test511");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "61");
        java.lang.CharSequence charSequence6 = null;
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test512");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str7 = numericEntityUnescaper5.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray8 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test513");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test514");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test515");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test516");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test517");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test518");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test519");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test520");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test521");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test522");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test523");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.CharSequence charSequence4 = null;
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test524");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "20");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test525");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test526");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test527");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str5 = numericEntityUnescaper3.translate((java.lang.CharSequence) "34");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test528");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test529");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test530");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test531");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence5 = null;
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test532");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test533");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test534");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test535");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test536");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test537");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test538");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str6 = numericEntityUnescaper4.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test539");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test540");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test541");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test542");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test543");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test544");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test545");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test546");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test547");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str5 = numericEntityUnescaper3.translate((java.lang.CharSequence) "");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test548");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test549");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test550");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test551");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION5 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        boolean boolean6 = numericEntityUnescaper2.isSet(oPTION5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test552");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test553");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "");
        java.lang.String str6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "1");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test554");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test555");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test556");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test557");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test558");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test559");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test560");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test561");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str6 = numericEntityUnescaper4.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test562");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test563");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test564");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test565");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test566");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test567");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test568");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test569");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str6 = numericEntityUnescaper4.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test570");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test571");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test572");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test573");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "1");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION6 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean7 = numericEntityUnescaper1.isSet(oPTION6);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray8 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test574");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION5 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean6 = numericEntityUnescaper4.isSet(oPTION5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test575");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test576");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "");
        java.lang.String str6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "1");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test577");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test578");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        java.lang.String str6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test579");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test580");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test581");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test582");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test583");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str5 = numericEntityUnescaper3.translate((java.lang.CharSequence) "34");
        java.lang.String str7 = numericEntityUnescaper3.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray8 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test584");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test585");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test586");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test587");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test588");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test589");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "20");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test590");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test591");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test592");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test593");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test594");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test595");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test596");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test597");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = numericEntityUnescaper1.with(charSequenceTranslatorArray4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test598");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test599");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test600");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test601");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test602");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test603");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test604");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION5 = null;
        boolean boolean6 = numericEntityUnescaper4.isSet(oPTION5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test605");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test606");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test607");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        boolean boolean4 = numericEntityUnescaper2.isSet(oPTION3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test608");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test609");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test610");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test611");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test612");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "20");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test613");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test614");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test615");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test616");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test617");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test618");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test619");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test620");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test621");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test622");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test623");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test624");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test625");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test626");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test627");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test628");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str6 = numericEntityUnescaper4.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test629");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test630");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test631");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test632");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test633");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test634");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test635");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test636");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test637");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "0");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test638");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        java.lang.String str6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test639");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test640");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test641");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test642");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test643");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test644");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test645");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test646");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test647");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test648");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test649");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = numericEntityUnescaper1.with(charSequenceTranslatorArray4);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = numericEntityUnescaper1.with(charSequenceTranslatorArray6);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray8 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test650");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test651");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test652");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test653");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test654");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test655");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test656");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test657");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test658");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test659");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test660");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test661");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test662");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test663");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.CharSequence charSequence5 = null;
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test664");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test665");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "20");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test666");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test667");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str5 = numericEntityUnescaper3.translate((java.lang.CharSequence) "");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test668");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test669");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test670");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str6 = numericEntityUnescaper4.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test671");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test672");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test673");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test674");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test675");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test676");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test677");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test678");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test679");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test680");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test681");
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
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper1.test682");
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

