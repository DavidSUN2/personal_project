
package NumericEntityUnescaper;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NumericEntityUnescaper0 {

    public static boolean debug = false;

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test01");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        java.lang.Class<?> wildcardClass1 = oPTION0.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test02");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FFFFFFFF" + "'", str1.equals("FFFFFFFF"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test03");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.Class<?> wildcardClass2 = oPTIONArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test04");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "FFFFFFFF", (int) (short) -1, writer4);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test05");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test06");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "A" + "'", str1.equals("A"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test07");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper3.isSet(oPTION4);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { numericEntityUnescaper3 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = numericEntityUnescaper1.with(charSequenceTranslatorArray6);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION8 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean9 = numericEntityUnescaper1.isSet(oPTION8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
        org.junit.Assert.assertTrue("'" + oPTION8 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION8.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test08");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        java.lang.Class<?> wildcardClass1 = oPTION0.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test09");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "64" + "'", str1.equals("64"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test10");
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test11");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper1.translate((java.lang.CharSequence) "64", writer3);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test12");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = null;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "FFFFFFFF", (int) '4', writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test13");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        java.lang.CharSequence charSequence4 = null;
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = numericEntityUnescaper1.translate(charSequence4, (int) (short) -1, writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test14");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = null;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.lang.CharSequence charSequence6 = null;
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper1.translate(charSequence6, writer7);
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test15");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "1");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper1.translate((java.lang.CharSequence) "hi!", writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test16");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "23" + "'", str1.equals("23"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test17");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper3.isSet(oPTION4);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { numericEntityUnescaper3 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = numericEntityUnescaper1.with(charSequenceTranslatorArray6);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test18");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = null;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper1.translate((java.lang.CharSequence) "1", writer7);
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test19");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper3.isSet(oPTION4);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { numericEntityUnescaper3 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = numericEntityUnescaper1.with(charSequenceTranslatorArray6);
        java.lang.String str9 = charSequenceTranslator7.translate((java.lang.CharSequence) "A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "A" + "'", str9.equals("A"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test20");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "64" + "'", str1.equals("64"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test21");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test22");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "61" + "'", str1.equals("61"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test23");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "1");
        java.io.Writer writer6 = null;
        int int7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "FFFFFFFF", (int) (byte) 1, writer6);
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test24");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = null;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.lang.Class<?> wildcardClass6 = numericEntityUnescaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test25");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "", (int) (short) 100, writer4);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test26");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.Class<?> wildcardClass2 = numericEntityUnescaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test27");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION6 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean7 = numericEntityUnescaper5.isSet(oPTION6);
        boolean boolean8 = numericEntityUnescaper1.isSet(oPTION6);
        java.lang.Class<?> wildcardClass9 = oPTION6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray4);
        org.junit.Assert.assertTrue("'" + oPTION6 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION6.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test28");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "1");
        java.io.Writer writer6 = null;
        int int7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "FFFFFFFF", (int) (byte) 1, writer6);
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test29");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper1.translate((java.lang.CharSequence) "", writer5);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test30");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        java.lang.Class<?> wildcardClass1 = oPTION0.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test31");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FFFFFFFF" + "'", str1.equals("FFFFFFFF"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test32");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        java.io.Writer writer8 = null;
        int int9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "hi!", 0, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "64" + "'", str5.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test33");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "34" + "'", str1.equals("34"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test34");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "64" + "'", str1.equals("64"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test35");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.Class<?> wildcardClass3 = numericEntityUnescaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test36");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "20" + "'", str1.equals("20"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test37");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "1");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A", (-1), writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test38");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        java.lang.Class<?> wildcardClass4 = oPTION2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test39");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "hi!");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "hi!");
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "34");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "34" + "'", str9.equals("34"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test40");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass6 = numericEntityUnescaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test41");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "34", (-1), writer5);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test42");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray1);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "0");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper2.translate((java.lang.CharSequence) "FFFFFFFF", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test43");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "hi!");
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
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test44");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test45");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FFFFFFFF" + "'", str1.equals("FFFFFFFF"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test46");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "1");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper1.translate((java.lang.CharSequence) "34", writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test47");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test48");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper1.translate((java.lang.CharSequence) "1", writer3);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test49");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.Class<?> wildcardClass4 = numericEntityUnescaper3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test50");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "hi!");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A");
        java.lang.Class<?> wildcardClass8 = numericEntityUnescaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "A" + "'", str7.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test51");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray1);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = numericEntityUnescaper2.with(charSequenceTranslatorArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray1);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test52");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "1");
        java.io.Writer writer6 = null;
        int int7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "FFFFFFFF", (int) (byte) 1, writer6);
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "64" + "'", str9.equals("64"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test53");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.CharSequence charSequence2 = null;
        java.lang.String str3 = numericEntityUnescaper1.translate(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test54");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper3.isSet(oPTION4);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { numericEntityUnescaper3 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = numericEntityUnescaper1.with(charSequenceTranslatorArray6);
        java.lang.Class<?> wildcardClass8 = charSequenceTranslatorArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test55");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "1");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.lang.Class<?> wildcardClass6 = numericEntityUnescaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test56");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "hi!");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "FFFFFFFF");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "FFFFFFFF" + "'", str7.equals("FFFFFFFF"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test57");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "hi!");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A");
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "A" + "'", str7.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test58");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "1");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A");
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "61");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "64" + "'", str5.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "A" + "'", str7.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "61" + "'", str9.equals("61"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test59");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "1");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        java.lang.CharSequence charSequence6 = null;
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = numericEntityUnescaper1.translate(charSequence6, (int) (short) 100, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "64" + "'", str5.equals("64"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test60");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "1");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.lang.CharSequence charSequence6 = null;
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = numericEntityUnescaper1.translate(charSequence6, (int) ' ', writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test61");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test62");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "FFFFFFFF");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION7 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean8 = numericEntityUnescaper2.isSet(oPTION7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
        org.junit.Assert.assertTrue("'" + oPTION7 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION7.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test63");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test64");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray1);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION5 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean6 = numericEntityUnescaper2.isSet(oPTION5);
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        org.junit.Assert.assertTrue("'" + oPTION5 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION5.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test65");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "hi!");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "1");
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "FFFFFFFF");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "FFFFFFFF" + "'", str9.equals("FFFFFFFF"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test66");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }
}

